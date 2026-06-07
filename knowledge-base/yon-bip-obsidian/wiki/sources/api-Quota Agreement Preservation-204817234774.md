---
title: "配额协议保存"
apiId: "2048172347746156544"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Quota Agreement"
domain: "PCS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Quota Agreement]
platform_version: "BIP"
source_type: community-api-docs
---

# 配额协议保存

>  请求方式	POST | Quota Agreement (PCS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/cpu/qtAgreeList/bill/apisave
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
data	object	否	是	数据分组标识
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
id	string	否	否	主表id。新增不需要填，修改时必须填，而且要填单据修改前的值，也就是填单据上次保存的id 示例：3839906679148800
code	string	否	否	配额协议编码，设置手动编码时请填写
name	string	否	是	配额协议名称
orgCode	string	否	否	组织编码，orgCode和orgId二选一必填
orgId	string	否	否	组织id，orgCode和orgId二选一必填
businessType	string	否	是	业务场景，1：采购下单，3：委外下单
materialCode	string	否	否	物料编码，materialCode和materialId二选一必填
materialId	string	否	否	物料id，materialCode和materialId二选一必填
manageClassId	string	否	否	物料分类ID
manageClassCode	string	否	否	物料分类编码
purchaseClassId	string	否	否	采购品类ID
purchaseClassId_code	string	否	否	采购品类编码
controlMethod	string	否	否	控制方式：1：数量；2：含税金额；3：无税金额
overControl	string	否	否	配额超量控制：1：不控制；2：检查提示；3：严格控制
effectStartDate	string	否	是	有效起始日期 示例：2024-04-03
agreeTemplateId	string	否	否	配额协议模板id
agreeTemplateCode	string	否	否	配额协议模板编码
agreeTemplateName	string	否	否	配额协议模板名称
exchRateType	string	否	否	汇率类型id
exchRateTypeCode	string	否	否	汇率类型编码
exchRateTypeName	string	否	否	汇率类型
mainUnit	string	否	否	主单位ID
mainUnit_name	string	否	否	主单位
effectEndDate	string	否	否	有效截止日期 示例：2024-04-03
enable	string	否	是	启用状态，1：启用，0：停用 默认值：1
minSplitNum	number
小数位数:8,最大长度:20	否	否	最小拆分量
quotaAgreeChdId	object	否	否	配额协议自定义项
QuotaAgreeAllotVOList	object	是	是	配额分配子表信息
QuotaAgreeOrgVOList	object	是	是	适用组织范围数据分组
_status	string	否	是	主表增删改状态标识，状态,Insert:新增;Update:修改;Delete:删除; 示例：Insert

## 3. 请求示例

Url: /yonbip/cpu/qtAgreeList/bill/apisave?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": "3839906679148800",
		"code": "",
		"name": "",
		"orgCode": "",
		"orgId": "",
		"businessType": "",
		"materialCode": "",
		"materialId": "",
		"manageClassId": "",
		"manageClassCode": "",
		"purchaseClassId": "",
		"purchaseClassId_code": "",
		"controlMethod": "",
		"overControl": "",
		"effectStartDate": "2024-04-03",
		"agreeTemplateId": "",
		"agreeTemplateCode": "",
		"agreeTemplateName": "",
		"exchRateType": "",
		"exchRateTypeCode": "",
		"exchRateTypeName": "",
		"mainUnit": "",
		"mainUnit_name": "",
		"effectEndDate": "2024-04-03",
		"enable": "",
		"minSplitNum": 0,
		"quotaAgreeChdId": {},
		"QuotaAgreeAllotVOList": [
			{
				"id": "3839906679148800",
				"_status": "Insert",
				"supplyDocId": "",
				"supplyDocId_code": "",
				"quota": 0,
				"enable": "",
				"quotaAdjustNum": 0,
				"totalMaxOrderNum": 0,
				"iorder": 0,
				"quotaAdjustMoney": 0,
				"totalMaxOrderMoney": 0
			}
		],
		"QuotaAgreeOrgVOList": [
			{
				"id": "2294170546491640",
				"_status": "Insert",
				"orgCode": ""
			}
		],
		"_status": "Insert"
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
code	number
小数位数:0,最大长度:10	否	code 示例：200
message	string	否	message 示例：操作成功
data	object	否	data
orgId	string	否	orgId 示例：1917641548524683269
orgCode	string	否	orgCode 示例：zb01
orgName	string	否	orgName 示例：采购云测试分公司-全职能
name	object	否	name
isMaterialClass	number
小数位数:0,最大长度:10	否	isMaterialClass 示例：0
materialCode	string	否	materialCode 示例：Y16030986
materialName	string	否	materialName 示例：0-0.16压力表
manageClassCode	string	否	manageClassCode 示例：62
manageClassName	string	否	manageClassName 示例：62
businessType	string	否	businessType 示例：2
allotplan	number
小数位数:0,最大长度:10	否	allotplan 示例：50
enable	string	否	enable 示例：1
status	number
小数位数:0,最大长度:10	否	status 示例：0
minSplitNum	number
小数位数:1,最大长度:10	否	minSplitNum 示例：4.1
mainUnit_name	string	否	mainUnit_name 示例：个
mainUnit	string	否	mainUnit 示例：1917650327448322063
unitPrecision	string	否	unitPrecision 示例：2
id	string	否	id 示例：1966306440001880065
pubts	string	否	pubts 示例：2024-07-23 14:07:20
materialId	string	否	materialId 示例：1918117173215625225
manageClassId	string	否	manageClassId 示例：1917650069757624325
effectStartDate	string	否	effectStartDate 示例：2024-04-03 00:00:00
vouchdate	string	否	vouchdate 示例：2024-04-03 00:00:00
isWfControlled	boolean	否	isWfControlled 示例：true
purchaseClassId	string	否	采购品类ID
verifystate	number
小数位数:0,最大长度:10	否	verifystate 示例：4
manageClassPath	string	否	manageClassPath 示例：1917650069757624325|
dr	number
小数位数:0,最大长度:10	否	dr 示例：0
QuotaAgreeAllotVOList	object	是	QuotaAgreeAllotVOList
resubmitCheckKey	string	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
QuotaAgreeOrgVOList	object	是	QuotaAgreeOrgVOList
modifierName	string	否	modifierName 示例：昵称-马鹤
modifier	string	否	modifier 示例：5a0e3b26-1604-4989-8179-f2fe83c86298
modifier_userName	string	否	modifier_userName 示例：昵称-马鹤
modifyTime	string	否	modifyTime 示例：2024-07-23 14:07:20
tenant	string	否	tenant 示例：0000LRVPV7SW7YSA3W0000
ytenant	string	否	ytenant 示例：0000LRVPV7SW7YSA3W0000
code	string	否	code 示例：PE20240403000001
traceId	string	否	traceId 示例：de680d4b42f38202

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"orgId": "1917641548524683269",
		"orgCode": "zb01",
		"orgName": "采购云测试分公司-全职能",
		"name": {
			"zh_CN": "0403测试按钮"
		},
		"isMaterialClass": 0,
		"materialCode": "Y16030986",
		"materialName": "0-0.16压力表",
		"manageClassCode": "62",
		"manageClassName": "62",
		"businessType": "2",
		"allotplan": 50,
		"enable": "1",
		"status": 0,
		"minSplitNum": 4.1,
		"mainUnit_name": "个",
		"mainUnit": "1917650327448322063",
		"unitPrecision": "2",
		"id": "1966306440001880065",
		"pubts": "2024-07-23 14:07:20",
		"materialId": "1918117173215625225",
		"manageClassId": "1917650069757624325",
		"effectStartDate": "2024-04-03 00:00:00",
		"vouchdate": "2024-04-03 00:00:00",
		"isWfControlled": true,
		"purchaseClassId": "",
		"verifystate": 4,
		"manageClassPath": "1917650069757624325|",
		"dr": 0,
		"QuotaAgreeAllotVOList": [
			{
				"agreeId": "1966306440001880065",
				"supplyDocId_code": "0001000001",
				"enable": 1,
				"quota": 6,
				"supplyDocId": "1918810655810387971",
				"id": "1966306440001880066",
				"percentage": "100.00",
				"ytenant": "0000LRVPV7SW7YSA3W0000"
			}
		],
		"resubmitCheckKey": "cpu_qtagree_edit_a9a8f063-9932-4b31-9931-92cc14327a64",
		"QuotaAgreeOrgVOList": [
			{
				"agreeId": "1966306440001880065",
				"ytenant": "0000LRVPV7SW7YSA3W0000",
				"checkSum": "8cc0e724e69ad46e725df2b8dde78970",
				"id": "1966306440001880067",
				"orgId": "1917641548524683269",
				"dr": 0,
				"hasDefaultInit": true
			}
		],
		"modifierName": "昵称-马鹤",
		"modifier": "5a0e3b26-1604-4989-8179-f2fe83c86298",
		"modifier_userName": "昵称-马鹤",
		"modifyTime": "2024-07-23 14:07:20",
		"tenant": "0000LRVPV7SW7YSA3W0000",
		"ytenant": "0000LRVPV7SW7YSA3W0000",
		"code": "PE20240403000001"
	},
	"traceId": "de680d4b42f38202"
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
999	message	按照提示处理

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2026-02-25	
更新
请求说明
新增
请求参数 (17)
更新
请求参数 (20)
删除
请求参数 maxPurNum
新增
返回参数 purchaseClassId

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

