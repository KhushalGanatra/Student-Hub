package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class about_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\" />\r\n");
      out.write("    <meta name=\"author\" content=\"Kodinger\" />\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width,initial-scale=1\" />\r\n");
      out.write("    <title>Student Hub</title>\r\n");
      out.write("    <link\r\n");
      out.write("      rel=\"stylesheet\"\r\n");
      out.write("      href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\"\r\n");
      out.write("      integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\"\r\n");
      out.write("      crossorigin=\"anonymous\"\r\n");
      out.write("    />\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/feed.css\" />\r\n");
      out.write("    <link\r\n");
      out.write("      rel=\"stylesheet\"\r\n");
      out.write("      href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css\"\r\n");
      out.write("      integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\"\r\n");
      out.write("      crossorigin=\"anonymous\"\r\n");
      out.write("    />\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("    <nav>\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        <div class=\"logo\">\r\n");
      out.write("          <a href=\"index.html\"><img src=\"img/name.png\" alt=\"logo\" /></a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"search-bar\">\r\n");
      out.write("          <i class=\"uil uil-search\"></i>\r\n");
      out.write("          <input type=\"text\" placeholder=\"Search\" />\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"create\">\r\n");
      out.write("          <label class=\"btn btn-primary\" for=\"create-post\">+ Create</label>\r\n");
      out.write("          <div class=\"profile-pic\">\r\n");
      out.write("            <img\r\n");
      out.write("              src=\"https://res.cloudinary.com/freecodez/image/upload/v1698067298/images/fy8azbqxhgdrbbijhipe.webp\"\r\n");
      out.write("              alt=\"pic 1\"\r\n");
      out.write("            />\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("    <main class=\"main\">\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        <div class=\"left\">\r\n");
      out.write("          <a class=\"profile\">\r\n");
      out.write("            <div class=\"profile-pic\">\r\n");
      out.write("              <img\r\n");
      out.write("                src=\"https://res.cloudinary.com/freecodez/image/upload/v1698067298/images/fy8azbqxhgdrbbijhipe.webp\"\r\n");
      out.write("              />\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"handle\">\r\n");
      out.write("              <h4>Student</h4>\r\n");
      out.write("              <p class=\"text-muted\">@Student</p>\r\n");
      out.write("            </div>\r\n");
      out.write("          </a>\r\n");
      out.write("          <div class=\"sidebar\">\r\n");
      out.write("            <a class=\"menu-item\">\r\n");
      out.write("              <span><i class=\"uil uil-home\"></i></span>\r\n");
      out.write("              <h3>Home</h3>\r\n");
      out.write("            </a>\r\n");
      out.write("            <a class=\"menu-item\">\r\n");
      out.write("              <span><i class=\"uil uil-bookmark\"></i></span>\r\n");
      out.write("              <h3>Profile</h3>\r\n");
      out.write("            </a>\r\n");
      out.write("            <a class=\"menu-item active\">\r\n");
      out.write("              <span><i class=\"uil uil-analytics\"></i></span>\r\n");
      out.write("              <h3>About</h3>\r\n");
      out.write("            </a>\r\n");
      out.write("            <a class=\"menu-item\">\r\n");
      out.write("              <span><i class=\"uil uil-palette\"></i></span>\r\n");
      out.write("              <h3>Feedback</h3>\r\n");
      out.write("            </a>\r\n");
      out.write("            <label class=\"btn btn-primary\" for=\"create-post\">Create Post</label>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"middle\">\r\n");
      out.write("          <div class=\"feeds\">\r\n");
      out.write("            <div class=\"feed\">\r\n");
      out.write("              <div class=\"user\">\r\n");
      out.write("                <div class=\"info\">\r\n");
      out.write("                  <h1>Feedback</h1>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"about\">\r\n");
      out.write("                <h2 class=\"about__title\">Student Hub - TM102</h2>\r\n");
      out.write("                <p class=\"about__details\">We are a team driven by the spirit of learning and innovation. \r\n");
      out.write("                    Our journey is centered around the idea that every project is an opportunity to grow, learn, and inspire. \r\n");
      out.write("                    We embrace challenges as learning experiences and draw inspiration from each endeavor.\r\n");
      out.write("                    We are passionate about the possibilities that emerge from pushing boundaries and believe that every project contributes to our collective growth. \r\n");
      out.write("                    Join us in this dynamic journey of discovery and inspiration!\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>Vraj Lathiya, Tushar Jana, Kishan Ginoya, Khushal Ganatra.</p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </main>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
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
