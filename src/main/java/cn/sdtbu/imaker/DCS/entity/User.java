package cn.sdtbu.imaker.DCS.entity;

import java.util.Date;

public class User {
    private Integer uid; //uid
    private String userName; //用户名称/学号
    private String userPassword; //用户密码
    private Integer gender;  //性别
    private Date birthday;  //出生日期
    private String email;   //邮箱
    private String phone;   //电话
    private Integer userRole;    //用户角色
    private Date creationDate; //创建时间
    private Integer modifyBy;     //更新者
    private Date modifyDate;   //更新时间
    private Boolean banned;   //封禁

}
