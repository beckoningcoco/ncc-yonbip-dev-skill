---
title: "原始记录更新"
apiId: "2087321223757824002"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Origin Record"
domain: "QMS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Origin Record]
platform_version: "BIP"
source_type: community-api-docs
---

# 原始记录更新

>  请求方式	POST | Origin Record (QMS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/QMS_QIT/originalrecord/update
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
data	object	否	是	业务数据
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
id	string	否	否	原始记录id，id和编号任一不为空，id和编号都存在时以id为准 示例：1539608448409796618
code	string	否	否	原始记录单据编号，id和编号任一不为空，id和编号都存在时以id为准 示例：JL202301010001
OriginalRecordBodyList	object	是	否	检验信息
OriginalRecordPointList	object	是	否	测点记录

## 3. 请求示例

Url: /yonbip/QMS_QIT/originalrecord/update?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": "1539608448409796618",
		"code": "JL202301010001",
		"OriginalRecordBodyList": [
			{
				"sampleId": "1500425710867054598",
				"sampleCode": "YP202408050001",
				"inspectItemId": "1500425710867054598",
				"inspectItemCode": "C75840hm1",
				"qualifiedNumber": 1,
				"unqualifiedNumber": 1,
				"inspectValue": "2"
			}
		],
		"OriginalRecordPointList": [
			{
				"sampleId": "1500425710867054598",
				"sampleCode": "YP202408050001",
				"inspectItemId": "1500425710867054598",
				"inspectItemCode": "C75840hm1",
				"meaPointNum": 1,
				"inspectValue": "2"
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
code	string	否	返回编码 示例：200
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
message	string	否	返回信息 示例：操作成功
data	object	否	返回数据
qms_qit_incominspectorder_sourcelistList	object	是	源单信息
id	string	否	原始记录id 示例：1503239447124639752
orgId	string	否	质检组织id 示例：2085244830403788801
org_name	string	否	质检组织 示例：星之国
code	string	否	单据编号 示例：JL202408050001
transType	string	否	交易类型id 示例：1503239447124639752
transType_name	string	否	交易类型 示例：原始记录
verifystate	number
小数位数:0,最大长度:2	否	单据状态：10-开立、11-待验、0-检验完成、1-审核中、2-已审批、4-检验完成。 示例：11
checkType	string	否	检验类型：001-来料检验、002-产品检验、003-在库检验、004-发货检验、005-退货检验、006-其他检验、007-工序检验、008-委外检验、009-工序委外检验。 示例：001
productId	string	否	物料id 示例：1503239447124639752
product_code	string	否	物料编码 示例：YXL001
product_name	string	否	物料名称 示例：汽车001
inspectNum	number
小数位数:8,最大长度:28	否	检验数量 示例：10.00000000
unitId	string	否	计量单位id 示例：1500425710867054598
unit_name	string	否	计量单位 示例：千克
unit_precision	number
小数位数:0,最大长度:1	否	计量单位精度 示例：2
batchNo	string	否	批次号 示例：PC001
supplierId	string	否	供应商id 示例：1503239447124639752
supplier_name	string	否	供应商 示例：星之国
processId	string	否	工序ID 示例：2662320442642688
process_name	string	否	工序 示例：委外工序
operationSequence	string	否	工序顺序号 示例：20
workCenterId	string	否	工作中心id 示例：1503239447124639752
workCenter_name	string	否	工作中心 示例：工作中心
customId	string	否	客户id 示例：14546564564
custom_name	string	否	客户 示例：客户1
checkOrg	string	否	请检组织id 示例：1503239447124639752
checkOrg_name	string	否	请检组织 示例：星之国
checkNum	number
小数位数:8,最大长度:28	否	请检数量 示例：10.00000000
sampleId	string	否	样品id 示例：1503239447124639752
sample_code	string	否	样品编号 示例：YP202408050001
sample_name	string	否	样品名称 示例：样品001
inspectionPlanId	string	否	检验方案id 示例：1768921287939850249
inspectionPlan_code	string	否	检验方案编码 示例：JIANYAN001
inspectionPlan_name	string	否	检验方案名称 示例：发动机检验方案
inspectionPlan_version	string	否	检验方案版本 示例：1.0
checkPlanDetailId	string	否	检验方案详情id 示例：1768921287939850249
dynamicInspectionPlanId	string	否	动态检验方案id 示例：1768921287939850249
dynamicInspectionPlan_code	string	否	动态检验方案编码 示例：JIANYAN001
dynamicInspectionPlan_name	string	否	动态检验方案名称 示例：发动机检验方案
dynamicInspectionPlan_version	string	否	动态检验方案版本 示例：1.0
inspectStep	string	否	检验步骤id 示例：1768921287939850249
inspectStep_name	string	否	检验步骤 示例：清洗
currentStage	string	否	当前检验阶段：1-正常、2-加严、3-放宽。 示例：1
inspectionStepConfig	string	否	检验步骤配置id 示例：1768921287939850249
inspectionStepConfigCode	string	否	检验步骤配置编码 示例：config01
standardAcqMethod	string	否	标准获取方式：by_dynamic_inspect_plan-按步骤动态检验方案、by_step_inspect_plan-按步骤检验方案。 示例：by_step_inspect_plan
inspectStepOrder	number
小数位数:0,最大长度:6	否	检验步骤顺序 示例：1
sourceBillId	string	否	请检来源单据ID 示例：1768921287939850249
sourceCode	string	否	请检来源单据号 示例：WGBG2024080500010
sourceRowId	string	否	请检来源单据行ID 示例：1768921287939850249
sourceRowNo	string	否	请检来源单据行号 示例：10
checkApplyId	string	否	检验申请ID 示例：1768921287939850249
checkApplyCode	string	否	检验申请单号 示例：CPJY202408080002
vsourceId	string	否	来源单据ID 示例：1768921287939850249
inspecterId	string	否	检验员id 示例：1768921287939850249
inspecter_name	string	否	检验员 示例：小明
inspectDept	string	否	检验部门id 示例：1768921287939850249
inspectDept_name	string	否	检验部门 示例：生产部门
inspectDate	date
格式:yyyy-MM-dd HH:mm:ss	否	检验日期 示例：2023-11-02 00:00:00
judgmentResult	string	否	判定结果：1-合格、2-不合格。 示例：1
isReinspectRecord	number
小数位数:0,最大长度:1	否	是否复验记录：1-是、0-否 示例：1
isNeedReinspect	number
小数位数:0,最大长度:1	否	是否需复验：1-是、0-否 示例：1
reinspectReason	string	否	复验原因 示例：再次检验
isNeedResample	number
小数位数:0,最大长度:1	否	是否需重新取样：1-是、0-否 示例：1
resampleMoment	string	否	重新取样时机：0-按检验申请统一取样。 示例：0
isWfControlled	number
小数位数:0,最大长度:1	否	是否审批流控制：1-是、0-否。 示例：0
returncount	number
小数位数:0,最大长度:6	否	退回次数 示例：0
pubts	date
格式:yyyy-MM-dd HH:mm:ss	否	时间戳 示例：2023-12-25 10:44:22
sourceOriRecordId	string	否	来源原始记录id 示例：1768921287939850249
tenant	string	否	租户ID 示例：0000L5KZEUUE3G0F1O0000
creatorId	string	否	创建人id 示例：1503246490875723783
creator	string	否	创建人 示例：张三
createTime	date
格式:yyyy-MM-dd HH:mm:ss	否	创建时间 示例：2023-11-02 13:50:48
modifierId	string	否	修改人id 示例：1768148966910722049
modifier	string	否	修改人 示例：李四
modifyTime	date
格式:yyyy-MM-dd HH:mm:ss	否	修改时间 示例：2023-12-25 10:44:22
auditorId	string	否	审核人id 示例：1768148966910722049
auditor	string	否	审核人 示例：李四
auditTime	date
格式:yyyy-MM-dd HH:mm:ss	否	审核时间 示例：2023-12-25 10:44:22
OriginalRecordBodyList	object	是	检验信息
OriginalRecordEquipmentList	object	是	检验仪器设备
OriginalRecordMethodList	object	是	检测方法

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"id": "1503239447124639752",
		"orgId": "2085244830403788801",
		"org_name": "星之国",
		"code": "JL202408050001",
		"transType": "1503239447124639752",
		"transType_name": "原始记录",
		"verifystate": 11,
		"checkType": "001",
		"productId": "1503239447124639752",
		"product_code": "YXL001",
		"product_name": "汽车001",
		"inspectNum": 10,
		"unitId": "1500425710867054598",
		"unit_name": "千克",
		"unit_precision": 2,
		"batchNo": "PC001",
		"supplierId": "1503239447124639752",
		"supplier_name": "星之国",
		"processId": "2662320442642688",
		"process_name": "委外工序",
		"operationSequence": "20",
		"workCenterId": "1503239447124639752",
		"workCenter_name": "工作中心",
		"customId": "14546564564",
		"custom_name": "客户1",
		"checkOrg": "1503239447124639752",
		"checkOrg_name": "星之国",
		"checkNum": 10,
		"sampleId": "1503239447124639752",
		"sample_code": "YP202408050001",
		"sample_name": "样品001",
		"inspectionPlanId": "1768921287939850249",
		"inspectionPlan_code": "JIANYAN001",
		"inspectionPlan_name": "发动机检验方案",
		"inspectionPlan_version": "1.0",
		"checkPlanDetailId": "1768921287939850249",
		"dynamicInspectionPlanId": "1768921287939850249",
		"dynamicInspectionPlan_code": "JIANYAN001",
		"dynamicInspectionPlan_name": "发动机检验方案",
		"dynamicInspectionPlan_version": "1.0",
		"inspectStep": "1768921287939850249",
		"inspectStep_name": "清洗",
		"currentStage": "1",
		"inspectionStepConfig": "1768921287939850249",
		"inspectionStepConfigCode": "config01",
		"standardAcqMethod": "by_step_inspect_plan",
		"inspectStepOrder": 1,
		"sourceBillId": "1768921287939850249",
		"sourceCode": "WGBG2024080500010",
		"sourceRowId": "1768921287939850249",
		"sourceRowNo": "10",
		"checkApplyId": "1768921287939850249",
		"checkApplyCode": "CPJY202408080002",
		"vsourceId": "1768921287939850249",
		"inspecterId": "1768921287939850249",
		"inspecter_name": "小明",
		"inspectDept": "1768921287939850249",
		"inspectDept_name": "生产部门",
		"inspectDate": "2023-11-02 00:00:00",
		"judgmentResult": "1",
		"isReinspectRecord": 1,
		"isNeedReinspect": 1,
		"reinspectReason": "再次检验",
		"isNeedResample": 1,
		"resampleMoment": "0",
		"isWfControlled": 0,
		"returncount": 0,
		"pubts": "2023-12-25 10:44:22",
		"sourceOriRecordId": "1768921287939850249",
		"tenant": "0000L5KZEUUE3G0F1O0000",
		"creatorId": "1503246490875723783",
		"creator": "张三",
		"createTime": "2023-11-02 13:50:48",
		"modifierId": "1768148966910722049",
		"modifier": "李四",
		"modifyTime": "2023-12-25 10:44:22",
		"auditorId": "1768148966910722049",
		"auditor": "李四",
		"auditTime": "2023-12-25 10:44:22",
		"OriginalRecordBodyList": [
			{
				"id": "1500425710867054598",
				"originalRecordId": "1500425710867054598",
				"lineNo": 10,
				"isReinspectRecord": 1,
				"sampleSourceId": "2085271442021154821",
				"sampleSourceCode": "QY202405080002",
				"sampleId": "2085271442021154821",
				"sample_code": "YP202405080002",
				"sample_name": "样品02",
				"sampleUseNum": 10,
				"sampleUnit": "2085271442021154821",
				"sampleUnit_name": "千克",
				"sampleUnit_precision": "2",
				"inspectionItemBId": "2085271442021154821",
				"inspectItemClassId": "2085271442021154821",
				"inspectItemClass_name": "检验项目分类01",
				"inspectItemId": "2085271442021154821",
				"inspectItem_code": "JIANYAN002",
				"inspectItem_name": "检验项目01",
				"dynamicInspectItemId": "2085271442021154821",
				"indexNature": "0",
				"inspectValueType": "0",
				"inspectionValueEnum": "合格#不合格#",
				"standardDes": "规定1",
				"statutoryStandard": "规定1",
				"sampleMethodId": "2085271442021154821",
				"sampleMethod_name": "方式1",
				"spotCheckRate": 10,
				"fixedSamples": 10,
				"samplingNumber": 10,
				"samplingUnitId": "2085271442021154821",
				"samplingUnit_name": "千克",
				"samplingUnit_precision": "3",
				"acValue": 10,
				"reValue": 20,
				"qualifiedNumber": 20,
				"unqualifiedNumber": 20,
				"inspectValueUnitId": "2085271442021154821",
				"inspectValueUnit_name": "千克",
				"inspectValueUnit_precision": "3",
				"inspectValue": "3",
				"recordValueB": "1",
				"meaPointNum": 1,
				"accuracy": 2,
				"roundOffRule": "2",
				"multiSampleInspectValType": "2",
				"formula": "",
				"standardFormula": "",
				"keyItemB": "1",
				"inspectType": "1",
				"inspectDetectBasisId": "2085271442021154821",
				"inspectDetectBasis_name": "依据数量",
				"inspectMethodId": "2085271442021154821",
				"inspectMethod_name": "方法01",
				"inspectMethod_enclosure": "9311d7a4-15fb-448c-8a86-8644d929967e",
				"standardValue": "[1,10]",
				"inspectMaxValue": 20,
				"inspectMinValue": 5,
				"inspectAvgValue": 15,
				"judgmentResult": "1",
				"attacheImage": "9311d7a4-15fb-448c-8a86-8644d929967e",
				"reinspectProject": 0,
				"latestOriRecord": 0,
				"standValCharacId": "1500425710867054598",
				"defaInspValCharacId": "1500425710867054598",
				"characRefCode": "qms_baditems_ref",
				"OriginalRecordPointList": [
					{
						"id": "1500425710867054598",
						"originalRecordBId": "1500425710867054598",
						"meaPointNum": 1,
						"inspectValue": "20",
						"meaPointInspectResult": "1"
					}
				]
			}
		],
		"OriginalRecordEquipmentList": [
			{
				"id": "1500425710867054598",
				"originalRecordId": "1500425710867054598",
				"lineNo": 10,
				"equipmentClassId": "1500425710867054598",
				"equipmentClass_name": "分类01",
				"equipmentId": "1500425710867054598",
				"equipment_code": "equip01",
				"equipment_name": "机床",
				"equipment_specification": "1000",
				"equipment_model": "v2.3"
			}
		],
		"OriginalRecordMethodList": [
			{
				"id": "1500425710867054598",
				"originalRecordId": "1500425710867054598",
				"lineNo": 10,
				"inspectMethodId": "1500425710867054598",
				"inspectMethod_code": "method01",
				"inspectMethod_name": "方法01",
				"inspectMethod_type": "分类01",
				"inspectMethod_edition": "1.0",
				"inspectMethod_enclosure": "9311d7a4-15fb-448c-8a86-8644d929967e"
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
999	单据失效或不存在	返回错误信息

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

