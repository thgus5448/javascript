package db;

import java.util.Vector;

public class GuestBookVo {
	int num;
	String mid;
	String mdate;
	String doc;
	String pwd;
	
	public Vector getVector() {
		Vector<String> v = new Vector();
		v.add(num + "");
		v.add(mid);
		v.add(mdate);
		v.add(doc);
		v.add(pwd);
		
		return v;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getMdate() {
		return mdate;
	}
	public void setMdate(String mdate) {
		this.mdate = mdate;
	}
	public String getDoc() {
		return doc;
	}
	public void setDoc(String doc) {
		this.doc = doc;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
}
