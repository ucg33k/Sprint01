import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Gmail {
    public Gmail(){}

    public void runGmailAPI(){
        String command = "/usr/local/bin/python3.7 //Users/giraldoj@moravian.edu/IdeaProjects/Sprint01.2/gmail/quickstart/quickstart.py";
        Process p = Runtime.getRuntime().exec(command);
        p.waitFor();
        BufferedReader bri = new BufferedReader(new InputStreamReader(p.getInputStream()));
        BufferedReader bre = new BufferedReader(new InputStreamReader(p.getErrorStream()));
        String line;
        while ((line = bri.readLine()) != null) {
            System.out.println(line);
        }
        bri.close();
        while ((line = bre.readLine()) != null) {
            System.out.println(line);
        }
        bre.close();
        p.waitFor();
        System.out.println("Done.");

        p.destroy();
    }
}
