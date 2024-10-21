package fileUtilsHw;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) {
        File sourceFile = new File("src/fileUtilsHw/source");
        File resultFile = new File("src/fileUtilsHw/result");

        try {
            String content = FileUtils.readFileToString(sourceFile, "UTF-8");
            String[] words = StringUtils.split(content);
            Map<String, Integer> wordCountMap = new HashMap<>();
            for (String word : words) {
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }

            StringBuilder resultContent = new StringBuilder();
            for (String word : wordCountMap.keySet()) {
                resultContent.append(wordCountMap.get(word)).append(" ");
            }

            FileUtils.writeStringToFile(resultFile, resultContent.toString().trim(), "UTF-8");

            System.out.println("Word count written successfully to result.txt file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
