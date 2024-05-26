package com.bezkoder.spring.jpa.postgresql;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bezkoder.spring.jpa.postgresql.model.Tutorial;

public class TutorialFileReader {

	public static ArrayList<Tutorial> readTutorialFromJson(String filePath) {
		ArrayList<Tutorial> tutorials = new ArrayList<>();

		JSONParser parser = new JSONParser();
		try {
			Object obj = parser.parse(new FileReader(filePath));
			JSONArray jsonArray = (JSONArray) obj;

			for (Object jsonTutorial : jsonArray) {
				JSONObject TutorialObj = (JSONObject) jsonTutorial;

				String title = (String) TutorialObj.get("title");
				String description = (String) TutorialObj.get("description");

				Tutorial tutorial = new Tutorial(title, description, false);
				tutorials.add(tutorial);
			}
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}

		return tutorials;
	}

}
