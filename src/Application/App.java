package Application;

import Entities.Comment;
import Entities.Post;

public class App {
    public static void main(String[] args) throws Exception {
        Post p1 = new Post("The best trip", "I'm going to visit this wonderful contry!");

        p1.likeThePost();
        p1.likeThePost();
        p1.likeThePost();
        p1.likeThePost();

        p1.writeComment("Have a nice trip.");
        p1.writeComment("Wow that's awesome!");


        Post p2 = new Post("Good night guys", "See you tomorrow.");
        
        p2.likeThePost();
        p2.likeThePost();
        p2.likeThePost();
        p2.likeThePost();
        p2.likeThePost();
        p2.likeThePost();
        p2.likeThePost();

        p2.writeComment("Good Night.");
        p2.writeComment("May the force be with you.");


        Post p3 = new Post("The best father", "I'm love with my family!");

        p3.likeThePost();
        p3.likeThePost();

        p3.writeComment("I love you all!");
        p3.writeComment("The best aunt ever.");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
    }
}
