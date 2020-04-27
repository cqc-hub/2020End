package yp.cqc.pojo;

public class SwUser {
	private int uid;
	public SwUser(int uid, String uname, String pwd, String sex, int age, String birth, String bodyhel, int score1,
			int score2, int score3) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.pwd = pwd;
		this.sex = sex;
		this.age = age;
		this.birth = birth;
		this.bodyhel = bodyhel;
		this.score1 = score1;
		this.score2 = score2;
		this.score3 = score3;
	}
	public SwUser() {
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
		result = prime * result + age;
		result = prime * result + ((birth == null) ? 0 : birth.hashCode());
		result = prime * result + ((bodyhel == null) ? 0 : bodyhel.hashCode());
		result = prime * result + ((pwd == null) ? 0 : pwd.hashCode());
		result = prime * result + score1;
		result = prime * result + score2;
		result = prime * result + score3;
		result = prime * result + ((sex == null) ? 0 : sex.hashCode());
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
		SwUser other = (SwUser) obj;
		if (age != other.age)
			return false;
		if (birth == null) {
			if (other.birth != null)
				return false;
		} else if (!birth.equals(other.birth))
			return false;
		if (bodyhel == null) {
			if (other.bodyhel != null)
				return false;
		} else if (!bodyhel.equals(other.bodyhel))
			return false;
		if (pwd == null) {
			if (other.pwd != null)
				return false;
		} else if (!pwd.equals(other.pwd))
			return false;
		if (score1 != other.score1)
			return false;
		if (score2 != other.score2)
			return false;
		if (score3 != other.score3)
			return false;
		if (sex == null) {
			if (other.sex != null)
				return false;
		} else if (!sex.equals(other.sex))
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
		return "SwUser [uid=" + uid + ", uname=" + uname + ", pwd=" + pwd + ", sex=" + sex + ", age=" + age + ", birth="
				+ birth + ", bodyhel=" + bodyhel + ", score1=" + score1 + ", score2=" + score2 + ", score3=" + score3
				+ "]";
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
	 * @return the pwd
	 */
	public String getPwd() {
		return pwd;
	}
	/**
	 * @param pwd the pwd to set
	 */
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the birth
	 */
	public String getBirth() {
		return birth;
	}
	/**
	 * @param birth the birth to set
	 */
	public void setBirth(String birth) {
		this.birth = birth;
	}
	/**
	 * @return the bodyhel
	 */
	public String getBodyhel() {
		return bodyhel;
	}
	/**
	 * @param bodyhel the bodyhel to set
	 */
	public void setBodyhel(String bodyhel) {
		this.bodyhel = bodyhel;
	}
	/**
	 * @return the score1
	 */
	public int getScore1() {
		return score1;
	}
	/**
	 * @param score1 the score1 to set
	 */
	public void setScore1(int score1) {
		this.score1 = score1;
	}
	/**
	 * @return the score2
	 */
	public int getScore2() {
		return score2;
	}
	/**
	 * @param score2 the score2 to set
	 */
	public void setScore2(int score2) {
		this.score2 = score2;
	}
	/**
	 * @return the score3
	 */
	public int getScore3() {
		return score3;
	}
	/**
	 * @param score3 the score3 to set
	 */
	public void setScore3(int score3) {
		this.score3 = score3;
	}
	private String uname;
	private String pwd;
	private String sex;
	private int age;
	private String birth;
	private String bodyhel;
	private int score1;
	private int score2;
	private int score3;

}
