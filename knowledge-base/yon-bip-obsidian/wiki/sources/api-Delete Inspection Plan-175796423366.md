---
title: "检验方案保存"
apiId: "1757964233667510276"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Inspection Scheme"
domain: "IMCS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Inspection Scheme]
platform_version: "BIP"
source_type: community-api-docs
---

# 检验方案保存

>  请求方式	POST | Inspection Scheme (IMCS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/imcs/inspectionplan/save
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
data	object	否	是	业务数据
id	string	否	否	检验方案详情ID：更新操作时必传 示例：1684401708861489162
code	string	否	否	检验方案编码：同一使用组织下编码唯一；更新操作时，只有管理组织等于使用组织时可改；非自动编码模式时必填 示例：CODE20230320
name	string	否	是	检验方案名称：更新操作时，只有管理组织等于使用组织时可改 示例：OPENAPI
inspectionPlanClass	string	否	否	检验方案分类ID：和检验方案分类编码不可同时为空，都有值的话取ID值 示例：1622904150892740611
inspectionPlanClassCode	string	否	否	检验方案分类编码：和检验方案分类ID不可同时为空，都有值的话取ID值 示例：2003
qualityInspectionCenter	string	否	否	管理组织ID：和管理组织编码可以都为空，都有值得话取ID值，但如果是多组织时，和管理组织编码不可同时为空 示例：1437879802912047112
qualityInspectionCenterCode	string	否	否	管理组织编码：和管理组织ID可以都为空，都有值得话取ID值，但如果是多组织时，和管理组织ID不可同时为空 示例：hm2
applyOrgId	string	否	否	使用组织ID：和使用组织编码可以都为空，都有值的话取ID值，但如果是更新操作，并且是多组织时，和使用组织编码不可同时为空 示例：1450669554097717255
applyOrgCode	string	否	否	使用组织编码：和使用组织ID可以都为空，都有值的话取ID值，但如果是更新操作，并且是多组织时，和使用组织ID不可同时为空 示例：hm3
isInspectionItemConfirm	string	否	否	单一取样方式：0为否，此时各个检验项目的取样方式在该条检验项目数据中指定；1为是，表示所有检验项目的取样方式进行统一指定；新增操作时默认为是；当为是时，表头的取样方式不可为空，而为否时，则检验项目list中的取样方式不可为空；更新时不可为空 示例：1
samplingMethod	string	否	否	取样方式ID：和取样方式编码可以都为空，都有值时取ID值，但是当单一取样方式为是时，和取样方式编码不可同时为空 示例：1757757053035085829
samplingMethodCode	string	否	否	取样方式编码：和取样方式ID可以都为空，都有值时取ID值，但是当单一取样方式为是时，和取样方式ID不可同时为空 示例：2079
samplingUnit	string	否	否	取样单位：0表示同检验单位；1表示自选计量单位；新增操作时默认同检验单位；单一取样方式：0为否，此时各个检验项目的取样单位在该条检验项目数据中指定；1为是，表示所有检验项目的取样单位进行统一指定；新增操作时默认为是；当为是时，表头的取样单位不可为空，而为否时，则检验项目list中的取样单位不可为空；更新时不可为空 示例：0
inspectionType	string	否	否	检验类型：001-采购检验；002-产品检验；003-在库检验；004-发货检验；005-退货检验；006-其他检验；007-委外检验；008-工序检验；009-过程检验；010-调入检验；011-产品过程检验；012-工序过程检验；多个用逗号隔开 示例：001,002
qualityLevel	string	否	否	质量等级ID：和质量等级编码可以都为空，都有值时取ID值；更新操作时，如果修改了质量等级，则原有的检验项目-标准值会被清空 示例：1508632628979826693
qualityLevelCode	string	否	否	质量等级编码：和质量等级ID可以都为空，都有值时取ID值；更新操作时，如果修改了质量等级，则原有的检验项目-标准值会被清空 示例：02
recordValue	string	否	是	记录样本值：0-否，表示所有检验项均不记录样本检验值；1-是，表示所有检验项均记录样本检验值；2-检验项目确定，表示各检验项目在各自数据中设置是否记录样本检验值；取样方式的检验方式为全检时，不可记录样本检验值 示例：0
leniencyAdjust	string	否	否	启用宽严度调整检验：0为否，1为 是 示例：0 默认值：0
validFrom	Date	否	是	有效期从 示例：2023-06-28
expiryDate	Date	否	否	有效期止 示例：2999-12-31
note	string	否	否	备注 示例：123
_status	string	否	是	操作标识：Insert为新增，Update为更新；共享成功的数据才能执行更新操作 示例：Insert 默认值：Insert
applyRangeList	object	是	否	适用范围list：单组织时不传，多组织时必传；新增时，至少包含一个管理组织，而如果只有一个管理组织，表示开启自动共享
inspectionItemBList	object	是	否	检验项目list：新增操作时，至少要有一条检验项目数据；更新操作时如果该字段不存在或者值为空，则表示不进行任何更改；【检验项目】不可重复
matchPlanList	object	是	否	检验对象list：新增操作时，至少要有一条检验对象数据；更新操作时如果该字段不存在或者值为空，则表示不进行任何更改；【物料+物料分类+工厂+标准工序+客户+供应商】不可重复

## 3. 请求示例

Url: /yonbip/imcs/inspectionplan/save?access_token=访问令牌
Body: {
	"data": {
		"id": "1684401708861489162",
		"code": "CODE20230320",
		"name": "OPENAPI",
		"inspectionPlanClass": "1622904150892740611",
		"inspectionPlanClassCode": "2003",
		"qualityInspectionCenter": "1437879802912047112",
		"qualityInspectionCenterCode": "hm2",
		"applyOrgId": "1450669554097717255",
		"applyOrgCode": "hm3",
		"isInspectionItemConfirm": "1",
		"samplingMethod": "1757757053035085829",
		"samplingMethodCode": "2079",
		"samplingUnit": "0",
		"inspectionType": "001,002",
		"qualityLevel": "1508632628979826693",
		"qualityLevelCode": "02",
		"recordValue": "0",
		"leniencyAdjust": "0",
		"validFrom": "2023-06-28",
		"expiryDate": "2999-12-31",
		"note": "123",
		"_status": "Insert",
		"applyRangeList": [
			{
				"orgId": "1534502831902949385",
				"orgCode": "11",
				"_status": "Insert"
			}
		],
		"inspectionItemBList": [
			{
				"id": "1509143249046470668",
				"inspectionItem": "1697179846453493767",
				"inspectionItemCode": "C00001",
				"standardDes": "内控标准规定",
				"statutoryStandard": "法定标准规定",
				"samplingMethod": "1757757053035085829",
				"samplingMethodCode": "2079",
				"inspectStage": "",
				"samplingUnit": "1500425710867054598",
				"samplingUnitCode": "KGM",
				"recordValue": "0",
				"multipleCheckValue": "1",
				"additionalInspection": "0",
				"decimalPlace": 3,
				"roudingRule": "0",
				"inspectionBasic": "1500547327287361540",
				"inspectionBasicCode": "1001",
				"inspectionMethod": "1509143249046470667",
				"inspectionMethodCode": "100104",
				"note": "xxxxxxxxxxx",
				"coord": "1",
				"keyItem": "1",
				"_status": "Insert",
				"standardvalue": "3",
				"standardValueList": [
					{
						"bvcode": "test123",
						"standardvalue": "(5,20]",
						"id": "18963256665888"
					}
				],
				"qmsEquipId": "18963256665888",
				"qmsEquipCode": "test"
			}
		],
		"matchPlanList": [
			{
				"id": "1509143249046470669",
				"material": "1500426054464438274",
				"materialCode": "000001",
				"materialClass": "1505430412918784006",
				"materialClassCode": "000001",
				"factory": "1500408745853190147",
				"factoryCode": "0101001",
				"standardProcess": "1501274722925019144",
				"standardProcessCode": "0001",
				"customer": "1500450003202080775",
				"customerCode": "111",
				"defaultPlan": "1",
				"planInspectionDays": 10,
				"supplier": "1090450003202080775",
				"supplierCode": "1009",
				"_status": "Insert"
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
qms_qit_incominspectorder_sourcelistList	object	是	源单信息
product_name	string	否	物料名称 示例：Rachel物料3
code	string	否	返回码，成功时返回200 示例：200
message	string	否	返回信息描述 示例：操作成功
data	object	否	接口调用返回数据
applyOrgId	string	否	使用组织ID 示例：1504009491836305414
code	string	否	检验方案编码 示例：Q02056m27星之
createTime	string	否	创建日期 示例：2023-03-20 13:29:27
expiryDate	string	否	有效期止 示例：2999-12-31 23:59:59
id	string	否	检验方案详情ID 示例：1752036706339520514
inspectionPlanClass	string	否	检验方案分类ID 示例：1733457803092164613
inspectionPlanClassCode	string	否	检验方案分类编码 示例：test001
inspectionPlanClassName	string	否	检验方案分类名称 示例：1233q123
inspectionPlanId	string	否	检验方案ID 示例：1752036663389847562
isInspectionItemConfirm	string	否	单一取样方式：0为否；1为是 示例：1
name	string	否	检验方案名称 示例：20230612003
newestVer	string	否	最新版本：0为否；1为是 示例：1
note	string	否	备注 示例：aasdfadsf
pubts	string	否	时间戳 示例：2023-03-20 13:29:28
qualityInspectionCenter	string	否	管理组织ID 示例：1503239447124639752
qualityInspectionCenterCode	string	否	管理组织编码 示例：m27星之国
recordValue	string	否	记录样本值：0为否；1为是；2为检验项目确定 示例：0
samplingMethod	string	否	取样方式ID 示例：1624192933159239691
samplingMethodCode	string	否	取样方式编码 示例：gfs
leniencyAdjust	string	否	启用宽严度调整检验：0为否，1为是 示例：0
samplingUnit	string	否	取样单位：0为同检验单位；1为自选计量单位 示例：1
qualityLevel	string	否	质量等级ID 示例：1508632422821396489
qualityLevelCode	string	否	质量等级编码 示例：code01
inspectionType	string	否	检验类型：001-采购检验；002-产品检验；003-在库检验；004-发货检验；005-退货检验；006-其他检验；007-委外检验；008-工序检验；009-过程检验 示例：001
storage	string	否	启用状态：0为启用；1为停用 示例：0
validFrom	string	否	有效期从 示例：2023-06-13 00:00:00
verifystate	int	否	单据状态：0为开立；2为已审核 示例：0
version	string	否	版本 示例：1.0
matchPlanList	object	是	检验对象list
inspectionItemBList	object	是	检验项目list
applyRangeList	object	是	适用范围list

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"applyOrgId": "1504009491836305414",
		"code": "Q02056m27星之",
		"createTime": "2023-03-20 13:29:27",
		"expiryDate": "2999-12-31 23:59:59",
		"id": "1752036706339520514",
		"inspectionPlanClass": "1733457803092164613",
		"inspectionPlanClassCode": "test001",
		"inspectionPlanClassName": "1233q123",
		"inspectionPlanId": "1752036663389847562",
		"isInspectionItemConfirm": "1",
		"name": "20230612003",
		"newestVer": "1",
		"note": "aasdfadsf",
		"pubts": "2023-03-20 13:29:28",
		"qualityInspectionCenter": "1503239447124639752",
		"qualityInspectionCenterCode": "m27星之国",
		"recordValue": "0",
		"samplingMethod": "1624192933159239691",
		"samplingMethodCode": "gfs",
		"leniencyAdjust": "0",
		"samplingUnit": "1",
		"qualityLevel": "1508632422821396489",
		"qualityLevelCode": "code01",
		"inspectionType": "001",
		"storage": "0",
		"validFrom": "2023-06-13 00:00:00",
		"verifystate": 0,
		"version": "1.0",
		"matchPlanList": [
			{
				"inspectionPlanDetailId": "1757178718509858821",
				"pubts": "2023-03-20 13:29:27",
				"id": "1757178718509858819",
				"material": 1503207131693711366,
				"materialCode": "000168",
				"materialClass": "1674687918745059333",
				"supplier": "1501002318834302979",
				"factory": 1500408745853190147,
				"standardProcess": 1501274722925019144,
				"customer": 1500450003202080775,
				"defaultPlan": "1",
				"planInspectionDays": 10
			}
		],
		"inspectionItemBList": [
			{
				"inspectionPlanDetailId": "1749111756308873216",
				"pubts": "2023-03-20 13:29:27",
				"rownum": 10,
				"id": 1749111756308873220,
				"inspectionItem": "1567994806505308166",
				"inspectionItemCode": "667755",
				"inspectionItemClass": "1503987939691462657",
				"standardDes": "加深对佛iasdjfaodfja",
				"statutoryStandard": "阿斯顿发送到发斯蒂芬",
				"keyItem": "1",
				"qualityIndexType": "0",
				"inspectionValueType": "0",
				"samplingMethod": "1624192933159239691",
				"inspectStage": "1",
				"recordValue": "0",
				"additionalInspection": "0",
				"decimalPlace": 3,
				"roudingRule": "0",
				"inspectionBasic": "1500547327287361540",
				"inspectionMethod": 1500547327287361541,
				"inspectionMethodName": "特征图谱",
				"attachmentId": "c3c5d09c-38de-4e51-9334-dd685cfb3fa0",
				"note": "奥斯丁发阿斯蒂芬啊打发斯蒂芬骄傲是",
				"coord": "1",
				"inspectionValueUnit": 1499805955680370689,
				"samplingUnit": 1499805955680370689,
				"rid": "5ec8fc70-232e-11eb-8164-ed0b01a9425a",
				"multipleCheckValue": "0",
				"qmsEquipIdName": "仪器设备",
				"qmsEquipId": "291012931929391"
			}
		],
		"applyRangeList": [
			{
				"id": 1765196795364245515,
				"inspectionPlanId": "1765196795364245513",
				"inspectionPlanDetailId": "1765196795364245514",
				"orgId": "1534502831902949385",
				"pubts": "2023-07-07 10:12:33",
				"isApplied": true
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
999	取决于错误类型，不同错误信息返回结果不同	根据错误做出相对应操作

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2026-01-21	
更新
请求说明
新增
请求参数 qmsEquipId
新增
请求参数 qmsEquipCode
更新
请求参数 (6)
新增
返回参数 qmsEquipIdName
新增
返回参数 qmsEquipId
更新
返回参数 (4)
增加仪器设备
	2	2025-07-17	
更新
请求参数 multipleCheckValue
多样本检验值：0为最小值；1为最大值；2为平均值；3为CPK；4为去掉极值取平均；当记录样本值为是，且检验项目的检验值类型为数值型时必填
	3	2025-07-01	
新增
请求参数 leniencyAdjust
新增
请求参数 inspectStage
更新
请求参数 inspectionType
更新
请求参数 roudingRule
新增
返回参数 leniencyAdjust
新增
返回参数 inspectStage
更新
返回参数 roudingRule
取消字段必输
	4	2025-04-01	
更新
请求参数 inspectionType

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

