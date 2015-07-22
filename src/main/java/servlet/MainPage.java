package servlet;

import model.Table;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

import static model.TableGet.tableA;

/**
 * Created by ооо on 14.07.2015.
 * @author Volodina&Demianenko
 */

@WebServlet("/Blog")
public class MainPage extends HttpServlet {

    /**
     *
     * @param request Запрос
     * @param response Ответ
     * @throws ServletException
     * @throws IOException
     */

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    /**
     *
     * @param request Запрос
     * @param response Ответ
     * @throws ServletException
     * @throws IOException
     */

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ArrayList<Table> table = tableA();
        if (table != null) {
            request.setAttribute("listResults", table);
            RequestDispatcher dispatcher = request.getRequestDispatcher("app/view/main.jsp");
            dispatcher.forward(request, response);
        }
    }
}
