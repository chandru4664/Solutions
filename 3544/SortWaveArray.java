package sf.com.sortarray;



public class SortWaveArray {
	
	public void sortWaveArray(int[] sortWaveArr){
		int temp =0;
		for(int i=0;i<=sortWaveArr.length-1;i+=2){
			if(sortWaveArr[i]>sortWaveArr[i+1]){
				continue;
			}else{
				temp = sortWaveArr[i];
				sortWaveArr[i] = sortWaveArr[i+1];
				sortWaveArr[i+1] = temp;
			}
		}
	}

	public static void main(String[] args) {
		SortWaveArray sWA =new SortWaveArray();
		int[] sortWaveArr= {10, 5, 6, 3, 2, 20, 100, 80};
		 sWA.sortWaveArray(sortWaveArr);
		for(int i:sortWaveArr)
			System.out.println(i+"i");
		
	}

}
