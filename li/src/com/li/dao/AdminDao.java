package com.li.dao;

import java.util.List;

import com.li.bean.Admin;
import com.li.bean.Book;
import com.li.bean.ExportList;
import com.li.bean.ForbiddenList;


public interface AdminDao {
	
	/**
	 * ���ӹ���Ա
	 * @param admin
	 */
	void addAdmin(Admin admin);
	
	/**
	 * ͨ��idɾ������Ա
	 * @param adminID
	 */
	void delAdmin(String adminID);
	
	/**
	 * ���¹���Ա
	 * @param adminID
	 */
	void updateAdmin(Admin admin);
	
	/**
	 * ͨ��id�����߷������Ա
	 * @param adminID
	 * @param state  ���״̬��true��ʾ���
	 */
	void updateAdminState(String adminID,boolean state);
	
	/**
	 * ͨ��id��ѯ����Ա
	 * @param adminID
	 * @return
	 */
	Admin queryAdminByID(String adminID);
	
	/**
	 * ��ѯ���еĹ���Ա
	 * @return
	 */
	List<Admin> queryAllAdmin();
	
	/**
	 * ͨ�����״̬��ѯ����Ա
	 * @param state
	 * @return
	 */
	List<Admin> queryAdminByState(boolean state);
	
	/**
	 * ��ѯָ������Ա���ļ�¼
	 * @param adminID
	 * @return
	 */
	List<Book> queryImportBooks(String adminID);
	
	/**
	 * ��ѯָ������Ա���⣨���٣��ļ�¼
	 * @param adminID ָ������Ա��id
	 * @return
	 */
	List<ExportList> queryExportBooks(String adminID);
	
	/**
	 * ��ѯָ������Ա������û���Ϣ��
	 * @param adminID
	 * @return ForbiddenList����
	 */
	List<ForbiddenList> queryForbidReader(String adminID);
	
	/**
	 * ��ѯ���й���Ա�ĸ���
	 * @return
	 */
	int getAdminCount();
}
