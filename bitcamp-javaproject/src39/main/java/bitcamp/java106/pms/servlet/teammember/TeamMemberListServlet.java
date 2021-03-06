package bitcamp.java106.pms.servlet.teammember;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bitcamp.java106.pms.dao.TeamMemberDao;
import bitcamp.java106.pms.domain.Member;
import bitcamp.java106.pms.servlet.InitServlet;

@SuppressWarnings("serial")
@WebServlet("/team/member/list")
public class TeamMemberListServlet extends HttpServlet {

    TeamMemberDao teamMemberDao;
    
    @Override
    public void init() throws ServletException {
        teamMemberDao = InitServlet.getApplicationContext().getBean(TeamMemberDao.class);
    }
    
    @Override
    protected void doGet(
            HttpServletRequest request, 
            HttpServletResponse response) throws ServletException, IOException {

        // including 하기 전의 서블릿에서 문자셋을 지정할 것이고
        // 이미 getParameter()를 호출했을 것이기 때문에 다음 코드는 의미가 없다.
        //request.setCharacterEncoding("UTF-8");
        
        String name = request.getParameter("name");

        // including 하기 전의 서블릿에서 콘텐트 타입을 설정했을 것이기 때문에 다음 코드는 의미가 없다.
        //response.setContentType("text/html;charset=UTF-8");
        
        PrintWriter out = response.getWriter();
        
        try {
            List<Member> members = teamMemberDao.selectListWithEmail(name);
            
            out.println("<h2>회원 목록</h2>");
            out.println("<form action='member/add' method='post'>");
            out.println("<input type='text' name='memberId' placeholder='회원아이디'>");
            out.printf("<input type='hidden' name='teamName' value='%s'>\n", name);
            out.println("<button>추가</button>");
            out.println("</form>");
            out.println("<table border='1'>");
            out.println("<tr><th>아이디</th><th>이메일</th><th> </th></tr>");
            for (Member member : members) {
                out.printf("<tr>"
                        + "<td>%s</td>"
                        + "<td>%s</td>"
                        + "<td><a href='member/delete?teamName=%s&memberId=%s'>삭제</a></td>"
                        + "</tr>\n", 
                        member.getId(), 
                        member.getEmail(),
                        name,
                        member.getId());
            }
            out.println("</table>");
               
        } catch (Exception e) {
            RequestDispatcher 요청배달자 = request.getRequestDispatcher("/error");
            request.setAttribute("error", e);
            request.setAttribute("title", "팀 멤버 조회 실패!");
            요청배달자.forward(request, response);
        }
    }
}

//ver 39 - forward 적용
//ver 38 - redirect 적용
//ver 37 - 컨트롤러를 서블릿으로 변경
//ver 31 - JDBC API가 적용된 DAO 사용
//ver 28 - 네트워크 버전으로 변경
//ver 26 - TeamMemberController에서 add() 메서드를 추출하여 클래스로 정의.
//ver 23 - @Component 애노테이션을 붙인다.
//ver 18 - ArrayList가 적용된 TeamMemberDao를 사용한다.
//ver 17 - TeamMemberDao 클래스를 사용하여 팀 멤버의 아이디를 관리한다.
//ver 16 - 인스턴스 변수를 직접 사용하는 대신 겟터, 셋터 사용.
//ver 15 - 팀 멤버를 등록, 조회, 삭제할 수 있는 기능 추가. 
//ver 14 - TeamDao를 사용하여 팀 데이터를 관리한다.
//ver 13 - 시작일, 종료일을 문자열로 입력 받아 Date 객체로 변환하여 저장.