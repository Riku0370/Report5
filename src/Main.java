public class Main {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
            
        } catch (NullPointerException n) {
            System.out.println("NullPointerExceptionが発生した");
            System.out.println(n.getMessage());
        }
    }
}