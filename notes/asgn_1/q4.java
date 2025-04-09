import java.util.List;
import java.util.Map;
class Country {
    String name;
    long population;

    public Country(String name, long population) {
        this.name = name;
        this.population = population;
    }

    @Override
    public String toString() {
        return "Country{name='" + name + "', population=" + population + "}";
    }
}

class BNode {
    Country country;
    BNode left;
    BNode right;

    public BNode(Country country) {
        this.country = country;
        this.left = null;
        this.right = null;
    }
}
class BST {
    BNode root;

    public BST() {
        this.root = null;
    }

    public void insert(Country country) {
        root = insertRec(root, country);
    }

    private BNode insertRec(BNode root, Country country) {
        if (root == null) {
            return new BNode(country);
        }

        if (country.population < root.country.population) {
            root.left = insertRec(root.left, country);
        } else if (country.population > root.country.population) {
            root.right = insertRec(root.right, country);
        }

        return root;
    }

    public List<Country> inOrderTraversal() {
        List<Country> result = new ArrayList<>();
        inOrderRec(root, result);
        return result;
    }

    private void inOrderRec(BNode root, List<Country> result) {
        if (root != null) {
            inOrderRec(root.left, result);
            result.add(root.country);
            inOrderRec(root.right, result);
        }
    }

    public Country findMax() {
        if (root == null) {
            return null;
        }
        BNode current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current.country;
    }

    public Country findMin() {
        if (root == null) {
            return null;
        }
        BNode current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.country;
    }
}
 public class q4{
    public static void main(String[] args) {
        BST bst = new BST();
        bst.insert(new Country("USA", 331000000));
        bst.insert(new Country("China", 1444216107));
        bst.insert(new Country("India", 1380004385));

        System.out.println("In-order traversal:");
        List<Country> inOrderList = bst.inOrderTraversal();
        for (Country country : inOrderList) {
            System.out.println(country);
        }

        Country maxPopulationCountry = bst.findMax();
        System.out.println("\nCountry with maximum population: " + maxPopulationCountry);

        Country minPopulationCountry = bst.findMin();
        System.out.println("Country with minimum population: " + minPopulationCountry);
    }
}




















