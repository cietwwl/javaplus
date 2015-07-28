<%@page import="org.hhhhhh.guess.hibernate.dao.DbUtil"%>
<%@page import="cn.javaplus.log.Log"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";

	Log.d("enter createRound.jsp");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>新建问题</title>
<link rel="shortcut icon" href="../favicon.ico">
<link rel="stylesheet"
	href="http://fonts.googleapis.com/css?family=Open+Sans:300,400,700">
<link rel="stylesheet"
	href="../css/themes/default/jquery.mobile-1.4.5.min.css">
<link rel="stylesheet" href="../_assets/css/jqm-demos.css">
<script src="../js/jquery.js"></script>
<script src="../_assets/js/index.js"></script>
<script src="../js/jquery.mobile-1.4.5.min.js"></script>


<style type="text/css">
#preview {
	width: 260px;
	height: 190px;
	border: 0px solid #000;
	overflow: hidden;
}

#imghead {
	filter: progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=image
		);
}
</style>

<script type="text/javascript">
	function previewImage(file) {

		var MAXWIDTH = 260;
		var MAXHEIGHT = 180;
		var div = document.getElementById('preview');
		if (file.files && file.files[0]) {
			div.innerHTML = '<img id=imghead>';
			var img = document.getElementById('imghead');
			img.onload = function() {
				var rect = clacImgZoomParam(MAXWIDTH, MAXHEIGHT,
						img.offsetWidth, img.offsetHeight);
				img.width = rect.width;
				img.height = rect.height;
				//                 img.style.marginLeft = rect.left+'px';
				img.style.marginTop = rect.top + 'px';
			}
			var reader = new FileReader();
			reader.onload = function(evt) {
				img.src = evt.target.result;
			}
			reader.readAsDataURL(file.files[0]);
		} else //兼容IE
		{
			var sFilter = 'filter:progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=scale,src="';
			file.select();
			var src = document.selection.createRange().text;
			div.innerHTML = '<img id=imghead>';
			var img = document.getElementById('imghead');
			img.filters.item('DXImageTransform.Microsoft.AlphaImageLoader').src = src;
			var rect = clacImgZoomParam(MAXWIDTH, MAXHEIGHT, img.offsetWidth,
					img.offsetHeight);
			status = ('rect:' + rect.top + ',' + rect.left + ',' + rect.width
					+ ',' + rect.height);
			div.innerHTML = "<div id=divhead style='width:"+rect.width+"px;height:"+rect.height+"px;margin-top:"+rect.top+"px;"+sFilter+src+"\"'></div>";
		}
	}
	function clacImgZoomParam(maxWidth, maxHeight, width, height) {
		var param = {
			top : 0,
			left : 0,
			width : width,
			height : height
		};
		if (width > maxWidth || height > maxHeight) {
			rateWidth = width / maxWidth;
			rateHeight = height / maxHeight;

			if (rateWidth > rateHeight) {
				param.width = maxWidth;
				param.height = Math.round(height / rateWidth);
			} else {
				param.width = Math.round(width / rateHeight);
				param.height = maxHeight;
			}
		}

		param.left = Math.round((maxWidth - param.width) / 2);
		param.top = Math.round((maxHeight - param.height) / 2);
		return param;
	}
</script>








</head>



<body>
    

	<div data-role="page" class="jqm-demos" data-quicklinks="true">
		<div data-role="header" class="jqm-header">
			<h2>
				<a title="Guess Home"><img height="800"
					src="../_assets/img/jquery-logo.png" alt="jQuery Mobile"> </a>
			</h2>
		</div>
		<div data-role="content" class="content">

			<form id="upload" name="upload" method="post" action="createQuestion"
				enctype="multipart/form-data">
				<label for="content">问题内容</label> 
				<input id="content" name="content" type="text" class="txt1" /> 
				
				
				<label for="dsc">说明</label>
				<input id="dsc" name="dsc" type="text" class="txt1" />
				
				<label for="jiFen">积分奖励</label>
				<input id="jiFen" name="jiFen" type="text" class="txt1" />
				
				<label >选项 A-F</label> 
				
				<input id="optionA" name="optionA" type="text" class="txt1" /> 
				<input id="optionB" name="optionB" type="text" class="txt1" /> 
				<input id="optionC" name="optionC" type="text" class="txt1" /> 
				<input id="optionD" name="optionD" type="text" class="txt1" /> 
				<input id="optionE" name="optionE" type="text" class="txt1" /> 
				<input id="optionF" name="optionF" type="text" class="txt1" /> 
				

				<div id="preview" data-role="content" class="content">
					<img width="100%" id="imghead" />
				</div>

				<input id="image" name="image" type="file"
					onchange="previewImage(this)" /> <input class="ui-btn"
					type="button" value="创建"
					onclick="javascript:document.getElementById('upload').submit()" />
			</form>
		</div>
	</div>





</body>
</html>

