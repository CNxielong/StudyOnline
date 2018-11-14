<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>在线学习网-Design By Xielong</title>
		<base href="${pageContext.request.contextPath}/study/">
		<link rel="stylesheet" type="text/css" href="bootstrap/css/bootstrap.css">
		<link rel="stylesheet" type="text/css" href="css/muke.css">
		
		<!-- 网页标题栏图标 -->
		<link rel="SHORTCUT ICON" href="img/favicon.ico"/>
	
		<!-- 名师推荐样式  -->
		<style type="text/css">
			#teacher {
				display:inline-block; 
				width: 216px; 
				height:364px;
				position: relative; 
				left:20px;
				background-color: white; 
				box-shadow: 10px 10px 5px #888888;
			}
			#teacher_top{
				text-align: center; 
				position: relative; 
				top: 30px;
				
			}
			#teacher_intro{
				position: relative; 
				top: 30px;
				font-size: 12px; 
				width: 180px; 
				height: 110px;
				margin: 0 auto; 
				color: RGB(130,130,130); 
				line-height: 1.5em; 
				letter-spacing:1.2px;
				overflow: hidden;
			}
		</style>
	</head>
	<body>
		<%@include file="head.jsp"%>		
<!--========================轮播图==============================-->
		<div class="width100 float_l margin_t-405 margin_b40">
			<div class="width_1200 margin_auto">
				<div class="width100 float_l height460 posi_relative">
					<div class="width100 float_l">
						<div class="focusBox">
							<ul class="pic">
								<li>
									<a href="course_list.jsp"><img src="img/index1.jpg" /></a>
								</li>
								<li>
									<a href="course_list.jsp"><img src="img/index2.jpg" /></a>
								</li>
								<li>
									<a href="course_list.jsp"><img src="img/index3.jpg" /></a>
								</li>
								<li>
									<a href="course_list.jsp"><img src="img/index4.jpg" /></a>
								</li>
								<li>
									<a href="course_list.jsp"><img src="img/index5.jpg" /></a>
								</li>
							</ul>
							<a class="prev" href="javascript:void(0)"></a>
							<a class="next" href="javascript:void(0)"></a>
							<a class="next" href="javascript:void(0)"></a>
							<a class="next" href="javascript:void(0)"></a>
							<a class="next" href="javascript:void(0)"></a>
							<ul class="hd">
								<li></li>
								<li></li>
								<li></li>
								<li></li>
								<li></li>
							</ul>
						</div>
					</div>

					<div id="direction_menu" class="width_220 float_l height460 posi_absolute backg_jqian padding_t5 bianshou">
						
						<!-- 动态生成的页面 -->

					
					</div>
				</div>
			</div>
		</div>
		

		<script type="text/javascript">
			jQuery(".focusBox").slide({
				mainCell: ".pic",
				effect: "left",
				autoPlay: true,
				delayTime: 500
			});
		</script>

