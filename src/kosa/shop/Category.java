package kosa.shop;

public class Category implements Comparable<Category> {
	private int categoryId;
	private String categoryName;

	public Category() {
	}

	public Category(int categoryId, String categoryName) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	@Override
	public int compareTo(Category o) {
		// ī�װ��� �������� ����
		if(categoryName.compareTo(o.categoryName) > 0 ) {
			return 1;
		} else if(categoryName.compareTo(o.categoryName) < 0) {
			return -1;
		}
		return 0;
	}

}
