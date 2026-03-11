public class HelloApp {
    public static void main(String[] args) {
        // Getting the name from command-line argument
		//example - java helloworld.java AKSHAYA - command to be implemented in cmd
        String name = args[0];
        System.out.println("Hello, " + name + "!");
    }
}