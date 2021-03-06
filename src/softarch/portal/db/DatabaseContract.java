package softarch.portal.db;

public class DatabaseContract {
	
	public static abstract class Table_Users {
	    public static final String TABLE_NAME = "users";
	    public static final String COL_USERNAME = "Username";
	    public static final String COL_PASSWORD = "Password";
	    public static final String COL_FIRST_NAME = "FirstName";
	    public static final String COL_LAST_NAME = "LastName";
	    public static final String COL_EMAIL = "EmailAddress";
	    public static final String COL_LAST_LOGIN = "LastLogin";
	    public static final String COL_TYPE = "Type";
	}
	
	// Similar to the Table_Users should be done for the Table_Regular
	public static abstract class Table_Regular {
	    public static final String TABLE_NAME = "regulardata";
	    public static final String COL_TYPE = "Type";
	}
	
}
