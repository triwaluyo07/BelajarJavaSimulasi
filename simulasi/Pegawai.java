package responsi;
/**
 *
 * @author 
 * Tri Waluyo A11.2017.10097
 */
public class Pegawai {
    private int id;
    private String name;
    private String department;
    private double gaji;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getDepartment(){
        return department;
    } 
    public void setDepartment(String department){
        this.department=department;
    }
    public double getGaji(){
        return gaji;
    }
    public void setGaji(double gaji){
        this.gaji=gaji;
    }
    public Pegawai(){
        
    }
    public Pegawai(int id, String name, String department, double gaji){
//        setId(id);
//        setName(name);
//        setDepartment(department);
//        setGaji(gaji);
        this.id=id;
        this.name=name;
        this.department=department;
        this.gaji=gaji;
    }
    public void display(){
        System.out.println(""+id);
        System.out.println(""+name);
        System.out.println(""+department);
        System.out.println(""+gaji);
      
    }
}
