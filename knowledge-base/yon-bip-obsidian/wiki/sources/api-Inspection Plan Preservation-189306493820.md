---
title: "检验计划保存"
apiId: "1893064938204168198"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Inspection Plan"
domain: "QMS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Inspection Plan]
platform_version: "BIP"
source_type: community-api-docs
---

# 检验计划保存

>  请求方式	POST | Inspection Plan (QMS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/QMS_QIT/checkplanmaintain/save
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
code	string	否	否	检验计划单号：优先按编码规则，编码规则若为自动编码（不可改），按自动编码规则生成， 若为自动编码（可改），以输入为准 若为手工编码，以输入为准。 后台保存时校验必输
_status	string	否	是	操作标识 示例：Insert
planDate	string	否	否	计划到货日期：外部系统创建=否，为后台字段 外部系统创建=是，不为空 示例：2023-01-01
checkType	string	否	是	检验类型：001-采购检验，008-工序检验（工序检验当前只支持外部创建） 示例：001
checkOrg	string	否	否	检验计划请检组织ID 示例：000000001
checkOrgCode	string	否	否	检验计划请检组织编码 示例：0000001
supplier	string	否	否	供应商ID
supplierCode	string	否	否	供应商编码
productId	string	否	否	物料id：参照质检组织有使用权限的物料档案 外部系统创建=否，物料为后台字段 外部系统创建=是，编码和id 任一不为空
productCode	string	否	否	物料编码：参照质检组织有使用权限的物料档案 外部系统创建=否，物料为后台字段 外部系统创建=是，编码和id 任一不为空
transType	string	否	否	交易类型id：不传则为默认交易类型
transTypeCode	string	否	否	交易类型Code：不传则为默认交易类型
batchNo	string	否	否	批次号：外部系统创建为是时，传入生效；外部系统创建为否时，传入不生效
inspectastNum	string	否	是	计划请检数量 示例：1.22
standardProcessId	string	否	否	工序:工序检验时必输，id和编码任一不为空
standardProcessCode	string	否	否	工序编码:工序检验时必输，id和编码任一不为空
workcenterId	string	否	否	工作中心：工序检验时必输,id和编码任一不为空
workcenterCode	string	否	否	工作中心code：工序检验时必输,id和编码任一不为空
note	string	否	否	备注 示例：这是一个备注
orderType	string	否	否	源头单据类型：外部系统创建为是时，输入值生效；外部系统创建为否时，传入不生效
orderCode	string	否	否	源头单据号：外部系统创建为是时，输入值生效；外部系统创建为否时，传入不生效 示例：1892247597415399424
orderLineNum	string	否	否	源头单据行号：外部系统创建为是时，输入值生效；外部系统创建为否时，传入不生效 示例：10
qicSourceBillId	string	否	否	来源单据ID:外部系统创建为是时，输入值生效；外部系统创建为否时，传入不生效 示例：1892247597415399424
qicSourceBillNo	string	否	否	来源单据号:外部系统创建=否时，检验类型≠其他检验时必输，校验来源单据号在系统中存在 示例：202312250035
qicSourceBillLineNo	string	否	否	来源单据行id:外部系统创建=否时，检验类型等于≠其他检验时必输，校验来源单据行号在系统中存在 示例：10
qicSourceLineNum	string	否	否	来源单据行号:外部系统创建=否时，检验类型等于≠其他检验时必输，校验来源单据行号在系统中存在 示例：1892247726266515461
qicSourceDate	string	否	否	来源业务日期:外部系统创建=否时，根据来源单据行号带入
exteriorCreate	boolean	否	是	外部系统创建 示例：true
billnum	string	否	是	该接口为检验计划保存接口，检验计划：qms_checkplanmaintain_card 默认值：qms_checkplanmaintain_card

## 3. 请求示例

Url: /yonbip/QMS_QIT/checkplanmaintain/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"code": "",
		"_status": "Insert",
		"planDate": "2023-01-01",
		"checkType": "001",
		"checkOrg": "000000001",
		"checkOrgCode": "0000001",
		"supplier": "",
		"supplierCode": "",
		"productId": "",
		"productCode": "",
		"transType": "",
		"transTypeCode": "",
		"batchNo": "",
		"inspectastNum": "1.22",
		"standardProcessId": "",
		"standardProcessCode": "",
		"workcenterId": "",
		"workcenterCode": "",
		"note": "这是一个备注",
		"orderType": "",
		"orderCode": "1892247597415399424",
		"orderLineNum": "10",
		"qicSourceBillId": "1892247597415399424",
		"qicSourceBillNo": "202312250035",
		"qicSourceBillLineNo": "10",
		"qicSourceLineNum": "1892247726266515461",
		"qicSourceDate": "",
		"exteriorCreate": true
	},
	"billnum": ""
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
code	string	否	返回码 示例：200
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
CheckPlanBodyList	object	是	检验计划子表孙表数据
qualityinSpectionCenter	string	否	质检组织ID 示例：1879504025663569924
qualityinSpectionCenter_name	string	否	质检组织名称 示例：乐园公司-总
code	string	否	检验计划单号 示例：JYJH202312260076
sysDate	Date	否	单据日期 示例：2023-12-26
inspectionStartTime	Date	否	整单计划开始时间 示例：2030-12-27 17:43:31
inspectionEndTime	Date	否	整单计划结束时间 示例：2030-12-28 00:43:31
verifystate	int	否	检验计划状态值 示例：4
checkType	string	否	检验类型 示例：001
transType	string	否	交易类型ID 示例：1878733096215383688
transType_name	string	否	交易类型 示例：检验计划
checkStep	string	否	是否按步骤检验 示例：1
productId	string	否	物料ID 示例：1879509325628047364
productCode	string	否	物料编码 示例：0001000002
productName	string	否	物料名称 示例：茉莉茶-检验
product_productPropCharacterDefine	object	否	物料自定义属性
freect_h	object	否	自由项特征
pk_unit	string	否	主计量ID 示例：1878733199268904961
pk_unit_name	string	否	主计量 示例：小时
checkOrg	string	否	请检组织ID 示例：1879504025663569924
checkOrg_name	string	否	请检组织 示例：乐园公司-总
inspectastNum	Decimal	否	计划请检数量 示例：8
supplier	string	否	供应商ID 示例：1884693763480616963
supplier_name	string	否	供应商名称 示例：乐园系统供应-广汽供应商
checkStepConfig	string	否	检验步骤配置ID 示例：1887067213960052741
checkStepConfig_name	string	否	检验步骤配置名称 示例：ZXD检验步骤配置
qicSourceBillType	string	否	来源单据类型 示例：st_purchaseorder
qicSourceBillNo	string	否	来源单据号 示例：CGDD231225000003
qicSourceLineNum	string	否	来源单据行号 示例：10
qicSourceBillId	string	否	来源单据ID 示例：1892846676566605832
qicSourceDate	string	否	来源业务日期 示例：2023-12-25 00:00:00
note	string	否	备注 示例：这是一个备注
id	string	否	id 示例：1893083105939423232
creatorId	string	否	创建人ID 示例：1882002485449588737
creator	string	否	创建人名称 示例：昵某-13662080373
createTime	DateTime	否	创建时间 示例：2023-12-26 17:44:39
createDate	string	否	创建日期 示例：2023-12-26 17:44:39
pubts	Date	否	时间戳 示例：2023-12-26 17:44:39
ytenant	string	否	租户ID 示例：0000LPUJ6TO51JT8N60000

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"CheckPlanBodyList": [
			{
				"CheckRoomList": [
					{
						"lineNo": 10,
						"inspectionCenterName": "ZXD检测室1",
						"inspectionCenterCode": "0001",
						"inspectionCenterId": "1882596075694981122",
						"id": "1893083105939423236",
						"bodyID": "1893083105939423233",
						"pubts": "2023-12-26 17:44:39",
						"ytenant": "0000LPUJ6TO51JT8N60000"
					}
				],
				"CheckDeviceList": [
					{
						"lineNo": 10,
						"deviceClass": "1882509703902658565",
						"deviceClass_name": "",
						"deviceCode": "0001",
						"deviceName": "ZXD仪器",
						"deviceId": "1882509910061088773",
						"id": "1893083105939423235",
						"bodyID": "1893083105939423233",
						"pubts": "2023-12-26 17:44:39",
						"ytenant": "0000LPUJ6TO51JT8N60000"
					}
				],
				"CheckInfoList": [
					{
						"lineNo": "10",
						"inspectionItem_code": "C00001",
						"inspectionItem": "1879511730816024586",
						"rules": "1",
						"number": "2",
						"inspectionMethod_name": "121",
						"attachmentId": "4df8db8a-0545-4314-96e4-a201e8a47435",
						"inspectionMethod": "1879511610572668937",
						"additionalInspection": "0",
						"inspectionItemClass_name": "这是一个检验项目分类",
						"samplingMethod_name": "22",
						"inspectionItem_name": "乐园检验项目",
						"inspectionType": "0",
						"samplingUnit": "",
						"inspectionItemClass": "1879510614124527616",
						"keyItem": "1",
						"samplingUnit_name": "小时",
						"samplingMethod": "1879512383666782212",
						"qualityNature": "0",
						"id": "1893083105939423234",
						"bodyID": "1893083105939423233",
						"pubts": "2023-12-26 17:44:39",
						"ytenant": "0000LPUJ6TO51JT8N60000"
					}
				],
				"isInspectionItemConfirm": "1",
				"planStartTime": "2030-12-27 17:43:31",
				"planEndTime": "2030-12-27 18:43:31",
				"inspectionPlanId": "1882681932095422472",
				"samplingMethod": "1879512383666782212",
				"samplingMethod_name": "这是一个取样方式",
				"timeUnit": "h",
				"id": "1893083105939423233",
				"planID": "1893083105939423232",
				"pubts": "2023-12-26 17:44:39",
				"ytenant": "0000LPUJ6TO51JT8N60000",
				"inspectionTime": 1,
				"inspectStep": "1882007407459565571",
				"inspectStep_name": "成分鉴定",
				"inspectionPlan_name": "乐园-检验方案",
				"inspectionPlanVersion": "2.0",
				"inspectStepNumber": ""
			}
		],
		"qualityinSpectionCenter": "1879504025663569924",
		"qualityinSpectionCenter_name": "乐园公司-总",
		"code": "JYJH202312260076",
		"sysDate": "2023-12-26",
		"inspectionStartTime": "2030-12-27 17:43:31",
		"inspectionEndTime": "2030-12-28 00:43:31",
		"verifystate": 4,
		"checkType": "001",
		"transType": "1878733096215383688",
		"transType_name": "检验计划",
		"checkStep": "1",
		"productId": "1879509325628047364",
		"productCode": "0001000002",
		"productName": "茉莉茶-检验",
		"product_productPropCharacterDefine": {},
		"freect_h": {},
		"pk_unit": "1878733199268904961",
		"pk_unit_name": "小时",
		"checkOrg": "1879504025663569924",
		"checkOrg_name": "乐园公司-总",
		"inspectastNum": 8,
		"supplier": "1884693763480616963",
		"supplier_name": "乐园系统供应-广汽供应商",
		"checkStepConfig": "1887067213960052741",
		"checkStepConfig_name": "ZXD检验步骤配置",
		"qicSourceBillType": "st_purchaseorder",
		"qicSourceBillNo": "CGDD231225000003",
		"qicSourceLineNum": "10",
		"qicSourceBillId": "1892846676566605832",
		"qicSourceDate": "2023-12-25 00:00:00",
		"note": "这是一个备注",
		"id": "1893083105939423232",
		"creatorId": "1882002485449588737",
		"creator": "昵某-13662080373",
		"createTime": "2023-12-26 17:44:39",
		"createDate": "2023-12-26 17:44:39",
		"pubts": "2023-12-26 17:44:39",
		"ytenant": "0000LPUJ6TO51JT8N60000"
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
999	保存失败	返回错误信息

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

