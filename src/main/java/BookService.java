import javax.inject.Inject;

@Loggable
public class BookService {


	@Inject @ThirteenDigits
	private NumberGenerator numberGenerator;
	public Book createBook(String title, Float price, String description, String number) {
	Book book = new Book(title, price, description, number);
	book.setNumber(numberGenerator.generateNumber());
	return book;
	}
}
