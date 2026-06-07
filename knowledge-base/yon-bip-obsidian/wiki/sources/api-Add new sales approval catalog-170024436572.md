---
title: "新增允销目录"
apiId: "1700244365725138946"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Sales Collaboration"
domain: "SS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Sales Collaboration]
platform_version: "BIP"
source_type: community-api-docs
---

# 新增允销目录

>  请求方式	POST | Sales Collaboration (SS)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/cpu/ec/productPriceUpdate
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	批量保存/更新
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
ectype	string	否	是	电商来源 示例：xinfangsheng
customerCode	string	否	是	客户标识 示例：lcmy20211229v1
data	object	是	是	默认为批量修改，所以data部分为JSONArray，里面是商品价格的JSON
skuCode	string	否	是	商品SKU编号 示例：123456
customerCode	string	否	否	客户标识 示例：lcmy20211229v1
nakedPrice	double	否	是	无税价 示例：5.69
price	double	否	是	含税价 示例：6.66
taxRate	double	否	是	税率 示例：0.17
taxPrice	double	否	是	税价 示例：0.97

## 3. 请求示例

Url: /yonbip/cpu/ec/productPriceUpdate?access_token=访问令牌
Body: {
	"ectype": "xinfangsheng",
	"customerCode": "lcmy20211229v1",
	"data": [
		{
			"skuCode": "123456",
			"customerCode": "lcmy20211229v1",
			"nakedPrice": 5.69,
			"price": 6.66,
			"taxRate": 0.17,
			"taxPrice": 0.97
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
code	string	否	状态码 示例：200
message	string	否	提示信息 示例：成功插入或更新了1条数据
icaConfirmTime	DateTime	否	确认时间 示例：2022-09-26 00:00:00

## 5. 正确返回示例

{
	"code": "200",
	"message": "成功插入或更新了1条数据"
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
	1	2025-06-24	
更新
请求说明

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

