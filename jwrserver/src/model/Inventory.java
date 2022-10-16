package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Inventory")
public class Inventory implements Serializable {

	private static final long serialVersionUID = 4801957816410214976L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "productCode")
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "itemsInStock")
	private int itemsInStock;

	@Column(name = "unitPrice")
	private float unitPrice;

	@Column(name = "shortDescription")
	private String shortDescription;

	@Column(name = "longDescription")
	private String longDescription;

	public Inventory() {
	}

	public Inventory(String name, int itemsInStock, float unitPrice, String shortDescription, String longDescription) {
		this.name = name;
		this.itemsInStock = itemsInStock;
		this.unitPrice = unitPrice;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getItemsInStock() {
		return itemsInStock;
	}

	public float getUnitPrice() {
		return unitPrice;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setItemsInStock(int itemsInStock) {
		this.itemsInStock = itemsInStock;
	}

	public void setUnitPrice(float unitPrice) {
		this.unitPrice = unitPrice;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	@Override
	public String toString() {
		return "id: " + id + "\nname: " + name + "\nitemsInStock: " + itemsInStock + "\nunitPrice: " + unitPrice
				+ "\nshortDescription: " + shortDescription + "\nlongDescription: " + longDescription;
	}

}
