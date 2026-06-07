---
title: "税目税率根据时间查询（废弃）"
apiId: "a8a36dc611784685a49563f2d68ed1d8"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Material Information"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Material Information]
platform_version: "BIP"
source_type: community-api-docs
---

# 税目税率根据时间查询（废弃）

>  请求方式	GET | Material Information (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/digitalModel/taxrate/findByTime
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
startTime	string	query	否	开始时间，格式为yyyy-MM-dd hh:mm:ss
endTime	string	query	否	结束时间，格式为yyyy-MM-dd hh:mm:ss

## 3. 请求示例

Url: /yonbip/digitalModel/taxrate/findByTime?access_token=访问令牌&startTime=&endTime=

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
code	long	否	返回编码 示例：200
message	string	否	返回消息 示例：操作成功
data	object	是	返回数据
id	string	否	主键 示例：2165271729394432
code	string	否	编号 示例：VAT13
name	string	否	名称 示例：13%
ntaxrate	long	否	税率 示例：13
taxfree	boolean	否	是否免税，true免税，false不免税 示例：false
notaxation	boolean	否	是否不征税，true不征税，false征税 示例：false
scope	long	否	范围，默认1全部 2 采购 示例：1
enable	long	否	启用状态，0初始化 1启用 2停用 示例：1
dr	long	否	删除状态，0未删除 1已删除 示例：0

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": [
		{
			"id": "2165271729394432",
			"code": "VAT13",
			"name": "13%",
			"ntaxrate": 13,
			"taxfree": false,
			"notaxation": false,
			"scope": 1,
			"enable": 1,
			"dr": 0
		}
	]
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
999	操作失败	

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

