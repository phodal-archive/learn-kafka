package org.myorg.quickstart;

import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

public class StreamingJob {

	public static void main(String[] args) throws Exception {
		final StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
		env.execute("Flink Streaming Java API Skeleton");
	}
}
