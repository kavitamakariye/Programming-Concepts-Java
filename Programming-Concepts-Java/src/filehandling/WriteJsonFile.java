package filehandling;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class WriteJsonFile {

	public static void main(String[] args) throws IOException {
		 
		JSONObject obj = new JSONObject();
		obj.put("Name", "Monika");
		obj.put("Author", "Shah");
 
		JSONArray company = new JSONArray();
		company.add("Compnay: eBay");
		company.add("Compnay: Paypal");
		company.add("Compnay: Google");
		obj.put("Company List", company);
 
		
		try (FileWriter file = new FileWriter("/home/kavita/git/repository/Programming-Concepts-Java/Programming-Concepts-Java/src/filehandling/WriteJsonFile")) {
			file.write(obj.toJSONString());
			System.out.println("Successfully Copied JSON Object to File...");
			System.out.println("\nJSON Object: " + obj);
		}
	}
}
