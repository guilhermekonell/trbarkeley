package trberkeley;

import java.text.ParseException;
import java.util.Scanner;

public class TrBerkeley {
    
    public static void main(String[] args) throws ParseException {
        Scanner ler = new Scanner(System.in);
        
        Relogio servidor = new Relogio();
        Relogio[] clientes = new Relogio[3];
        
        System.out.println("Digite a hora do servidor (XX:XX) : ");
        servidor.setHora(ler.nextLine());    
        servidor.setDiferenca(0);        
        
        for (int i = 0; i < clientes.length; i++) {
            clientes[i] = new Relogio();
            System.out.println("Digite a hora do cliente (XX:XX)"+ (i+1) +" : ");
            clientes[i].setHora(ler.nextLine());
        }
        
        Ajuste ajustar = new Ajuste();
          
        //Sincronizando os relogios
        ajustar.sincronizar(servidor, clientes);
        
        //Imprimindo novas horas
        ajustar.imprimirHora(servidor, clientes);
        
        ler.close();
    }
    
    
    
}
