package com.mycompany.firstapp;
public class Person {
    
    /*
        Class Props
    */
    public String Color;  // سلسه نصيه    ahmed alaa  // ""
    public double Weight; // 7.45  // 0
    public double Length;
    public boolean IsMale;  // false   // true or false 
    /*
        Class Constuctor
    */  
     // constructor البناء 
    // defult constructor    فى حاله انى معملتش بناء
    public Person(String _color,double weight,double lenght,boolean _ismale)
    {
        this.Color=_color;
        this.Weight=weight;
        this.Length=lenght;
        this.IsMale=_ismale;
    }
    /*
        class Methods And Functions
    */
    public void PrintProps()
    {
        System.out.println("My Color Is :"+this.Color);
        System.out.println("My Weight Is :"+this.Weight); 
        System.out.println("My Length Is :"+this.Length);
        System.out.println("My IsMale Is :"+this.IsMale);
        System.out.println("Test");
    }
    
    
}
