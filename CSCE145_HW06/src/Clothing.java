/*
 * Nitin Bhupatiraju
 */
public class Clothing {
    private String type;
    private String color;

    // Default values
    private static final String DEFAULT_TYPE = "Socks";
    private static final String DEFAULT_COLOR = "Black";

    // Valid values
    private static final String[] VALID_TYPES = {"Undergarment", "Socks", "Stockings", "Top", "Bottom", "Cape"};
    private static final String[] VALID_COLORS = {"Brown", "Red", "Pink", "Black", "White", "Orange", "Green", "Blue", "Purple", "Grey"};

    // Constructors
    public Clothing() {
        this.type = DEFAULT_TYPE;
        this.color = DEFAULT_COLOR;
    }

    public Clothing(String type, String color) {
        this.type = isValidType(type.trim()) ? capitalize(type.trim()) : DEFAULT_TYPE;
        this.color = isValidColor(color.trim()) ? capitalize(color.trim()) : DEFAULT_COLOR;
    }

    // Accessors
    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    // Mutators
    public void setType(String type) {
        this.type = isValidType(type.trim()) ? capitalize(type.trim()) : DEFAULT_TYPE;
    }

    public void setColor(String color) {
        this.color = isValidColor(color.trim()) ? capitalize(color.trim()) : DEFAULT_COLOR;
    }

    // toString method
    @Override
    public String toString() {
        return "[Clothing] Type: " + type + " Color: " + color;
    }

    // Equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Clothing clothing = (Clothing) obj;
        return type.equals(clothing.type) && color.equals(clothing.color);
    }

    // Helper methods
    private boolean isValidType(String type) {
        for (String validType : VALID_TYPES) {
            if (validType.equalsIgnoreCase(type)) return true;
        }
        return false;
    }

    private boolean isValidColor(String color) {
        for (String validColor : VALID_COLORS) {
            if (validColor.equalsIgnoreCase(color)) return true;
        }
        return false;
    }

    private String capitalize(String input) {
        if (input == null || input.isEmpty()) return input;
        return input.substring(0, 1).toUpperCase() + input.substring(1).toLowerCase();
    }
}