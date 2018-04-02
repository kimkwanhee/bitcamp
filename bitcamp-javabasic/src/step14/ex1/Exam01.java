package step14.ex1;

public class Exam01 {
    public static void main(String[] args) {
        
        Worker w1 = new BlueWorker();
        
        
        //Worker w2 = new String();
        
        Worker w2 = new WhiteWorker();
        
        Worker w3 = new JubuWorker();
        
        
        //인터페이스 구현체 호출
        w1.execute();
        w2.execute();
        w3.execute();
        
        //caller : Exam01;
        //callee : BlueWorker, WhiteWorker,JubuWorker
        
    }

}
