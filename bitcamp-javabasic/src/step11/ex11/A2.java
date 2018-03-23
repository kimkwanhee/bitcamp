// 오버라이딩(overriding)
package step11.ex11;

public class A2 extends A {
    int age;
    
    void print2() {
        System.out.printf("'%s'님 반갑습니다.\n", this.name);
    }
}
