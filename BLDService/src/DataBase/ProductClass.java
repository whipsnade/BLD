package DataBase;

/**
 * ProductClass entity. @author MyEclipse Persistence Tools
 */

public class ProductClass implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer parentId;
	private String name;

	// Constructors

	/** default constructor */
	public ProductClass() {
	}

	/** full constructor */
	public ProductClass(Integer parentId, String name) {
		this.parentId = parentId;
		this.name = name;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getParentId() {
		return this.parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}