package DataBase;

/**
 * Lnkstoretoarea entity. @author MyEclipse Persistence Tools
 */

public class Lnkstoretoarea implements java.io.Serializable {

	// Fields

	private String id;
	private String areaId;
	private String storeId;
	private String level;

	// Constructors

	/** default constructor */
	public Lnkstoretoarea() {
	}

	/** minimal constructor */
	public Lnkstoretoarea(String id) {
		this.id = id;
	}

	/** full constructor */
	public Lnkstoretoarea(String id, String areaId, String storeId, String level) {
		this.id = id;
		this.areaId = areaId;
		this.storeId = storeId;
		this.level = level;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAreaId() {
		return this.areaId;
	}

	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}

	public String getStoreId() {
		return this.storeId;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getLevel() {
		return this.level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

}