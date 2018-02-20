import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExecuteShell {

	/*public static void main(String[] args) {

		ExecuteShell obj = new ExecuteShell();

		//String domainName = "google.com";
		//in mac oxs
		//String command = "ping -c 10 " + domainName;
		
		String command = "rpm -Uvh \\ https://dl.fedoraproject.org/pub/epel/epel-release-latest-7.noarch.rpm";

		//in windows
		//String command = "ping -n 3 " + domainName;

		String output = obj.executeCommand(command);

		System.out.print(output);

	}*/

	@SuppressWarnings("unused")
	public String executeCommand(String command) {

		StringBuffer output = new StringBuffer();

		Process p;
		try {
			p = Runtime.getRuntime().exec(command);
			p.waitFor();
			BufferedReader reader =
                            new BufferedReader(new InputStreamReader(p.getInputStream()));

                        String line = "";
			while ((line = reader.readLine())!= null) {
				output.append(line + "\n");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return output.toString();

	}
	//new

}