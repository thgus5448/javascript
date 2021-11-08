package jdbc_semi;

import java.util.Vector;

// Dao Ŭ������ ��ӹ��� �������̽�
public interface ProductInter{
	
	public boolean insert(ProductVo vo); //������ ����
	public boolean update(ProductVo vo); //������ ����
	public boolean delete(ProductVo vo); //������ ����
	public Vector<Vector> search(String find); //������ ��ȸ
	public ProductVo select(int serial); //1���� ������ǰ ����
	public Vector<Vector> productMonth(int month); //���� ���귮
	public Vector<Vector> productParts(String parts); //��ǰ�� ���귮
}
