package Modelo.DAO;

import Modelo.Agendamento;
import Modelo.Cliente;
import Modelo.Servico;
import Modelo.Usuario;
import java.util.ArrayList;

/**
 *
 * @author Tay
 */
public class Banco {
    
    public static ArrayList<Usuario> usuario;
    public static ArrayList<Cliente> cliente;
    public static ArrayList<Servico> servico;
    public static ArrayList<Agendamento> agendamento;
    
    
    public static void inicia(){
    
        //Instancia os Objetos
        usuario = new ArrayList<Usuario>();
        cliente = new ArrayList<Cliente>();
        servico = new ArrayList<Servico>();
        agendamento = new ArrayList<Agendamento>();
        
        //criando elementos
        
        Usuario usuario1 = new Usuario(1, "empress", 'M', "09/05/1996", "30212121", "cabelereira@empresssalon.com", "521454123", "empress", "administrador");
        Usuario usuario2 = new Usuario(2, "taih", 'M', "09/05/1996", "30212122", "estagiaria@empresssalon.com", "451244123", "estagiaria", "funcionario");
         
        Cliente cliente1 = new Cliente(1, "Suzana Santos", 'M', "30/01/1995", "30212126", "suzana@gmail.com", "5142487", "Rua Treze de Maio",  "45662216");
        Cliente cliente2 = new Cliente(2, "Paola Nunes", 'F', "30/08/1994", "30212127", "paolanunes@gmail.com", "5142487745", "Rua Cruz de Malta",  "45807000");
        Cliente cliente3 = new Cliente(3, "Gabriel Simoes", 'M', "24/04/1997", "30212128", "gabrielsimoes@gmail.com", "78451458", "Rua salobrnho 40",  "45662900");
        Cliente cliente4 = new Cliente(4, "Martha Magda", 'F', "20/08/1995", "30212130", "martinha@gmail.com", "2745487", "Rua Pedro Calmoes 170 ",  "45810000");
        Cliente cliente5 = new Cliente(5, "Angra Mainyu", 'F', "13/09/1992", "30212131", "angramainyiu@gmail.com", "4742487", "Rua Marilia Mendonca",  "45810000");
        Cliente cliente6 = new Cliente(6, "Tainah Marques", 'F', "17/08/1994", "302122324", "tayhmarques.00@gmail.com", "78512457", "Rua Joao e Maria",  "45662212");
        Cliente cliente7 = new Cliente(7, "Milena Sampaio", 'F', "25/03/1993", "302121292", "miihsampaio@gmail.com", "4658237314", "Rua Hernani Sa",  "45997800");
        Cliente cliente8 = new Cliente(8, "Aline Bomfim", 'F', "04/03/1990", "302121451", "alinebomfim@gmail.com", "8475123687", "Rua Cova da Moça",  "45810000");
        Cliente cliente9 = new Cliente(9, "Hiago Rios", 'M', "09/02/1998", "302121189", "hiagoriosc@gmail.com", "74595142487", "Rua Uesc",  "456629000");
        Cliente cliente10 = new Cliente(10, "Felipe Gabriel", 'M', "12/06/1999", "3021212478", "felipe@gmail.com", "845713647", "Rua nossa senhora 70",  "4521200000");
        
        Servico servico1 = new Servico(1, "Corte Simples", 180);
        Servico servico2 = new Servico(2, "Pintura", 150);
        Servico servico3 = new Servico(3, "Relaxamento", 65);
        Servico servico4 = new Servico(4, "Maquiagem", 150);
        Servico servico5 = new Servico(5, "Sombrancelhas", 40);
        Servico servico6 = new Servico(6, "Penteados", 100);

        Agendamento agendamento1 = new Agendamento(1, cliente1, servico2, 150, "14/07/2022 09:30");
        Agendamento agendamento2 = new Agendamento(2, cliente3, servico4, 150, "14/07/2022 10:00");
        Agendamento agendamento3 = new Agendamento(3, cliente4, servico1, 180, "14/07/2022 10:30");
        
        //Adiciona Elementos na lista
        usuario.add(usuario1);
        usuario.add(usuario2);
        
        cliente.add(cliente1);
        cliente.add(cliente2);
        cliente.add(cliente3);
        cliente.add(cliente4);
        cliente.add(cliente5);
        cliente.add(cliente6);
        cliente.add(cliente7);
        cliente.add(cliente8);
        cliente.add(cliente9);
        cliente.add(cliente10);
        
        servico.add(servico1);
        servico.add(servico2);
        servico.add(servico3);
        servico.add(servico4);
        servico.add(servico5);
        servico.add(servico6);
        
        agendamento.add(agendamento1);
        agendamento.add(agendamento2);
        agendamento.add(agendamento3);
        
    }
    
    
}
