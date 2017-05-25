<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="/page/common/taglibs.jsp" %>
<%@ include file="/page/common/comm.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登录页面</title>
<style type="text/css">
.b_content{
width: 965px;
margin: 0 auto;
position: relative;
padding-top: 15px;
}
.b_logo{
height: 50px;
width: 140px;
padding-right: 60px;
float: left;

}
.des_1{
float: left;
height: 53px;
font-size: 12px;
line-height: 18px;
color: #caf1ff;
border-right-width: 1px;
border-left-width: 1px;
border-right-style: solid;
border-left-style: solid;
border-right-color: #7cbfd5;
border-left-color: #7cbfd5;
padding-top: 0;
padding-right: 40px;
padding-bottom: 0;
padding-left: 25px;

}
.des_2{
float: left;
color: #caf1ff;
font-size: 12px;
width: 500px;
line-height: 18px;
padding: 0 0 0 30px;
}


</style>
<script>
  function denglu(){
      window.location.href='/bootstrap/page/lidan/home.html'; 
  }
</script>
</head>
<body  class="container-fluid" background="/bootstrap/page/image/home.jpg">

    <div class="row"  style="height:35%;" >
                <div style="font-size: 40px; font-family:sans-serif; font-stretch:extra-expanded;margin-left:15%;margin-top:30px;"  >
                            <p style="display:inline-block;font-size: 80px;color:#00F">词条</p>
                            <p style="display:inline-block;font-size: 40px;font-style:oblique">内容管理系统</p>
                </div>
    </div>
    
    <div  style="width:20%;height:37%;background-color:#808080;border-radius:10px;float:right;margin-right:20px;background:rgba(0,0,0,0.2);; ">
            <form   id = "loginForm"  action="${ctx }/login/userLogin" style="font-size: 15px; font-family:sans-serif; clear:none;">
                <div  style="height:20px;margin-top:55px; width:90%; margin-left:7%;margin-right:3%;">
                    <label >用户名</label> <input type="text"
                         style="border-radius:4px;" id="exampleInputEmail1" />
                </div>
                <div  style="height:20px;margin-top:15px; margin-left:7%;margin-right:3%;">
                    <label >密&nbsp;&nbsp;&nbsp;&nbsp;码</label> <input type="password"
                        style="border-radius:4px;" id="exampleInputEmail2" />
                </div>
                <div  >
                        <div>
                         <div  style="display:inline-block; width:25%; margin-top:35px; margin-left:23%;margin-right:3%;"><button type="button"  id = "loginButton" class="btn btn-success" >登录</button></div>
                          &nbsp;&nbsp;&nbsp;
                          <div style="display:inline-block; width:25%; margin-top:35px; margin-right:3%;"><button type="button" class="btn btn-info">注册</button></div>
                        </div>
                  <div style="float:right;margin-right:10px;margin-top:8px; margin-bottom:15px;text-decoration-line:underline;font-style:italic "><a href="#">忘记密码</a></div>
                </div>
            </form>
    </div>
        <div
            style="width: 100%; height: 35px; line-height: 35px; position: fixed; bottom: 78px; left: 0px; font-size: 14px; color: #000; text-align: center;">
        <div
            style="width: 100%; height: 45%; background-color: #808080; background: rgba(0, 0, 0, 0.0); bottom: 10%">
            <div
                style="height: 29px; background-color: #890F0F; color: white; font-size: 12px; line-height: 29px; padding-left: 20px; border-bottom: 1px solid #819e9f; text-align: center;">
                版权所有：郑州大学&nbsp; &nbsp; &nbsp;内容管理：郑州大学科技部 &nbsp; &nbsp; &nbsp;页面设计：郑州大学美术学院、网络管理中心&nbsp;技术实现与支持：郑州大学网络管理中心
            </div>
            <div class="b_content">
      <div class="b_logo"><img src="http://www.zzu.edu.cn/images/b_logo.gif" class="img-rounded" style="width: 120px; height: 60px;"></div>
                <span class="des_1">郑州大学官方网站<br>郑州市科学大道100号<br>邮编：450001
                </span> <span class="des_2">建议1024×768以上分辨率/小字体/真彩浏览 </span>
                    <img src="http://www.zzu.edu.cn/images/w_icon1.gif"
                    style="vertical-align: middle;" width="21" height="18"><a
                    href="#"
                    onclick="parent.window.open('http://weibo.com/5016338752')"><span
                        style="color: #FFFFFF">
                <span>
                官方微信</span>
                <img src="http://www.zzu.edu.cn/images/w_icon2.gif"
                    style="vertical-align: middle;" width="21" height="18"><a
                    href="#"
                    onclick="parent.window.open('http://weibo.com/5016338752')"><span
                        style="color: #FFFFFF">官方微博</span></a><span style="color: #00FFFF">豫ICP备05002440号</span><img
                    src="http://www.zzu.edu.cn/images/zzu_icp.2016.png" style="vertical-align: middle;"
                    width="18" height="18"><a href="#"
                    onclick="parent.window.open('http://www.beian.gov.cn/portal/registerSystemInfo?recordcode=41019702002177')"><span
                        style="color: #00FFFF">豫公网安备41019702002177号</span></a>&nbsp;&nbsp;&nbsp;&nbsp;<span
                    style="color: #00FFFF">EDU镜像.</span><img
                    src="http://www.zzu.edu.cn/count2/counterd.dll?fs=9&amp;fn=Arial&amp;file=zzu&amp;cc1=1&amp;cc2=14"
                    style="vertical-align: middle;" height="16">
                </span>
            </div>
        </div>
    </div>
    <script type="text/javascript" src="${ctx}/page/js/pages/login.js"></script>
</body>
</html>