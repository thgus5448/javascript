package jdbc_semi;

import java.util.Vector;

//������ Ŭ����
public class ProductVo {
	int num; //��ǰ��ȣ
	String code; //�ڵ�
	String codeName; //��ǰ��
	int price; //����
	String mdate; //�Է³�¥
	int ea; //���귮
	
	public Vector<String> getVector() {
		Vector<String> v = new Vector<String>();
		v.add(num + ""); //""�� �ֺ��̴°�?
		v.add(code);
		v.add(codeName);
		v.add(price + "");
		v.add(mdate);
		v.add(ea + "");

		return v;
	} 
	
	public int getNum() {return num;}
	public void setNum(int num) {this.num = num;}
	public String getCode() {return code;}
	public void setCode(String code) {this.code = code;}
	public String getCodeName() {return codeName;}
	public void setCodeName(String codeName) {this.codeName = codeName;}
	public int getPrice() {return price;}
	public void setPrice(int price) {this.price = price;}
	public String getMdate() {return mdate;}
	public void setMdate(String mdate) {this.mdate = mdate;}
	public int getEa() {return ea;}
	public void setEa(int ea) {this.ea = ea;}
}
