<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>

<head>
<title>登录页面</title> 
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="css/login2.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery.min.js"></script>
</head>
<body>
<div class="login" style="margin-top:50px;">
    
    <div class="header">
        <div class="switch" id="switch"><a class="switch_btn" id="switch_qlogin" href="javascript:void(0);" tabindex="7">快速登录</a>
			<a class="switch_btn_focus" id="switch_login" href="javascript:void(0);" tabindex="8" >快速注册</a>
			<div class="switch_bottom" id="switch_bottom" style="position: absolute; width: 64px; right: 0px;"></div>
        </div>
    </div>    

  <!--注册-->
    <div class="qlogin" id="qlogin">
    <div class="web_login" >
	      <input type="hidden" name="to" value="reg"/> 
		      		       <input type="hidden" name="did" value="0"/> 
        <ul class="reg_form" id="reg-ul">
        		<div id="userCue" class="cue">
        		快速注册请注意格式	
        		</div> 
                <li>
                    <label for="user"  class="input-tips2">用户名：</label>
                    <div class="inputOuter2">
                        <input type="text" id="user"  name="username" value="${username }" maxlength="16" class="inputstyle2"/>
                    </div>
                    
                </li>
                
                <li>
                <label for="passwd" class="input-tips2">密码：</label>
                    <div class="inputOuter2">
                        <input type="password" id="passwd"  name="password" value="${password }" maxlength="16" class="inputstyle2"/>
                        
                    </div>
                    
                </li>
                <li>
                <label for="passwd2" class="input-tips2">确认密码：</label>
                    <div class="inputOuter2">
                        <input type="password" id="passwd2" name="password2" value="${password2 }" maxlength="16" class="inputstyle2" />
                        <span id="register_error1" style="color: red"></span>
                        <span id="register_error2" style="color: red"></span>
                        <span id="register_error3" style="color: green"></span>
                    </div>
                    
                </li>
                
               <!--  <li>
                 <label for="qq" class="input-tips2">QQ：</label>
                    <div class="inputOuter2">
                       
                        <input type="text" id="qq" name="qq" maxlength="10" class="inputstyle2"/>
                    </div>
                   
                </li> -->
                
                <li>
                    <div class="inputArea">
                        <input type="button" id="reg"  style="margin-top:10px;margin-left:85px;width:150px;" class="button_blue" value="马上注册" onclick="register()" /> 
                    </div>
                    
                </li><div class="cl"></div>
            </ul> 
    </div>
   
    
    </div>
    <!--注册end-->
</div>

</body>

<script type="text/javascript">
	
	function checkInfo(){
		var username = $("#user").val();
		var password = $("#passwd").val();
		var password2 = $("#passwd2").val();
		//判断用户输入是否合法 4到16位（字母，数字，下划线，减号）
		var regUsername = "^[a-zA-Z0-9_-]{4,16}$";
		var regBlank = new RegExp(regUsername);
		if(!regBlank.test(username)){//如果不符合校验
			$("#register_error1").html("用户名只能是4到16位的字母、数字、下划线、减号");
			return false;
		}
		//判断输入是否为null
		if("null" == username){
			$("#register_error1").html('用户名不能为NULL等非法字符');
			return false;
		}
		//判断前后面是否一致
		if(password != password2){
			$("#register_error1").html('前后密码不一致');
			return false;
		}
		//判断密码是否符合规则
		var regPass = "^[\w_-]{6,16}$";
		var regPassword = new RegExp(regPass);
		if(regPassword.test(password)){//如果不符合校验
			$("#register_error1").html("密码只能是6到16位的字母、数字、下划线、减号");
			return false;
		}
		return true;
	}

	function register(){//点击注册按钮触发的事件
		//清除之前的信息
		$("#register_error1").html("");
		$("#register_error2").html("");
		$("#register_error3").html("");
		var flag = checkInfo();
		//获取用户的输入名和密码
		var username = $("#user").val();
		var password = $("#passwd").val();

		if(flag){//如果校验通过了
			$.ajax({
				url:"http://localhost:8881/user/register",
				type:"post",
				data:{"name":username,"password":password},
				dataType:"json",
				success:function(result){
//						console.log('result'+result.msg);
					if(result.status==1){//成功
// 						sessionStorage.token=result.data.token;//获取令牌值
						window.parent.location.reload();//刷新当前页
						alert(result.msg);
					}else if(result.status==4){//用户姓名已存在						
						$("#register_error2").html(result.msg);
					}
// 					alert(result.msg);
				}				
			});
		}
	}
</script>
</html>