const twoSum = function(nums, target) {
    const map = {}
    for(let i = 0; i < nums.length; i++){
        if (map[nums[i]] !== undefined){
            return [map[nums[i]], i]
        }
        map[target - nums[i]] = i
    }
    return [0, 0]
};