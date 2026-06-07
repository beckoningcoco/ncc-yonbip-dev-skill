---
title: "每日金价详情查询"
apiId: "1437286599232585728"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Daily Gold Price"
domain: "RetailServer"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Daily Gold Price]
platform_version: "BIP"
source_type: community-api-docs
---

# 每日金价详情查询

>  请求方式	GET | Daily Gold Price (RetailServer)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/uretail/aurumprice/detail
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	string	query	否	单据id(id和code 二选一必填 ；id，code同时输入以id为准)    示例: 1331296066523392
code	string	query	否	单据编号(id和code 二选一必填 ；id，code同时输入以id为准)    示例: MRJJ20220421000001

## 3. 请求示例

Url: /yonbip/sd/uretail/aurumprice/detail?access_token=访问令牌&id=1331296066523392&code=MRJJ20220421000001

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
code	string	否	状态码 示例：200
message	string	否	状态消息 示例：操作成功
data	object	否	数据节点
creator	string	否	创建人 示例：fhddzh@126.com
code	string	否	单据号 示例：MRJJ20220421000001
aurumPriceDetail	object	是	明细数据集合
vouchdate	DateTime	否	单据日期 示例：2022-04-21 00:00:00
aurumPriceStore	object	是	分配门店集合
createTime	DateTime	否	创建时间 示例：2022-04-21 11:05:03
id	long	否	头id 示例：2741212017775360
pubts	DateTime	否	时间戳 示例：2022-04-21 11:05:03
status	long	否	审批状态(0:未审批1:已审批) 示例：0
createDate	DateTime	否	创建日期 示例：2022-04-21 00:00:00

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"creator": "fhddzh@126.com",
		"code": "MRJJ20220421000001",
		"aurumPriceDetail": [
			{
				"fBrandPrice": 200,
				"cPriceDimension": 1,
				"cAurumType": 2741211303809792,
				"fRecoveryAurum": 100,
				"cRealAurumType": 1,
				"cAurumType_name": "白金",
				"iRecoveryLossRate": 10,
				"id": 2741212017775361,
				"pubts": "2022-04-21 11:05:03",
				"iAurumPriceid": 2741212017775360
			}
		],
		"vouchdate": "2022-04-21 00:00:00",
		"aurumPriceStore": [
			{
				"org": "2728431692337408",
				"iStoreid": 2734362348622080,
				"iStoreid_name": "SOSO直营店-万科店",
				"id": 2741212017775362,
				"iStoreid_codebianma": "001",
				"iStoreid_org_name": "总公司",
				"pubts": "2022-04-21 11:05:03",
				"iAurumPriceid": 2741212017775360
			}
		],
		"createTime": "2022-04-21 11:05:03",
		"id": 2741212017775360,
		"pubts": "2022-04-21 11:05:03",
		"status": 0,
		"createDate": "2022-04-21 00:00:00"
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
暂时没有数据哦~

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-25	
更新
返回参数 (31)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

