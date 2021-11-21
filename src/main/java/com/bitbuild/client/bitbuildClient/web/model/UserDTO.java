package com.bitbuild.client.bitbuildClient.web.model;





import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDTO extends  BasicDTO{
    private UUID id;
    private String email;
    private String password;
    private TypeUserEnum typeUser;
    private StatusUserEnum statusUser;

}
