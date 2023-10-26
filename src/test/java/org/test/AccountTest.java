package org.test;

import org.example.Account;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getAccountHolderName() {
        Account acc1 = new Account("Khizar", 1350.57);
        String expectedOutput = "Khizar";
        String actualOutput = acc1.getAccountHolderName();
        assertEquals(expectedOutput,actualOutput);
    }

    @Test
    void setAccountHolderName() {
        Account acc1 = new Account("Khizar", 1350.57);
        acc1.setAccountHolderName("Rasul");
        String expectedOutput = "Rasul";
        String actualOutput = acc1.getAccountHolderName();
        assertEquals(expectedOutput,actualOutput);
    }

    @Test
    void getBalance() {
        Account acc1 = new Account("Khizar", 1350.57);
        Double expectedOutput = 1350.57;
        Double actualOutput = acc1.getBalance();
        assertEquals(expectedOutput,actualOutput);
    }

    @Test
    void setBalance() {
        Account acc1 = new Account("Khizar", 1350.57);
        acc1.setBalance(3500.67);
        Double expectedOutput = 3500.67;
        Double actualOutput = acc1.getBalance();
        assertEquals(expectedOutput,actualOutput);
    }

    @Test
    void getMinimumBalance() {
        Account acc1 = new Account("Khizar", 1350.57);
        Double expectedOutput = 500.00;
        Double actualOutput = acc1.getMinimumBalance();
        assertEquals(expectedOutput,actualOutput);
    }

    @Test
    void deposit() {
        Account acc1 = new Account("Khizar", 1350.00);

        Double expectedOutput = 2570.00;
        Double actualOutput = acc1.deposit(1220);
        assertEquals(expectedOutput,actualOutput);
    }

    @Test
    void withdraw() {
        Account acc1 = new Account("Khizar", 1350.57);

        String expectedOutput = "Operation declined - cannot go below minimum balance";
        String actualOutput = acc1.withdraw(1220);
        assertEquals(expectedOutput,actualOutput);
    }
}