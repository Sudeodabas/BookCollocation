import java.io.PrintStream;
import java.util.Iterator;
import java.util.TreeSet;
public class Main {
    public static void main(String[] args) {
        TreeSet<Book> books=new TreeSet<>();
        books.add(new Book("asdf",50,"sdf",505));
        books.add(new Book("qwer",40,"wer",404));
        books.add(new Book("zxcv",60,"xcv",606));
        books.add(new Book("rtyu",80,"tyu",808));
        books.add(new Book("klmn",90,"klm",909));

        Iterator var2=books.iterator();
        while (var2.hasNext()){
            Book a=(Book) var2.next();
            PrintStream var10000 = System.out;
            String var10001=a.getBookName();
            var10000.println(var10001+", "+a.getNumberOfPages());
        }
    }
}
