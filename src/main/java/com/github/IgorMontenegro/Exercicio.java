package com.github.IgorMontenegro;
/**
* Exercício para aula2. E aula3
*
* @author Igor
* @version 1.0
* © Copyright Universidade Federal de Goiás
*/
public final class Exercicio {
/**
 *
 * @param n
 *         variável limite da soma dos naturais
 *
 * @return soma dos números naturais até n
 */
public static int somaNaturais(final int n) {
    if (n <= 0) {
        throw new IllegalArgumentException("Entrada inválida menor que 0)");
    }
    int i = 2;
    int s = 1;
    while (i <= n) {
        s = s + i;
        i++;
    }
return s;
}

/**
 * @param a
 *         quantidade do número de parcelas
 * @param b
 *         valor de parcela
 *
 * @return resultado
 */
public static int produto(final int a, final int b) {
    if (a <= 0 || b <= 0) {
        throw new IllegalArgumentException("Entrada inválida menor que 0)");
    }
    int totalParcelas = a;
    int parcela = b;
    if (b < a) {
        totalParcelas = b;
        parcela = a;
    }
    int i = 1;
    int s = 0;
    while (i <= totalParcelas) {
        s = s + parcela;
        i++;
    }
    return s;
}

/**
 * @param x
 *         número natural
 * @param y
 *         valor da potencia
 *
 * @return resultado da potencia usando soma
 */
public static int potencia(final int x, final int y) {
    if (x <= 0 || y <= 0) {
        throw new IllegalArgumentException("Entrada inválida menor que 0)");
    }
    int potencia = 1;
    int i = 1;
    while (i <= y) {
        potencia = produto(potencia, x);
        i++;
    }
    return potencia;
}

/**
 * @param n
 *         número válido
 *
 * @return booleano se o valor informado satisfaz ou nao a propriedade 3025
 */
public static boolean propriedade3025(final int n) {
    final int nMaximo = 9999;
    final int porcentagemMaxima = 100;
    if (n <= 0 || n >= nMaximo) {
        throw new IllegalArgumentException("Entrada inválida <0 ou >9999).");
    }
    int i = n / porcentagemMaxima;
    int j = n % porcentagemMaxima;

    return n == potencia(i + j, 2);
}

/**
 * @param n
 *         número válido
 *
 * @return booleano se o valor informado satisfaz ou nao a propriedade 153
 */
public static boolean propriedade153(final int n) {
    final int nMaximo = 9999;
    final int porcentagemMaxima = 100;
    final int porcentagemAuxiliar = 10;
    final int varAux = 3;
    int entradaCalculada = 0;
    if (n <= 0 || n >= nMaximo) {
        throw new IllegalArgumentException("Entrada inválida < 0 ou >9999).");
    }
    int i = n / porcentagemMaxima;
    int j = (n - (porcentagemMaxima * i)) / porcentagemAuxiliar;
    int k = n % porcentagemAuxiliar;
    entradaCalculada = potencia(i, varAux) + potencia(j, varAux);
    entradaCalculada = entradaCalculada + potencia(k, varAux);
    return n == entradaCalculada;
}

/**
 * @param n
 *         número válido
 *
 * @return booleano se o valor informado é ou nao a um numero primo
 */
public static boolean primo(final int n) {
    if (n < 1) {
        throw new IllegalArgumentException("Entrada inválido(numero < 1)");
    }

    int i = 2;
    while (i <= (n - 1)) {
        if (n % i == 0) {
            return false;
        }
        i++;
    }
    return true;
}

/**
 * @param n
 *         número válido
 *
 * @return número harmônico
 */
public static int numeroHarmonico(final int n) {
    if (n < 1) {
        throw new IllegalArgumentException("Entrada inválido(numero < 1)");
    }
    int i = 2;
    int s = 1;
    while (i <= n) {
        s = s + (1 / i);
        i++;
    }
    return s;
}

/**
* Exercicio PI.
*
* @param n
*            valor de calculo do pi
* @return valor para pi
*/
public static double pi(final int n) {
    final int valorMultiplicacao = 4;
    if (n < 1) {
        throw new IllegalArgumentException("O valor de n é menor que 1.");
    }
    double i = 1.0;
    double s = -1.0;
    double d = -1.0;
    double p = 0.0;

    while (i <= n) {
        d = d + 2;
        s = -1 * s;
        p = p + valorMultiplicacao * s / d;
        i++;
    }
    return p;
}

/**
 * Exercicio de calculo fatorial.
 *
 * @param n
 *            valor do calculo fatorial
 * @return valor fatorial
 */
public static int fatorial(final int n) {
    if (n < 1) {
        throw new IllegalArgumentException("O numero menor é que 0.");
    }
    int i = 2;
    int f = 1;
    while (i <= n) {
        f = f * i;
        i++;
    }
return f;
}

/**
 * Exercicio de calculo do Quadrado Perfeito como
 * base para calculo do logaritmo.
 *
 * @param k
 *            valor do calculo do quadrado perfeito
 *@return valor do quadrado perfeito.
 */
public static boolean quadradoPerfeito(final int k) {
    if (k < 1) {
        throw new IllegalArgumentException("K é menor que 1.");
    }
    int i = 1;
    int q = 1;
    while (q < k) {
        i = i + 2;
        q = q + i;
    }
    return q == k;
}

/**
 * Exercicio do calculo do resto de divisoes.
 *
 * @param x
 *            valor x da divisao
 * @param y
 *            valor y da divisao
 * @return valor do resto.
 */
public static int mod(final int x, final int y) {
    if (x < 0 || y < 0) {
        throw new IllegalArgumentException("Y ou X é menor que Zero.");
    }
    int s = x;
    while (y <= s) {
        s = s - y;
    }
    return s;
}

/**
 * Exercicio do calculo da Razao Aurea.
 *
 * @param x
 *            valor do calculo do logaritmo
 * @param y
 *            base do calculo do logaritmo
 *
 * @param k valor para calculo.
 * @return razao aurea do calculo
 */
public static int razaoAurea(final int x, final int y, final int k) {
    if (x < 0 || x < y || k < 0) {
        throw new IllegalArgumentException("Onde N é < 1, ou K é < 2.");
    }

    int c = y;
    int a = x;
    int i = 1;
    int t;
    while (i <= k) {
        t = c;
        c = c + a;
        a = t;
        i++;
    }
    return c / a;
}

/**
 * Exercicio para o calculo da funcao de fibonacci.
 *
 * @param n
 *           valor do calculo da funcao.
 * @return valor de fibonacci
 */
public static int fibonacci(final int n) {
    if (n < 0) {
        throw new IllegalArgumentException("Onde N é menor que zero.");
    }
    int a = 0;
    int c = 1;
    if ((n == 0) || (n == 1)) {
        return n;
    }
    int i = 2;
    int t;
    while (i <= n) {
        t = c;
        c = c + a;
        a = t;
        i++;
}
return c;
}

/**
 * Exercicio para o calculo de raiz quadrada.
 *
 * @param n
 *            valor do inteiro
 * @param i
 *            valor de indice
 * @return valor da raiz
 */
public static int raiz(final int n, final int i) {
    int index = i;
    if (n <= 0) {
        throw new IllegalArgumentException("Onde N é < que zero.");
    }
    int r = 1;
    while (0 <= index) {
        r = (r + (n / r)) / 2;
        index--;
    }
    return r;
}

/**
* Impossibilita a criação da instância.
*/
private Exercicio() {
}

}