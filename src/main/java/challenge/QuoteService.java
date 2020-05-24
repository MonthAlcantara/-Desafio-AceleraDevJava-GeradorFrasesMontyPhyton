package challenge;

import challenge.Quote;

public interface QuoteService {

	Quote getQuote();
	
	Quote getQuoteByActor(String actor);

}
