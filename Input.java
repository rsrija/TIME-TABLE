import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;


class Input {
	

	
		
	
    public static void main(String[] args) {
    	
    	Scanner input = new Scanner(System.in);
    	System.out.println("The number of courses=6 that are from 1-6");

System.out.println("The number of labs=2 which are 7,8");
System.out.println("The number of halfdays=1 on Saturday");

int i=0,j=0;

int [][][] newArray1=new int[6][7][20];


//For monday
newArray1[0][0][0]=1;
newArray1[0][1][0]=2;
newArray1[0][2][0]=6;
newArray1[0][3][0]=5;
newArray1[0][4][0]=4;
newArray1[0][5][0]=6;
newArray1[0][6][0]=3;
//For tuesday
newArray1[1][0][0]=6;
newArray1[1][1][0]=5;
newArray1[1][2][0]=1;
newArray1[1][3][0]=2;
newArray1[1][4][0]=3;
newArray1[1][5][0]=5;
newArray1[1][6][0]=4;
//For wednesday
newArray1[2][0][0]=0;
newArray1[2][1][0]=0;
newArray1[2][2][0]=2;
newArray1[2][3][0]=1;
newArray1[2][4][0]=3;
newArray1[2][5][0]=6;
newArray1[2][6][0]=1;
//For thursday
newArray1[3][0][0]=2;
newArray1[3][1][0]=1;
newArray1[3][2][0]=3;
newArray1[3][3][0]=4;
newArray1[3][4][0]=7;
newArray1[3][5][0]=7;
newArray1[3][6][0]=7;
//For friday
newArray1[4][0][0]=5;
newArray1[4][1][0]=6;
newArray1[4][2][0]=4;
newArray1[4][3][0]=3;
newArray1[4][4][0]=4;
newArray1[4][5][0]=5;
newArray1[4][6][0]=2;
//For saturday
newArray1[5][0][0]=8;
newArray1[5][1][0]=8;
newArray1[5][2][0]=8;
newArray1[5][3][0]=1;
newArray1[5][4][0]=0;
newArray1[5][5][0]=0;
newArray1[5][6][0]=0;

i=1;
for(j=0;j<6;j++)//Monday Section-2
{
	newArray1[0][j][1]=newArray1[0][i][0];
	newArray1[1][j][1]=newArray1[1][i][0];
	newArray1[2][j][1]=newArray1[2][i][0];
	newArray1[3][j][1]=newArray1[3][i][0];
	newArray1[4][j][1]=newArray1[4][i][0];
	i++;
}
newArray1[0][6][1]=newArray1[0][0][0];
newArray1[1][6][1]=newArray1[1][0][0];
newArray1[2][6][1]=newArray1[2][0][0];
newArray1[4][6][1]=newArray1[4][0][0];
newArray1[3][6][1]=newArray1[3][0][0];
for(j=0;j<4;j++)
{
	newArray1[5][j][1]=newArray1[5][j][0];
}

//section-3

int []index=new int[10];
for(int x=0;x<=5;x++)
{
	
    index[x]=(int)(1+Math.random()*6);
    if(x>0)
        for(int c=0;c<=x-1;c++)
            if(index[c]==index[x])
                x--;
}


for(i=0;i<7;i++)
{
	newArray1[0][i][2]=newArray1[0][index[i]][0];
	newArray1[1][i][2]=newArray1[1][index[i]][0];
	newArray1[2][i][2]=newArray1[2][index[i]][0];
	
}
for(i=0;i<4;i++)
{
	newArray1[4][i][2]=newArray1[4][index[i]][0];
	newArray1[5][i][2]=newArray1[1][index[i]][0];
	
}
j=4;
for(i=0;i<3;i++)
{
	
newArray1[3][i][2]=7;
newArray1[4][j][2]=8;
j++;
}
//section-3done
//section-4
for(int x=0;x<=5;x++)
{
	
    index[x]=(int)(1+Math.random()*6);
    if(x>0)
        for(int c=0;c<=x-1;c++)
            if(index[c]==index[x])
                x--;
}
for(i=0;i<7;i++)
{
	newArray1[0][i][3]=newArray1[0][index[i]][0];
	newArray1[1][i][3]=newArray1[1][index[i]][0];
	newArray1[2][i][3]=newArray1[2][index[i]][0];
	
}
j=4;
for(i=0;i<4;i++)
{
	newArray1[4][i][3]=newArray1[4][index[i]][0];
	newArray1[5][i][3]=newArray1[3][index[i]][0];
	j++;
}
j=4;
for(i=0;i<3;i++)
{
	
newArray1[3][i][3]=8;
newArray1[4][j][3]=7;
j++;
}
//section-4 done
//section-5,6
j=4;
for(i=0;i<3;i++)
{
	newArray1[1][i][4]=8;
	newArray1[0][j][4]=7; 
	newArray1[1][i][5]=7;
	newArray1[0][j][5]=8; j++;
	
}

for(int x=0;x<=5;x++)
{
	
    index[x]=(int)(1+Math.random()*6);
    if(x>0)
        for(int c=0;c<=x-1;c++)
            if(index[c]==index[x])
                x--;
}


for(i=0;i<7;i++)
{
	newArray1[2][i][4]=newArray1[2][index[i]][0];
	newArray1[3][i][4]=newArray1[3][index[i]][0];
	newArray1[4][i][4]=newArray1[4][index[i]][0];
	newArray1[2][i][5]=newArray1[2][index[i]][0];
	newArray1[3][i][5]=newArray1[3][index[i]][0];
	newArray1[4][i][5]=newArray1[4][index[i]][0];
	
}j=4;
for(i=0;i<4;i++)
{newArray1[1][j][4]=newArray1[1][index[i]][0];
newArray1[1][j][5]=newArray1[1][index[i]][0];
	newArray1[0][i][4]=newArray1[0][index[i]][0];
	newArray1[5][i][4]=newArray1[2][index[i]][0];
	newArray1[0][i][5]=newArray1[0][index[i]][0];
	newArray1[5][i][5]=newArray1[3][index[i]][0];
	
}

//section-5,6 done
//section-7,8
j=4;
for(i=0;i<3;i++)
{
	newArray1[2][i][6]=7;
	newArray1[1][j][6]=8; 
	newArray1[2][i][7]=8;
	newArray1[1][j][7]=7; j++;
	
}
for(int x=0;x<=5;x++)
{
	
    index[x]=(int)(1+Math.random()*6);
    if(x>0)
        for(int c=0;c<=x-1;c++)
            if(index[c]==index[x])
                x--;
}


for(i=0;i<7;i++)
{
	newArray1[0][i][6]=newArray1[0][index[i]][2];
	newArray1[3][i][6]=newArray1[2][index[i]][2];
	newArray1[4][i][6]=newArray1[1][index[i]][2];
	newArray1[0][i][7]=newArray1[0][index[i]][2];
	newArray1[3][i][7]=newArray1[2][index[i]][2];
	newArray1[4][i][7]=newArray1[1][index[i]][2];
	
}j=4;
for(i=0;i<4;i++)
{newArray1[2][j][6]=newArray1[1][index[i]][0];
newArray1[2][j][7]=newArray1[1][index[i]][0];
	newArray1[1][i][6]=newArray1[0][index[i]][0];
	newArray1[5][i][6]=newArray1[2][index[i]][0];
	newArray1[1][i][7]=newArray1[0][index[i]][0];
	newArray1[5][i][7]=newArray1[3][index[i]][0];
	
}
//section-7,8 done
//section-9,10
j=4;
for(i=0;i<3;i++)
{
	newArray1[3][i][8]=7;
	newArray1[4][j][8]=8; 
	newArray1[3][i][9]=8;
	newArray1[4][j][9]=7; j++;
	
}
for(int x=0;x<=5;x++)
{
	
    index[x]=(int)(1+Math.random()*6);
    if(x>0)
        for(int c=0;c<=x-1;c++)
            if(index[c]==index[x])
                x--;
}


for(i=0;i<7;i++)
{
	newArray1[0][i][8]=newArray1[0][index[i]][1];
	newArray1[1][i][8]=newArray1[2][index[i]][1];
	newArray1[2][i][8]=newArray1[1][index[i]][1];
	newArray1[0][i][9]=newArray1[0][index[i]][1];
	newArray1[1][i][9]=newArray1[2][index[i]][1];
	newArray1[2][i][9]=newArray1[1][index[i]][1];
	
}j=4;
for(i=0;i<4;i++)
{newArray1[3][j][8]=newArray1[0][index[i]][1];
newArray1[3][j][9]=newArray1[0][index[i]][2];
	newArray1[4][i][8]=newArray1[0][index[i]][0];
	newArray1[5][i][8]=newArray1[2][index[i]][0];
	newArray1[4][i][9]=newArray1[0][index[i]][0];
	newArray1[5][i][9]=newArray1[3][index[i]][0];
	
}
//section-9,10 done
//section-11-20

int k=0;//for all the saturdays	
for(i=10;i<20;i++)
{
	for(j=0;j<4;j++){
	newArray1[5][j][i]=newArray1[5][j][k];
}
	k++;
}

//code for all the remaining days
j=6;
k=0;
for(i=0;i<7;i++)
{   newArray1[0][i][10]=newArray1[0][j][0];
	newArray1[1][i][10]=newArray1[1][j][0];
	newArray1[2][i][10]=newArray1[2][j][0];
	newArray1[3][i][10]=newArray1[3][j][0];
	newArray1[4][i][10]=newArray1[4][j][0];
	
j--;
}
j=6;
k=0;
for(i=0;i<7;i++)
{   newArray1[0][i][11]=newArray1[0][j][1];
	newArray1[1][i][11]=newArray1[1][j][1];
	newArray1[2][i][11]=newArray1[2][j][1];
	newArray1[3][i][11]=newArray1[3][j][1];
	newArray1[4][i][11]=newArray1[4][j][1];
	
j--;
}
j=6;
k=0;
for(i=0;i<7;i++)
{   newArray1[0][i][12]=newArray1[0][j][2];
	newArray1[1][i][12]=newArray1[1][j][2];
	newArray1[2][i][12]=newArray1[2][j][2];
	newArray1[3][i][12]=newArray1[3][j][2];
	newArray1[4][i][12]=newArray1[4][j][2];
	
j--;
}
j=6;
k=0;
for(i=0;i<7;i++)
{   newArray1[0][i][13]=newArray1[0][j][3];
	newArray1[1][i][13]=newArray1[1][j][3];
	newArray1[2][i][13]=newArray1[2][j][3];
	newArray1[3][i][13]=newArray1[3][j][3];
	newArray1[4][i][13]=newArray1[4][j][3];
	
j--;
}
j=6;
k=0;
for(i=0;i<7;i++)
{   newArray1[0][i][14]=newArray1[0][j][4];
	newArray1[1][i][14]=newArray1[1][j][4];
	newArray1[2][i][14]=newArray1[2][j][4];
	newArray1[3][i][14]=newArray1[3][j][4];
	newArray1[4][i][14]=newArray1[4][j][4];
	
j--;
}
j=6;
k=0;
for(i=0;i<7;i++)
{   newArray1[0][i][15]=newArray1[0][j][5];
	newArray1[1][i][15]=newArray1[1][j][5];
	newArray1[2][i][15]=newArray1[2][j][5];
	newArray1[3][i][15]=newArray1[3][j][5];
	newArray1[4][i][15]=newArray1[4][j][5];
	
j--;
}
j=6;
k=0;
for(i=0;i<7;i++)
{   newArray1[0][i][16]=newArray1[0][j][6];
	newArray1[1][i][16]=newArray1[1][j][6];
	newArray1[2][i][16]=newArray1[2][j][6];
	newArray1[3][i][16]=newArray1[3][j][6];
	newArray1[4][i][16]=newArray1[4][j][6];
	
j--;
}
j=6;
k=0;
for(i=0;i<7;i++)
{   newArray1[0][i][17]=newArray1[0][j][7];
	newArray1[1][i][17]=newArray1[1][j][7];
	newArray1[2][i][17]=newArray1[2][j][7];
	newArray1[3][i][17]=newArray1[3][j][7];
	newArray1[4][i][17]=newArray1[4][j][7];
	
j--;
}
j=6;
k=0;
for(i=0;i<7;i++)
{   newArray1[0][i][18]=newArray1[0][j][8];
	newArray1[1][i][18]=newArray1[1][j][8];
	newArray1[2][i][18]=newArray1[2][j][8];
	newArray1[3][i][18]=newArray1[3][j][8];
	newArray1[4][i][18]=newArray1[4][j][8];
	
j--;
}
j=6;
k=0;
for(i=0;i<7;i++)
{   newArray1[0][i][19]=newArray1[0][j][9];
	newArray1[1][i][19]=newArray1[1][j][9];
	newArray1[2][i][19]=newArray1[2][j][9];
	newArray1[3][i][19]=newArray1[3][j][9];
	newArray1[4][i][19]=newArray1[4][j][9];
	
j--;
}


//section 11-20 done

for(int z=0;z<20;z++)
{
	System.out.print("SECTION-");
	System.out.println(z+1);
for(i=0;i<6;i++)
{
	for(j=0;j<7;j++)
	{
		System.out.print(newArray1[i][j][z]);
	}
	System.out.println();
	
}
System.out.println();
System.out.println();
System.out.println();
}


    }

}

	
