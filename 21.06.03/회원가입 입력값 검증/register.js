var userId = document.querySelector("#user-id");
var pw1 = document.querySelector("user-pw1");
var pw2 = document.querySelector("user-pw2");   //비밀번호 검증
/*  <change 이벤트>
텍스트 필드 안의 내용이 바뀔 때, 
즉 [아이디] 필드에 입력을 마치고 그 필드를 빠져나올 때 발생하는 이벤트
*/


userId.onchange = checkId;
pw1.onchange = checkPw;
pw2.onchange = comparePw;


//아이디 입력값 검증
function checkId()
{
    if (userId.value.length < 4 || userId.Value.length > 15)
    {
        alert("4~15자리의 영문과 숫자를 사용하세요.");
        userId.select();  //다시 입력할 수 있도록 userId필드 선택
    }
}

//비밀번호 입력값 검증
function checkPw()
{
    if (pw1.value.length < 8)
    {
        alert("비밀번호는 8자리 이상이어야 합니다.");
        pw1.value = "";
        pw1.focus();
    }
}

//비밀번호 재확인
function comparePw()
{
    if (pw1.value != pw2.value)
    {
        alert("암호가 다릅니다. 다시입력하세요");
        pw2.value = "";
        pw2.focus();
    }
}




