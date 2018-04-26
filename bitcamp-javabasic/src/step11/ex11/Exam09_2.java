// 오버라이딩(overriding) - 응용 예 
package step11.ex11;

public class Exam09_2 {
    
    static class Member{
        String name;
        int age;
 
    public Member(String name, int age) {
       
        this.name = name;
        this.age = age;
    }
    
    public boolean equals(Object obj) {
        if (!(obj instanceof Member))
            return false;
        Member other = (Member)obj;
        
        if(!this.name.equals(other.name))
            return false;
        if(this.age != other.age)
            return false;
        
        return true;
    }
 
    public static void main(String[] args) {
        
        
        Member m1 = new Member("홍길동", 20);
        Member m2 = new Member("홍길동", 20);
    
        if(m1 == m2) {
            System.out.println("m1== m2");
        } else {
            System.out.println("m1 != m2");
        }
        System.out.println(m1.equals(m2));
        
    }
    }

