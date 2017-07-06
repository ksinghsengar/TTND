import java.io.*;
public class Exercise9 {

    public static void main(String[] args) {
        try {

        BufferedReader br = new BufferedReader(new FileReader("E:\\TTND Exercise\\exercise\\src\\input.txt"));

            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            while (line != null) {
                sb.append(line);
                sb.append("\n");
                line = br.readLine();
            }

            System.out.println(sb);
        }
        catch(IOException e){
            e.printStackTrace();
        }

    }


}
