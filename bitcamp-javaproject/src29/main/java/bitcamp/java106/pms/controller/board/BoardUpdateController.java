package bitcamp.java106.pms.controller.board;

import java.io.PrintWriter;
import java.sql.Date;

import bitcamp.java106.pms.annotation.Component;
import bitcamp.java106.pms.controller.Controller;
import bitcamp.java106.pms.dao.BoardDao;
import bitcamp.java106.pms.domain.Board;
import bitcamp.java106.pms.server.ServerRequest;
import bitcamp.java106.pms.server.ServerResponse;

@Component("/board/update")
public class BoardUpdateController implements Controller {
    BoardDao boardDao;
    
    public BoardUpdateController(BoardDao boardDao) {
        this.boardDao = boardDao;
    }
    
    @Override
    public void service(ServerRequest request, ServerResponse response) {
        PrintWriter out = response.getWriter();
        
        Board updateBoard = new Board();
        updateBoard.setNo(Integer.parseInt(request.getParameter("no")));
        updateBoard.setTitle(request.getParameter("title"));
        updateBoard.setContent(request.getParameter("content"));
        updateBoard.setCreatedDate(new Date(System.currentTimeMillis()));
        
        Board board = boardDao.get(updateBoard.getNo());
        
        if (board == null) {
            out.println("유효하지 않은 게시물 번호입니다.");
        } else {
            int index = boardDao.indexOf(updateBoard.getNo());
            boardDao.update(index, updateBoard);
            out.println("변경하였습니다.");
        }
    }
}

//ver 28 - 네트워크 버전으로 변경
//ver 26 - BoardController에서 update() 메서드를 추출하여 클래스로 정의.
//ver 23 - @Component 애노테이션을 붙인다. BoardDao를 받도록 생성자 변경.
//ver 22 - BoardDao 변경 사항에 맞춰 이 클래스를 변경한다.
//ver 18 - BoardDao 변경 사항에 맞춰 이 클래스를 변경한다.
//ver 16 - 인스턴스 변수를 직접 사용하는 대신 겟터, 셋터 사용.
//ver 14 - BoardDao를 사용하여 게시물 데이터를 관리한다.
//ver 13 - 게시물 등록할 때 등록일의 문자열을 Date 객체로 만들어 저장.
