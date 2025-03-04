package guru.springframework.springrestclientexamples.service;

import guru.springframework.api.domain.UserData;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiServiceImplTest {

    @Autowired
    ApiService  apiService;


    @Test
    public void testGetUsers() {
        UserData userData = apiService.getUsers(3);
        assertEquals(4,userData.getData().size());
    }
}