package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by ооо on 16.07.2015.
 */
public class TableGet {

    public static ResultSet resultSetA;
    public static ResultSet resultSetC;

    public static void tableA() {
        DBWorker worker = new DBWorker();

        String queryA = "Select * from articles";
        Statement statement = null;

        try {
            statement = worker.getConnection().createStatement();
            ResultSet resultSetA = statement.executeQuery(queryA);

            while (resultSetA.next()) {
                Table tableArticles = new Table();
                tableArticles.setId(resultSetA.getInt(1));
                tableArticles.setData(resultSetA.getString(2));
                tableArticles.setTitle(resultSetA.getString(3));
                tableArticles.setText(resultSetA.getString(4));
                //не забыть заменить на нужное >>
                System.out.println(tableArticles.getId()); //пример вывода всех id
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void tableC() {
        DBWorker worker = new DBWorker();

        String queryC = "Select * from comments";
        Statement statement = null;

        try {
            statement = worker.getConnection().createStatement();
            ResultSet resultSetC = statement.executeQuery(queryC);

            while (resultSetC.next()) {
                Table tableComments = new Table();
                tableComments.setIdc(resultSetC.getInt(1));
                tableComments.setNum(resultSetC.getInt(2));
                tableComments.setComm(resultSetC.getString(3));
                //не забыть заменить на нужное >>
                System.out.println(tableComments.getComm()); //пример вывода всех комментов
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        //tableA();
        System.out.println("-------------------");
        //tableC();
    }
}