<!--========================== 实战推荐 =============================-->
		<div class="width100 float_l margin_b40">
			<div class="width_1200 margin_auto">

				<div class="width100 float_l margin_b20">
					<div class="float_l">
						<span class="fon_siz16">课程推荐</span>
					</div>
					<!-- <div class="float_r bianshou">
						<span>更多></span>
					</div> -->
				</div>
				<div class="width100 float_l" id="zymCourse">
				   <div class="width_220 height172 float_l margin_r20 border_shadow jingguoxianshi over_pos bianshou">
						<div class="width100 float_l img_100 z_inx_1">
							<img src="img/uiz7.jpg">
						</div>
						<div class="img_backg2 donghua">
							<span class="margin_t15 float_l ">飞速上手的跨平台App开发</span> <span class="float_l fon_siz12 line_hei16 color_gray margin_t5 posi_relative ">8小时带领大家步步深入学习标签的基础知识，掌握各种样式的基本用法。</span>
						</div>
						<div class="width100 float_l padding_lr20 height48 fon_siz12 line_hei48 z_inx_3 posi_relative backg_white">
							<span class="float_l color_red">￥88.00</span> <span class="float_r color_gray"><span>499</span>人在学</span>
						</div>
					</div>
					<div class="width_220 height172 float_l margin_r20 border_shadow jingguoxianshi over_pos bianshou">
						<div class="width100 float_l img_100 z_inx_1">
							<img src="img/uiz7.jpg">
						</div>
						<div class="img_backg2 donghua">
							<span class="margin_t15 float_l ">飞速上手的跨平台App开发</span> <span class="float_l fon_siz12 line_hei16 color_gray margin_t5 posi_relative ">8小时带领大家步步深入学习标签的基础知识，掌握各种样式的基本用法。</span>
						</div>
						<div class="width100 float_l padding_lr20 height48 fon_siz12 line_hei48 z_inx_3 posi_relative backg_white">
							<span class="float_l color_red">￥88.00</span> <span class="float_r color_gray"><span>499</span>人在学</span>
						</div>
					</div>
					<div class="width_220 height172 float_l margin_r20 border_shadow jingguoxianshi over_pos bianshou">
						<div class="width100 float_l img_100 z_inx_1">
							<img src="img/uiz7.jpg">
						</div>
						<div class="img_backg2 donghua">
							<span class="margin_t15 float_l ">飞速上手的跨平台App开发</span> <span class="float_l fon_siz12 line_hei16 color_gray margin_t5 posi_relative ">8小时带领大家步步深入学习标签的基础知识，掌握各种样式的基本用法。</span>
						</div>
						<div class="width100 float_l padding_lr20 height48 fon_siz12 line_hei48 z_inx_3 posi_relative backg_white">
							<span class="float_l color_red">￥88.00</span> <span class="float_r color_gray"><span>499</span>人在学</span>
						</div>
					</div>
					<div class="width_220 height172 float_l margin_r20 border_shadow jingguoxianshi over_pos bianshou">
						<div class="width100 float_l img_100 z_inx_1">
							<img src="img/uiz7.jpg">
						</div>
						<div class="img_backg2 donghua">
							<span class="margin_t15 float_l ">飞速上手的跨平台App开发</span> <span class="float_l fon_siz12 line_hei16 color_gray margin_t5 posi_relative ">8小时带领大家步步深入学习标签的基础知识，掌握各种样式的基本用法。</span>
						</div>
						<div class="width100 float_l padding_lr20 height48 fon_siz12 line_hei48 z_inx_3 posi_relative backg_white">
							<span class="float_l color_red">￥88.00</span> <span class="float_r color_gray"><span>499</span>人在学</span>
						</div>
					</div>
					<div class="width_220 height172 float_l margin_r20 border_shadow jingguoxianshi over_pos bianshou">
						<div class="width100 float_l img_100 z_inx_1">
							<img src="img/uiz7.jpg">
						</div>
						<div class="img_backg2 donghua">
							<span class="margin_t15 float_l ">飞速上手的跨平台App开发</span> <span class="float_l fon_siz12 line_hei16 color_gray margin_t5 posi_relative ">8小时带领大家步步深入学习标签的基础知识，掌握各种样式的基本用法。</span>
						</div>
						<div class="width100 float_l padding_lr20 height48 fon_siz12 line_hei48 z_inx_3 posi_relative backg_white">
							<span class="float_l color_red">￥88.00</span> <span class="float_r color_gray"><span>499</span>人在学</span>
						</div>
					</div>
				</div>
			</div>
		</div>

<!--========================== 免费好课 =============================-->
		<div class="width100 float_l margin_b40">
			<div class="width_1200 margin_auto">

				<div class="width100 float_l margin_b20">
					<div class="float_l">
						<span class="fon_siz16">免费好课</span>
					</div>
				</div>
					
				<div class="width100 float_l" id="freeCourse">
				
				</div>
			</div>
		</div>

