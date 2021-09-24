let form;
let member = ["홍길동", "여자"];
let hobby = ["축구", "농구", "탁구"];

window.onload = function(){
	frm  = document.form_exam2;
	
	data();
	print();
	
	//수정누르면 입력값 받아오도록
	form.change_btn.onclick	= data;
	
	//출력누르면 수정한 결과출력
	form.result_btn.onclick = print;
}

							 
//입력값 받아오기
function data(){
	//이름
	form.irum.value = member[0];
	
	//성별
	if(member[1] == form.gender[0].value){
		form.gender[0].checked = true;
	}else{
		form.gender[1].checked = true;
	}
	
	//취미
		// 방법1) 이중for + if
	hobby.length = 0;
	for(var i=0 ; i<hobby.length ; i++){
		for(var j=0 ; j<hobby.length ; j++){
			if(hobby[i] == form.hobby[j]){
				form.hobby[j].checked = true;
				break;
			}
		}
	}
	
	/*
		// 방법2 for + indexOf
	for(var i=0 ; i<hobby.length ; i++){
		form.hobbys[j].value;
		if(hobby.indexOf(form.hobbys[j].value)>-1){
			frm.hobbys[j].checked = true;
		}
	}
	*/
}

//form에 설정되어 있는 값을 배열에 저장
function modify(){
	member[0] = form.irum.value;
	member[1] = (form.gender[0].checked) ? 
								form.gender[0].value : frm.gender[1].value;
	
	/*							
	hobby.length=0;
	if(form.hobby[0].checked) hobby.push(form.hobby[0].value);
	if(form.hobby[1].checked) hobby.push(form.hobby[1].value);
	if(form.hobby[2].checked) hobby.push(form.hobby[2].value);
	if(form.hobby[3].checked) hobby.push(form.hobby[3].value);
	if(form.hobby[4].checked) hobby.push(form.hobby[4].value);
	if(form.hobby[5].checked) hobby.push(form.hobby[5].value); 
	*/
	
	for(var i=0 ; i<form.hobby.length ; i++){
		if(form.hobby[i].check) hobby.push(form.hobby[i].value);
	}
}


//결과출력
function print(){
	var result = document.getElementById("result");
	result.innerHTML = "성명 : " + member[0] +"\n"
								 		+ "성별 : " + member[1] + "\n"
						 				+ "취미 : " + hobby;
}


