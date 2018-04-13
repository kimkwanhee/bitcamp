// Controller 규칙에 따라 메서드 작성
package bitcamp.java106.pms.controller;

import java.util.Scanner;

import bitcamp.java106.pms.annotation.Component;

@Component("calc")
public class CalcController implements Controller {
    Scanner keyScan; //키보드 입력

    public CalcController(Scanner scanner) {
        this.keyScan = scanner;
    }

    public void service(String menu, String option) {
        System.out.print("식을 입력하세요? "); //출력문
        String[] arr = keyScan.nextLine().split(" ");
        if (arr.length != 3) { //문자열 개수 제한
            System.out.printf("입력 형식 예) 3 + 2");
            return; //오류시 값을 되돌림
        }

        int a = Integer.parseInt(arr[0]); //키보드 입력값 저장
        int b = Integer.parseInt(arr[2]);
        String op = arr[1]; //두번째 배열에 저장
        int result = 0; //산술연산제 값을 정하지 않음

        switch (op) {
        case "+": result = a + b; break; //멈추기
        case "-": result = a - b; break;
        case "*": result = a * b; break;
        case "/": result = a / b; break;
        default:
            System.out.println("%s 연산은 지원하지 않습니다.\n, op"); //다른 예외 문출력
            return; 
        }
        System.out.printf("%d %s %d = %d\n", a,op,b,result);
    } // 출력
}

//ver 26 - 클래스 추가