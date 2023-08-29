package src.HFDPPractice.Chpt2;

import java.util.ArrayList;

public class Quote extends StandardChannel{

    private final ArrayList<String> quotes;
    private int number;

    Quote() {
        this.quotes = new ArrayList<String>();
        // https://en.wikiquote.org/wiki/Albert_Einstein
        this.quotes.add("No one can read the Gospels without feeling the actual presence of Jesus. His personality pulsates in every word. No myth is filled with such life.");
        this.quotes.add("It is quite possible to be both. I look upon myself as a man. Nationalism is an infantile disease. It is the measles of mankind.");
        this.quotes.add("Life is like riding a bicycle. To keep your balance you must keep moving.");
        this.quotes.add("It can scarcely be denied that the supreme goal of all theory is to make the irreducible basic elements as simple and as few as possible without having to surrender the adequate representation of a single datum of experience.");
        this.quotes.add("The most incomprehensible thing about the world is that it is at all comprehensible.");
        this.quotes.add("Great spirits have always encountered violent opposition from mediocre minds. The mediocre mind is incapable of understanding the man who refuses to bow blindly to conventional prejudices and chooses instead to express his opinions courageously and honestly.");
    }

    @Override
    public void update() {

        if (!(this.subject instanceof  DataFetchable))
            return;

        this.number = ((DataFetchable) this.subject).getData();
        this.printNews();
    }

    public void printNews() {
        System.out.println("- Quote: \"" + this.getDailyQuote() + "\"");
    }

    public String getDailyQuote() {
        return this.quotes.get(this.number % this.quotes.size());
    }
}
