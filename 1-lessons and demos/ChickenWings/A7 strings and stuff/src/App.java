//strings and stuff
//Emmanuel Mok
//Sept. 20th, 2024
//Click to run, thew numbers are the character data and the string is the words.


public class App {
    public static void main(String[] args) throws Exception {
        String message1 = "I am very happy";
        String target1 = "very";
        
        String message2 = "That was great - lol.";
        String target2 = "lol";

        System.out.println(message1.indexOf(target1));
        System.out.println(target1.length());
        System.out.println(message1.substring(0,5) + message1.substring(10,15));
        
        System.out.println(message2.indexOf(target2));
        System.out.println(target2.length());
        System.out.println(message2.substring(0,17) + "laugh out loud");
    }
}
