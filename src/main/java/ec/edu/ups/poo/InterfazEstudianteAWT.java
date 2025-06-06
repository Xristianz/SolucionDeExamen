package ec.edu.ups.poo;

import java.awt.*;
import java.awt.event.*;

public class InterfazEstudianteAWT {

    private Frame frame;
    private TextField txtCedula;
    private TextField txtNombre;
    private TextField txtApellido;


    public InterfazEstudianteAWT() {
        frame = new Frame("Registro de Calificaciones");
        frame.setSize(400, 250);
        frame.setLayout(new BorderLayout());


        Panel panelSuperior = new Panel(new FlowLayout());
        panelSuperior.add(new Button("Agregar"));
        panelSuperior.add(new Button("Modificar"));
        panelSuperior.add(new Button("Eliminar"));
        frame.add(panelSuperior, BorderLayout.NORTH);


        Panel panelCentral = new Panel(new GridLayout(3, 2));
        panelCentral.add(new Label("Cédula:"));
        txtCedula = new TextField();
        panelCentral.add(txtCedula);

        panelCentral.add(new Label("Nombre:"));
        txtNombre = new TextField();
        panelCentral.add(txtNombre);

        panelCentral.add(new Label("Apellido:"));
        txtApellido = new TextField();
        panelCentral.add(txtApellido);
        frame.add(panelCentral, BorderLayout.CENTER);

        // Panel inferior
        Panel panelInferior = new Panel(new FlowLayout());
        Button btnGuardar = new Button("Guardar");
        Button btnCancelar = new Button("Cancelar");

        panelInferior.add(btnGuardar);
        panelInferior.add(btnCancelar);
        frame.add(panelInferior, BorderLayout.SOUTH);


        btnGuardar.addActionListener(e -> guardarDatos());

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                frame.dispose();
            }
        });

        frame.setVisible(true);
    }

    public void guardarDatos() {
        String cedula = txtCedula.getText();
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();

        System.out.println("Datos ingresados:");
        System.out.println("Cédula: " + cedula);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
    }

    public static void main(String[] args) {
        new InterfazEstudianteAWT();
    }
}