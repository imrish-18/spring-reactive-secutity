package com.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


// TODO: Auto-generated Javadoc
/**
 * The Class Employee.
 */

@Document
public class Employee {
	
	/** The id. */
	@Id
	private String id;
	
	/** The name. */
	private String name;
	
	/** The company. */
	private String company;
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	
	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(String id) {
		this.id = id;
	}
	
	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Gets the company.
	 *
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}
	
	/**
	 * Sets the company.
	 *
	 * @param company the new company
	 */
	public void setCompany(String company) {
		this.company = company;
	}

	

}
