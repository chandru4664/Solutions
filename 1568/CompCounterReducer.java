package sf.cctr.hadoop;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.mapreduce.Reducer;

public class CompCounterReducer extends Reducer<IntWritable, IntWritable, IntWritable, IntWritable>{

	public void reduce(IntWritable key, Iterable<IntWritable> values, Context context) throws IOException, InterruptedException {
		
		int complNum= 0;
		
		for(IntWritable value : values) {
			     complNum += value.get();
		}
		context.write(key, new IntWritable(complNum));
	}
	
}
