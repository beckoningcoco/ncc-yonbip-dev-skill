---
title: "委外订单列表查询"
apiId: "21e0f5ca26724acf810ff6323980e234"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Subcontract Order"
domain: "MF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Subcontract Order]
platform_version: "BIP"
source_type: community-api-docs
---

# 委外订单列表查询

>  请求方式	POST | Subcontract Order (MF)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/mfg/subcontractorder/list
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	列表查询
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
pageIndex	int	否	是	页号 默认值:1 示例：1 默认值：1
pageSize	int	否	是	每页行数 默认值:10 示例：10 默认值：10
code	string	否	否	委外订单号 示例：WWDD202105010001
status	string	否	否	订单状态： 0-开立，1-已审核，2-已关闭，3-审核中，4-已锁定，5-已开工 示例：0
transTypeId	string	是	否	交易类型 示例：["1866605942578527"]
orgId	string	是	否	组织 示例：["1866605942198782"]
subcontractVendorId	string	是	否	委外商 示例：["1866605942197864"]
OrderProduct!materialId	long	是	否	制造物料id 示例：[1866605942197885]
OrderProduct!productId	long	是	否	物料id 示例：[1866605942115973]
OrderProductSubcontract!deliveryDate	string	否	否	交货日期（区间，格式2021-03-02|2021-03-02 23:59:59） 示例：2021-03-02|2021-03-02 23:59:59
vouchdate	string	否	否	单据日期（区间，格式2021-03-02|2021-03-02 23:59:59） 示例：2021-03-02|2021-03-02 23:59:59
isShowMaterial	boolean	否	否	是否展示材料:true-是,false-否 示例：false 默认值：false
simple	object	否	否	simple
open_pubts_begin	string	否	否	时间戳，开始时间 示例：2022-04-01 00:00:00
open_pubts_end	string	否	否	时间戳，结束时间 示例：2022-04-20 00:00:00
orderProduct.wbs	string	否	否	wbs 示例：1866605942198447
orderProduct.projectId	string	否	否	项目Id 示例：1866605942178545
orderProduct.activity	number
小数位数:0,最大长度:32	否	否	活动id 示例：1866605427458631
simpleVOs	object	是	否	扩展查询条件
field	string	否	否	属性名(条件)(1.pubts(时间戳)) 2.id(单据ID) 示例：pubts
op	string	否	否	比较符(条件eq:相等, neq：不等, lt：小于, gt：大于, elt：小于等于, egt：大于等于, between：区间, in：包含, nin：不包含, like：包含字符, leftlike：左侧字符包含, rightlike：右侧字符包含, is_null：为空, is_not_null：不为空, and：和, or：或 )
value1	string	否	否	查询条件值1。示例：2021-01-01 00:00:00 (field值为pubts，op值为egt或gt或el或lt)
value2	string	否	否	查询条件值2
logicOp	string	否	否	逻辑连接符(and：且；or：或) 注：logicOp有值时，conditions条件生效，logicOp同级的其他条件不生效；logicOp无值时，conditions条件不生效，logicOp同级设置的其他条件生效。 示例：or
conditions	object	是	否	下级查询条件

## 3. 请求示例

