package com.andersenlab;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


    }

    private static void array() {
        String[] phonebook = new String[10];
        phonebook[0] = "Смирнов";
        phonebook[1] = "Сидовор";
        phonebook[2] = "Бородич";
        phonebook[3] = "Смирнов";
        phonebook[4] = "Зайцева";
        phonebook[5] = "Волчек";
        phonebook[6] = "Бородич";
        phonebook[7] = "Кончиц";
        phonebook[8] = "Смирнов";
        phonebook[9] = "Зайцева";

        List<String> list = Arrays.asList(phonebook);
        HashSet<String> set = new HashSet<>(list);

        System.out.println(String.join(",", set));

        Map<String, Integer> map = new HashMap<>();
        for (String item : list) {
            Integer frequency = map.get(item);
            if (frequency != null) {
                map.put(item, ++frequency);
            } else {
                map.put(item, 1);
            }
        }

        String mapAsString = map.keySet().stream()
                .map(key -> key + "=" + map.get(key))
                .collect(Collectors.joining(", ", "{", "}"));
        System.out.println(mapAsString);
    }

    private static void phoneBook() {
        Phonebook phonebook = new Phonebook();
        phonebook.add("380391202020", "Смирнов");
        phonebook.add("380931800236", "Сидовор");
        phonebook.add("380635302029", "Миронова");
        phonebook.add("380504256568", "Бородич");
        phonebook.add("380631450139", "Зайцева");
        phonebook.add("380502504040", "Волчек");
        phonebook.add("380251303025", "Смирнов");
        phonebook.add("380935002323", "Зайцева");
        phonebook.add("380652305050", "Смирнова");
        phonebook.add("380506001230", "Кончиц");
        phonebook.add("380638003618", "Миронов");
        phonebook.add("380483151515", "Волчек");
        phonebook.add("380304801560", "Иванов");
        phonebook.add("380635506565", "Давыдов");
        phonebook.add("380936008585", "Бородич");
        phonebook.add("380503009696", "Владимирова");
        phonebook.add("380635202626", "Романова");
        phonebook.add("380503201212", "Семеняко");
        phonebook.add("380638502012", "Мясников");
        phonebook.add("380506304018", "Борисенко");
        phonebook.add("380601455038", "Шульга");

        System.out.println(phonebook);


        System.out.println(phonebook.get("Волчек"));
    }
}
