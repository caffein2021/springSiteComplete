/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.43
 * Generated at: 2021-04-28 04:00:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.gallery;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class galleryList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("jar:file:/C:/example/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/springSite/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1619581655143L));
    _jspx_dependants.put("/WEB-INF/tld/custom_tag.tld", Long.valueOf(1511121144000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\" />\r\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=no\"/>\r\n");
      out.write("\t\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />\r\n");
      out.write("\t\t<title>갤러리 리스트</title>\r\n");
      out.write("\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"/resources/include/css/common.css\" />\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"/resources/include/js/jquery-1.12.4.min.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"/resources/include/js/jquery.form.min.js\"></script> \r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"/resources/include/js/common.js\"></script>\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"/resources/include/css/lightbox.css\" />\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"/resources/include/js/lightbox.min.js\"></script>\t\t\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t$(function() {\r\n");
      out.write("\t\t\t\t//newRecord() 임의 값으로 메서드 확인\r\n");
      out.write("\t\t\t\t//newRecord(\"홍길동\", \"갤러리 게시판 제목\", \"게시판 내용\", \"thumb-01.jpg\", \"thumb-01.jpg\", \"2017-11-14\", 0);\r\n");
      out.write("\t\t\t\tlistData();\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t/* 저장 버튼 클릭 시 처리 이벤트 */\r\n");
      out.write("\t\t\t\t$(\"#galleryInsertBtn\").click(function(){\r\n");
      out.write("\t\t\t\t\t//입력값 체크\r\n");
      out.write("\t\t\t\t\tif (!checkForm($('#g_name'),\"작성자를\"))\treturn;\r\n");
      out.write("\t\t\t\t\telse if (!checkForm($('#g_subject'),\"글제목을\"))\treturn;\r\n");
      out.write("\t\t\t\t\telse if (!checkForm($('#g_content'),\"간단한 내용을\"))\treturn;\r\n");
      out.write("\t\t\t\t\telse if (!checkForm($('#file'),\"등록할 이미지를\"))\treturn;\r\n");
      out.write("\t\t\t\t\telse if (!chkFile($('#file')))\treturn;\r\n");
      out.write("\t\t\t\t\telse if (!checkForm($('#g_pwd'),\"비밀번호를\"))\treturn;\r\n");
      out.write("\t\t\t\t\telse {\r\n");
      out.write("\t\t\t\t\t\t $(\"#f_writeForm\").ajaxForm({\r\n");
      out.write("\t\t\t\t\t\t\turl : \"/gallery/galleryInsert.do\", \r\n");
      out.write("\t\t\t\t\t\t\ttype : \"post\",               \r\n");
      out.write("\t\t\t\t\t\t\tenctype : \"multipart/form-data\",\r\n");
      out.write("\t\t\t\t\t\t\tdataType : \"text\",\r\n");
      out.write("\t\t\t\t\t\t\terror : function(){     \r\n");
      out.write("\t\t\t\t\t\t\t\talert('시스템 오류 입니다. 관리자에게 문의 하세요');\r\n");
      out.write("\t\t\t\t\t\t\t},                        \r\n");
      out.write("\t\t\t\t\t\t\tsuccess : function(data){ \r\n");
      out.write("\t\t\t\t\t\t\t\tconsole.log(data);\r\n");
      out.write("\t\t\t\t\t\t\t\t//alert(data);\r\n");
      out.write("\t\t\t\t\t\t\t\tif(data==\"성공\"){\r\n");
      out.write("\t\t\t\t\t\t\t\t\tresetData();\r\n");
      out.write("\t\t\t\t\t\t\t\t\t$('#galleryModal').modal('hide');\r\n");
      out.write("\t\t\t\t\t\t\t\t\tlistData();\r\n");
      out.write("\t\t\t\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t\t\t\talert(\"[\"+data+\"]\\n등록에 문제가 있어 완료하지 못하였습니다. 잠시 후 다시 시도해 주세요.\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\tresetData();\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t$(\"#f_writeForm\").submit(); \r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t// 초기화 작업\r\n");
      out.write("\t\t\tfunction resetData(){\r\n");
      out.write("\t\t\t\t$(\"#f_writeForm\").each(function(){\r\n");
      out.write("\t\t\t\t\tthis.reset();\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t//갤러리 리스트 요청 처리\r\n");
      out.write("\t\t\tfunction listData(){\r\n");
      out.write("\t\t\t\t$(\"#accordion\").html(\"\");\r\n");
      out.write("\t\t\t\t$.getJSON(\"/gallery/galleryData.do\", function(data) {\r\n");
      out.write("\t\t\t\t\tconsole.log(data.length);\r\n");
      out.write("\t\t\t\t\t$(data).each(function(index) {\r\n");
      out.write("\t\t\t\t\t\tvar g_name = this.g_name;\r\n");
      out.write("\t\t\t\t\t\tvar g_subject = this.g_subject;\r\n");
      out.write("\t\t\t\t\t\tvar g_content = this.g_content;\r\n");
      out.write("\t\t\t\t\t\tvar g_thumb = this.g_thumb;\r\n");
      out.write("\t\t\t\t\t\tvar g_file = this.g_file;\r\n");
      out.write("\t\t\t\t\t\tvar g_date = this.g_date;\r\n");
      out.write("\t\t\t\t\t\tconsole.log(\"index : \"+index);\r\n");
      out.write("\t\t\t\t\t\tconsole.log(this.g_name);\r\n");
      out.write("\t\t\t\t\t\tnewRecord(g_name, g_subject, \r\n");
      out.write("\t\t\t\t\t\tg_content, g_thumb, g_file, \r\n");
      out.write("\t\t\t\t\t\tg_date, index);\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t}).fail(function() {\r\n");
      out.write("\t\t\t\t\talert(\"목록을 불러오는데 실패하였습니다. 잠시후에 다시 시도해 주세요.\");\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t//부트스트랩을 활용하여 메서드 생성\r\n");
      out.write("\t\t\tfunction newRecord(g_name, g_subject, g_content, g_thumb, g_file, g_date, index){\r\n");
      out.write("\t\t\t\tvar panel = $(\"<div>\");\r\n");
      out.write("\t\t\t\tpanel.addClass(\"panel panel-default\");\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tvar panel_heading = $(\"<div>\");\r\n");
      out.write("\t\t\t\tpanel_heading.addClass(\"panel-heading\");\r\n");
      out.write("\t\t\t\tpanel_heading.attr({role:\"tab\", id:\"heading\"+index});\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tvar panel_title = $(\"<h4>\");\r\n");
      out.write("\t\t\t\tpanel_title.addClass(\"panel-title\");\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tvar\ttitle = $(\"<a>\");\r\n");
      out.write("\t\t\t\ttitle.attr({\"data-toggle\":\"collapse\", \"data-parent\":\"#accordion\", \"href\":\"#collapse\"+index, \"aria-controls\":\"collapse\"+index});\t\r\n");
      out.write("\t\t\t\tif(index==0){\r\n");
      out.write("\t\t\t\t\ttitle.attr({\"aria-expanded\":\"true\"});\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\ttitle.attr({\"aria-expanded\":\"false\"});\r\n");
      out.write("\t\t\t\t\ttitle.addClass(\"collapsed\");\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\ttitle.html(g_subject);\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tvar\tpanel_body = $(\"<div>\");\r\n");
      out.write("\t\t\t\tpanel_body.addClass(\"panel-collapse collapse\");\r\n");
      out.write("\t\t\t\tif(index==0){ panel_body.addClass(\"in\"); }\r\n");
      out.write("\t\t\t\tpanel_body.attr({id:'collapse'+index, role:'tabpanel', \"aria-labelledby\":'heading'+index});\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tvar body = $(\"<div>\");\r\n");
      out.write("\t\t\t\tbody.addClass(\"panel-body\");\r\n");
      out.write("\t\t\t\tvar thumb_img_area = $(\"<div>\");\r\n");
      out.write("\t\t\t\tthumb_img_area.addClass(\"col-md-2\");\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tvar lightbox_a = $(\"<a>\");\r\n");
      out.write("\t\t\t\t// 메서드 확인 시 아래 경로로 확인\r\n");
      out.write("\t\t\t\t//lightbox_a.attr({\"href\":\"/resources/images/thumbnail/\"+g_file, \"data-lightbox\":\"roadtrip\"});\r\n");
      out.write("\t\t\t\tlightbox_a.attr({\"href\":\"/uploadStorage/gallery/\"+g_file, \"data-lightbox\":\"roadtrip\"});\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tvar thumb_img = $(\"<img>\");\r\n");
      out.write("\t\t\t\t// 메서드 확인 시 아래 경로로 확인\r\n");
      out.write("\t\t\t\t//thumb_img.attr(\"src\", \"/resources/images/thumbnail/\"+g_thumb);\r\n");
      out.write("\t\t\t\tthumb_img.attr(\"src\", \"/uploadStorage/gallery/thumbnail/\"+g_thumb);\r\n");
      out.write("\t\t\t\tthumb_img.addClass(\"img-thumbnail\");\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tvar date = $(\"<p>\");\r\n");
      out.write("\t\t\t\tdate.addClass(\"form-control-static\");\r\n");
      out.write("\t\t\t\tdate.html(g_date);\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tvar con = $(\"<p>\");\r\n");
      out.write("\t\t\t\tcon.addClass(\"form-control-static\");\r\n");
      out.write("\t\t\t\tcon.html(g_content);\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tbody.append(thumb_img_area.append(lightbox_a.append(thumb_img)));\r\n");
      out.write("\t\t\t\tbody.append(date).append(con);\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tpanel.append(panel_heading.append(panel_title.append(title)));\r\n");
      out.write("\t\t\t\tpanel.append(panel_body.append(body));\r\n");
      out.write("\t\t\t\t$(\"#accordion\").append(panel);\r\n");
      out.write("\t\t\t} \r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<div class=\"contentContainer\">\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t<p class=\"tar\">\r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\"#galleryModal\" data-whatever=\"@mdo\">갤러리 등록</button>\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"panel-group\" id=\"accordion\"role=\"tablist\" aria-multiselectable=\"true\"></div> \r\n");
      out.write("\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"modal fade\" id=\"galleryModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"galleryModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("\t\t\t\t<div class=\"modal-dialog\">\r\n");
      out.write("\t\t\t\t\t<div class=\"modal-content\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"modal-header\">\r\n");
      out.write("\t\t\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\r\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"modal-title\" id=\"galleryModalLabel\">갤러리 등록</h4>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"modal-body\">\r\n");
      out.write("\t\t\t\t\t\t\t<form id=\"f_writeForm\" name=\"f_writeForm\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"g_name\" class=\"control-label\">작성자</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"g_name\" id=\"g_name\" maxlength=\"5\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"g_subject\" class=\"control-label\">글제목</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"g_subject\" id=\"g_subject\" maxlength=\"50\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"g_content\" class=\"control-label\">글내용</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<textarea class=\"form-control\" name=\"g_content\" id=\"g_content\"></textarea>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"file\" class=\"control-label\">이미지</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"file\" name=\"file\" id=\"file\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"g_pwd\" class=\"control-label\">비밀번호</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"password\" class=\"form-control\" name=\"g_pwd\" id=\"g_pwd\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"modal-footer\">\r\n");
      out.write("\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">닫기</button>\r\n");
      out.write("\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-primary\" id=\"galleryInsertBtn\">등록</button>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</body>\r\n");
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