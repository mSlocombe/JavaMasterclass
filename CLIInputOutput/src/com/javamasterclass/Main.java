package com.javamasterclass;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE;

public class Main {

    public static void main(String[] args) {
//    	String[] s = new String[args.length];
//    	for(int i = 0; i < args.length; i++) {
//    		s[i] = args[i] + "\n";
//		}

		Path inputFile = Paths.get(args[0]);
		Path outputFile = Paths.get(args[1]);
		StringBuilder sb = new StringBuilder();
		try (InputStream in = Files.newInputStream(inputFile);
			 BufferedReader reader =
					 new BufferedReader(new InputStreamReader(in))) {
			String line = null;
			while ((line = reader.readLine()) != null) {
				sb.append(line);
			}
		} catch (IOException x) {
			System.err.println(x);
		}

    	try(OutputStream out = new BufferedOutputStream(Files.newOutputStream(outputFile, CREATE, APPEND))) {
				byte[] data = sb.toString().getBytes();
    			out.write(data, 0, data.length);
		}
    	catch (IOException e) {
			System.err.println(e);
		}
    }
}
