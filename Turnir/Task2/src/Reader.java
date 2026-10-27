import java.util.Arrays;
import java.util.Date;

public class Reader {
    private String SNP, faculty, phoneNumber;
    private long ticketNumber;
    private Date birthDate;

    public Reader(String SNP, String faculty, String phoneNumber, long ticketNumber, Date birthDate) {
        this.SNP = SNP;
        this.faculty = faculty;
        this.phoneNumber = phoneNumber;
        this.ticketNumber = ticketNumber;
        this.birthDate = birthDate;
    }

    public void takeBook (String... bookNames){
        System.out.println(SNP + " взял(-а) книги: " + String.join(", ", bookNames));
    }

    public void takeBook (int quantity){
        System.out.println(SNP + " взял(-а) " + quantity + " книги");
    }

    public void returnBook (String... bookNames){
        System.out.println(SNP + " вернул(-а) книги: " + String.join(", ", bookNames));
    }

    public void returnBook (int quantity){
        System.out.println(SNP + " вернул(-а) " + quantity + " книги");
    }
}
