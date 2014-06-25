package DataBase;

/**
 * Lnkordertoproduct entity. @author MyEclipse Persistence Tools
 */

public class Lnkordertoproduct implements java.io.Serializable {

	// Fields

	private String id;
	private String orderId;
	private String productId;
	private Integer number;
	private long price;
	private long sum;

	// Constructors

	/** default constructor */
	public Lnkordertoproduct() {
	}

	/** minimal constructor */
	public Lnkordertoproduct(String id) {
		this.id = id;
	}

	/** full constructor */
	public Lnkordertoproduct(String id, String orderId, String productId,
			Integer number, long price, long sum) {
		this.id = id;
		this.orderId = orderId;
		this.productId = productId;
		this.number = number;
		this.price = price;
		this.sum = sum;
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

	public Integer getNumber() {
		return this.number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public long getPrice() {
		return this.price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public long getSum() {
		return this.sum;
	}

	public void setSum(long sum) {
		this.sum = sum;
	}

}