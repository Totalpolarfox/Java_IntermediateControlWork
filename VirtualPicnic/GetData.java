package VirtualPicnic;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
 * Метод читает содержимое файла, указанного в параметре filePath, 
 * разбивает его на слова и возвращает список этих слов. 
 * Слова в файле должны быть разделены одним или несколькими пробелами.
 * Пустые строки игнорируются.
 * Первые буквы слов переводим в заглавные.
 * Если файл не найден - бросаем исключение.
 */
public class GetData {
    public static List<String> readTextFromFile(String filePath) throws IOException {

        List<String> words = new ArrayList<>();
        String line;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath)))) {
            while ((line = reader.readLine()) != null) {
                for (String word : line.split("\\s+")) {
                    if (!word.isEmpty()) { // Проверяем, что строка не пустая
                        words.add(word.substring(0, 1).toUpperCase() + word.substring(1));
                    }
                }
            }
        } catch (IOException e) {
            throw new IOException(e.getMessage());
        }
        return words;
    }
}
