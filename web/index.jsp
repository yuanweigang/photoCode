<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
<title></title>
<style>
</style>
<script type="text/javascript" src="scripts/swfobject.js"></script>
<script type="text/javascript" src="scripts/jquery.js"></script>
<script type="text/javascript" src="scripts/web_socket.js"></script>
<script type="text/javascript" src="scripts/jquery.WebSocket.js"></script>

<script>
var ws;
var WEB_SOCKET_SWF_LOCATION = 'media/WebSocketMain.swf';
var WEB_SOCKET_DEBUG = true;
	$(function() {
		$("#sendBtn").on("click",send);
		 connection();
	});
	
	function connection(){
		   ws = $.websocket({  
		        domain:"172.16.11.240",
		        port:"55555",
		        protocol:"" , 
		        onOpen:function(event){  
		        	showMessage("已成功登录");  
		        },  
		        onError:function(event){
		         	alert("error:"+ event)
		        },  
		        onMessage:function(result){  
		        	receiveMessage(result);
		        },
		        onClose:function(event){
		        	ws = null;
		        	 
			    }
		    });  
		 
	}
 
	function send(){
		if(!ws){
			alert("已经断开聊天室");
			return;
		}
		 var msg=$.trim($("#messageInput").val());
		 if(msg==""){return;}
		 ws.send(msg);  
		 $("#messageInput").val("").focus();;
	}
	
	function receiveMessage(result){
		showMessage(result);
	}
 
	function showMessage(msg){
		$("#public").append("<div>"+msg+"</div>");
	}
	 
	 
</script>
</head>
<body>
 <div id="public" style="height:500px;border:1px solid;"></div>
 
 
		<div class="input">
					<input type="text" id="messageInput" onKeyDown="if (event.keyCode==13)$('#sendBtn').click()" maxlength="100" size="40" tabindex="1" /> 
					<input type="button"  id="sendBtn" value="提交" > 
		</div>
	 
</body>
</html>