package com.repository;

import java.io.IOException;
import java.sql.Connection;

import com.database.MySQLConnection;

abstract class AbstractRepository {
	protected Connection con;
	
	public AbstractRepository() throws IOException {
		con = MySQLConnection.getConnection();
	}	
}