<!--========================== Html-前端工程师 =============================-->
		<div class="width100 float_l padding_tb45 backg_qiangray">
			<div class="width_1200 margin_auto">
				<div class=" width_220 height364 float_l img_backg3 margin_r20">
					<div class="width100 float_l padding_lr20 color_white fon_siz32 b_weight700 margin_t10">
						<span>Html<br>前端工程师
					</span>
					</div>
					<div class="width100 float_l padding_lr20 color_white fon_siz16 margin_t30 jiantoubianhua bianshou">
						<a href="download/HTML5.CHM"><span>API 下载<span class="margin_l5 wobianhua">></span></span></a>
					</div>
					<div class="width100 float_l padding_lr20 color_white fon_siz12 bianshou line_hei26 color_shenred wobeijingguos margin_t120">
						<a>超文本标记语言 HyperText Markup Language 简称：HTML，是一种标记语言。</a>
					</div>
				</div>
				<div class="width_712 float_l margin_r20" id="htmlCourse">
					<div class=" width100 float_l height172 kaishimeiyou img_backg12 text-center line_hei172 margin_b20">
						<span class="fon_siz20 color_white b_weight700" style="font-size: 26px;">靡不有初&nbsp;&nbsp;鲜克有终</span>
					</div>
					<!-- 追加html课程 -->
					<div class="width_217 height172 float_l margin_r20 border_shadow jingguoxianshi over_pos bianshou">
							<div class="width100 float_l img_100 z_inx_1">
								<img src="img/uiz7.jpg">
							</div>
							<div class="img_backg2 donghua">
								<span class="margin_t15 float_l ">飞速上手的跨平台App开发</span> <span class="float_l fon_siz12 line_hei16 color_gray margin_t5 posi_relative ">8小时带领大家步步深入学习标签的基础知识，掌握各种样式的基本用法。</span>
							</div>
							<div class="width100 float_l padding_lr20 height48 fon_siz12 line_hei48 z_inx_3 posi_relative backg_white">
								<span class="float_l color_red">￥88.00</span> <span class="float_r color_gray"><span>499</span>人在学</span>
							</div>
					</div>
					<div class="width_217 height172 float_l margin_r20 border_shadow jingguoxianshi over_pos bianshou">
							<div class="width100 float_l img_100 z_inx_1">
								<img src="img/uiz7.jpg">
							</div>
							<div class="img_backg2 donghua">
								<span class="margin_t15 float_l ">飞速上手的跨平台App开发</span> <span class="float_l fon_siz12 line_hei16 color_gray margin_t5 posi_relative ">8小时带领大家步步深入学习标签的基础知识，掌握各种样式的基本用法。</span>
							</div>
							<div class="width100 float_l padding_lr20 height48 fon_siz12 line_hei48 z_inx_3 posi_relative backg_white">
								<span class="float_l color_red">￥88.00</span> <span class="float_r color_gray"><span>499</span>人在学</span>
							</div>
					</div>
					<div class="width_217 height172 float_l margin_r20 border_shadow jingguoxianshi over_pos bianshou">
							<div class="width100 float_l img_100 z_inx_1">
								<img src="img/uiz7.jpg">
							</div>
							<div class="img_backg2 donghua">
								<span class="margin_t15 float_l ">飞速上手的跨平台App开发</span> <span class="float_l fon_siz12 line_hei16 color_gray margin_t5 posi_relative ">8小时带领大家步步深入学习标签的基础知识，掌握各种样式的基本用法。</span>
							</div>
							<div class="width100 float_l padding_lr20 height48 fon_siz12 line_hei48 z_inx_3 posi_relative backg_white">
								<span class="float_l color_red">￥88.00</span> <span class="float_r color_gray"><span>499</span>人在学</span>
							</div>
					</div>
				</div>
				
				<div class="width_220 height364 float_l backg_white border_shadow" id="htmlCourseScore">
					<!-- 追加htmlCourseScore 课程评分列表，由高到低 -->
					<div class="width_220 height172 float_l margin_r20 border_shadow jingguoxianshi over_pos bianshou">
						<div class="width100 float_l img_100 z_inx_1">
							<img src="img/uiz7.jpg">
						</div>
						<div class="img_backg2 donghua">
							<span class="margin_t15 float_l ">飞速上手的跨平台App开发</span> <span class="float_l fon_siz12 line_hei16 color_gray margin_t5 posi_relative ">8小时带领大家步步深入学习标签的基础知识，掌握各种样式的基本用法。</span>
						</div>
						<div class='width100 float_l padding_lr20 height48 fon_siz12 line_hei48 z_inx_3 posi_relative backg_white'>
							<span class='float_l color_red'>课程评分：</span> 
							<span class='float_r color_gray'><span>100</span></span>
						</div>
					</div>
					<div class='width100 float_l padding_lr20 dadiv'>
						<div class='width100 float_l border_t padding_t10'>
							<ul class='tongli_ys chaochuyincang'>
								<li>
									<a href='/pponline/course/1'>
									<span class='diandian'>.</span>Java1
									</a>
								</li>
								<li>
									<a href='/pponline/course/1'>
									<span class='diandian'>.</span>Java1
									</a>
								</li>
								<li>
									<a href='/pponline/course/1'>
									<span class='diandian'>.</span>Java1
									</a>
								</li>
								<li>
									<a href='/pponline/course/1'>
									<span class='diandian'>.</span>Java1
									</a>
								</li>
							</ul>
						</div>
					</div>
				</div>
				
			</div>
		</div>

