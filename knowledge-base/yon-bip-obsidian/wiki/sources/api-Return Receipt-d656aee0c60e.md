---
title: "退货入库"
apiId: "d656aee0c60e4e75a337c0cefe0445df"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Return & Exchange Document"
domain: "B2C"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Return & Exchange Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 退货入库

>  请求方式	POST | Return & Exchange Document (B2C)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/dst/refund/inbound
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
id	string	否	是	退换货单id(单张)
ts	string	否	是	退换货单时间戳
stocks	object	是	是	扩展信息 传入表体 id-入库数量的 map
refundDetailId	string	否	是	退换货单行id
inboundQty	BigDecimal	否	是	入库数量
stocksInfo	object	是	否	扩展信息 支持序列号,货位号以及批次号修改
iWarehouseId	long	否	否	仓库id
warehouseCode	string	否	否	【仓库编码】与【iWarehouseId】 必选其一传递
itemid	long	否	否	商品skuid
skuCode	string	否	否	【SKU编码】 与【itemid】 必选其一传递
refundDetailId	string	否	否	退换货单行id
inboundQty	BigDecimal	否	否	入库数量
sn	string	否	否	序列号
sBatchNo	string	否	否	批次号
location	long	否	否	货位id
locationCode	string	否	否	货位编码(location与locationCode二选一)
produceDate	string	否	否	生产日期
invalidDate	string	否	否	失效日期
stockStatusCode	string	否	否	库存状态编码
stockStatusId	long	否	否	库存状态id
inboundTime	string	否	否	入库时间

## 3. 请求示例

Url: /yonbip/sd/dst/refund/inbound?access_token=访问令牌
Body: {
	"id": "",
	"ts": "",
	"stocks": [
		{
			"refundDetailId": "",
			"inboundQty": 0
		}
	],
	"stocksInfo": [
		{
			"iWarehouseId": 0,
			"warehouseCode": "",
			"itemid": 0,
			"skuCode": "",
			"refundDetailId": "",
			"inboundQty": 0,
			"sn": "",
			"sBatchNo": "",
			"location": 0,
			"locationCode": "",
			"produceDate": "",
			"invalidDate": "",
			"stockStatusCode": "",
			"stockStatusId": 0
		}
	],
	"inboundTime": ""
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
code	int	否	是否调用成功 示例：200：成功
message	string	否	返回提示信息
data	object	否	返回操作结果
code	string	否	返回类型
isShowMsg	boolean	否	是否在客户端显示消息
failCount	string	否	失败数
id	string	否	退换货单 ID
ts	string	否	退换货单时间戳
successCount	string	否	成功数
isExcuteAction	boolean	否	是否执行了action
actionName	string	否	动作名字

## 5. 正确返回示例

{
	"code": NaN,
	"message": "",
	"data": {
		"code": "",
		"isShowMsg": true,
		"failCount": "",
		"id": "",
		"ts": "",
		"successCount": "",
		"isExcuteAction": true,
		"actionName": ""
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
999	单据的入库状态不是未入库，不能做入库操作	请检查入参

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

