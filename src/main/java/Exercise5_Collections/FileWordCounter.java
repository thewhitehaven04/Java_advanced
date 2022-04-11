package Exercise5_Collections;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.*;

/**
 * Есть входной файл с набором слов, написанных через пробел
 * Необходимо:
 * - Прочитать слова из файла.
 * - Отсортировать в алфавитном порядке.
 * - Посчитать сколько раз каждое слово встречается в файле
 * - Вывести статистику на консоль
 * - Найти слово с максимальным количеством повторений
 * - Вывести на консоль это слово и сколько раз оно встречается в файле
 */

public class FileWordCounter {
    private ArrayList<String> words;

    public FileWordCounter(String path) throws FileNotFoundException {
        words = new ArrayList<>();
        Scanner scan = new Scanner(new File(path));

        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            for (String word : line.split("\\W+")) {
                // case-insensitivity
                words.add(word.toLowerCase());
            }
        }
    }

    private LinkedHashSet<String> getUniqueWords() {
        // LinkedHashSet maintains insertion order, so uniqueWords
        // will remain sorted once inserted
        LinkedHashSet<String> uniqueWords = new LinkedHashSet<>();
        uniqueWords.addAll(this.words);
        return uniqueWords;
    }

    public void sortWords() {
        words.sort(String::compareTo);
    }

    private TreeMap<String, Long> getWordCounts() {
        TreeMap<String, Long> wordCounts = new TreeMap<>();
        for (String word : this.getUniqueWords()) {
            wordCounts.put(word, this.words.stream().filter(s -> s.equals(word)).count());
        }
        return wordCounts;
    }

    public void printWordCounts() {
        TreeMap<String, Long> wordCounts = getWordCounts();
        for (String key : wordCounts.keySet()) {
            System.out.printf("Слово: \"%s\", количество появлений: %d\n", key, wordCounts.get(key));
        }
    }

    public void printMostAppearingWords() {
        TreeMap<String, Long> wordCounts = getWordCounts();

        HashSet<String> wordsWithMostAppearances = new HashSet<>();
        Long max = Long.valueOf(0);
        for (String word : wordCounts.keySet()) {
            if (wordCounts.get(word) > max) {
                wordsWithMostAppearances.clear();
                wordsWithMostAppearances.add(word);
                max = wordCounts.get(word);
            } else if (wordCounts.get(word) == max) {
                wordsWithMostAppearances.add(word);
            }
        }
        System.out.printf("Перечисленные слова встречаются %d раз: %s", max, wordsWithMostAppearances);
    }

    public static void main(String[] args) throws FileNotFoundException {
        FileWordCounter fwc;

        if (args.length > 0) {
           fwc = new FileWordCounter(args[0]);
        }
        else {
            String defaultPath = Paths.get("").toAbsolutePath() + "/files/input.txt";
            fwc = new FileWordCounter(defaultPath);
        }
        fwc.sortWords();
        fwc.printWordCounts();
        fwc.printMostAppearingWords();
    }
}
