package DataBase;

/**
 * ComplaintId entity. @author MyEclipse Persistence Tools
 */

public class ComplaintId implements java.io.Serializable {

	// Fields

	private String id;
	private String orderId;
	private String comments;

	// Constructors

	/** default constructor */
	public ComplaintId() {
	}

	/** full constructor */
	public ComplaintId(String id, String orderId, String comments) {
		this.id = id;
		this.orderId = orderId;
		this.comments = comments;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ComplaintId))
			return false;
		ComplaintId castOther = (ComplaintId) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getOrderId() == castOther.getOrderId()) || (this
						.getOrderId() != null
						&& castOther.getOrderId() != null && this.getOrderId()
						.equals(castOther.getOrderId())))
				&& ((this.getComments() == castOther.getComments()) || (this
						.getComments() != null
						&& castOther.getComments() != null && this
						.getComments().equals(castOther.getComments())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result
				+ (getOrderId() == null ? 0 : this.getOrderId().hashCode());
		result = 37 * result
				+ (getComments() == null ? 0 : this.getComments().hashCode());
		return result;
	}

}