class Solution
{
	public static int findMinDifference(List<String> timePoints) {
	    int[] minutes = timePoints.stream().mapToInt((s) -> {
	      String[] value = s.split(":");
	      return 60 * Integer.parseInt(value[0]) + Integer.parseInt(value[1]);
	    }).sorted().toArray();

	    int min = IntStream.range(0, minutes.length - 1)
	        .map(i -> minutes[i + 1] - minutes[i])
	        .min()
	        .getAsInt();

	    int corner = minutes[0] + (1440 - minutes[minutes.length - 1]);
	    return Math.min(min, corner);
	}
	public static void main(String[] args)
	{
		List<String> list=new ArrayList<>();
		list.add("23:59");
		list.add("00:00");
		int s=findMinDifference(list);
		System.out.println(s);
	}
}