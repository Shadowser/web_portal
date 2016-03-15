package softarch.portal.db.json;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import softarch.portal.data.UserProfile;

public class JsonDB {

	private String dbPath = "";
	private JSONParser parser = new JSONParser();
	
	public JsonDB(String path)
	{
		this.dbPath = path;
	}
	
	private boolean insert(String table, JSONObject jsonObject)
	{
		try
		{
			Object obj = parser.parse(new FileReader(this.dbPath));
			JSONArray jsonTable = (JSONArray) obj;
			jsonTable.add(jsonObject);
			
			// Save jsonTable to file
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public boolean insertUserProfile(UserProfile up)
	{
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("username",  up.getUsername());
		
		return insert("userprofile", jsonObject);
	}
	
	
	
}