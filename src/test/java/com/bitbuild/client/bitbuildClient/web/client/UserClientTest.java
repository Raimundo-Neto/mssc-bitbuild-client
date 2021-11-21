package com.bitbuild.client.bitbuildClient.web.client;

import com.bitbuild.client.bitbuildClient.web.model.UserDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.URI;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserClientTest {

    @Autowired
    UserClient userClient;
    @Test
    void getUserById() {
        UserDTO dto = userClient.getUserById(UUID.randomUUID());
        assertNotNull(dto);
    }

    @Test
    void createUser(){
        UserDTO userDTO = UserDTO.builder().email("raimundodepteste@gmail.com").password("123456").build();
        URI  uri = userClient.createUser(userDTO);
        System.out.println(uri);
        assertNotNull(uri);

    }

    @Test
    void updateUser(){
        UserDTO userDTO = UserDTO.builder().password("atualizacao").email("test@atualizacao.com").build();
        userClient.updateUser(UUID.randomUUID(),userDTO);

    }

    @Test
    void  deleteUser(){
        userClient.deleteUser(UUID.randomUUID());

    }
}