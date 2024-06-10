package solidprinciples.singlereponsibility;

import java.math.BigDecimal;

public class Account {
    private Integer AccountNo;
    private String firstName;
    private BigDecimal totalAmount;

    public Account(Integer accountNo, String firstName, BigDecimal totalAmount) {
        AccountNo = accountNo;
        this.firstName = firstName;
        this.totalAmount = totalAmount;
    }

    public Integer getAccountNo() {
        return AccountNo;
    }

    public void setAccountNo(Integer accountNo) {
        AccountNo = accountNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "AccountNo='" + AccountNo + '\'' +
                ", firstName='" + firstName + '\'' +
                ", totalAmount=" + totalAmount +
                '}';
    }
}
