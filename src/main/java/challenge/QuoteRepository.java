package challenge;

public interface QuoteRepository {

   Quote findByActor(String actor);

   Quote findByQuote();

}
