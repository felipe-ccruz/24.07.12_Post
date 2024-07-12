package Entities;

public class Comment {
    private String text;
    public Comment(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "\n          ----Comment [text=" + text + "]\n";
    }


    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
}
