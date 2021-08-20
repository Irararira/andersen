package com.andersenlab;

import java.util.*;

public class Phonebook {

    private final Map<String, Set<String>> storage = new HashMap<>();

    public void add(String phoneNumber, String name) {
        if (name == null || name.length() == 0) {
            return;
        }
        if (phoneNumber == null || phoneNumber.length() == 0) {
            return;
        }
        Set<String> phoneNumbers = storage.get(name);
        if (phoneNumbers != null) {
            phoneNumbers.add(phoneNumber);
        } else {
            HashSet<String> newNumber = new HashSet<>();
            newNumber.add(phoneNumber);
            storage.put(name, newNumber);
        }
    }

    public String get(String name) {
        Set<String> phoneNumbers = storage.get(name);
        if (phoneNumbers != null) {
            return String.join(",", phoneNumbers);
        }
        return "";
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        for (String key : storage.keySet()) {
            sb.append(key + "=" + String.join(",", storage.get(key)) + "; ");
        }
        sb.delete(sb.length() - 2, sb.length()).append("}");
        return sb.toString();
    }
}
