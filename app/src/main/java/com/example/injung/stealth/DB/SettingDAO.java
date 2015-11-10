package com.example.injung.stealth.DB;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by ij kim on 2015-11-09.
 */
public class SettingDAO {
    DBHelper dbHelper;
    SQLiteDatabase sqlDB;

    public SettingDAO(DBHelper dbHelper) {
        this.dbHelper = dbHelper;
    }

    public SettingDTO selectSetting(SettingDTO dto) {
        sqlDB = dbHelper.getReadableDatabase();
        SettingDTO resultDTO = new SettingDTO();
        Cursor cursor;
        cursor = sqlDB.rawQuery("select * from setting where layput_seq = " + "0;", null);

        while(cursor.moveToNext()) {
            resultDTO.setSeq(cursor.getInt(0));
            resultDTO.setApp_name(cursor.getString(1));
            resultDTO.setApp_package(cursor.getString(2));
            resultDTO.setApp_icon(cursor.getString(3));
            resultDTO.setLayout_seq(cursor.getInt(4));
        }

        cursor.close();
        sqlDB.close();

        return resultDTO;
    }

    public void insertSetting(SettingDTO dto) {
        sqlDB = dbHelper.getWritableDatabase();
        sqlDB.execSQL("insert into setting values( '" +
                dto.getApp_name() + "', '" +
//                1. 아이콘도 저장할 때
//                dto.getApp_package() + "', '" +
//                dto.getApp_icon() + "', " +

//                2. 아이콘은 빼고 저장할 때
                dto.getApp_package() + "', " +
                dto.getLayout_seq() + ");");
        sqlDB.close();
    }

    public void updateSetting(SettingDTO dto) {
        sqlDB = dbHelper.getWritableDatabase();
        sqlDB.execSQL("");
        sqlDB.close();
    }

    public void deleteSetting(SettingDTO dto) {
        sqlDB = dbHelper.getWritableDatabase();
        sqlDB.execSQL("");
        sqlDB.close();
    }
}
