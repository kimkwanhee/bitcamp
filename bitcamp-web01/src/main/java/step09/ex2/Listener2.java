//리스너 - 이벤트 핸들러
package step09.ex2;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;

//특정 작업을 수행하는 상태
//리스너 배치
//애노테이션 사용 배치
@WebListener
public class Listener2 implements ServletRequestListener {
   @Override
public void requestInitialized(ServletRequestEvent sre) {
    HttpServletRequest request = (HttpServletRequest)sre.getServletRequest();
    System.out.printf("Listener2.requestInitialized()");
    System.out.printf("[%s]: %s\n",
            request.getRemoteAddr(),
            request.getServletPath());
    /*System.out.printf("Client IP: %s\n", sre.getServletRequest());*/
}
   @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        // TODO Auto-generated method stub
       System.out.printf("Listener2.requestDestrpyed()");
    }
}
