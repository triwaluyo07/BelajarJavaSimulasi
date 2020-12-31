package responsi;
/**
 *
 * @author 
 * Tri Waluyo A11.2017.10097
 */
public class TesPegawai extends Manager {
    public static boolean isNamaSama(Manager p1, Manager p2){
       String namap1=p1.getName().toLowerCase();
       String namap2=p2.getName().toLowerCase();
        
        if(namap1.equals(namap2)) {
           return true;
       }else{
           return false;
       }
    }
    public static double max2(double a, double b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }


   public static void main(String[] args){
    Manager e[]=new Manager[3];
    e[0]=new Manager();
    e[1]=new Manager(2,"Widodo","IS",1300.50,300.00);
    e[2]=new Manager(3,"Joko","Accounting",1250.00,100.50);
    e[0].accept(1,"Joko","R/D",1250.0,20.5);
    //buat ini jadi looping
    e[0].display();System.out.println("");
    e[1].display();System.out.println("");
    e[2].display();System.out.println("");
    //sampai sini
    System.out.print("Manager 1 dan Manager 3 memiliki nama yang");
    if(isNamaSama(e[0],e[2]) == true){
    System.out.println("sama");
    }else{
        System.out.println("tidak sama");
    }
    if(e[0].computeSal()>max2(e[1].computeSal(),e[2].computeSal())){
    System.out.println("Maximum Salary :"+e[0].computeSal());
    }else if (e[1].computeSal()>max2(e[0].computeSal(),e[2].computeSal())){
    System.out.println("Maximum Salary :"+e[1].computeSal());
    }else{
    System.out.println("Maximum Salary :"+e[2].computeSal());
    }
}
}