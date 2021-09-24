let form;
let student = ["일지매", "국어", "90", "기말고사"];

window.onload = function(){
	
	form = document.form_exam3;
	
	data();
	print();
	
	form.chg.onclick = change;
	form.pnt.onclick = print;
}

//입력받은 값을 가져오자
function data(){
	//이름
	form.irum.value = student[0];
	
	//과목
	if(form.subject.index == student[1]){
		form.subject.option = true;
	}
	
	//성적
	form.score.value = Number(student[2]);
	
	//시험종류
	if(form.exam.index == student[3]){
		form.exam.option = true;
	}
}

//입력받은 값을 배열에 저장
function change(){
	student[0] = form.irum.value;
	student[1] = form.subject.selectedIndex;
	student[2] = Number(form.score.value);
	student[3] = form.exam.selectedIndex;
}

//입력받은 값을 출력하자
function print(){
	form.result.value = "성적조회결과\n"
										+ "성명 : " + student[0] + "\n"
										+ "과목 : " + student[1] + "\n"
										+ "성적 : " + student[2] + "\n"
										+ "시험종류 :" + student[3];
}