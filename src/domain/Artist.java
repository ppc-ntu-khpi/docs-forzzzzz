package domain;

/**
 * Клас Artist представляє собою художника, який є працівником. Він розширює клас Employee
 * і додає функціонал, пов'язаний з навичками художника.
 */
public class Artist extends Employee {

    /**
     * Створює художника із вказаними навичками, ім'ям, посадою, рівнем та відділом.
     *
     * @param skills   масив рядків, що представляють навички художника
     * @param name     ім'я художника
     * @param jobTitle посада художника
     * @param level    рівень художника
     * @param dept     відділ художника
     */
    public Artist(String[] skills, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skills = skills;
    }

    /**
     * Створює художника із вказаними навичками.
     *
     * @param skills масив рядків, що представляють навички художника
     */
    public Artist(String[] skills) {
        super();
        this.skills = skills;
    }
    
    /**
     * Створює художника із стандартними навичками.
     */
    public Artist() {
        super();
        this.skills = new String[10];
    }

    /**
     * Повертає рядкове представлення художника, включаючи його навички.
     *
     * @return рядкове представлення художника
     */
    @Override
    public String toString() {
        return super.toString() + "\nНавички: " + getSkills();
    }

    private String[] skills;

    /**
     * Повертає навички художника у вигляді рядка.
     *
     * @return рядок, що представляє навички художника
     */
    public String getSkills() {
        StringBuilder sb = new StringBuilder();
        for (String skill : skills) {
            sb.append(skill).append(", ");
        }
        if (sb.length() > 2) {
            sb.setLength(sb.length() - 2);
        }
        return sb.toString();
    }

    /**
     * Встановлює навички художника.
     *
     * @param skills масив рядків, що представляють навички художника
     */
    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    /**
     * Повертає навички художника у вигляді масиву.
     *
     * @return масив рядків, що представляє навички художника
     */
    public String[] getSkillsList() {
        return skills;
    }
}