//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //task 10

        String firstName, middleName, lastName, fullName;
        firstName = "Ivan";
        lastName = "Ivanov";
        middleName = "Ivanovich";
        fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф.И.О. сотрудника - " + fullName);

        System.out.println("Ф.И.О сотрудника верхним регистром - " + fullName.toUpperCase());

        fullName = "Иванов Семён Семёнович";
        System.out.println("Ф.И.О. сотрудника с заменой ё - " + fullName.replace("ё", "е"));

    }
}
