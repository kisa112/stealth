package com.example.injung.stealth.DB;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by ij kim on 2015-11-09.
 */
public class DBHelper extends SQLiteOpenHelper{

    //생성자 정의
    public DBHelper(Context context) {
        super(context, "stealthDB", null, 1);
    }

    //앱을 처음 실행했거나, 데이터를 입력할 때 테이블이 없으면 1회 호출한다.
    public void onCreate(SQLiteDatabase db) {
        //layout Table (int seq, String name)
        db.execSQL("CREATE TABLE" +
                "layout(seq INT NOT NULL auto_increment," +
                "name varchar(10)," +
                "PRIMARY KET(seq) );");

        //layout - 1x1 작성
        db.execSQL("INSERT INTO layout values('" + "1n1');");

        //setting Table (int seq, String app_name, String app_package, String app_icon, int layout_seq)
        db.execSQL("CREATE TABLE" +
                "setting(seq INT NOT NULL auto_increment," +
                "app_name varchar(30)," +
                "app_package varchar(40)," +
                "app_icon varchar(300)," +
                "layout_seq int," +
                "PRIMARY KET(seq) );");
        //실행할 SQL문을 작성
    }

    //앱이 업그레이드 되었을 경우 실행된다.
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS layout");
        db.execSQL("DROP TABLE IF EXISTS setting");
        onCreate(db);
    }
}
