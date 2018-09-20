package inputSearch;

public class constructor {
    public constructor(){}
    String ds="red";
    public constructor(String color){
        ds=color;

    }
    public void color(){
        System.out.println("color is "+ds);
    }

    public static void main(String[] args) {
        constructor n=new constructor();
        n.color();
        constructor n1=new constructor("blue");
        n1.color();
        ;
}}
