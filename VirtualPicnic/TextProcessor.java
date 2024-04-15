package VirtualPicnic;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TextProcessor {

        /*
     * Метод принимает список слов и возвращает карту,
     * где ключами являются уникальные слова, а значениями - количество их вхождений
     * в список.
     * Используем TreeMap для хранения словаря вхождений, где каждому слову
     * соответствует количество его вхождений в исходный список, и для сохранения порядка.
     */
    public static Map<String, Integer> countWords(List<String> words) {
        TreeMap<String, Integer> wordCountMap = new TreeMap<>();
        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }
        return wordCountMap;
    }

}
