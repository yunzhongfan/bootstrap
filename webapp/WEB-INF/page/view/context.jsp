<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<div style="margin-left:25px;margin-top:25px;">
	<ol class="breadcrumb">
		<li><a href="#">词条管理</a></li>
		<li><a href="#">词条查询</a></li>
	</ol>
	<div>
		<label for="name">分类</label> <input class="easyui-validatebox"
			type="text" name="name" data-options="required:true" /> <label
			for="name">关键字</label> <input class="easyui-validatebox" type="text"
			name="name" data-options="required:true" /> <label for="name">中文名称</label>
		<input class="easyui-validatebox" type="text" name="name"
			data-options="required:true" /> <label for="name">英文名称</label> <input
			class="easyui-validatebox" type="text" name="name"
			data-options="required:true" />
		<button type="button" class="btn btn-info">查询</button>
	</div>

	<table class="table table-bordered"
		style="width: 100%; height: 70%; margin-top: 25px;">
		<thead>
			<tr>
				<th>分类名称</th>
				<th>ID</th>
				<th>词条标题</th>
				<th>内容</th>
				<th>创建时间</th>
			</tr>
		</thead>
		<tfoot>
			<tr>
				<td rowspan="2">自然</td>
				<td>1</td>
				<td>银河系</td>
				<td>银河系，古称银河、天河、星河、天汉、银汉等[1]
					，是太阳系所在的星系，属于棒旋星系，包括1,000亿-4,000亿颗恒星和大量的星团、星云，还有各种类型的星际气体和星际尘埃。它的直径约为10万光年，中心厚度约为1.2万光年，可见物质总质量大约是太阳质量的1,400亿倍。</td>
				<td>2015/10/23</td>
			</tr>
			<tr>
				<td>2</td>
				<td>弥勒葡萄</td>
				<td>弥勒葡萄，云南省弥勒县特产，中国地理标志产品。该县早在20世纪60年代就有葡萄种植，由于独特的气候、土壤等地理条件，弥勒葡萄品种得到优化，表现出适应性强、抗病、早熟、优质、丰产，高效等特点。所产鲜食葡萄，色泽艳丽，品质高。弥勒葡萄玫瑰蜜酿之酒，酒质丰满，宝石红色，玫瑰芳香；水晶酿制的干白葡萄酒，晶莹透亮，具有浓厚纯天然果香味，颇受消费者欢迎。</td>
				<td>2015/10/23</td>
			</tr>
			<tr>
				<td rowspan="2">地理</td>
				<td>3</td>
				<td>舟山</td>
				<td>舟山市位于浙江省东北部，陆地面积1440.12平方千米，2012年人口140.0万人，舟山是一个岛屿地级市。
					舟山群岛东面是东海，西面是杭州湾，南面与浙江省大陆隔海相距3千米，北面是长江入海口。舟山是海岛丘陵区，属于亚热带季风气候，年均气温16℃，6～9月份降雨居多。舟山文化属于吴越文化，舟山人属江浙民系，使用吴语。</td>
				<td>2015/10/23</td>
			</tr>
			<tr>

				<td>4</td>
				<td>喀纳斯湖</td>
				<td>喀纳斯湖（英语：Kanas
					Lake）位于中国新疆阿勒泰地区布尔津县北部，是一个内陆淡水湖，湖水来自奎屯、友谊峰等山的冰川融水和当地降水，湖面海拔1374米，面积45.73㎞²，湖水最深处达188.5米左右，蓄水量达53.8亿立方米。
					喀纳斯湖外形呈月牙，湖区景观主要有驼颈湾、变色湖、卧龙湾等；生长有哲罗鲑、细鳞鲑等珍稀鱼类。[1]</td>
				<td>2015/10/23</td>
			</tr>
		</tbody>
	</table>

	<nav aria-label="Page navigation">
	<ul class="pagination">
		<li><a href="#" aria-label="Previous"> <span
				aria-hidden="true">&laquo;</span>
		</a></li>
		<li><a href="#">1</a></li>
		<li><a href="#">2</a></li>
		<li><a href="#">3</a></li>
		<li><a href="#">4</a></li>
		<li><a href="#">5</a></li>
		<li><a href="#" aria-label="Next"> <span aria-hidden="true">&raquo;</span>
		</a></li>
	</ul>
	</nav>
</div>

