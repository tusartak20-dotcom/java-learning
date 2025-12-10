public class HelloWorld {
    public static void main(String[]args) {
        int year = 2025;
        //Type conversion for whole statement to String, even though it has integer and character. Also, single + for concatenation
        System.out.println("Hello, World! Learn programming with us in "+year+'!');
        System.out.println();
        
        System.out.println("Checking the new line above");
        /*The operation first starts fromleft and goes to right. below are the expected behaviour:
        1. If Left is Integers followed by String, It first adds Integers and then converts it into String
        2. Anything after/right of string will be treated as String
        3. A boolen won't go in with Int, char, float, Double, byte. It would only work with String
        4. A char if present with Integer would first be converted into it's ASCII value and then added to Integer.
        */
        System.out.println('a'+4+3+4+3+"\nhi\nfriend");
    }
}