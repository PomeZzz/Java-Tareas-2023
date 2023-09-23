package java;
import java.util.Random;

import java.util.*;
public class random {
    public static void main(String[]args){
        String [] nombres = {"ivi","vito","jose","vito","digo","topo","feli","kenny's"};
        Random ran = new Random();// se crea el objeto random

       System.out.println(nombres[ran.nextInt(0)]);



    }
    
}
