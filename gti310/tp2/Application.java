package gti310.tp2;

import gti310.tp2.audio.WavAudioFilter;

/**
 * @author Andres Ponce De Leon
 * @author Lauriane Michaud
 */
public class Application {

	/**
	 * Launch the application
	 * @param args This parameter is ignored
	 */
	public static void main(String args[]) {
		System.out.println("Audio Resample project!");
		WavAudioFilter convert = new WavAudioFilter(args);
		convert.process();
	}
}
