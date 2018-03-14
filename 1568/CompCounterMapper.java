package sf.cctr.hadoop;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class CompCounterMapper extends Mapper<LongWritable, Text, IntWritable, IntWritable>{

	@SuppressWarnings("null")
	public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
		
		String record = value.toString();
		String[] fields = record.split("[,]");
		
		String datetime = fields[3];
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat df = new SimpleDateFormat("yyyy");
		
		Date date = null;
		try {
			date = format.parse(datetime);
		} catch (ParseException e) {
			e.printStackTrace();
		}
			int year = Integer.parseInt(df.format(date));		
		
		int complNum = 0;
		String comp = null; 
		
		for(int i=5;i<fields.length;i++) {
			if (comp.equals("complaint")){
			        complNum += 1;  
			} 
		}
		context.write(new IntWritable(year), new IntWritable(complNum));
	}

}

