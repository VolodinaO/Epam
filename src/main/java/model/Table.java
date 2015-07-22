package model;

import java.io.Serializable;

/**
 * Created by ооо on 14.07.2015.
 * @author Volodina&Demianenko
 */

public class Table implements Serializable {

    private int id;
    private String data;
    private String title;
    private String text;
    private int idc;
    private int num;
    private String comm;

    public Table(){

    }

    /**
     *
     * @param title Заголовок статьи
     * @param text Текст статьи
     */

    public Table(String title, String text){
        this.title = title;
        this.text = text;
    }

    /**
     *
     * @param idc Номер статьи
     * @param num Номер комментария
     * @param comm Комментарий
     */

    public Table(int idc, int num, String comm){
        this.idc = idc;
        this.num = num;
        this.comm = comm;
    }

    /**
     *
     * @return id Номер статьи
     */

    public int getId(){
        return id;
    }

    /**
     *
     * @param id Номер статьи
     */

    public void setId(int id){
        this.id = id;
    }

    /**
     *
     * @return data Машинные число и время из БД
     */

    public String getData(){
        return data;
    }

    /**
     *
     * @param data Машинные число и время из БД
     */

    public void setData(String data){
        this.data = data;
    }

    /**
     *
     * @return title Заголовок статьи
     */

    public String getTitle(){
        return title;
    }

    /**
     *
     * @param title Заголовок статьи
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @return text Текст статьи
     */

    public String getText(){
        return text;
    }

    /**
     *
     * @param text Текст статьи
     */

    public void setText(String text) {
        this.text = text;
    }

    /**
     *
     * @param id Номер статьи
     */

    public void setIdc(int id) {
        this.idc = id;
    }

    /**
     *
     * @param num Номер комментария
     */

    public void setNum(int num) {
        this.num = num;
    }

    /**
     *
     * @return comm Комментарий статьи
     */

    public String getComm(){
        return comm;
    }

    /**
     *
     * @param comm Комментарий статьи
     */

    public void setComm(String comm) {
        this.comm = comm;
    }
}
