// 상속 - 클래스 로딩과 인스턴스 생성 과정
package step11.ex05;

public class Exam01 {
    public static void main(String[] args) {
        // B 클래스의 설계도에 따라 Head 영역에 변수를 준비한다.
        // => B 클래스는 A 클래스도 사용한다고 선언했기 때문에
        //    A 클래스의 설계도에 따라 A 클래스에 선언된 인스턴스 변수도 함께 생성된다.
        B obj = new B();
        obj.v2 = 200;
        obj.v1 = 100;
        System.out.printf("v2=%d, v1=%d\n", obj.v2, obj.v1);
        
        // 인스턴스 생성 절차
        // 1) B 클래스가 사용한다고 선언한 클래스를 먼저 메모리에 로딩한다.
        //    즉 A 클래스를 메모리에 로딩한다.
        // 2) B 클래스를 메모리에 로딩한다.
        // 3) A 클래스에 선언된 대로 인스턴스 변수를 Heap에 만든다.
        // 4) B 클래스에 선언된 대로 인스턴스 변수를 Heap에 만든다. 
        
        // 그래서 인스턴스를 생성할 때는 항상 상속 받아야 하는 클래스 파일이 모두 있어야 한다.
        // 테스트 하는 방법?
        // => A.class 파일을 제거하고 Exam01을 실행해 보라! 
        
    }
}

// 용어 정리!
// 상속(inheritance)
// 기존에 만든 클래스를 자신의 코드처럼 사용하는 기법이다.
// 보통 기존 코드를 손대지 않고 새 코드를 덧붙일 때 많이 사용한다.
// 
// 수퍼클래스(super class) = 부모클래스(parents class)
// => A 클래스처럼 상속해주는 클래스를 말한다.
// 
// 서브클래스(sub class) = 자식클래스(child class)
// => B 클래스처럼 다른 클래스를 상속 받는 클래스를 말한다.