package DataBase;

/**
 * Returnorder entity. @author MyEclipse Persistence Tools
 */

public class Returnorder implements java.io.Serializable {

	// Fields

	private String id;
	private String orderId;
	private String productId;
	private long returnPrice;
	private short status;

	// Constructors

	/** default constructor */
	public Returnorder() {
	}

	/** minimal constructor */
	public Returnorder(String id) {
		this.id = id;
	}

	/** full constructor */
	public Returnorder(String id, String orderId, String productId,
			long returnPrice, short status) {
		this.id = id;
		this.orderId = orderId;
		this.productId = productId;
		this.returnPrice = returnPrice;
		this.status = status;
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

	public String getProductId() {
		return this.productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public long getReturnPrice() {
		return this.returnPrice;
	}

	public void setReturnPrice(long returnPrice) {
		this.returnPrice = returnPrice;
	}

	public short getStatus() {
		return this.status;
	}

	public void setStatus(short status) {
		this.status = status;
	}

}