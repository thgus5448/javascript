var bigPic = document.querySelector("#cup");
var smallPics = document.querySelector(".small");

var isOpen = false; //상세 설명 보기 상대. 기본적으로 감춰져있으므로 초기값을 false로 지정

//작은그림 클릭하면 크게 보이도록
for(var i=0; i<smallPics.length; i++)
{
    smallPics[i].onclick = showBig;
}

function showBig()
{     
    var newPic = this.src;
    bigPic.setAttribute("src", newPic);
}


//상세설명 표시/감추기
var view = document.querySelector("#view");
view.addEventListener("click", function()
{
    if(isOpen == false)
    {
        document. querySelector("#detail").style.display = "block";
        view.innerHTML = "상세 설명 닫기";   //링크 내용 수정
        isOpen = true;  //표시중인 상태
    }
    else
    {
        document.querySelector("#detail").style.display = "none";
        view.innerHTML = "상세 설명 보기";
        isOpen = false; //감춰진 상태
    }
});