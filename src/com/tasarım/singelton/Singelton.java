package com.tasarım.singelton;

public class Singelton {
    private static Singelton singelton;
    private  Singelton(){
    System.out.println("I am create");
    }
    public static Singelton getSingelton(){
       if(singelton==null){
           synchronized (Singelton.class){
               if(singelton==null){
                   singelton= new Singelton();
               }

           }

       }
        return  singelton;
    }
}