Url: /yonbip/mfg/subcontractorder/list?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"code": "WWDD202105010001",
	"status": "0",
	"transTypeId": [
		"1866605942578527"
	],
	"orgId": [
		"1866605942198782"
	],
	"subcontractVendorId": [
		"1866605942197864"
	],
	"OrderProduct!materialId": [
		1866605942197885
	],
	"OrderProduct!productId": [
		1866605942115973
	],
	"OrderProductSubcontract!deliveryDate": "2021-03-02|2021-03-02 23:59:59",
	"vouchdate": "2021-03-02|2021-03-02 23:59:59",
	"isShowMaterial": false,
	"simple": {
		"open_pubts_begin": "2022-04-01 00:00:00",
		"open_pubts_end": "2022-04-20 00:00:00",
		"orderProduct.wbs": "1866605942198447",
		"orderProduct.projectId": "1866605942178545",
		"orderProduct.activity": 1866605427458631
	},
	"simpleVOs": [
		{
			"field": "",
			"op": "",
			"value1": "",
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
code	long	否	返回码，成功时返回200 示例：200
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
data	object	否	接口返回信息
pageIndex	long	否	当前页 示例：1
pageSize	long	否	页大小 示例：20
recordCount	long	否	记录总数 示例：0
recordList	object	是	返回数据对象
sumRecordList	object	是	合计字段集合
pageCount	long	否	总页数 示例：0
beginPageIndex	long	否	开始页码 示例：1
endPageIndex	long	否	结束页码 示例：0
pubts	string	否	时间戳 示例：2021-03-24 15:11:10

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
				"id": 218492457191234,
				"transTypeId": "1248018423173517",
				"isWfControlled": false,
				"orgName": "L工厂1",
				"status": 0,
				"isHold": false,
				"code": "SCDD20210324000003",
				"verifystate": 0,
				"vouchdate": "2021-03-24 00:00:00",
				"creatorId": 1979891486839040,
				"creator": "18510959384",
				"orgId": "1866605942198528",
				"transTypeName": "标准生产",
				"transTypeCode": "PO-001",
				"subcontractVendorId": "1870534089855232",
				"expirationDate": "2025-10-05 00:00:00",
				"produceDate": "2025-10-05 00:00:00",
				"batchNo": "CSEPC236050021030",
				"subcontractVendorName": "供应商",
				"pubts": "2021-03-24 11:40:13",
				"createTime": "2021-03-24 11:40:12",
				"orderProduct_id": 2184924571914497,
				"OrderProduct_productId": 2061736079708416,
				"OrderProduct_materialId": 2061736111296768,
				"OrderProduct_materialName": "自行车",
				"OrderProduct_materialCode": "jq01000001",
				"orderProduct_orderSubcontractProduct_subcontractUnitId": 1869676091724032,
				"orderProduct_orderSubcontractProduct_priceUnitId": 1869676091724032,
				"mainUnitPrecision": 3,
				"priceUnitPrecision": 3,
				"subcontractUnitPrecision": 4,
				"OrderProduct_sourceType": "1",
				"OrderProduct_deliveryDate": "2021-03-24 00:00:00",
				"OrderProduct_subcontractQuantityMU": 120,
				"OrderProduct_subcontractQuantitySU": 120,
				"OrderProduct_subcontractQuantityPU": 120,
				"OrderProduct_changeRate": 1,
				"OrderProduct_isHold": false,
				"OrderProduct_mainUnitName": "件",
				"OrderProduct_subcontractUnitName": "件",
				"OrderProduct_priceUnitName": "件",
				"OrderProduct_bomId": 2173985857769728,
				"OrderProduct_version": "A1",
				"out_sys_id": "100000",
				"out_sys_code": "WBWWDD001",
				"out_sys_version": "V1.0.0",
				"out_sys_type": "Type001",
				"OrderProduct_out_sys_lineid": "10010",
				"OrderProduct_out_sys_rowno": "10",
				"orderMaterial": [
					{
						"isWholeSet": false,
						"id": 1696909495433,
						"lineNo": 10,
						"productCode": "788044",
						"productName": "成套领料-材料001",
						"productId": 1696909495433691137,
						"materialCode": "788044",
						"materialName": "成套领料-材料001",
						"materialId": 1696909495412195332,
						"mainUnit": 2652431423640064,
						"mainUnitName": "千克",
						"mainUnitPrecision": 1,
						"skuCode": "788044",
						"skuName": "成套领料-材料001",
						"skuId": 1696909495433691532,
						"stockUnitName": "千克",
						"stockUnitId": 2652431423640064,
						"stockUnitPrecision": 6,
						"changeRate": 1,
						"changeType": 0,
						"recipientQuantity": 1500,
						"auxiliaryRecipientQuantity": 1500,
						"bomUnitName": "千克",
						"bomUnitId": 2652431423640064,
						"bomUnitPrecision": 6,
						"bomUnitChangeRate": 1,
						"bomAuxiliaryRecipientQty": 1500,
						"bomId": 1699890469018796032,
						"bomMaterialId": 1699890469018796033,
						"numeratorQuantity": 1,
						"denominatorQuantity": 1,
						"scrap": 0,
						"mustLossQuantity": 0,
						"bomUnitUseQuantity": 1,
						"mainNumeratorQuantity": 1,
						"mainDenominatorQuantity": 1,
						"unitUseQuantity": 1,
						"fixedQuantity": 0,
						"orderProductId": 1700060163165650954,
						"orgId": "1478105315702997001",
						"orgName": "测试qss质检组织",
						"warehouseId": 1504817297772511237,
						"warehouseName": "委外仓qss",
						"requirementDate": "2023-04-28 00:00:00",
						"verificationBy": "0",
						"subcontractSupplyType": 0,
						"supplyType": "0",
						"supDirectShip": true,
						"doubleReplenish": 0,
						"replenishAdjustQuantity": 1500,
						"auxiliaryReplenishAdjustQuantity": 1500,
						"excessAppliedQty": 0,
						"auxiliaryExcessAppliedQty": 0
					}
				],
				"orderSubcontract_tradePath": 1852042374122307592,
				"orderSubcontract_tradePathName": "01路径",
				"orderSubcontractProduct_tradePath": 1852042374122307592,
				"orderSubcontractProduct_tradePathName": "1852042374122307592",
				"orderSubcontractProduct_cooperateDocNo": "UO-20231102000019",
				"orderSubcontractProduct_cooperateDocId": 1852955192105369602,
				"orderSubcontractProduct_cooperateLineNo": "10",
				"orderSubcontractProduct_cooperateLineId": 1852955192105369603,
				"orderSubcontract_tcOrgId": "1631969031461273603",
				"orderSubcontractProduct_tcOrgIdSon_name": "收票组织",
				"orderSubcontract_tcOrgAccount": 0,
				"wbs": "",
				"wbsCode": "",
				"wbsName": "",
				"activity": 0,
				"activityCode": "",
				"activityTaskName": "",
				"OrderProduct_projectId": "",
				"OrderProduct_projectCode": "",
				"OrderProduct_projectName": "",
				"isBeginning": 0,
				"orderSubcontractProductExt_payClose": false,
				"orderSubcontractProductExt_payClosePerson": "Tom",
				"orderSubcontractProductExt_payClosePersonId": 2325273777082880,
				"orderSubcontractProductExt_payCloseDateTime": "2025-08-31 16:37:02"
			}
		],
		"sumRecordList": [
			{
				"OrderProduct_subcontractQuantityMU": 186.8874,
				"OrderProduct_subcontractQuantitySU": 120,
				"OrderProduct_subcontractQuantityPU": 120,
				"mainUnitPrecision": 1
			}
		],
		"pageCount": 0,
		"beginPageIndex": 1,
		"endPageIndex": 0,
		"pubts": "2021-03-24 15:11:10"
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
	1	2025-10-30	
新增
返回参数 batchNo
新增
返回参数 expirationDate
新增
返回参数 produceDate
	2	2025-09-12	
更新
请求说明
新增
返回参数 (13)
更新
返回参数 (40)
	3	2025-06-24	
新增
返回参数 isBeginning

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

