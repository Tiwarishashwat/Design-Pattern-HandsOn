package com.st.dp.day1.session2.part1.db;

public class DBConn {
	
	private static DBConn instance = new DBConn();
	
	
	private DBConn() {}
	
	
	public static DBConn getInstance() {
		return instance;
	}

	public static void getHashCode() {
		DBConn instanceDB = getInstance();
		System.out.println("Hash Code of instance is: " + instanceDB.hashCode());
	}
	
}
