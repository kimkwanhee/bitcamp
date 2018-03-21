package step10;

    public class Exam01_3 {
        public static void main(String[] args) {

            String s1 = new String("Hello");

            String s2 = s1.replace('l', 'x');

            System.out.printf("%s, %s\n", s1, s2);

            String s3 = s1.concat(", world");

            System.out.printf("%s : %s\n", s1, s3);

            StringBuffer buf = new StringBuffer("Hello");
            buf.replace(2, 4, "xx");
            System.out.println(buf);
    }
}