/*
1)배열에 성적을 저장하자
2)배열을 출력하자
 */

window.onload = function(){
	let f = document.f;
	let irum = "유다현"
	let score = [10, 20, 30, 40];
	let tot = 0;
	let avg = 0;
	
	//기존 데이터를 form에 표시
	f.irum.value = irum;
	f.kor.value = score[0];
	f.eng.value = score[1];
	f.math.value = score[2];
	f.com.value = score[3];
	
	/*
	//총점,평균
	//f.tot.value = score[1] + score[2] + score[3] + score[4];
	tot = 0;
	avg = 0;
	for(var i=0; i<score.length ; i++){
		tot += score[i];
	}
	avg = tot/score.length;
	
	f.tot.value = tot;
	f.avg.value = avg;
	*/
	
	compute(score,f);
	print(f)
	
	//버튼클릭
	f.btn.onclick = function(){
		score[0] = Number(f.kor.value);
		score[1] = Number(f.eng.value);
		score[2] = Number(f.math.value);
		score[3] = Number(f.com.value);
		
		compute(score,f);
		print(f)
	}
}

function print(x){
	var str = "학생명 : " + x.irum.value + "\n"
					+ "국어 : " + x.kor.value + "\n"
					+ "영어 : " + x.eng.value + "\n"
					+ "수학 : " + x.math.value + "\n"
					+ "전산 : " + x.com.value + "\n"
					+ "총점 : " + x.tot.value + "\n"
					+ "평균 : " + x.avg.value + "\n"
	
	x.result.value = str;
}

function compute(score, f) {
	tot = 0;
	avg = 0;
	
	for(var i=0; i<score.length ; i++){
		tot += score[i];
	}
	
	avg = tot/score.length;
	
	f.tot.value = tot;
	f.avg.value = avg;
}