<!--========================== java-工程师 =============================-->
		<div class="width100 float_l backg_qiangray padding_b45">
			<div class="width_1200 margin_auto">
				<div class=" width_220 height364 float_l img_backg11 margin_r20">
					<div class="width100 float_l padding_lr20 color_white fon_siz32 b_weight700 margin_t10">
						<span>Java<br>开发工程师
					</span>
					</div>
					<div class="width100 float_l padding_lr20 color_white fon_siz16 margin_t30 jiantoubianhua bianshou">
						<a href="download/JDK_API_1_6_zh_CN.CHM"><span>API 下载<span class="margin_l5 wobianhua">></span></span></a>
					</div>
					<div class="width100 float_l padding_lr20 fon_siz12 bianshou line_hei26 color_blue wobeijingguosa margin_t120">
						<a>Java是由Sun公司于1995年5月推出的Java面向对象程序设计语言和Java平台的总称。</a>
					</div>
				</div>
				<div class="width_712 float_l margin_r20" id="javaCourse">
					<div class=" width100 float_l height172 kaishimeiyou img_backg10 text-center line_hei172 margin_b20">
						<span class="fon_siz20 color_white b_weight700" style="font-size: 26px;">不忘初心&nbsp;&nbsp;方得始终</span>
					</div>
					
					<div class="width_217 height172 float_l margin_r20 border_shadow jingguoxianshi over_pos bianshou">
						<div class="width100 float_l img_100 z_inx_1">
							<img src="img/uiz7.jpg">
						</div>
						<div class="img_backg2 donghua">
							<span class="margin_t15 float_l ">飞速上手的跨平台App开发</span> <span class="float_l fon_siz12 line_hei16 color_gray margin_t5 posi_relative ">8小时带领大家步步深入学习标签的基础知识，掌握各种样式的基本用法。</span>
						</div>
						<div class="width100 float_l padding_lr20 height48 fon_siz12 line_hei48 z_inx_3 posi_relative backg_white">
							<span class="float_l color_red">￥88.00</span> <span class="float_r color_gray"><span>499</span>人在学</span>
						</div>
					</div>
					<div class="width_217 height172 float_l margin_r20 border_shadow jingguoxianshi over_pos bianshou">
						<div class="width100 float_l img_100 z_inx_1">
							<img src="img/uiz7.jpg">
						</div>
						<div class="img_backg2 donghua">
							<span class="margin_t15 float_l ">飞速上手的跨平台App开发</span> <span class="float_l fon_siz12 line_hei16 color_gray margin_t5 posi_relative ">8小时带领大家步步深入学习标签的基础知识，掌握各种样式的基本用法。</span>
						</div>
						<div class="width100 float_l padding_lr20 height48 fon_siz12 line_hei48 z_inx_3 posi_relative backg_white">
							<span class="float_l color_red">￥88.00</span> <span class="float_r color_gray"><span>499</span>人在学</span>
						</div>
					</div>
					<div class="width_217 height172 float_l margin_r20 border_shadow jingguoxianshi over_pos bianshou">
						<div class="width100 float_l img_100 z_inx_1">
							<img src="img/uiz7.jpg">
						</div>
						<div class="img_backg2 donghua">
							<span class="margin_t15 float_l ">飞速上手的跨平台App开发</span> <span class="float_l fon_siz12 line_hei16 color_gray margin_t5 posi_relative ">8小时带领大家步步深入学习标签的基础知识，掌握各种样式的基本用法。</span>
						</div>
						<div class="width100 float_l padding_lr20 height48 fon_siz12 line_hei48 z_inx_3 posi_relative backg_white">
							<span class="float_l color_red">￥88.00</span> <span class="float_r color_gray"><span>499</span>人在学</span>
						</div>
					</div>
				
				</div>

				<div class="width_220 height364 float_l backg_white border_shadow" id="javaCourseScore">
					<!-- 追加javaCourseScore 课程评分列表，由高到低 -->
					<div class="width_220 height172 float_l margin_r20 border_shadow jingguoxianshi over_pos bianshou">
						<div class="width100 float_l img_100 z_inx_1">
							<img src="img/uiz7.jpg">
						</div>
						<div class="img_backg2 donghua">
							<span class="margin_t15 float_l ">飞速上手的跨平台App开发</span> <span class="float_l fon_siz12 line_hei16 color_gray margin_t5 posi_relative ">8小时带领大家步步深入学习标签的基础知识，掌握各种样式的基本用法。</span>
						</div>
						<div class='width100 float_l padding_lr20 height48 fon_siz12 line_hei48 z_inx_3 posi_relative backg_white'>
							<span class='float_l color_red'>课程评分：</span> 
							<span class='float_r color_gray'><span>100</span></span>
						</div>
					</div>
					<div class='width100 float_l padding_lr20 dadiv'>
						<div class='width100 float_l border_t padding_t10'>
							<ul class='tongli_ys chaochuyincang'>
								<li>
									<a href='/pponline/course/1'>
									<span class='diandian'>.</span>Java1
									</a>
								</li>
								<li>
									<a href='/pponline/course/1'>
									<span class='diandian'>.</span>Java1
									</a>
								</li>
								<li>
									<a href='/pponline/course/1'>
									<span class='diandian'>.</span>Java1
									</a>
								</li>
								<li>
									<a href='/pponline/course/1'>
									<span class='diandian'>.</span>Java1
									</a>
								</li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div>

