// problem is  we don't' want call the  the unnecessary arguments there fore
// we apply builder design pattern mathods



public class ComputerShop {
    public static void main(String[] args) {

        Computure sandalu =new Computure(

                "Asus",8,30,500);
        Computure nimal=new Computure(
                "Mac",4,56,855);

        // Apply the builder pattern

        Computure kamal=new ComputerBuilder().setBrand("mac book").setDispalayspace(456).getcomputer();
        Computure ranil =new ComputerBuilder().setRam(45).setDispalayspace(456).getcomputer();

        System.out.println(sandalu);
        System.out.println(nimal);
        System.out.println(kamal);
        System.out.println(ranil);
    }

}
