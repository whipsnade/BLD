package DataBase;

/**
 * Address entity. @author MyEclipse Persistence Tools
 */

public class Address implements java.io.Serializable {

	// Fields

	private String id;
	private String userId;
	private String province;
	private String city;
	private String area;
	private String address;
	private String recipient;
	private String phone;

	// Constructors

	/** default constructor */
	public Address() {
	}

	/** minimal constructor */
	public Address(String id) {
		this.id = id;
	}

	/** full constructor */
	public Address(String id, String userId, String province, String city,
			String area, String address, String recipient, String phone) {
		this.id = id;
		this.userId = userId;
		this.province = province;
		this.city = city;
		this.area = area;
		this.address = address;
		this.recipient = recipient;
		this.phone = phone;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getArea() {
		return this.area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRecipient() {
		return this.recipient;
	}

	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}