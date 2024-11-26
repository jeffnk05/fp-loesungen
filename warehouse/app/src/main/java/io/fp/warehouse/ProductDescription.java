package io.fp.warehouse;

public class ProductDescription {
    
    private String productGroup;
    private String descriptionText;

    public ProductDescription(String productGroup, String descriptionText){
        this.productGroup = productGroup;
        this.descriptionText = descriptionText;
    }
    
    public String getProductGroup() {
        return productGroup;
    }

    public void setProductGroup(String productGroup) {
        this.productGroup = productGroup;
    }

    public String getDescriptionText() {
        return descriptionText;
    }

    public void setDescriptionText(String descriptionText) {
        this.descriptionText = descriptionText;
    }

    @Override
	public String toString() {
		return descriptionText + " aus der Produktabteilung " + productGroup;
	}


}
