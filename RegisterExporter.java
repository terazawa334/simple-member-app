import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class RegisterExporter{
    public static void main(String[] args) {
        String name ="登録太郎";
        String email = "toroku@example.com";
        int age =28;

        String filename = "register.csv";

        try (FileWriter writer = new FileWriter(filename, true)){
            String line = String.format("%s,%s,%d,%s\n",name,email,age,LocalDateTime.now());
            writer.write(line);
            System.out.println("登録情報をCSVに出力しました。");
        } catch (IOException e) {
            System.out.println("出力エラー：" + e.getMessage());
        }
    }
}