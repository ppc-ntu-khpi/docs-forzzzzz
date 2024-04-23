package domain;

/**
 * Клас Editor представляє собою редактора, який є розширенням класу Artist.
 * Він додає функціональність, пов'язану із вибором типу редагування.
 */
public class Editor extends Artist {

    /**
     * Створює редактора з вказаним типом редагування, навичками, ім'ям, посадою, рівнем та відділом.
     *
     * @param electronicEditing true, якщо редактор працює з електронним редагуванням, false - якщо з паперовим
     * @param skills            масив рядків, що представляють навички редактора
     * @param name              ім'я редактора
     * @param jobTitle          посада редактора
     * @param level             рівень редактора
     * @param dept              відділ редактора
     */
    public Editor(boolean electronicEditing, String[] skills, String name, String jobTitle, int level, String dept) {
        super(skills, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Створює редактора з вказаним типом редагування та навичками.
     *
     * @param electronicEditing true, якщо редактор працює з електронним редагуванням, false - якщо з паперовим
     * @param skills            масив рядків, що представляють навички редактора
     */
    public Editor(boolean electronicEditing, String[] skills) {
        super(skills);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Створює редактора з вказаним типом редагування.
     *
     * @param electronicEditing true, якщо редактор працює з електронним редагуванням, false - якщо з паперовим
     */
    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }
    
    /**
     * Створює редактора з типом редагування за замовчуванням (електронним).
     */
    public Editor() {
        super();
        this.electronicEditing = true;
    }

    /**
     * Повертає рядкове представлення редактора, включаючи його вибір типу редагування.
     *
     * @return рядкове представлення редактора
     */
    @Override
    public String toString() {
        String s = super.toString() + "\nВподобання редагування: ";
        if (electronicEditing)
            s = s + "електронне";
        else
            s = s + "паперове";
        return s;
    }

    private boolean electronicEditing;

    /**
     * Повертає тип редагування редактора.
     *
     * @return true, якщо редактор працює з електронним редагуванням, false - якщо з паперовим
     */
    public boolean getPreferences() {
        return electronicEditing;
    }

    /**
     * Встановлює тип редагування редактора.
     *
     * @param electronic true, якщо редактор працює з електронним редагуванням, false - якщо з паперовим
     */
    public void setPreferences(boolean electronic) {
        this.electronicEditing = electronic;
    }
}