/*
 * Nitin Bhupatiraju
 */
public class PBJSandwich {
    private Bread topSlice;
    private PeanutButter peanutButter;
    private Jelly jelly;
    private Bread bottomSlice;

    public PBJSandwich() 
    {
        this.topSlice = new Bread();
        this.peanutButter = new PeanutButter();
        this.jelly = new Jelly();
        this.bottomSlice = new Bread();
    }

    public Bread getTopSlice() {
        return topSlice;
    }

    public void setTopSlice(Bread topSlice) 
    {
        if (topSlice != null) this.topSlice = topSlice;
    }

    public PeanutButter getPeanutButter() 
    {
        return peanutButter;
    }

    public void setPeanutButter(PeanutButter peanutButter) 
    {
        if (peanutButter != null) this.peanutButter = peanutButter;
    }

    public Jelly getJelly() 
    {
        return jelly;
    }

    public void setJelly(Jelly jelly) 
    {
        if (jelly != null) this.jelly = jelly;
    }

    public Bread getBottomSlice() 
    {
        return bottomSlice;
    }

    public void setBottomSlice(Bread bottomSlice) 
    {
        if (bottomSlice != null) this.bottomSlice = bottomSlice;
    }

    @Override
    public boolean equals(Object obj) 
    {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        PBJSandwich that = (PBJSandwich) obj;
        return topSlice.equals(that.topSlice) &&
               peanutButter.equals(that.peanutButter) &&
               jelly.equals(that.jelly) &&
               bottomSlice.equals(that.bottomSlice);
    }

    @Override
    public String toString() 
    {
        return "PBJSandwich{" +
                "topSlice=" + topSlice +
                ", peanutButter=" + peanutButter +
                ", jelly=" + jelly +
                ", bottomSlice=" + bottomSlice +
                '}';
    }
}