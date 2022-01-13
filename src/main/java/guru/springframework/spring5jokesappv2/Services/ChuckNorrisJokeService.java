package guru.springframework.spring5jokesappv2.Services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisJokeService implements JokeService{
    @Override
    public String getJoke() {
        ChuckNorrisQuotes quote = new ChuckNorrisQuotes();
        return quote.getRandomQuote();
    }
}
