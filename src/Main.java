import java.io.*;
import java.nio.file.*;

public class Main {

    public static Path path = Path.of("c:", "Games");

    public static Path appDirectory(String dirName) {
        try {
            return Files.createDirectories(path.resolve(dirName));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Path appFile(String dir, String fileName) {
        try {
            if (fileName.equals(null)) {
                return Files.createFile(path.resolve(dir));

            } else {
                return Files.createFile(path.resolve(dir).resolve(fileName));
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) throws IOException {

        StringBuilder stringBuilder = new StringBuilder();
        String log = null;

        try {
            stringBuilder.append(appDirectory("src/main") + " add.\n" +
                    appFile("src/main","main.java") + " add.\n" +
                    appFile("src/main","Utils.java") + " add.\n" +
                    appDirectory("src/test") + " add.\n" +
                    appDirectory("res/drawables") + " add.\n" +
                    appDirectory("res/vectors") + " add.\n" +
                    appDirectory("res/icons") + " add.\n" +
                    appDirectory("savegames") + " add.\n" +
                    appDirectory("temp") + " add.\n" +
                    appFile("temp","temp.txt") + " add.\n");

            log = stringBuilder.toString();
            System.out.println(log);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        try (FileWriter fileWriter = new FileWriter("c:/Games/temp/temp.txt")) {
            fileWriter.write(log);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

