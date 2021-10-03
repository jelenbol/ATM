package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Labdien! Lūdzu izvēlieties valodu: ");
          System.out.println(
                 "1 - latviešu; " +
                          "2 - English; " +
                         "3 - Russkij; " +
                         "4 - Deutsch");

           Scanner valoda = new Scanner(System.in);
          int val = valoda.nextInt();

           switch (val) {
              case 1:
                  System.out.println("LV");
                  break;
             case 2:
                 System.out.println("ENG");
                  break;
              case 3:
                   System.out.println("RUS");
                   break;
             case 4:
                  System.out.println("DE");
                 break;
          }


         {
              System.out.println("Lūdzu ievietojiet bankas karti. Ievadiet PIN: ");
              Scanner kods = new Scanner(System.in);
              int Pin = kods.nextInt();
            if (Pin >= 0 && Pin <= 9999) {
                  System.out.println("PIN OK");
               } else {
                  System.out.println("Nepareizs PIN. Lūdzu mēģiniet vēlreiz");

             }
           }

          {
             System.out.println("Apskatīt konta atlikumu. Lūdzu izvēlieties: ");
           System.out.println("I - izdrukāt; E - parādīt uz ekrāna");

             Scanner atlik = new Scanner(System.in);
           String Atlikums = atlik.nextLine();

               switch (Atlikums) {
                 case "I":
                     System.out.println("Lūdzu skatīt konta izdruku!");
                  break;
                 case "E":
                    System.out.println("Jūsu konta atlikums: EUR 35 750.");
                    break;
            }

           }

        System.out.println();


        System.out.println("Izņemt naudu");

        { System.out.println(
                "1 - 5; " +
                        "2 - 10; " +
                        "3 - 20; " +
                        "4 - 50; " +
                "5 - cita summa");

            Scanner nauda = new Scanner(System.in);

            short nau = nauda.nextShort();


                switch (nau) {

                    case 1:
                        System.out.println("5");
                        break;
                    case 2:
                        System.out.println(10);
                        break;
                    case 3:
                        System.out.println(20);
                        break;
                    case 4:
                        System.out.println(50);
                    case 5:
                        System.out.println("lūdzu ieraksties summu manuāli");
                }

    }



        System.out.println("");
        System.out.println("1 = Turpināt, 2 = Pabeigt?");
        Scanner Izvele = new Scanner(System.in);
        String izvele = Izvele.nextLine();

        switch (izvele) {
            case "1":
                System.out.println("Lūdzu izvēlēties nākamo operāciju");
                break;
            case "2":
                System.out.println("Lūdzu paņēmiet karti");
                break;
       }

        }

    }

