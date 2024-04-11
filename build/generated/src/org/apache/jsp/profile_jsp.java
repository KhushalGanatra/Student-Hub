package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;
import Code.MyConnection;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <meta name=\"author\" content=\"Kodinger\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width,initial-scale=1\" />\n");
      out.write("        <title>Student Hub</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\"\n");
      out.write("              integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\"\n");
      out.write("              crossorigin=\"anonymous\" />\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/feed.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css\"\n");
      out.write("              integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\"\n");
      out.write("              crossorigin=\"anonymous\" />\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            body {\n");
      out.write("                margin-top: 20px;\n");
      out.write("                color: #1a202c;\n");
      out.write("                text-align: left;\n");
      out.write("                background-color: #e2e8f0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .main-body {\n");
      out.write("                padding: 15px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .center {\n");
      out.write("                margin-left: 300px\n");
      out.write("            }\n");
      out.write("            .card {\n");
      out.write("                box-shadow: 0 1px 3px 0 rgba(0, 0, 0, .1), 0 1px 2px 0 rgba(0, 0, 0, .06);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .card {\n");
      out.write("                position: relative;\n");
      out.write("                display: flex;\n");
      out.write("                flex-direction: column;\n");
      out.write("                min-width: 0;\n");
      out.write("                word-wrap: break-word;\n");
      out.write("                background-color: #fff;\n");
      out.write("                background-clip: border-box;\n");
      out.write("                border: 0 solid rgba(0, 0, 0, .125);\n");
      out.write("                border-radius: .25rem;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .card-body {\n");
      out.write("                flex: 1 1 auto;\n");
      out.write("                min-height: 1px;\n");
      out.write("                padding: 1rem;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .gutters-sm {\n");
      out.write("                margin-right: -8px;\n");
      out.write("                margin-left: -8px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .gutters-sm>.col,\n");
      out.write("            .gutters-sm>[class*=col-] {\n");
      out.write("                padding-right: 8px;\n");
      out.write("                padding-left: 8px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .mb-3,\n");
      out.write("            .my-3 {\n");
      out.write("                margin-bottom: 1rem !important;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .bg-gray-300 {\n");
      out.write("                background-color: #e2e8f0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .h-100 {\n");
      out.write("                height: 100% !important;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .shadow-none {\n");
      out.write("                box-shadow: none !important;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        ");
 // Define variables to store user data 
            String username = null;
            String email = null;
            String gender = null;
            String mobileNo = null;
            String bio = null;
            String enrolmentNo = null;
            String department = null;
            String semester = null;
            String profilePicturePath = null;
            Connection con = null;
            PreparedStatement stmt = null;
            ResultSet rs = null;
            try {
                // Establish database 
                con = MyConnection.getConnection();
                stmt = con.prepareStatement("SELECT * FROM users WHERE username=?");
                stmt.setString(1,
                        session.getAttribute("username").toString());
                rs = stmt.executeQuery();
                if (rs.next()) {
                    username = rs.getString("username");
                    email = rs.getString("email");
                    gender = rs.getString("gender");
                    mobileNo = rs.getString("mobile_no");
                    bio = rs.getString("bio");
                    enrolmentNo = rs.getString("enrolment_no");
                    department = rs.getString("department");
                    semester = rs.getString("semester");
                    profilePicturePath = rs.getString("profile_picture");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally { // Close database resources 
                try {
                    if (rs != null) {
                        rs.close();
                    }
                    if (stmt != null) {
                        stmt.close();
                      }
                      if (con != null) {
                          con.close();
                      }
                  } catch (SQLException e) {
                      e.printStackTrace();
                  }
              }
      out.write("\n");
      out.write("        <nav>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"logo\">\n");
      out.write("                    <a href=\"index.jsp\"><img src=\"img/name.png\" alt=\"logo\" /></a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"search-bar\">\n");
      out.write("                    <i class=\"uil uil-search\"></i>\n");
      out.write("                    <input type=\"text\" placeholder=\"Search\" />\n");
      out.write("                </div>\n");
      out.write("                <div class=\"create\">\n");
      out.write("                    <label class=\"btn btn-primary\" for=\"create-post\">+ Create</label>\n");
      out.write("                    <div class=\"profile-pic\">\n");
      out.write("                        <img\n");
      out.write("                            src=\"https://res.cloudinary.com/freecodez/image/upload/v1698067298/images/fy8azbqxhgdrbbijhipe.webp\"\n");
      out.write("                            alt=\"pic 1\" />\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <main class=\"main\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"left\">\n");
      out.write("                    <a class=\"profile\">\n");
      out.write("                        <div class=\"profile-pic\">\n");
      out.write("                            <img\n");
      out.write("                                src=\"https://res.cloudinary.com/freecodez/image/upload/v1698067298/images/fy8azbqxhgdrbbijhipe.webp\" />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"handle\">\n");
      out.write("                            <h4>Student</h4>\n");
      out.write("                            <p class=\"text-muted\">@Student</p>\n");
      out.write("                        </div>\n");
      out.write("                    </a>\n");
      out.write("                    <div class=\"sidebar\">\n");
      out.write("                        <a class=\"menu-item\">\n");
      out.write("                            <span><i class=\"uil uil-home\"></i></span>\n");
      out.write("                            <h3>Home</h3>\n");
      out.write("                        </a>\n");
      out.write("                        <a class=\"menu-item active\">\n");
      out.write("                            <span><i class=\"uil uil-bookmark\"></i></span>\n");
      out.write("                            <h3>Profile</h3>\n");
      out.write("                        </a>\n");
      out.write("                        <a class=\"menu-item\">\n");
      out.write("                            <span><i class=\"uil uil-analytics\"></i></span>\n");
      out.write("                            <h3>About</h3>\n");
      out.write("                        </a>\n");
      out.write("                        <a class=\"menu-item\">\n");
      out.write("                            <span><i class=\"uil uil-palette\"></i></span>\n");
      out.write("                            <h3>Feedback</h3>\n");
      out.write("                        </a>\n");
      out.write("                        <label class=\"btn btn-primary\" for=\"create-post\">Create Post</label>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"middle\">\n");
      out.write("                    <div class=\"feeds\">\n");
      out.write("                        <div class=\"feed\">\n");
      out.write("                            <div class=\"user\">\n");
      out.write("                                <div class=\"info\">\n");
      out.write("                                    <h1>Profile</h1>\n");
      out.write("                                    <div class=\"container\">\n");
      out.write("                                        <div class=\"main-body\">\n");
      out.write("                                            <nav aria-label=\"breadcrumb\" class=\"main-breadcrumb\">\n");
      out.write("                                                <ol class=\"breadcrumb\">\n");
      out.write("                                                    <li class=\"breadcrumb-item\"><a href=\"index.html\">Home</a></li>\n");
      out.write("                                                    <li class=\"breadcrumb-item\"><a href=\"javascript:void(0)\">User</a></li>\n");
      out.write("                                                    <li class=\"breadcrumb-item active\" aria-current=\"page\">User Profile</li>\n");
      out.write("                                                </ol>\n");
      out.write("                                            </nav>\n");
      out.write("\n");
      out.write("                                            <div class=\"row gutters-sm\">\n");
      out.write("                                                <div class=\"col-md-4 mb-3\">\n");
      out.write("                                                    <div class=\"center\">\n");
      out.write("                                                        <div class=\"card\">\n");
      out.write("                                                            <div class=\"card-body\">\n");
      out.write("                                                                <div class=\"d-flex flex-column align-items-center text-center\">\n");
      out.write("                                                                    <img src=\"");
      out.print( profilePicturePath);
      out.write("\" alt=\"Admin\" class=\"rounded-circle\" width=\"150\">\n");
      out.write("                                                                    <div class=\"mt-3\">\n");
      out.write("                                                                        <h4>");
      out.print( username);
      out.write("</h4>\n");
      out.write("                                                                        <p class=\"text-secondary mb-1\">");
      out.print( bio);
      out.write("</p>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"col-md-12\">\n");
      out.write("                                                    <div class=\"card mb-3\">\n");
      out.write("                                                        <div class=\"card-body\">\n");
      out.write("                                                            <div class=\"row\">\n");
      out.write("                                                                <div class=\"col-sm-3\">\n");
      out.write("                                                                    <h6 class=\"mb-0\">Full Name</h6>\n");
      out.write("                                                                </div>\n");
      out.write("                                                                <div class=\"col-sm-9 text-secondary\">\n");
      out.write("                                                                    </label>\n");
      out.write("                                                                    ");
      out.print( username);
      out.write("\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </div>\n");
      out.write("                                                            <hr>\n");
      out.write("                                                            <div class=\"row\">\n");
      out.write("                                                                <div class=\"col-sm-3\">\n");
      out.write("                                                                    <h6 class=\"mb-0\">Email</h6>\n");
      out.write("                                                                </div>\n");
      out.write("                                                                <div class=\"col-sm-9 text-secondary\">\n");
      out.write("                                                                    <a href=\"/cdn-cgi/l/email-protection\" class=\"__cf_email__\"\n");
      out.write("                                                                       data-cfemail=\"06606f76466c736d6b736e28676a\">\n");
      out.write("                                                                        ");
      out.print( email);
      out.write("\n");
      out.write("                                                                    </a>\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </div>\n");
      out.write("                                                            <hr>\n");
      out.write("                                                            <div class=\"row\">\n");
      out.write("                                                                <div class=\"col-sm-3\">\n");
      out.write("                                                                    <h6 class=\"mb-0\">Phone</h6>\n");
      out.write("                                                                </div>\n");
      out.write("                                                                <div class=\"col-sm-9 text-secondary\">\n");
      out.write("                                                                    ");
      out.print( mobileNo);
      out.write("\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </div>\n");
      out.write("                                                            <hr>\n");
      out.write("                                                            <div class=\"row\">\n");
      out.write("                                                                <div class=\"col-sm-3\">\n");
      out.write("                                                                    <h6 class=\"mb-0\">Gender</h6>\n");
      out.write("                                                                </div>\n");
      out.write("                                                                <div class=\"col-sm-9 text-secondary\">\n");
      out.write("                                                                    ");
      out.print( gender);
      out.write("\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </div>\n");
      out.write("                                                            <hr>\n");
      out.write("                                                            <div class=\"row\">\n");
      out.write("                                                                <div class=\"col-sm-3\">\n");
      out.write("                                                                    <h6 class=\"mb-0\">BIO</h6>\n");
      out.write("                                                                </div>\n");
      out.write("                                                                <div class=\"col-sm-9 text-secondary\">\n");
      out.write("                                                                    ");
      out.print( bio);
      out.write("\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </div>\n");
      out.write("                                                            <hr>\n");
      out.write("                                                            <div class=\"row\">\n");
      out.write("                                                                <div class=\"col-sm-3\">\n");
      out.write("                                                                    <h6 class=\"mb-0\">Enrollment no.</h6>\n");
      out.write("                                                                </div>\n");
      out.write("                                                                <div class=\"col-sm-9 text-secondary\">\n");
      out.write("                                                                    ");
      out.print( enrolmentNo);
      out.write("\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </div>\n");
      out.write("                                                            <hr>\n");
      out.write("                                                            <div class=\"row\">\n");
      out.write("                                                                <div class=\"col-sm-3\">\n");
      out.write("                                                                    <h6 class=\"mb-0\">Department</h6>\n");
      out.write("                                                                </div>\n");
      out.write("                                                                <div class=\"col-sm-9 text-secondary\">\n");
      out.write("                                                                    ");
      out.print( department);
      out.write("\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </div>\n");
      out.write("                                                            <hr>\n");
      out.write("                                                            <div class=\"row\">\n");
      out.write("                                                                <div class=\"col-sm-3\">\n");
      out.write("                                                                    <h6 class=\"mb-0\">Semester</h6>\n");
      out.write("                                                                </div>\n");
      out.write("                                                                <div class=\"col-sm-9 text-secondary\">\n");
      out.write("                                                                    ");
      out.print( semester);
      out.write("\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </div>\n");
      out.write("                                                        <div class=\"row gutters-sm\">\n");
      out.write("                                                            <div class=\"col-sm-6 mb-3\">\n");
      out.write("\n");
      out.write("                                                            </div>\n");
      out.write("                                                            <div class=\"col-sm-6 mb-3\">\n");
      out.write("                                                                <div class=\"card h-100\">\n");
      out.write("\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <script data-cfasync=\"false\"\n");
      out.write("                                        src=\"/cdn-cgi/scripts/5c5dd728/cloudflare-static/email-decode.min.js\"></script>\n");
      out.write("                                        <script src=\"https://code.jquery.com/jquery-1.10.2.min.js\"></script>\n");
      out.write("                                        <script\n");
      out.write("                                        src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("                                        <script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("                                        </script>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    </main>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                </body>\n");
      out.write("\n");
      out.write("                </html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
