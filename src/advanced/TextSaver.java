package advanced;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TextSaver {
    private TextTransformer textTransformer;
    public File file;

    public TextSaver() {
    }

    public TextSaver(TextTransformer textTransformer, File file) {
        this.textTransformer = textTransformer;
        this.file = file;
    }

    public TextTransformer getTextTransformer() {
        return textTransformer;
    }

    public void setTextTransformer(TextTransformer textTransformer) {
        this.textTransformer = textTransformer;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public void saveTextToFile(String text) throws IOException {
        String newText = this.textTransformer.transform(text);

        FileWriter fw = new FileWriter(file);
        for (int i = 0; i < newText.length(); i++) {
            fw.write(newText.charAt(i));
        }
        fw.close();
        System.out.println("Successfully saved");
    }

    @Override
    public String toString() {
        return "TextSaver{" +
                "textTransformer=" + textTransformer +
                ", file=" + file +
                '}';
    }
}
