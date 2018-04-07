package com.acme;


import junit.framework.TestCase;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.stream.Stream;

import static java.lang.System.out;

public class MyTikaTest extends TestCase {
    private static final String PST_FILE = "test.pst";
    // mime type: application/vnd.ms-outlook-pst
    private static final String PST_TYPE = "application/vnd.ms-outlook-pst";
    private static final String TEST_DIR = "/home/ivo/pst/";
    private static final String[] TEST_FILES = {
            TEST_DIR + "Dataminr_SitScape.pst",
            TEST_DIR + "Scenario.pst",
            TEST_DIR + "Large.pst"
    };

    MyTika reader = new MyTika();

    File file(String path) throws Exception {
        return new File(path);
    }

    File file() throws Exception {
        URL url = ClassLoader.getSystemResource(PST_FILE);
        return new File(url.toURI());
    }

    InputStream stream() throws Exception {
        return ClassLoader.getSystemResourceAsStream(PST_FILE);
    }

    InputStream stream(String path) throws Exception {
        return new FileInputStream(path);
    }

    public void testTypeDetection() throws Exception {
        String type = reader.findType(file());
        //out.printf("type of %s is %s\n", PST_FILE, type);
        assertEquals(PST_TYPE, type);
    }

    public void testTypeDetection2() throws Exception {
        for (String path: TEST_FILES) {
            String type = reader.findType(file(path));
            //out.printf("type of %s is %s\n", path, type);
            assertEquals(PST_TYPE, type);
        }
    }

    public void testFindMetadata() throws Exception {
        reader.findMetadata(file());
    }


    /*
    BUMMER
    metadata: embeddedRelationshipId=smime.p7m resourceName=smime.p7m
    Unknown message type: IPM.Note.SMIME.MultipartSigned

p7m is signed or encrypted email !!!
http://www.cryptigo.eu/p7mViewer/

Can't get children for folder Dataminr(32962)
child count: 487 - java.lang.ArrayIndexOutOfBoundsException: 47,
using alternate child tree with 487 items
Extracted: 487
Extracted: 108

    Unknown message type: IPM.Note.SMIME
    Unknown message type: IPM.Note.SMIME.MultipartSigned
    Unknown message type: IPM.Note.SMIME.MultipartSigned
    Unknown message type: IPM.Note.SMIME.MultipartSigned
    Unknown message type: IPM.Note.SMIME.MultipartSigned
Can't get children for folder Dataminr(33090)
child count: 487 -java.lang.ArrayIndexOutOfBoundsException: 47,
using alternate child tree with 487 items

    */
    public void testFindMetadataFiles() throws Exception {
        for (String path: TEST_FILES) {
            reader.findMetadata(file(path));
        }
    }

    public void testExtract() throws Exception {
        reader.extract(stream());
    }

    public void testExtractFiles() throws Exception {
        for (String path: TEST_FILES) {
            reader.extract(stream(path));
        }
    }

}
