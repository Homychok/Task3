//package Task1;
//
//import java.util.*;
//
//public class maindouplicate {
//    Scanner in = new Scanner(System.in);
//        System.out.println("Введите слово в консоль: ");
//    String word1 = in.nextLine();
//    String word2 = in.nextLine();
//    String word3 = in.nextLine();
//    String word4 = in.nextLine();
//    String word5 = in.nextLine();
//    String word6 = in.nextLine();
//    String word7 = in.nextLine();
//    String word8 = in.nextLine();
//    String word9 = in.nextLine();
//    String word10 = in.nextLine();
//    //        System.out.println("Ваше слово - " + word1);
////        in.close();
//    List<String> wordList = new ArrayList<>();
//        wordList.add(word1);
//        wordList.add(word2);
//        wordList.add(word3);
//        wordList.add(word4);
//        wordList.add(word5);
//        wordList.add(word6);
//        wordList.add(word7);
//        wordList.add(word8);
//        wordList.add(word9);
//        wordList.add(word10);
//        System.out.println("В списке " + wordList.stream().count() + " слов");
//        System.out.println(wordList);
//    Set<String> repeatWords = new TreeSet<String>(wordList);
//        for (String key : repeatWords) {
//        System.out.print(key + ": " + Collections.frequency(wordList, key) + "; ");
//    }
//        System.out.println("");
//    Scanner article = new Scanner(System.in);
//        System.out.println("Введите текст: ");
//    String article1 = in.nextLine();
////        in.close();
//    article1 = article1.replaceAll(",", "");
//    article1 = article1.replaceAll("-", "");
//    article1 = article1.replaceAll("!", "");
//    article1 = article1.replaceAll("\\.", "");
//    article1 = article1.replaceAll("\\?", "");
//    article1 = article1.replaceAll("«", "");
//    article1 = article1.replaceAll("»", "");
//    String[] words1 = article1.split(" ");
//        for (String word : words1) ;
//        System.out.print(words1);
//    List<String> wordSentanceList = new ArrayList<>();
//        wordSentanceList.addAll(List.of(words1));
//        System.out.println("В тексте " + wordSentanceList.stream().count() + " слова.");
//    Set<String> repeatWordsSentance = new TreeSet<>(List.of(words1));
//        for (String key1 : repeatWordsSentance) {
//        System.out.print(key1 + ": " + Collections.frequency(wordSentanceList, key1) + "; ");
//        System.out.println("");
//        Scanner sentance = new Scanner(System.in);
//        System.out.println("Введите предложение: ");
//        String sentance1 = in.nextLine();
//        String sentance2 = in.nextLine();
//        String sentance3 = in.nextLine();
//        String sentance4 = in.nextLine();
//        String sentance5 = in.nextLine();
//        in.close();
//        String article2 = sentance1 + sentance2 + sentance3 + sentance4 + sentance5;
//        article2 = article2.replaceAll(",", "");
//        article2 = article2.replaceAll("-", "");
//        article2 = article2.replaceAll("!", "");
//        article2 = article2.replaceAll("\\.", "");
//        article2 = article2.replaceAll("\\?", "");
//        article2 = article2.replaceAll("«", "");
//        article2 = article2.replaceAll("»", "");
//        String[] words2 = article2.split(" ");
//
//        List<String> wordSentanceList2 = new ArrayList<>();
//        wordSentanceList2.addAll(List.of(words2));
//        System.out.println("В тексте " + wordSentanceList2.stream().count() + " слова");
//        Set<String> repeatWordsSentance2 = new TreeSet<>(List.of(words2));
//        for (String key2 : repeatWordsSentance2) {
//            System.out.print(key2 + ": " + Collections.frequency(wordSentanceList2, key2) + ";");}
////                System.out.println("В тексте " + wordSentanceList2.stream().count() + " слов.");
////        Map<String, Integer> repeatWords = new HashMap<String, Integer>();
////        for (String word : wordList) {
////            Integer hightCount = repeatWords.get(word);
//////            if (repeatWords.containsKey(word)) {
//////                repeatWords.put(word, hightCount);
//////            } else {
//////                repeatWords.put(word, 1);
//////            }
//////
//////        Set<String> keys = repeatWords.keySet();
//////        for (String key : keys);
//////        System.out.println(keys);
//////        System.out.println(repeatWords.get(keys));
////            if (hightCount != null) {
////                hightCount = 0;
////                repeatWords.put(word, hightCount+1);
//////        Map<String, Integer> repeatWords = Stream.of(wordList).flatMap(Collection::stream).flatMap(String)
//////        wordList.stream().sorted().findAny(d)
////                System.out.println(wordList.stream().distinct().collect(Collectors.toList()));
////
////            }
////        }
//
//    }
//}
