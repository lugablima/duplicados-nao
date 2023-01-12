import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        String[] fruits1 = { "Morango", "Uva", "Acerola", "Manga", "Banana" };
        String[] fruits2 = { "Pêra", "Caju", "Morango", "Kiwi", "Banana", "Melancia" };

        List<String> duplicate = new ArrayList<>();

        for(int i = 0; i < fruits1.length; i++) {
            String fruits1Element = fruits1[i];

            for(int j = 0; j < fruits2.length; j++) {  
                String fruits2Element = fruits2[j];

                if(fruits1Element.equals(fruits2Element)) {
                    duplicate.add(fruits1Element);
                }
            }
        }

        System.out.println("Os elementos duplicados são:");

        for(int k = 0; k < duplicate.size(); k++) {
            System.out.println(duplicate.get(k));
        }
    }
}
