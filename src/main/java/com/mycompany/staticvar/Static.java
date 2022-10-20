package com.mycompany.staticvar;

/**
 *WAP to demonstrate static variable,method and block.
 */
public class Static {
    static int a=10; //static instance variable
  public static void main(String[] args)
  {
     System.out.println("a="+a);
     method.show();
     
     block.display();
  }
}
class method{
    // static method 
    static void show()
    {
        System.out.println("This is static method.");
    }
}
class block{
    public static int b;
    static{
        b=20;
    }
    public static void display()
    {
        System.out.println("b="+b);
    }  
}