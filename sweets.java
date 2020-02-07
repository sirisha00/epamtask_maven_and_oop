package epam.giftproblem;
import java.util.*;
public class sweets implements Newyearsgift {
int cost;
private String name;
public void chocolates(int c)
{cost=c;
}
public void biscuits(int c)
{cost=c;
}  
//getter method for name  
public String getName(){  
return name;  
}  
//setter method for name  
public void setName(String name){  
this.name=name;
}  
public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the factory name");
String name1=sc.nextLine();
sweets s1=new sweets();
s1.setName(name1);
System.out.println("Enter the number of chocolates");
int c=sc.nextInt();
sweets c1[]=new sweets[c];
for(int i=0;i<c;i++)
{c1[i]=new sweets();
}
System.out.println("Enter the cost of chocolates");
for(int i=0;i<c;i++)
{ int cos=sc.nextInt();
c1[i].chocolates(cos);
}
System.out.println("Enter the number of biscuits");
int b=sc.nextInt();
sweets b1[]=new sweets[b];
for(int i=0;i<b;i++)
{b1[i]=new sweets();
}
System.out.println("Enter the cost of chocolates");
for(int i=0;i<b;i++)
{ int cost=sc.nextInt();
b1[i].biscuits(cost);
}
System.out.print("In "+s1.getName());
display(b+c);
display(c,b);
System.out.println("Sorting costs of chocolates");
for(int i=0;i<c;i++)

{for(int j=1;j<c-i;j++)
{ if(c1[j-1].cost > c1[j].cost){  
    //swap elements
int temp;
    temp =c1[j-1].cost ;  
    c1[j-1].cost = c1[j].cost;  
    c1[j].cost = temp;  
}  
}
}
for(int i=0;i<c;i++)
System.out.println(c1[i].cost);

System.out.println("Enter a range");
int a=sc.nextInt();
int b2=sc.nextInt();
System.out.println("Printing candies within a given range");
for(int i=0;i<b;i++)
{if(b1[i].cost>=a && b1[i].cost<=b)
System.out.println("candie"+(i+1));
}
}
public static void display(int c)
{
System.out.println("Total sweets in"+" are: "+c);
}
public static void display(int a,int b)
{System.out.println("Number of chocolates and biscuits are: "+a+" and "+b);
}

}



Interface

package com_epam.maven_demo1;

public interface Newyearsgift {
public void chocolates(int c);
public void biscuits(int c);
}

