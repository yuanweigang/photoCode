/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.55
 * Generated at: 2014-10-08 03:01:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title></title>\r\n");
      out.write("<style>\r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\" src=\"scripts/swfobject.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"scripts/jquery.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"scripts/web_socket.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"scripts/jquery.WebSocket.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("var ws;\r\n");
      out.write("var WEB_SOCKET_SWF_LOCATION = 'media/WebSocketMain.swf';\r\n");
      out.write("var WEB_SOCKET_DEBUG = true;\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\t$(\"#sendBtn\").on(\"click\",send);\r\n");
      out.write("\t\t connection();\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\tfunction connection(){\r\n");
      out.write("\t\t   ws = $.websocket({  \r\n");
      out.write("\t\t        domain:\"172.16.11.240\",\r\n");
      out.write("\t\t        port:\"55555\",\r\n");
      out.write("\t\t        protocol:\"\" , \r\n");
      out.write("\t\t        onOpen:function(event){  \r\n");
      out.write("\t\t        \tshowMessage(\"已成功登录\");  \r\n");
      out.write("\t\t        },  \r\n");
      out.write("\t\t        onError:function(event){\r\n");
      out.write("\t\t         \talert(\"error:\"+ event)\r\n");
      out.write("\t\t        },  \r\n");
      out.write("\t\t        onMessage:function(result){  \r\n");
      out.write("\t\t        \treceiveMessage(result);\r\n");
      out.write("\t\t        },\r\n");
      out.write("\t\t        onClose:function(event){\r\n");
      out.write("\t\t        \tws = null;\r\n");
      out.write("\t\t        \t \r\n");
      out.write("\t\t\t    }\r\n");
      out.write("\t\t    });  \r\n");
      out.write("\t\t \r\n");
      out.write("\t}\r\n");
      out.write(" \r\n");
      out.write("\tfunction send(){\r\n");
      out.write("\t\tif(!ws){\r\n");
      out.write("\t\t\talert(\"已经断开聊天室\");\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t var msg=$.trim($(\"#messageInput\").val());\r\n");
      out.write("\t\t if(msg==\"\"){return;}\r\n");
      out.write("\t\t ws.send(msg);  \r\n");
      out.write("\t\t $(\"#messageInput\").val(\"\").focus();;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction receiveMessage(result){\r\n");
      out.write("\t\tshowMessage(result);\r\n");
      out.write("\t}\r\n");
      out.write(" \r\n");
      out.write("\tfunction showMessage(msg){\r\n");
      out.write("\t\t$(\"#public\").append(\"<div>\"+msg+\"</div>\");\r\n");
      out.write("\t}\r\n");
      out.write("\t \r\n");
      out.write("\t \r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write(" <div id=\"public\" style=\"height:500px;border:1px solid;\"></div>\r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write("\t\t<div class=\"input\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" id=\"messageInput\" onKeyDown=\"if (event.keyCode==13)$('#sendBtn').click()\" maxlength=\"100\" size=\"40\" tabindex=\"1\" /> \r\n");
      out.write("\t\t\t\t\t<input type=\"button\"  id=\"sendBtn\" value=\"提交\" > \r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t \r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
