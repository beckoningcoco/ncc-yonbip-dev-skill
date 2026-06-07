---
title: "委外核销调整单列表查询"
apiId: "1090a3e620064bb9b9dfaf161ed87956"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Subcontracting Settlement Adj"
domain: "MF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Subcontracting Settlement Adj]
platform_version: "BIP"
source_type: community-api-docs
---

# 委外核销调整单列表查询

>  请求方式	POST | Subcontracting Settlement Adj (MF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/mfg/verificationadjust/list
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
pageIndex	int	否	是	页号 示例：1 默认值：1
pageSize	int	否	是	每页行数 示例：10 默认值：10
code	string	否	否	核销调整单号 示例：HXTZ20220228000003
status	string	否	否	核销单状态： 0-开立；1-已审核 示例：0
transTypeId	string	是	否	交易类型id 示例：["1866605942198527"]
orgId	string	是	否	组织id 示例：["1866605494214585"]
vendorId	long	是	否	委外商id 示例：[1666054942455852]
productId	long	是	否	物料id 示例：[1666054942445322]
purinrecordsCode	string	否	否	委外入库单号 示例：WWRK001
purinrecordsRowno	int	否	否	委外入库单的行号 示例：10
vouchdate	string	否	否	单据日期。区间，格式2021-03-01|2021-03-02 23:59:59 示例：2021-03-02|2021-03-02 23:59:59
simple	object	否	否	扩展参数
open_pubts_begin	date
格式:yyyy-MM-dd HH:mm:ss	否	否	时间戳，开始时间 示例：2022-01-01 00:00:00
open_pubts_end	date
格式:yyyy-MM-dd HH:mm:ss	否	否	时间戳，结束时间 示例：2022-06-01 00:00:00
simpleVOs	object	是	否	扩展查询条件
field	string	否	否	属性名（核销调整单字段，如：pubts（表头时间戳）、id（表头id）、auditDate（审核日期）等。若是子表字段，则使用 verificationDetail.xxx）
op	string	否	否	比较符(条件eq:相等, neq：不等, lt：小于, gt：大于, elt：小于等于, egt：大于等于, between：区间, in：包含, nin：不包含, like：包含字符, leftlike：左侧字符包含, rightlike：右侧字符包含, is_null：为空, is_not_null：不为空, and：和, or：或 )
value1	string	否	否	查询条件值1。示例：2021-01-01 00:00:00 (field值为pubts，op值为egt或gt或el或lt)
value2	string	否	否	查询条件值2

## 3. 请求示例

Url: /yonbip/mfg/verificationadjust/list?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"code": "HXTZ20220228000003",
	"status": "0",
	"transTypeId": [
		"1866605942198527"
	],
	"orgId": [
		"1866605494214585"
	],
	"vendorId": [
		1666054942455852
	],
	"productId": [
		1666054942445322
	],
	"purinrecordsCode": "WWRK001",
	"purinrecordsRowno": 10,
	"vouchdate": "2021-03-02|2021-03-02 23:59:59",
	"simple": {
		"open_pubts_begin": "2022-01-01 00:00:00",
		"open_pubts_end": "2022-06-01 00:00:00"
	},
	"simpleVOs": [
		{
			"field": "",
			"op": "",
			"value1": "",
			"value2": ""
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
code	string	否	接口返回码，成功时返回200 示例：200
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
pageSize	long	否	页大小 示例：10
recordCount	long	否	记录总数 示例：2
pageCount	long	否	总页数 示例：1
beginPageIndex	long	否	开始页码 示例：1
endPageIndex	long	否	结束页码 示例：1
recordList	object	是	返回数据对象
sumRecordList	object	是	合计字段集合

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 10,
		"recordCount": 2,
		"pageCount": 1,
		"beginPageIndex": 1,
		"endPageIndex": 1,
		"recordList": [
			{
				"id": 2569918922740224,
				"orgId": "2325505713575680",
				"orgName": "资产管理公司",
				"financeOrgId": "2325505713575680",
				"financeOrgName": "资产管理公司",
				"subcontractproductMain_orgId": "2325505713575680",
				"transTypeId": "2325273783046416",
				"transTypeName": "核销",
				"vouchdate": "2021-12-21 00:00:00",
				"status": 0,
				"code": "HX20211221011014",
				"verificationType": "0",
				"verificationUserId": "2325478401872128",
				"isReturn": false,
				"sourceType": "2",
				"docType": "0",
				"purinOrgId": "2325505713575680",
				"purnInrgName": "资产管理公司",
				"purinrecordsMain": 2563386232295680,
				"purinrecordsMainCode": "OSMI20211216000003",
				"purinrecordsId": 2563386232295681,
				"purinrecordsRowNo": 1,
				"purinDate": "2021-12-16 00:00:00",
				"pubts": "2021-03-24 11:40:13",
				"productId": 2325533913174272,
				"productcode": "000001",
				"productname": "P10",
				"skuId": 2325533922283776,
				"skuCode": "000001",
				"skuName": "P10",
				"purinQuantity": 10000,
				"unitName": "袋",
				"purinStockQuantity": 10000,
				"stockUnitName": "袋",
				"purinrecordsMain_warehouse": 2235533922283098,
				"warehousename": "WWS1委外仓",
				"remark": "代工单维护",
				"creator": "13662080373",
				"createTime": "2021-03-24 11:40:12",
				"auditor": "Yanjha",
				"auditTime": "2021-08-17 16:37:02",
				"auditDate": "2021-08-17 00:00:00",
				"modifyTime": "2021-12-21 10:57:14",
				"unitId": 2325529461018880,
				"unitIdprecision": 1,
				"stockUnitId": 2325529461018880,
				"stockUnitIdprecision": 1,
				"vendorId": 2325541812343040,
				"vendorName": "WWS1",
				"isUpdateCost": true,
				"isScrap": false,
				"verificationDetail_unitId": 2325529933615360,
				"verificationDetail_stockUnitId": 2325529461018880,
				"freeCharacteristics": {},
				"verificationDetail": [
					{
						"rowno": 10,
						"verificationBy": "0",
						"productId": 2325569972998400,
						"productCode": "000002",
						"productName": "CaiL-1",
						"skuId": 2325569980780800,
						"skuCode": "000002",
						"skuName": "CaiL-1",
						"materialOutMainId": 2352097725338112,
						"materialOutMainCode": "CLCK20210720000002",
						"materialOutId": 2352097725436416,
						"materialOutIdRowNO": 2,
						"materialOutDirection": 0,
						"materialOutQuantity": 186.8874,
						"stockOrgId": "2325505713575680",
						"stockOrgName": "资产管理公司",
						"unitUseQuantity": 1,
						"verificationQuantity": 0,
						"curQuantity": 2,
						"mainUnitName": "千克",
						"curStockQuantity": 2,
						"stockUnitIdName": "千克",
						"stockToMain": 1,
						"mainUnitPrecision": 4,
						"stockprecision": 4,
						"isFromOSMIn": false,
						"isUpdateCost": true,
						"isScrap": false,
						"isBackflush": false,
						"id": 2569918922740225,
						"freeCharacteristics": {}
					}
				]
			}
		],
		"sumRecordList": [
			{
				"purinQuantity": 20000,
				"purinStockQuantity": 20000,
				"verificationDetail": [
					{
						"verificationQuantity": 0,
						"materialOutQuantity": 186.8874,
						"curStockQuantity": 4,
						"curQuantity": 4
					}
				]
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

