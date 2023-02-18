package example;

public class main {
    
	public static int COMPUTERFUNCTION(int a, int b) {
		return a^b;
	}
	
	public static String solution(int[][] input) {
		
		int[] stagePositions = new int[5];
		  int stagePositionsIndex = 0;
		  
		  String[] stageAns = new String[5];
		  int stageAnsIndex = 0;
		  
		  String ans = "";
		  
		  // stage 1
		  int stage1Prompt = input[0][4];
		  if(stage1Prompt == 1) {
			  ans+=input[0][1];
			  stagePositions[stagePositionsIndex++] = 1;
			  stageAns[stageAnsIndex++] = Integer.toString(input[0][1]);
			  
		  }
		  else if(stage1Prompt == 2) {
			  ans+=input[0][1];
			  stagePositions[stagePositionsIndex++] = 1;
			  stageAns[stageAnsIndex++] = Integer.toString(input[0][1]);

		  }
		  else if(stage1Prompt == 3) {
			  ans+=input[0][2];
			  stagePositions[stagePositionsIndex++] = 2;
			  stageAns[stageAnsIndex++] = Integer.toString(input[0][2]);
			  

		  }
		  else if(stage1Prompt == 4) {
			  ans+=input[0][3];
			  stagePositions[stagePositionsIndex++] = 3;
			  stageAns[stageAnsIndex++] = Integer.toString(input[0][3]);
		  }
		  
		  // stage 2
		  int stage2Prompt = input[1][4];
		  if(stage2Prompt == 1) {
			  
			  for(int j=0;j<=3;j++) {
				  if(input[1][j] == 4) {
					  ans+="4";
					  stagePositions[stagePositionsIndex++] = j;
					  stageAns[stageAnsIndex++] = "4";
				  }
			  }

		  }
		  else if(stage2Prompt == 2) {
			  ans+=input[1][stagePositions[0]];
			  stagePositions[stagePositionsIndex++] = stagePositions[0];
			  stageAns[stageAnsIndex++] = Integer.toString(input[1][stagePositions[0]]);
		  }
		  else if(stage2Prompt == 3) {
			  ans+=input[1][0];
			  stagePositions[stagePositionsIndex++] = 0;
			  stageAns[stageAnsIndex++] = Integer.toString(input[1][0]);
		  }
		  else if(stage2Prompt == 4) {
			  ans+=input[1][stagePositions[0]];
			  stagePositions[stagePositionsIndex++] = stagePositions[0];
			  stageAns[stageAnsIndex++] = Integer.toString(input[1][stagePositions[0]]);
		  }
		  
		// stage 3
		  int stage3Prompt = input[2][4];
		  if(stage3Prompt == 1) {
			  
			  ans+=stageAns[1];
			  for(int j = 0; j<=3; j++) {
				  if(stageAns[1].equals(Integer.toString(input[2][j]))) {
					  stagePositions[stagePositionsIndex++] = j;
					  stageAns[stageAnsIndex++] = stageAns[1];
				  }
			  }
			  
		  }
		  else if(stage3Prompt == 2) {
			  ans+=stageAns[0];
			  for(int j = 0; j<=3; j++) {
				  if(stageAns[0].equals(Integer.toString(input[2][j]))) {
					  stagePositions[stagePositionsIndex++] = j;
					  stageAns[stageAnsIndex++] = stageAns[0];
				  }
			  }
		  }
		  else if(stage3Prompt == 3) {
			  ans+=input[2][2];
			  stagePositions[stagePositionsIndex++] = 2;
			  stageAns[stageAnsIndex++] = Integer.toString(input[2][2]);
		  }
		  
		  else if(stage3Prompt == 4) {
			  
			  for(int j=0;j<=3;j++) {
				  if(input[2][j] == 4) {
					  ans+="4";
					  stagePositions[stagePositionsIndex++] = j;
					  stageAns[stageAnsIndex++] = "4";
				  }
			  } 
		  }
		  
		  
		  // stage 4 
		  int stage4Prompt = input[3][4];
		  if(stage4Prompt == 1) {
			  
			  ans+=input[3][stagePositions[0]];
			  stagePositions[stagePositionsIndex++] = stagePositions[0];
			  stageAns[stageAnsIndex++] = Integer.toString(input[3][stagePositions[0]]);
			  
		  }
		  else if(stage4Prompt == 2) {
			  ans+=input[3][0];
			  stagePositions[stagePositionsIndex++] = 0;
			  stageAns[stageAnsIndex++] = Integer.toString(input[3][0]);
		  }
		  else if(stage4Prompt == 3) {
			  ans+=input[1][stagePositions[1]];
			  stagePositions[stagePositionsIndex++] = stagePositions[1];
			  stageAns[stageAnsIndex++] = Integer.toString(input[1][stagePositions[1]]);
		  }
		  
		  else if(stage4Prompt == 4) {
			  
			  ans+=input[1][stagePositions[1]];
			  stagePositions[stagePositionsIndex++] = stagePositions[1];
			  stageAns[stageAnsIndex++] = Integer.toString(input[1][stagePositions[1]]);
			  
		  }
		  
		  // stage 5
		  int stage5Prompt = input[4][4];
		  if(stage5Prompt == 1) {
			  
			  ans+=input[4][stagePositions[0]];
			  stagePositions[stagePositionsIndex++] = stagePositions[0];
			  stageAns[stageAnsIndex++] = Integer.toString(input[4][stagePositions[0]]);
			  
		  }
		  else if(stage5Prompt == 2) {
			  ans+=input[4][stagePositions[1]];
			  stagePositions[stagePositionsIndex++] = stagePositions[1];
			  stageAns[stageAnsIndex++] = Integer.toString(input[4][stagePositions[1]]);
		  }
		  else if(stage5Prompt == 3) {
			  ans+=input[4][stagePositions[2]];
			  stagePositions[stagePositionsIndex++] = stagePositions[2];
			  stageAns[stageAnsIndex++] = Integer.toString(input[4][stagePositions[2]]);
		  }
		  else if(stage5Prompt == 4) {
			  ans+=input[4][stagePositions[3]];
			  stagePositions[stagePositionsIndex++] = stagePositions[3];
			  stageAns[stageAnsIndex++] = Integer.toString(input[4][stagePositions[3]]);
		  }

		  return ans;
		
	}
	
 
  public static void main(String args[]) {
	  int[][] input = {
			  {1,3,2,4,1},
			  {3,1,2,4,3},
			  {2,3,4,1,2},
			  {2,1,4,3,1},
			  {4,1,2,3,4}
			  };

	  
	  
	  System.out.println(solution(input));

	  
 
  }
}
