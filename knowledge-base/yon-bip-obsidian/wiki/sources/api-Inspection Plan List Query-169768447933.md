---
title: "检验方案列表查询"
apiId: "1697684479331008517"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Inspection Scheme"
domain: "IMCS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Inspection Scheme]
platform_version: "BIP"
source_type: community-api-docs
---

# 检验方案列表查询

>  请求方式	POST | Inspection Scheme (IMCS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/imcs/inspectionplan/list
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
pageIndex	int	否	是	第几页 默认值：1
pageSize	int	否	是	每页多少条数据 默认值：10
inspectionPlanClass	string	否	否	检验方案分类ID：和检验方案分类编码可以同时为空，都有值时取ID值 示例：1731193848528371716
inspectionPlanClassCode	string	否	否	检验方案分类编码：和检验方案分类ID可以同时为空，都有值时取ID值 示例：02
qualityInspectionCenter	string	是	否	管理组织ID：和管理组织编码可以同时为空，都有值时取ID值 示例：["1503239447124639752"]
qualityInspectionCenterCode	string	是	否	管理组织编码：和管理组织ID可以同时为空，都有值时取ID值 示例：["m27星之国"]
applyOrgId	string	否	否	使用组织ID：和使用组织编码可以同时为空，都有值时取ID值 示例：1503239447124639752
applyOrgCode	string	否	否	使用组织编码：和使用组织ID可以同时为空，都有值时取ID值 示例：m27星之国
code	string	否	否	检验方案编码 示例：0
name	string	否	否	检验方案名称 示例：1
qualityLevel	string	是	否	质量等级组ID：和质量等级组编码可以同时为空，都有值时取ID值 示例：["1508632628979826693"]
qualityLevelCode	string	是	否	质量等级组编码：和质量等级组ID可以同时为空，都有值时取ID值 示例：["02"]
newestVer	string	否	否	版本范围：0为全部版本；1为最新版本 示例：1
storage	string	是	否	启用状态：0为启用；1为停用 示例：["1"]
verifystate	string	是	否	单据状态：0为开立；2为已审核 示例：[ "0", "2" ]
validFromStart	Date	否	否	有效期从最早时间 示例：2023-03-28
validFromEnd	Date	否	否	有效期从最晚时间 示例：2023-06-25
pubts	string	否	否	时间戳，支持最高10位数字的秒级时间戳，默认起始时间戳，如果需要结束时间戳，则用 | 进行分割，如1717038743|1717038999 示例：1717038743|1717038999
simpleVOs	object	是	否	自定义扩展查询条件
field	string	否	否	属性名(条件) 示例：status
op	string	否	否	比较符(条件eq:相等, neq：不等, lt：小于, gt：大于, elt：小于等于, egt：大于等于, between：区间, in：包含, nin：不包含, like：包含字符, leftlike：左侧字符包含, rightlike：右侧字符包含, is_null：为空, is_not_null：不为空, and：和, or：或 ) 示例：in
value1	string	否	否	查询条件值1。示例：2021-01-01 00:00:00 (field值为pubts，op值为egt或gt或el或lt) 示例：[0,1,3]
value2	string	否	否	查询条件值2
logicOp	string	否	否	逻辑连接符(and：且；or：或) 注：logicOp有值时，conditions条件生效，logicOp同级的其他条件不生效；logicOp无值时，conditions条件不生效，logicOp同级设置的其他条件生效。 示例：or
conditions	object	否	否	下级查询条件

## 3. 请求示例

Url: /yonbip/imcs/inspectionplan/list?access_token=访问令牌
Body: {
	"pageIndex": 0,
	"pageSize": 0,
	"inspectionPlanClass": "1731193848528371716",
	"inspectionPlanClassCode": "02",
	"qualityInspectionCenter": [
		"1503239447124639752"
	],
	"qualityInspectionCenterCode": [
		"m27星之国"
	],
	"applyOrgId": "1503239447124639752",
	"applyOrgCode": "m27星之国",
	"code": "0",
	"name": "1",
	"qualityLevel": [
		"1508632628979826693"
	],
	"qualityLevelCode": [
		"02"
	],
	"newestVer": "1",
	"storage": [
		"1"
	],
	"verifystate": [
		"0",
		"2"
	],
	"validFromStart": "2023-03-28",
	"validFromEnd": "2023-06-25",
	"pubts": "1717038743|1717038999",
	"simpleVOs": [
		{
			"field": "status",
			"op": "in",
			"value1": "[0,1,3]",
			"value2": "",
			"logicOp": "",
			"conditions": {
				"field": "",
				"op": "",
				"value1": "",
				"value2": ""
			}
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
code	string	否	code 示例：200
message	string	否	message 示例：操作成功
data	object	是	data
pageIndex	int	否	第几页 示例：1
pageSize	int	否	每页有几条 示例：10
pageCount	int	否	总页数 示例：1
beginPageIndex	int	否	开始页1 示例：1
endPageIndex	int	否	结束页 示例：1
recordCount	int	否	获取的数据条数 示例：1
recordList	object	是	获取的数据list

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"pageIndex": 1,
			"pageSize": 10,
			"pageCount": 1,
			"beginPageIndex": 1,
			"endPageIndex": 1,
			"recordCount": 1,
			"recordList": [
				{
					"applyOrgId": "1503239447124639752",
					"applyOrgName": "m27星之国",
					"applyRangeId": 1752577434151550987,
					"code": "daoru202306120001test---",
					"createTime": "2023-06-20 10:07:47",
					"creator": "昵称-hm",
					"detailId": 1752577434151550986,
					"id": "1752577434151550985",
					"inspectionPlanClass": "1731193848528371716",
					"inspectionPlanClassName": "api创建02",
					"inspectionType": "001,002,003,007,006,008",
					"isInspectionItemConfirm": "是",
					"modifier": "昵称-hm",
					"modifyTime": "2023-06-20 16:01:03",
					"name": "daoru202306120001test---",
					"newestVer": "是",
					"note": "ssssss",
					"pubts": "2023-06-20 10:07:47",
					"qualityInspectionCenter": "1503239447124639752",
					"qualityInspectionCenterName": "m27星之国",
					"qualityLevel": "1508632628979826693",
					"qualityLevelName": "测试数据2",
					"recordValue": "否",
					"samplingMethod": "1624192933159239691",
					"samplingMethodName": "楚楚楚楚楚楚次",
					"storage": "启用",
					"useOrgId": "1503239447124639752",
					"useOrgCode": "m27星之国",
					"useOrgName": "m27星之国",
					"validFrom": "2023-06-20 00:00:00",
					"expiryDate": "2023-06-30 00:00:00",
					"verifystate": "已审核",
					"version": "4"
				}
			]
		}
	]
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
999	取决于错误类型，以实际返回内容为准	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2026-01-21	
更新
请求说明
新增
返回参数 qmsEquipIdName
新增
返回参数 qmsEquipId
更新
返回参数 inspectionItemBList
更新
返回参数 matchPlanList
增加仪器设备
	2	2025-06-25	
新增
返回参数 leniencyAdjust
新增
返回参数 inspectStage
更新
返回参数 roudingRule

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

