package com.acme;


import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;

public class PstReaderTest
    extends TestCase
{
    private static final String PST_FILE = "test.pst";
    private static final String TEST_DIR = "/home/ivo/pst/";
    private static final String[] TEST_FILES = {
            TEST_DIR + "Dataminr_SitScape.pst",
            TEST_DIR + "Scenario.pst",
            TEST_DIR + "Large.pst"
    };

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


    public void testRead() throws Exception
    {
        PstReader reader = new PstReader();
        boolean ok = reader.read(file());
        assertTrue( ok );
    }

    /*

    BUMMER: getting similar errors with libpst 0.9.3

    reading /home/ivo/pst/Dataminr_SitScape.pst
Outlook Data File
isPasswordProtected: false
 |- Top of Outlook data file
 |  |- Deleted Items
 |  |- Inbox
 |  |  |- 01 - PRIMARY WATCH REPORTS
 |  |  |  |- Dataminr
Can't get children for folder Dataminr(32962) child count: 487 - java.lang.ArrayIndexOutOfBoundsException: 47, using alternate child tree with 487 items
 |  |  |  |  |- Email: 2097188 - FW: [Non-DoD Source] Injured soldier Mohammed Awami Gniwa of carious region was wounded in the axis Rulrhh sniper shot in the head and is now in the care of Caution-https://t.co/krUeIoppcH
 |  |  |  |  |- Email: 2097220 - FW: [Non-DoD Source] Ben Guerdane Discovery of a fifth armory Caution-https://t.co/GJrzl5bOOL Caution-https://t.co/hIbYn69DCf
     */
    public void testReadFiles() throws Exception
    {
        for (String path: TEST_FILES) {
            PstReader reader = new PstReader();
            boolean ok = reader.read(file(path));
            assertTrue(ok);
        }
    }

}
