// 트랜잭션 - DBMS에 SQL문 보내기 : auto
package step25.ex7;

import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Exam01_1 {

    public static void main(String[] args) throws Exception {
        Class.forName("org.mariadb.jdbc.Driver");

        java.sql.Connection con = DriverManager.getConnection(
                "jdbc:mariadb://localhost:3306/java106db",
                "java106", "1111");

        // DriverManager가 리턴한 커넥션은 autocommit의 기본 상태가 true로 설정되어 있다.
        //auto commit?
        //insert, update, delete을 실행한 후 그 결과를 즉시 테이블에 적응하는 것.
        java.sql.PreparedStatement stmt = con.prepareStatement(
                "insert into ex_board(bno,titl,cont,rdt) values(?,?,?,now())");


        stmt.setInt(1, 101);
        stmt.setString(2, "1111");
        stmt.setString(3, "xxxx");
        stmt.executeUpdate();
        System.out.println("입력 성공");

        stmt.setInt(1, 102);
        stmt.setString(2, "1111");
        stmt.setString(3, "xxxx");
        stmt.executeUpdate();
        System.out.println("입력 성공");

        stmt.setInt(1, 101);
        stmt.setString(2, "1111");
        stmt.setString(3, "xxxx");
        stmt.executeUpdate();
        System.out.println("입력 성공");

        stmt.close();
        con.close();
        System.out.println("입력 완료");
    }
}