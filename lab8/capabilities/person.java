public class person implements walk, eat, swim{
    int range, weight, depth;
    String name;
    person()
    {
        name = "Vadim P";
        this.range = 20000;
        this.weight = 1;
        this.depth = 3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getWeight()
    {
        return this.weight;
    }
    @Override
    public void setWeight(int weight)
    {
        this.weight=weight;
    }

    @Override
    public void setRange(int range) {
        this.range = range;
    }

    @Override
    public int getRange() {
        return range;
    }
    @Override
    public int getDepth() {
        return depth;
    }

    @Override
    public void setDepth(int depth) {
        this.depth = depth;
    }
}
