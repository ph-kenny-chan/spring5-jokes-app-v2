package guru.springframework.spring5jokesappv2.services;

import guru.springframework.norris.chuck.ChuckNorrisInfoContributor;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.info.Info;
import org.springframework.stereotype.Service;

@Service
public class JokeServicesImpl implements JokeService{
    @Override
    public String getJoke() {
        return new ChuckNorrisQuotes().getRandomQuote();
    }
}