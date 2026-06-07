---
title: "库存状态/预留调整审核"
apiId: "dc00ee1bfc6846faaff2fc04b021f7d9"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Adjustment Document"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Adjustment Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 库存状态/预留调整审核

>  请求方式	POST | Adjustment Document (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/scm/stockstatuschange/batchaudit
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	是	是	库存状态调整单
id	long	否	是	主表id 示例：1915883840213504

## 3. 请求示例

Url: /yonbip/scm/stockstatuschange/batchaudit?access_token=访问令牌
Body: {
	"data": [
		{
			"id": 1915883840213504
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
code	string	否	返回编码 示例：200
message	string	否	返回信息
data	object	否	返回数据
count	long	否	总数 示例：2
sucessCount	long	否	成功条数 示例：1
failCount	long	否	失败条数 示例：1
messages	object	是	返回信息数组（包含一些成功或失败的提示）
infos	object	是	成功信息
failInfos	object	是	失败信息集合

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"count": 2,
		"sucessCount": 1,
		"failCount": 1,
		"messages": [
			{}
		],
		"infos": [
			{
				"id": 2278566338843904,
				"auditor": "张三",
				"auditorId": 1855085258494208,
				"auditTime": "2020-09-15 11:03:27",
				"auditDate": "2020-09-15 00:00:00",
				"verifystate": 2,
				"status": 1,
				"goodChanges": [
					{
						"id": 0,
						"mainid": 0,
						"availableSubQty": 0,
						"currentqty": 0,
						"source": "",
						"subQty": 0,
						"outnoticeqty": 0,
						"innoticeqty": 0,
						"currentSubQty": 0,
						"pubts": "",
						"product": 0,
						"outStockStatusDoc": 0,
						"org": 0,
						"unitExchangeType": 0,
						"warehouse": 0,
						"outreserveid": 0,
						"inStockStatusDoc": 0,
						"unit": 0,
						"productsku": 0,
						"lineno": 0,
						"qty": 0,
						"availableqty": 0,
						"inreserveid": 0,
						"invExchRate": 0,
						"preretailqty": 0,
						"stockUnitId": 0,
						"warehouse_iSerialManage": true,
						"isSerialNoManage": true
					}
				],
				"pubts": "2020-09-15 11:03:27"
			}
		],
		"failInfos": [
			{
				"id": 2278566338843904,
				"message": "未找到id为 123 的单据，请重新确认"
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
999	服务端逻辑异常	联系技术人员

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

