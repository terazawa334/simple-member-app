import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class RegisterExporter{
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("使用法: java RegisterExporter 名前 メール 年齢");
            return;
        }
        String name =args[0];
        String email = args[1];
        int age =Integer.parseInt(args[2]);

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