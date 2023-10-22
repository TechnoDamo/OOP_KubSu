public class plane implements fly{
    int height;
    String model;
    plane()
    {
        model = "default plane";
        this.height = 10000;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public int getHeight()
    {
        return this.height;
    }
    @Override
    public void setHeight(int height)
    {
        this.height=height;
    }

}
