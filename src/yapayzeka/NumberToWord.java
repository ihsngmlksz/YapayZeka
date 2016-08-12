/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yapayzeka;

import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Murat
 */
public class NumberToWord {

    private String key;
    private List<String> lines;
    private List<String> deneme;

    public void sifre(String key) {
        this.key = new String(key);
    }

    public ArrayList<String> numberToCharList(char number) {

        ArrayList<String> wordList = new ArrayList<>();

        switch (number) {
            case '2':
                wordList.add("a");
                wordList.add("b");
                wordList.add("c");
                wordList.add("ç");
                break;
            case '3':
                wordList.add("d");
                wordList.add("e");
                wordList.add("f");
                break;
            case '4':
                wordList.add("g");
                wordList.add("ğ");
                wordList.add("h");
                wordList.add("ı");
                wordList.add("i");
                break;
            case '5':
                wordList.add("j");
                wordList.add("k");
                wordList.add("l");
                break;
            case '6':
                wordList.add("m");
                wordList.add("n");
                wordList.add("o");
                wordList.add("ö");
                break;
            case '7':
                wordList.add("p");
                wordList.add("r");
                wordList.add("s");
                wordList.add("ş");
                wordList.add("q");
                break;
            case '8':
                wordList.add("t");
                wordList.add("u");
                wordList.add("ü");
                wordList.add("v");
                break;
            case '9':
                wordList.add("w");
                wordList.add("x");
                wordList.add("y");
                wordList.add("z");
                break;
            case '0':
                wordList.add(" ");
                break;
        }
        return wordList;
    }

    public void firsWord() {
        for (String string : numberToCharList(key.charAt(0))) {
            try {
                Files.lines(Paths.get("c:src/yapayzeka", "kelime-listesi.txt")).filter(line -> line.startsWith(string, 0)).forEach(lines::add);
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
    }

    public List<String> kelimeler() {
        lines = new ArrayList<>();
        firsWord();
        for (int i = 1; i < key.length(); i++) {
            deneme = new ArrayList<>();
            deneme.addAll(lines);
            lines.clear();
            for (String s : numberToCharList(key.charAt(i))) {
                for (String string : deneme) {
                    if (string.startsWith(s, i) && string.length() == key.length()) {
                        lines.add(string);
                    }
                }
            }
        }

        return lines;
    }

}
