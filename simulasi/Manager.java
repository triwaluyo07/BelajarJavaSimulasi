package responsi;
/**
 *
 * @author 
 * Tri Waluyo A11.2017.10097
 */
public class Manager extends Pegawai{
    private double bonus;
    public double getBonus(){
        return bonus;
    }
    public void setBonus(double bonus){
        this.bonus=bonus+bonus;
    }
    public Manager(){
        
    }
    public Manager(int id, String name, String department, double gaji, double bonus){
        super(id,name,department,gaji);
        this.bonus=bonus;
    }
    public double computeSal(){
        return getGaji()+bonus;
    }
    public void accept(int id, String name, String department, double gaji, double bonus){
        setId(id);
        setName(name);
        setDepartment(department);
        setGaji(gaji);
        setBonus(bonus);
//        this.id=id;
//        this.name=name;
//        this.department=department;
//        this.gaji=gaji;
//        this.bonus=bonus;
    }
    public void display(){
        super.display();
        System.out.println(""+getBonus());
    }
}
