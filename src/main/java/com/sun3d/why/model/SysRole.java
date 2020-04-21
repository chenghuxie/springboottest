package com.sun3d.why.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by xiech on 2018/2/6 0006.
 */
@Entity
public class SysRole implements Serializable {
    private static final long serialVersionUID = 2771579311932111421L;

    @Id@GeneratedValue
    private Long id;

    private String role;

    private String description;

    private Boolean available=Boolean.FALSE;

    //角色 -- 权限关系：多对多关系;
    @ManyToMany(fetch= FetchType.EAGER)
    @JoinTable(name="SysRolePermission",joinColumns={@JoinColumn(name="roleId")},inverseJoinColumns={@JoinColumn(name="permissionId")})
    private List<SysPermission> permissions;
    // 用户 - 角色关系定义;
    @ManyToMany
    @JoinTable(name="SysUserRole",joinColumns={@JoinColumn(name="roleId")},inverseJoinColumns={@JoinColumn(name="uid")})
    private List<UserInfo> userInfos;// 一个角色对应多个用户

    public List<SysPermission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<SysPermission> permissions) {
        this.permissions = permissions;
    }

    public List<UserInfo> getUserInfos() {
        return userInfos;
    }

    public void setUserInfos(List<UserInfo> userInfos) {
        this.userInfos = userInfos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "SysRole{" +
                "id=" + id +
                ", role='" + role + '\'' +
                ", description='" + description + '\'' +
                ", available=" + available +
                ", permissions=" + permissions +
                '}';
    }
}
