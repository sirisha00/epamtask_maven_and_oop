package epam.giftproblem;

/**
 * Hello world!
 *
 */
import java.util.Scanner;
public class App implements Newyearsgift {
int cost;
public void chocolates(int c)
{cost=c;
}
public void biscuits(int c)
{cost=c;
}
public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of chocolates");
int c=sc.nextInt();
App c1[]=new App[c];
for(int i=0;i<c;i++)
{c1[i]=new App();
}
System.out.println("Enter the cost of chocolates");
for(int i=0;i<c;i++)
{ int cos=sc.nextInt();
c1[i].chocolates(cos);
}
System.out.println("Enter the number of biscuits");
int b=sc.nextInt();
App b1[]=new App[b];
for(int i=0;i<b;i++)
{b1[i]=new App();
}
System.out.println("Enter the cost of chocolates");
for(int i=0;i<b;i++)
{ int cost=sc.nextInt();
b1[i].biscuits(cost);
}
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
for(int i=0;i<b;i++)
{if(b1[i].cost>=a && b1[i].cost<=b)
System.out.println("candie"+(i+1));
}
}
}
