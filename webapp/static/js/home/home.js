$(function(){
	$("#loginButton").click( function () { 
		$.post("/login/userLogin", $("loginForm").serialize());
		
	});
	
	
})