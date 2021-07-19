import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HW_3_2 {
    public static void main(String[] args) {

//                задание 1

        Map<String, Integer> hm = new HashMap<>();
        String[] words = {
                "Желание",
                "Ржавый",
                "Семнадцать",
                "Рассвет",
                "Печь",
                "Желание",
                "Девять",
                "Добросердечный",
                "Возвращение",
                "на",
                "родину",
                "Один",
                "Товарный",
                "вагон",
                "на"};

        for (String word : words) {
            if (hm.containsKey(word))
                hm.put(word, hm.get(word) + 1);
            else
                hm.put(word, 1);
        }
        System.out.println(hm);

//                   задание 2

        PhoneDirectory directory = new PhoneDirectory();

        directory.add("Златовласка", "53626");
        directory.add("Златовласка", "27757");
        directory.add("Локки", "10555");
        directory.add("ХалкЛомать", "785277");
        directory.add("Чек13", "452377");
        directory.add("ХалкЛомать", "010105");
        directory.add("МатерьДраконов", "405777");
        directory.add("Федя", "242777");
        directory.add("МатерьДраконов", "299877");
        directory.add("СантехникПетров", "040404");
        directory.add("ГальГадот", "0101254");
        directory.add("самПатрик", "7676545");

        System.out.println(directory.get("СантехникПетров"));
        System.out.println(directory.get("ГальГадот"));
        System.out.println(directory.get("ХалкЛомать"));
        System.out.println(directory.get("Златовласка"));
        System.out.println(directory.get("МатерьДраконов"));
    }
}

class PhoneDirectory {
    private final Map<String, List<String>> directory_hm = new HashMap<>();

    public void add(String surname, String phone_number) {
        List<String> phone_number_list;
        if (directory_hm.containsKey(surname)) {
            phone_number_list = directory_hm.get(surname);
        } else {
            phone_number_list = new ArrayList<>();
        }
        phone_number_list.add(phone_number);
        directory_hm.put(surname, phone_number_list);
    }

    public List<String> get(String surname) {
        return directory_hm.get(surname);
    }
}

