/**
 * 1)배열에 초기값 저장
 * 2)배열에 있는 값을 라디오에 적용
 * 3)수정된 내용을 출력
 */
window.onload = function(){
	let g = "남자";
	let c = "호남";
	let l = "한식";
	let data = ["남자", "호남", "한식"];
	let irum = "임꺽정";
	
	let frm = document.frm_radio; 
	
	//이름을 text상자에 표시
	frm.irum.value = irum;
	
	//성별을 체크
	if(frm.gender[0].value == data[0]){
		frm.gender[0].checked = true;
	}else{
		frm.gender[1].checked = true;
	}
	
	//고향 체크
	for(var i=0 ; i<frm.city.length ; i++){
		if(frm.city[i].value == data[1]){
			frm.city[i].checked = true;
			break;
		}
	}
	
	//점심메뉴 체크
	for(var i ; i<frm.lunch.length ; i++){
		if(data[2] == frm.lunch[i].value){
			frm.luch[i].checked = true;
			break;
		}
	}
	
	frm.btn.onclick = function(){
		var str = "<ul>";
		str += "<li> 성명 : " + frm.irum.value;
		
		//체크되어있는 성별
		if(frm.gender[0].checked){
			str += "<li> 성별 : " + frm.gender[0].value;
		}else {
			str += "<li> 성별 : " + frm.gender[1].value;
			}
			
		//고향 체크
		for(var i=0 ; i<frm.city.length ; i++){
			if(frm.city[i].checked){
				str += "<li> 고향 : " + frm.city[i].value;
				break;
			}
		}
		
		// 점심메뉴
		for(var i=0 ; i<frm.lunch.length ; i++){
			if(frm.lanch[i].checked){
				str += "<li> 점심메뉴 : " + frm.lunch[i].value;
				break
			};
		}
		str += "</ul>";
		
		let output = document.getElementById("output");
		output.innerHTML = str;
	}
}