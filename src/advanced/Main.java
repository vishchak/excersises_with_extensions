package advanced;

import java.io.File;
import java.io.IOException;

/**
 * Create class TextTransformer
 * Method: transform, that transforms text to upper register
 * Create class InverseTransformer that extends TextTransformer
 * Override methods: transform -> reverses text
 * Create class UpDownTransformer that extends TextTransformer
 * Override methods: transform -> Even numbers - lower register, Odd numbers - upper register
 * Create class TextSaver that extends TextTransformer
 * Fields: file, textTransformer
 * method: saveTextToFile(String text) - fist transforms text to chosen format, then saves it to the file
 */
public class Main {
    public static void main(String[] args) {
        TextTransformer textTransformer = new TextTransformer();
        System.out.println(textTransformer.transform("Hello world"));

        InverseTransformer inverseTransformer = new InverseTransformer();
        System.out.println(inverseTransformer.transform("Hello world"));

        UpDownTransformer upDownTransformer = new UpDownTransformer();
        System.out.println(upDownTransformer.transform("Hello world"));

        File file = new File("file.txt");
        TextSaver textSaver = new TextSaver(textTransformer, file);
        try {
            textSaver.saveTextToFile("Hello world");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
