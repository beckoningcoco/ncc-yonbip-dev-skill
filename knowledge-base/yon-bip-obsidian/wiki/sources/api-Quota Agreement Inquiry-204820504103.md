---
title: "配额协议查询"
apiId: "2048205041037213703"
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

# 配额协议查询

>  请求方式	POST | Quota Agreement (PCS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/cpu/qtAgreeList/bill/list
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
orgH	string	否	否	所属组织
businessTypeH	string	否	否	业务场景，1：采购订单，3：委外申请订单
schemeNameH	string	否	否	配额协议名称
codeH	string	否	否	配额协议编码
productIdH	string	否	否	物料Id
applicableOrgH	string	否	否	适用组织
enableH	string	否	否	启用停用状态，1：启用，0：停用 示例：1 默认值：1
statusH	string	否	否	状态，0：开立，1：已审核，3：审核中 示例：0
open_effectiveDateH_begin	string	否	否	有效起始日期开始 示例：2024-07-01
open_effectiveDateH_end	string	否	否	有效起始日期截至 示例：2024-07-01
open_expiryDateH_begin	string	否	否	有效截至日期开始 示例：2024-07-01
open_expiryDateH_end	string	否	否	有效截至日期截至 示例：2024-07-01
pageIndex	number
小数位数:0,最大长度:5	否	否	当前页索引 默认值：1
pageSize	number
小数位数:0,最大长度:4	否	否	页大小 默认值：10
createTime_begin	date
格式:yyyy-MM-dd HH:mm:ss	否	否	创建时间

## 3. 请求示例

Url: /yonbip/cpu/qtAgreeList/bill/list?access_token=访问令牌
Body: {
	"orgH": "",
	"businessTypeH": "",
	"schemeNameH": "",
	"codeH": "",
	"productIdH": "",
	"applicableOrgH": "",
	"enableH": "1",
	"statusH": "0",
	"open_effectiveDateH_begin": "2024-07-01",
	"open_effectiveDateH_end": "2024-07-01",
	"open_expiryDateH_begin": "2024-07-01",
	"open_expiryDateH_end": "2024-07-01",
	"pageIndex": 0,
	"pageSize": 0,
	"createTime_begin": "2026-06-07 13:06:51"
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
yTenantId	string	否	租户id 示例：u1ddi6qy
pageIndex	number
小数位数:0,最大长度:10	否	pageIndex 示例：1
pageSize	number
小数位数:0,最大长度:10	否	pageSize 示例：10
recordCount	number
小数位数:0,最大长度:10	否	recordCount 示例：5000
recordList	object	是	recordList
pageCount	number
小数位数:0,最大长度:10	否	pageCount 示例：0
beginPageIndex	number
小数位数:0,最大长度:10	否	beginPageIndex 示例：1
endPageIndex	number
小数位数:0,最大长度:10	否	endPageIndex 示例：5

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"yTenantId": "u1ddi6qy",
		"pageIndex": 1,
		"pageSize": 10,
		"recordCount": 5000,
		"recordList": [
			{
				"id": "1966306440001880065",
				"verifystate": 4,
				"name": "0403测试按钮",
				"code": "PE20240403000001",
				"agreeTemplateId": "",
				"agreeTemplateCode": "",
				"agreeTemplateName": "",
				"supplyDocId_name": "集成测试供应商9182",
				"supplyDocId": "1918810655810387971",
				"subid": "1966306440001880066",
				"vouchdate": "2024-04-03 00:00:00",
				"enable": "1",
				"quota": 6,
				"pubts": "2024-04-03 09:36:52",
				"subenable": "1",
				"isWfControlled": true,
				"materialId": "1918117173215625225",
				"materialCode": "Y16030986",
				"materialName": "0-0.16压力表",
				"effectStartDate": "2024-04-03 00:00:00",
				"effectEndDate": "",
				"createTime": "2024-04-03 09:36:37",
				"creator_name": "昵称-马鹤",
				"businessType": "2",
				"status": 0,
				"quotaAgreeChmId": {
					"ytenant": "0000LRVPV7SW7YSA3W0000",
					"id": "1966306440001880068",
					"pubts": "2024-04-03 09:36:37",
					"dr": 0
				},
				"purchaseClassId": "",
				"purchaseClassId_name": "",
				"purchaseClassId_code": "",
				"manageClassCode": "",
				"manageClassName": "",
				"manageClassId": "",
				"execNum": 0,
				"quotaAgreeChdId": {
					"ytenant": "",
					"id": "",
					"pubts": "",
					"dr": 0
				},
				"quotaAdjustNum": 0,
				"totalMaxOrderNum": 0,
				"execMoney": 0,
				"quotaAdjustMoney": 0,
				"totalMaxOrderMoney": 0,
				"actualQuota": 0,
				"controlMethod": "",
				"overControl": "",
				"exchRateType": "",
				"exchRateTypeCode": "",
				"exchRateTypeName": "",
				"currency": "",
				"currency_name": ""
			}
		],
		"pageCount": 0,
		"beginPageIndex": 1,
		"endPageIndex": 5
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
999	message	按照提示处理

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2026-01-29	
新增
返回参数 (28)
更新
返回参数 effectEndDate

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

