

function tiaozhuan(d){
	if(d==1){
		$("#centerEdit").load("/bootstrap/page/lidan/citiaoChaxun.html",null,function(){alert("加载成功")}); 
	}else if(d==2){
		$("#centerEdit").load("/bootstrap/page/lidan/citiaoEdit.html",null,function(){alert("加载成功")}); 
	}else if(d==3){
		$("#centerEdit").load("/bootstrap/page/lidan/citiaoEdit.html",null,function(){alert("加载成功")}); 
	}else if(d==4){
		$("#centerEdit").load("/bootstrap/page/lidan/citiaoEdit.html",null,function(){alert("加载成功")}); 
	}else if(d==11){
		$("#centerEdit").load("/bootstrap/page/lidan/citiaoChaxun.html",null,function(){alert("加载成功")}); 
	}else if(d==12){
		$("#centerEdit").load("/bootstrap/page/lidan/citiaoEdit.html",null,function(){alert("加载成功")}); 
	}else if(d==13){
		$("#centerEdit").load("/bootstrap/page/lidan/citiaoduibi.html",null,function(){alert("加载成功")}); 

	}else if(d==14){
		$("#centerEdit").load("/bootstrap/page/lidan/citiaoShenhe.html",null,function(){alert("加载成功")}); 

	}
	
}

function yemian(){
	$('#centerEditer').load(function() {
		window.location.href='/bootstrap/page/lidan/citiaoEdit.html'; 
	});
}


function edit1(){
	window.open ('/bootstrap/page/lidan/bianjineirong.html','newwindow','height=400,width=400,top=50,left=100,toolbar=true,menubar=true,scrollbars=true,resizable=true, location=true,status=true'); 
	
}




