---
title: "委外到货计划保存"
apiId: "2002126724939644937"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Subcontracting Delivery Schedule"
domain: "MF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Subcontracting Delivery Schedule]
platform_version: "BIP"
source_type: community-api-docs
---

# 委外到货计划保存

>  请求方式	POST | Subcontracting Delivery Schedule (MF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/mfg/arriveplan/save
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
data	object	是	是	单据数据
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
orderCode	string	否	是	委外订单code，可以提供委外订单的id或code 示例：2001976246446063616
id	string	否	否	委外到货计划ID，新增时为空，编辑时不能为空 示例：2172776384081952774
orderProductId	string	否	是	委外订单行ID 示例：2001976246446063617
orderByproductId	string	否	否	联副产品ID 示例：2001976246446063617
deliveryQuantity	number
小数位数:8,最大长度:28	否	是	计划到货数量 示例：1
deliveryAuxiliaryQuantity	number
小数位数:8,最大长度:28	否	是	计划到货件数 示例：1
deliveryDate	date
格式:yyyy-MM-dd	否	是	计划到货日期 示例：2024-05-21
changeRate	number
小数位数:8,最大长度:28	否	是	换算率, 大于0, 计划到货数量和计划到货件数之间的换算率 示例：1
changeRateNum	number
小数位数:8,最大长度:28	否	否	换算率分子 示例：1
changeRateDen	number
小数位数:8,最大长度:28	否	否	换算率分母 示例：1
subcontractQuantityPU	number
小数位数:8,最大长度:28	否	是	计价数量 示例：1
subcontractToPrice	number
小数位数:8,最大长度:28	否	是	计价换算率, 大于0, 计划到货数量和计价数量之间的换算率 示例：1
subcontractToPriceNum	number
小数位数:8,最大长度:28	否	否	计价换算率分子 示例：1
subcontractToPriceDen	number
小数位数:8,最大长度:28	否	否	计价换算率分母 示例：1
warehouseName	string	否	否	仓库,可以提供仓库的id、code或名称 示例：1503384273436540930
batchNo	string	否	否	批次号 示例：批次01
produceDate	string	否	否	生产日期 示例：2024-05-01
expirationDate	string	否	否	有效期至 示例：2024-05-01
remark	string	否	否	备注 示例：test01
requireConsult	boolean	否	否	是否与委外商协同,委外订单需要与委外商协同=“是”时，此值可能为true或false,委外订单需要与委外商协同=“否”时，此值一定为false 示例：false
requireConfirm	boolean	否	否	需要委外商确认,委外到货计划的需要与委外商协同=“否”时，此值一定为false 示例：true
out_sys_rowno	string	否	否	外部来源行号 示例：10
out_sys_lineid	string	否	否	外部来源行ID 示例：00001
_status	string	否	是	操作标识：Insert为新增，Update为修改 示例：Insert

## 3. 请求示例

Url: /yonbip/mfg/arriveplan/save?access_token=访问令牌
Body: {
	"data": [
		{
			"resubmitCheckKey": "",
			"orderCode": "2001976246446063616",
			"id": "2172776384081952774",
			"orderProductId": "2001976246446063617",
			"orderByproductId": "2001976246446063617",
			"deliveryQuantity": 1,
			"deliveryAuxiliaryQuantity": 1,
			"deliveryDate": "2024-05-21",
			"changeRate": 1,
			"changeRateNum": 1,
			"changeRateDen": 1,
			"subcontractQuantityPU": 1,
			"subcontractToPrice": 1,
			"subcontractToPriceNum": 1,
			"subcontractToPriceDen": 1,
			"warehouseName": "1503384273436540930",
			"batchNo": "批次01",
			"produceDate": "2024-05-01",
			"expirationDate": "2024-05-01",
			"remark": "test01",
			"requireConsult": false,
			"requireConfirm": true,
			"out_sys_rowno": "10",
			"out_sys_lineid": "00001",
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
code	string	否	返回码，调用成功时返回200 示例：200
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
data	object	否	接口调用返回数据
count	number
小数位数:0,最大长度:10	否	记录总数 示例：1
sucessCount	number
小数位数:0,最大长度:10	否	成功数 示例：1
failCount	number
小数位数:0,最大长度:10	否	失败数 示例：0
messages	string	是	失败信息
infos	object	是	成功信息

## 5. 正确返回示例

{
	"code": "200",
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
				"orderCode": "WWDD-20240528-00008",
				"orderProductId": 2007270523799076900,
				"orderByproductId": 2008661766783369200,
				"freeCharacteristics": {},
				"deliveryQuantity": 1,
				"deliveryAuxiliaryQuantity": 1,
				"deliveryDate": "2024-05-24",
				"changeRate": 1,
				"changeRateNum": 1,
				"changeRateDen": 1,
				"subcontractQuantityPU": 1,
				"subcontractToPrice": 1,
				"subcontractToPriceNum": 1,
				"subcontractToPriceDen": 1,
				"remark": "999",
				"warehouseName": "lj开心汪汪汪",
				"warehouseId": 1557430870576464000,
				"warehouseCode": "000496",
				"orderId": 2007270523799076900,
				"orderProductLineNo": 10,
				"rcvOrgId": "1503384273436540930",
				"productionType": "2",
				"productName": "lj只预留",
				"priceUnitName": "吨",
				"lineNo": 40,
				"isExpiryDateManage": false,
				"isBatchManage": false,
				"mainUnitPrecision": 6,
				"id": 2008779560544370700,
				"priceChangeType": 0,
				"mainUnitId": 1471409676319981600,
				"priceUnitId": 1471409676319981600,
				"productId": 1728203795382403000,
				"subcontractUnitPrecision": 6,
				"batchNo": "批次号901",
				"subcontractVendorName": "lj天天开心萬事如意健康美丽",
				"subcontractUnitId": 1471409676319981600,
				"changeType": 0,
				"subcontractUnitName": "吨",
				"priceUnitPrecision": 6,
				"mainUnitName": "吨",
				"subcontractVendorId": 1659113405279633400,
				"rcvOrgName": "lj哈哈",
				"productCode": "120615",
				"creatorId": 1504291319004528600,
				"creator": "昵某-13662080373",
				"createTime": "2024-05-30 15:05:19",
				"createDate": "2024-05-30 15:05:19",
				"pubts": "2024-05-30 15:05:20",
				"out_sys_rowno": "10",
				"out_sys_lineid": "00001"
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
	1	2026-01-29	
更新
请求说明
新增
请求参数 (4)
更新
请求参数 freeCharacteristics
更新
请求参数 defineCharacteristics
新增
返回参数 (4)
新增换算率分子、分母字段

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

