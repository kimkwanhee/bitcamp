//제네릭 -파라미터로 타입을 지정하기
package step12.ex6;

import java.util.HashMap;
import java.util.Iterator;

public class Exam04_1 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("k01", new Member("홍길동", 20));
        map.put("k02", new Member("임꺽정", 30);
        map.put("k03", new Member("유관순", 16);

        for (Object key : keys/* 배열 또는 Collection 객체 */) {
            System.out.println(map.get(key));
        }
        System.out.println("---------------------");

    }

}