/**
 * 
 */
	let form = document.f1;
	let b = form.b1;
	let result = form.o1;
	
	
	let point = 1000;	//누적하려면 여기에 쓰고 안하려면 function 안에
	let level; //등급 
	
	//버튼 클릭시
	b.onclick = function() {
		
		let t1 = form.t1.value;	//제품명
		let t2 = form.t2.value;	//단가
		let t3 = form.t3.value;	//수량
		
		let money = Number(t2 * t3);	// 금액
		point = point + money * 0.1;	//추가할 포인트
	
		if(point<=1500){ 
			level = "실버";
			}
		else if(1500<point<=2000){ 
			level = "골드";
			}
		else if(2000<point<=2500) { 
			level = "다이아";
			}
		else if(point>2500) { 
			level = "가족"; 
			}
			
		result.innerHTML  = "<ul>"
												+ "<li>제품명 : " + t1
												+ "<li>수량 : " + t3
												+ "<li>단가 : " + t2
												+ "<li>금액 : " + money
												+ "<li>포인트 : " + point
												+ "<li>등급 : " + level
											+ "</ul>";
												
			
	}