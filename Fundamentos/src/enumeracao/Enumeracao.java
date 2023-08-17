package enumeracao;


public class Enumeracao {
    public static void main(String[] args) {
        
        Usuario usuario = new Usuario("Usuario01", "usuario01@gmail.com", true, TipoUsuarioEnum.TECNICO);
        System.out.println(usuario);
        
        Pedido pedido = new Pedido("Pedido Usuario01", 29.99, StatusEnum.EM_PREPARACAO.getStatus());
        System.out.println(pedido);
        pedido.setStatus(StatusEnum.EM_TRANSPORTE.getStatus());
        System.out.println(pedido);
        pedido.setStatus(StatusEnum.ENTREGUE.getStatus());
        System.out.println(pedido);
    }
}
