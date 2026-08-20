public class Principal {
    public static void main(String[] args) {
        Estudiante[] grupo = new Estudiante[3]; // 3 referencias null

        grupo[0] = new Estudiante("Ana", 8.5);
        grupo[1] = new Estudiante("Luis", 7.0);
        grupo[2] = new Estudiante("Marta", 9.2);

        for (Estudiante e : grupo) {
            System.out.println(e.nombre + ": " + e.nota);
        }
    }
}