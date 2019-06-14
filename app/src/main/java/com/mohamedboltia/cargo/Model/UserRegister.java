package com.mohamedboltia.cargo.Model;

public class UserRegister {

    private String Email,Name,password,type,tax_card,tax_file_number,tax_register_number,fax,image,address,cargo_specialization;

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTax_card() {
        return tax_card;
    }

    public void setTax_card(String tax_card) {
        this.tax_card = tax_card;
    }

    public String getTax_file_number() {
        return tax_file_number;
    }

    public void setTax_file_number(String tax_file_number) {
        this.tax_file_number = tax_file_number;
    }

    public String getTax_register_number() {
        return tax_register_number;
    }

    public void setTax_register_number(String tax_register_number) {
        this.tax_register_number = tax_register_number;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCargo_specialization() {
        return cargo_specialization;
    }

    public void setCargo_specialization(String cargo_specialization) {
        this.cargo_specialization = cargo_specialization;
    }
}
