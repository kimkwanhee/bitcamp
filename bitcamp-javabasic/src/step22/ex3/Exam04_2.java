// 데이터 읽기 - long 값 읽기
package step22.ex3;

import java.io.FileInputStream;

public class Exam04_2 {

    public static void main(String[] args) throws Exception {
        FileInputStream in = new FileInputStream("temp/test3.data");
        
        byte[] buf = new byte[100];
        
        int count = in.read(buf);
        
        //Exam04_1을 실행 결과로 만들어진 파일을 받아라!
        //바이트 배열에 들어있는 값을 사용하여 String 인스턴스를 만든다.
        //new String(바이트 배열, 시작번호, 개수, 문자코드 표)
        //=> 예) new String(buf, 0, 10, "UTF-8");
        String str = new String(buf, 0, count);
        
        in.close();
        
        System.out.printf("%s\n", str);
    }
}