package guru.springframework.springrestclientexamples.service;

import guru.springframework.api.domain.UserData;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class ApiServiceImpl implements ApiService {
    private RestTemplate restTemplate;
    private final String api_url;

    public ApiServiceImpl(RestTemplate restTemplate,@Value("${api_url}") String api_url){
        this.restTemplate = restTemplate;
        this.api_url = api_url;
    }

    @Override
    public UserData getUsers(int limit) {
        UriComponentsBuilder uriBuilder =   UriComponentsBuilder
                .fromUriString(api_url)
                .queryParam("limit",limit);

        UserData userData = restTemplate.getForObject(uriBuilder.toUriString(),UserData.class);
        return userData;
    }
}
