---
title: "招标查询获取列表数据"
apiId: "2418304460188549127"
apiPath: "请求方式	GET"
method: "ContentType"
category: "Enterprise Portrait"
domain: "YYZDX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Enterprise Portrait]
platform_version: "BIP"
source_type: community-api-docs
---

# 招标查询获取列表数据

>  请求方式	GET | Enterprise Portrait (YYZDX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/CPC/intellid/bids/getListByKwd
请求方式	GET
ContentType	
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
kwd	string	query	是	查询关键字    示例: 大数据
sort	string	query	否	排序    示例: BID_PUB_DATE_FORMAT    默认值: BID_PUB_DATE_FORMAT
order	string	query	否	方向    示例: DESC    默认值: DESC
pageNum	number
小数位数:1,最大长度:10	query	否	页码    示例: 1    默认值: 1
size	number
小数位数:1,最大长度:10	query	否	每页数量    示例: 10    默认值: 10
isHot	string	query	否	返回默认最新数据    示例: false    默认值: false
bidSubTypeCodes	string	query	否	招标类型    示例: BID,WINN_BID,OTHER
dateStart	string	query	否	发布开始时间    示例: 2025-12-01
dateEnd	string	query	否	发布结束时间    示例: 2025-12-02
areaCodes	string	query	否	省市地区    示例: 0
fromMoney	string	query	否	开始项目金额    示例: 0
toMoney	string	query	否	结束项目金额    示例: 0
retType	string	query	否	返回数据是否转化为原始线索结构, 默认default，返回原来的列表数据，当为clue 为批量生成线索的结构（字段与原始的不一致）    示例: default    默认值: default

## 3. 请求示例

Url: /yonbip/CPC/intellid/bids/getListByKwd?access_token=访问令牌&kwd=%E5%A4%A7%E6%95%B0%E6%8D%AE&sort=BID_PUB_DATE_FORMAT&order=DESC&pageNum=1&size=10&isHot=false&bidSubTypeCodes=BID%2CWINN_BID%2COTHER&dateStart=%202025-12-01&dateEnd=2025-12-02&areaCodes=0&fromMoney=0&toMoney=0&retType=default

## 4. 返回值参数

名称	类型	数组	描述
billtype	string	否	事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、
creator	string	否	创建人
creator	string	否	创建人
displayCode	string	否	异常码
displayCode	string	否	异常码
message	string	否	信息 示例：操作成功
data	string	否	响应信息
salesOrgId	string	否	销售组织id
saleDepartmentId	string	否	销售部门id
transactionTypeId	string	否	交易类型id
settlementOrgId	string	否	开票组织id
bizId	string	否	商家id
createDate	string	否	创建时间
synSourceOrg	string	否	协同来源组织id
ecsuiteuser	string	否	气泡联系人
ecsuiteuser	string	否	气泡联系人
billtype	string	否	事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、
creator	string	否	创建人
displayCode	string	否	异常码
message	string	否	信息 示例：操作成功
data	string	否	响应信息
icaConfirmTime	DateTime	否	确认时间 示例：2022-09-26 00:00:00
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
code	string	否	单据编号
code	string	否	单据编号
message	string	否	message 示例：操作成功
data	object	否	data
successOrder	object	是	successOrder
failedOrder	object	是	failedOrder
failCount	number
小数位数:0,最大长度:10	否	failCount 示例：1
successCount	number
小数位数:0,最大长度:10	否	successCount 示例：1
count	number
小数位数:0,最大长度:10	否	count 示例：2
qms_qit_incominspectorder_sourcelistList	object	是	源单信息
product_name	string	否	物料名称 示例：Rachel物料3
message	string	否	返回信息 示例：操作成功！
data	object	否	返回数据
pageIndex	long	否	页码 示例：1
pageSize	long	否	每条页数 示例：2
recordCount	long	否	记录数 示例：5
recordList	object	是	返回数据
beginPageIndex	long	否	起始页 示例：1
endPageIndex	long	否	结束页 示例：2
pageCount	long	否	页数 示例：1
code	number
小数位数:0,最大长度:10	否	code 示例：200
data	object	否	数据集
items	object	是	具体数据结果集
total	number
小数位数:0,最大长度:10	否	总数 示例：91
status	number
小数位数:0,最大长度:10	否	接口状态 示例：1
msg	string	否	提示信息 示例：执行成功
traceId	string	否	traceId 示例：3dd6e8458ecc167f

## 5. 正确返回示例

{
	"code": 200,
	"data": {
		"items": [
			{
				"purchaser": "贵州梵云大数据集团有限公司",
				"publishTime": "2025-12-01",
				"link": "https://ggzy.guizhou.gov.cn/tradeInfo/detailHtml?metaId=1155404885495468032",
				"bidUrl": "",
				"intro": "",
				"content": "<div class=steps>\\n <div class=view_con id=Zoom>\\n  <!-- 异常公示模板 -->\\n  <p style=text-align: center; line-height: 150%>\\n   <span style=text-decoration: underline;>\\n    <span style=font-size: 19px; line-height: 150%; font-family: #39;微软雅黑&amp;#39;, sans-serif>\\n     贵州梵云<span class='highLight'>大数据</span>集团有限公司2025年第二批货物及服务采购安装项目-包1\\n    </span>\\n   </span>\\n   <span style=font-size: 19px; line-height: 150%; font-family: &amp; #39;微软雅黑&amp;#39;,sans-serif>\\n    异常公示\\n   </span>\\n  </p>\\n  <p style=line-height: 150%>\\n   <span style=font-size: 13px; line-height: 150%; font-family: &amp; #39;微软雅黑&amp;#39;,sans-serif>\\n   </span>\\n  </p>\\n  <h3 style=margin-left: 0>\\n   <a>\\n   </a>\\n   <a>\\n   </a>\\n   <a>\\n   </a>\\n   <strong>\\n    <span style=font-family: &amp; #39;微软雅黑&amp;#39;,sans-serif>\\n     一、\\n    </span>\\n   </strong>\\n   <strong>\\n    <span style=font-family: &amp; #39;微软雅黑&amp;#39;,sans-serif>\\n     项目信息\\n    </span>\\n   </strong>\\n  </h3>\\n  <p style=text-indent: 29px; line-height: 150%>\\n   <strong>\\n    <span style=font-family: &amp; #39;微软雅黑&amp;#39;,sans-serif>\\n     项目名称：\\n    </span>\\n   </strong>\\n   <span style=text-decoration: underline;>\\n    贵州梵云<span class='highLight'>大数据</span>集团有限公司2025年第二批货物及服务采购安装项目\\n   </span>\\n  </p>\\n  <p style=text-indent: 29px; line-height: 150%>\\n   <strong>\\n    <span style=font-family: &amp; #39;微软雅黑&amp;#39;,sans-serif>\\n     项目编号：\\n    </span>\\n   </strong>\\n   <span style=text-decoration: underline;>\\n    GQQY-ZB2025110063\\n   </span>\\n  </p>\\n  <p style=text-indent: 29px; line-height: 150%>\\n   <strong>\\n    <span style=font-family: &amp; #39;微软雅黑&amp;#39;,sans-serif>\\n     采购方式：\\n    </span>\\n   </strong>\\n   <span style=text-decoration: underline;>\\n    招标采购\\n   </span>\\n  </p>\\n  <p style=text-indent: 29px; line-height: 150%>\\n   <strong>\\n    <span style=font-family: &amp; #39;微软雅黑&amp;#39;,sans-serif>\\n     邀请范围：\\n    </span>\\n   </strong>\\n   <span style=text-decoration: underline;>\\n    公开\\n   </span>\\n  </p>\\n  <h3 style=margin-left: 0>\\n   <a>\\n   </a>\\n   <a>\\n   </a>\\n   <a>\\n   </a>\\n   <strong>\\n    <span style=font-family: &amp; #39;微软雅黑&amp;#39;,sans-serif>\\n     二、\\n    </span>\\n   </strong>\\n   <strong>\\n    <span style=font-family: &amp; #39;微软雅黑&amp;#39;,sans-serif>\\n     标段信息\\n    </span>\\n   </strong>\\n  </h3>\\n  <p style=text-indent: 29px; line-height: 150%>\\n   <strong>\\n    <span style=font-family: &amp; #39;微软雅黑&amp;#39;,sans-serif>\\n     标段名称：\\n    </span>\\n   </strong>\\n   <span style=text-decoration: underline;>\\n    贵州梵云<span class='highLight'>大数据</span>集团有限公司2025年第二批货物及服务采购安装项目-包1\\n   </span>\\n  </p>\\n  <p style=text-indent: 29px; line-height: 150%>\\n   <strong>\\n    <span style=font-family: &amp; #39;微软雅黑&amp;#39;,sans-serif>\\n     标段编号：\\n    </span>\\n   </strong>\\n   <span style=text-decoration: underline;>\\n    GQQY-ZB2025110063-001\\n   </span>\\n  </p>\\n  <p style=text-indent: 29px; line-height: 150%>\\n   <strong>\\n    <span style=font-family: &amp; #39;微软雅黑&amp;#39;,sans-serif>\\n     标段内容：\\n    </span>\\n   </strong>\\n   <span style=text-decoration: underline;>\\n    详见采购文件\\n   </span>\\n  </p>\\n  <h3 style=margin-left: 0>\\n   <a>\\n   </a>\\n   <a>\\n   </a>\\n   <a>\\n   </a>\\n   <strong>\\n    <span style=font-family: &amp; #39;微软雅黑&amp;#39;,sans-serif>\\n     三、\\n    </span>\\n   </strong>\\n   <strong>\\n    <span style=font-family: &amp; #39;微软雅黑&amp;#39;,sans-serif>\\n     交易特殊情况类型\\n    </span>\\n   </strong>\\n  </h3>\\n  <p style=text-indent: 29px; line-height: 150%>\\n   <span style=text-decoration: underline;>\\n    流标\\n   </span>\\n  </p>\\n  <h3 style=margin-left: 0>\\n   <a>\\n   </a>\\n   <a>\\n   </a>\\n   <a>\\n   </a>\\n   <strong>\\n    <span style=font-family: &amp; #39;微软雅黑&amp;#39;,sans-serif>\\n     四、\\n    </span>\\n   </strong>\\n   <strong>\\n    <span style=font-family: &amp; #39;微软雅黑&amp;#39;,sans-serif>\\n     交易特殊情况原因\\n    </span>\\n   </strong>\\n  </h3>\\n  <p style=text-indent: 29px; line-height: 150%>\\n   <span style=text-decoration: underline;>\\n    本项目有效投标人不足三家，作废标处理。\\n   </span>\\n  </p>\\n  <h3 style=margin-left: 0>\\n   <a>\\n   </a>\\n   <a>\\n   </a>\\n   <a>\\n   </a>\\n   <strong>\\n    <span style=font-family: &amp; #39;微软雅黑&amp;#39;,sans-serif>\\n     五、\\n    </span>\\n   </strong>\\n   <strong>\\n    <span style=font-family: &amp; #39;微软雅黑&amp;#39;,sans-serif>\\n     公示媒体及公示日期\\n    </span>\\n   </strong>\\n  </h3>\\n  <p style=text-indent: 29px; line-height: 150%>\\n   <strong>\\n    <span style=font-family: &amp; #39;微软雅黑&amp;#39;,sans-serif>\\n     公示媒体：\\n    </span>\\n   </strong>\\n   <span style=text-decoration: underline;>\\n    黔云招采电子招标采购交易平台,贵州省国有企业生产资料综合服务平台,贵州省公共资源交易中心,贵州省招标投标公共服务平台,\\n   </span>\\n  </p>\\n  <p style=text-indent: 29px; line-height: 150%>\\n   <strong>\\n    <span style=font-family: &amp; #39;微软雅黑&amp;#39;,sans-serif>\\n     公示期：\\n    </span>\\n   </strong>\\n   <span style=text-decoration: underline;>\\n    /\\n   </span>\\n  </p>\\n  <h3 style=margin-left: 0>\\n   <a>\\n   </a>\\n   <a>\\n   </a>\\n   <a>\\n   </a>\\n   <strong>\\n    <span style=font-family: &amp; #39;微软雅黑&amp;#39;,sans-serif>\\n     六、\\n    </span>\\n   </strong>\\n   <strong>\\n    <span style=font-family: &amp; #39;微软雅黑&amp;#39;,sans-serif>\\n     其它\\n    </span>\\n   </strong>\\n  </h3>\\n  <p style=text-indent: 29px; line-height: 150%>\\n   <span style=font-family: #39;微软雅黑&amp;#39;, sans-serif;text-decoration: underline;>\\n    /\\n   </span>\\n  </p>\\n  <h3 style=margin-left: 0>\\n   <a>\\n   </a>\\n   <a>\\n   </a>\\n   <a>\\n   </a>\\n   <strong>\\n    <span style=font-family: &amp; #39;微软雅黑&amp;#39;,sans-serif>\\n     七、\\n    </span>\\n   </strong>\\n   <strong>\\n    <span style=font-family: &amp; #39;微软雅黑&amp;#39;,sans-serif>\\n     联系方式\\n    </span>\\n   </strong>\\n  </h3>\\n  <p style=text-indent: 29px; line-height: 150%>\\n   <span style=text-decoration: underline;>\\n    招标人：贵州梵云<span class='highLight'>大数据</span>集团有限公司\\n   </span>\\n  </p>\\n  <p style=text-indent: 29px; line-height: 150%>\\n   <span style=text-decoration: underline;>\\n    联系地址：贵州省铜仁市万山区仁山街道金鳞大道<span class='highLight'>大数据</span>产业园22-25楼\\n   </span>\\n  </p>\\n  <p style=text-indent: 29px; line-height: 150%>\\n   <span style=text-decoration: underline;>\\n    联系人：吴老师\\n   </span>\\n  </p>\\n  <p style=text-indent: 29px; line-height: 150%>\\n   <span style=text-decoration: underline;>\\n    联系电话：18008567565\\n   </span>\\n  </p>\\n  <p style=text-indent: 29px; line-height: 150%>\\n   <span style=text-decoration: underline;>\\n    监督人名称：\\n   </span>\\n  </p>\\n  <p style=text-indent: 29px; line-height: 150%>\\n   <span style=text-decoration: underline;>\\n    联系电话：\\n   </span>\\n  </p>\\n  <p>\\n   ​\\n   <br/>\\n  </p>\\n  <p style=text-indent: 29px; line-height: 150%>\\n   <span style=text-decoration: underline;>\\n    招标代理：北京国信创新咨询有限公司\\n   </span>\\n  </p>\\n  <p style=text-indent: 29px; line-height: 150%>\\n   <span style=text-decoration: underline;>\\n    联系地址：北京市海淀区车公庄西路乙19号华通大厦B座五层局部523\\n   </span>\\n  </p>\\n  <p style=text-indent: 29px; line-height: 150%>\\n   <span style=text-decoration: underline;>\\n    联系人：刘才华、闻司琦、朱胤衡\\n   </span>\\n  </p>\\n  <p style=text-indent: 29px; line-height: 150%>\\n   <span style=text-decoration: underline;>\\n    联系电话：13985058861\\n   </span>\\n  </p>\\n  <p>\\n  </p>\\n  <p style=line-height: 150%;margin-top:0;margin-right:0;margin-bottom:10px;margin-left:0;text-align:right;line-height:20px;background:white;text-decoration:underline>\\n   <span style=font-size:16px;color:#333333>\\n    招标人或其招标代理机构主要负责人（项目负责人）：                （签名）\\n   </span>\\n  </p>\\n  <p style=line-height: 150%;margin-top:0;margin-right:0;margin-bottom:10px;margin-left:0;text-align:right;line-height:20px;background:white;text-decoration:underline>\\n   <span style=font-size:16px;color:#333333>\\n    招标人或其招标代理机构：                （签章）\\n   </span>\\n  </p>\\n  <p>\\n   <a>\\n   </a>\\n  </p>\\n  <p>\\n   ​\\n   <br/>\\n  </p>\\n  <p>\\n   <br/>\\n  </p>\\n </div>\\n</div>\\n",
				"id": "157945329",
				"title": "贵州梵云大数据集团有限公司2025年第二批货物及服务采购安装项目-包1交易特殊情况",
				"abs": "",
				"proxy": "北京国信创新咨询有限公司",
				"uuid": "fe9dfbed2158acef4cd1983b76f83e50",
				"textContent": "贵州梵云大数据集团有限公司2025年第二批货物及服务采购安装项目-包1    异常公示                一、     项目信息       项目名称：    贵州梵云大数据集团有限公司2025年第二批货物及服务采购安装项目      项目编号：    GQQY-ZB2025110063      采购方式：    招标采购      邀请范围：    公开            二、     标段信息       标段名称：    贵州梵云大数据集团有限公司2025年第二批货物及服务采购安装项目-包1      标段编号：    GQQY-ZB2025110063-001      标段内容：    详见采购文件            三、     交易特殊情况类型      流标            四、     交易特殊情况原因      本项目有效投标人不足三家，作废标处理。            五、     公示媒体及公示日期       公示媒体：    黔云招采电子招标采购交易平台,贵州省国有企业生产资料综合服务平台,贵州省公共资源交易中心,贵州省招标投标公共服务平台,      公示期：    /            六、     其它      /            七、     联系方式      招标人：贵州梵云大数据集团有限公司     联系地址：贵州省铜仁市万山区仁山街道金鳞大道大数据产业园22-25楼     联系人：吴老师     联系电话：18008567565     监督人名称：     联系电话：    ​     招标代理：北京国信创新咨询有限公司     联系地址：北京市海淀区车公庄西路乙19号华通大厦B座五层局部523     联系人：刘才华、闻司琦、朱胤衡     联系电话：13985058861       招标人或其招标代理机构主要负责人（项目负责人）：                （签名）     招标人或其招标代理机构：                （签章）        ​",
				"areaName": "北京",
				"cityName": "北京市",
				"operaType": ""
			}
		],
		"total": 91,
		"status": 1
	},
	"msg": "执行成功",
	"traceId": "3dd6e8458ecc167f"
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
0	未传入优惠券档案id	coupon_id值填写有误
暂时没有数据哦~

## 9. 接口变更日志

	序号	修改时间	变更内容概要
暂时没有数据哦~

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

