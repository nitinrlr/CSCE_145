/*
 * Nitin Bhupatiraju
 */
public class Bread {
    private String name;
    private int calories;
    private String type;

    public Bread() 
    {
        this.name = "none";
        this.calories = 50;
        this.type = "Whole Grain";
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        if (name != null) 
        {
            this.name = name;
        } else 
        {
            this.name = "none";
        }
    }

    public int getCalories() 
    {
        return calories;
    }

    public void setCalories(int calories) 
    {
        if (calories >= 50 && calories <= 250) 
        {
            this.calories = calories;
        } else 
        {
            this.calories = 50;
        }
    }

    public String getType() 
    {
        return type;
    }

    public void setType(String type) 
    {
        if (type.equalsIgnoreCase("Honey Wheat") || type.equalsIgnoreCase("White") ||
            type.equalsIgnoreCase("Whole Grain") || type.equalsIgnoreCase("Whole Wheat")) {
            this.type = type;
        } else 
        {
            this.type = "Whole Grain";
        }
    }

    @Override
    public boolean equals(Object obj) 
    {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Bread bread = (Bread) obj;
        return calories == bread.calories &&
               name.equalsIgnoreCase(bread.name) &&
               type.equalsIgnoreCase(bread.type);
    }

    @Override
    public String toString() 
    {
        return "Bread{name='" + name + "', calories=" + calories + ", type='" + type + "'}";
    }
}