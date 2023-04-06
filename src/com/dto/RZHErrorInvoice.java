package com.dto;

public class RZHErrorInvoice {
    private String invoiceCode;

    private String invoiceNumber;

    private String errorMessage;

    public String getInvoiceCode() {
        return invoiceCode;
    }

    public void setInvoiceCode(String invoiceCode) {
        this.invoiceCode = invoiceCode;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }



    @Override
    public String toString() {
        return "RZHErrorInvoice{" +
                "invoiceCode='" + invoiceCode + '\'' +
                ", invoiceNumber='" + invoiceNumber + '\'' +
                ", errorMessage='" + errorMessage + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RZHErrorInvoice that = (RZHErrorInvoice) o;

        if (invoiceCode != null ? !invoiceCode.equals(that.invoiceCode) : that.invoiceCode != null) return false;
        return invoiceNumber != null ? invoiceNumber.equals(that.invoiceNumber) : that.invoiceNumber == null;
    }

    @Override
    public int hashCode() {
        int result = invoiceCode != null ? invoiceCode.hashCode() : 0;
        result = 31 * result + (invoiceNumber != null ? invoiceNumber.hashCode() : 0);
        return result;
    }

    public RZHErrorInvoice(String invoiceCode, String invoiceNumber, String errorMessage) {
        this.invoiceCode = invoiceCode;
        this.invoiceNumber = invoiceNumber;
        this.errorMessage = errorMessage;
    }
}
