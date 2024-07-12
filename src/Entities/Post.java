package Entities;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Post {
    private LocalDateTime date;
    private String title;
    private String content;
    private int likes;
    private ArrayList<Comment> comments = new ArrayList<>();
    public Post(String title, String content) {
        this.date = LocalDateTime.now();
        this.title = title;
        this.content = content;
    }
    //MOTODS
    public void writeComment(String text){
        Comment c = new Comment(text);
        addComment(c);
    }

    @Override
    public String toString() {
        return "Post [date=" + date + ", title=" + title + ", content=" + content + ", likes=" + likes + ", comments="
                + comments + "]";
    }
    
    //GETTER & SETTER
    public LocalDateTime getDate() {
        return date;
    }
    public void setDate(LocalDateTime date) {
        this.date = date;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public int getLikes() {
        return likes;
    }
    public void setLikes(int likes) {
        this.likes = likes;
    }
    public ArrayList<Comment> getComments(){
        return comments;
    }
    public void addComment(Comment comment){
        comments.add(comment);
    } 
    public void removeComment(Comment comment){
        comments.remove(comment);
    } 
}
