---
title: "委外到货单列表查询"
apiId: "d18dc0d51c2b4dadb52aca4ea6abb5fb"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Subcontracting Arrival Notice"
domain: "MF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Subcontracting Arrival Notice]
platform_version: "BIP"
source_type: community-api-docs
---

# 委外到货单列表查询

>  请求方式	POST | Subcontracting Arrival Notice (MF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/mfg/arriveorder/list
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
pageIndex	int	否	是	页号 默认值:1 示例：1 默认值：1
pageSize	int	否	是	每页行数 默认值:10 示例：10 默认值：10
rcvOrgId	string	是	否	收货组织id集合 示例：["2322542927713536"]
code	string	否	否	到货单号 示例：WWDH202203140001
subcontractVendorId	long	是	否	委外商id集合 示例：[2322557803745536]
transTypeId	string	是	否	交易类型id集合 示例：["2384748293935360"]
vouchdate	string	否	否	到货日期（区间，格式2021-03-02|2021-03-02 23:59:59） 示例：2022-03-10 00:00:00|2022-03-30 00:00:00
status	short	否	否	单据状态： 0-开立，1-已审核，3-审核中。 示例：0
materialId	long	是	否	制造物料id集合 示例：[2302614949253376]
productId	long	是	否	物料id集合 示例：[2302614949253485]
createTime	string	否	否	创建时间 示例：2022-03-13 18:09:29|2022-03-14 18:09:29
simple	object	否	否	扩展参数
open_pubts_begin	date
格式:yyyy-MM-dd HH:mm:ss	否	否	时间戳，开始时间 示例：2022-01-01 00:00:00
open_pubts_end	date
格式:yyyy-MM-dd HH:mm:ss	否	否	时间戳，结束时间 示例：2022-06-01 00:00:00
simpleVOs	object	是	否	扩展查询条件
field	string	否	否	属性名(条件)(1.pubts(时间戳)) 2.id(单据ID) 示例：pubts 示例：pubts
op	string	否	否	比较符(条件eq:相等, neq：不等, lt：小于, gt：大于, elt：小于等于, egt：大于等于, between：区间, in：包含, nin：不包含, like：包含字符, leftlike：左侧字符包含, rightlike：右侧字符包含, is_null：为空, is_not_null：不为空, and：和, or：或 ) 示例：egt
value1	string	否	否	查询条件值1。示例：2021-01-01 00:00:00 (field值为pubts，op值为egt或gt或el或lt) 示例：2021-01-01 00:00:00
value2	string	否	否	查询条件值2
logicOp	string	否	否	分级逻辑符(and,or)
conditions	object	是	否	下级查询条件

## 3. 请求示例

Url: /yonbip/mfg/arriveorder/list?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"rcvOrgId": [
		"2322542927713536"
	],
	"code": "WWDH202203140001",
	"subcontractVendorId": [
		2322557803745536
	],
	"transTypeId": [
		"2384748293935360"
	],
	"vouchdate": "2022-03-10 00:00:00|2022-03-30 00:00:00",
	"status": 0,
	"materialId": [
		2302614949253376
	],
	"productId": [
		2302614949253485
	],
	"createTime": "2022-03-13 18:09:29|2022-03-14 18:09:29",
	"simple": {
		"open_pubts_begin": "2022-01-01 00:00:00",
		"open_pubts_end": "2022-06-01 00:00:00"
	},
	"simpleVOs": [
		{
			"field": "pubts",
			"op": "egt",
			"value1": "2021-01-01 00:00:00",
			"value2": "",
			"logicOp": "",
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
code	string	否	返回码，成功时返回200 示例：200
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
message	string	否	接口返回信息 示例：操作成功
data	object	否	接口返回数据
pageIndex	long	否	当前页 示例：1
pageSize	long	否	页大小 示例：20
recordCount	long	否	记录总数 示例：0
recordList	object	是	返回数据对象
sumRecordList	object	是	合计字段集合
pageCount	long	否	总页数 示例：0
beginPageIndex	long	否	开始页码 示例：1
endPageIndex	long	否	结束页码 示例：0

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 20,
		"recordCount": 0,
		"recordList": [
			{
				"orgId": "2322542927713536",
				"orgName": "珠海工厂",
				"rcvOrgId": "2322542927713536",
				"rcvOrgName": "珠海工厂",
				"code": "WWDH202203140001",
				"subcontractVendorId": 2322557803745536,
				"subcontractVendorName": "礼拜一",
				"vouchdate": "2022-03-14 00:00:00",
				"transTypeId": "2384748293935360",
				"transTypeName": "委外到货",
				"status": 0,
				"remark": "备注",
				"creator": "13662080373",
				"createTime": "2022-03-14 18:09:29",
				"auditor": "",
				"auditTime": "",
				"auditDate": "",
				"modifier": "",
				"modifyTime": "",
				"id": 2687837291188480,
				"pubts": "2022-03-14 18:09:32",
				"isWfControlled": false,
				"sourceType": "7",
				"verifystate": 0,
				"signType": 1,
				"rcvCustomer": 1257656456833434,
				"rcvVendor": 18928394348348,
				"signerEnterpriseId": 12323213213,
				"requireSign": 1,
				"rcvAddrType": 0,
				"orderProduct": {
					"id": 2687837291188481,
					"materialId": 2322675347313664,
					"productId": 2322675338465536,
					"materialCode": "000002",
					"materialName": "P10",
					"mainUnitName": "瓶",
					"mainUnitPrecision": 4,
					"arriveQuantity": 100,
					"acceptQuantity": 100,
					"refuseQuantity": 0,
					"warehousingQuantity": 0,
					"remark": ""
				}
			}
		],
		"sumRecordList": [
			{
				"orderProduct": {
					"arriveQuantity": 100,
					"acceptQuantity": 100,
					"refuseQuantity": 0,
					"warehousingQuantity": 0
				}
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
暂时没有数据哦~

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-09-23	
更新
请求说明
新增
返回参数 (4)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

