// div#header 태그에 /html/header.html 내용을 삽입한다.
$.get("/bitcamp-javaproject/html5/header.html", (data) => {
	$("#header").html(data);
	loadLoginUser();
});

function loadLoginUser() {
	$.getJSON("/bitcamp-javaproject/json/auth/loginUser", (data) => {
			$("#username").text(data.id);
			$("#logoutBtn").click((e) => {
				window.alert("okok");
				e.preventDefault(); //클릭했을때 하던 일이 있는데 그것을 하지 말라!
				$.get("/bitcamp-javaproject/json/auth/logout", () => {
					location.href = "/bitcamp-javaproject/html5/auth/login.html";
				});
			});
		}).fail(() => {
		location.href="/bitcamp-javaproject/html5/auth/login.html";
	});
}
