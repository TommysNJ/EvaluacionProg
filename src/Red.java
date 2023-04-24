import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class Red extends JFrame{
    private JPanel panel1;
    private JTabbedPane tabbedPane1;
    private JTextField fieldNombre;
    private JTextField fieldID;
    private JTextField fieldEdad;
    private JTextField fieldPrioridad;
    private JTextField fieldAmigos;
    private JButton agregarButton;
    private JButton agregarDatosButton;
    private JTextArea areaDatosPrede;
    private JTextArea areaCola;
    private JButton activarSiguienteButton;
    private JButton activarTodosButton;
    private JButton eliminarParticipanteButton;
    private JButton eliminarTodosLosParticipantesButton;
    private JButton restaurarÚltimoButton;
    private JButton restaurarTodosButton;
    private JButton mostrarColaDePrioridadButton;
    private JTextArea areaPrioridad;
    Queue<Persona> espera = new LinkedList<>();
    Queue<Persona> prioridad = new PriorityQueue<>();
    Stack<Persona> pila = new Stack<>();
    Persona p1 = new Persona ("Mario", 324342, 21, 10, 434);
    Persona p2 = new Persona ("Luis", 354353, 18, 56, 567);
    Persona p3 = new Persona ("Felipe", 323453, 20, 58, 210);
    Persona p4 = new Persona ("Marta", 365466, 17, 4, 110);
    Persona p5 = new Persona ("Camila", 397856, 19, 1, 140);
    Persona p6 = new Persona ("Oscar", 397834, 22, 21, 35);


    public Red(){
        setContentPane(panel1);

        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                areaCola.setText("");
                espera.add(new Persona(fieldNombre.getText(),Integer.parseInt(fieldID.getText()),
                        Integer.parseInt(fieldEdad.getText()), Integer.parseInt(fieldPrioridad.getText()),
                        Integer.parseInt(fieldAmigos.getText())));
                for (Persona imprimir:espera){
                    areaCola.append(imprimir.toString());
                }
            }
        });
        agregarDatosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!espera.isEmpty()){
                    areaDatosPrede.setText("No hay datos en la cola.");
                } else{
                    espera.offer(p1);
                    espera.offer(p2);
                    espera.offer(p3);
                    espera.offer(p4);
                    espera.offer(p5);
                    espera.offer(p6);
                    for (Persona imprimir:espera){
                        areaDatosPrede.append(imprimir.toString());
                    }
                }

            }
        });
        activarSiguienteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                prioridad.offer(espera.poll());
            }
        });
        activarTodosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                prioridad.addAll(espera);
            }
        });
        eliminarParticipanteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pila.push(prioridad.poll());
            }
        });
        eliminarTodosLosParticipantesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (Persona imprimir:prioridad){
                    pila.push(imprimir);
                }
            }
        });
        restaurarÚltimoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        restaurarTodosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        mostrarColaDePrioridadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (Persona imprimir:prioridad){
                    areaPrioridad.append(imprimir.toString());
                }
            }
        });
    }
}