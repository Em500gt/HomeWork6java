import java.util.Scanner;

public class menu {
    
    static Scanner iScanner = new Scanner(System.in);
    static boolean flag = true;

    menu()
    {
        System.out.println("Добро пожаловать!");
    }

    void startmenu()
    {
        laptop lp = new laptop();
        lp.addlaptop("Lenovo", 2, 1024, "Windows7", "Silver");
        lp.addlaptop("HP", 4, 256, "Windows8", "Black");
        lp.addlaptop("MSI", 6, 512, "Ubuntu", "White");
        lp.addlaptop("Asus", 8, 256, "Windows10", "Red");
        while(flag) 
        {
        System.out.println("\nВведите по какому параметру хотите посмотреть:\n1 - ОЗУ\n2 - Объем ЖД\n3 - ОС\n4 - Цвет\n5 - Вывести все позиции\n6 - Добавить новые позиции\n7 - Показать сортированые позиции\n0 - Завершить программу\n");  
        switch (iScanner.nextInt()) 
            {
            case 1:
                lp.printlaptopRAM();
                break;
            case 2:
                lp.printlaptopHDD();
                break;
            case 3:
                lp.printlaptopOS();
                break;
            case 4:
                lp.printlaptopCOLOR();
                break;
            case 5:
                lp.printlaptopAll();
                break;
            case 6:
                lp.addlaptop();
                break;
            case 7:
                lp.sorted();
                break;
            case 0:
                flag = false;
                break;
            default:
                break;         
            } 

        } 
    iScanner.close();
    
    }
}