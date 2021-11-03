package ex;

public class ArrayCopyExample {
	
	/* System.arraycopy()로 배열 복사
	 * 특징 : 복사되지 않은 항목은 String[] 배열의 기본 초기값 null이 그대로 유지된다.
	 */
	public static void main(String[] args) {
		String[] oldStrArray = {"java", "array", "copy"};
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0 , newStrArray, 0, oldStrArray.length);
		
		for(int i=0 ; i<newStrArray.length ; i++) {
			System.out.println(newStrArray[i] + ",");
		}
 	}
}
