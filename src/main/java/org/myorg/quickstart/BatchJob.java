package org.myorg.quickstart;

import org.apache.flink.api.java.ExecutionEnvironment;

public class BatchJob {

	public static void main(String[] args) throws Exception {
		final ExecutionEnvironment env = ExecutionEnvironment.getExecutionEnvironment();
		env.execute("Flink Batch Java API Skeleton");
	}
}
