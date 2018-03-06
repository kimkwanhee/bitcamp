//부동소수점의 리터럴
package step01;

import java.util.logging.LoggingMXBean;

public class Exam06_3 {

    public static void main(String[] args) {

        System.out.println(12.375f);
    }
}

//컴파일 후 Exam06_3.class 파일을
//visualstudio code의 hexdump기능을 이용하여 16진수를 확인한다.
//중간에 12.375의 2진수 값인 0x41460000을 볼 수 있다.