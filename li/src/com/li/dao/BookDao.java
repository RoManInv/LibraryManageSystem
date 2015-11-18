package com.li.dao;

import java.util.Date;
import java.util.List;

import com.li.bean.Book;
import com.li.bean.BorrowList;

public interface BookDao {
	
	/**
	 * ����鼮
	 * 
	 * @param book
	 *            ��Ҫ��ӵ��鼮��
	 */
	void addBook(Book book);

	/**
	 * ɾ���鼮
	 * 
	 * @param bookID
	 *            Ҫɾ���鼮�ı��
	 * @param adminID
	 *            ִ�в�������Ա��id
	 * @param reason
	 * 			     ɾ����ԭ��
	 * @param remark
	 * 			     ��ע
	 */
	void delBook(String bookID, String adminID,String reason,String remark);

	/**
	 * �޸��鼮
	 * 
	 * @param book
	 *            ���µ��鼮��Ϣ
	 */
	void updateBook(Book book);

	/**
	 * �軹��,״ָ̬ʾ���黹�ǻ���
	 * @param bookID
	 * @param state true��ʾ�����
	 * @param userID ������ID
	 * @param backDate Ӧ�ù黹�����ڣ�����ǻ�����Ϊnull
	 */
	void updateBookState(String bookID,boolean state,String userID,Date backDate);
	
	/**
	 * ��ѯ���е��鼮������ָ����˳���ҳ��ѯ
	 * @param orderBy  ָ���������,���ΪnullĬ�ϰ���������������
	 * @param orders   ָ������Ĺ���,trueΪ����,falseΪ����
	 * @param start    ��ʼ�ļ�¼��
	 * @param length   ��ѯ�ĳ���
	 * @return
	 */
	List<Book> queryAllBooks(String orderBy,boolean orders,int start,int length);
	
	/**
	 * ͨ��������ѯ�鼮����ҳ��ѯ
	 * 
	 * @param name ����
	 * @param start ��ʼ�ļ�¼��
	 * @param length ��ѯ�ĳ���
	 * @return
	 */
	List<Book> queryBookByName(String name, int start, int length);

	/**
	 * ͨ�����Ͳ�ѯ�鼮����ҳ��ѯ
	 * @param type  �鼮������
	 * @param start  ��ʼ�ļ�¼��
	 * @param length  ��ѯ�ĳ���
	 * @return 
	 */
	List<Book> queryBookByType(String type,int start,int length);
	
	/**
	 * ͨ������ԱID��ѯ�鼮����ҳ��ѯ����ѯָ������Ա���������鼮
	 * @param adminID  ����ԱID
	 * @param start  ��ʼ�ļ�¼��
	 * @param length  ��ѯ�ĳ���
	 * @return ��ѯ���鼮�б�
	 */
	List<Book> queryBookByAdmin(String adminID,int start,int length);
	
	/**
	 * ͨ���鼮ID��ѯ�鼮
	 * 
	 * @param id
	 */
	Book queryBookByID(String id);

	/**
	 * ͨ��ISBN��ѯ�鼮
	 * @param id
	 * @return ��ѯ���鼮
	 */
	Book queryBookByISBN(String id);
	
	/**
	 * ͨ���鼮ID��ѯ������ϸ��Ϣ
	 * @param id  �鼮ID
	 * @return  ������ϸ��Ϣ����������ID������ʱ�䡢Ӧ��ʱ��
	 */
	BorrowList queryBookBorrowInfo(String id);
	
	/**
	 * ͨ��ָ���е����ƺ��е�ֵ��ѯͼ�������
	 * @param colName  ָ����������
	 * @param value  ��һ������ֵ������
	 * @return
	 */
	int getBooksCount(String colName,String value);

}
