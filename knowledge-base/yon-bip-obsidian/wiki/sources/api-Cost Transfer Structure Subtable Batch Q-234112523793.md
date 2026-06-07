---
title: "成本结转结构子表批量查询"
apiId: "2341125237934915588"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Cost Carry-forward Structure"
domain: "AMP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Cost Carry-forward Structure]
platform_version: "BIP"
source_type: community-api-docs
---

# 成本结转结构子表批量查询

>  请求方式	POST | Cost Carry-forward Structure (AMP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/FCC/costcarrylines/bill/list
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
pageSize	number
小数位数:0,最大长度:10	否	否	pageSize 示例：20 默认值：20
pageIndex	number
小数位数:0,最大长度:10	否	否	pageIndex 示例：1 默认值：1
simple	object	否	否	simpleVOs
id	string	否	否	主表ID
costCarryLines.id	string	否	否	明细ID
code	string	否	否	code 示例：code1
locale	string	否	否	locale 示例：zh_CN 默认值：zh_CN

## 3. 请求示例

Url: /yonbip/FCC/costcarrylines/bill/list?access_token=访问令牌
Body: {
	"pageSize": 20,
	"pageIndex": 1,
	"simple": {
		"id": "",
		"costCarryLines.id": "",
		"code": "code1"
	},
	"locale": "zh_CN"
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
pageCount	number
小数位数:0,最大长度:10	否	pageCount 示例：1
recordCount	number
小数位数:0,最大长度:10	否	recordCount 示例：1
pageSize	number
小数位数:0,最大长度:10	否	pageSize 示例：20
pageIndex	number
小数位数:0,最大长度:10	否	pageIndex 示例：1
beginPageIndex	number
小数位数:0,最大长度:10	否	beginPageIndex 示例：1
endPageIndex	number
小数位数:0,最大长度:10	否	endPageIndex 示例：1
recordList	object	是	recordList
traceId	string	否	traceId 示例：8beb7ef91592d389
uploadable	string	否	uploadable 示例：0

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"pageCount": 1,
		"recordCount": 1,
		"pageSize": 20,
		"pageIndex": 1,
		"beginPageIndex": 1,
		"endPageIndex": 1,
		"recordList": [
			{
				"id": "1526276921384501257",
				"costCarryLines_id": "2049616229758926856",
				"code": "JZJG-ZHJM-009",
				"name": "结转结构测试01",
				"subjectId": "1526225313130348545",
				"subjectId_name": "专项专用科目表",
				"factorId": "1526225313130348545",
				"factorName": "专项专用要素表",
				"structurePurpose": "CostSettlement",
				"settleMode": "detailSettle",
				"orderCategory": "XMOrder",
				"costCarryLines_elementFromId": "1806179450521911300",
				"costCarryLines_elementFromId_code": "1020",
				"costCarryLines_elementFromId_name": "1020多了个科目",
				"costCarryLines_elementToId": "1806179072564789259",
				"costCarryLines_elementToId_code": "510102",
				"costCarryLines_elementToId_name": "制造费用_职工福利费",
				"costCarryLines_carryForwardObjectType": "OBJECT_TYPE_SPECIAL_ORDER",
				"costCarryLines_carryForwardType": "DetOutAndIn",
				"costCarryLines_orderTypeId": "1525583395935486097",
				"costCarryLines_orderTypeId_name": "标准生产",
				"costCarryLines_costCenterClassId": "1525643714430500911",
				"costCarryLines_costCenterClassId_name": "基本生产",
				"createTime": "2022-08-19 00:00:00",
				"modifierId": "1525641755939569667",
				"modifyTime": "2025-08-20 17:44:12",
				"modifierId_name": "u8c_vip管理员",
				"pubts": "2025-08-20 17:44:12"
			}
		]
	},
	"traceId": "8beb7ef91592d389",
	"uploadable": "0"
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
暂时没有数据哦~

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

