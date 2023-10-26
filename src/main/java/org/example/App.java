package org.example;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        SavingsAccount sa = new SavingsAccount("Khizar", 2300,1.5);
        CurrentAccount ca = new CurrentAccount("Rasul",1456, 400);
        Account a = new Account("Aparna", 1100);
        ArrayList<Account> accounts = new ArrayList<>();
        accounts.add(sa);
        accounts.add(ca);
        accounts.add(a);
        Iterator<Account> accIter = accounts.iterator();
        while(accIter.hasNext())
        {
            System.out.println(accIter.next());
        }
    }
}
