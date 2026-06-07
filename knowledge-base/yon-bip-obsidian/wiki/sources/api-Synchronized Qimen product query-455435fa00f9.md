---
title: "已同步奇门商品查询"
apiId: "455435fa00f94cf09b2e72421767c6f1"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Qi Men Product Synchronization"
domain: "B2C"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Qi Men Product Synchronization]
platform_version: "BIP"
source_type: community-api-docs
---

# 已同步奇门商品查询

>  请求方式	POST | Qi Men Product Synchronization (B2C)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/dst/qm/queryItemInfos
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
partParam	object	否	是	查询条件
citemID	long	否	否	商品SKUID
isOfflineSale	string	否	否	是否线下销售商品(1是，0否)
wms_productCode	string	否	否	wms仓商品编码
pageIndex	int	否	是	每页数据行数 示例：1
pageSize	int	否	是	页码 示例：2
wmsSystem	string	否	否	wms系统
wms_ProductId	string	否	否	wms仓商品ID
productID	long	否	否	商品ID

## 3. 请求示例

Url: /yonbip/sd/dst/qm/queryItemInfos?access_token=访问令牌
Body: {
	"partParam": {
		"citemID": 0,
		"isOfflineSale": "",
		"wms_productCode": "",
		"pageIndex": 1,
		"pageSize": 2,
		"wmsSystem": "",
		"wms_ProductId": "",
		"productID": 0
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
code	long	否	code 示例：200
message	string	否	message 示例：操作成功
data	object	否	返回数据
pageIndex	long	否	页码 示例：1
pageSize	long	否	每页记录数 示例：2
totalCount	long	否	返回记录数 示例：2
info	object	是	返回具体数据

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 2,
		"totalCount": 2,
		"info": [
			{
				"skuName": "LJ测试商品005",
				"wmsSystem": "feifan百世仓",
				"wms_ProductId": "1406291672043776",
				"productCode": "liujie00005",
				"productID": 1406291672043776,
				"citemID": 1406291677352192,
				"isOfflineSale": 1,
				"productName": "LJ测试商品005",
				"skuCode": "liujie00005",
				"wms_productCode": "liujie00005",
				"status": 2
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
999	查询异常	联系开发人员

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-25	
更新
请求参数 (9)
更新
返回参数 (18)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

