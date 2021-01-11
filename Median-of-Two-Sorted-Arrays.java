class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int i=0, j=0, z=0;
        int n = nums1.length, m=nums2.length;
        int[] ans = new int[nums1.length + nums2.length];
        double m1=-1, m2=-1;
        if((n+m) % 2 == 1)  
        {  
            for (int c = 0; c <= (n+m)/2; c++) 
            {  
                if(i != n && j != m) 
                {  
                    if(nums1[i] > nums2[j])
                    {
                        m1 = nums2[j++];
                    }
                    else
                    {
                         m1= nums1[i++];
                    }
                } 
                else if(i < n) 
                {  
                    m1 = nums1[i];
                    i++;
                }  
                else
                {  
                    m1 = nums2[j++];  
                }  
            }  
            return m1*1.0;  
        }  
        //even
        else 
        {  
            for (int c = 0; c <= (n + m)/2; c++)  
            {  
                m2 = m1;  
                if(i != n && j != m) 
                {  
                    if(nums1[i] > nums2[j])
                    {
                        m1 = nums2[j++];
                    }
                    else
                    {
                         m1= nums1[i++];
                    }
                } 
                else if(i < n) 
                {  
                    m1 = nums1[i];
                    i++;
                }  
                else
                {  
                    m1 = nums2[j++];  
                }
            }  
            return (m1 + m2)/2.0;
        }
    }
}