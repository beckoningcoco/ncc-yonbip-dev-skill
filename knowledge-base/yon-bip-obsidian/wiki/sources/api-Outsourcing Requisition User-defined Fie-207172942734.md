---
title: "委外申请单保存"
apiId: "2071729427344523268"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Subcontracting Requisition"
domain: "MF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Subcontracting Requisition]
platform_version: "BIP"
source_type: community-api-docs
---

# 委外申请单保存

>  请求方式	POST | Subcontracting Requisition (MF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/mfg/subcontractrequisition/save
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
data	object	否	是	单据数据
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
code	string	否	否	单据编号，设置手工编号时必输，自动编号时输入无效 示例：WWSQ202201250001
vouchdate	string	否	是	单据日期，格式“2022-01-01” 示例：2022-01-25
orgId	string	否	否	需求组织id 示例：1866605942198527
orgCode	string	否	否	需求组织code，可以提供组织的id或code, 多组织下不能为空 示例：0701
transTypeId	string	否	是	交易类型id，可以提供交易类型的id或code 示例：WWSQ01
departmentId	string	否	否	需求部门id，可以提供部门的id或code 示例：2659083286122752
operatorId	string	否	否	需求人id，可以提供业务员的id或code 示例：2326642944332032
orderUserdefItem	object	否	否	表头固定自定义项（1-60）
headExtItem	object	否	否	表头自由自定义项（1-60）
out_sys_id	string	否	否	外部来源线索 示例：1248018423175356
out_sys_code	string	否	否	外部来源编码 示例：WWDD20230712001
out_sys_version	string	否	否	外部来源版本 示例：1.0
out_sys_type	string	否	否	外部来源类型 示例：A
externalSourceType	string	否	否	外部系统类型 示例：L3
processOsmSrcType	string	否	否	工序委外来源类别, 枚举值：0-生产订单工序，1-工序作业计划，2-工序流转卡。全程委外不传
subcontractRequisitionProduct	object	是	是	委外申请单产品行数据集合

## 3. 请求示例

Url: /yonbip/mfg/subcontractrequisition/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"code": "WWSQ202201250001",
		"vouchdate": "2022-01-25",
		"orgId": "1866605942198527",
		"orgCode": "0701",
		"transTypeId": "WWSQ01",
		"departmentId": "2659083286122752",
		"operatorId": "2326642944332032",
		"orderUserdefItem": {
			"define1": "自定义项1",
			"define2": "自定义项2"
		},
		"headExtItem": {
			"define1": "自由项1",
			"define2": "自由项2"
		},
		"out_sys_id": "1248018423175356",
		"out_sys_code": "WWDD20230712001",
		"out_sys_version": "1.0",
		"out_sys_type": "A",
		"externalSourceType": "L3",
		"processOsmSrcType": "",
		"subcontractRequisitionProduct": [
			{
				"materialId": 1869775823737088,
				"materialCode": "000012",
				"productId": 0,
				"productCode": "",
				"skuId": "2302614934802689",
				"bomVerId": "",
				"requisitionDate": "2021-05-08",
				"subcontractOrgId": "2659082395767296",
				"rcvOrgId": "2325505713575680",
				"warehouseId": "",
				"demandQuantityMU": 10,
				"demandQuantityDU": 10,
				"mainUnitId": "2297527422652672",
				"demandUnitId": "2297527422652672",
				"changeRate": 1,
				"changeRateNum": 1,
				"changeRateDen": 1,
				"suggestVendorId": "",
				"remark": "备注",
				"out_sys_rowno": "10",
				"out_sys_lineid": "1248018423173518",
				"sourcePoOrderId": "1248018423173519",
				"sourcePoOrderProductId": "1248018423173520",
				"sourcePoOrderProcessId": "1248018423173521",
				"orderProductUserdefItem": {
					"define1": "自定义项1",
					"define2": "自定义项2"
				},
				"sourceSfcFlowId": "1248018423173523",
				"sourceSfcFlowCardId": "1248018423173524",
				"sourceSfcProcPlanId": "1248018423173522",
				"productExtItem": {
					"define1": "自由项1",
					"define2": "自由项2"
				},
				"subcontractRequisitionMaterial": [
					{
						"productId": 0,
						"productCode": "",
						"orgId": 0,
						"orgCode": "",
						"denominatorQuantity": 0,
						"numeratorQuantity": 0,
						"stockUnitId": 0,
						"scrap": 0,
						"supplyType": "",
						"fixedQuantity": 0,
						"warehouseId": 0,
						"recipientQuantity": 0,
						"auxiliaryRecipientQuantity": 0,
						"changeRate": 0,
						"changeRateNum": 1,
						"changeRateDen": 1,
						"transferOutWarehouseId": 0,
						"tranferOutOrgId": 0,
						"isWholeSet": true,
						"supDirectShip": true,
						"subcontractSupplyType": 0,
						"remark": ""
					}
				],
				"subcontractRequisitionProcess": [
					{
						"sn": 10,
						"operationId": 1248018423173524,
						"operationCode": "code1",
						"qty": 100,
						"prodQty": 100,
						"outUnitName": "辆",
						"planStartDate": "2025-09-09 00:00:00\t",
						"planEndDate": "2025-10-09 23:59:59",
						"prepareTime": 1,
						"processTime": 1,
						"timeUnit": 1,
						"inspection": true,
						"outChangeRate": 1,
						"outChangeRateNum": 1,
						"outChangeRateDen": 1,
						"mainUnitId": 1248018423173524
					}
				]
			}
		]
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
id	long	否	委外申请单id 示例：2664860774224640
orgId	string	否	需求组织id 示例：2432799927097088
orgCode	string	否	需求组织编码 示例：Amy测试1
orgName	string	否	需求组织名称 示例：Amy测试1
code	string	否	单据编号 示例：WWSQ202202260001
vouchdate	string	否	单据日期 示例：2022-05-19 00:00:00
transTypeId	string	否	交易类型id 示例：2384734995321145
transTypeCode	string	否	交易类型编码 示例：WWSQ01
transTypeName	string	否	交易类型名称 示例：标准委外
transTypeExtendAttrsJson	string	否	交易类型扩展属性 示例：{\"specialType\":\"none\",\"businessType\":\"wholeOutsourcing\"}
departmentId	string	否	需求部门id 示例：2432802404831488
departmentCode	string	否	需求部门编码 示例：质检部门
departmentName	string	否	需求部门名称 示例：质检部门
operatorId	string	否	需求人员id
isRework	boolean	否	是否返工，表示委外申请单是否为返工委外。 示例：false
status	short	否	委外申请单状态： 0-开立，1-已审核，2-已关闭，3-审核中 示例：0
sourceType	string	否	来源类别： 0-手工录入，1-计划订单 示例：0
creator	string	否	创建人 示例：YonSuite默认用户
creatorId	long	否	创建人Id 示例：1861077977714944
createTime	string	否	创建时间 示例：2022-05-19 17:42:25
createDate	string	否	创建日期 示例：2022-05-19 00:00:00
isWfControlled	boolean	否	是否审批流控制，true：是；false：否 示例：false
pubts	string	否	时间戳 示例：2022-05-19 17:42:25
tenant	long	否	租户id 示例：1861077976273152
yTenantId	string	否	友互通租户id 示例：tl27pqwt
resubmitCheckKey	string	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
out_sys_id	string	否	外部来源线索 示例：1248018423175356
out_sys_code	string	否	外部来源编码 示例：WWDD20230712001
out_sys_version	string	否	外部来源版本 示例：1.0
out_sys_type	string	否	外部来源类型 示例：A
externalSourceType	string	否	外部系统类型 示例：L3
orderUserdefItem	object	否	表头固定自定义项（1-60）
headExtItem	object	否	表头自由自定义项（1-60）
subcontractRequisitionProduct	object	是	申请单产品行数据

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"id": 2664860774224640,
		"orgId": "2432799927097088",
		"orgCode": "Amy测试1",
		"orgName": "Amy测试1",
		"code": "WWSQ202202260001",
		"vouchdate": "2022-05-19 00:00:00",
		"transTypeId": "2384734995321145",
		"transTypeCode": "WWSQ01",
		"transTypeName": "标准委外",
		"transTypeExtendAttrsJson": "{\\\"specialType\\\":\\\"none\\\",\\\"businessType\\\":\\\"wholeOutsourcing\\\"}",
		"departmentId": "2432802404831488",
		"departmentCode": "质检部门",
		"departmentName": "质检部门",
		"operatorId": "",
		"isRework": false,
		"status": 0,
		"sourceType": "0",
		"creator": "YonSuite默认用户",
		"creatorId": 1861077977714944,
		"createTime": "2022-05-19 17:42:25",
		"createDate": "2022-05-19 00:00:00",
		"isWfControlled": false,
		"pubts": "2022-05-19 17:42:25",
		"tenant": 1861077976273152,
		"yTenantId": "tl27pqwt",
		"resubmitCheckKey": "OPENAPI_4fa502c09d984591aab1226ed1a553e3_0000KPRO7OGPDLMV4F0000_156469846511122",
		"out_sys_id": "1248018423175356",
		"out_sys_code": "WWDD20230712001",
		"out_sys_version": "1.0",
		"out_sys_type": "A",
		"externalSourceType": "L3",
		"orderUserdefItem": {
			"define1": "自定义项1",
			"define2": "自定义项2"
		},
		"headExtItem": {
			"define1": "自由项1",
			"define2": "自由项2"
		},
		"subcontractRequisitionProduct": [
			{
				"id": 2251405962793216,
				"requisitionDate": "2021-08-27 00:00:00",
				"productId": 1869775818379520,
				"productCode": "781818",
				"productName": "781818",
				"materialId": 1869775823737088,
				"skuId": 1869775821852928,
				"rcvOrgId": 1866605942198528,
				"rcvOrgCode": "Amy测试1",
				"rcvOrgName": "Amy测试1",
				"subcontractOrgId": 1866605942198528,
				"subcontractOrgCode": "Amy测试1",
				"subcontractOrgName": "Amy测试1",
				"bomOrgId": 1866605942198528,
				"bomVerId": 2227281346762496,
				"mainUnitId": 1869676091724032,
				"mainUnitName": "千克",
				"mainUnitPrecision": 4,
				"demandUnitId": 1869676091724032,
				"demandUnitName": "千克",
				"demandUnitPrecision": 4,
				"changeType": 0,
				"changeRate": 1,
				"demandQuantityMU": 10,
				"demandQuantityDU": 10,
				"bomUnitId": 1869676091724032,
				"bomUnitName": "千克",
				"bomUnitChangeRate": 1,
				"bomQuantity": 10,
				"headOrgId": 1866605942198528,
				"headOrgName": "Amy测试1",
				"stockOrgId": 1866605942198528,
				"stockOrgName": "Amy测试1",
				"warehouseId": 0,
				"subcontractRequisitionId": 2251405962776832,
				"scrap": 0,
				"pubts": "2022-05-19 17:42:25",
				"yTenantId": "tl27pqwt",
				"out_sys_rowno": "10",
				"out_sys_lineid": "1248018423173518",
				"orderProductUserdefItem": {
					"define1": "自定义项1",
					"define2": "自定义项2"
				},
				"productExtItem": {
					"define1": "自由项1",
					"define2": "自由项2"
				},
				"subcontractRequisitionMaterial": [
					{
						"id": 2251405962793217,
						"orderProductId": 2251405962793216,
						"orgId": "1866605942198528",
						"productId": 1869781477576960,
						"productCode": "LCL3",
						"productName": "L材料3",
						"materialId": 1869781485211904,
						"materialCode": "LCL3",
						"materialName": "L材料3",
						"skuId": 1869781481902336,
						"skuCode": "LCL3",
						"skuName": "L材料3",
						"mainUnitId": "1869676091724032",
						"mainUnitName": "件",
						"mainUnitPrecision": 3,
						"mainUnitTruncationType": 4,
						"numeratorQuantity": 1,
						"denominatorQuantity": 1,
						"unitUseQuantity": 0.51,
						"requirementDate": "2022-05-20 00:00:00",
						"bomId": 2227281346762496,
						"supDirectShip": false,
						"scrap": 0,
						"bomMaterialId": 2227281346762497,
						"subcontractSupplyType": "0",
						"supplyType": "0",
						"truncUp": 0,
						"mustLossQuantity": 0,
						"usageType": 1,
						"fixedQuantity": 0,
						"alternateType": 0,
						"changeRate": 1,
						"changeType": 0,
						"stockUnitId": 1869676091724032,
						"stockUnitName": "件",
						"stockUnitPrecision": 3,
						"stockUnitTruncationType": 4,
						"recipientQuantity": 0.51,
						"auxiliaryRecipientQuantity": 0.51,
						"pubts": "2022-05-19 17:42:25",
						"changeRateNum": 1,
						"changeRateDen": 1
					}
				],
				"subcontractRequisitionProcess": [
					{
						"sn": 10,
						"operationId": 1248018423173518,
						"operationCode": "code1",
						"qty": 100,
						"prodQty": 100,
						"outUnitName": "辆",
						"planStartDate": "2025-09-09 00:00:00",
						"planEndDate": "2025-10-09 00:00:00",
						"prepareTime": 1,
						"processTime": 1,
						"timeUnit": 1,
						"inspection": true,
						"outChangeRate": 1,
						"mainUnitId": 1248018423173518,
						"outChangeRateNum": 1,
						"outChangeRateDen": 1
					}
				],
				"changeRateNum": 1,
				"changeRateDen": 1
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
	1	2026-03-18	
新增
请求参数 (6)
更新
请求参数 (38)
新增
返回参数 (6)
更新
返回参数 (12)
委外部门调整为非必输
	2	2025-10-10	
新增
请求参数 (16)
更新
请求参数 sourceSfcProcPlanId
新增
返回参数 (16)
	3	2025-07-14	
更新
请求参数 processOsmSrcType
修改工序委外来源类别参数描述

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

