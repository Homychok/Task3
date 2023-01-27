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
        //ввели данные в консоль, ввели заголовок ниже
        System.out.println("ТОП 10 слов в тексте: ");
        //создаем списочек
        List<String> wordSentanceList = new ArrayList<>();
        //добавляем в список введенный текст
        wordSentanceList.add(articles);
        //переходим к потоку, оставляем только буквы(русские и англ),
        // все символы заменяем на пробелы (все еще текст у нас)
        Arrays.stream(articles.replaceAll("[^A-Za-zА-Яа-я]", " ")
                        //делим текст на слова по пробелу. получаем массив слов отдельных
                .split(" "))
                //оставляем только слова, чтобы пробелы не считались за отдельные слова
                .filter(word -> word.length() > 0)
                //собираем в Map<String,Integer>
                .collect(Collectors.toMap(key -> key, value -> 1, Integer::sum))
                //подсчитываем слова
                .entrySet().stream()
                //сортируем слова в порядке убывания, чтобы оставить слова потом с наибольшим повторением
                .sorted((e1, e2) -> {
                    //сортируем в порядке убывания повторения
                    int value = e1.getValue().compareTo(e2.getValue())* -1;
                    if (value == 0) {
                        //внутри сортированного списка по повторениям, при одинаковом значении ставим в алфавитном порядке
                        value = e1.getKey().compareTo(e2.getKey());
                        //возвращаем значения
                    } return value;
                })
                //ставим, что нужно только первые 10 слов
                .limit(10)
                //выводим
                .forEach(e -> System.out.println(e.getValue() + ": " + e.getKey()));

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
