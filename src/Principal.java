public class Principal {

    public static void main(String[] args) {

        VendaNacional vn1 = new VendaNacional("Notebook", "Eletronico", 3000.00, 20, 100.00, 2);
        VendaInternacional vi1 = new VendaInternacional("Placa de vídeo", "Hardware", 4000.00, 10, 200.00, 20.00, 4);

        System.out.println("Desconto Nacional: "+ vn1.calculaDesc());
        System.out.println("Total Nacional: "+ vn1.calculaTotal());
        System.out.println("Desconto Internacional: "+ vi1.calculaDesc());
        System.out.println("Total Internacional: "+ vi1.calculaTotal());
        System.out.println("\n");
        System.out.println(vn1);
        System.out.println("\n");
        System.out.println(vi1);

    }
}
