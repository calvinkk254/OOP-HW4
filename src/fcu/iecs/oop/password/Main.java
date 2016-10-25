package fcu.iecs.oop.password;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner Scanner = new Scanner(System.in);
		String password = null;
		int com = 0;
		
		PasswordEncorder txt = new PasswordEncorder();
						
		do
			{
			password = Scanner.nextLine();
			com = password.compareTo("exit");
			txt.password = password;
			if(com == 0)
			{
			Scanner.close();
			System.exit(1);
			}
			else
			{
			txt.change(txt.password);
			}
			}
			while(password!= "exit");																	
			}					
	}

