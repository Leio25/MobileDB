package com.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;


public class DataHelper extends SQLiteOpenHelper{

	private static final String DATABASE_NAME ="mahasiswa.db";
	private static final int DATABASE_VERSION = 1;
	
	public DataHelper(Context context){
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}
	
	
	public void onCreate(SQLiteDatabase db) {
		
		String sql ="CREATE TABLE mahasiswa(nirm integer primary key,"
				+"nama text null, tgl text null, jk text null, jurusan text null);";
		Log.d("Data", "onCreate:" + sql);
		db.execSQL(sql);
		
		sql ="INSERT INTO mahasiswa (nirm, nama, tgl, jk,  jurusan) VALUES ('001', "
				+ "'Abdullah', '1999-03-12', 'Laki-Laki', 'Sistem informasi');";
		
		db.execSQL(sql);
		sql ="INSERT INTO mahasiswa (nirm, nama, tgl, jk,  jurusan) VALUES ('002', "
				+ "'Dewi', '1999-01-30', 'Perempuan', 'Sistem informasi');";
		
		db.execSQL(sql);
		sql ="INSERT INTO mahasiswa (nirm, nama, tgl, jk,  jurusan) VALUES ('003', "
				+ "'Fikri', '2000-03-12', 'Laki-Laki', 'Sistem informasi');";
		db.execSQL(sql);
	}
	
	public void onOpgrade(SQLiteDatabase db, int arg1, int arg2) {
		
	}
	
}
