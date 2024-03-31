import java.util.Scanner;

public class ReverseWords {
    public static String reverseWords(String str) {
        String[] words = str.split(" ");
        StringBuilder res = new StringBuilder();
        for(String word : words) {
            StringBuilder revWrd = new StringBuilder(word).reverse();
            res.append(revWrd).append(" ");
        }
        return res.toString().trim();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.nextLine();
        System.out.println("Output : "+reverseWords(str));
        sc.close();
    }
}
