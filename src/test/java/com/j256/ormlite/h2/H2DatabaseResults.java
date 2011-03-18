package com.j256.ormlite.h2;

import java.io.InputStream;
import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import com.j256.ormlite.support.DatabaseResults;

/**
 * H2 database results.
 * 
 * @author graywatson
 */
public class H2DatabaseResults implements DatabaseResults {

	private ResultSet resultSet;

	public H2DatabaseResults(ResultSet resultSet) {
		this.resultSet = resultSet;
	}

	public int getColumnCount() throws SQLException {
		return resultSet.getMetaData().getColumnCount();
	}

	public boolean next() throws SQLException {
		return resultSet.next();
	}

	public int findColumn(String columnName) throws SQLException {
		return resultSet.findColumn(columnName) - 1;
	}

	public String getString(int columnIndex) throws SQLException {
		return resultSet.getString(columnIndex + 1);
	}

	public boolean getBoolean(int columnIndex) throws SQLException {
		return resultSet.getBoolean(columnIndex + 1);
	}

	public byte getByte(int columnIndex) throws SQLException {
		return resultSet.getByte(columnIndex + 1);
	}

	public byte[] getBytes(int columnIndex) throws SQLException {
		return resultSet.getBytes(columnIndex + 1);
	}

	public short getShort(int columnIndex) throws SQLException {
		return resultSet.getShort(columnIndex + 1);
	}

	public int getInt(int columnIndex) throws SQLException {
		return resultSet.getInt(columnIndex + 1);
	}

	public long getLong(int columnIndex) throws SQLException {
		return resultSet.getLong(columnIndex + 1);
	}

	public float getFloat(int columnIndex) throws SQLException {
		return resultSet.getFloat(columnIndex + 1);
	}

	public double getDouble(int columnIndex) throws SQLException {
		return resultSet.getDouble(columnIndex + 1);
	}

	public Timestamp getTimestamp(int columnIndex) throws SQLException {
		return resultSet.getTimestamp(columnIndex + 1);
	}

	public InputStream getBlobStream(int columnIndex) throws SQLException {
		Blob blob = resultSet.getBlob(columnIndex + 1);
		if (blob == null) {
			return null;
		} else {
			return blob.getBinaryStream();
		}
	}

	public boolean wasNull(int columnIndex) throws SQLException {
		return resultSet.wasNull();
	}
}