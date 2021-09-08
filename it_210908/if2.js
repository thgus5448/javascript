/**
 * 몸무게를 통한 탑승 여부 체크 스크립트
 * 작성일 : 2021.09.08
 * 작성자 : 유다현
 */

var frm = document.frm_weight;

var btn = frm.btnCheck;

btn.onclick = function(){
	//alert(frm.weight.value);
	var w = Number( frm.weight.value ); //입력받은 weight의 값을 가져와라
	frm.here.innerHTML=""; //here에 있는 내용을 모두 지우라.
	if( w<60 || w>90) {
		frm.here.innerHTML = "탑승 불가";		
	}
}
