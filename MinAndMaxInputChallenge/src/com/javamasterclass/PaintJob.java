package com.javamasterclass;

public class PaintJob {
	public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
		return getBucketCount((width * height), areaPerBucket, extraBuckets);
	}

	public static int getBucketCount(double width, double height, double areaPerBucket) {
		return getBucketCount((width * height), areaPerBucket, 0);
	}

	public static int getBucketCount(double area, double areaPerBucket) {
		return getBucketCount(area, areaPerBucket, 0);
	}

	public static int getBucketCount(double area, double areaPerBucket, int extraBuckets) {
		if(area <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
			return -1;
		}
		else {
			double requiredBuckets = Math.ceil(area / areaPerBucket);
			return (int)(requiredBuckets - extraBuckets);
		}
	}
}
