Replace O's with X's
Given a matrix mat of size N x M where every element is either 'O' or 'X'. Replace all 'O' or a group of 'O' with 'X' that are surrounded by 'X'.
A 'O' (or a set of 'O') is considered to be surrounded by 'X' if there are 'X' at locations just below, just above, just left and just right of it.

  
class Solution{
    static void dfs(int i,int j,char a[][],int n, int m){
        
        if(i < 0 || i>=n || j<0 || j>=m || a[i][j]!='O') return;
        a[i][j]='#';
        dfs(i-1,j,a,n,m);
        dfs(i+1,j,a,n,m);
        dfs(i,j-1,a,n,m);
        dfs(i,j+1,a,n,m);
    }
    static char[][] fill(int n, int m, char a[][])
    {
        // code here
        for(int i = 0;i<n;i++){
         if(a[i][0]=='O')  dfs(i,0,a,n,m);
         if(a[i][m-1]=='O')  dfs(i,m-1,a,n,m);
        }
        for(int j = 0;j<m;j++){
         if(a[0][j]=='O')  dfs(0,j,a,n,m);
         if(a[n-1][j]=='O')  dfs(n-1,j,a,n,m);
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(a[i][j]=='O') a[i][j]='X';
                if(a[i][j]=='#') a[i][j]='O';
            }
        }
        return a;
    }
}
