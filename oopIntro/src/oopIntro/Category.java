package oopIntro;

public class Category {
	//Önce bir kategoriyi kategori yapan özellikleri buraya koyuyoruz
	
	private int id;
	private String Name;
	
	public Category(int id, String name) {
		super();
		this.id = id;
		Name = name;
	}
	public Category() {
		// TODO Auto-generated constructor stub
	}
	//constructor vermeden yapmýþ oldumaþaðýda ama yukarýda constructor yaparakta bu degerleri verdirebiliri
	// bu da önemli olan degiþkenin okunabilir veya yazýlabilir olmasýna göre deðiþir.
	public int getId() {
		return this.id;
		
	}
	public void setId(int id) {// void bunun içi bir þey döndürmücem bir þey yapýcam demek not et bunlarý deftere 
		this.id=id;// vereceðim degeri buraya atýyacaðým
		
		
		
	}
	public String getName() {
		return this.Name+"!";
		
	}
	public void setName(String Name) {
		this.Name=Name;
		
	}
	///// yukarada yaptýgýmýz örneði saðtýk source ve getter ve setter ile yapabilirz
	
}
