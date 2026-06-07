---
title: "云采超市订单回写"
apiId: "21799894869c40f6b27823ea86eef0dc"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "youGo Supermarket"
domain: "SMK"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, youGo Supermarket]
platform_version: "BIP"
source_type: community-api-docs
---

# 云采超市订单回写

>  请求方式	POST | youGo Supermarket (SMK)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/cpu/yonbip-cpu-mall/openapi/writebackorder
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
yc_orderid	long	否	否	超市订单id,与yc_ordercode二选一必填,两个都传以id为准 示例：1000000031
yc_ordercode	string	否	否	订单号，与yc_orderid二选一必填 示例：20230428140001
erp_orderid	string	否	否	外系统订单id 示例：12312
erp_orderCode	string	否	否	外系统订单编码 示例：t2222222
push_erp	long	否	否	是否需要推送erp(0表示不需要，1表示需要，不传默认不修改) 示例：1
bodys	object	是	否	订单明细
yc_orderDetailId	long	否	是	超市订单明细id 示例：1233333333
erp_orderDetailId	string	否	否	外系统订单明细id 示例：4421321
erp_orderDetailCode	string	否	否	外系统订单明细编码 示例：m123213

## 3. 请求示例

Url: /yonbip/cpu/yonbip-cpu-mall/openapi/writebackorder?access_token=访问令牌
Body: {
	"yc_orderid": 1000000031,
	"yc_ordercode": "20230428140001",
	"erp_orderid": "12312",
	"erp_orderCode": "t2222222",
	"push_erp": 1,
	"bodys": [
		{
			"yc_orderDetailId": 1233333333,
			"erp_orderDetailId": "4421321",
			"erp_orderDetailCode": "m123213"
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
code	string	否	响应码 示例：200
message	string	否	执行结果 示例：操作成功
data	object	否	其他数据（包含失败原因）

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {}
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
999	订单不存在或参数异常	检查传入的参数

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-24	
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

