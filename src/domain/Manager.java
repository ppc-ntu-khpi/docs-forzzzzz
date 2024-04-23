package domain;

/**
 * Клас Manager представляє керівника, який є розширенням класу Employee.
 * Він містить інформацію про співробітників, які йому підпорядковані.
 */
public class Manager extends Employee {

    /**
     * Створює керівника з вказаними співробітниками, ім'ям, посадою, рівнем та відділом.
     *
     * @param employees масив співробітників, які підпорядковані керівнику
     * @param name      ім'я керівника
     * @param jobTitle  посада керівника
     * @param level     рівень керівника
     * @param dept      відділ керівника
     */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }

    /**
     * Повертає рядкове представлення керівника, включаючи його співробітників.
     *
     * @return рядкове представлення керівника
     */
    @Override
    public String toString() {
        return super.toString()+"\nEmployees: "+getEmployees(); 
    }

    /**
     * Створює керівника з вказаними співробітниками.
     *
     * @param employees масив співробітників, які підпорядковані керівнику
     */
    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }
    
    /**
     * Створює керівника з порожнім списком співробітників.
     */
    public Manager() {
        super();
        employees = new Employee[10];
    }

    private Employee[] employees;


    /**
     * Повертає список співробітників керівника у вигляді рядка.
     *
     * @return рядок, що містить імена співробітників керівника
     */
    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s=s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Встановлює список співробітників керівника.
     *
     * @param employees масив співробітників, які підпорядковані керівнику
     */
    public void setEmployees(Employee[] employees) {
        this.employees=employees;
    }

    /**
     * Повертає список співробітників керівника у вигляді масиву.
     *
     * @return масив співробітників керівника
     */
    public Employee[] getEmployeesList() {
        return employees;
    }
}
