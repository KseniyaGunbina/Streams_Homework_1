import java.io.*;
import java.nio.file.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        String log = null;

        try {
            stringBuilder.append(Files.createDirectories(Path.of("c:\\Games\\src\\main")) + " add.");
            stringBuilder.append(Files.createFile(Path.of("c:\\Games\\src\\main\\main.java")) + " add. \n");
            stringBuilder.append(Files.createFile(Path.of("c:\\Games\\src\\main\\Utils.java")) + " add. \n");

            stringBuilder.append(Files.createDirectories(Path.of("c:\\Games\\src\\test")) + " add. \n");

            stringBuilder.append(Files.createDirectories(Path.of("c:\\Games\\res\\drawables")) + " add. \n");
            stringBuilder.append(Files.createDirectories(Path.of("c:\\Games\\res\\vectors")) + " add. \n");
            stringBuilder.append(Files.createDirectories(Path.of("c:\\Games\\res\\icons")) + " add. \n");

            stringBuilder.append(Files.createDirectories(Path.of("c:\\Games\\res\\drawables")) + " add. \n");
            stringBuilder.append(Files.createDirectories(Path.of("c:\\Games\\res\\vectors")) + " add. \n");
            stringBuilder.append(Files.createDirectories(Path.of("c:\\Games\\res\\icons")) + " add. \n");

            stringBuilder.append(Files.createDirectories(Path.of("c:\\Games\\savegames")) + " add. \n");

            stringBuilder.append(Files.createDirectories(Path.of("c:\\Games\\temp")) + " add. \n");
            stringBuilder.append(Files.createFile(Path.of("c:\\Games\\temp\\temp.txt")) + " add. \n");

             log = stringBuilder.toString();
//            System.out.println(log);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileWriter fileWriter = new FileWriter("c:\\Games\\temp\\temp.txt")) {
            fileWriter.write(log);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
