public class ReverseString {
    public static void main(String[] args) {
        String name = "pratik";
        reverse(name);
    }

    private static void reverse(String name) {
        String reverseName = "";
        for (int i = name.length()-1; i >= 0; i--) {
            
            reverseName = reverseName + name.charAt(i);
            
        }
        System.out.println(reverseName);
    }
}
