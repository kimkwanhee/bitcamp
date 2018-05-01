package bitcamp.java106.pms.controller.board;

import java.io.PrintWriter;

import org.springframework.stereotype.Component;

import bitcamp.java106.pms.controller.Controller;
import bitcamp.java106.pms.dao.BoardDao;
import bitcamp.java106.pms.server.ServerRequest;
import bitcamp.java106.pms.server.ServerResponse;

@Component("/board/delete")
public class BoardDeleteController implements Controller {
    BoardDao boardDao;
    
    public BoardDeleteController(BoardDao boardDao) {
        this.boardDao = boardDao;
    }
    
    @Override
    public void service(ServerRequest request, ServerResponse response) {
        PrintWriter out = response.getWriter();
        int no = Integer.parseInt(request.getParameter("no"));
        
        try {
            int count = boardDao.delete(no);
            
            if (count == 0) {
                out.println("해당 게시물이 없습니다.");
            } else {
                out.println("삭제하였습니다.");
            }
        } catch (Exception e) {
            out.println("삭제 실패!");
            e.printStackTrace(out);
        }
    }
    
}

//ver 31 - JDBC API가 적용된 DAO 사용
//ver 28 - 네트워크 버전으로 변경
//ver 26 - BoardController에서 delete() 메서드를 추출하여 클래스로 정의. 
//ver 23 - @Component 애노테이션을 붙인다. BoardDao를 받도록 생성자 변경.
//ver 22 - BoardDao 변경 사항에 맞춰 이 클래스를 변경한다.
//ver 18 - BoardDao 변경 사항에 맞춰 이 클래스를 변경한다.
//ver 16 - 인스턴스 변수를 직접 사용하는 대신 겟터, 셋터 사용.
//ver 14 - BoardDao를 사용하여 게시물 데이터를 관리한다.
//ver 13 - 게시물 등록할 때 등록일의 문자열을 Date 객체로 만들어 저장.