package challenge;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Quote {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String actor;

	private String quote;

	public Quote() {
	}

	public Quote(Integer id, String actor, String quote) {
		this.id = id;
		this.actor = actor;
		this.quote = quote;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public String getQuote() {
		return quote;
	}

	public void setQuote(String quote) {
		this.quote = quote;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Quote)) return false;
		Quote quote = (Quote) o;
		return Objects.equals(id, quote.id) &&
				Objects.equals(actor, quote.actor) &&
				Objects.equals(quote, quote.quote);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, actor, quote);
	}
}


