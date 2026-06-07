---
title: "日投产计划查询"
apiId: "1971674444741476357"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Daily Production Plan"
domain: "MF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Daily Production Plan]
platform_version: "BIP"
source_type: community-api-docs
---

# 日投产计划查询

>  请求方式	POST | Daily Production Plan (MF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/mfg/dailyschedule/list
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
pageIndex	number
小数位数:0,最大长度:11	否	是	页号 默认值:1 默认值：1
pageSize	number
小数位数:0,最大长度:11	否	是	每页行数 默认值:10 默认值：10
orderId!orgId	string	是	是	工厂id 示例：["12313123","1231231"]
orderProductId!productId	number
小数位数:0,最大长度:20	是	否	物料id 示例：[12313123,1231231]
assembleLineId	number
小数位数:0,最大长度:20	是	否	生产线id 示例：[12313123,1231231]
orderId!productDeptId	string	是	否	生产部门id 示例：["12313123","1231231"]
orderId	number
小数位数:0,最大长度:20	是	否	生产订单id 示例：[12313123,1231231]
dailySchDate	string	否	否	排产日期（区间，格式2021-03-02|2021-03-04 23:59:59） 示例：2021-03-02|2021-03-02 23:59:59
simpleVOs	object	是	否	扩展查询条件
field	string	否	否	属性名(条件)(1.pubts(时间戳)) 2.id(单据ID) 3.sourceType(来源类别 0：手工录入 1：计划订单) 示例：pubts
op	string	否	否	比较符(条件eq:相等, neq：不等, lt：小于, gt：大于, elt：小于等于, egt：大于等于, between：区间, in：包含, nin：不包含, like：包含字符, leftlike：左侧字符包含, rightlike：右侧字符包含, is_null：为空, is_not_null：不为空, and：和, or：或 )
value1	string	否	否	查询条件值1。示例：2021-01-01 00:00:00 (field值为pubts，op值为egt或gt或el或lt)
value2	string	否	否	查询条件值2
logicOp	string	否	否	逻辑连接符(and：且；or：或) 注：logicOp有值时，conditions条件生效，logicOp同级的其他条件不生效；logicOp无值时，conditions条件不生效，logicOp同级设置的其他条件生效。 示例：or 示例：and
conditions	object	是	否	下级查询条件

## 3. 请求示例

Url: /yonbip/mfg/dailyschedule/list?access_token=访问令牌
Body: {
	"pageIndex": 0,
	"pageSize": 0,
	"orderId!orgId": [
		"12313123",
		"1231231"
	],
	"orderProductId!productId": [
		12313123,
		1231231
	],
	"assembleLineId": [
		12313123,
		1231231
	],
	"orderId!productDeptId": [
		"12313123",
		"1231231"
	],
	"orderId": [
		12313123,
		1231231
	],
	"dailySchDate": "2021-03-02|2021-03-02 23:59:59",
	"simpleVOs": [
		{
			"field": "",
			"op": "",
			"value1": "",
			"value2": "",
			"logicOp": "and",
			"conditions": [
				{
					"field": "",
					"op": "",
					"value1": "",
					"value2": ""
				}
			]
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
code	number
小数位数:0,最大长度:10	否	返回码，成功时返回200 示例：200
message	string	否	message 示例：操作成功
message	string	否	接口返回信息 示例：操作成功
data	object	否	data
successOrder	object	是	successOrder
failedOrder	object	是	failedOrder
failCount	number
小数位数:0,最大长度:10	否	failCount 示例：1
successCount	number
小数位数:0,最大长度:10	否	successCount 示例：1
count	number
小数位数:0,最大长度:10	否	count 示例：2
data	object	否	接口返回数据
pageIndex	number
小数位数:0,最大长度:10	否	当前页 示例：1
pageSize	number
小数位数:0,最大长度:10	否	页大小 示例：20
recordCount	number
小数位数:0,最大长度:10	否	记录总数 示例：0
recordList	object	是	返回数据对象
pageCount	number
小数位数:0,最大长度:10	否	总页数 示例：0
beginPageIndex	number
小数位数:0,最大长度:10	否	开始页码 示例：1
endPageIndex	number
小数位数:0,最大长度:10	否	结束页码 示例：0

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 20,
		"recordCount": 0,
		"recordList": [
			{
				"id": 2573294878692352,
				"orgId": "2573294878692352",
				"orgName": "工厂1",
				"status": "",
				"orderId": 2573294878692352,
				"orderCode": "SCDD123213122313",
				"orderProductId": 2573294878692352,
				"orderProductLineNo": "10",
				"materialId": 2573294878692352,
				"productId": 2573294878692352,
				"productName": "物料名称示例",
				"productCode": "物料编码示例",
				"materialCode": "物料编码示例",
				"materialName": "物料名称示例",
				"assembleLineId": 2573294878692352,
				"assembleLineName": "生产线示例",
				"dailySchDate": "YYYY-MM-DD",
				"dailySchQuantity": 1000,
				"quantity": 850,
				"completeQuantity": 7,
				"dailyschStatus": "In Progress",
				"dailySchLock": true,
				"mainUnitPrecision": 2,
				"materialProdLineId": 123456,
				"productionRate": 1.25
			}
		],
		"pageCount": 0,
		"beginPageIndex": 1,
		"endPageIndex": 0
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
999	取决于错误类型，不同错误信息不同	

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

