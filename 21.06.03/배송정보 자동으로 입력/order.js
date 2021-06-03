var check = document.querySelector("#shippingInfo");    //체크상자 id

check.addEventListener("click", function(){
    if (check.checked == true){
        //check객체의 checked속성은 체크 상자가 체크되면 값이 true임
        document.querySelector("#shippingName").value   //주문정보(이름)
        = document.querySelector("#billingName").value;

        document.querySelector("#shippingTel").value    //주문정보(전화번호)
        = document.querySelector("#billingTel").value;  //배송정보(전화번호)

        document.querySelector("#shippingAddr").value   //주문정보(주소)
        = document.querySelector("#billingAddr").value; //배송정보(주소)
    }
    else{
        //체크가 해제된다면 배송정보 필드에 있는 주문정보 값 지움
        document.querySelector("#shippingName").value = "";
        document.querySelector("#shippingTel").value = "";
        document.querySelector("#shippingAddr").value = "";
    }
});