package java100.app.domain;

import java.sql.Date;

public class PostScript {
    protected int rentNo;
    protected String contents;
    protected Date createdDate;
    
    public PostScript() {}

    public PostScript(int rentNo, String contents, Date createdDate) {
        this.rentNo = rentNo;
        this.contents = contents;
        this.createdDate = createdDate;
    }
    
    @Override
    public String toString() {
        return "PostScript [rentNo=" + rentNo + ", contents=" + contents + ", createdDate=" + createdDate + "]";
    }
    
    public int getRentNo() {
        return rentNo;
    }
    public void setRentNo(int rentNo) {
        this.rentNo = rentNo;
    }
    public String getContents() {
        return contents;
    }
    public void setContents(String contents) {
        this.contents = contents;
    }
    public Date getCreatedDate() {
        return createdDate;
    }
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
    
    
}
