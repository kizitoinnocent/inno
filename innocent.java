public class Person
{
    private  String  firstName;
    private  String  lastName;
 
    public String getFirstName(){return this.firstName;}
    public void setFirstName(String argFirstName){this.firstName=argFirstName;}
 
    public String getLastName(){return this.lastName;}
    public void setLastName(String argLastName){this.lastName=argLastName;}
   
    public String getName(){
        return firstName+" "+lastName;
    }
 
    public void setName(String fn,String ln){
    this.firstName=fn;
    this.lastName=ln;
    }
   
    Person(String fName, String lName){
              firstName = fName;
              lastName = lName;
      }

     void Display(){
            System.out.println("First Name : " + firstName);
            System.out.println("Last Name : " + lastName);
       }
}



public class Student extends Person
{
     private int id;
     private String standard;
     private  String instructor;
   
     public int getId(){return this.id;}
     public void setId(int argId){this.id=argId;}
   
     public String getStandard(){return this.standard;}
     public void setStandard(String argStandard){this.standard=argStandard;}
   
     public String getInstructor(){return this.instructor;}
     public void setInstructor(String argInstructor){this.instructor=argInstructor;}
   
     Student(String fName, String lName, int nId, String stnd, String instr){
          super(fName,lName);
       
          id = nId;
          standard = stnd;
          instructor = instr;      
      }
     @Override
     void Display() {
            super.Display();

            System.out.println("ID : " + id);
            System.out.println("Standard : " + standard);
            System.out.println("Instructor : " + instructor);
     }
}


public class Teacher extends Person
{
     private  String mainSubject;
     private  int salary;
     private  String type; // Primary or Secondary School teacher
   
     public String getMainSubject(){return this.mainSubject;}
     public void setMainSubject(String argMainSubject){this.mainSubject=argMainSubject;}
   
     public int getSalary(){return this.salary;}
     public void setSalary(int argSalary){this.salary=argSalary;}
   
     public String getType(){return this.type;}
     public void setType(String argType){this.type=argType;}

     Teacher(String fName, String lName, String sub, int slry, String sType){
          super(fName,lName);
          mainSubject = sub;
          salary = slry;
          type = sType;      
      }
      @Override
     void Display(){
            super.Display();

            System.out.println("Main Subject : " + mainSubject);
            System.out.println("Salary : " + salary);
            System.out.println("Type : " + type);
     }
 
}


public class OOPExample {



       public static void main(String args[])
       {
               Person pObj = new Person("Umar","Ahmed");
               Student sObj = new Student("Waqar","Ali",101,"10th ","Ahmed");
               Teacher tObj = new Teacher("Ahmed","Ali","CS",6000,"Primary Teacher");
             
               sObj.setId(100);
               sObj.setName("Waqar", "Hassan");
             
               System.out.println("Person :-------------");
               pObj.Display();

               System.out.println("Student :-----------");
               sObj.Display();

               System.out.println("Teacher :-----------");
               tObj.Display();
             
       
        }

}
