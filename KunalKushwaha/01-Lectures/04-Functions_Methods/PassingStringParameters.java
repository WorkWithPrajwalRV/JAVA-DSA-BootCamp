public class PassingStringParameters {
    public static String greeet(String name) {
        String message = name + "How are you";
        return message;
    }
    public static void main(String[] args) {
        
        System.out.println(greeet("Prajwal "));
    }
}
