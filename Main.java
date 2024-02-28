import java.util.Scanner;
class Reader{
    String FIO;
    int number;
    String faculty;
    String date;
    String phoneNumber;

    Reader(String FIO, int number, String faculty, String date, String phoneNumber){
        this.FIO = FIO;
        this.number = number;
        this.faculty = faculty;
        this.date = date;
        this.phoneNumber = phoneNumber;
    }

    public void takeBook(int number){
        System.out.printf("%s взял %d книг\n", this.FIO, number);
    }

    public void takeBook(String[] books){
        System.out.printf("%s взял книги: ", this.FIO);
        for (String book : books) System.out.print(book + ", ");
        System.out.println();
    }

    public void returnBook(int number){
        System.out.printf("%s вернул %d книги\n", this.FIO, number);
    }

    public void returnBook(String[] books){
        System.out.printf("%s вернул книги: ", this.FIO);
        for (String book : books) System.out.print(book + ", ");
        System.out.println();
    }

    public void display(){
        System.out.println(this.FIO);
        System.out.println(this.number);
        System.out.println(this.faculty);
        System.out.println(this.date);
        System.out.println(this.phoneNumber);
    }
}

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Reader[] readers = new Reader[5];
        for (int i = 0; i < 5; i++){
            System.out.print("ФИО: ");
            String fullName = scanner.nextLine();
            System.out.print("Номер читательского билета: ");
            int number = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Факультет: ");
            String faculty = scanner.nextLine();
            System.out.print("Дата рождения: ");
            String dateOfBirth = scanner.nextLine();
            System.out.print("Телефон: ");
            String phoneNumber = scanner.nextLine();
            readers[i] = new Reader(fullName, number, faculty, dateOfBirth, phoneNumber);
            //readers[i].display();
        }

        String[] books = new String[]{"Энциклопедия", "Приключения", "Стихи"};
        readers[0].takeBook(books);
        readers[0].returnBook(books);

        readers[1].takeBook(3);
        readers[1].returnBook(3);
    }
}
