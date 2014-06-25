package DataBase;

/**
 * Lnkstoretoproduct entity. @author MyEclipse Persistence Tools
 */

public class Lnkstoretoproduct implements java.io.Serializable {

	// Fields

	private String id;
	private String productId;
	private String storeId;
	private long price;
	private short limited;
	private Integer stock;

	// Constructors

	/** default constructor */
	public Lnkstoretoproduct() {
	}

	/** minimal constructor */
	public Lnkstoretoproduct(String id) {
		this.id = id;
	}

	/** full constructor */
	public Lnkstoretoproduct(String id, String productId, String storeId,
			long price, short limited, Integer stock) {
		this.id = id;
		this.productId = productId;
		this.storeId = storeId;
		this.price = price;
		this.limited = limited;
		this.stock = stock;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProductId() {
		return this.productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getStoreId() {
		return this.storeId;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public long getPrice() {
		return this.price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public short getLimited() {
		return this.limited;
	}

	public void setLimited(short limited) {
		this.limited = limited;
	}

	public Integer getStock() {
		return this.stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

}