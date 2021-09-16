/**
 *  다중 검색(split + indexOf)
 *	2021.09(ydh)
 *	1) 배열에 임의의 데이터를 저장
 *	2) 루프안에서 검색어와 배열의 값을 비교 처리
 */

window.onload = function(){
	let data = ["김씨", "박씨", "최씨", "홍씨", "남씨", "java", "유다현", "html","css3", "js", 123]
	let search = document.getElementById("search");
	let btn_search = document.getElementById("btn_search");
	let result = document.getElementById("result");
	let resultData = [];
	
	btn_search.onclick = function() {
		let search_cut = search.value.split(",");
		
		for(var i in data){
			
			for(var w in search_cut){
				
				if(data[i].indexOf(search_cut[w]) >= 0) {
					resultData.push(data[i]);
					break;
				}
			}
		}
		
		result.innerHTML = resultData.join("<br>")
	}
}