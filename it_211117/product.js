/**
 * 
 */
function Product(){
	let frm = document.frm_product;
	let url = "index.jsp?sub=./product/";
	frm.btnInsert.onclick = function(){
		url += "insert.jsp";
		location.href = url;
	}
}