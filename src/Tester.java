import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Tester {
    public static void main(String[] args) throws IOException {
        try (Stream<String> lines = Files.lines(Paths.get("src/file.txt"))) {
            lines.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    }

