package nl.xs4all.home.freekdb.textanalysis;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TextAnalysis {
    public static void main(final String[] arguments) throws IOException {
        new TextAnalysis().run();
    }

    private void run() throws IOException {
        System.out.println("TextAnalysis.run is running!");

        Path filePath = Paths.get("input\\test-input-1.txt");
        Stream<String> linesStream = Files.lines(filePath);

        List<String> lines = linesStream.collect(Collectors.toList());

        int wordCount = lines.stream().mapToInt(line -> line.split(" ").length).sum();
        System.out.println("wordCount: " + wordCount);
        System.out.println("lineCount: " + lines.size());
    }
}
