package domaine;

public class ArticleService {

    Article[] catalog = new Article[] { new Article("001", "Super Bock", 2.50), new Article("002", "La Chouffe", 2.50),
	    new Article("003", "Delerium Tremens", 3.00), new Article("004", "Chardonnay", 10.00),
	    new Article("005", "St. Emilion", 15.00), new Article("006", "Tattinger", 30.00),
	    new Article("007", "Vodka", 16.00), new Article("008", "Rhum", 18.00),
	    new Article("009", "Tequila", 20.00) };

    public Article[] getCatalog() {

	return this.catalog;
    }
}
