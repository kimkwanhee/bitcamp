package step23.ex1;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Sender4 {

    public static void main(String[] args) throws Exception {
        // 1) 다른 컴퓨터와 네트워크로 연결한다.
        Socket socket = new Socket("192.168.0.9", 8888);
        // 네트워크 연결을 수행하는 객체
        
        // 2) 소켓 객체를 통해 읽고 쓸 수 있도록 입출력 스트림을 얻는다.
        PrintStream out = new PrintStream(socket.getOutputStream());
        FileInputStream fileIn = new FileInputStream("temp/ttt.txt");
       // FileOutputStream fileOut = new FileOutputStream("temp/ttt.txt");
        
        int data = 0;
        
        int callcount = 0;
        while ((data = fileIn.read()) != -1) callcount++; {
            out.write(data);
        }
System.out.println(callcount);


       // String str = in.readLine();


       // String str = in.nextLine();
       // System.out.println(str);
        
        // 5) 항상 입출력 도구는 사용 후 닫아야 한다.
        fileIn.close();
        out.close();
        
        // 6) 네트워크 연결도 닫는다.
        socket.close();
        
    }

}