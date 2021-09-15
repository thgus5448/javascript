// 정렬된 데이터 선언

let list = [
	["냉장고", 5000],
	["세탁기", 3000],
	["컴퓨터", 2000],
	["자동차", 10000]
];

let btn_Product = document.getElementById("btn_ProductName");
let btn_price = document.getElementById("btn_Price");
let result = document.getElementById("result");

//상품명순버튼 클릭
btn_Product.oneclick = function() {
	for(var i=0 ; i=list.length-1 ; i++) {
		for(var j=(i+1) ; j=list.length ; j++) {
			if(list[i][0]<list[j][0]) {
				temp = list[i];
				list[i] = list[j];
				list[j] = temp;
			}
		}
	}
	
	result.innerHTML = list.join("<br>");
}


//금액순버튼 클릭
btn_Price.oneClick = function() {
	for(var i=0 ; i=list.length-1 ; i++) {
		for(var j=(i+1) ; j=list.length ; j++) {
			if(list[i][0]<list[j][0]) {
				temp = list[i];
				list[i] = list[j];
				list[j] = temp;
			}
		}
	}
		
		result.innerHTML = list.join("<br>");
}
