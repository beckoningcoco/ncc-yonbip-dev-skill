---
title: "检验计划详情查询"
apiId: "1892325697048281092"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Inspection Plan"
domain: "QMS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Inspection Plan]
platform_version: "BIP"
source_type: community-api-docs
---

# 检验计划详情查询

>  请求方式	GET | Inspection Plan (QMS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/QMS_QIT/checkplanmaintain/detail
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
code	string	query	否	检验计划单号
id	string	query	否	检验计划单id
SourceLineId	string	query	否	来源单据孙表行id

## 3. 请求示例

Url: /yonbip/QMS_QIT/checkplanmaintain/detail?access_token=访问令牌&code=&id=&SourceLineId=

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
code	string	否	状态码 示例：200
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
data	object	否	data
qms_qit_incominspectorder_sourcelistList	object	是	源单信息
id	string	否	表头id 示例：0000
qualityinSpectionCenter	string	否	质检组织id 示例：1461139361529593865
qualityinSpectionCenter_name	string	否	质检组织 示例：组织1
code	string	否	检验计划单号 示例：JYJH202312070001
pubts	DateTime	否	单据日期 示例：2023-11-09 00:00:00
inspectionStartTime	DateTime	否	整单计划检验开始时间 示例：2023-11-09 00:00:00
inspectionEndTime	DateTime	否	整单计划检验结束时间 示例：2023-11-09 00:00:00
verifystate	string	否	计划状态 示例：0
checkType	string	否	检验类型 示例：001
transType	string	否	交易类型id 示例：1861703834240286727
pk_unit_name	string	否	主计量
transType_name	string	否	交易类型 示例：检验计划
sysDate	date
格式:-	否	单据日期
checkStep	string	否	按步骤检验
productId	string	否	物料id 示例：1225464656654655
qicSourceBillId	string	否	来源单据id
productCode	string	否	物料编码 示例：00001
productName	string	否	物料名称 示例：物料1
specsExplain	string	否	规格说明 示例：11
model	string	否	型号
product_productPropCharacterDefine	object	否	物料自定义属性
batchNo	string	否	批次号
inspectastNum	string	否	计划请检数量
pk_unit	string	否	主计量id
checkOrg	string	否	请检组织id
checkOrg_name	string	否	请检组织
supplier	string	否	供应商id
supplier_name	string	否	供应商
checkStepConfig	string	否	检验步骤配置
orderType	string	否	源头单据类型
orderCode	string	否	源头单据号
orderLineNum	string	否	源头单据行号
qicSourceBillType	string	否	来源单据类型
qicSourceBillNo	string	否	来源单据号
qicSourceLineNum	string	否	来源单据行号
qicSourceDate	DateTime	否	来源业务日期
note	string	否	备注
CheckPlanBodyList	object	否	详细信息表体

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"id": "0000",
		"qualityinSpectionCenter": "1461139361529593865",
		"qualityinSpectionCenter_name": "组织1",
		"code": "JYJH202312070001",
		"pubts": "2023-11-09 00:00:00",
		"inspectionStartTime": "2023-11-09 00:00:00",
		"inspectionEndTime": "2023-11-09 00:00:00",
		"verifystate": "0",
		"checkType": "001",
		"transType": "1861703834240286727",
		"pk_unit_name": "",
		"transType_name": "检验计划",
		"sysDate": "2026-06-07 13:18:44",
		"checkStep": "",
		"productId": "1225464656654655",
		"qicSourceBillId": "",
		"productCode": "00001",
		"productName": "物料1",
		"specsExplain": "11",
		"model": "",
		"product_productPropCharacterDefine": {},
		"batchNo": "",
		"inspectastNum": "",
		"pk_unit": "",
		"checkOrg": "",
		"checkOrg_name": "",
		"supplier": "",
		"supplier_name": "",
		"checkStepConfig": "",
		"orderType": "",
		"orderCode": "",
		"orderLineNum": "",
		"qicSourceBillType": "",
		"qicSourceBillNo": "",
		"qicSourceLineNum": "",
		"qicSourceDate": "",
		"note": "",
		"CheckPlanBodyList": {
			"inspectStepNumber": "",
			"inspectStep": "",
			"inspectStep_name": "",
			"planStartTime": "",
			"inspectionTime": 0,
			"timeUnit": "",
			"planEndTime": "",
			"inspectionPlanId": "",
			"inspectionPlanId_name": "",
			"inspectionPlanVersion": "",
			"trendsInspectionPlan": "",
			"trendsInspectionPlan_name": "",
			"trendsInspectionPlanVersion": "",
			"inspectionBasic": "",
			"inspectionBasic_name": "",
			"samplingMethod": "",
			"samplingMethod_name": "",
			"isInspectionItemConfirm": "",
			"id": "",
			"planID": "",
			"CheckInfoList": {
				"inspectionItemClass": "",
				"inspectionItemClass_name": "",
				"inspectionItem": "",
				"inspectionItem_code": "",
				"inspectionItem_name": "",
				"controlStandards": "",
				"statutoryStandard": "",
				"inspectionUnit": "",
				"inspectionUnit_name": "",
				"inspectionType": "",
				"qualityNature": "",
				"recordValue": "",
				"number": 0,
				"rules": "",
				"multipleCheckValue": "",
				"inspectValueFormula": "",
				"keyItem": "",
				"checkNumber": "",
				"samplingUnit": "",
				"samplingUnit_name": "",
				"additionalInspection": "",
				"inspectionBasic": "",
				"inspectionBasic_name": "",
				"inspectionMethod": "",
				"inspectionMethod_name": "",
				"attachmentId": "",
				"note": "",
				"id": "",
				"bodyID": ""
			},
			"CheckDeviceList": {
				"deviceId": "",
				"deviceId_class": "",
				"deviceId_code": "",
				"deviceId_name": "",
				"id": "",
				"bodyID": ""
			},
			"CheckRoomList": {
				"inspectionCenterId": "",
				"inspectionCenterId_code": "",
				"inspectionCenterId_name": "",
				"id": "",
				"bodyID": ""
			}
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
999	查询失败	

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

