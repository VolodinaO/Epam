package model.dao.impl;

import model.DBWorker;
import model.dao.TableDao;

import java.sql.*;

/**
 * Created by ооо on 14.07.2015.
 * @author Volodina&Demianenko
 */

public class TableDaoImpl implements TableDao{

    /**
     *
     * @param title Заголовок статьи
     * @param text Текст статьи
     */

    @Override
    public void addA(String title, String text) {
        DBWorker worker = new DBWorker();
        String INSERT_NEW_A = "INSERT INTO articles (title, text) VALUES(?,?)";
        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = worker.getConnection().prepareStatement(INSERT_NEW_A);
            preparedStatement.setString(1, title);
            preparedStatement.setString(2, text);
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * @param idc Номер статьи
     * @param comment Комментарий к ней
     */

    @Override
    public void addC(int idc, String comment) {

        DBWorker worker = new DBWorker();
        String INSERT_NEW_C = "INSERT INTO comments (id_c, comm) VALUES(?,?)";
        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = worker.getConnection().prepareStatement(INSERT_NEW_C);
            preparedStatement.setInt(1, idc);
            preparedStatement.setString(2, comment);
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * @param x id статьи, по которому она удаляется
     */

    @Override
    public void delete(int x) {

        DBWorker worker = new DBWorker();
        String DELETE = "DELETE FROM articles WHERE id=?";
        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = worker.getConnection().prepareStatement(DELETE);
            preparedStatement.setInt(1,x);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
