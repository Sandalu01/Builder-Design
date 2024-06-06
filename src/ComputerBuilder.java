public class ComputerBuilder {
    private String brand;
    private int ram;
    private int Dispalysize;
    private long Dispalayspace;

    public ComputerBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public ComputerBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public ComputerBuilder setDispalysize(int dispalysize) {
       this.Dispalysize = dispalysize;
        return this;
    }

    public ComputerBuilder setDispalayspace(long dispalayspace) {
        this.Dispalayspace = dispalayspace;
        return this;
    }

    public Computure getcomputer(){
        return new Computure(brand,ram,Dispalysize,Dispalayspace);
    }


}
