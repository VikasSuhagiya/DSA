package Dsa3_OOPS;

public class oopspractise {
    public static void main(String[] args) {

    }
}




























//        Student s1= new Student();
//        s1.setStudentDetail(101,"abx",55,40,88);
//        s1.calculateTotal();
//        s1.displayStudentDetail();
//    }
//}
//
//class Student{
//    private int rollNum;
//    private String studName;
//    private int mark1;
//    private int mark2;
//    private int mark3;
//    private int total;
//
//    public void setStudentDetail(int rollNum,String studName,int mark1,int mark2,int mark3){
//        this.rollNum=rollNum;
//        this.studName=studName;
//        this.mark1=mark1;
//        this.mark2=mark2;
//        this.mark3=mark3;
//    }
//    public void calculateTotal(){
//        total=mark1+mark2+mark3;
//    }
//
//    public void displayStudentDetail(){
//        System.out.println("Roll no is :-"+rollNum);
//        System.out.println("Student Name is :-"+studName);
//        System.out.println("Total Marks is :-"+total);
//    }
//}























//class Student{
//    private static int UniqueNo=100;
//    int RollNo;
//    String name;
//    private int[] marks=new int[5];
//
//    public Student(int RollNo,String name,int[] marks){
//        this.name=name;
//        this.RollNo=RollNo;
//        this.marks=marks;
//        UniqueNo++;
//    }
//
//    public void Show(){
//        System.out.println("RollNo :"+ RollNo + "Name is : "+ name+ "Marks : "+ marks);
//        for (int i = 0; i < marks.length; i++) {
//            System.out.print(marks[i]);
//            if (i != marks.length - 1) {
//                System.out.print(", ");
//            }
//        }
//    }
//
//}





















//--------------------------------------------------------------------//
//1. Design and develop an interface for Vehicles Consider the example of vehicles like
//bicycle, car and bike. All Vehicles have common functionality such as Gear Change..
//Bicycle, Bike, Car classes should implement functionality in their own class in their own
//way.
//Bicycle: max gear is 2,
//Bike: max gear is 5 and
//Car: max gear is 7
//--------------------Interface Assignment1---------------------------//
//--------------------------------------------------------------------//

//        Bicycle bicycle=new Bicycle();
//        bicycle.GearChange();
//        Bike bike = new Bike();
//        bike.GearChange();
//        Car car = new Car();
//        car.GearChange();
//    }
//}
//
//interface Vehicle{
//    public void GearChange();
//}
//
//class Bicycle implements Vehicle{
//    public void GearChange(){
//        System.out.println("Max gear is 2");
//    }
//}
//class Bike implements Vehicle{
//    public void GearChange(){
//        System.out.println("Max Gear is 5");
//    }
//}
//
//class Car implements Vehicle{
//    public void GearChange(){
//        System.out.println("Max Gear is 7");
//    }
//}





















        /*
        2) The class Movie is stated below. An instance of class Movie represents a film. This
class has the following three class variables:
● title, which is a String representing the title of the movie
● studio, which is a String representing the studio that made the movie
● rating, which is a String representing the rating of the movie (1 star, 2 star etc)
public class Movie {
private String title;
private String studio;
private String rating;
}
a) Write a constructor for the class Movie, which takes a String representing the title
of the movie, a String representing the studio, and a String representing the rating as
its arguments, and sets the respective class variables to these values.
b) Write a second constructor for the class Movie, which takes a String representing
the title of the movie and a String representing the studio as its arguments, and sets the
respective class variables to these values, while the class variable rating is set to "5 star".
c) Write a method get5StarMovies, which takes an array of base type Movie as its
argument, and returns a new array of only those movies in the input array with a rating of "5
star". You may assume the input array is full of Movie instances. The returned array need not
be full
         */


