package own.springframework.jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class JokerImpl implements Joker{

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokerImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String sayJoke() {return chuckNorrisQuotes.getRandomQuote();}
}
