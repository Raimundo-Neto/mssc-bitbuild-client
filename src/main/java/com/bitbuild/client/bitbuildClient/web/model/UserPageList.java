package com.bitbuild.client.bitbuildClient.web.model;

import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class UserPageList extends PageImpl<UserDTO> {

    public UserPageList(List<UserDTO> content, Pageable pageable, long total) {
        super(content, pageable, total);
    }

    public UserPageList(List<UserDTO> content) {
        super(content);
    }
}
