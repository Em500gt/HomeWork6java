import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * laptop
 */
public class laptop {
    static Scanner iScanner = new Scanner(System.in);

    List<String> arr = new ArrayList<String>();
    Map<Integer, String> map = new HashMap<>();
    static String[] rr;
    
    String name;
    Integer ram;
    Integer hdd;
    String os;
    String color;
    int index = 1;
    
    laptop()
    {
        name = "Undefined";
        ram = 0;
        hdd = 0;
        os = "Undefined";
        color = "Undefined";
    }

    laptop(String name, Integer ram, Integer hdd, String os, String color)
    {
        this.name = name;
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.color = color;
    }   

    void addlaptop(String name, Integer ram, Integer hdd, String os, String color)
    {
        map.put(index++, name + " " + ram + "ГБ " + hdd + "ГБ " + os + " " + color);
    }

    void addlaptop()
    {

        System.out.print("Введите название ноута: ");
        name = iScanner.nextLine();
        System.out.print("Введите количетсво оперативной памяти: ");
        ram = iScanner.nextInt();
        System.out.print("Введите количество памяти жесткого носителя: ");
        hdd = iScanner.nextInt();
        iScanner.nextLine();
        System.out.print("Введите название операционной системы: ");
        os = iScanner.nextLine();
        System.out.print("Введите цвет ноута: ");
        color = iScanner.nextLine();

        map.put(index++, name + " " + ram + "ГБ " + hdd + "ГБ " + os + " " + color);

    }

    void printlaptopAll()
    {  
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %n", "NAME", "RAM", "HDD", "OS", "COLOR");
        for (var values : map.entrySet()) 
        {
            rr = values.getValue().split(" ");
            System.out.printf("%-10s %-10s %-10s %-10s %-10s %n", rr[0], rr[1], rr[2], rr[3], rr[4]);    
        }
    }

    void printlaptopRAM()
    {
        System.out.printf("%-10s %-10s %n", "NAME", "RAM");
        for (var values : map.entrySet()) 
        {
            rr = values.getValue().split(" ");
            System.out.printf("%-10s %-10s %n", rr[0], rr[1]);    
        }
    }

    void printlaptopHDD()
    {
        System.out.printf("%-10s %-10s %n", "NAME", "HDD");
        for (var values : map.entrySet()) 
        {
            rr = values.getValue().split(" ");
            System.out.printf("%-10s %-10s %n", rr[0], rr[2]);    
        }
    }

    void printlaptopOS()
    {
        System.out.printf("%-10s %-10s %n", "NAME", "OS");
        for (var values : map.entrySet()) 
        {
            rr = values.getValue().split(" ");
            System.out.printf("%-10s %-10s %n", rr[0], rr[3]);    
        }
    }

    void printlaptopCOLOR()
    {
        System.out.printf("%-10s %-10s %n", "NAME", "COLOR");
        for (var values : map.entrySet()) 
        {
            rr = values.getValue().split(" ");
            System.out.printf("%-10s %-10s %n", rr[0], rr[4]);    
        }
    }

    void sorted()
    {
        arr.clear();
        for (Map.Entry<Integer, String> values : map.entrySet()) {
            arr.add(values.getValue());
        }
        arr.sort(null);
        
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %n", "NAME", "RAM", "HDD", "OS", "COLOR");

        for (String val : arr) {
            rr = val.split(" ");
            System.out.printf("%-10s %-10s %-10s %-10s %-10s %n", rr[0], rr[1], rr[2], rr[3], rr[4]); 
        }

    }

}