public class BankAccount {
    int balance;
    Person owner;

    //입금메소드
    //파라미터 : 입금할 액수(정수)
    //리턴 : 성공여부(불린)
    boolean deposit(int amount){

    }

    //출금메소드
    //파라미터 : 출금할 액수(정수)
    //리턴 : 성공여부(불린)
    boolean withdraw(int amount){

    }

    //계좌이체 메소드
    //파라미터 : 받는사람(Person), 이체할 금액(정수)
    //리턴 : 성공여부
    boolean transfer(Person to, int amount){

    }

}
