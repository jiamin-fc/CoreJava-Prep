/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author smoo
 */

import java.utils.Scanner;
import java.io.*;


public class Score {
    private String name;
    private int mark;
    public Score(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }
    public String getName() {
        return name;
    }
    public String getMark() {
        return mark;
}
    public String toString() {
        return name + "" + mark;
    }
