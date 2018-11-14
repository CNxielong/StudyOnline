<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>课程搜索</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge, chrome=1">
<meta name="renderer" content="webkit">
<meta http-equiv="Access-Control-Allow-Origin" content="*" />
<meta http-equiv="Cache-Control" content="no-transform " />
<meta http-equiv="Content-Security-Policy"
	content="script-src 'self' 'unsafe-inline' 'unsafe-eval' *.imooc.com *.mukewang.com *.baidu.com *.sina.com.cn *.bootcss.com">
<link rel="stylesheet" href="${pageContext.request.contextPath}/study/css/moco.min.css" type="text/css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/study/css/lv-common-less.css" type="text/css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/study/css/pagination.css" media="screen"  >
<script type="text/javascript" src="js/jquery.min.js"></script>

<style type="text/css">
.search-form-ipt {
	background-color: white;
}

.search-related {
	position: relative;
	top: 17px;
}
</style>
<script type="text/javascript">

//获取url参数
function getQueryString(name){
     var reg = new RegExp("(^|&)"+ name +"=([^&]*)(&|$)");
     var r = window.location.search.substr(1).match(reg);
     if(r!=null)return  unescape(r[2]); return null;
}

$(function(){
	//加载搜索结果
	loadCourse();		
});

//加载搜索课程 
function loadCourse(){
	//alert($("#search2_id").val());
	var search = getQueryString("search");
	$("#search_count").html(0);
	//alert(search);
	$.ajax({
		url:"http://localhost:8882/course/search?search="+search,
		type:"get",
		dataType:"json",
		success:function(result){
			if(result.status==1){//生成好课列表
				var courses = result.data;//课程信息集合
				//设置搜索课程数目结果
//				alert($("#search_count").html());
				$("#search_count").html(courses.length);
				for(var i=0;i<courses.length;i++){
					var id = courses[i].id;
					var name = courses[i].name;
					var intro = courses[i].intro;
					var learnCount = courses[i].learnCount;
					var score = courses[i].score;
					var image = courses[i].image;
					//生成一个课程元素
					var str = '';
					str+='<div class="course-item clearfix">';
					str+='<div class="course-item-left">';
					str+='	<a href="course.html?cid='+id+'" target="_blank"> ';
					str+='	<img src="img/course/'+image+'" width="210" height="120" />';
					str+='	</a>';
					str+='</div>';
					str+='<div class="course-item-right">';
					str+='	<div class="course-item-title">';
					str+='		<span class="type">[课程]</span> <a href="#" target="_blank">${item.name }</a>';
					str+='	</div>';
					str+='	<div class="tag">';
					str+='		<span>'+name+'</span> <strong class="strongMargin"></strong> <strong>'+learnCount+'人学习</strong>';
					str+='	</div>';
					str+='	<p class="content">';
					str+='		<span>课程简介：</span> '+intro+'';
					str+='	</p>';
					str+='</div>';
					str+='</div>';
					//添加到免费好课div
					$("#search-course").append(str);
				}
				$("#search_count").html(courses.length);
			}
		}
	});
};

</script>

</head>

<body>

<!-- 页头开始 -->
<%@ include file="head_black.jsp" %>
	<div class="bindHintBox js-bindHintBox hide">
		<div class="pr">
			为了账号安全，请及时绑定邮箱和手机 <a href="javascript:;" class="ml20 color-red"
				target="_blank">立即绑定</a>
			<button class="closeBindHint js-closeBindHint" type="button"></button>
			<div class="arrow"></div>
		</div>
	</div>

	<div id="main">

		<div class='search-main'>
			<div class='search-header'>
				<div class='search-form clearfix'>
					<i class='icon-search'></i> 
					<input id='search2_id' type='text' class='search-form-ipt js-search-ipt' placeholder='请输入想搜索的内容' /> 
					<span class='search-form-btn js-search-btn' onclick='javascript:window.location="search.jsp?search="+$("#search2_id").val()'>搜索</span>
					<ul class='search-area-prge js-search-area-prge'></ul>
				</div>

				<ul class='hot'>
					<li>热门搜索：</li>
					<li><a href='search.jsp?search=Oracle' target="_blank">Oracle</a>
					</li>
					<li><a href='search.jsp?search=Redis' target="_blank">Redis</a></li>
					<li><a href='search.jsp?search=java' target="_blank">java</a></li>
				</ul>
			</div>

			<div class='search-body'>

				<div class='search-related'>共找到<b id="search_count">11</b>个相关内容  &nbsp;&nbsp;  
				<b id="lv_currentPage">5</b>
				/<b id="lv_pages"  class="pager-cur">10</b> </div>

				<h2 class='search-title' >课程</h2>
				<h2 id='search-course'></h2>
				
				<!-- 遍历展示   开始 -->
					<!-- 
					<div class='course-item clearfix'>
						<div class='course-item-left'>
							<a href='#' target="_blank"> 
							<img src="img/course/html.jpg" width='210' height='120' />
							</a>
						</div>
						<div class='course-item-right'>
							<div class='course-item-title'>
								<span class='type'>[课程]</span> <a href='#' target="_blank">${item.name }</a>
							</div>
							<div class='tag'>
								<span>Java</span> <strong class='strongMargin'></strong> <strong>11人学习</strong>
							</div>
							<p class='content'>
								<span>课程简介：</span> 笑嘻嘻笑嘻嘻
							</p>
						</div>
					</div>
 					-->
 
				
				<!-- 遍历展示   结束 -->

			</div>

			<!-- ***** -->
		</div>
		
		<div class="M-box2"></div>

	</div>
	
<!-- 页脚开始 -->
<%@ include file="footer_black.jsp" %>
</body>




</html>