//        Movie m1 = new Movie("RRR","ABC","2star");
//        Movie m2 = new Movie("ABC","JKL","5star");
//        Movie m3 = new Movie("XYZ","BBC","4star");
//        Movie m4 = new Movie("III","DKX","2star");
//        Movie m5 = new Movie("OPI","BPL");
//        Movie m6 = new Movie("LNF","NMB");
//
//        Movie[] movies=new Movie[6];
//        movies[0]=m1;
//        movies[1]=m2;
//        movies[2]=m3;
//        movies[3]=m4;
//        movies[4]=m5;
//        movies[5]=m6;
//
//        Movie[] ans = Movie.gat5StarMovies(movies);
//
//        for (Movie m:ans){
//            if (m!=null){
//                System.out.println(m.getTitle()+" "+m.getRating()+" "+m.getStudio());
//            }
//        }
//    }
//}
//
//class Movie {
//    private String title;
//    private String studio;
//    private String rating;
//
//    public Movie (String title,String studio,String rating){
//        this.title=title;
//        this.studio=studio;
//        this.rating=rating;
//    }
//    public  Movie (String title,String studio){
//        this.title=title;
//        this.studio=studio;
//        rating="5star";
//    }
//
//    public static Movie[]gat5StarMovies(Movie[] movies){
//        Movie[] ans = new Movie[movies.length];
//        int i=0;
//        for (Movie m : movies){
//            if (m.rating.equals("5star")){
//                ans[i]=m;
//                i++;
//            }
//        }
//        return ans;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public String getStudio() {
//        return studio;
//    }
//
//    public String getRating() {
//        return rating;




















        /*
        Advanced
Practice Problems: Classes and Objects (Chapters 5 and 6)
1) The Java class called Holiday is stated below. An object of class Holiday
represents a holiday during the year. This class has three instance variables:
● name, which is a String representing the name of the holiday
● day, which is an int representing the day of the month of the holiday
● month, which is a String representing the month the holiday is in
public class Holiday {
private String name;
private int day;
private String month;
}
a) Write a constructor for the class Holiday, which takes a String representing the
name, an int representing the day, and a String representing the month as its
arguments, and sets the class variables to these values.
b) Write a method inSameMonth, which compares two instances of the class Holiday,and
returns the Boolean value true if they have the same month, and false if they do not.
c) Write a method avgDate which takes an array of base type Holiday as its
argument, and returns a double that is the average of the day variables in the
Holiday instances in the array. You may assume that the array is full (i.e. does not have
any null entries).

         */
//        Holiday h1=new Holiday("uttrayan",15,"jan");
//        Holiday h2=new Holiday("holi",15,"march");
//        Holiday h3=new Holiday("diwali",15,"jan");
//
//        System.out.println(h1.inSameMonth(h3));
//
//        Holiday[] holidays=new Holiday[3];
//        holidays[0]=h1;
//        holidays[1]=h2;
//        holidays[2]=h3;
//        System.out.println(Holiday.avgDate(holidays));
//    }
//}
//
//class Holiday {
//    private String name;
//    private int day;
//    private String month;
//
//    public Holiday(String name,int day,String month){
//        this.name=name;
//        this.day=day;
//        this.month=month;
//    }
//
//
//    public boolean inSameMonth(Holiday h){
//        if (this.month.equals(h.month)){
//            return true;
//        }
//        return false;
//    }
//
//    public static Double avgDate(Holiday[] holidays){
//        double total=0;
//
//        for (int i=0;i< holidays.length;i++){
//            total=total+holidays[i].day;
//        }
//        return total/holidays.length;
//    }
//
//}



















        /*
        4. Create a class Student with attributes rollNo, Name, marks1, marks2 ,marks3, marks4, marks5.
        create a method getTop3Student() which accepts a list of Students and returns array of 3 top
        students with the highest percentage.
         */
