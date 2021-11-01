package ex;

public class StringEquelsExample {
	
	public static void main(String[] args) {
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		String strVar3 = "김민철";
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		}else {
			System.out.println("strVar1과 strVar2는 참조가 같지않음");
		}
		
		if( strVar1.equals(strVar2) ) {
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		}else {
			System.out.println("strVar1과 strVar2는 문자열이 같지않음");
		}
		
		if(strVar1 == strVar3) {
			System.out.println("strVar1과 strVar3는 참조가 같음");
		}else {
			System.out.println("strVar1과 strVar2는 참조가 같지않음");
		}
		
		if( strVar1.equals(strVar3) ) {
			System.out.println("strVar1과 strVar3는 문자열이 같음");
		}else {
			System.out.println("strVar1과 strVar3는 문자열이 같지않음");
		}
	}
}
