---
title: "巡检记录保存"
apiId: "1612311069340467209"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Routine Inspection Record"
domain: "MRO"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Routine Inspection Record]
platform_version: "BIP"
source_type: community-api-docs
---

# 巡检记录保存

>  请求方式	POST | Routine Inspection Record (MRO)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/am/simrouteinspchartcard/save
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	是	是	巡检记录参数对象
id	string	否	否	巡检记录id（新增时不填，更新时必填） 示例：1430601748862468096
pubts	DateTime	否	否	时间戳（新增时不填，更新时必填，值为上次保存的pubts），传参格式为：yyyy-MM-dd HH:mm:ss 示例：2023-02-09 17:43:27
pk_org	string	否	是	资产组织id或编码，最大传参长度：id（最大36位），编码（最大50位） 示例：1524200639876825094
bill_code	string	否	否	单据编码，以系统编码规则配置为准：系统设置为手工编号时必输，系统设置为自动编号时非必输，最大传参长度：50 示例：XJJL202212220001
bill_type	string	否	否	单据类型编码，传固定值：4B68 示例：4B68 默认值：4B68
pk_patrolroute	string	否	否	巡检路线id或编码，最大传参长度：id（最大36位），编码（最大50位） 示例：1613927076548575237
pk_equip	string	否	否	资产卡片id或编码（注意：资产编码与位置编码不能同时为空，而且资产编码与位置编码仅填其中之一），最大传参长度：id（最大36位），编码（最大50位） 示例：1535391486431461381
pk_location	string	否	否	位置id或编码（注意：资产编码与位置编码不能同时为空，而且资产编码与位置编码仅填其中之一），最大传参长度：id（最大36位），编码（最大50位） 示例：LOC23080006
pk_pcstd	string	否	否	巡检标准id或编码，最大传参长度：id（最大36位），编码（最大50位） 示例：1550718145927839753
pc_position	string	否	否	巡检部位，最大传参长度：80 示例：电机
pc_item	string	否	否	巡检项目，最大传参长度：2000 示例：机体
pc_content	string	否	否	巡检内容，最大传参长度：2000 示例：api测试1222-1
pc_measureitems	string	否	否	巡检测量项目id或编码，最大传参长度：id（最大36位），编码（最大50位） 示例：002
item_describe	string	否	否	测量项目说明，最大传参长度：2000 示例：振动偏移量
pc_cycle	long	否	否	巡检周期，数据范围：整数 示例：1
pc_unit	string	否	否	周期单位（"1": "小时","2": "班次","3": "天"） 示例：2
pc_method	string	否	否	巡检方法，最大传参长度：2000 示例：触摸
std_need	string	否	否	标准要求，最大传参长度：2000 示例：无明显振动，无噪音
pc_estate	string	否	否	巡检状态（"1": "运行或停运","2": "运行","3": "停运"） 示例：1
upperlimit	number
小数位数:8,最大长度:28	否	否	操作上限（当具有巡检测量项目且此测量项目为测量类型时录入，其他情况录入无效，操作上限必须大于操作下限），数值类型，最多8位小数 示例：100
lowerlimit	number
小数位数:8,最大长度:28	否	否	操作下限（当具有巡检测量项目且此测量项目为测量类型时录入，其他情况录入无效，操作上限必须大于操作下限），数值类型，最多8位小数 示例：10
continuity	long	否	否	区间范围（"1": "左右包含","2": "左包含","3": "右包含","4": "左右不包含"） 示例：1
pk_shift	string	否	否	巡检班次id，最大传参长度：36 示例：1593764301021118471
pc_time	string	否	否	巡检时间（格式YYYY-MM-dd HH:mm:ss） 示例：2022-12-22 12:00:00
pk_pcuser	string	否	否	巡检人id或编码，当录入巡检人时，巡检时间、巡检结果必填，最大传参长度：id（最大36位），编码（最大50位） 示例：1524200674255437831
pcmeas_result	number
小数位数:8,最大长度:28	否	否	巡检测量结果，数值类型，最多8位小数 示例：80
pk_pcresult	string	否	否	巡检结果（点巡检结果定义档案）id或编码，最大传参长度：id（最大36位），编码（最大50位） 示例：PRESET01_0000L6VWE12DH6JBPJ0000
memo	string	否	否	备注，最大传参长度：200 示例：备注信息
start_time	string	否	否	开始扫码时间（格式：YYYY-MM-dd HH:mm:ss） 示例：2022-12-22 12:00:00
disp_time	string	否	否	录入结果时间（格式YYYY-MM-dd HH:mm:ss） 示例：2022-12-22 14:30:00
pk_disposer	string	否	否	巡检提交人id或编码，最大传参长度：id（最大36位），编码（最大50位） 示例：1524200674255437831
commit_time	string	否	否	巡检提交时间（格式：YYYY-MM-dd HH:mm:ss） 示例：2022-12-22 14:30:00
lng	number
小数位数:8,最大长度:28	否	否	经度，数值类型，最多8位小数 示例：115.7
lat	number
小数位数:8,最大长度:28	否	否	纬度，数值类型，最多8位小数 示例：41.6
confirm_flag	short	否	否	已确认，枚举,{ "1":"是" "0":"否" ],默认值0 示例：0 默认值：0
pk_confirmer	string	否	否	确认人id或编码，最大传参长度：id（最大36位），编码（最大50位） 示例：1524200674255437831
confirm_time	string	否	否	确认时间（格式：YYYY-MM-dd HH:mm:ss） 示例：2022-12-22 14:35:00
defines	object	否	否	自由自定义项（支持60个自定义项）
_status	string	否	是	状态（新增：Insert，更新：Update），默认Insert 示例：Insert 默认值：Insert

