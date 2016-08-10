/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yapayzeka;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class WordToNumber {
    
    private ArrayList<Integer> keyList;
    private String key ="";
    
    public void wordtonumber(String s){    
        keyList = new ArrayList<>();
        for (char c : s.toUpperCase().toCharArray()) {
            switch (c){
                case 'A':keyList.add(2);break;
                case 'B':keyList.add(2);break;
                case 'C':keyList.add(2);break;
                case 'Ç':keyList.add(2);break;
                case 'D':keyList.add(3);break;
                case 'E':keyList.add(3);break;
                case 'F':keyList.add(3);break;
                case 'G':keyList.add(4);break;
                case 'Ğ':keyList.add(4);break;
                case 'H':keyList.add(4);break;
                case 'I':keyList.add(4);break;
                case 'İ':keyList.add(4);break;
                case 'J':keyList.add(5);break;
                case 'K':keyList.add(5);break;
                case 'L':keyList.add(5);break;
                case 'M':keyList.add(6);break;
                case 'N':keyList.add(6);break;
                case 'O':keyList.add(6);break;
                case 'Ö':keyList.add(6);break;
                case 'P':keyList.add(7);break;
                case 'Q':keyList.add(7);break;                
                case 'R':keyList.add(7);break;
                case 'S':keyList.add(7);break;
                case 'Ş':keyList.add(7);break;
                case 'T':keyList.add(8);break;
                case 'U':keyList.add(8);break;
                case 'Ü':keyList.add(8);break;
                case 'W':keyList.add(9);break;                
                case 'V':keyList.add(9);break;
                case 'Y':keyList.add(9);break;
                case 'Z':keyList.add(9);break;
                case ' ':keyList.add(0);break;                
            }
        }        
    }

    public String getKey() {
        for (Integer keys : keyList) {
            key+= keys.toString();
        }
        return key;
    }
    
    
    
}
