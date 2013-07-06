import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import javax.servlet.http.*;
import javax.servlet.*;

/**
 * Created with IntelliJ IDEA.
 * User: bhal810
 * Date: 7/4/13
 * Time: 12:11 PM
 * To change this template use File | Settings | File Templates.
 */
public class customServlet extends HttpServlet
{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<h1>Hello Servlet POST</h1>");
        out.println("</body>");
        out.println("</html>");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

        StringBuilder dump=new StringBuilder();

        try
        {
            //    List<String> requestParameterNames = Collections.list((Enumeration<String>) request.getParameterNames());

                List<String> requestParameterNames = Collections.list(request.getParameterNames());

            for ( String parameterName:requestParameterNames)
                {
                        dump.append(parameterName+":"+request.getParameter(parameterName));
                }
        }

        catch (Exception e)
        {

        }

        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<h1>HTTP Servlet GET!==> You Sent "+ dump +"</h1>");
        out.println("</body>");
        out.println("</html>");
    }


}
