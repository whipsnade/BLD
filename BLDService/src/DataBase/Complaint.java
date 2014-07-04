package DataBase;

/**
 * Complaint entity. @author MyEclipse Persistence Tools
 */

public class Complaint implements java.io.Serializable {

	// Fields

	private Integer id;
	private String orderId;
	private String comments;

	// Constructors

	/** default constructor */
	public Complaint() {
	}

	/** full constructor */
	public Complaint(String orderId, String comments) {
		this.orderId = orderId;
		this.comments = comments;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

}