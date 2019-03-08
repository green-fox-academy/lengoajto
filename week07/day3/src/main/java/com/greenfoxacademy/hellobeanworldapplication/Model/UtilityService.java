package com.greenfoxacademy.hellobeanworldapplication.Model;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class UtilityService {
    ArrayList<String>colors;
    Random random;

    public UtilityService() {
        colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("lime");
        colors.add("orange");
        colors.add("magenta");
    }

    public String randomColor() {
        return colors.get(random.nextInt(colors.size()));
    }

    public List<String>getColorList(){
        return this.colors;
    }

    public boolean validateEmail(String email){
        return email.matches("^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,}$");
    }

    public String caesar(String text, int number) {
        if (number < 0) {
            number = 26 + number;
        }

        String result = "";
        for(int i = 0; i < text.length(); i++) {
            int offset = Character.isUpperCase(text.charAt(i)) ? 'A' : 'a';
            result += (char)(((int)text.charAt(i) + number - offset) % 26 + offset);
        }
        return result;
    }
}

