package dataStructureAlgorithm.deepLearnJavaCore;

public class Main {
    public static void main(String[] args) {
     Worker w  = new Worker();
     Employee e = new Worker();
     Person p = new Worker();
     Object o = new Worker()    ;

     Person person = new Person() {
         @Override
         public void show() {
             System.out.println("SHow person");
         }
     };
     Worker worker = (Worker) e;
     p.show();

     person.show();






    }
}
