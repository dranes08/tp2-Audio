package gti310.tp2.audio;

import java.io.FileNotFoundException;

import gti310.tp2.io.FileSink;
import gti310.tp2.io.FileSource;

/**
 * An AudioFilter object will modify the input data and produce new values.
 * Each AudioFilter will specify its data source and data sink. Sources and
 * Sinks are not required : the filter may produce random data, or receive
 * data change it and do nothing with it afterwards.
 * 
 * For more information on WAVE file format visit :
 * http://ccrma.stanford.edu/courses/422/projects/WaveFormat/
 * 
 * @author François Caron <francois.caron.7@ens.etsmtl.ca>
 */
public class WavAudioFilter implements AudioFilter {
	
	FileSource input_file;
	FileSink output_file;
	
	public WavAudioFilter(String[] fichier) {
		try {
			this.input_file = new FileSource(fichier[1]);
			this.output_file = new FileSink(fichier[2]);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Filter the input data.
	 * The function should make sure the input data is valid beforehand.
	 */
	public void process() {
		
	}
	
	
	/**
	 * Read the Header of Wav File.
	 * The function read the header of the Wav File.
	 */
	public void readHeader(){
		
	}
	
	/**
	 * Write the Header of Wav File.
	 * The function write the header of the Wav File.
	 */
	public void writeHeader(){
		
	}
}
