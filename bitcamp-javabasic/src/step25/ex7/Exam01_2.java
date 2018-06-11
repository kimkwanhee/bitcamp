// 트랜잭션 - DBMS에 SQL문 보내기 : auto
package step25.ex7;

import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Exam01_2 {

    public static void main(String[] args) throws Exception {
        Class.forName("org.mariadb.jdbc.Driver");

        java.sql.Connection con = DriverManager.getConnection(
                "jdbc:mariadb://localhost:3306/java106db",
                "java106", "1111");
        
        con.setAutoCommit(false);
        //commit을 요청하기 전에 수행한 데이터를 변경하는 모든 작업은
        //dbms 임시테이블에 저장된다.
        //따라서 연결은 끊기전에 테이블에 적용하고 싶다면,
        //반드시 commit을 요청해야 한다.

        // DriverManager가 리턴한 커넥션은 autocommit의 기본 상태가 true로 설정되어 있다.
        //auto commit?
        //insert, update, delete을 실행한 후 그 결과를 즉시 테이블에 적응하는 것.
        java.sql.PreparedStatement stmt = con.prepareStatement(
                "insert into ex_board(bno,titl,cont,rdt) values(?,?,?,now())");


        stmt.setInt(1, 111);
        stmt.setString(2, "1111");
        stmt.setString(3, "xxxx");
        stmt.executeUpdate();
        System.out.println("입력 성공");

        stmt.setInt(1, 112);
        stmt.setString(2, "1111");
        stmt.setString(3, "xxxx");
        stmt.executeUpdate();
        System.out.println("입력 성공");

        stmt.setInt(1, 113);
        stmt.setString(2, "1111");
        stmt.setString(3, "xxxx");
        stmt.executeUpdate();
        System.out.println("입력 성공");
        
        //commit을 해야만 db의 연결을 끊기 전에
        //임시 저장소에 보관된 변경 작업 결과
        //실제 테이블에 적용한다.

        con.commit();
        stmt.close();
        con.close();
    }
}