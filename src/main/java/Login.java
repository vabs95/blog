import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class Login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // reading the user input
        String username = request.getParameter("uname");
        String password = request.getParameter("pwd");

        if((username.equals("vaibhav"))&& (password.equals("password")))
        {
            HttpSession session= request.getSession();
            session.setAttribute("username","username");

            response.sendRedirect("Welcome.jsp");
        }
        else
            response.sendRedirect("Login.html");
    }
}
