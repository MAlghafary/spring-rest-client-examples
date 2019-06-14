package guru.springframework.springrestclientexamples.service;

import guru.springframework.api.domain.UserData;


public interface ApiService {
    UserData getUsers(int limit);
}
