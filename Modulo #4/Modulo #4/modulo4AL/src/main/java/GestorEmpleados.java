import java.util.ArrayList;
import java.util.List;

class GestorEmpleados {
    private List<Empleado> listaEmpleados;

    public GestorEmpleados() {
        listaEmpleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        listaEmpleados.add(empleado);
    }

    public void mostrarDetallesEmpleados() {
        if (listaEmpleados.isEmpty()) {
            System.out.println("No hay empleados en el sistema.");
            return;
        }
        for (Empleado empleado : listaEmpleados) {
            empleado.imprimirInformacion();
            System.out.println("--------------------");
        }
    }

    public void modificarEmpleado(String nombreEmpleado, int nuevaEdad, double nuevoSalario) {
        for (Empleado empleado : listaEmpleados) {
            if (empleado.obtenerNombre().equalsIgnoreCase(nombreEmpleado)) {
                empleado.establecerEdad(nuevaEdad);
                empleado.establecerSalario(nuevoSalario);
                System.out.println("Empleado modificado correctamente.");
                return;
            }
        }
        System.out.println("Empleado no encontrado.");
    }
}