package com.wq.sbp.model;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.beans.BeanUtils;

import com.wq.sbp.service.DtoToDoService;

/**
 * MemberDTO
 * 
 *
 * @author zwq
 * @date 2017年10月18日
 */
public class MemberDTO {

    @NotBlank
    private String uname;

    @NotBlank
    private String password;

    @Override
    public String toString() {
        return "MemberDTO [uname=" + uname + ", password=" + password + "]";
    }

    public MemberDO convertToMemberDO(MemberDTO s) {
        DtoToDoService<MemberDTO, MemberDO> convert = item ->{
            MemberDO t = new MemberDO();
            BeanUtils.copyProperties(item, t);
            return t;
        };
       return convert.dtoToDo(s);
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
