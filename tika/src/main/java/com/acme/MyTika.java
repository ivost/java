package com.acme;

import org.apache.tika.Tika;


import org.apache.tika.extractor.EmbeddedDocumentExtractor;
import org.apache.tika.extractor.ParsingEmbeddedDocumentExtractor;

import org.apache.tika.metadata.Metadata;

import org.apache.tika.mime.MediaType;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.apache.tika.sax.ToHTMLContentHandler;

import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;

import org.apache.tika.io.TikaInputStream;
import org.apache.tika.sax.BodyContentHandler;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

/*
https://tika.apache.org/0.7/gettingstarted.html
https://tika.apache.org/1.16/examples.html

 */
class MyTika {
    Tika tika = new Tika();

    String findType(File file) throws Exception {
        //out.println("detecting type of " + file.getAbsolutePath());
        return tika.detect(file);
    }


    void findMetadata(File file) throws Exception {
        Parser parser = new AutoDetectParser();
        BodyContentHandler handler = new BodyContentHandler();
        Metadata metadata = new Metadata();
        FileInputStream inputStream = new FileInputStream(file);

        // metadata.set(Metadata.RESOURCE_NAME_KEY, file.toString());
        MediaType mimeType = tika.getDetector().detect(TikaInputStream.get(inputStream), metadata);
        //out.println("File " + file + " is " + mimeType);
        for (String name : metadata.names()) {
            out.println(name + ": " + metadata.get(name));
        }
    }

    /*
    https://tika.apache.org/1.16/api/org/apache/tika/parser/mbox/OutlookPSTParser
    public static final MediaType MS_OUTLOOK_PST_MIMETYPE

    public void parse(InputStream stream,
                  ContentHandler handler,
                  Metadata metadata,
                  ParseContext context)
           throws IOException,
                  SAXException,
                  TikaException
Description copied from interface: Parser
Parses a document stream into a sequence of XHTML SAX events. Fills in related document metadata in the given
metadata object.
The given document stream is consumed but not closed by this method. The responsibility to close the stream remains
on the caller.

Information about the parsing context can be passed in the context parameter. See the parser implementations for the
kinds of context information they expect.

Parameters:
stream - the document stream (input)
handler - handler for the XHTML SAX events (output)
metadata - document metadata (input and output)
context - parse context
Throws:
IOException - if the document stream could not be read
SAXException - if the SAX events could not be processed
TikaException - if the document could not be parsed


     */

    private class PstExtractor extends ParsingEmbeddedDocumentExtractor {
        List<Metadata> trackingMetadata = new ArrayList<Metadata>();

        public PstExtractor(ParseContext context) {
            super(context);
        }

        @Override
        public boolean shouldParseEmbedded(Metadata metadata) {
            return true;
        }

        @Override
        public void parseEmbedded(InputStream stream, ContentHandler handler, Metadata metadata, boolean outputHtml)
                throws SAXException, IOException {
            this.trackingMetadata.add(metadata);
            //out.println("parseEmbedded, html: " + outputHtml);
            //out.println("metadata: " + metadata.toString());
            // super.parseEmbedded(stream, handler, metadata, outputHtml);
        }
    }


    void extract(InputStream stream) throws Exception {

        Parser pstParser = new AutoDetectParser();

        Metadata metadata = new Metadata();
        ContentHandler handler = new ToHTMLContentHandler();

        ParseContext context = new ParseContext();

        PstExtractor pstExtractor = new PstExtractor(context);
        context.set(EmbeddedDocumentExtractor.class, pstExtractor);
        context.set(Parser.class, new AutoDetectParser());

        pstParser.parse(stream, handler, metadata, context);

//        String output = handler.toString();
//        out.println(output);

        List<Metadata> meta = pstExtractor.trackingMetadata;
        out.println("Extracted: " + meta.size());

    }

}


/*
metadata: date=2016-04-30T09:27:11Z Message:To-Email=/O=EASF/OU=EXCHANGE ADMINISTRATIVE GROUP (FYDIBOHF23SPDLT)
/CN=RECIPIENTS/CN=Africom.stuttgart.acj33.mbx.j331-joc-intel-officerbe importance=1 dc:creator=Hoppa, Robert V RDML
USN AFRICOM ACJ2 (US) dcterms:created=2016-04-30T09:27:11Z Message:From-Email=/O=EASF/OU=EXCHANGE ADMINISTRATIVE
GROUP (FYDIBOHF23SPDLT)/CN=RECIPIENTS/CN=ROBERT.V.HOPPA.MIL dcterms:modified=2016-04-30T09:27:11Z
Last-Modified=2016-04-30T09:27:11Z title=RE: Distya Ameya arrived to Zawiya Last-Save-Date=2016-04-30T09:27:11Z
meta:mapi-message-class=UNKNOWN Message:To-Display-Name=AFRICOM Stuttgart ACJ33 Mailbox J331 JOC Intel Officer
embeddedRelationshipId=<E99548728555D949BCDF693EDC7806B55321DC22@UPDCHP6Y.easf.csd.disa.mil> flagged=false
meta:save-date=2016-04-30T09:27:11Z dc:title=RE: Distya Ameya arrived to Zawiya modified=2016-04-30T09:27:11Z
displayTo=AFRICOM Stuttgart ACJ33 Mailbox J331 JOC Intel Officer displayBCC=
identifier=<E99548728555D949BCDF693EDC7806B55321DC22@UPDCHP6Y.easf.csd.disa.mil> creator=Hoppa, Robert V RDML USN
AFRICOM ACJ2 (US) displayCC= meta:author=Hoppa, Robert V RDML USN AFRICOM ACJ2 (US)
meta:creation-date=2016-04-30T09:27:11Z Comments= meta:mapi-from-representing-email=/O=EASF/OU=EXCHANGE
ADMINISTRATIVE GROUP (FYDIBOHF23SPDLT)/CN=RECIPIENTS/CN=ROBERT.V.HOPPA.MIL Creation-Date=2016-04-30T09:27:11Z
resourceName=<E99548728555D949BCDF693EDC7806B55321DC22@UPDCHP6Y.easf.csd.disa.mil> w:comments= priority=0
senderEmailAddress=/O=EASF/OU=EXCHANGE ADMINISTRATIVE GROUP (FYDIBOHF23SPDLT)/CN=RECIPIENTS/CN=ROBERT.V.HOPPA.MIL
meta:mapi-from-representing-name=Hoppa, Robert V RDML USN AFRICOM ACJ2 (US) recipients=No recipients table!
Message:From-Name=Hoppa, Robert V RDML USN AFRICOM ACJ2 (US) Author=Hoppa, Robert V RDML USN AFRICOM ACJ2 (US)
comment= Message-From=Hoppa, Robert V RDML USN AFRICOM ACJ2 (US)
dc:identifier=<E99548728555D949BCDF693EDC7806B55321DC22@UPDCHP6Y.easf.csd.disa.mil> descriptorNodeId=2161956
 */