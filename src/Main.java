import java.util.ArrayList;
import java.util.List;

class Carta {
    private String palo;
    private int valor;

    public Carta(String palo, int valor) {
        this.palo = palo;
        this.valor = valor;
    }

    public int getValor() {
        return 0;
    }

    public Object getPalo() {
        return null;
    }

    public boolean estaEnBase() {
        return false;
    }

    // Getters y setters (si es necesario)

    // Implementa otros métodos según tus necesidades
}

class Columna {
    private List<Carta> cartas;

    public Columna() {
        this.cartas = new ArrayList<>();
    }

    public void agregarCarta(Carta carta) {
        cartas.add(carta);
    }

    // Implementa otros métodos para mover cartas, voltear, etc.

    public boolean esMovimientoValido(Columna destino) {
        if (cartas.isEmpty()) {
            return false; // No se puede mover desde una columna vacía
        }
        Carta cartaSuperior = cartas.get(cartas.size() - 1);
        if (destino.cartas.isEmpty()) {
            return true; // Puede mover a una columna vacía
        }
        Carta cartaDestino = destino.cartas.get(destino.cartas.size() - 1);
        return cartaSuperior.getValor() == cartaDestino.getValor() - 1 &&
                !cartaSuperior.getPalo().equals(cartaDestino.getPalo());
    }
}

class Solitario {
    private Columna[] columnas;
    private List<Carta> basePilas;

    public Solitario() {
        // Inicializa las columnas y las pilas de base
        // (crea las cartas, distribúyelas en las columnas, etc.)
    }

    public boolean haGanado() {
        // Verifica si todas las pilas de base tienen todas las cartas
        for (Carta carta : basePilas) {
            if (!carta.estaEnBase()) {
                return false;
            }
        }
        return true;
    }

    // Implementa otros métodos para jugar el solitario

    public static void main(String[] args) {
        // Crea una instancia de Solitario y comienza el juego
    }
}