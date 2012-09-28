package in.edureka.simplestore;

import in.edureka.utils.StringSplitter;

public class MerchandiseBasic {
	private String _name;
	private String _price;
	private String _itemCategory;
	
	protected final static int _posCategory = 0;
	protected final static int _posName = _posCategory + 1;
	protected final static int _posPrice = _posName + 1;
	protected final static int _lastColumn = _posPrice;

	public MerchandiseBasic() {
		this(null,null,null);
	}
	
	public MerchandiseBasic(String name, String price, String category) {
		this._name = name;
		this._price = price;
		this._itemCategory = category;
	}

	public MerchandiseBasic(MerchandiseBasic basicItem) {
		this(basicItem.get_name(),
				basicItem.get_price(),
				basicItem.get_itemCategory());
	}
	
	public MerchandiseBasic(String name, String category) {
		this(name,null,category);
	}
	
	@Override 
	public boolean equals(Object other) {
        boolean result = false;
        if (other instanceof MerchandiseBasic) {
        	MerchandiseBasic that = (MerchandiseBasic) other;
            result = (this.get_name() == that.get_name() &&
            		this.get_itemCategory() == that.get_itemCategory());
        }
        return result;
    }
	
	public String get_name() {
		return _name;
	}

	public void set_name(String _name) {
		this._name = _name;
	}

	public String get_price() {
		return _price;
	}

	public void set_price(String price) {
		this._price = price;
	}

	public String get_itemCategory() {
		return _itemCategory;
	}

	public void set_itemCategory(String category) {
		this._itemCategory = category;
	}
	
	public static MerchandiseBasic getObj(String str) {
		
		MerchandiseBasic tempObj = new MerchandiseBasic();
        
        String[] temp = StringSplitter.split(str);

		tempObj.set_itemCategory(temp[_posCategory]);
		tempObj.set_name(temp[_posName]);
		tempObj.set_price(temp[_posPrice]);
		
		return tempObj;
	}

}
