package DataBase;

/**
 * ProductClass entity. @author MyEclipse Persistence Tools
 */

public class ProductClass implements java.io.Serializable {

	// Fields

	private String id;
	private String parentId;
	private String name;

	// Constructors

	/** default constructor */
	public ProductClass() {
	}

	/** minimal constructor */
	public ProductClass(String id) {
		this.id = id;
	}

	/** full constructor */
	public ProductClass(String id, String parentId, String name) {
		this.id = id;
		this.parentId = parentId;
		this.name = name;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getParentId() {
		return this.parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}