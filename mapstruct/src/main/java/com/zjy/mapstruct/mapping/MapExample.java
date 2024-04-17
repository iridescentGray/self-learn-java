package com.learn.mapstruct.mapping;

import com.learn.mapstruct.mapping.domain.User;
import com.learn.mapstruct.mapping.domain.UserDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
 * @author learn
 * @date 2022/5/19 13:17
 */
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MapExample {

    UserDTO toDto(User user);

    User toUser(UserDTO userDTO);
}
