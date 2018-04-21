package com.acme;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import sun.misc.IOUtils;

import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * https://cassiomolin.com/2016/07/13/using-jackson-and-json-path-to-query-and-parse-an-arbitrary-json-node/
 *
 */
public class App {
    public static void main(String[] args) throws IOException {

        String json = "{\"first\":\"John\",\"last\":\"Doe\",\"address\":{\"street\":\"21 2nd Street\","
                + "\"city\":{\"name\":\"New York\",\"state\":{\"foo\":\"bar\"}}," +
                "\"zip\":\"10021-3100\","
                + "\"coord\":{\"lat\":40.72,\"lon\":-73.99}}}";

        ObjectMapper mapper = new ObjectMapper();
        JsonNode tree = mapper.readTree(json);
        JsonNode n = tree.at("/address/city");
        if (!n.isMissingNode()) {
            System.out.println("/address/city: " + n.toString());
        }

        n = tree.at("/address/coord");
        if (!n.isMissingNode()) {
            System.out.println("/address/coord: " + n.toString());
        }

        //Get file from resources folder
        String fileName = "app.json";
        ClassLoader loader = App.class.getClassLoader();
        InputStream is = loader.getResourceAsStream(fileName);
        int l = is.available();
        byte[] data = new byte[l];
        is.read(data);
        is.close();
        json = new String(data, StandardCharsets.UTF_8);
        //System.out.println("l " + l + ", json: " + json);

        tree = mapper.readTree(json);

        n = tree.at("/sng/import/email");
        if (!n.isMissingNode()) {
            System.out.println("/sng/import/email: " + n.toString());
        }

    }
}

