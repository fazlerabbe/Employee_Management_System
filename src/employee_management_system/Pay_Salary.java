
package employee_management_system;

/**
 *
 * @author Lenovo
 */
public class Pay_Salary {
    private String s_id;
    private String house_rent;
    private String tax;
    private String work_hour;
    private String basic_ssalary;
    
    Pay_Salary(String s_id,String house_rent,String tax,String work_hour,String basic_salary)
    {
        this.s_id=s_id;
    }

    public String getS_id() {
        return s_id;
    }

    public void setS_id(String s_id) {
        this.s_id = s_id;
    }

    public String getHouse_rent() {
        return house_rent;
    }

    public void setHouse_rent(String house_rent) {
        this.house_rent = house_rent;
    }

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    public String getWork_hour() {
        return work_hour;
    }

    public void setWork_hour(String work_hour) {
        this.work_hour = work_hour;
    }

    public String getBasic_ssalary() {
        return basic_ssalary;
    }

    public void setBasic_ssalary(String basic_ssalary) {
        this.basic_ssalary = basic_ssalary;
    }
    
    
    
    void Add_salary(Employee obj)
    {
        if(obj.getId().equals(s_id))
        {
            
        }
       
    }
    void Update_salary(Employee obj)
    {
        if(obj.getId().equals(s_id))
        {
            
        }
       
    }
    void Delete_salary(Employee obj)
    {
        if(obj.getId().equals(s_id))
        {
            
        }
       
    }
    void Search_salary(Employee obj)
    {
        if(obj.getId().equals(s_id))
        {
            
        }
       
    }
    
    
}
