package soup3;

public class Soup implements Quantifiable{
    private static final int TAILLE = 10;  // Taille maximale de la soupe
    private Vegetable[] tab = new Vegetable[TAILLE];  // Tableau pour stocker les légumes
    private int count = 0;  // Nombre d'ingrédients dans la soupe
    private int calories;  // Total des calories

    // Constructeur de la soupe
    public Soup() {
        this.calories = 0;  // Initialisation des calories à 0
    }

    // Méthode pour ajouter un ingrédient à la soupe
    public void add(Vegetable obj) {
        if (count < TAILLE) {
            tab[count] = obj;
            count++;
        } else {
            System.out.println("L'inventaire est plein !!");
        }
    }

    // Méthode pour afficher les détails de la soupe
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Soupe \n").append("------\n");
        if (count == 0) {
            sb.append("Il n'y a pas d'ingrédients dans la soupe \n");
        } else {
            sb.append(calories).append(" calories \n");
            for (int i = 0; i < count; i++) {
                sb.append(tab[i].toString()).append("\n");  // Affichage des ingrédients
            }
        }
        sb.append("------\n");
        return sb.toString();
    }

    // Méthode pour obtenir le poids total des épluchures
    public double getPeelingWeight() {
        double weight = 0;
        for (int i = 0; i < count; i++) {
            weight += tab[i].getPeelingWeight();  // Additionne le poids des épluchures de chaque ingrédient
        }
        return weight;
    }

    @Override
    // Méthode pour calculer les calories totales de la soupe
    public int getCalories() {
        calories = 0;  // Réinitialiser les calories à 0 à chaque appel
        for (int i = 0; i < count; i++) {
            calories += tab[i].getCalories();  // Additionne les calories de chaque ingrédient
        }
        return calories;
    }
}