## 3. 请求示例

Url: /yonbip/am/simrouteinspchartcard/save?access_token=访问令牌
Body: {
	"data": [
		{
			"id": "1430601748862468096",
			"pubts": "2023-02-09 17:43:27",
			"pk_org": "1524200639876825094",
			"bill_code": "XJJL202212220001",
			"bill_type": "4B68",
			"pk_patrolroute": "1613927076548575237",
			"pk_equip": "1535391486431461381",
			"pk_location": "LOC23080006",
			"pk_pcstd": "1550718145927839753",
			"pc_position": "电机",
			"pc_item": "机体",
			"pc_content": "api测试1222-1",
			"pc_measureitems": "002",
			"item_describe": "振动偏移量",
			"pc_cycle": 1,
			"pc_unit": "2",
			"pc_method": "触摸",
			"std_need": "无明显振动，无噪音",
			"pc_estate": "1",
			"upperlimit": 100,
			"lowerlimit": 10,
			"continuity": 1,
			"pk_shift": "1593764301021118471",
			"pc_time": "2022-12-22 12:00:00",
			"pk_pcuser": "1524200674255437831",
			"pcmeas_result": 80,
			"pk_pcresult": "PRESET01_0000L6VWE12DH6JBPJ0000",
			"memo": "备注信息",
			"start_time": "2022-12-22 12:00:00",
			"disp_time": "2022-12-22 14:30:00",
			"pk_disposer": "1524200674255437831",
			"commit_time": "2022-12-22 14:30:00",
			"lng": 115.7,
			"lat": 41.6,
			"confirm_flag": 0,
			"pk_confirmer": "1524200674255437831",
			"confirm_time": "2022-12-22 14:35:00",
			"defines": {
				"id": "1430601748862468098",
				"define1": ""
			},
			"_status": "Insert"
		}
	]
}

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
code	string	否	状态码（200：成功，其他：失败） 示例：200
message	string	否	返回信息 示例：操作成功！！
data	object	否	返回数据
count	long	否	总数 示例：1
sucessCount	long	否	成功数量 示例：1
failCount	long	否	失败数量 示例：0
failInfos	object	是	错误详细信息
messages	object	是	返回详细信息
infos	object	是	数据详细信息

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功！！",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"failInfos": [
			{}
		],
		"messages": [
			{}
		],
		"infos": [
			{
				"id": "",
				"creator": "d4a2a1e7-2749-43d7-8d67-e5bfa7a51f44",
				"creator__name": "YonSuite默认用户",
				"creationtime": "2022-07-19 16:49:11",
				"pk_org": "1524200639876825094",
				"bill_code": "XJJL202212220001",
				"bill_status": "0",
				"bill_type": "4B68",
				"pk_patrolroute": "1613927076548575237",
				"pk_equip": "1535391486431461381",
				"pk_location": "",
				"pk_pcstd": "1550718145927839753",
				"pc_position": "电机",
				"pc_item": "机体",
				"pc_content": "api测试1222-1",
				"pc_measureitems": "002",
				"item_describe": "振动偏移量",
				"pc_cycle": 1,
				"pc_unit": 2,
				"pc_method": "触摸",
				"std_need": "无明显振动，无噪音",
				"pc_estate": 1,
				"upperlimit": 100,
				"lowerlimit": 10,
				"continuity": 1,
				"pk_shift": "1593764301021118471",
				"pc_time": "2022-12-22 12:00:00",
				"pk_pcuser": "1524200674255437831",
				"pcmeas_result": 80,
				"pk_pcresult": "PRESET01_0000L6VWE12DH6JBPJ0000",
				"memo": "备注信息",
				"start_time": "2022-12-22 12:00:00",
				"disp_time": "2022-12-22 14:30:00",
				"pk_disposer": "1524200674255437831",
				"commit_time": "2022-12-22 14:30:00",
				"lng": 0,
				"lat": 0,
				"pk_confirmer": "1524200674255437831",
				"confirm_time": "2022-12-22 14:35:00"
			}
		]
	}
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
999	输入的长度不能超过40位	请检查传入数据的正确性

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-09-17	
更新
请求说明

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

