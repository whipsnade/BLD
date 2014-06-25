package DataBase;

/**
 * Order entity. @author MyEclipse Persistence Tools
 */

public class Order implements java.io.Serializable {

	// Fields

	private String id;
	private String address;
	private String recipient;
	private String phone;
	private long sum;
	private short status;
	private String storeId;
	private String userId;

	// Constructors

	/** default constructor */
	public Order() {
	}

	/** minimal constructor */
	public Order(String id) {
		this.id = id;
	}

	/** full constructor */
	public Order(String id, String address, String recipient, String phone,
			long sum, short status, String storeId, String userId) {
		this.id = id;
		this.address = address;
		this.recipient = recipient;
		this.phone = phone;
		this.sum = sum;
		this.status = status;
		this.storeId = storeId;
		this.userId = userId;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
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

	public long getSum() {
		return this.sum;
	}

	public void setSum(long sum) {
		this.sum = sum;
	}

	public short getStatus() {
		return this.status;
	}

	public void setStatus(short status) {
		this.status = status;
	}

	public String getStoreId() {
		return this.storeId;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}