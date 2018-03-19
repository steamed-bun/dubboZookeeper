/**
 * 提示最大定制数量 - 1
 * @const
 * @type {number}
 */
var PROMPT_MAX = 4;
var PASSWORD = "老爸520";
/**
 * 首页通关密码输入提示
 * @type {{1: string, 2: string, 3: string}}
 */
var passwordPrompt = {
    1: "首页通关密码输入1",
    2: "首页通关密码输入2",
    3: "首页通关密码输入3"
};

/**
 * 首页通关密码输入后
 */
function password(){
    var passwordInput = document.getElementById("password").value;
    alert(passwordInput === PASSWORD);
    if (passwordInput === PASSWORD){
        alert("right");
    }else {
        var randomStr = Math.floor(Math.random() * PROMPT_MAX);
        alert(passwordPrompt[randomStr]);
    }
}

