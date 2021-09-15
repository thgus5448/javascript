let su = document.getElementById("su");
let btnEval = document.getElementById("btnEval");
let evalResult = document.getElementById("evalResult");

btnEval.onclick = function() {
	if(su.value == "") {
		evalResult.innerHTML = "계산식을 입력해 주세요."
	}
	else {
	var r = eval(su.value);
	evalResult.innerHTML = r;		
	}
	su.focus();
}


/* parseInt ---------- */
let su2 = document.getElementById("su2");
let radix = document.getElementById("radix");
let btnRadix = document.getElementById("btnRadix")
let radixResult = document.getElementById("radixResult");

btnRadix.onclick = function() {
	let s = su2.value;
	let r = radix.value;
	radixResult.innerHTML = parseInt(s,r);
}


/* isFinite || isNaN ----------*/
let str = document.getElementById("str");
let btnFinite = document.getElementById("btnFinite");
let btnNaN = document.getElementById("btnNaN");
let txtResult = document.getElementById("txtResult");

btnFinite.onclick = function() {
	var b = isFinite(str.value);
	
	if(b) {
	txtResult.value = str.value + " 는 숫자로 이루어짐."		
	}else {
		txtResult.value = str.value + " 에는 문자가 포함되어있음.";
	}
}

btnNaN.onclick = function() {
	var c = isNaN(str.value);
	
	if(c) {
		txtResult.Value = str.value + " 는 문자로 이루어짐"
	}else { 
		txtResult.value = str.value + " 에는 문자가 포함되어있지않음."
	}
}