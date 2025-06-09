// 서버를 깨우기 위한 Keep-Alive 스크립트
function keepAlive() {
    fetch('/api/ping')
        .then(response => response.text())
        .then(data => console.log('Keep-Alive ping:', data))
        .catch(error => console.error('Keep-Alive error:', error));
}

// 10분마다 핑을 보냄 (Render의 무료 티어는 15분 동안 요청이 없으면 슬립모드로 전환)
setInterval(keepAlive, 10 * 60 * 1000);

// 페이지 로드 시 즉시 첫 핑 전송
document.addEventListener('DOMContentLoaded', keepAlive); 