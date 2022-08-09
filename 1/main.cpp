#include <cstdint>
#include <map>

class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        std::map<int, int> presented;
        size_t i = 0; 
        for (auto n : nums)
        {
            auto j = presented.find(target - n);
            if (j != presented.end())
            {
                vector<int> result(2);
                result[0] = i;
                result[1] = j->second;
                return result;
            }
            presented[n] = i++;
        }
        return vector<int>(0);
    }
};
