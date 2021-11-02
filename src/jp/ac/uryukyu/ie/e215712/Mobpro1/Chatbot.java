package jp.ac.uryukyu.ie.e215712.Mobpro1;

public class Chatbot{
    String name;
    public Chatbot(){
        System.out.println("チャットボットの原型を作成します");
    }

    public Chatbot(String _name){
        System.out.println("チャットボット名" + _name + "を生成します。");
        this.name = _name;
    }
}