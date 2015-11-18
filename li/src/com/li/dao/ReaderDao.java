package com.li.dao;

import java.util.List;

import com.li.bean.Book;
import com.li.bean.BorrowList;
import com.li.bean.ForbiddenList;
import com.li.bean.Reader;

public interface ReaderDao {
	
	/**
	 * �����û�
	 * @param reader
	 */
	void addReader(Reader reader);
	
	/**
	 * ɾ���û�
	 * @param reader
	 */
	void delReader(String stuID);
	
	/**
	 * �����û���Ϣ
	 * @param reader
	 */
	void updateReader(Reader reader);
	
	/**
	 * ������߽�����
	 * @param stuID ����ID  
	 * @param state ״̬��true��ʾ���
	 */
	void updateReaderState(String stuID,boolean state,String adminID);
	
	/**
	 * ͨ��stuID��ѯ������Ϣ
	 * @param stuID
	 * @return
	 */
	Reader queryReaderByID(String stuID);
	
	/**
	 * ͨ��stuID��ѯ�����ڽ���鼮��Ϣ
	 * @param stuID
	 * @return
	 */
	List<BorrowList> queryReaderBorrows(String stuID);
	
	/**
	 * ��ѯ���е��û�����ҳ��ѯ 
	 * @param orderBy ָ���������,���ΪnullĬ�ϰ���ѧ����������
	 * @param orders ָ������Ĺ���,trueΪ����,falseΪ����
	 * @param start ��ʼ�ļ�¼��
	 * @param length ��ѯ�ĳ���
	 * @return
	 */
	List<Reader> queryAllReaders(String orderBy,boolean orders,int start,int length);
	
	/**
	 * ��ѯǷ�ѵ��û�����ҳ��ѯ
	 * @param start ��ʼ�ļ�¼��
	 * @param length ��ѯ�ĳ���
	 * @return
	 */
	List<Reader> queryReadersArge(int start,int length);
	
	/**
	 * ��ѯ�û����������Ϣ
	 * @param stuID
	 * @return  ���Ϊ�ձ�ʾΪδ���
	 */
	ForbiddenList queryReaderForbidInfo(String stuID);
	
	/**
	 * ��ȡ���ߵ�����
	 * @return
	 */
	int getReadersCount();
	
}
