package ex;

public class StringEquelsExample {
	
	public static void main(String[] args) {
		String strVar1 = "�Ź�ö";
		String strVar2 = "�Ź�ö";
		String strVar3 = "���ö";
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1�� strVar2�� ������ ����");
		}else {
			System.out.println("strVar1�� strVar2�� ������ ��������");
		}
		
		if( strVar1.equals(strVar2) ) {
			System.out.println("strVar1�� strVar2�� ���ڿ��� ����");
		}else {
			System.out.println("strVar1�� strVar2�� ���ڿ��� ��������");
		}
		
		if(strVar1 == strVar3) {
			System.out.println("strVar1�� strVar3�� ������ ����");
		}else {
			System.out.println("strVar1�� strVar2�� ������ ��������");
		}
		
		if( strVar1.equals(strVar3) ) {
			System.out.println("strVar1�� strVar3�� ���ڿ��� ����");
		}else {
			System.out.println("strVar1�� strVar3�� ���ڿ��� ��������");
		}
	}
}
