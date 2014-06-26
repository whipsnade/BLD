package DataBase;

/**
 * Classid entity. @author MyEclipse Persistence Tools
 */

public class Classid implements java.io.Serializable {

	// Fields

	private String id;
	private String classname;
	private String keyword;
	private long record;
	private long length;

	// Constructors

	/** default constructor */
	public Classid() {
	}

	/** minimal constructor */
	public Classid(String id) {
		this.id = id;
	}

	/** full constructor */
	public Classid(String id, String classname, String keyword, long record, long length) {
		this.id = id;
		this.classname = classname;
		this.keyword = keyword;
		this.record = record;
		this.length = length;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getClassname() {
		return this.classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

	public String getKeyword() {
		return this.keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public long getRecord() {
		return this.record;
	}

	public void setRecord(long record) {
		this.record = record;
	}

	public long getLength() {
		return this.length;
	}

	public void setLength(long length) {
		this.length = length;
	}

}