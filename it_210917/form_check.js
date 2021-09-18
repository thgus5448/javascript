/**
 * 
 */
window.onload = myjob;	//myjob이라는 function을 call back형식으로 설정(소괄호 사용x)

function myjob(){
	let ff = document.ff;
	
	ff.btn.onclick = function(){
		frm.re.value = "";
		for(var i=0 ; i<chk.length ; i++){
			if(ff.chk[i].checked){
				ff.re.value += ff.chk[i].value + "\n";
			}
		} 
	}
}