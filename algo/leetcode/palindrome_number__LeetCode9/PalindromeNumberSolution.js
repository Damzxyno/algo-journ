const isPalindrome = function(x) {
    if (x < 0){
        return false
    }
    let xCopy = x;
    let revX = 0;
    while(xCopy > 0){
        console.log(revX)

        revX *= 10
        revX += xCopy % 10
        xCopy = Math.floor(xCopy / 10)
    }
    return revX == x;
};