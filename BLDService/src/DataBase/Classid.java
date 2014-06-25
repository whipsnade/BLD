package DataBase;

/**
 * Classid entity. @author MyEclipse Persistence Tools
 */

public class Classid implements java.io.Serializable {

	// Fields

	private long id;
	private String table;
	private String key;
	private long record;
	private long long_;

	// Constructors

	/** default constructor */
	public Classid() {
	}

	/** minimal constructor */
	public Classid(long id) {
		this.id = id;
	}

	/** full constructor */
	public Classid(long id, String table, String key, long record, long long_) {
		this.id = id;
		this.table = table;
		this.key = key;
		this.record = record;
		this.long_ = long_;
	}

	// Property accessors

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTable() {
		return this.table;
	}

	public void setTable(String table) {
		this.table = table;
	}

	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public long getRecord() {
		return this.record;
	}

	public void setRecord(long record) {
		this.record = record;
	}

	public long getLong_() {
		return this.long_;
	}

	public void setLong_(long long_) {
		this.long_ = long_;
	}

}