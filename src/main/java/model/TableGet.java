package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Created by ооо on 16.07.2015.
 * @author Volodina&Demianenko
 */

public class TableGet {

    /**
     *
     * @return tables - Массив с данными всех статей
     */

    public static ArrayList<Table> tableA() {
        DBWorker worker = new DBWorker();

        String queryA = "Select * from articles";
        Statement statement;
        ArrayList<Table> tables = new ArrayList<Table>();

        try {
            statement = worker.getConnection().createStatement();
            ResultSet resultSetA = statement.executeQuery(queryA);

            while (resultSetA.next()) {
                Table tableArticles = new Table();
                tableArticles.setId(resultSetA.getInt(1));
                tableArticles.setData(resultSetA.getString(2));
                tableArticles.setTitle(resultSetA.getString(3));
                tableArticles.setText(resultSetA.getString(4));
                tables.add(tableArticles);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tables;
    }

    /**
     *
     * @param n номер(id) статьи, по которому берётся её содержимое
     * @return tableArticles. Статья по заданному id с её содержимым
     */

    public static Table tableA(int n) {
        DBWorker worker = new DBWorker();

        String queryA = "Select * from articles WHERE id=" + n;
        Statement statement;
        Table tableArticles = new Table();

        try {
            statement = worker.getConnection().createStatement();
            ResultSet resultSetA = statement.executeQuery(queryA);

            while (resultSetA.next()) {
                tableArticles.setId(resultSetA.getInt(1));
                tableArticles.setData(resultSetA.getString(2));
                tableArticles.setTitle(resultSetA.getString(3));
                tableArticles.setText(resultSetA.getString(4));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tableArticles;
    }

    /**
     *
     * @param n номер(id) статьи
     * @return tables. Массив всех комментариев к статье по заданному id
     */

    public static ArrayList<Table> tableC(int n) {
        DBWorker worker = new DBWorker();

        String queryC = "Select * from comments WHERE id_c =" + n;
        Statement statement;
        ArrayList<Table> tables = new ArrayList<Table>();

        try {
            statement = worker.getConnection().createStatement();
            ResultSet resultSetC = statement.executeQuery(queryC);

            while (resultSetC.next()) {
                Table tableComments = new Table();
                tableComments.setIdc(1);
                tableComments.setNum(resultSetC.getInt(2));
                tableComments.setComm(resultSetC.getString(3));
                tables.add(tableComments);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tables;
    }

}
