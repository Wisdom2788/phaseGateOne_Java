public class phaseGate2Two{
	public static void main(String []args){
	int[] nums = {8,1,5,4,5};

	for(int i =0; i <nums.length; i++){
	if (nums[i] % 2 == 0){
	nums[i] = 0;
}	else {
	nums[i] = 1;
}
}
	for(int i =0; i < nums.length; i++){
	System.out.print(nums[i]);
}
}

}