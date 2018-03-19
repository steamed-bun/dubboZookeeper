/**
 * 由数字基数词转为对应的字符串序数词
 * @param num
 * @returns {string}
 * @constructor
 */
function numToTimes(num) {
    switch (num){
        case 1: return "FIRST";
        case 2: return "SECOND";
        case 3: return "THIRD";
        default : return "END";
    }
}