package Dsa3_OOPS;

public class Polymorphysm {
    public static void main(String[] args) {
    }
    }
//---------------------------------------------------------------//
//---------------------1.Run time polymorphysm-------------------//
//---------------------=--Method Overriding----------------------//
        /*
        BankAccount bankAccount;
        int a=0;
        if (a==0){
            bankAccount = new SavingAccount();
        }else {
            bankAccount = new CurrentAccount();
        }
        System.out.println(bankAccount.getInterestRate());
    }
}
class BankAccount{                                                     //Class
    public int getInterestRate(){
        return 0;
    }
}

class SavingAccount extends BankAccount{
    public int getInterestRate(){                                     //Function
        return 4;                                                     //Defination
    }
}
class CurrentAccount extends BankAccount{
    public int getInterestRate(){                                     //Function
        return 2;                                                     //Defination
    }
}
*/









//---------------------------------------------------------------//
//---------------------1.Run time polymorphysm-------------------//
//---------------------=--Method Overriding----------------------//
//Same Function but different definition//
        /*
        Deer d=new Deer();
        d.eat();8
    }
}

class Animal{
    void eat(){
        System.out.println("eat anything");
    }
}
class Deer{
    void eat(){
        System.out.println("eat grass");
    }
}
*/








//---------------------------------------------------------------//
//-------------------1.Compile time polymorphysm-----------------//
//-----------------------Method Overloading----------------------//
//Multiple function with the Same name but different parameter.
/*
        calculator calc= new calculator();
        System.out.println(calc.sum(1,2));
        System.out.println(calc.sum((float) 2.5,(float) 2.5));
        System.out.println(calc.sum(1,2,3));
    }
}
class calculator{
    int sum(int a,int b){                                        //Same name sum                    //Different parameter (int a,int b)
        return a+b;
    }
    float sum(float a,float b){                                  //Same name sum                    //Different parameter (float a,float b)
        return a+b;
    }
    int sum(int a,int b,int c){                                  //Same name sum                    //Different parameter (int a,int b,int c)
        return a+b+c;
    }
}
*/
