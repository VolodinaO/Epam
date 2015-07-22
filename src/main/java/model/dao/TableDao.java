package model.dao;


/**
 * Created by ооо on 14.07.2015.
 * @author Volodina&Demianenko
 */

public interface TableDao {
    /**
     *
     * @param title заголовок статьи
     * @param text текст статьи
     */

    void addA(String title, String text);

    /**
     *
     * @param idc номер статьи
     * @param comment комментарий к статье
     */

    void addC(int idc, String comment);

    /**
     *
     * @param x номер статьи, по которому она удаляется
     */

    void delete(int x);

}
