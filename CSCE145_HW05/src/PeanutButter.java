/*
 * Nitin Bhupatiraju
 */
public class PeanutButter {
    private String name;
    private int calories;
    private boolean isCrunchy;

    public PeanutButter() 
    {
        this.name = "none";
        this.calories = 100;
        this.isCrunchy = false;
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
        if (calories >= 100 && calories <= 300) 
        {
            this.calories = calories;
        } else {
            this.calories = 100;
        }
    }

    public boolean isCrunchy() 
    {
        return isCrunchy;
    }

    public void setCrunchy(boolean isCrunchy) 
    {
        this.isCrunchy = isCrunchy;
    }

    @Override
    public boolean equals(Object obj) 
    {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        PeanutButter that = (PeanutButter) obj;
        return calories == that.calories &&
               isCrunchy == that.isCrunchy &&
               name.equalsIgnoreCase(that.name);
    }

    @Override
    public String toString() 
    {
        return "PeanutButter{name='" + name + "', calories=" + calories + ", isCrunchy=" + isCrunchy + "}";
    }
}