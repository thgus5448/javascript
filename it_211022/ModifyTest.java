package gui;

import inheri.Protected;

public class ModifyTest extends Protected{
	ModifyTest(){
		//p.pri = 10; 외부에서 사용불가
		pro = 10;
		//def = 10; 상속을 받았지만 다른 패키지이기 때문에 사용 불간
	}
}
