public String complexNumberMultiply(String a,String b)
	{
		int aPlusIndex=a.indexOf('+');//a
		int aIIndex=a.indexOf('i');
		int bPlusIndex=b.indexOf('+');
		int bIIndex=b.indexOf('i');
		
		int aReal=Integer.valueOf(a.substring(0, aPlusIndex));//a
		int aImag=Integer.valueOf(a.substring(aPlusIndex+1,aIIndex));//b
		int bReal=Integer.valueOf(b.substring(0, bPlusIndex));//c
		int bImage=Integer.valueOf(b.substring(bPlusIndex,bIIndex));//d
		
		return aReal*bReal-aImag*bImage+"+"+(aImag*bReal+aReal*bImage)+"i";
		
	}