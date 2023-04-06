package com.vo2dto;

public class Test {
    public static void main(String[] args) {
        UserVO userVO = new UserVO();
        UserDTO userDTO = new UserDTO();
        userDTO.setNameDTO(userVO.getNameVO());
        userDTO.setName(userVO.getName());
        userDTO.setId(userVO.getId());

    }
}
