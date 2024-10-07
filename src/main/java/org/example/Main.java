package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        Account[] mass = new Account[10];
        for (int i = 0; i < 10; i++)
        {
            mass[i] = new Account("user" + i, i, 10000);
            mass[i].setAnnualInterestRate(7.5);
        }

        int id;
        System.out.print("Введите ID: "); id = in.nextInt();

        while (true)
        {
            boolean flag = false;
            for (Account account : mass)
            {
                if(account.getId() == id)
                {
                    flag = true;
                    break;
                }
            }

            if(!flag)
            {
                System.out.println("Некорретный id!");
                break;
            }

            int numOfPunkt;

            System.out.println("Основное меню");
            System.out.println("1: проверить баланс счета");
            System.out.println("2: снять со счета");
            System.out.println("3: положить на счет");
            System.out.println("4: отобразить сводку по счету");
            System.out.println("5: выйти");
            System.out.print("Введите пункт меню: "); numOfPunkt = in.nextInt();


            if(numOfPunkt == 1)
            {
                System.out.println("Баланс равен: " + mass[id].getBalance());
            }
            else if(numOfPunkt == 2)
            {
                double money;
                String description;

                System.out.print("Введите сумму для снятия: ");
                money = in.nextDouble();
                in.nextLine();
                System.out.print("Введите комментарий к транзакции: ");
                description = in.nextLine();

                mass[id].withdraw(money, description);
            }
            else if(numOfPunkt == 3)
            {
                double money;
                String description;

                System.out.print("Введите сумму для пополнения: ");
                money = in.nextDouble();
                in.nextLine();
                System.out.print("Введите комментарий к транзакции: ");
                description = in.nextLine();

                mass[id].deposit(money, description);
            }
            else if(numOfPunkt == 4)
            {
                System.out.println("Владелец: " + mass[id].getName());
                System.out.println("Процентная ставка: " + mass[id].getAnnualInterestRate() + "%");
                System.out.println("Баланс: " + mass[id].getBalance());
                System.out.println();

                System.out.println("Транзакции: ");
                mass[id].displayTransactions();
            }
            else if(numOfPunkt == 5)
            {
                break;
            }

            System.out.println();
        }
    }
}