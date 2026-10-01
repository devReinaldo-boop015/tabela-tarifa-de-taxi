import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class ControleDeAcesso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
 System.out.println("Controle de Acesso:");
 while(true){
        System.out.println("Digite a placa do veiculo:");
String placa=sc.nextLine();
if(placa.equalsIgnoreCase("SAIR")){
    System.out.println("Sistema encerrado.");
    break;
}
String placaAutorizada="TKB0H50";
String placaAutorizada2="ABC1D23";
String proprietario1="Reinaldo";
String proprietario2="Alberto";
if(placa.equalsIgnoreCase(placaAutorizada) ||
placa.equalsIgnoreCase(placaAutorizada2)){
    System.out.println("===ACESSO AUTORIZADO===");
    if(placa.equalsIgnoreCase(placaAutorizada)){
        System.out.println("Proprietario: "+proprietario1);
    }else{
        System.out.println("Proprietario: "+proprietario2);
    }
    System.out.println("Placa:"+placa);
LocalDateTime agora=LocalDateTime.now();
DateTimeFormatter formato=
DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
System.out.println("Data e hora:"+ agora.format(formato));

    System.out.println("Placa Autorizada!");
    System.out.println("Cancela Aberta!");
}else{
    System.out.println("Placa Não Autorizada!");
    System.out.println("Acesso negado.");
    System.out.println("Cancela Permanece Fechada.");

}
 }
}
 
}