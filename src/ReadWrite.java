import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadWrite {
    public void writer(int a) {
        try (FileWriter writer = new FileWriter("C:\\Users\\nurie\\IdeaProjects\\untitled14\\test.txt", false    )) {
            writer.write(Integer.toString(a));
            writer.flush();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public int read(){
        try(BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\nurie\\IdeaProjects\\untitled14\\test.txt"))){
            String line = reader.readLine();
            try{
                return Integer.parseInt(line.trim());
            }catch (NullPointerException ex){
                ReadWrite w= new ReadWrite();
                w.writer(1000);
            }
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return 0;
    }
}

