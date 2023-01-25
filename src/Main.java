import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите слово в консоль: ");
        String word1 = in.nextLine();
//        in.nextLine();
        String word2 = in.nextLine();
//        in.nextLine();
        String word3 = in.nextLine();
//        in.nextLine();
        String word4 = in.nextLine();
//        in.nextLine();
        String word5 = in.nextLine();
//        in.nextLine();
        String word6 = in.nextLine();
//        in.nextLine();
        String word7 = in.nextLine();
//        in.nextLine();
        String word8 = in.nextLine();
//        in.nextLine();
        String word9 = in.nextLine();
//        in.nextLine();
        String word10 = in.nextLine();
        System.out.println("Ваше слово - " + word1);
        in.close();
        List<String> wordList = new ArrayList<>();
        wordList.add(word1);
        wordList.add(word2);
        wordList.add(word3);
        wordList.add(word4);
        wordList.add(word5);
        wordList.add(word6);
        wordList.add(word7);
        wordList.add(word8);
        wordList.add(word9);
        wordList.add(word10);
        System.out.println("В тексте " + wordList.stream().count() + " слов");
        System.out.println(wordList);
        Map<String, Integer> repeatWords = new HashMap<String, Integer>();
        for (String word : wordList) {
            Integer hightCount = repeatWords.get(word);
//            if (repeatWords.containsKey(word)) {
//                repeatWords.put(word, hightCount);
//            } else {
//                repeatWords.put(word, 1);
//            }
//
//        Set<String> keys = repeatWords.keySet();
//        for (String key : keys);
//        System.out.println(keys);
//        System.out.println(repeatWords.get(keys));
            if (hightCount != null) {
                hightCount = 0;
                repeatWords.put(word, hightCount+1);
//        Map<String, Integer> repeatWords = Stream.of(wordList).flatMap(Collection::stream).flatMap(String)
//        wordList.stream().sorted().findAny(d)
                System.out.println(wordList.stream().distinct().collect(Collectors.toList()));

            }
        }
    }
}