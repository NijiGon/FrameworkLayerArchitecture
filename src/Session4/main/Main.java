package Session4.main;

import Session4.factory.AsusFactory;
import Session4.factory.MsiFactory;
import Session4.factory.ProductFactory;
import Session4.model.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public Main(){
//        ProductFactory factory;
//
//        factory = new AsusFactory();
//
//        AsusGpu gpu1 = (AsusGpu) factory.createGpu("RTX 3060", 8);
//        AsusMonitor monitor1 = (AsusMonitor) factory.createMonitor(144, 1080);
//
//        System.out.println(gpu1.name);
//        System.out.println(monitor1.refreshRate);
//
//        factory = new MsiFactory();
//
//        MsiGpu gpu2 = (MsiGpu) factory.createGpu("GTX 1060 TI", 6);
//        MsiMonitor monitor2 = (MsiMonitor) factory.createMonitor(75, 1440);
//
//        System.out.println(gpu2.name);
//        System.out.println(monitor2.refreshRate);

        // Add Gpu menu (bocoran quiz)

        Scanner sc = new Scanner(System.in);
        String brand, name;
        int vram;

        System.out.println("Add a new product to database");

        while (true){
            System.out.print("Input Brand [MSI | Asus] : ");
            brand = sc.nextLine();
            if(brand.equals("MSI") || brand.equals("Asus")){
                break;
            }
        }
        while (true){
            System.out.print("Input name [Length 3..30] : ");
            name = sc.nextLine();
            if(name.length() >= 3 && name.length() < 30) break;
        }
        System.out.print("Input VRAM : ");
        vram = sc.nextInt();
        sc.nextLine(); // getchar()

        ProductFactory factory;

        if(brand.equals("MSI")) factory = new MsiFactory();
        else factory = new AsusFactory();

        ArrayList<Gpu> gpuList = new ArrayList<>();

        Gpu newGpu = factory.createGpu(name, vram);
        gpuList.add(newGpu);
        for(Gpu gpus : gpuList){
            System.out.println(gpus.name + " | " + gpus.vram);
        }
    }
    public static void main(String[] args) {
        new Main();
    }
}
