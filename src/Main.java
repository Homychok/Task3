import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите слово в консоль: ");
        String word1 = in.nextLine();
        String word2 = in.nextLine();
        String word3 = in.nextLine();
        String word4 = in.nextLine();
        String word5 = in.nextLine();
        String word6 = in.nextLine();
        String word7 = in.nextLine();
        String word8 = in.nextLine();
        String word9 = in.nextLine();
        String word10 = in.nextLine();
//        System.out.println("Ваше слово - " + word1);
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
        System.out.println("В списке " + wordList.stream().count() + " слов");
        System.out.println(wordList);
        Set<String> repeatWords = new TreeSet<String>(wordList);
        for (String key : repeatWords) {
            System.out.print(key + ": " + Collections.frequency(wordList, key) + ";");
            System.out.println("_______________");
        }

        Scanner article = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String article1 = in.nextLine();
        in.close();
        article1 = article1.replaceAll(",", " ");
        article1 = article1.replaceAll("-", " ");
        article1 = article1.replaceAll("!", " ");
        article1 = article1.replaceAll("\\.", " ");
        article1 = article1.replaceAll("\\?", " ");
        article1 = article1.replaceAll(".", " ");
        String[] words = article1.split(" ");
        for (String word : words);
        System.out.print(words);
        List<String> wordSentanceList = new ArrayList<>();
        wordSentanceList.addAll(List.of(words));
        System.out.print("В тексте " + wordSentanceList.stream().count() + " слов");
        Set<String> repeatWordsSentance = new TreeSet<String>(wordSentanceList);
        for (String key : repeatWordsSentance) {
            System.out.print(key + ": " + Collections.frequency(wordSentanceList, key) + ";");
        System.out.println("_______________");

        Scanner sentance = new Scanner(System.in);
        System.out.println("Введите предложение: ");
        String sentance1 = in.nextLine();
        String sentance2 = in.nextLine();
        String sentance3 = in.nextLine();
        String sentance4 = in.nextLine();
        String sentance5 = in.nextLine();
        in.close();
        List<String> sentanceList = new ArrayList<>();
        sentanceList.add(sentance1);
        sentanceList.add(sentance2);
        sentanceList.add(sentance3);
        sentanceList.add(sentance4);
        sentanceList.add(sentance5);
            sentanceList = sentanceList.replaceAll(",", " ");
            sentanceList = sentanceList.replaceAll("-", " ");
            sentanceList = sentanceList.replaceAll("!", " ");
            sentanceList = sentanceList.replaceAll("\\.", " ");
            sentanceList = sentanceList.replaceAll("\\?", " ");
            String[] words1 = sentanceList.spliterator();
            for (String word : words);
            System.out.print(words);
        System.out.println("В тексте " + sentanceList.stream().count() + " предложений и " +  + " слов");
//        Map<String, Integer> repeatWords = new HashMap<String, Integer>();
//        for (String word : wordList) {
//            Integer hightCount = repeatWords.get(word);
////            if (repeatWords.containsKey(word)) {
////                repeatWords.put(word, hightCount);
////            } else {
////                repeatWords.put(word, 1);
////            }
////
////        Set<String> keys = repeatWords.keySet();
////        for (String key : keys);
////        System.out.println(keys);
////        System.out.println(repeatWords.get(keys));
//            if (hightCount != null) {
//                hightCount = 0;
//                repeatWords.put(word, hightCount+1);
////        Map<String, Integer> repeatWords = Stream.of(wordList).flatMap(Collection::stream).flatMap(String)
////        wordList.stream().sorted().findAny(d)
//                System.out.println(wordList.stream().distinct().collect(Collectors.toList()));
//
//            }
//        }
    }
}