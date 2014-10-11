<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
<title></title>
<body>
<h1>WebSocket Chat</h1>
<section id="content"></section>
<input id="message" type="text"/>
<script type="text/javascript" src="scripts/jquery.js"></script>
<script type="text/javascript" src="scripts/swfobject.js"></script>
<script type="text/javascript" src="scripts/web_socket.js"></script>
<script type="text/javascript" src="scripts/reconnecting-websocket.js"></script>
<script type="text/javascript" src="scripts/jquery.websocket-0.0.1.js"></script>
<script type="text/javascript" src="scripts/jquery.json-2.4.js"></script>


<script>
if ("WebSocket" in window)
{
	alert("WebSocket supported here!  :)\r\n\r\nBrowser: " + navigator.appName + " " + navigator.appVersion + "\r\n\r\n(based on Google sample code)");
}else{
	alert("浏览器不支持");
}
var WEB_SOCKET_SWF_LOCATION = 'media/WebSocketMain.swf';
var ws = new ReconnectingWebSocket("ws://172.16.11.3:55555/service");

ws.onopen = function()
{
	// Web Socket is connected
	alert("websocket is open");
	
	// You can send data now
	ws.send("Hey man, you got the time?");
};
ws.onmessage = function(evt) { alert("received: " + evt.data); };
ws.onclose = function() { alert("websocket is closed"); };

</script>
</body>
</html>