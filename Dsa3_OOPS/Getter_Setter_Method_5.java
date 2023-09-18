 package Dsa3_OOPS;

 public class Getter_Setter_Method_5 {
    public static void main(String[] args) {

        Address a1 = new Address("Gudgaw","surat","gujrat","india");          //Address create a obj peramet....
        Address a2 = new Address("Gita nagar","surat","gujrat","india") ;

        Sstudent ss1= new Sstudent(54,a1);        // a1 (address) add...
        proffe pp1 = new proffe(77,a2);

        ss1.StuDeta();                           //call the print detail..  (   obj.printFunction();   )
        pp1.ProDeta();

    }
}

 class Sstudent{
     int rno;
     Address address;                                   // Direct Address Add in Aggregation method use...
     Sstudent(int rn  , Address addr ){                     // Student constructor......
         this.rno=rn;
         this.address=addr;
     }
     public void StuDeta(){                                                                                  // Detail print...
         System.out.println(rno +" "+address.soc+" "+address.city+" "+address.State+" "+address.Country);
     }
 }
 class proffe{
     int no;
     Address address;        // Direct Address Add in Aggregation method use...

     proffe(int nno, Address addr ){                     // constructor create....
         this.no=nno;
         this.address=addr;
     }
     public void ProDeta(){                                                                               // detail print in proffe....
         System.out.println(no+" "+address.soc+" "+address.city+" "+address.State+" "+address.Country);
     }
 }
 class Address{
     String soc;
     String city;
     String State;
     String Country;

     Address(String so , String cit,String Sta,String Count){                   // Address counstructor create....
         this.soc=so;
         this.city=cit;
         this.State=Sta;
         this.Country=Count;
    }
}







































//        student s1=new student();
//        s1.setColname("udhna citizen");
//        s1.setId(1001);
//        s1.setName("vikas");
//        s1.setGrade('a');
//        s1.setSem(5);
//        student s2=new student();
//        s2.setColname("add zero group");
//        s2.setId(1002);
//        s2.setName("brijesh");
//        s2.setGrade('b');
//        s2.setSem(3);
//        student s3 = new student();
//        System.out.println(s1.getId()+" "+s1.getName()+" "+s1.getGrade()+" "+s1.getSem()+" "+s3.getColname());
//
//
//    }
//}
//class student{
//    private int id;
//    private String name;
//    private char grade;
//    private int sem;
//    private static String colname;
//
//    public static void setColname(String colname) {
//        student.colname = colname;
//    }
//
//    public static String getColname() {
//        return colname;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public char getGrade() {
//        return grade;
//    }
//
//    public int getSem() {
//        return sem;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setGrade(char grade) {
//        this.grade = grade;
//    }
//
//    public void setSem(int sem) {
//        this.sem = sem;
//    }
//
//}

