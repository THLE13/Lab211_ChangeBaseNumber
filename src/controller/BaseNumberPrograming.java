/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author CongThanh
 */
import common.Algorithm;
import common.Library;
import model.Element;
import view.Menu;

/**
 *
 * @author ACER
 */
public class BaseNumberPrograming extends Menu<String> {

    static String[] mc = {"Convert From Binary", "Convert From Decimal", "Convert From Hexa", "Exit"};

    protected Library library;
    protected Algorithm algorithm;
    protected int[] array;
    protected int size_array;

    public BaseNumberPrograming() {
        super("PROGRAMMING", mc);
        library = new Library();
        algorithm = new Algorithm();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                String binary = library.checkInputBinary();
                algorithm.convertFromBinary(binary);
                System.out.println("");
                break;
            case 2:
                String decimal = library.checkInputDecimal();
                algorithm.convertFromDecimal(decimal);
                System.out.println("");
                break;
            case 3:
                String hexa = library.checkInputHexaDecimal();
                algorithm.convertFromHexa(hexa);
                System.out.println("");
                break;
            case 4:
                System.exit(0);
        }
    }

}
