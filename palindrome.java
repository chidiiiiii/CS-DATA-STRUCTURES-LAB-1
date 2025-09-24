/// palindrome.java 
//
// fall 2025
// lab4b assignment
//
//Chidi Emenike
//
// Use for palindrome.java

public class palindrome {
    
    public static void main(String[] args) {

        //single call to test
        System.out.println( palindrome("racecar") ); //true
        System.out.println( palindrome("sass") ); //false

        //uncomment to test additional words
        /*
        String words[] = { "a", "racecar", "noon", "hannah", "abcba", "abbca", "nope", "ab" };

        for (int i = 0; i < words.length; i++) {

            if (palindrome(words[i]) == true)
                System.out.println( words[i] + " IS a palindrome");
            else
                System.out.println( words[i] + " IS NOT a palindrome");
        }
        */
        
    }// main

    // *** use StackCharArray and QueueCharArray here to determine Palindrome
    private static boolean palindrome(String word) {

        //assume status is true
        boolean status = true;

		// *** add code here
    // create stack and queue
    StackCharArray s = new StackCharArray(word.length());
    QueueCharArray q = new QueueCharArray(word.length());

    // add all characters from word into both
    for (int i = 0; i < word.length(); i++) {
        char c = word.charAt(i);
        s.push(c);
        q.add(c);
    }

    // compare characters while stack not empty and status is true
    while (!s.empty() && status) {
        if (s.top() != q.front()) {
            status = false;
        } else {
            s.pop();
            q.remove();
        }
    }

    return status;
}
    }// palindrome method

//class
