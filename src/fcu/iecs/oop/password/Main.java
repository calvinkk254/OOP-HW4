package fcu.iecs.oop.password;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner Scanner = new Scanner(System.in);
		String password = null;
		
		PasswordEncorder txt = new PasswordEncorder();
						
		do
			{
			password = Scanner.next();
			txt.password = password;
			if(password =="exit")
			{
			Scanner.close();
			break;	
			}
			txt.change(txt.password);
			System.out.println(txt.password);
			}
			while(password!= "exit");																	
			}					
	}

