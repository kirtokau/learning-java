package cn.tedu.jdbc;

/**
 * ��ѯ�������е����ݣ�����ѯ������������̨
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCdemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		try {
			//ע�����ݿ�����
			Class.forName("com.mysql.jdbc.Driver");
			//��ȡ���ݿ�����
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jt_db?characterEncoding=utf-8", "root",
					"root");
			// ��ȡ������
			stat = conn.createStatement();
			// ����sql��������ִ�в����ؽ��
			String sql = "select * from account";
			rs = stat.executeQuery(sql);
			// ������
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				double money = rs.getDouble("money");
				System.out.println(id + ":" + name + ":" + money);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// �ͷ���Դ
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					rs = null;
				}
			}
			if (stat != null) {
				try {
					stat.close();
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					stat = null;
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					conn = null;
				}
			}
		}
		System.out.println("ִ����ɣ�");
	}

}
