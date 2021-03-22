package jpabook.jpashop.controller;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Getter @Setter
public class MemberForm {

    @NotEmpty(message = "회원 이름은 필수 입니다.")
    private String name;
    @NotEmpty(message = "도시명은 필수 입니다.")
    private String city;
    @NotEmpty(message = "회원 이름은 필수 입니다.")
    private String street;
    @NotEmpty(message = "회원 이름은 필수 입니다.")
    private String zipcode;
}
