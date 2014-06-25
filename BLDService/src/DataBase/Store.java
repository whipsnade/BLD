package DataBase;

import java.util.Date;

/**
 * Store entity. @author MyEclipse Persistence Tools
 */

public class Store implements java.io.Serializable {

	// Fields

	private String id;
	private String name;
	private String address;
	private double longitude;
	private double latitude;
	private String tel;
	private Date joinDate;

	// Constructors

	/** default constructor */
	public Store() {
	}

	/** minimal constructor */
	public Store(String id) {
		this.id = id;
	}

	/** full constructor */
	public Store(String id, String name, String address, double longitude,
			double latitude, String tel, Date joinDate) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.longitude = longitude;
		this.latitude = latitude;
		this.tel = tel;
		this.joinDate = joinDate;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getLongitude() {
		return this.longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatitude() {
		return this.latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Date getJoinDate() {
		return this.joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

}