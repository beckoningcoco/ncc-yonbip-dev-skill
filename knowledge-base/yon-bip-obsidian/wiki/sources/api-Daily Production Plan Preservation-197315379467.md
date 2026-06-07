---
title: "日投产计划保存"
apiId: "1973153794675965954"
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

# 日投产计划保存

>  请求方式	POST | Daily Production Plan (MF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/mfg/dailyschedule/save
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
data	object	是	是	日投产计划数据集
id	number
小数位数:0,最大长度:20	否	否	主键，新增时无需填写，修改时必填 示例：2573294878692352
orderCode	string	否	否	生产订单号/生产订单Id,_status = "Insert"时,必须填写 示例：SCDD123213122313
orderProductId	number
小数位数:0,最大长度:20	否	否	生产订单行ID,_status = "Insert"时,生产订单行ID和行号不能同时为空 示例：2573294878692352
orderProductLineNo	string	否	否	生产订单行号,生产订单行ID优先生效,_status = "Insert"时,生产订单行ID和行号不能同时为空 示例：10
assembleLineName	string	否	否	生产线名称/生产线Id,_status = "Insert"时,必须填写 示例：生产线示例
dailySchDate	date
格式:yyyy-MM-dd	否	否	排产日期(YYYY-MM-DD),_status = "Insert"时,必须填写 示例：2024-04-12
dailySchQuantity	number
小数位数:8,最大长度:26	否	是	排产数量 示例：1000
_status	string	否	是	保存操作:Insert-新增,Update-更新 示例：Update

## 3. 请求示例

Url: /yonbip/mfg/dailyschedule/save?access_token=访问令牌
Body: {
	"data": [
		{
			"id": 2573294878692352,
			"orderCode": "SCDD123213122313",
			"orderProductId": 2573294878692352,
			"orderProductLineNo": "10",
			"assembleLineName": "生产线示例",
			"dailySchDate": "2024-04-12",
			"dailySchQuantity": 1000,
			"_status": "Update"
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
code	string	否	编码 示例：200
message	string	否	message 示例：操作成功
message	string	否	返回信息 示例：操作成功
data	object	否	data
successOrder	object	是	successOrder
failedOrder	object	是	failedOrder
failCount	number
小数位数:0,最大长度:10	否	failCount 示例：1
successCount	number
小数位数:0,最大长度:10	否	successCount 示例：1
count	number
小数位数:0,最大长度:10	否	count 示例：2
data	object	否	数据
count	number
小数位数:0,最大长度:10	否	数量 示例：2
sucessCount	number
小数位数:0,最大长度:11	否	成功数量 示例：1
failCount	number
小数位数:0,最大长度:11	否	失败数量 示例：1
messages	string	是	接口返回信息 示例：["订单非开立状态，不可审核"]
failInfos	object	是	失败信息
infos	object	是	成功信息

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 2,
		"sucessCount": 1,
		"failCount": 1,
		"messages": [
			"订单非开立状态，不可审核"
		],
		"failInfos": [
			{
				"id": 222454126880793643456,
				"code": "SRD30284",
				"message": "单据数据错误!"
			}
		],
		"infos": [
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
				"dailySchDate": "2024-02-11",
				"dailySchQuantity": 1000,
				"quantity": 850,
				"completeQuantity": 7,
				"dailyschStatus": "In Progress",
				"dailySchLock": true,
				"mainUnitPrecision": 2,
				"materialProdLineId": 123456,
				"productionRate": 1.25,
				"pubts": "2024-04-12 13:20:16",
				"tenant": 3446326612629264,
				"ytenant": "0000LM067GMS0QRDOI0000"
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
999	不同的错误类型，错误信息不相同	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2026-01-16	
更新
请求说明
更新
请求参数 id
更新
请求参数 orderProductId
更新
请求参数 orderProductLineNo
更新
返回参数 messages
接口文档修改

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

