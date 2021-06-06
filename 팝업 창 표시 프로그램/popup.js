window.onload = openPop;

function openPop()
{
    var newwin = window.open("popup.html", "", "whidth=400, height=400");

    if(newWin == null)
    {
        alert("팝업이 차단되어 있습니다. 팝업 차단을 해제하고 새로고침해 주세요.");
    }
}
