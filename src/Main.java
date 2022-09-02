import java.time.LocalDateTime;
import java.util.Scanner;
public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Vvedite kolichestvo sodrudnikov:");
        Employee[] employees = new Employee[scanner.nextInt()];
        scanner.nextLine();

        for (int i = 0; i < employees.length; i++) {
            employees[i] = new Employee();
            String name = writerName(i, "imya");
            String surname = writerName(i, "familiya");
            int yearofbith = writerYear(i, "god rojdeniy");

            if ((2004>=yearofbith)){
            int startyearofwork = writerYear(i, "god nachala raboty");
             if(startyearofwork-yearofbith>=18) {
                 employees[i].setStartyearofwork(startyearofwork);
             }

            }

            employees[i].setName(name);
            employees[i].setSurname(surname);
            employees[i].setYearofbith(yearofbith);
        }

        for (Employee i : employees) {
            System.out.println("Name:"+i.getName());
            System.out.println("Surname:"+i.getSurname());
            System.out.println("Year of birth:"+i.getYearofbith());
            System.out.println("Start year of work:"+i.getStartyearofwork());
            System.out.println("-------------------------------------------");
        }
    }

    public static boolean checkName(String name) {
        int counter = 0;
        for (int i = 0; i < name.length(); i++) {
            if (Character.isLetter(name.charAt(i))) {
                counter++;
            }
        }
        return name.length() != counter;
    }

    public static String writerName(int i, String word) {
        i++;
        System.out.printf("Vvedite %s rabotnika %d:", word, i);
        String name = scanner.nextLine();
        try {
            if (checkName(name)) {
                throw new MyException();
            }
        } catch (MyException e) {
            while (checkName(name)) {
                System.out.printf("Vy vveli %s %d nepravilno:\n", word, i);
                System.out.printf("Vvedite %s %d", word, i);
                name = scanner.nextLine();
            }
        }
        return name;

    }

    public static int writerYear(int i, String word) {
        i++;
        while (true) {
            try {

                System.out.printf("Vvedite  %s #%d rabotnika:", word, i);
                int year = scanner.nextInt();
                if ((LocalDateTime.now().getYear() - year >= 0) && (year > 1950)) {

                    scanner.nextLine();
                    return year;
                }

                throw new MyException();
            } catch (Exception e) {
                scanner.nextLine();
                System.out.printf("Vy vveli  %s #%d  rabotnika neplavilno: \n", word, i);

            }

        }

    }


}