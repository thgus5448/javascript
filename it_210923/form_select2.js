/**
 * 
 */
var frm;
var theaters = [
	["서울1관", "서울2관", "서울3관", "서울4관"],
	["대전1관", "대전2관"],
	["대구1관", "대구2관", "대구3관"],
	["부산1관", "부산2관", "부산3관"],
	["포항1관","포항2관"]
];

var movies = [
	[
		["서울1관 영화1", "서울1관 영화2", "서울1관 영화3"],
		["서울2관 영화1", "서울2관 영화2", "서울2관 영화3"],
		["서울3관 영화1", "서울3관 영화2", "서울3관 영화3"],
		["서울4관 영화1", "서울4관 영화2", "서울4관 영화3"]
	],
	[
		["대전1관 영화1", "대전1관 영화2", "대전1관 영화3"],
		["대전2관 영화1", "대전2관 영화2", "대전2관 영화3"],
		["대전3관 영화1", "대전3관 영화2", "대전3관 영화3"]
	],
	[
		["대구1관 영화1", "대구1관 영화2", "대구1관 영화3"],
		["대구2관 영화1", "대구2관 영화2", "대구2관 영화3"],
		["대구3관 영화1", "대구3관 영화2", "대구3관 영화3"]
	],
	[
		["부산1관 영화1", "부산1관 영화2", "부산1관 영화3"],
		["부산2관 영화1", "부산2관 영화2", "부산2관 영화3"],
		["부산3관 영화1", "부산3관 영화2", "부산3관 영화3"]
	],
	[
		["포항1관 영화1", "포항1관 영화2", "포항1관 영화3"],
		["포항2관 영화1", "포항2관 영화2", "포항2관 영화3"]
	]
];

window.onload = function() {
	frm = document.frm_select2;
	frm.zone.onchange = changeZone;
	frm.theater.onchange = changeTheater;
	frm.btn.onclick = output;
}

function changeZone() {
	var index = frm.zone.selectedIndex;
	var list = theaters[index];
	frm.theater.length=0; //값 초기화
	for(var x=0 ; x<list.length ; x++){
		var v = list[x];
		frm.theater.options[x] = new Option(v,v);
	}
}

function changeTheater(){
	var z = form.zone.selectedIndex;
	var t = frm.theater.selectedIndex;
	var list = movies[z][t];
	
	for(var x=0 ; x<list.length ; x++) {
		var v = list[x];
		frm.movies.options[x] = new Option(v,v);
	}
}

function output(){
	var z = frm.zon.selectedIndex;
	var t = frm.theater.selectedIndex;
	var m = frm.movie.selectedIndex;
	var str = "<h3>예매정보<h3>";
	var r = document.getElementById("result");
	
	if(z<0 || t<0 || m<0) {
		alert("예매정보를 모두 선택하세요");
	}else{
		str += "<li> 지역 : " + frm.zone[z].text
				 + "<li> 상영관 : " + frm.theater[t].text
				 + "<li> 영화제목 : " + frm.theater[m].text
				 + "<br/> 이 예매되었습니다.";
			rs.innerHTML = str;
	}
}