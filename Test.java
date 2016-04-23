package org.apache.tika.parser.persona;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.sax.BodyContentHandler;
import org.xml.sax.SAXException;

public class Test {

	
	public static void main(String[] args) throws IOException, SAXException, TikaException {
		// TODO Auto-generated method stub

		BodyContentHandler handler = new BodyContentHandler();
	      Metadata metadata = new Metadata();
	      FileInputStream inputstream = new FileInputStream(new File("/path-to-file/Url.txt"));
	      ParseContext pcontext = new ParseContext();
	      
	      //parsing the document using PDF parser
	      PersonaParser persona = new PersonaParser(); 
	      persona.parse(inputstream, handler, metadata,pcontext);
	      
	      //getting the content of the document
	      System.out.println("Content (Username) :\n" + handler.toString());
	      
	      //getting metadata of the document
	      System.out.println("Metadata:");
	      String[] metadataNames = metadata.names();
	      
	      for(String name : metadataNames) {
	         System.out.println(name+ " : " + metadata.get(name));
	}

}
}