package yp.cqc.pojo;

public class Evals {

	private int id;
	public Evals(int id, String uname, long create, String eval, int uid) {
		super();
		this.id = id;
		this.uname = uname;
		this.create = create;
		this.eval = eval;
		this.uid = uid;
	}
	public Evals() {
		super();
		// TODO Auto-generated constructor stub
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (create ^ (create >>> 32));
		result = prime * result + ((eval == null) ? 0 : eval.hashCode());
		result = prime * result + id;
		result = prime * result + uid;
		result = prime * result + ((uname == null) ? 0 : uname.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Evals other = (Evals) obj;
		if (create != other.create)
			return false;
		if (eval == null) {
			if (other.eval != null)
				return false;
		} else if (!eval.equals(other.eval))
			return false;
		if (id != other.id)
			return false;
		if (uid != other.uid)
			return false;
		if (uname == null) {
			if (other.uname != null)
				return false;
		} else if (!uname.equals(other.uname))
			return false;
		return true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Evals [id=" + id + ", uname=" + uname + ", create=" + create + ", eval=" + eval + ", uid=" + uid + "]";
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the uname
	 */
	public String getUname() {
		return uname;
	}
	/**
	 * @param uname the uname to set
	 */
	public void setUname(String uname) {
		this.uname = uname;
	}
	/**
	 * @return the create
	 */
	public long getCreate() {
		return create;
	}
	/**
	 * @param create the create to set
	 */
	public void setCreate(long create) {
		this.create = create;
	}
	/**
	 * @return the eval
	 */
	public String getEval() {
		return eval;
	}
	/**
	 * @param eval the eval to set
	 */
	public void setEval(String eval) {
		this.eval = eval;
	}
	/**
	 * @return the uid
	 */
	public int getUid() {
		return uid;
	}
	/**
	 * @param uid the uid to set
	 */
	public void setUid(int uid) {
		this.uid = uid;
	}
	private String uname;
	private long create;
	private String eval;
	private int uid;
	
}
