package org.launchcode.java.studios.countingcharacters;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.lang.Character;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

import static java.lang.Character.isLetter;
import static java.lang.Character.toLowerCase;

public class CountingCharacters {
    public static void main(String[] args) {
        HashMap<Character, Integer> data = new HashMap<>();
        //Scanner input = new Scanner(System.in);
        FileReader fr = new FileReader("C:/Users/bprin/java/java-web-dev-exercises/src/org/launchcode/java/studios/countingcharacters/sample.txt");
        Scanner inFile = new Scanner(fr);

        //System.out.println("Enter the sentences you want to analyze: ");
        String words = inFile.nextLine();

        //String words = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        char[] chars = words.toCharArray();
        //input.close();

        for (char letter : chars) {
            if (isLetter(letter)) {
                Character cLetter = Character.valueOf(letter);
                Character lLetter = toLowerCase(cLetter);
                // do something with only the letters
                if (data.containsKey(lLetter)) {
                    // locate the key that is already in 'data', increment value by 1
                    int oldValue = data.get(lLetter);
                    data.put(lLetter, oldValue + 1);

                } else {
                    // add the letter as a new key; set value to 1
                    data.put(lLetter, 1);
                }
            }
        }

        // print out all key-value pairs
        for (Map.Entry<Character, Integer> letter : data.entrySet()) {
            System.out.println(letter.getKey() + " = " + letter.getValue());
        }

        // can we sort them, too?
    }
}

