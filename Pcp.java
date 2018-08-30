/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcp;

import static java.lang.System.exit;
import java.util.Scanner;
public class Pcp {

   
    public static void main(String[] args) {
        
    
        Scanner in=new Scanner(System.in);
       int mut=1;
       int E=5;
       int F=0,ch;
        while(true){
            System.out.println("1.P,2.c,3.exit");
            ch=in.nextInt();
            switch(ch){
                case 1:
                    if(mut==1&&F!=5)
                        A.producer();
                    else
                        System.out.println("produser is wating");
                    break;
                case 2:
                    if(mut==1&&E!=0)
                        A.consumer();
                    else
                        System.out.println("consumer is wating");
                    break;
                case 3:
                    exit(0);
                    break;
                    
            }
            
        }

  
    }
}
class A{
    static int mut=1;
    static int E=5;
    static int F=0;
    static int wait(int S){
        return --S;
    }
    static int signal(int s){
        return ++s;
    }
    static void producer(){
        mut=wait(mut);
        F=signal(F);
        E=wait(E);
        System.out.println("producer is producing");
        mut=signal(mut);
    }
     static void consumer(){
        mut=wait(mut);
        F=wait(F);
        E=signal(E);
        System.out.println("consumer is consuming");
        mut=signal(mut);
    }
}



