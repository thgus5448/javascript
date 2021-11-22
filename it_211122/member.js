/**
 * 
 */
function member(){
	let url = "index.jsp?sub=./member/";
	
	let frm = document.frm_member;
	let photo = document.getElementById("photo");
	let btnPrev = document.getElementById("btnPrev");
	let btnNext = document.getElementById("btnNext");
	
	if(frm.btnZip){ //우편번호 검색
		frm.btnZip.onclick = function(){
			new daue.Postcade({
				oncomplete : function(date){
					frm.zip.value = data.zonecode;
					frm.address.value = data.address;
				}
			})
		}
	}
	
	// 증명사진-------------------
	if(photo){ //증명사진 이미지를 클릭하면
		photo.onclick = function(){
			frm.btnPhoto.click();	
				//photo를 누르면 btnPhoto를 누른것처럼
		}
	}
	
	if(frm.btnPhoto){
		frm.btnPhoto.onchange = function(ev){
			let file = ev.srcElement; //이벤트가 발생한 태그
			let url = file.files[0];
					
			//논리적x 절차(암기)
			let reader = new FileReader();
			reader.readAsDataURL(url);
					
			reader.onload = function(ev2){
				let img = new Image();
				img.src = ev2.target.result;
				photo.src = img.src;
			}
		}
	}

/*
}
member.view = function(){
		
}
*/
			
			
	
	if(frm.btnSave){ //저장
		frm.btnSave.onclick = function(){
			frm.action = url + "insert_result.jsp";
			frm.submit();
		}
	}
	
	if(frm.btnList){ //목록
		frm.btnList.onclick = function(){
			frm.action = url + "list.jsp";
			frm.submit();
		}
	}
	
	if(frm.btnModify){
			frm.btnModify.onclick = function(){
		 	frm.action = url + "modify.jsp";
			frm.submit();
		}
	}
	
	if(frm.btnDelete){
		frm.btnDelete.onclick = function(){
			frm.action = url + "delete_result.jsp";
			frm.submit();
		}
	}
		
	if(frm.btnInsert){
		frm.btnSave.onclick = function(){
			frm.action = url + "insert.jsp";
			frm.submit();
		}
	}
		
	if(frm.btnFind){ //검색
			frm.btnSave.onclick = function(){
		 	frm.action = url + "list.jsp";
			frm.nowPage.value = 1;
			frm.submit();
		}
	}
	
		
	if(frm.btnPrev){
			frm.btnPrev.onclick = function(){
			frm.action = url + "list.jsp";
			frm.nowPate.value = nowPage;
			frm.submit();
		}
	}
	
	if(frm.btnNext){
		frm.btnNext.onclick = function(){
			frm.btnPrev.onclick = function(){
			frm.action = url + "list.jsp";
			frm.nowPate.value = nowPage;
			frm.submit();
		}
	}
	
	member.view = function(mid){
		let url = "index.jsp?sub=./member/";
		let frm = document.frm_member;
		
		frm.action = url + "view.jsp";
		frm.mid.value = mid;
		frm.submit();
	}
	
	member.move = function(nowPage){
		let url = "index.jsp?sub./member";
		let frm = "document.frm_member";
		
		frm.action = url + "list.jsp";
		frm.nowPage.value = nowPage;
		frm.submit();
	}
}