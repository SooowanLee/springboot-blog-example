//삭제 기능
const deleteBtn = document.getElementById('delete-btn');

if (deleteBtn) {
    deleteBtn.addEventListener("click", event => {
        let id = document.getElementById('article-id').value;

        fetch(`/api/articles/${id}`, {
            method: "DELETE"
        })
            .then(() => {
                alert("삭제가 완료되었습니다.");
                location.replace('/articles');
            });
    })
}

//수정 기능
//id가 modify-btn인 엘리먼트 조회
const modifyButton = document.getElementById('modify-btn');

if (modifyButton) {
    modifyButton.addEventListener('click', event => {
        let params = new URLSearchParams(location.search);
        let id = params.get('id');

        fetch(`/api/articles/${id}`, {
            method: 'PUT',
            headers: {
                "Content-Type": "application/json"
            },
            body: JSON.stringify({
                title: document.getElementById('title').value,
                content: document.getElementById('content').value
            })
        }).then(() => {
            alert("수정이 완료되었습니다.");
            location.replace(`/articles/${id}`);
        });
    });
}

//등록 기능
//id가 create-btn인 엘리먼트 가져오기
const creatButton = document.getElementById('create-btn');

if (creatButton) {
    //클릭 이벤트가 감지되면 생성 API 요청
    creatButton.addEventListener("click", event => {
        fetch("/api/articles", {
            method: 'POST',
            headers: {
                "Content-Type": "application/json"
            },
            body: JSON.stringify({
                title: document.getElementById('title').value,
                content: document.getElementById('content').value
            })
        }).then(() => {
            alert("등록이 완료되었습니다.");
            location.replace("/articles");
        });
    });
}

