package sn.seckader.fizzbuzz.lanceur;

import java.util.logging.Logger;
import java.util.stream.IntStream;

/**
 * Fizz et Buzz font référence à un nombre multiple de 3 et 5 respectivement. En
 * d'autres termes, si un nombre est divisible par 3, il est remplacé par fizz;
 * si un nombre est divisible par 5, il est remplacé par un buzz. Si un nombre
 * est simultanément un multiple de 3 et 5, le numéro est remplacé par "fizz
 * buzz".
 * 
 * @author Kader
 *
 */
public class Lanceur {

	private static final Logger log = Logger.getLogger(Lanceur.class.getName());

	public static void main(String[] args) {

		IntStream.rangeClosed(1, 100)
				.mapToObj(i -> i % 3 == 0 ? (i % 5 == 0 ? "Fizz-Buzz" : "Fizz") : (i % 5 == 0 ? "Buzz" : i))
				.forEach(i -> log.info(i.toString()));
	}

}
