package Task1;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner article = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String articles = in.nextLine();
        in.close();
        String[] words1 = articles.split(" ");
//        for (String str : words1) ;
//        System.out.print(words1);
        List<String> wordSentanceList = new ArrayList<>();
        wordSentanceList.addAll(List.of(words1));
        System.out.println(wordSentanceList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().distinct()
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet()));

    }
}
//  /      String[] word = article.split(" ");
//        List<String> wordSentanceList = new ArrayList<>();
//        wordSentanceList.stream().spliterator().
//                wordSentanceList.addAll(List.of(word));
//        Map<Integer,String> map = wordSentanceList.stream()
//                .filter((String word) -> !wordSentanceList.add(word))
//                .collect(Collectors.toMap(Function.identity(), value -> 1, Integer::sum));
////        wordSentanceList.addAll(List.of(word));
//        System.out.println("В тексте " + wordSentanceList.stream().count() + " слова.");
//        wordSentanceList.stream().filter(words -> !wordSentanceList.add(word)).collect(Collectors.toMap(Function.identity(), value -> 1, Integer::sum));
//        System.out.println(wordSentanceList);
//        for (String word : getWordsFromText(article1, " -,.;?!-\n"))
//            System.out.println(word);}
//        private static String[] getWordsFromText (String text, String delimiters){
//            StringTokenizer tokenizer = new StringTokenizer(text, delimiters);
//            List<String> wordsList = new LinkedList<>();
//            while (tokenizer.hasMoreElements()) wordsList.add(tokenizer.nextToken());
//            return wordsList.toArray(new String[0]);
//        }

























//        article1 = article1.replaceAll(",", "");
//        article1 = article1.replaceAll("-", "");
//        article1 = article1.replaceAll("!", "");
//        article1 = article1.replaceAll("\\.", "");
//        article1 = article1.replaceAll("\\?", "");
//        article1 = article1.replaceAll("«", "");
//        article1 = article1.replaceAll("»", "");
//        String[] word = article.split(" ");
//        List<String> wordSentanceList = new ArrayList<>();
//        wordSentanceList.stream().spliterator().
//        wordSentanceList.addAll(List.of(word));
//        Map<Integer,String> map = wordSentanceList.stream()
//                        .filter((String word) -> !wordSentanceList.add(word))
//                                .collect(Collectors.toMap(Function.identity(), value -> 1, Integer::sum));
////        wordSentanceList.addAll(List.of(word));
//        System.out.println("В тексте " + wordSentanceList.stream().count() + " слова.");
//        wordSentanceList.stream().filter(words -> !wordSentanceList.add(word)).collect(Collectors.toMap(Function.identity(), value -> 1, Integer::sum));
//        System.out.println(wordSentanceList);
//    }
//}
