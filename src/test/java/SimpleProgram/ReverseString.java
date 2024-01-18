package SimpleProgram;

public class ReverseString {

    public void reverse(String ch) {
        String nxtCh = "";
        char str;
        for (int i = ch.length() - 1; i >= 0; i--) {
            str = ch.charAt(i);
            nxtCh = nxtCh + str;
        }
        if (nxtCh.equals(ch)) {
            System.out.println("reversed string is a palindrome  " + nxtCh);
        }
        else{
            System.out.println("reversed string is a not palindrome  " + nxtCh);
        }

    }
    public static void main(String[] arg){
        ReverseString rv = new ReverseString();
        rv.reverse("jhk");
    }
}
