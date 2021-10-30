package MaineCoine;

import java.util.Scanner;

public class Main {

    private static float input;


    public static void main(String[] args) throws Exception {
        System.out.println("hi, Welcome to the Currency Converter!");
        System.out.println("which currency You want to Convert ? 1.ILS to USD,2.USD to ILS , 3.ILS to ERU");
        System.out.println("Please enter a number 1-3");
        Scanner s1 = new Scanner(System.in);
        int choice = s1.nextInt();
        if (choice != 1 && choice != 2 && choice!=3) {
            throw new Exception("Wrong input");
        }
                Coin UsdValue = CoinFactory.getConilnstance(Coins.USD);
                Coin IlsValue = CoinFactory.getConilnstance(Coins.ILS);
                Coin Eurvalu = CoinFactory.getConilnstance(Coins.EUR);

                System.out.println("How much Money you want to convert ?");
                input = s1.nextFloat();
                try {
                    switch (choice) {
                        case 1:
                            System.out.println(input * UsdValue.getUsdValu());
                            break;
                        case 2:
                            System.out.println(input * IlsValue.getIlsValu());
                            break;
                        case 3:
                            System.out.println(input * Eurvalu.getEurvalue());
                            break;
                    }
                } catch (IllegalArgumentException exception) {

                        {
                    System.out.println("Do you whant to convert anther coine? Y/N");
                    input = s1.nextFloat();

                }
            }
        }
    }

