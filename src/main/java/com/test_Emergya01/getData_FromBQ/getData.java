package com.test_Emergya01.getData_FromBQ;

import com.google.cloud.bigquery.BigQuery;
import com.google.cloud.bigquery.BigQueryOptions;
import com.google.cloud.bigquery.Dataset;
import com.google.cloud.bigquery.DatasetInfo;


public class getData 
{
    public static void main( String[] args )
    {
    	
    	// Instantiates a client
    	BigQuery bigquery = BigQueryOptions.getDefaultInstance().toBuilder()
    			.setProjectId("mysite-ga-datastreaming-196008").build().getService();
    	
    	String datasetName = "GA_data";
    	
    	Dataset dataset = bigquery.getDataset(datasetName);
    	
    	System.out.printf("Datset %s fetched.%n", dataset.getDatasetId().getDataset());
    }
}
