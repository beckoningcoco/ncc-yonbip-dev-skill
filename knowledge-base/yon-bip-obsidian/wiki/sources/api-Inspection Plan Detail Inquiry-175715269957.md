---
title: "检验方案详情查询"
apiId: "1757152699572813826"
apiPath: "请求方式	GET"
method: "ContentType"
category: "Inspection Scheme"
domain: "IMCS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Inspection Scheme]
platform_version: "BIP"
source_type: community-api-docs
---

# 检验方案详情查询

>  请求方式	GET | Inspection Scheme (IMCS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/imcs/inspectionplan/detail
请求方式	GET
ContentType	
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	long	query	否	检验方案详情ID：和检验方案编码不可同时为空，都有值的话取ID值    示例: 1752036706339520514
code	string	query	否	检验方案编码：和检验方案详情ID不可同时为空，都有值的话取ID值    示例: Q02056m27星之
orgId	string	query	否	使用组织ID：非单组织时，和使用组织编码不可同时为空，都有值的话取ID值    示例: 1504009491836305414
orgCode	string	query	否	使用组织编码：非单组织时，和使用组织ID不可同时为空，都有值的话取ID值    示例: hm1
version	string	query	否	版本：当ID值为空时生效，并且此时是必填的    示例: 1.0

## 3. 请求示例

Url: /yonbip/imcs/inspectionplan/detail?access_token=访问令牌&id=1752036706339520514&code=Q02056m27%E6%98%9F%E4%B9%8B&orgId=1504009491836305414&orgCode=hm1&version=1.0

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
message	string	否	调用失败时的错误信息 示例：操作成功
data	object	否	调用成功时的返回数据
applyOrgId	string	否	使用组织ID 示例：1504009491836305414
applyOrgName	string	否	使用组织名称 示例：hm1
code	string	否	检验方案编码 示例：Q02056m27星之
creator	string	否	创建人 示例：测试人员账号
modifier	string	否	最后修改人 示例：测试人员张浩
createTime	string	否	创建时间 示例：2023-06-19 16:38:33
qualityLevel	string	否	质量等级ID 示例：1752036706339520510
qualityLevelName	string	否	质量等级名称 示例：AAA
expiryDate	string	否	有效期止 示例：2999-12-31 23:59:59
id	string	否	检验方案详情ID 示例：1752036706339520514
inspectionPlanClass	string	否	检验方案分类ID 示例：1733457803092164613
inspectionPlanClassName	string	否	检验方案分类名称 示例：1233q123
inspectionPlanId	string	否	检验方案ID 示例：1752036663389847562
isInspectionItemConfirm	string	否	单一取样方式 示例：是
name	string	否	检验方案名称 示例：20230612003
newestVer	string	否	最新版本 示例：是
pubts	string	否	时间戳 示例：2023-06-19 16:39:02
qualityInspectionCenter	string	否	管理组织ID 示例：1503239447124639752
qualityInspectionCenterName	string	否	管理组织名称 示例：m27星之国
recordValue	string	否	记录样本值 示例：否
leniencyAdjust	string	否	启用宽严度调整检验：0为否，1为是； 示例：0
samplingMethod	string	否	取样方式ID 示例：1624192933159239691
samplingMethodName	string	否	取样方式名称 示例：楚楚楚楚楚楚次
samplingMethodCheckMethod	string	否	取样方式检验类型：0为全检；1为抽检 示例：0
samplingUnit	string	否	取样单位：0为同检验单位；1为自选计量单位 示例：1
note	string	否	备注 示例：123123123123123123
extras	string	否	附加信息 示例：<div class=\"mdf_rich_text\" forprinttag><p>123431243124123412341234123412342314</p></div>
storage	string	否	启用状态 示例：启用
validFrom	string	否	有效期从 示例：2023-06-13 00:00:00
verifystate	string	否	单据状态 示例：已审核
version	string	否	版本 示例：2.0
modifyTime	string	否	最后修改时间 示例：2023-03-20 15:55:53
inspectionItemBList	object	是	检验项目list
matchPlanList	object	是	检验对象list
applyRangeList	object	是	适用范围list

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"applyOrgId": "1504009491836305414",
		"applyOrgName": "hm1",
		"code": "Q02056m27星之",
		"creator": "测试人员账号",
		"modifier": "测试人员张浩",
		"createTime": "2023-06-19 16:38:33",
		"qualityLevel": "1752036706339520510",
		"qualityLevelName": "AAA",
		"expiryDate": "2999-12-31 23:59:59",
		"id": "1752036706339520514",
		"inspectionPlanClass": "1733457803092164613",
		"inspectionPlanClassName": "1233q123",
		"inspectionPlanId": "1752036663389847562",
		"isInspectionItemConfirm": "是",
		"name": "20230612003",
		"newestVer": "是",
		"pubts": "2023-06-19 16:39:02",
		"qualityInspectionCenter": "1503239447124639752",
		"qualityInspectionCenterName": "m27星之国",
		"recordValue": "否",
		"leniencyAdjust": "0",
		"samplingMethod": "1624192933159239691",
		"samplingMethodName": "楚楚楚楚楚楚次",
		"samplingMethodCheckMethod": "0",
		"samplingUnit": "1",
		"note": "123123123123123123",
		"extras": "<div class=\\\"mdf_rich_text\\\" forprinttag><p>123431243124123412341234123412342314</p></div>",
		"storage": "启用",
		"validFrom": "2023-06-13 00:00:00",
		"verifystate": "已审核",
		"version": "2.0",
		"modifyTime": "2023-03-20 15:55:53",
		"inspectionItemBList": [
			{
				"inspectionPlanDetailId": "1749111756308873216",
				"pubts": "2023-03-20 13:29:28",
				"rownum": 10,
				"id": 1749111756308873220,
				"inspectionItem": "1567994806505308166",
				"inspectionItemCode": "667755",
				"inspectionItemName": "667755",
				"inspectionItemClass": "1503987939691462657",
				"inspectionItemClassName": "1111",
				"standardDes": "加深对佛iasdjfaodfja",
				"statutoryStandard": "阿斯顿发送到发斯蒂芬",
				"keyItem": "是",
				"qualityIndexType": "0",
				"inspectionValueType": "0",
				"samplingMethod": "1624192933159239691",
				"samplingMethodName": "楚楚楚楚楚楚次",
				"roudingRule": "四舍五入",
				"samplingMethodCheckMethod": "0",
				"recordValue": "是",
				"additionalInspection": "否",
				"decimalPlace": 3,
				"inspectionBasic": "1500547327287361540",
				"inspectionBasicName": "1001",
				"inspectionMethod": 1500547327287361541,
				"inspectionMethodName": "特征图谱",
				"inspectStage": "1",
				"attachmentId": "c3c5d09c-38de-4e51-9334-dd685cfb3fa0",
				"note": "奥斯丁发阿斯蒂芬啊打发斯蒂芬骄傲是",
				"coord": "是",
				"inspectionValueUnit": 1499805955680370689,
				"inspectionValueUnitName": "小时",
				"samplingUnit": "1499805955680370689",
				"rid": "5ec8fc70-232e-11eb-8164-ed0b01a9425a",
				"samplingUnitName": "小时",
				"standardvalue": "245:[5,-);",
				"multipleCheckValue": "0",
				"defaultInspectValue": "10",
				"formula": "{\\\"id\\\":\\\"abs(9)\\\",\\\"name\\\":\\\"abs(9)\\\"}",
				"inspectionValueEnum": "a#b#c#d#e#",
				"qmsEquipIdName": "检验仪器",
				"qmsEquipId": "设备"
			}
		],
		"matchPlanList": [
			{
				"inspectionPlanDetailId": "1757178718509858821",
				"pubts": "2023-06-26 14:55:27",
				"id": "1757178718509858819",
				"material": 1503207131693711366,
				"materialCode": "000168",
				"materialName": "条码专用01",
				"materialClass": 1674687918745059333,
				"materialClassCode": "020256",
				"standard": "asfasdfasdf",
				"type": "AAA",
				"supplier": 1501002318834302979,
				"factory": 1500408745853190147,
				"factoryName": "果味大爆发工厂",
				"standardProcess": 1501274722925019144,
				"standardProcessName": "工序1",
				"customer": 1500450003202080775,
				"customerName": "畅捷通",
				"defaultPlan": "是",
				"planInspectionDays": 10
			}
		],
		"applyRangeList": [
			{
				"id": 1757178718509858822,
				"inspectionPlanDetailId": "1757178718509858821",
				"inspectionPlanId": "1757178718509858820",
				"isApplied": true,
				"remark": "啊啊啊啊啊啊",
				"orgId": "1500408745853190147",
				"orgCode": "0101001",
				"orgName": "果味大爆发工厂"
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
999	检验方案详情数据不存在或没有使用权限，请检查参数	没有找到对应的检验方案详情数据

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-25	
更新
请求参数 delData
更新
返回参数 code
更新
返回参数 message
更新
返回参数 data

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

