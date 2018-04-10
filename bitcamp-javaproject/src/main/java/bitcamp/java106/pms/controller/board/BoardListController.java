package bitcamp.java106.pms.controller.board;

import java.util.Iterator;
import java.util.Scanner;

import bitcamp.java106.pms.annotation.Component;
import bitcamp.java106.pms.controller.Controller;
import bitcamp.java106.pms.dao.BoardDao;
import bitcamp.java106.pms.domain.Board;

@Component("board/list")
public class BoardListController implements Controller {
    Scanner keyScan;
    BoardDao boardDao;
    
    public BoardListController(Scanner scanner, BoardDao boardDao) {
        this.keyScan = scanner;
        this.boardDao = boardDao;
    }
    
    public void service(String menu, String option) {
        System.out.println("[게시물 목록]");
        Iterator<Board> iterator = boardDao.list();
        while (iterator.hasNext()) {
            Board board = iterator.next();
            System.out.printf("%d, %s, %s\n",
                board.getNo(), board.getTitle(), board.getCreatedDate());
        }
    }
}

//ver 26 - BoardController에서 list() 메서드를 추출하여 클래스로 정의. 
//ver 23 - @Component 애노테이션을 붙인다. BoardDao를 받도록 생성자 변경.
//ver 22 - BoardDao 변경 사항에 맞춰 이 클래스를 변경한다.
//ver 18 - BoardDao 변경 사항에 맞춰 이 클래스를 변경한다.
//ver 16 - 인스턴스 변수를 직접 사용하는 대신 겟터, 셋터 사용.
//ver 14 - BoardDao를 사용하여 게시물 데이터를 관리한다.
//ver 13 - 게시물 등록할 때 등록일의 문자열을 Date 객체로 만들어 저장.

