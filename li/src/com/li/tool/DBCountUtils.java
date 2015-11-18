package com.li.tool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

/**
 * ������ݿ����ض���¼������
 * @author li
 *
 */
public class DBCountUtils {
	private Connection conn;
	private DataSource ds;
	private DBCountUtils(){
	}
	/**
	 * ���췽����Ҫһ������Դ
	 * @param ds
	 */
	public DBCountUtils(DataSource ds) {
		super();
		this.ds = ds;
		try {
			conn=ds.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	/**
	 * ���ָ������ĳ���ֶε�ֵ�ĸ���
	 * @param tableNames  ����
	 * @param colmun  ����
	 * @param value   ֵ
	 * @return
	 */
	public int getCount(String tableNames, String column,String value){
		String sql="select count(*) from "+tableNames+" c where c."+column+"=?";
		int n=0;
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, value);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				n=rs.getInt(1);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return n;
	}
	
}
