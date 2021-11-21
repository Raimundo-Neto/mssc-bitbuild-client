package com.bitbuild.client.bitbuildClient.web.client;

import com.bitbuild.client.bitbuildClient.web.model.UserDTO;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.UUID;

@Component
@ConfigurationProperties( value = "sfg.user",ignoreUnknownFields = false)
public class UserClient {
    private  String apiHost;
    public  final  String USER_PATH_V1="/api/v1/users/";
    private  final RestTemplate restTemplate;

    public UserClient(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public UserDTO getUserById(UUID userID){
        return  restTemplate.getForObject(apiHost+USER_PATH_V1+userID.toString(),UserDTO.class);
    }
    public URI  createUser(UserDTO userDTO){
        return  restTemplate.postForLocation(apiHost+USER_PATH_V1,userDTO);
    }

    public  void deleteUser(UUID userID){
        restTemplate.delete(apiHost+USER_PATH_V1+userID.toString());
    }

    public  void updateUser(UUID userID,UserDTO userDTO){
        restTemplate.put(apiHost+USER_PATH_V1+userID.toString(),userDTO);
    }

    public void setApiHost(String apiHost) {
        this.apiHost = apiHost;
    }

    public String getApiHost() {
        return apiHost;
    }
}
