

import jp.ac.uryukyu.ie.e215712.Mobpro1.*;

public class Main{
    public static void main(String[] args) {
        System.out.println("main method runs");
        Chatbot bot1 = new Chatbot();
        Chatbot bot2 = new Chatbot("hoge");
        System.out.println(bot2);
    }
}