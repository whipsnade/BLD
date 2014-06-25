package DataBase;

/**
 * Complaint entity. @author MyEclipse Persistence Tools
 */

public class Complaint implements java.io.Serializable {

	// Fields

	private ComplaintId id;

	// Constructors

	/** default constructor */
	public Complaint() {
	}

	/** full constructor */
	public Complaint(ComplaintId id) {
		this.id = id;
	}

	// Property accessors

	public ComplaintId getId() {
		return this.id;
	}

	public void setId(ComplaintId id) {
		this.id = id;
	}

}