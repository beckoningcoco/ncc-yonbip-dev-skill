---
title: "询价单列表查询"
apiId: "1878898555523432449"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "RFQ"
domain: "STC"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, RFQ]
platform_version: "BIP"
source_type: community-api-docs
---

# 询价单列表查询

>  请求方式	POST | RFQ (STC)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/cpu/buyoffer/blist
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
pageSize	string	否	否	一页大小    示例：10    默认值：500 默认值：500
pageNum	string	否	否	当前页数    示例：1    默认值：1 默认值：1
isSum	string	否	否	是否查询表头 示例：false 默认值：true（注：当值为true时，返回结果中不包含物料子表的信息；当值为false时，返回结果中包含物料子表的信息） 默认值：true
pubts	string	否	否	时间戳 示例：2021-05-06 23:10:00|2021-05-08 12:09:00
puOrgDocId	string	是	否	采购组织id 示例：["1241241"]
puOrgDocCode	string	是	否	采购组织编码 示例：["puorg01"]
status	string	否	否	状态（1：接收报价中，13：未发布，17：审批中，100：审批通过，18：已推荐供应商，15：已定标，20：已流标，21：已下单，22：已开标，23：谈判已保存，24：已推合同，25：询价终止，26：终止谈判，28：已作废，35：谈判已发布，36：谈判详情已发布） 示例：1
submitTime	string	否	否	提交时间 示例：2021-05-06 23:10:00|2021-05-08 12:09:00
auditTime	string	否	否	审批时间 示例：2021-05-06 23:10:00|2021-05-08 12:09:00
createTime	string	否	否	创建时间 示例：2021-05-06 23:10:00|2021-05-08 12:09:00
modifyTime	string	否	否	修改时间 示例：2021-05-06 23:10:00|2021-05-08 12:09:00
transactionTypeId	string	否	否	交易类型id 示例：124124124
transactionTypeCode	string	否	否	交易类型编码 示例：tt01
impleVOs	object	是	否	查询条件
field	string	否	否	查询字段（条件） 示例：code
op	string	否	否	比较符(eq;gt;lt;ge;le;等等) 示例：eq
value1	string	否	否	条件值1   示例：CGA20005000456

## 3. 请求示例

Url: /yonbip/cpu/buyoffer/blist?access_token=访问令牌
Body: {
	"pageSize": "",
	"pageNum": "",
	"isSum": "",
	"pubts": "2021-05-06 23:10:00|2021-05-08 12:09:00",
	"puOrgDocId": [
		"1241241"
	],
	"puOrgDocCode": [
		"puorg01"
	],
	"status": "1",
	"submitTime": "2021-05-06 23:10:00|2021-05-08 12:09:00",
	"auditTime": "2021-05-06 23:10:00|2021-05-08 12:09:00",
	"createTime": "2021-05-06 23:10:00|2021-05-08 12:09:00",
	"modifyTime": "2021-05-06 23:10:00|2021-05-08 12:09:00",
	"transactionTypeId": "124124124",
	"transactionTypeCode": "tt01",
	"impleVOs": [
		{
			"field": "",
			"op": "",
			"value1": ""
		}
	]
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
code	string	否	状态码
data	object	是	返回数据集合
pageCount	int	否	总页数
pageIndex	int	否	当前页码
recordCount	int	否	结果总数
pageSize	int	否	页面大小
endPageIndex	int	否	最后页码
beginPageIndex	int	否	开始页码
recordList	object	是	询价单列表

## 5. 正确返回示例

{
	"code": "",
	"data": [
		{
			"pageCount": 0,
			"pageIndex": 0,
			"recordCount": 0,
			"pageSize": 0,
			"endPageIndex": 0,
			"beginPageIndex": 0,
			"recordList": [
				{
					"id": 0,
					"vbuyofferBillcode": "",
					"subject": "",
					"puorgDocId": "",
					"puorgDocCode": "",
					"puorgDocName": "",
					"createTime": "",
					"purchaseCode": "",
					"purchaseId": "",
					"purchaseId_name": "",
					"buyofferType": "",
					"transactionTypeName": "",
					"status": "",
					"recordList_product": [
						{
							"material_code": "",
							"productId": "",
							"productCode": "",
							"material_desc": "",
							"productSpec": "",
							"productType": "",
							"mainNum": "",
							"purchaseNum": "",
							"quotaNum": "",
							"mainUnitId": "",
							"mainUnitCode": "",
							"mainUnitName": "",
							"unitId": "",
							"unitCode": "",
							"unit": "",
							"purchaseUnitName": "",
							"purchaseUnitCode": "",
							"purchaseUnitId": "",
							"invPriceExchRate": 0,
							"invPurExchRate": "",
							"reqOrgCode": "",
							"reqOrgId": "",
							"reqOrgName": "",
							"receiveOrgId": "",
							"receiveOrgName": "",
							"reqdeptId": "",
							"reqdeptName": "",
							"currencyCodeDiwork": "",
							"currencyName": "",
							"currencyTypeSignDiwork": "",
							"pritemid": ""
						}
					]
				}
			]
		}
	]
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

