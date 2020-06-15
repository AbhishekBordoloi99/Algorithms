public class Heap_sort
{
    public static void main(String args[])
    {
        int a[]={10,20,33,72,21,11,16};
        Heap_sort hs= new Heap_sort();
        int len=a.length;
        hs.sort(a,len);
    }
    public void sort(int A[],int len )
    {        
        for(int i= (int)(len/2)-1; i>=0;i--)
        {
            heapify(A, len, i);
        }
        
        for(int i=len-1;i>=0;i--)
        {
            int tmp=A[0];
            A[0]=A[i];
            A[i]=A[tmp];
            
            heapify(A, i, 0);
        }
        
        for(int i=0;i<len;i++)
        {
            System.out.println(A[i]);
        }
    }
    void heapify(int A[], int n, int i)
    {
        int lf=(2*i)+1, rh=(2*i)+2, largest=i;
        
        if(lf < n && A[lf]>A[largest])
        {
            largest=lf;
        }
        
        if(rh < n && A[rh]>A[largest])
        {
            largest=rh;
        }
        
        if(largest!=i)
        {
            int tmp=A[largest];
            A[largest]=A[i];
            A[i]=tmp;
            
            heapify(A, n, largest);
        }
    }
}