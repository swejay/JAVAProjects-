package com.deloitte.main;

import java.util.List;

public interface Dao<T> {

	T get(long id);//retrieves one record
	List<T> getAll();// to retrieve all records.
	void save(T t);//execute an insert statement. can be boolean
	void update(T t,String[] params);//execute update statement
	void delete(T t);//execute delete statement
	
}
