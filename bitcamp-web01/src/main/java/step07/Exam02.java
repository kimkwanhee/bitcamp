package step07;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet(
        value="/step07/exam02",
        loadOnStartup=1
        )
public class Exam02 extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    
    public Exam02() {
        System.out.println("step07.Exam01() 호출!");
    }
    
    @Override
    public void init() throws ServletException {
        //서블릿이 작업하는데 필요한 자원을 준비시킴
        super.init();
    }
     
    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        System.out.println("step07.Exam01.servlet호출");
       response.setContentType("textplain;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("Hello");
    }

}
