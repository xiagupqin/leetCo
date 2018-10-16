/*
    ����������  a <= b <= c 
    Ϊ����a+b+c == 0  ��������������Ȼ��O(n)ö��a
    Ȼ�����ÿ��a������O(n)ö��a�ұߵ���
    ����ܵ�ʱ�临�Ӷ�O(n^2)
*/

class Solution {
public:
    vector<vector<int> > threeSum(vector<int> &num) {
        sort(num.begin(),num.end());
        vector<vector<int> > res;
        int n = num.size();
        if(n < 3)   return res;
        for(int i = 0; i < n; i++){                             //ö��a
            if(i && num[i] == num[i-1])     continue;           //�ų��ظ��Ľ�
            int lhs = i+1,rhs = n-1;                            //b��c���±�
            while(rhs > lhs){                                   //O(n)ö��b��c
                 if(rhs != n-1 && num[rhs] == num[rhs+1])   rhs--;              //�ų��ظ��Ľ�
                 else if(lhs != i+1 && num[lhs] == num[lhs-1])      lhs++;      //�ų��ظ��Ľ�
                 else if(num[i] + num[lhs] + num[rhs] > 0)   rhs--;             
                 else if(num[i] + num[lhs] + num[rhs] < 0)   lhs++;
                 else{
                    res.push_back((vector<int>){num[i],num[lhs],num[rhs]});     //�ҵ���
                    lhs++;
                    rhs--;
                 }
            }
        }
        return res;
    }
};