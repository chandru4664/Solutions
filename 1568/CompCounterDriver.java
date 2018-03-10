package sf.cctr.hadoop;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;


public class CompCounterDriver {

	public static void main(String[] args) {
	
		Configuration conf = new Configuration();
		try {
			
			Job job = Job.getInstance(conf);
			job.setJobName("Test3 MR");
			job.setJarByClass(CompCounterDriver.class);
			job.setMapperClass(CompCounterMapper.class);
			job.setReducerClass(CompCounterReducer.class);
			
			job.setInputFormatClass(TextInputFormat.class); //default
			
			job.setOutputKeyClass(IntWritable.class);
			job.setOutputValueClass(LongWritable.class);
			
			FileInputFormat.addInputPath(job, new Path(args[0]));
			FileOutputFormat.setOutputPath(job, new Path(args[1]));
			
			System.exit(job.waitForCompletion(true) ? 0 :1);

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

