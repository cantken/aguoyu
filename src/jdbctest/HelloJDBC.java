package jdbctest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class HelloJDBC {
	public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String URL = "jdbc:mysql://localhost:3306/jdbcsample?serverTimezone=Asia/Taipei";
	public static final String USER = "root";
	public static final String PASSWORD = "24708053";

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		Statement stmt = null;
		ResultSet rs = null;

		Scanner sc = new Scanner(System.in);
		System.out.println("要新增的編號");
		int deptno = sc.nextInt();
		System.out.println("要新增的名稱");
		String dname = sc.next();
		System.out.println("要新增的所在地");
		String loc = sc.next();

		sc.close();

		try {
			// STEP 1 : 載入驅動
			Class.forName(DRIVER);
			System.out.println("載入成功");

			// STEP 2 : 建立連線
			con = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("連線成功");

			// STEP 3 : 送出SQL指令
			pstmt = con.prepareStatement("insert into department values (?, ?, ? )");
			// (1, deptno)裡的1對應到第一個(?,)
			pstmt.setInt(1, deptno);
			pstmt.setString(2, dname);
			pstmt.setString(3, loc);

			pstmt.executeUpdate();

//			stmt = con.createStatement();
//			int count = stmt.executeUpdate("insert into department values('50', '人事部', '南京復興')");
//			System.out.println(count + "row(s) updated.");

//			rs = stmt.executeQuery("select * from department order by deptno desc");
//			//游標移動取道裡面資料
//			while(rs.next()) {
//				int deptno = rs.getInt("deptno");
//				String dname = rs.getString("dname");
//				String loc = rs.getString("loc");
//				
//				System.out.println("DEPTNO = " + deptno);
//				System.out.println("DNAME = " + dname);
//				System.out.println("LOC = " + loc);
//				System.out.println("==========");
//			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException se) {
			se.printStackTrace();
		} finally {

			if (rs != null) {

				try {
					rs.close();
				} catch (SQLException se) {
					se.printStackTrace();
				}
			}
			if (pstmt != null) {

				try {
					pstmt.close();
				} catch (SQLException se) {
					se.printStackTrace();
				}
			}

			if (stmt != null) {

				try {
					stmt.close();
				} catch (SQLException se) {
					se.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException se) {
					se.printStackTrace();
				}
			}
		}
	}

}
