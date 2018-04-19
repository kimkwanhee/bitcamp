package bitcamp.java106.pms.controller.board;

import java.io.PrintWriter;
import java.sql.Date;

import bitcamp.java106.pms.annotation.Component;
import bitcamp.java106.pms.controller.Controller;
import bitcamp.java106.pms.dao.BoardDao;
import bitcamp.java106.pms.domain.Board;
import bitcamp.java106.pms.server.ServerRequest;
import bitcamp.java106.pms.server.ServerResponse;

@Component("/board/add")
public class BoardAddController implements Controller {
    BoardDao boardDao;
    
    public BoardAddController(BoardDao boardDao) {
        this.boardDao = boardDao;
    }
     
    public void service(ServerRequest request, ServerResponse response) {
        Board board = new Board();
        board.setTitle(request.getParameter("title"));
        board.setContent(request.getParameter("content"));
        board.setCreatedDate(new Date(System.currentTimeMillis()));
         /*스레드 테스트 용 코드 
        for (int i = 0; i < 300000000; i++) {
            Math.asin(34.8); 
        } */
        
        boardDao.insert(board);
        
        PrintWriter out = response.getWriter();
        out.println("등록 성공!");
    }

}


//ver 28 - 네트워크 버전으로 변경
//ver 26 - BoardController에서 add() 메서드를 추출하여 클래스로 정의.
//ver 23 - @Component 애노테이션을 붙인다. BoardDao를 받도록 생성자 변경.
//ver 22 - BoardDao 변경 사항에 맞춰 이 클래스를 변경한다.
//ver 18 - BoardDao 변경 사항에 맞춰 이 클래스를 변경한다.
//ver 16 - 인스턴스 변수를 직접 사용하는 대신 겟터, 셋터 사용.
//ver 14 - BoardDao를 사용하여 게시물 데이터를 관리한다.
//ver 13 - 게시물 등록할 때 등록일의 문자열을 Date 객체로 만들어 저장.
