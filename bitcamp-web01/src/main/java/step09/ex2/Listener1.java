//리스너 - 이벤트 핸들러
package step09.ex2;

import java.util.Date;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.annotation.WebServlet;

//특정 작업을 수행하는 상태
//리스너 배치
//애노테이션 사용 배치
@WebListener
public class Listener1 implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        // 시작
        System.out.printf("Listener1.contextInitialized()-%s\n", new Date());
    }
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        // 종료
        System.out.printf("Listener1.contextDestroyed()-%s\n", new Date());
    }
}
