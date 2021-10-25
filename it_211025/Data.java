package basic_api;

import sun.tools.tree.SuperExpression;

public class Data implements Cloneable{ 
	String irum = "hong";
	int age = 10;
	String phone = "010-1111-1111";
	
	public Object clone() {
		Object o = null;
		try {
			o = super.clone();
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return o;
	}
	
	@Override
	public String toString() {
		String str = 
				String.format("%s[³ªÀÌ : %d]-%s",
						irum, age, phone);
		
		return str;
	}
}
