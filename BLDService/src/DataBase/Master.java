package DataBase;

/**
 * Master entity. @author MyEclipse Persistence Tools
 */

public class Master implements java.io.Serializable {

	// Fields

	private String id;
	private String name;
	private String phone;
	private String pass;
	private String storeId;

	// Constructors

	/** default constructor */
	public Master() {
	}

	/** minimal constructor */
	public Master(String id) {
		this.id = id;
	}

	/** full constructor */
	public Master(String id, String name, String phone, String pass,
			String storeId) {
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.pass = pass;
		this.storeId = storeId;
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

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPass() {
		return this.pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getStoreId() {
		return this.storeId;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

}