package com.example.springproject.dto;


public class MemberDTO {
    private String name;
    private String email;
    private String organization;


    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getOrganization() {
        return this.organization;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String toString() {
        return "MemberDTO(name=" + this.getName() + ", email=" + this.getEmail() + ", organization=" + this.getOrganization() + ")";
    }
}
