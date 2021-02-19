package com.company;

public class ColorArrayExercise {
    public String[] colors = new String[6];

    // take a number and a string and inser t the string/color into the array
    public void addColor(String color, int position) throws Exception {
        if (colors[position] != null)
        {
            throw new Exception("Position already occupied!");
        }
        colors[position] = color;
    }

    public void printList() throws MissingColorException {
        for (String color: colors) {
            if (color == null) throw new MissingColorException("Missing Color in list");
            else System.out.println(color);
        }
    }

}
