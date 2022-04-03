package main;

import java.util.*;

public class Main {

    public static void main( String[] args ) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	int t = sc.nextInt();
    	
    	sc.nextLine();
    	
    	String s;
    	String[] split;
    	ArrayList<Integer> prog = new ArrayList<>();
    	ArrayList<Integer> mat = new ArrayList<>();
    	
    	for(int i = 0; i<t;i++) {
    		s = sc.nextLine();
    		split = s.split(" ");
    		prog.add(Integer.parseInt(split[0]));
    		mat.add(Integer.parseInt(split[1]));
    	}
    	int teams;
    	int n=0;
    	for(int i=0;i<prog.size();i++) {
    		teams=0;
    		for(int p= 1;p<=prog.get(n);i++) {
    			for(int m= 1;m<=mat.get(n);m++) {
    				if(m+p==4) {
    					teams++;
    				}
    			}
    		}
    		System.out.print(teams);
    		n++;
    	}
    	
    	
    	
    }



}