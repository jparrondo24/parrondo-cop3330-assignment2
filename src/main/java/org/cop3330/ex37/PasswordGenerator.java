package org.cop3330.ex37;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PasswordGenerator {
    private ArrayList<Character> listOfLetters;
    private ArrayList<Character> listOfSpecialCharacters;
    private ArrayList<Character> listOfNumbers;

    private int minLength;
    private int specialCharacters;
    private int numbers;
    private String password;

    char pickRandom(ArrayList<Character> arr) {
        int low = 0;
        int high = arr.size() - 1;
        int index = (int) (Math.random() * (high - low + 1) + low);

        return arr.get(index);
    }

    int pickRandomAndRemove(ArrayList<Integer> arr) {
        int low = 0;
        int high = arr.size() - 1;
        int index = (int) (Math.random() * (high - low + 1) + low);

        int value = arr.get(index);
        arr.remove(index);
        return value;
    }

    private void generatePassword() {
        int letters = minLength - (specialCharacters + numbers);
        char[] passwordArr = new char[minLength];
        ArrayList<Integer> indeces = new ArrayList<>();

        for (int i = 0; i < minLength; i++)
            indeces.add(i);

        for (int i = 0; i < letters; i++) {
            int index = pickRandomAndRemove(indeces);
            passwordArr[index] = pickRandom(listOfLetters);
        }
        for (int i = 0; i < specialCharacters; i++) {
            int index = pickRandomAndRemove(indeces);
            passwordArr[index] = pickRandom(listOfSpecialCharacters);
        }
        for (int i = 0; i < numbers; i++) {
            int index = pickRandomAndRemove(indeces);
            passwordArr[index] = pickRandom(listOfNumbers);
        }

        password = new String(passwordArr);
    }

    private void initLists() {
        listOfLetters = new ArrayList<>();
        int j = 'A';
        for (int i = 'a'; i <= 'z'; i++) {
            listOfLetters.add((char) i);
            listOfLetters.add((char) j);
            j++;
        }
        listOfNumbers = new ArrayList<>();
        for (int i = 0; i < 10; i++)
            listOfNumbers.add((char) ('0' + i));

        listOfSpecialCharacters = new ArrayList<>();
        String characters = "!@#$%^&*()_-+={}[]|;:<>,./?";
        for (int i = 0; i < characters.length(); i++)
            listOfSpecialCharacters.add(characters.charAt(i));
    }

    public PasswordGenerator(int minLength, int specialCharacters, int numbers) {
        initLists();

        this.minLength = minLength;
        this.specialCharacters = specialCharacters;
        this.numbers = numbers;

        generatePassword();
    }

    @Override
    public String toString() {
        return "Your password is " + password;
    }
}
