public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        String firstName = "Ivan";
        String lastName = "Ivanov";
        String middleName = "Ivanovich";
        String fullName = lastName + ' ' + firstName + ' ' + middleName;
        System.out.println("Ф.И.О. сотрудника - " + fullName);

        System.out.println("Задача 2");
        fullName = "Ivanov Ivan Ivanovich";
        String fullNameUpperCase = fullName.toUpperCase();
        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета - " + fullNameUpperCase);

        System.out.println("Задача 3");
        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё","е");
        System.out.println("Данные Ф.И.О. сотрудника - " + fullName);

    }
}