/*
 * Nitin Bhupatiraju
 */
public class Dresser {
    private Clothing[][] clothes;

    // Constructor
    public Dresser() {
        clothes = new Clothing[5][10];
    }

    // Add method
    public void add(Clothing clothing) {
        int drawerIndex = getDrawerIndex(clothing.getType());
        if (drawerIndex == -1) return;

        for (int i = 0; i < clothes[drawerIndex].length; i++) {
            if (clothes[drawerIndex][i] == null) {
                clothes[drawerIndex][i] = clothing;
                return;
            }
        }
        System.out.println("Drawer for " + clothing.getType() + " is full.");
    }

    // Remove method
    public void remove(Clothing clothing) {
        for (int i = 0; i < clothes.length; i++) {
            for (int j = 0; j < clothes[i].length; j++) {
                if (clothes[i][j] != null && clothes[i][j].equals(clothing)) {
                    clothes[i][j] = null;
                    return;
                }
            }
        }
        System.out.println("Clothing item not found.");
    }

    // Print method
    public void print() {
        for (int i = 0; i < clothes.length; i++) {
            System.out.println("Drawer " + (i + 1) + ":");
            for (int j = 0; j < clothes[i].length; j++) {
                if (clothes[i][j] != null) {
                    System.out.println("  " + clothes[i][j]);
                }
            }
        }
    }

    // Helper method to get drawer index
    private int getDrawerIndex(String type) {
        switch (type) {
            case "Undergarment": return 0;
            case "Socks": case "Stockings": return 1;
            case "Top": return 2;
            case "Bottom": return 3;
            case "Cape": return 4;
            default: return -1;
        }
    }
}