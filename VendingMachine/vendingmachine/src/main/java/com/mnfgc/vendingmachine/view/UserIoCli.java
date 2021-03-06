package com.mnfgc.vendingmachine.view;

import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class UserIoCli implements UserIO{

    Scanner sc = new Scanner(System.in);

    @Override
    public void print(String message) {
        System.out.println(message);
    }

    @Override
    public double readDouble(String prompt) {
        System.out.println(prompt);

        do {
            try {
                return Double.parseDouble(sc.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("[INVALID INPUT] please enter a valid number!!!");
            }
        } while (true);

    }

    @Override
    public double readDouble(String prompt, double min, double max) {
        System.out.println(prompt);
        double out = 0;
        boolean valid = true;
        do {

            do {
                try {
                    out = Double.parseDouble(sc.nextLine());
                    valid = false;

                } catch (NumberFormatException e) {
                    System.out.println("[INVALID INPUT] please enter a valid number!!!");
                }
            } while (valid);

            if (out < min || out > max) {
                System.out.println("That is not a valid Double for the given range (" + min + "," + max + ")");
            }
        } while (out < min || out > max);
        return out;
    }

    @Override
    public float readFloat(String prompt) {
        System.out.println(prompt);

        do {
            try {
                return Float.parseFloat(sc.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("[INVALID INPUT] please enter a valid number!!!");
            }
        } while (true);
    }

    @Override
    public float readFloat(String prompt, float min, float max) {
        System.out.println(prompt);
        float out = 0;
        boolean valid = true;
        do {

            do {
                try {
                    out = Float.parseFloat(sc.nextLine());
                    valid = false;

                } catch (NumberFormatException e) {
                    System.out.println("[INVALID INPUT] please enter a valid number!!!");
                }
            } while (valid);

            if (out < min || out > max) {
                System.out.println("That is not a valid Double for the given range (" + min + "," + max + ")");
            }
        } while (out < min || out > max);
        return out;
    }

    @Override
    public int readInt(String prompt) {
        System.out.println(prompt);

        do {
            try {
                return Integer.parseInt(sc.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("[INVALID INPUT] please enter a valid number!!!");
            }
        } while (true);
    }

    @Override
    public int readInt(String prompt, int min, int max) {
        System.out.println(prompt);
        int out = 0;
        boolean valid = true;
        do {

            do {
                try {
                    out = Integer.parseInt(sc.nextLine());
                    valid = false;

                } catch (NumberFormatException e) {
                    System.out.println("[INVALID INPUT] please enter a valid number!!!");
                }
            } while (valid);

            if (out < min || out > max) {
                System.out.println("That is not a valid Double for the given range (" + min + "," + max + ")");
            }
        } while (out < min || out > max);
        return out;
    }

    @Override
    public long readLong(String prompt) {
        System.out.println(prompt);
        do {
            try {
                return Long.parseLong(sc.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("[INVALID INPUT] please enter a valid number!!!");
            }
        } while (true);
    }

    @Override
    public long readLong(String prompt, long min, long max) {
        System.out.println(prompt);
        long out = 0;
        boolean valid = true;

        do {

            do {
                try {
                    out = Long.parseLong(sc.nextLine());
                    valid = false;

                } catch (NumberFormatException e) {
                    System.out.println("[INVALID INPUT] please enter a valid number!!!");
                }
            } while (valid);

            if (out < min || out > max) {
                System.out.println("That is not a valid Double for the given range (" + min + "," + max + ")");
            }
        } while (out < min || out > max);
        return out;
    }

    @Override
    public String readString(String prompt) {
        System.out.println(prompt);
        return sc.nextLine();
    }
    
    @Override
    public String readStringRequired(String prompt){
        System.out.println(prompt);
        String out;
        do{
           out = sc.nextLine();
           if(out.isBlank()){
               System.out.println("[INVALID INPUT] Enter a non empty string!!!");
           }
        }while(out.isBlank());
        return out;
    }
}