<!--========================== Oracle 工程师 =============================-->
		<div class="width100 float_l backg_qiangray">
			<div class="width100 float_l">
				<div class="width_1200 margin_auto">
					<div class="width100 float_l" id="courseOracle">
						<div class=" width_220 height172 float_l img_backg14 margin_r20">
							<div class="width100 float_l padding_lr20 color_white fon_siz32 b_weight700 margin_t10">
								<span>Oracle<br>DBA
							</span>
							</div>
							<div class="width100 float_l padding_lr20 color_white fon_siz16 margin_t30 jiantoubianhua bianshou">
								<a href="download/ORACLE.chm"><span>API 下载<span class="margin_l5 wobianhua">></span></span></a>
							</div>
						</div>
						 <div class="width_220 height172 float_l margin_r20 border_shadow jingguoxianshi over_pos bianshou">
							<div class="width100 float_l img_100 z_inx_1">
								<img src="img/uiz7.jpg">
							</div>
							<div class="img_backg2 donghua">
								<span class="margin_t15 float_l ">飞速上手的跨平台App开发</span> <span class="float_l fon_siz12 line_hei16 color_gray margin_t5 posi_relative ">8小时带领大家步步深入学习标签的基础知识，掌握各种样式的基本用法。</span>
							</div>
							<div class="width100 float_l padding_lr20 height48 fon_siz12 line_hei48 z_inx_3 posi_relative backg_white">
								<span class="float_l color_red">￥88.00</span> <span class="float_r color_gray"><span>499</span>人在学</span>
							</div>
						</div>
						
						<div class="width_220 height172 float_l margin_r20 border_shadow jingguoxianshi over_pos bianshou">
							<div class="width100 float_l img_100 z_inx_1">
								<img src="img/uiz7.jpg">
							</div>
							<div class="img_backg2 donghua">
								<span class="margin_t15 float_l ">飞速上手的跨平台App开发</span> <span class="float_l fon_siz12 line_hei16 color_gray margin_t5 posi_relative ">8小时带领大家步步深入学习标签的基础知识，掌握各种样式的基本用法。</span>
							</div>
							<div class="width100 float_l padding_lr20 height48 fon_siz12 line_hei48 z_inx_3 posi_relative backg_white">
								<span class="float_l color_red">￥88.00</span> <span class="float_r color_gray"><span>499</span>人在学</span>
							</div>
						</div>
						
						<div class="width_220 height172 float_l margin_r20 border_shadow jingguoxianshi over_pos bianshou">
							<div class="width100 float_l img_100 z_inx_1">
								<img src="img/uiz7.jpg">
							</div>
							<div class="img_backg2 donghua">
								<span class="margin_t15 float_l ">飞速上手的跨平台App开发</span> <span class="float_l fon_siz12 line_hei16 color_gray margin_t5 posi_relative ">8小时带领大家步步深入学习标签的基础知识，掌握各种样式的基本用法。</span>
							</div>
							<div class="width100 float_l padding_lr20 height48 fon_siz12 line_hei48 z_inx_3 posi_relative backg_white">
								<span class="float_l color_red">￥88.00</span> <span class="float_r color_gray"><span>499</span>人在学</span>
							</div>
						</div>
						
						<div class="width_220 height172 float_l margin_r20 border_shadow jingguoxianshi over_pos bianshou">
							<div class="width100 float_l img_100 z_inx_1">
								<img src="img/uiz7.jpg">
							</div>
							<div class="img_backg2 donghua">
								<span class="margin_t15 float_l ">飞速上手的跨平台App开发</span> <span class="float_l fon_siz12 line_hei16 color_gray margin_t5 posi_relative ">8小时带领大家步步深入学习标签的基础知识，掌握各种样式的基本用法。</span>
							</div>
							<div class="width100 float_l padding_lr20 height48 fon_siz12 line_hei48 z_inx_3 posi_relative backg_white">
								<span class="float_l color_red">￥88.00</span> <span class="float_r color_gray"><span>499</span>人在学</span>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>

	<%@include file="footer.jsp"%>
	</body>
	
	<script type="text/javascript">
	$(function(){//默认加载,在HTML DOM加载完成之后加载
		//加载免费好课
		loadFreeCourse();
		//加载方向信息
		loadDirection();
	});
	
	//加载免费好课
	function loadFreeCourse(){
		$.ajax({
			url:"http://localhost:8882/course/free",
			type:"get",
			dataType:"json",
			success:function(result){
				if(result.status==1){//如果查询到了课程
					var courses = result.data;//List<Course>集合 json字符串
					for (var i = 0; i < courses.length; i++) {
						var id = courses[i].id;
						var name = courses[i].name;
						var intro = courses[i].intro;
						var learnCount = courses[i].learnCount;
						var score = courses[i].score;
						var image = courses[i].image;
						//生成一个课程信息' '
						var str = '';
						str += 	'<a href="course.html?cid='+id+'">';
						str += 	'<div class="width_220 height172 float_l margin_r20 border_shadow jingguoxianshi over_pos bianshou">';
						str += 	'<div class="width100 float_l img_100 z_inx_1">';
// 						str += 	'	<img src="img/course/'+image+'">';//相对路径
						str += 	'	<img src="/study/img/course/'+image+'">';//绝对路径
						str += 	'</div>';
						str += 	'<div class="img_backg2 donghua">';
						str += 	'	<span class="margin_t15 float_l ">'+name+'</span> <span class="float_l fon_siz12 line_hei16 color_gray margin_t5 posi_relative ">'+intro+'</span>';
						str += 	'</div>';
						str += 	'<div class="width100 float_l padding_lr20 height48 fon_siz12 line_hei48 z_inx_3 posi_relative backg_white">';
						str += 	'	<span class="float_l color_red">'+score+'分</span> <span class="float_r color_gray"><span>'+learnCount+'</span>人在学</span>';
						str += 	'</div>';
						str += 	'</div>';
						str += 	'</a>';
						$('#freeCourse').append(str);
					}
				}
			}
		});
	};
	
	
	function loadDirection(){
		$.ajax({
			url:'http://localhost:8882/direction',
			dataTpye:'json',
			type:'get',
			async:false,
			success:function(result){
// 				console.log(result);
				var directions = result.data;
				for (var i = 0; i < directions.length; i++) {
					var direction = directions[i];
					var direction_id =  direction.id;//方向ID
					var direction_name =  direction.name;//方向名称
					var subjects = direction.subjects;//方向包含的学科集合信息
					
					str = '';
					str += ' <div class="width100 float_l tab_qiehuan ">';
					str += ' <div class="width100 float_l text_c height64 line_hei64 color_white bianhuabeijing backg_jqian padding_lr20">';
					str += ' 	<div class="width100 float_l text_l height64 line_hei64 color_white border_b_baise fon_siz16">';
					str += ' 		<span>'+direction_name+'</span> <span class="float_r">></span>';
					str += ' 	</div>';
					str += ' </div>';
					str += ' <div class="width_700 float_l lunbofenlei dis_none img_backg15">';
					str += ' 	<div class="width100 float_l padding40">';
					str += ' 		<div class="width100 float_l margin_b40">';
					str += ' 			<span class="width100 color_shenred fon_siz16 float_l margin_b20">分类目录</span>';
					str += ' 			<ul class="width100 ul_lis float_l">';
					
// 					console.log("subjects:");
// 					console.log(subjects);
					for (var j = 0; j < subjects.length; j++) {
						var subject = subjects[j];
// 						console.log("subject:");
// 						console.log(subject);
						var subject_name = subject.name;
						var subject_id = subject.id;
						str += ' 				<li>';
						str += ' 					<a href="course_list.jsp?direction_id='+direction_id+'&subject_id='+subject_id+'">'+subject.name+'</a>';
						str += ' 				</li>';
						str += ' 				<li>/</li>';
					}
					
					str += ' 			</ul>';
					str += ' 		</div>';

					str += ' 		<div class="width100 float_l margin_b40">';
					str += ' 			<span class="width100 color_shenred fon_siz16 float_l margin_b20">推荐</span>';
					str += ' 			<ul class="width100 ul_lis float_l">';
					str += ' 				<li class="width100 float_l margin_b15">';
					str += ' 					<a>课程 | 前端JavaScript面试技巧';
					str += ' 					</a>';
					str += ' 				</li>';
					str += ' 				<li class="width100 float_l margin_b15">';
					str += ' 					<a>课程 | Vue2.0+Node.js+MongoDB全栈打造商城系统';
					str += ' 					</a>';
					str += ' 				</li>';
					str += ' 				<li class="width100 float_l margin_b15">';
					str += ' 					<a>课程 | node建站攻略（二期）——网站升级';
					str += ' 					</a>';
					str += ' 				</li>';
					str += ' 			</ul>';
					str += ' 		</div>';
					str += ' 	</div>';
					str += ' </div>';
					str += ' </div>';
				$('#direction_menu').append(str);
				}
				
				$('.tab_qiehuan').hover(
						function() {
							$(this).children(".bianhuabeijing").css("background-color",
								"#8a8f93").next().css("display", "block")
						},
						function() {
							$(this).children(".bianhuabeijing").css("background-color",
								"#a9aaae").next().css("display", "none")
						});
				
			}
		});
	}
	
	</script>
	
</html>