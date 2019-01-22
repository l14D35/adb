package threads;

import java.io.*;
import java.util.Random;

public class LogsFight implements Runnable {

    private static int SIZE = 3;
    private static Random rand = new Random();
    private int damage = rand.nextInt(90) + 10;
    private int time;
    private int hour = rand.nextInt(24) + 1;
    private int minute = rand.nextInt(60);
    private String[] types = {"Mage", "Warrior", "Archer"};
    private String type = types[rand.nextInt(types.length)];

    public static void main(String[] args) {
        //Runnable r = new LogsFight();
        // Thread t = new Thread(r);
        Thread[] l = new Thread[SIZE];
        for (int i = 0; i < l.length; i++) {
            l[i] = new Thread(new LogsFight()); //nowy watek, ktory jako parametr przyjmuje LogsFight
            l[i].start();
        }


    }

    @Override
    public void run() {
        try {
            BufferedWriter pw = new BufferedWriter(new FileWriter("Logs.txt", true));
            pw.append("\nType of enemy: ").append(this.getType()).append("\nDamage taken: ").append(String.valueOf(this.getDamage()))
                    .append("\nTime of attack: ").append(String.valueOf(this.getHour())).append(":")
                    .append(String.valueOf(this.getMinute())).append("\n\n");
            pw.close();

            BufferedReader br = new BufferedReader(new FileReader("Logs.txt"));
            while (br.readLine() != null)
                System.out.println(br.readLine());
            br.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private int getDamage() {
        return damage;
    }


    public int getTime() {
        return time;
    }


    private int getHour() {
        return hour;
    }


    private int getMinute() {
        return minute;
    }


    private String getType() {

        return this.type;
    }

}