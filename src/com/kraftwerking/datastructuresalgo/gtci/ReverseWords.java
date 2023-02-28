package com.kraftwerking.datastructuresalgo.gtci;

public class ReverseWords {

    public static String reverseWords(String s) {
        // We need to convert the input strings
        // to arrays of characters as strings are immutable in Java
        char[] s1 = s.toCharArray();
        // trim spaces and convert string to string builder
        String s2 = trimSpaces(s1, s1.length);
        StringBuilder builder = new StringBuilder(s2);

        //  To reverse all words in the string, we will first reverse
        //  the entire string.
        strRev(builder, 0, builder.length() - 1);

        //  Now all the words are in the desired location, but
        //  in reverse order: "Hello World" -> "dlroW olleH".

        // Now, let's iterate the sentence and reverse each word in place.
        // "dlroW olleH" -> "World Hello"
        int n = builder.length();
        int start = 0, end = 0;
        // Find the start index of each word by detecting spaces.
        while (start < n) {
            // Find the end index of the word.
            while (end < n && builder.charAt(end) != ' ')
                ++end;
            // Let's call our helper function to reverse the word in-place.
            strRev(builder, start, end - 1);
            // moving to the next word
            start = end + 1;
            ++end;
        }

        return builder.toString();
    }
    // A function that reverses a whole sentence character by character
    public static void strRev(StringBuilder sb, int startRev, int endRev) {
        // Starting from the two ends of the list, and moving
        // in towards the centre of the string, swap the characters
        while (startRev < endRev) {
            char temp = sb.charAt(startRev); // temp store for swapping
            sb.setCharAt(startRev++, sb.charAt(endRev));
            sb.setCharAt(endRev--, temp);
        }
    }
    // trim leading, trailing and multiple spaces
    static String trimSpaces(char[] a, int n) {
        int x = 0, y = 0;

        while (y < n) {
            while (y < n && a[y] == ' ') y++;             // skip spaces
            while (y < n && a[y] != ' ') a[x++] = a[y++]; // keep non spaces
            while (y < n && a[y] == ' ') y++;             // skip spaces
            if (y < n) a[x++] = ' ';                      // keep only one space
        }

        return new String(a).substring(0, x);
    }


    public static void main(String[] args) {
        String[] inputs = {"Hello World!", "We love Python.", "The quick brown fox jumped over the lazy dog.", "Hey!", "To be, or not to be", "AAAAA", "Hello     World"};
        for(int i=0; i<inputs.length; i++){
            System.out.print(i+1);
            System.out.println(".\tActual string:\t\t"+ inputs[i]);
            System.out.println("\tReversed String:\t"+ reverseWords(inputs[i]));
            //System.out.println(PrintHyphens.repeat("-", 100));
        }

    }
}