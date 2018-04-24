package bitcamp.java106.pms.dao;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import bitcamp.java106.pms.annotation.Component;
import bitcamp.java106.pms.domain.Task;
import bitcamp.java106.pms.domain.Task;

@Component
public class TaskDao {
    public int delete(int no) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        try (
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/java106db?serverTimezone=UTC&useSSL=false",
                "java106", "1111");
            PreparedStatement stmt = con.prepareStatement(
                "delete from pms_task where tano=?");) {
            
            stmt.setInt(1, no);
            return stmt.executeUpdate();
        } 
    }
    
    public List<Task> selectList() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        try (
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/java106db?serverTimezone=UTC&useSSL=false",
                "java106", "1111");
            PreparedStatement stmt = con.prepareStatement(
                "select bno,titl,cdt from pms_task");
            ResultSet rs = stmt.executeQuery();) {
            
            ArrayList<Task> arr = new ArrayList<>();
            while (rs.next()) {
                Task task = new Task();
                task.setNo(rs.getInt("tano"));
                task.setTitle(rs.getString("titl"));
                task.setStartDate(rs.getDate("sdt"));
                task.setEndDate(rs.getDate("edt"));
                task.setState(rs.getInt("stat"));
                task.setWorker(rs.getString("mid"));
                task.setTeam(rs.getString("tnm"));
                
                arr.add(task);
            }
            return arr;
        }
    }

    public int insert(Task task) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        try (
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/java106db?serverTimezone=UTC&useSSL=false",
                "java106", "1111");
            PreparedStatement stmt = con.prepareStatement(
                "insert into pms_task(titl,cont,cdt) values(?,?,now())");) {
            
            stmt.setString(1, task.getTitle());
            stmt.setDate(2, task.getStartDate());
            
            stmt.setInt(7, task.getNo());
        
            return stmt.executeUpdate();
        }
    }

    public int update(Task task) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        try (
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/java106db?serverTimezone=UTC&useSSL=false",
                "java106", "1111");
            PreparedStatement stmt = con.prepareStatement(
                "update pms_task set titl=?, cont=?, cdt=now() where bno=?");) {
            
            stmt.setString(1, task.getTitle());
            stmt.setString(2, task.getContent());
            stmt.setInt(3, task.getNo());
            return stmt.executeUpdate();
        }
    }

    public Task selectOne(int no) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        try (
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/java106db?serverTimezone=UTC&useSSL=false",
                "java106", "1111");
            PreparedStatement stmt = con.prepareStatement(
                "select bno,titl,cont,cdt from pms_task where bno=?");) {
            
            stmt.setInt(1, no);
            
            try (ResultSet rs = stmt.executeQuery();) {
                if (!rs.next()) 
                    return null;
                
                Task task = new Task();
                task.setNo(rs.getInt("tano"));
                task.setTitle(rs.getString("titl"));
                task.setStartDate(rs.getDate("sdt"));
                task.setEndDate(rs.getDate("edt"));
                task.setState(rs.getInt("stat"));
                task.setWorker(rs.getString("mid"));
                task.setTeam(rs.getString("tnm"));
                return task;
            }
        }  
    }
}
//ver 24 - File I/O 적용
//ver 23 - @Component 애노테이션을 붙인다.
//ver 22 - 추상 클래스 AbstractDao를 상속 받는다.
//ver 19 - 우리 만든 ArrayList 대신 java.util.LinkedList를 사용하여 목록을 다룬다. 
//ver 18 - ArrayList 클래스를 적용하여 객체(의 주소) 목록을 관리한다.
// ver 17 - 클래스 생성





