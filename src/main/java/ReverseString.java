import java.lang.*;
import java.io.*;
import java.util.*;


public class ReverseString {
    public static void main(String[] args)
    {
        String input = "Lorem at";

        String[] arrSplit = input.split("");
        for (int i=0; i < arrSplit.length; i = i +4)
        {
            StringBuilder inputReverse = new StringBuilder();
            inputReverse.append(input);
            inputReverse = inputReverse.reverse();
            System.out.println(inputReverse);
        }

    }
}
