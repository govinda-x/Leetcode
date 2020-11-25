class Solution {
    public double average(int[] salary) 
    {
        if(salary.length<=2)
        {
            return (double)0.0000;
        }
        int n = salary.length;
        int c=0;
        double avg = 0;
        Arrays.sort(salary);
        for(int i =1; i<n-1; i++)
        {
            c++;
            avg+=salary[i];
        }

        double res = avg/c;
        return res;
    }
}
