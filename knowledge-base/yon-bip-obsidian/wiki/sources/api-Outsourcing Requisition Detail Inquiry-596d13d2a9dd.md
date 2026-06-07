---
title: "委外申请单详情查询"
apiId: "596d13d2a9dd4310a0e4b6928bf1f98a"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Subcontracting Requisition"
domain: "MF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Subcontracting Requisition]
platform_version: "BIP"
source_type: community-api-docs
---

# 委外申请单详情查询

>  请求方式	GET | Subcontracting Requisition (MF)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/mfg/subcontractrequisition/detail
请求方式	GET
ContentType	application/json
应用场景	开放API/集成API
API类别	详情查询
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	long	query	否	委外申请单ID, 委外申请单ID和委外申请单单号不能同时为空，ID和单号同时存在，以ID为准    示例: 2482397168325376
code	string	query	否	委外申请单号    示例: WWSQ202110200001

## 3. 请求示例

Url: /yonbip/mfg/subcontractrequisition/detail?access_token=访问令牌&id=2482397168325376&code=WWSQ202110200001

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
data	object	否	接口返回数据
id	long	否	单据ID 示例：2594376494961408
orgId	string	否	需求组织ID 示例：2325505713575680
orgName	string	否	需求组织 示例：资产管理公司
code	string	否	委外申请单号 示例：WWSQ202201070003
transTypeId	string	否	交易类型 示例：2325273783079171
transTypeCode	string	否	交易类型编码 示例：WWSQ01
transTypeName	string	否	交易类型名称 示例：标准委外
transTypeExtendAttrsJson	string	否	交易类型扩展属性 示例：{"specialType":"none","businessType":"wholeOutsourcing"}
transTypeKeyField	string	否	交易类型主键字段 示例：transTypeId
vouchdate	string	否	单据日期 示例：2022-01-07 00:00:00
departmentId	string	否	需求部门ID 示例：2325509100851456
departmentName	string	否	需求部门 示例：综合部
operatorId	string	否	需求人id 示例：2391833684873472
operatorName	string	否	需求人名称 示例：张三
status	short	否	申请单状态 0-开立，1-已审核，2-已关闭，3-审核中 示例：1
sourceType	string	否	来源类别 0-手工录入，1-计划订单 示例：1
subcontractRequisitionProduct	object	是	产品行数据集
remark	string	否	备注 示例：10
externalSourceType	string	否	外部系统类型 示例：L3
out_sys_id	string	否	外部来源线索 示例：10000
out_sys_type	string	否	外部来源类型 示例：Type001
out_sys_code	string	否	外部来源编码 示例：WBWWDD01
out_sys_version	string	否	外部来源版本 示例：V1.0.0
creatorId	long	否	创建人 示例：2327088199733504
creator	string	否	创建人 示例：13662080373
createDate	string	否	创建日期 示例：2022-01-07 00:00:00
createTime	string	否	创建时间 示例：2022-01-07 17:36:14
modifier	string	否	修改人 示例：13662080373
modifyDate	string	否	修改日期 示例：2022-01-10 00:00:00
modifyTime	string	否	修改时间 示例：2022-01-10 11:46:40
auditor	string	否	审核人 示例：13662080373
auditDate	string	否	审核日期 示例：2022-01-10 00:00:00
auditTime	string	否	审核时间 示例：2022-01-10 11:46:59
pubts	string	否	时间戳 示例：2022-01-10 11:46:59
tenant_id	long	否	租户ID 示例：2325271698624768
masterOrgKeyField	string	否	主组织字段 示例：orgId
isWfControlled	boolean	否	是否审批流控制：false-否，true-是 示例：false
verifystate	short	否	审批状态：0-开立，1-已提交，2-已审批，-1-驳回 示例：2
orderUserdefItem	object	否	表头固定自定义项信息（1-60）
headExtItem	object	否	表头自由自定义项（1-60）

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"id": 2594376494961408,
		"orgId": "2325505713575680",
		"orgName": "资产管理公司",
		"code": "WWSQ202201070003",
		"transTypeId": "2325273783079171",
		"transTypeCode": "WWSQ01",
		"transTypeName": "标准委外",
		"transTypeExtendAttrsJson": "{\"specialType\":\"none\",\"businessType\":\"wholeOutsourcing\"}",
		"transTypeKeyField": "transTypeId",
		"vouchdate": "2022-01-07 00:00:00",
		"departmentId": "2325509100851456",
		"departmentName": "综合部",
		"operatorId": "2391833684873472",
		"operatorName": "张三",
		"status": 1,
		"sourceType": "1",
		"subcontractRequisitionProduct": [
			{
				"subcontractRequisitionId": 2594376494961408,
				"id": 2594376494961409,
				"productId": 2325533913174272,
				"product_Code": "000001",
				"product_Name": "P10",
				"materialId": 2325533924905472,
				"productCode": "000001",
				"productName": "P10",
				"mainUnitTruncationType": 4,
				"demandUnitTruncationType": 4,
				"bomUnitId": 2325529461018880,
				"changeRate": 1,
				"changeType": 0,
				"scrap": 0,
				"bomUnitName": "袋",
				"bomUnitChangeRate": 1,
				"bomUnitPrecision": 1,
				"bomUnitTruncationType": 4,
				"bomQuantity": 1,
				"bomOrgId": "2325505713575680",
				"bomOrgName": "资产管理公司",
				"bomVerId": 2326355321934336,
				"bomVersionCode": "1.00",
				"subcontractOrgId": "2325505713575680",
				"subcontractOrgName": "资产管理公司",
				"sourceType": "1",
				"source": "requirementsplanning.mr_plan_workbench_pullandpush",
				"sourceid": 2330854167007488,
				"upcode": "GEN000348",
				"sourceautoid": 2573280393941760,
				"makeRuleCode": "planOrderToSubcontractRequisition",
				"skuId": 2325533922283776,
				"skuCode": "000001",
				"skuName": "P10",
				"demandQuantityMU": "",
				"mainUnitId": 2325529461018880,
				"mainUnitName": "袋",
				"mainUnitPrecision": 1,
				"demandQuantityDU": 1,
				"demandUnitId": 2325529461018880,
				"demandUnitName": "袋",
				"demandUnitPrecision": 1,
				"requisitionDate": "2021-12-23 00:00:00",
				"rcvOrgId": "2325505713575680",
				"rcvOrgName": "资产管理公司",
				"warehouseId": "2425857187188992",
				"warehouseName": "刘的普通仓库",
				"remark": "20",
				"out_sys_lineid": "10010",
				"out_sys_rowno": "10",
				"orderProductUserdefItem": {
					"id": 2681718179811585,
					"define1": "文本自定义",
					"define2": "自定义"
				},
				"productExtItem": {
					"id": 2681718179811585,
					"define1": "自由项1",
					"define2": "自由项2"
				},
				"subcontractRequisitionMaterial": [
					{
						"id": 2594376494961410,
						"subcontractRequisitionProductId": 2594376494961409,
						"productId": 2325569972998400,
						"productCode": "000002",
						"productName": "CaiL-1",
						"materialId": 2325569983681024,
						"materialCode": "000002",
						"materialName": "CaiL-1",
						"skuId": 2325569980780800,
						"skuCode": "000002",
						"bomId": 2326355321934336,
						"bomMaterialId": 2326355321950720,
						"numeratorQuantity": 1.667,
						"denominatorQuantity": 1,
						"bomUnitUseQuantity": 1.68367,
						"mainNumeratorQuantity": 1.667,
						"mainDenominatorQuantity": 1,
						"unitUseQuantity": 1.68367,
						"recipientQuantity": 1.6837,
						"mainUnit": 2325530395463936,
						"mainUnitName": "千克",
						"mainUnitPrecision": 4,
						"auxiliaryRecipientQuantity": 1.6837,
						"bomAuxiliaryRecipientQty": 1.6837,
						"bomUnitName": "千克",
						"bomUnitChangeRate": 1,
						"stockUnitId": 2325530395463936,
						"stockUnitName": "千克",
						"stockUnitPrecision": 4,
						"changeRate": 1,
						"changeType": 0,
						"bomUnitId": 2325530395463936,
						"bomUnitPrecision": 4,
						"bomUnitTruncationType": 4,
						"fixedQuantity": 0,
						"scrap": 1,
						"truncUp": 0,
						"substituteFlag": "0",
						"supplyType": 0,
						"orgId": "2325505713575680",
						"orgName": "资产管理公司",
						"subcontractSupplyType": 0,
						"bomUnitUseQuantityNoloss": 1.68367,
						"bomUnitUseQuantityInloss": 1.667,
						"pubts": "2022-01-07 17:36:15",
						"orderMaterialUserdefItem": {
							"id": 2681718179811586,
							"define1": "文本自定义",
							"define2": "文件"
						},
						"materialExtItem": {
							"id": 2681718179811587,
							"define1": "文本自定义",
							"define2": "文件"
						}
					}
				]
			}
		],
		"remark": "10",
		"externalSourceType": "L3",
		"out_sys_id": "10000",
		"out_sys_type": "Type001",
		"out_sys_code": "WBWWDD01",
		"out_sys_version": "V1.0.0",
		"creatorId": 2327088199733504,
		"creator": "13662080373",
		"createDate": "2022-01-07 00:00:00",
		"createTime": "2022-01-07 17:36:14",
		"modifier": "13662080373",
		"modifyDate": "2022-01-10 00:00:00",
		"modifyTime": "2022-01-10 11:46:40",
		"auditor": "13662080373",
		"auditDate": "2022-01-10 00:00:00",
		"auditTime": "2022-01-10 11:46:59",
		"pubts": "2022-01-10 11:46:59",
		"tenant_id": 2325271698624768,
		"masterOrgKeyField": "orgId",
		"isWfControlled": false,
		"verifystate": 2,
		"orderUserdefItem": {
			"id": "2681718179811584",
			"define1": "文本自定义",
			"define2": "固定文本自定义"
		},
		"headExtItem": {
			"id": "2681718179811589",
			"define1": "自由项1",
			"define2": "自由项2"
		}
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
	1	2025-06-24	
更新
请求参数 data
更新
请求参数 detailId
更新
返回参数 (37)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

