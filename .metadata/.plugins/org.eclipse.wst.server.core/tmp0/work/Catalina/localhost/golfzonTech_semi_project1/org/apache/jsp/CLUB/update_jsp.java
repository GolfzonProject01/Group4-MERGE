/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.65
 * Generated at: 2022-10-06 08:20:16 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.CLUB;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class update_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1664934107135L));
    _jspx_dependants.put("jar:file:/C:/Users/JS/Desktop/project_1/Group4-Merge/golfzonTech_semi_project1/src/main/webapp/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425946270000L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;

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
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<title>클럽정보 수정</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"CSS/header.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"CSS/footer.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"CSS/club/update.css\">\r\n");
      out.write("<script>\r\n");
      out.write("function doAction(value) {\r\n");
      out.write("	  if(value == 0) {\r\n");
      out.write("		  location.href = \"club_updateOK.do?club_id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.club_id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\";\r\n");
      out.write("	  } else if(value == 1) {\r\n");
      out.write("		  console.log(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.club_id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(");\r\n");
      out.write("		  var msg = confirm(\"정말 삭제하시겠습니까?\");\r\n");
      out.write("		  if(msg==true){\r\n");
      out.write("			  location.href = \"club_deleteOK.do?club_id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.club_id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\";  \r\n");
      out.write("		  } else {\r\n");
      out.write("			  return false;\r\n");
      out.write("		  }\r\n");
      out.write("	  }\r\n");
      out.write("	}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("   <!-- headarea -->\r\n");
      out.write("    <div id=\"header\">\r\n");
      out.write("	    <div id=\"header_up\">\r\n");
      out.write("	      <div id=\"logo\">\r\n");
      out.write("	        <a href=\"home.do\">\r\n");
      out.write("	          <img id=\"logo_img\" src=\"CSS/logo/logo_small.png\" alt=\"logo_img\">\r\n");
      out.write("	        </a>\r\n");
      out.write("	      </div>\r\n");
      out.write("	      <div id=\"account\">\r\n");
      out.write("	        ");
      if (_jspx_meth_c_005fchoose_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("	      </div>\r\n");
      out.write("	    </div>\r\n");
      out.write("	    <div id=\"header_nav\">\r\n");
      out.write("	      <ul id=\"nav_box\">\r\n");
      out.write("	        <li class=\"nav_item\">\r\n");
      out.write("	          <a href=\"club_selectAll.do?order=desc\">모임</a>\r\n");
      out.write("	        </li>\r\n");
      out.write("	        <li class=\"nav_item\">\r\n");
      out.write("	          <a href=\"activity_selectAll.do\">액티비티</a>\r\n");
      out.write("	        </li>\r\n");
      out.write("	        <li class=\"nav_item\">\r\n");
      out.write("	          <a href=\"event_selectAll.do\">이벤트</a>\r\n");
      out.write("	        </li>\r\n");
      out.write("	      </ul>\r\n");
      out.write("	    </div>\r\n");
      out.write("  	</div>\r\n");
      out.write("\r\n");
      out.write("    <!-- 개발영역  -->\r\n");
      out.write("   <div id=\"container\">\r\n");
      out.write("      <div id=\"club_intro_background\">\r\n");
      out.write("         <div id=\"update_box\">\r\n");
      out.write("            <div id=\"update_form\">\r\n");
      out.write("              <p>[ ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${member_id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" 모임의 정보수정 ]</p>\r\n");
      out.write("              <form id=\"club_update\" action=\"club_updateOK.do\" name=\"clubpage_updateOK\" method=\"post\" enctype=\"multipart/form-data\">\r\n");
      out.write("                <div id=\"select_button\">\r\n");
      out.write("                  <input type=\"submit\" value=\"수정\" id=\"submit_button\" name=\"submit_button\">\r\n");
      out.write("                  <input type=\"button\" value=\"삭제\" id=\"delete_button\" onclick=\"doAction(1)\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <input type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.club_id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" name=\"club_id\">\r\n");
      out.write("                <div id=\"close_name\">\r\n");
      out.write("                  <select id=\"close\" name=\"close\">\r\n");
      out.write("                    <option id=\"close_selected\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo2.close}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" selected hidden>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo2.close}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</option>\r\n");
      out.write("                    <option value=\"0\">공개</option>\r\n");
      out.write("                    <option value=\"1\">비공개</option>\r\n");
      out.write("                    <script>\r\n");
      out.write("		                 // 공개/비공개 필터\r\n");
      out.write("	                	let close = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo2.close}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("	                	if(close == 0) {\r\n");
      out.write("	                		document.getElementById(\"close_selected\").innerText = \"공개\";\r\n");
      out.write("	                	} else if(close == 1) {\r\n");
      out.write("	                		document.getElementById(\"close_selected\").innerText = \"비공개\";\r\n");
      out.write("	                	} \r\n");
      out.write("                    </script>\r\n");
      out.write("                  </select>\r\n");
      out.write("                  <input type=\"text\" placeholder=\"모임이름을 작성해주세요.\" id=\"club_name\" name=\"club_name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo2.club_name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" maxlength=\"25\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"imgViewArea\">\r\n");
      out.write("                  <ul>\r\n");
      out.write("                    <li>\r\n");
      out.write("                      <p>[ 대표 이미지 ]</p>\r\n");
      out.write("                      <img id=\"preview_image\" src=\"upload/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo2.club_img}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"><br>\r\n");
      out.write("                      <input type=\"file\" id=\"upFile\" name=\"upFile\">\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                      <p>[ 모임 소개글 ]</p>\r\n");
      out.write("                      <textarea  id=\"club_desc\" name=\"club_desc\" placeholder=\"우리 모임은...\" maxlength=\"500\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo2.club_desc}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</textarea>\r\n");
      out.write("                    </li>\r\n");
      out.write("                  </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("                <script>\r\n");
      out.write("                  function readImage(input) {\r\n");
      out.write("                    // 인풋 태그에 파일이 있는 경우\r\n");
      out.write("                    if(input.files && input.files[0]) {\r\n");
      out.write("                        // 이미지 파일인지 검사 (생략)\r\n");
      out.write("                        // FileReader 인스턴스 생성\r\n");
      out.write("                        const reader = new FileReader()\r\n");
      out.write("                        // 이미지가 로드가 된 경우\r\n");
      out.write("                        reader.onload = e => {\r\n");
      out.write("                            const previewImage = document.getElementById(\"preview_image\")\r\n");
      out.write("                            previewImage.src = e.target.result\r\n");
      out.write("                        }\r\n");
      out.write("                        // reader가 이미지 읽도록 하기\r\n");
      out.write("                        reader.readAsDataURL(input.files[0])\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("                // input file에 change 이벤트 부여\r\n");
      out.write("                const inputImage = document.getElementById(\"upFile\")\r\n");
      out.write("                inputImage.addEventListener(\"change\", e => {\r\n");
      out.write("                    readImage(e.target)\r\n");
      out.write("                })\r\n");
      out.write("                </script>\r\n");
      out.write("                <input type=\"hidden\" placeholder=\"모임장명\" id=\"club_leader\" name=\"club_leader\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${member_id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                <p style=\"font-size: 25px;\">[ 가입조건설정 ]</p>\r\n");
      out.write("                <div id=\"club_condition\">\r\n");
      out.write("                  <ul>\r\n");
      out.write("                    <li>\r\n");
      out.write("                      <p>성별 : </p>\r\n");
      out.write("                      <select name=\"gender\" id=\"gender\">\r\n");
      out.write("                        <option value=\"무관\">무관</option>\r\n");
      out.write("                        <option value=\"남\">남</option>\r\n");
      out.write("                        <option value=\"여\">여</option>\r\n");
      out.write("                      </select>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                      <p>나이 : </p>\r\n");
      out.write("                      <select name=\"age\" id=\"age\">\r\n");
      out.write("                        <option id=\"age_selected\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo2.age}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" selected hidden>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo2.age}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</option>\r\n");
      out.write("                        <option value=\"0\">무관</option>\r\n");
      out.write("                        <option value=\"10\">10대</option>\r\n");
      out.write("                        <option value=\"20\">20대</option>\r\n");
      out.write("                        <option value=\"30\">30대</option>\r\n");
      out.write("                        <option value=\"40\">40대</option>\r\n");
      out.write("                        <option value=\"50\">50대</option>\r\n");
      out.write("                        <option value=\"60\">60대이상</option>\r\n");
      out.write("                      </select>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                      <p>지역 : </p>\r\n");
      out.write("                      <select name=\"location\" id=\"location\">\r\n");
      out.write("                        <option value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo2.location}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" selected hidden>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo2.location}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</option>\r\n");
      out.write("                        <option value=\"서울\">서울</option>\r\n");
      out.write("                        <option value=\"경기\">경기</option>\r\n");
      out.write("                        <option value=\"강원\">강원</option>\r\n");
      out.write("                        <option value=\"전북\">전북</option>\r\n");
      out.write("                        <option value=\"전남\">전남</option>\r\n");
      out.write("                        <option value=\"경북\">경북</option>\r\n");
      out.write("                        <option value=\"경남\">경남</option>\r\n");
      out.write("                        <option value=\"충북\">충북</option>\r\n");
      out.write("                        <option value=\"충남\">충남</option>\r\n");
      out.write("                        <option value=\"제주\">제주</option>\r\n");
      out.write("                        <option value=\"대전\">대전</option>\r\n");
      out.write("                        <option value=\"대전\">인천</option>\r\n");
      out.write("                        <option value=\"광주\">광주</option>\r\n");
      out.write("                        <option value=\"대구\">대구</option>\r\n");
      out.write("                        <option value=\"부신\">부산</option>\r\n");
      out.write("                      </select>\r\n");
      out.write("                    </li>\r\n");
      out.write("                  </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("              </form>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("      </div>\r\n");
      out.write("   </div>\r\n");
      out.write("   <script>\r\n");
      out.write("// 연령대 필터\r\n");
      out.write("	let age = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo2.age}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("	if(age == 0) {\r\n");
      out.write("		document.getElementById(\"age_selected\").innerText = \"무관\";\r\n");
      out.write("	} else if(age == 60) {\r\n");
      out.write("		document.getElementById(\"age_selected\").innerText = \"60대 이상\";\r\n");
      out.write("	}\r\n");
      out.write("   </script>\r\n");
      out.write("\r\n");
      out.write("    <!-- footer 영역  -->\r\n");
      out.write("   <div id=\"footer\">\r\n");
      out.write("      <div id=\"title_introduce\">\r\n");
      out.write("         <h3 class=\"title\">[ Project 소개 ]</h3>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div id=\"introduce_box\">\r\n");
      out.write("         <div class=\"introduce\">\r\n");
      out.write("            <h3 class=\"title\">Project Name</h3>\r\n");
      out.write("            <a id=\"project_story\">Golf Mate</a>\r\n");
      out.write("         </div>\r\n");
      out.write("         <div class=\"introduce\">\r\n");
      out.write("            <h3 class=\"title\">Team Member</h3>\r\n");
      out.write("            <a id=\"project_member\"> 이재석 </a> <a id=\"project_member\"> 이주희 </a> <a\r\n");
      out.write("               id=\"project_member\"> 최수연 </a>\r\n");
      out.write("         </div>\r\n");
      out.write("      </div>\r\n");
      out.write("   </div>\r\n");
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

  private boolean _jspx_meth_c_005fchoose_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    boolean _jspx_th_c_005fchoose_005f0_reused = false;
    try {
      _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fchoose_005f0.setParent(null);
      int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
      if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("	          ");
          if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("	          ");
          if (_jspx_meth_c_005fotherwise_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("	        ");
          int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      _jspx_th_c_005fchoose_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fchoose_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fchoose_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f0_reused = false;
    try {
      _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /CLUB/update.jsp(41,11) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${member_id == null}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
      if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("	            <a href=\"login.do\">로그인</a>\r\n");
          out.write("	            <a href=\"member_join.do\">\r\n");
          out.write("	              회원가입\r\n");
          out.write("	            </a>\r\n");
          out.write("	            <style>#account {right : 0px;} #account a {padding: 0px 10px;}</style>\r\n");
          out.write("	          ");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      _jspx_th_c_005fwhen_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fwhen_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    boolean _jspx_th_c_005fotherwise_005f0_reused = false;
    try {
      _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
      if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("	            <a href=\"mypage.do?member_id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${member_id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("	              <img src=\"CSS/icon/login.png\" alt=\"mypage\" name=\"mypage\" id=\"mypage\" title=\"마이페이지\">\r\n");
          out.write("	            </a>\r\n");
          out.write("	            <a href=\"logout.do\">\r\n");
          out.write("	              <img src=\"CSS/icon/logout.jpg\" alt=\"logout\" name=\"logout\" id=\"logout\" title=\"로그아웃\">\r\n");
          out.write("	            </a>\r\n");
          out.write("	            <br>\r\n");
          out.write("	            ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${member_id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("님 환영합니다.\r\n");
          out.write("	            <style>#account {position:absolute; text-align:right; right:0px; line-height: 20px;} #account a img {width: 25px; height: 30px; padding: 0px 13px;}</style>\r\n");
          out.write("	          ");
          int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fotherwise_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
      _jspx_th_c_005fotherwise_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fotherwise_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fotherwise_005f0_reused);
    }
    return false;
  }
}