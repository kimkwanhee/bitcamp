// Controller 규칙에 따라 메서드 작성
package bitcamp.java106.pms.controller.classroom;

import java.io.PrintWriter;
import java.sql.Date;

import bitcamp.java106.pms.annotation.Component;
import bitcamp.java106.pms.controller.Controller;
import bitcamp.java106.pms.dao.ClassroomDao;
import bitcamp.java106.pms.domain.Classroom;
import bitcamp.java106.pms.server.ServerRequest;
import bitcamp.java106.pms.server.ServerResponse;
import bitcamp.java106.pms.util.Console;

@Component("/classroom/update")
public class ClassroomUpdateController implements Controller {
    ClassroomDao classroomDao;

    public ClassroomUpdateController(ClassroomDao classroomDao) {
        this.classroomDao = classroomDao;
    }

    @Override
    public void service(ServerRequest request, ServerResponse response) {
        PrintWriter out = response.getWriter();
        Classroom updateClassroom = new Classroom();
        updateClassroom.setNo(Integer.parseInt(request.getParameter("no")));
        updateClassroom.setTitle(request.getParameter("title"));
        updateClassroom.setStartDate(new Date(System.currentTimeMillis()));
        updateClassroom.setEndDate(new Date(System.currentTimeMillis()));
        updateClassroom.setRoom("room");

        Classroom classroom = classroomDao.get(updateClassroom.getNo());

        if (classroom == null) {
            out.println("유효하지 않은 게시물 입니다.");
        } else {
            int index = classroomDao.indexOf(classroom.getNo());
            classroomDao.update(index, updateClassroom);
            System.out.println("변경하였습니다.");
        } 
    }
}


//ver 28 - 네트워크 버전으로 변경
//ver 26 - ClassroomController에서 update() 메서드를 추출하여 클래스로 정의.
//ver 23 - @Component 애노테이션을 붙인다. ClassroomDao를 받도록 생성자 변경.
//ver 22 - ClassroomDao 변경 사항에 맞춰 이 클래스를 변경한다.
//ver 20 - 클래스 추가