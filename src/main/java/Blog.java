import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.io.PrintWriter;

public class Blog extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{

        String id=request.getParameter("blog_id");
        String content = request.getParameter("blogcontent");
        PrintWriter out = response.getWriter();
       //  out.println("inside servlet");


        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet", "root", "ttn");
            PreparedStatement ps = con.prepareStatement("Insert into blog values(?,?)");
            ps.setString(1,id);
            ps.setString(2,content);
            ps.executeUpdate();

            con.close();
            out.println("Blog saved successfully...");


        }
        catch (Exception e)
        {
            out.println("Could not save the blog...Please try again.");
            response.sendRedirect("Blog.jsp");

        }
    }
}
