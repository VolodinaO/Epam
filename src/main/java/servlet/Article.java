package servlet;

/**
 * Created by Pohuh on 15.07.2015.
 */
import model.DBWorker;
import model.Table;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

@WebServlet("/Article")
public class Article extends HttpServlet {
    String id="";
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        id=request.getParameter("id");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
        response.setContentType("text/html");
        Table tables=tableA();
        if (tables != null) {
            //request.setAttribute("listResults", tables);
            request.setAttribute("getTitle", id);
            request.setAttribute("getText", tables.getText());
            RequestDispatcher dispatcher = request.getRequestDispatcher("/app/view/Article.jsp");
            dispatcher.forward(request, response);
        }
    }
    public static Table tableA() {
        DBWorker worker = new DBWorker();
        String queryA = "Select * from articles where id=this.id";
        Statement statement;
        Table tables = new Table();
        try {
            statement = worker.getConnection().createStatement();
            ResultSet resultSetA = statement.executeQuery(queryA);
                tables.setId(resultSetA.getInt(1));
                tables.setData(resultSetA.getString(2));
                tables.setTitle(resultSetA.getString(3));
                tables.setText(resultSetA.getString(4));
            } catch (SQLException e1) {
            e1.printStackTrace();
        }
        return tables;
    }
}
