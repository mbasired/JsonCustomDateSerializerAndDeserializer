
package com.cap.model;

import java.util.Arrays;
import java.util.Date;

import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.cap.util.DateDeserialize;
import com.cap.util.DateSerializer;

public class Employee {

	private int id;
	private String name;
	private boolean permanent;
	private Address address;
	private long[] phoneNumbers;
	private String role;
	@JsonSerialize(using = DateSerializer.class)
	@JsonDeserialize(using = DateDeserialize.class)
	private Date dob;

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Date getDob() {
		return dob;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isPermanent() {
		return permanent;
	}

	public void setPermanent(boolean permanent) {
		this.permanent = permanent;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public long[] getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(long[] phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", permanent=");
		builder.append(permanent);
		builder.append(", address=");
		builder.append(address);
		builder.append(", phoneNumbers=");
		builder.append(Arrays.toString(phoneNumbers));
		builder.append(", role=");
		builder.append(role);
		builder.append(", dob=");
		builder.append(dob);
		builder.append("]");
		return builder.toString();
	}

	}
