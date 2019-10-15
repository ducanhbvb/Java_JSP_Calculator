import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet", urlPatterns = "/converter" )
public class DiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        float numberOne = Float.parseFloat(request.getParameter("numberOne"));
        float numberTwo = Float.parseFloat(request.getParameter("numberTwo"));
        String phep = request.getParameter("select_");
        Calculation calculation=new Calculation(numberOne,numberTwo,phep);
        float result=calculation.count();

        PrintWriter writer = response.getWriter();
        writer.println("<html>\n" +
                "    <head>\n" +
                "        <title>Product Discount Calculator</title>\n" +
                "        <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\" />\n" +
                "    </head>\n" +
                "    <body>\n" +

                "        <div id=\"content\">\n" +
                "            <h1>Product Discount Calculator</h1>\n" +
                "            <label>Product Description: </label>\n" +result+
                "            <span>zas</span><br/>\n" +
                "            <label>Discount Price: </label>\n" +
                "            <span>$"+"</span><br/>\n" +
                "        </div>\n" +
                "    </body>\n" +
                "</html>");
    }
}
