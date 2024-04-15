package VirtualPicnic;

import java.io.IOException;
import java.util.List;
import java.util.TreeMap;

public class Program {

    public static void main(String[] args) throws IOException {
        
        try {
            List<String> words = GetData.readTextFromFile("input.txt");   
            TreeMap<String, Integer> wordCountMap = (TreeMap<String, Integer>) TextProcessor.countWords(words);
            String longestWord = TextProcessor.findLongestWord(words);
            System.out.println("Количество слов: " + wordCountMap.size());
            System.out.println("Самое длинное слово: " + longestWord);
            System.out.println("Сколько раз каждое слово встречается в файле?: ");
            TextProcessor.printMap(wordCountMap);
            
        } catch (IOException e) {
            // e.printStackTrace();
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
    

}
