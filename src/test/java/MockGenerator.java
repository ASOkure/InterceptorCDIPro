import javax.enterprise.inject.Alternative;

import com.aksam.javaeeapp.Loggable;

@Alternative
@ThirteenDigits
public class MockGenerator implements NumberGenerator {

	
	@Inject
	private Logger logger;
	@Loggable
	public String generateNumber() {
	String mock = "MOCK-" + Math.abs(new Random().nextInt());
	logger.info("Generated Mock : " + mock);
	return mock;
	
	}
	
}
