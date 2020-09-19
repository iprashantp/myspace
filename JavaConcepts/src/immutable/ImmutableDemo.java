package immutable;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ImmutableDemo {
    public static void main(String[] args) {
        ImmutableDemo id = new ImmutableDemo();
        id.showImmutableDemo();
    }

    private void showImmutableDemo(){
        ConcurrentMap<Employee,String> map = new ConcurrentHashMap<>();
        Employee e1 = new Employee(1,"A",new BigDecimal(101),new Date("12/03/1992"));
        Employee e2 = new Employee(2,"B",new BigDecimal(102),new Date("13/03/1992"));
        Employee e3 = new Employee(3,"C",new BigDecimal(103),new Date("14/03/1992"));
        Employee e4 = new Employee(4,"D",new BigDecimal(104),new Date("15/03/1992"));

        map.put(e1,"IT");
        map.put(e2,"Finance");
        map.put(e3,"HR");
        map.put(e4,"IT");

        Set<Entry<Employee,String>> entrySet = map.entrySet();
        for(Entry<Employee,String> entry: entrySet){
            Employee employee = entry.getKey();
            String dept = entry.getValue();
            System.out.println(employee.getName()+"==>"+dept+"==>DOB:"+employee.getDob());
        }
        e1.getDob().setTime(1600519887); //data is mutated thus the hashcode is changed now,
        // object will not be find in the map anymore
        System.out.println(map.get(e1));
    }
}

final class Employee{
    private final int id;//Immutable
    private final String name;//Immutable
    private final BigDecimal salary;//Immutable
    private final Date dob;//Mutable

    public Employee(int id, String name, BigDecimal salary, Date dob) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.dob = dob;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public Date getDob() {
        //return dob;
        return new Date(this.dob.getTime());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&
                Objects.equals(name, employee.name) &&
                Objects.equals(salary, employee.salary) &&
                Objects.equals(dob, employee.dob);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, salary, dob);
    }
}