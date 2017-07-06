import java.io.*;
public class Exercise1 {
    public static void main(String[] args)  throws IOException{

        BufferedReader reader = null;
        BufferedWriter writer = null;
        try {
            FileReader fileReader = new FileReader("input.txt");
            FileWriter fileWriter = new FileWriter("output.txt");
            reader = new BufferedReader(fileReader);
            writer = new BufferedWriter(fileWriter);
            int c;
            while ((c = reader.read()) != -1) {
                writer.write(c);

            }
        }

    finally {
        if(reader != null){
            reader.close();
        }
        if(writer != null){
            writer.close();

        }
    }

    }
}
