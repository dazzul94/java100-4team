package java100.app.domain;

import java.util.List;

public class User {  
    
    protected int userNo;
    protected String userId;
    protected String email;
    protected String password;
    protected String bank;
    protected String accountNo;
    protected String userName;
    protected String comment;
    protected String phone;
    protected String postNo;
    protected String baseAddress;
    protected String detailAddress;
    protected List<Photo> photos;
    
    @Override
    public String toString() {
        return "User [userNo=" + userNo + ", userId=" + userId + ", email=" + email + ", password=" + password
                + ", bank=" + bank + ", accountNo=" + accountNo + ", userName=" + userName + ", comment=" + comment
                + ", phone=" + phone + ", postNo=" + postNo + ", baseAddress=" + baseAddress + ", detailAddress="
                + detailAddress + ", photos=" + photos + "]";
    }

    public int getUserNo() {
        return userNo;
    }

    public void setUserNo(int userNo) {
        this.userNo = userNo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPostNo() {
        return postNo;
    }

    public void setPostNo(String postNo) {
        this.postNo = postNo;
    }

    public String getBaseAddress() {
        return baseAddress;
    }

    public void setBaseAddress(String baseAddress) {
        this.baseAddress = baseAddress;
    }

    public String getDetailAddress() {
        return detailAddress;
    }

    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }
    
    
   
    
    
    
    
}
