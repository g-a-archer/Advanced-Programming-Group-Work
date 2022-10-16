package model;

import java.io.Serializable;

public class InvoiceItem implements Serializable {

	private static final long serialVersionUID = 4801957816410214976L;

	private Inventory productCode;

	private Invoice invoiceNum;

	private int quantity;

	public InvoiceItem() {
	}

	public InvoiceItem(Inventory productCode, int quantity) {
		this.productCode = productCode;
		this.quantity = quantity;
	}

	public Inventory getProductCode() {
		return productCode;
	}

	public Invoice getInvoiceNum() {
		return invoiceNum;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setProductCode(Inventory productCode) {
		this.productCode = productCode;
	}

	public void setInvoiceNum(Invoice invoiceNum) {
		this.invoiceNum = invoiceNum;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "productCode: " + productCode + "\nquantity: " + quantity;
	}

}
