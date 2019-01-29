public static void main(String[] args)
	{
		String[] s= {"root/a 1.txt(abcd) 2.txt(efgh)", "root/c 3.txt(abcd)", "root/c/d 4.txt(efgh)", "root 4.txt(efgh)"};
		List<List<String>> st=findDuplicate(s);
		System.out.println(st.toString());
	}
	public static  List<List<String>> findDuplicate(String[] paths)
	{
		List<List<String>> tr=new ArrayList<>();
		Map<String,List<String>> data=new HashMap<>();
		for(String chunk:paths)
		{
			String[] chunks=chunk.split(" ");
			String basePath=chunks[0];
			for(int i=1;i<chunks.length;i++)
			{
				String file=chunks[i];
				String filename=file.substring(0, file.indexOf('('));
				String fullPath=basePath+"/"+filename;
				String contents=file.substring(file.indexOf('('));
				if(!data.containsKey(contents))
				{
					data.put(contents, new ArrayList<String>());
					
				}
				data.get(contents).add(fullPath);
			}
		}
		for(String contents:data.keySet())
		{
			if(data.get(contents).size()<2)
			{
				continue;
			}
			List<String> all=new ArrayList<String>();
			for(String path:data.get(contents))
			{
				all.add(path);
			}
			tr.add(all);
		}
		return tr;
	}