package local.home02.task01.main;

import java.util.Scanner;

/*
 * Программа  —  льстец.  На  экране  высвечивается  вопрос  
 * «Кто  ты:  мальчик  или  девочка?  Введи  Д  или  М».  
 * В зависимости от ответа на экране должен появиться текст 
 * «Мне нравятся девочки!» или «Мне нравятся мальчики!».
 */

public class Task21 {
	
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String m = "Д";
		String n = "М";
		
		String x1 = scanner.nextLine();
        
        if(x1.equals(m)) {
        	System.out.println("Мне нравятся девочки!");
        }
        if(x1.equals(n)) {
        	System.out.println("Мне нравятся мальчики!");
        }
        
       
		
	}

}
