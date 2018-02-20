import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;

@SuppressWarnings("unused")
public class RhoInstall extends ExecuteShell{
	
	
	public static void main( String[] args )
	{
		@SuppressWarnings("resource")
		Scanner input = new Scanner( System.in );
		
		//RhoSetup myRhoSetup = new RhoSetup();
		
		System.out.print("\nWelcome to the RHO Setup Quick Start installer Version 1.0\n\n");
		
		System.out.print("Rho is a tool that identifies information about your Red Hat®\n" +
					    "Enterprise Linux® (RHEL), Red Hat JBoss® Enterprise Application\n" +
					    "Platform, Red Hat JBoss Fuse, Red Hat JBoss AMQ, and Red Hat JBoss\n" +
					    "BRMS product deployment environment. This information includes\n" +
					    "characteristics related to hardware, configuration, physical and\n" + 
				        "virtual systems, operating systems, Red Hat packages, and other data.\n" +
					    "The information that is contained in this Quick Start Guide explains\n" + 
					    "how to install Rho, set up authentication and network profiles, scan\n" + 
				        	"your environment, and view the results of the scan.\n\n");
		
		
	    //Determine which Linux distribution on target system for installation of RHO
		
		System.out.print("Step 1\n");
		System.out.print("\n***Log-in as Root***\n\n");
		System.out.print("Install EPEL-Release Packages (Extra Packages for Enterprise Linux)\n\n");
		
		System.out.print("Rho is supported by the following Linux distributions\n");
		System.out.print(" 1)Red Hat Enterprise Linux 6\n");
		System.out.print(" 2)Red Hat Enterprise Linux 7\n");
		System.out.print(" 3)CentOS 6\n");
		System.out.print(" 4)CentOS 7\n");
		
		System.out.print("\nEnter the number associated with your linux distribution: ");
		String distro = input.nextLine();
		int distroInt = Integer.parseInt(distro);
	
		
		String yes_no;
		ExecuteShell obj = new ExecuteShell();
		
			switch(distroInt)
			{
				case 1:
					System.out.print("\nYou've selected RHEL 6.\nDo you wish do download and install these packages?(type \"y\" or \"yes\")");
					yes_no = input.nextLine();
					if(yes_no.contains("y")|| yes_no.contains("yes")) {
						System.out.print("Installing extra packages\n");
						//Execute Bash Command
						String loadEpel = "rpm -Uvh https://dl.fedoraproject.org/pub/epel/epel-release-latest-6.noarch.rpm";
						String output = obj.executeCommand(loadEpel);
						
						System.out.printf("%s", output);
					} 
					if(yes_no.contains("n") || yes_no.contains("no")){
						System.out.print("Installation Cancelled\n");
					}
					break;
				case 2:
					System.out.print("\nYou've selected RHEL 7.\nDo you wish do download these packages?(type \"y\" or \"yes\")");
					yes_no = input.nextLine();
					if(yes_no.contains("y")|| yes_no.contains("yes")) {
						System.out.print("Installing extra packages\n");
						//Execute Bash Command
						String loadEpel = "rpm -Uvh https://dl.fedoraproject.org/pub/epel/epel-release-latest-7.noarch.rpm";
						String output = obj.executeCommand(loadEpel);
						System.out.print(output);
					} 
					if(yes_no.contains("n") || yes_no.contains("no")){
						System.out.print("Installation Cancelled\n");
					}
					break;
				case 3:
					System.out.print("\nYou've selected CentOS 6.\nDo you wish do download these packages?(type \"y\" or \"yes\")");
					yes_no = input.nextLine();
					if(yes_no.contains("y")|| yes_no.contains("yes")) {
						System.out.print("Installing extra packages\n");
						//Execute Bash Command
						String loadEpel = "rpm -Uvh https://dl.fedoraproject.org/pub/epel/epel-release-latest-6.noarch.rpm";
						String output = obj.executeCommand(loadEpel);
						System.out.print(output);
					} 
					if(yes_no.contains("n") || yes_no.contains("no")){
						System.out.print("Installation Cancelled\n");
					}
					break;
				case 4:
					System.out.print("\nYou've selected CentOS 7.\nDo you wish do download these packages?(type \"y\" or \"yes\")");
					yes_no = input.nextLine();
					if(yes_no.contains("y")|| yes_no.contains("yes")) {
						System.out.print("Installing extra packages\n");
						//Execute Bash Command
						String loadEpel = "rpm -Uvh https://dl.fedoraproject.org/pub/epel/epel-release-latest-7.noarch.rpm";
						String output = obj.executeCommand(loadEpel);
						System.out.print(output);
					} 
					if(yes_no.contains("n") || yes_no.contains("no")){
						System.out.print("Installation Cancelled\n");
					}
					break;
			}
		//Show EPEL has been downloaded prior to install
		
		try {
			
			String strRegex = " | ";
			String frontText = "yum repolist";
			String tailText = "tail -n 5";
			String tailOutput = frontText + strRegex + tailText;
			
			
			String output = obj.executeCommand(tailOutput);
			//output.wait(2000);
			System.out.printf("%s", output);
				
			}  catch (Exception e) {
					
			}
		//New
		
		
	}
}
