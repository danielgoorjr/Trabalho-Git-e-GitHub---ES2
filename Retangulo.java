public class Retangulo {
  // Atributos
  float d1;
  float d2;

  // Métodos

  public void area(float d1, float d2) {
    float a = d1 * d2;
    System.out.println("A área do retângulo de lado " + d1 + " e " + d2 + " é: " + a);
  }

  public void perimetro(float d1, float d2) {
    float p = 2 * (d1 + d2);
    System.out.println("O perímetro do retângulo de lado " + d1 + " e " + d2 + " é: " + p);
  }

}
