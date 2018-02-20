import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class javaTestclass {
	
	public static void main(String[] args) {
		
		//ExecuteShell obj = new ExecuteShell();
		
		String strRegex = " | ";
		String frontText = "yum repolist";
		String tailText = "tail -n 5";
		String tailOutput = frontText + strRegex + tailText;
		
		System.out.print(tailOutput);
		
		//String output = obj.executeCommand(tailOutput);
		//System.out.printf("%s", output);
		
	}

}
