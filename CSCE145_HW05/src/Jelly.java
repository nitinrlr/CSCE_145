/*
 * Nitin Bhupatiraju
 */
public class Jelly {
    private String name;
    private int calories;
    private String fruitType;

    public Jelly() {
        this.name = "none";
        this.calories = 50;
        this.fruitType = "Grape";
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
        if (calories >= 50 && calories <= 200) 
        {
            this.calories = calories;
        } else {
            this.calories = 50;
        }
    }

    public String getFruitType() 
    {
        return fruitType;
    }

    public void setFruitType(String fruitType) 
    {
        if (fruitType.equalsIgnoreCase("Apple") || fruitType.equalsIgnoreCase("Blackberry") ||
            fruitType.equalsIgnoreCase("Grape") || fruitType.equalsIgnoreCase("Blueberry") || 
            fruitType.equalsIgnoreCase("Tomato")) {
            this.fruitType = fruitType;
        } else 
        {
            this.fruitType = "Grape";
        }
    }

    @Override
    public boolean equals(Object obj) 
    {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Jelly jelly = (Jelly) obj;
        return calories == jelly.calories &&
               name.equalsIgnoreCase(jelly.name) &&
               fruitType.equalsIgnoreCase(jelly.fruitType);
    }

    @Override
    public String toString() 
    {
        return "Jelly{name='" + name + "', calories=" + calories + ", fruitType='" + fruitType + "'}";
    }
}