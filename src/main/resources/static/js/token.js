//로컬 스토리지에 token 저장
const token = searchParam('token');

if (token) {
    localStorage.setItem("access_token", token);
}

function searchParam(key) {
    return new URLSearchParams(location.search).get(key);
}