//        Student s1 = new Student(1,"piyush",45,50,55,60,65);
//        Student s2 = new Student(2,"rakesh",50,55,60,65,70);
//        Student s3 = new Student(3, "kishan",99,98,97,96,97);
//        Student s4 = new Student(4,"Rahul",95,94,93,92,91);
//        Student s5 = new Student(5,"Sandip",92,91,90,89,88);
//        Student s6 = new Student(6,"Vijay",90,89,88,87,86);
//
//        Student[] students = new Student[6];
//        students[0] = s1;
//        students[1] = s2;
//        students[2] = s3;
//        students[3] = s4;
//        students[4] = s5;
//        students[5] = s6;
//
//        Student.getTop3(students);
//    }
//}
//class Student{
//    private int rNo;
//    private String Name;
//    private int mark1;
//    private int mark2;
//    private int mark3;
//    private int mark4;
//    private int mark5;
//    private int total;
//    private double perc;
//
//    public Student (int rNo, String Name, int mark1, int mark2, int mark3, int mark4, int mark5){
//        this.rNo = rNo;
//        this.Name = Name;
//        this.mark1 = mark1;
//        this.mark2 = mark2;
//        this.mark3 = mark3;
//        this.mark4 = mark4;
//        this.mark5 = mark5;
//        total = mark1 + mark2 + mark3 + mark4 + mark5;
//        perc = total / 5;
//    }
//    public static void getTop3(Student[] students){
//        double max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
//        for(int i = 0; i < students.length; i++){
//            if(students[i].perc > max1){
//                max3 = max2;
//                max2 = max1;
//                max1 = students[i].perc;
//            }
//            else if (students[i].perc > max2 && max2 != max1) {
//                max3 = max2;
//                max2 = students[i].perc;
//            }
//            else if (students[i].perc > max3 && max3 != max2 && max3 != max1) {
//                max3 = students[i].perc;
//            }
//        }
//        System.out.println("First No: " + max1);
//        System.out.println("Second No: " + max2);
//        System.out.println("Third No: " + max3);
//    }
//}










/*3. Create a class Account with the attributes accountNo, custName,
accountBalance and methods setAccountDetails() which set the values to these
attributes.
withdraw() which subtracts the given amount from the available balance
deposit() which adds a given amount to the available balance and
dispAccountDetails() which displays accountNo, custName,
accountBalance.
Create a class Main1 which contains the main() method to test the functionality of
Account class.
 */

//        account a1= new account();
//        a1.setaccountdetail(2356,"vikas",10000);
//        a1.withdraw(2000);
//        a1.deposit(5000);
//        a1.displayaccountdetail();
//    }
//}
//class account{
//    private int accountNo;
//    private String custName;
//    private int balance;
//
//    public void setaccountdetail(int accountNo,String custName,int balance){
//        this.accountNo=accountNo;
//        this.custName=custName;
//        this.balance=balance;
//    }
//
//
//    public void deposit(int amount){
//        balance=balance+amount;
//    }
//
//    public void withdraw(int amount){
//        if (balance<amount){
//            System.out.println("insufficient balance");
//            return;
//        }
//        balance=balance-amount;
//    }
//
//    public void displayaccountdetail(){
//        System.out.println(accountNo+" "+custName+" "+balance);
//    }
//}






    /*2. Create a class Account with accountNumber, custName, balance and
    interest rate. create method calculateInterest() which will calculate interest
    and add to balance. create a method to displayAccountDetails()
    */
//        account a1=new account(1246587524,"vikas",50000);
//        account.interestrate=4;
//        a1.calcinterate();
//        a1.displayaccountdetail();
//    }
//}
//
//class account{
//    private int accountnumber;
//    private String name;
//    private int balance;
//    public static int interestrate;
//
//    public account(int  accountnumber, String name, int balance) {
//        this.accountnumber = accountnumber;
//        this.name = name;
//        this.balance = balance;
//    }
//
//    public  void displayaccountdetail(){
//        System.out.println(accountnumber+" "+name+" "+balance);
//    }
//    public void calcinterate(){
//        int interest =(balance*interestrate)/100;
//        System.out.println("interest is: "+interest);
//        balance=balance+interest;
//    }
//}








     /*1. Write a program which creates a class Student with the following Data Members,
     studName, mark1, mark2, mark3, totalMarks Methods
     setStudDetails() – which sets the values to all the data members except totalMarks.
     calculateTotal() - which calculate the totalMarks
     displayStudDetails() – which displays rollNum, studName and totalMarks
     Create a class StudentDemo to test the functionality of Student class
     */


//        student s1= new student();
//        s1.setstudentdetail(101,"vikas",70,55,45);
//        s1.calctotal();
//        s1.displaystudentdetail();
//    }
//}
//class student{
//    private int rno;
//    private String name;
//    private int mark1;
//    private int mark2;
//    private int mark3;
//    private int total;
//
//    public void setstudentdetail(int rno,String name,int mark1,int mark2,int mark3){
//        this.rno=rno;
//        this.name=name;
//        this.mark1=mark1;
//        this.mark2=mark2;
//        this.mark3=mark3;
//    }
//
//    public void calctotal(){
//        total=mark1+mark2+mark3;
//    }
//
//    public void displaystudentdetail(){
//        System.out.println(rno+" "+name+" "+total);
//    }
//}



