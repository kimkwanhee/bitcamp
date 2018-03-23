package step11.ex11;

public class Exam02 {
    public static void main(String[] args) {
        A2.obj1 = new A2();
        obj1.name = "홍길동";
        obj1.age = 20;
        
        obj1.print();
        
        //오직 이름만 출력하게 되어 있다.
        // 이 메서드를 변경해야 하는데
        //손대지 않고 
        //파라미터 형식이 같은 메서드를 중복해서 만들수 없다.
        //그래서 클래스에 라는 메서드를 추가 하였다.
        obj1.print2();
        
        //부모 클래스로 부터 상속 받은 메서드를 재정의 할 수 없어서
        //세 메서들르 만들어야 한다면,
        //같은 또는 유사한 일을하는 메서드의 이름이 다르기 때문에
        //개발자는 여러개의 메서드를 암기해야하는 번거로움이 생긴다.
        
        
    }
}

  
