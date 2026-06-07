---
title: "流程成本收集订单保存"
apiId: "2270025361460297735"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "MO"
domain: "MF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, MO]
platform_version: "BIP"
source_type: community-api-docs
---

# 流程成本收集订单保存

>  请求方式	POST | MO (MF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/mfg/productionorder/costCollect/create
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	MDD幂等
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	否	是	data
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
id	number
小数位数:0,最大长度:19	否	否	主键， 新增时无需填写，修改时必填 示例：1957365595279616
orgId	number
小数位数:0,最大长度:19	否	是	工厂ID 示例：1866605942198527
transTypeId	string	否	是	交易类型id，可以提供交易类型的id或code 示例：WWSQ01
productionDepartmentId	string	否	是	生产部门id，可以提供生产部门的id或code 示例：2659083286122752
vouchdate	date
格式:yyyy-MM-dd HH:mm:ss	否	是	单据日期，格式“2022-01-01”
code	string	否	否	单据编号，设置手工编号时必输，自动编号时输入无效 示例：SCDD0220331008014
remark	string	否	否	备注 示例：XX工厂合同
_status	string	否	是	操作标识；Insert:新增，Update:更新 示例：Insert
orderProduct	object	是	否	产品行信息
out_sys_id	string	否	否	外部来源Id 示例：2297527422652672
out_sys_code	string	否	否	外部来源编码 示例：SCDD20230101
out_sys_version	string	否	否	外部系统版本 示例：01
out_sys_type	string	否	否	外部来源类型 示例：u8c

## 3. 请求示例

Url: /yonbip/mfg/productionorder/costCollect/create?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": 1957365595279616,
		"orgId": 1866605942198527,
		"transTypeId": "WWSQ01",
		"productionDepartmentId": "2659083286122752",
		"vouchdate": "2026-06-07 13:16:18",
		"code": "SCDD0220331008014",
		"remark": "XX工厂合同",
		"_status": "Insert",
		"orderProduct": [
			{
				"id": 34543454324,
				"productId": 0,
				"productionUnitId": 2297527422652672,
				"quantity": 10,
				"auxiliaryQuantity": 10,
				"startDate": "2022-04-02",
				"finishDate": "2022-04-05",
				"orgId": 2325505713575680,
				"warehouseId": "2325505713575680",
				"remark": "备注信息",
				"_status": "Insert",
				"orderByProduct": [
					{
						"id": 2325505713575680,
						"productionType": "1",
						"productId": 0,
						"productionUnitId": 2297527422652672,
						"quantity": 10,
						"auxiliaryQuantity": 10,
						"productionDate": "2022-04-03",
						"orgId": 2325505713575680,
						"warehouseId": 0,
						"remark": "12345",
						"_status": "Insert"
					}
				],
				"projectId": 3,
				"out_sys_rowno": "",
				"out_sys_lineid": "",
				"costCenterId": 2325505713575680,
				"virtualAccbodyId": 2325505713575680
			}
		],
		"out_sys_id": "2297527422652672",
		"out_sys_code": "SCDD20230101",
		"out_sys_version": "01",
		"out_sys_type": "u8c"
	}
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
小数位数:0,最大长度:10	否	code 示例：200
message	string	否	message 示例：操作成功
data	object	否	data
count	number
小数位数:0,最大长度:10	否	count 示例：1
sucessCount	number
小数位数:0,最大长度:10	否	sucessCount 示例：1
failCount	number
小数位数:0,最大长度:10	否	failCount 示例：0
messages	string	是	messages
infos	object	是	infos
failInfos	string	是	failInfos
traceId	string	否	traceId 示例：b9233ef88281e58a
uploadable	string	否	uploadable 示例：0

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			""
		],
		"infos": [
			{
				"id": "2288572198565183489",
				"orgId": "1997658713415483401",
				"transTypeId": "1997611082204053647",
				"productionDepartmentId": "1997659417795362818",
				"vouchdate": "2025-06-11 12:29:55",
				"code": "CBSJ2025061100000012",
				"orderProduct": [
					{
						"id": "2288572198565183490",
						"productId": "2118011445165686785",
						"quantity": 10,
						"startDate": "2025-06-11 00:00:00",
						"finishDate": "2025-06-11 00:00:00",
						"orgId": "1997658713415483401",
						"orderByProduct": [
							{
								"id": "2288572198565183491",
								"productionType": "1",
								"productId": "2118011041438760965",
								"quantity": 10,
								"numeratorQuantity": 1,
								"denominatorQuantity": 1,
								"productionDate": "2025-06-12 00:00:00",
								"orgId": "1997658713415483401",
								"orgName": "制造云工厂",
								"orgCode": "zzygc",
								"orgId__transferValue": true,
								"productCode": "TQ-01C",
								"productName": "车件外圈",
								"productId__transferValue": true,
								"orderProductId": "2288572198565183490",
								"changeType": 0,
								"lineNo": 10,
								"orderProductLineNo": 10,
								"pubts": "2025-06-11 14:54:30",
								"tenant": 3810139460769744,
								"ytenant": "0000LW7EPOWEFP19MR0000",
								"yTenantId": "0000LW7EPOWEFP19MR0000"
							}
						],
						"orgName": "制造云工厂",
						"orgCode": "zzygc",
						"orgId__transferValue": true,
						"productCode": "TQ-01D",
						"productName": "锻件外圈",
						"productId__transferValue": true,
						"orderId": "2288572198565183489",
						"financeStatus": 0,
						"enableSFCPlan": false,
						"completedFlag": false,
						"materialApplyFlag": false,
						"lineNo": 10,
						"updateFirstupcode": true,
						"firstsource": "po_production_order",
						"firstupcode": "CBSJ2025061100000012",
						"firstlineno": 10,
						"firstsourceid": "2288572198565183489",
						"firstsourceautoid": "2288572198565183490",
						"pubts": "2025-06-11 14:54:30",
						"tenant": 3810139460769744,
						"ytenant": "0000LW7EPOWEFP19MR0000",
						"yTenantId": "0000LW7EPOWEFP19MR0000"
					}
				],
				"transTypeName": "标准生产",
				"transTypeCode": "PO-001",
				"transTypeId__transferValue": true,
				"orgName": "制造云工厂",
				"orgCode": "zzygc",
				"orgId__transferValue": true,
				"departmentName": "生产部门",
				"productionDepartmentId__transferValue": true,
				"bizType": "2",
				"billSource": "0",
				"financeStatus": 0,
				"isWfControlled": false,
				"creatorId": "1998343502991196166",
				"creator": "韩佳佳",
				"createTime": "2025-06-11 14:54:30",
				"createDate": "2025-06-11 14:54:30",
				"barCode": "po_cost_collect_order|2288572198565183489",
				"status": 0,
				"pubts": "2025-06-11 14:54:30",
				"tenant": 3810139460769744,
				"ytenant": "0000LW7EPOWEFP19MR0000",
				"yTenantId": "0000LW7EPOWEFP19MR0000"
			}
		],
		"failInfos": [
			""
		]
	},
	"traceId": "b9233ef88281e58a",
	"uploadable": "0"
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
	1	2025-07-14	
删除
请求参数 mrpQuantity
删除
请求参数 scrap

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

