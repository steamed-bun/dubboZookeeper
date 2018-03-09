<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="/scripts/plugins/jquery.js"></script>
<script type="application/javascript">
    $(document).ready(function(){
        $("button").click(function(){
/*            var users = [];
            var user1 = {
                "userId":1,
                "userName":"abc",
                "password":"addf",
                "age":12,
                "birth":"2017-08-23T02:30:52.295Z",
                "addresses":[
                    {
                        "addressId":1
                    },
                    {
                        "addressId":2
                    }
                ]
            };
            var addresses = [];
            var address1 = {"addressId":1};
            var address2 = {"addressId":2};
            addresses.push(address1);
            addresses.push(address2);
            console.log(JSON.stringify(addresses));
            var user2 = {
                "userId":2,
                "userName":"abc2",
                "password":"addf2",
                "age":12,
                "birth":new Date()
            };
            user2.addresses = addresses;
            users.push(user1);
            users.push(user2);
            console.log(users);
            console.log("JSON.stringify(user2)" + JSON.stringify(user2));
            $.ajax({

                type: "POST",
                url: 'testJson',
                data : JSON.stringify(user1),
                dataType:"json",
                contentType : 'application/json',
//                Accept:'application/json',
                success: function(data){
                    console.log(data);
                },
                error: function(res){
                    console.log(res);
                    console.log("fail");
                },
            });*/
//
//                Accept:'application/json',
//                contentType : 'application/json',
/*
            $.ajax({
                type: "POST",
                url: 'http://172.20.139.75:8094/activityTopicPK/page?id=135hjgfds',
//                url: 'http://172.20.132.182:8094/activityTopicPK/page?id=135hgfd',
                dataType:"jsonp",
                jsonpCallback: "showData",

                success: function(data){
                    console.log(data);
                },
                error: function(res){
                    console.log(res);
                    console.log("fail");
                },
            });
*/
            $.ajax({
                type: "POST",
                url: '/test2',
//                url: 'http://172.20.132.182:8094/activityTopicPK/page?id=135hgfd',
//                dataType:"jsonp",
//                jsonpCallback: "showData",
//                contentType : 'application/json; charset=utf-8',
//                dataType : 'json',
                success: function(data){
                    console.log(data);
                },
                error: function(res){
                    console.log(res);
                    console.log("fail");
                }
            });

        });
    });
    //				data : {"userName":"test"}
    /*

     $("button").click(function(){
     var user1 = {
     "userId":1,
     "userName":"abc",
     "password":"addf",
     "age":12,
     "birth":"2017-08-23T02:30:52.295Z",
     "addresses":[
     {
     "addressId":1
     },
     {
     "addressId":2
     }
     ]
     };
     $.ajax({
     url: "testJson",
     type: "POST",
     data : JSON.stringify(user1),
     dataType: "jsonp", //指定服务器返回的数据类型
     contentType : 'application/json',
     jsonpCallback: "showData",
     success: function (data) {
     var result = JSON.stringify(data); //json对象转成字符串
     console.log(data);
     alert('mmm')
     //                    $("#text").val(result);
     },
     error:function() {
     console.log('error')
     }
     });
     });*/
</script>
</head>
<body>
    <button>test</button>
</body>
</html>