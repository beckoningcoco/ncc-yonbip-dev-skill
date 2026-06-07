---
title: "获取租户下服务的购买状态"
apiId: "2284984663827546116"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Tenant Metering"
domain: "SYS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Tenant Metering]
platform_version: "BIP"
source_type: community-api-docs
---

# 获取租户下服务的购买状态

>  请求方式	GET | Tenant Metering (SYS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/digitalModel/iuap-apcom-workbench/manager/license/getCurrentByServiceCode
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
tenantId	string	query	是	租户id    示例: 0000LXSN26GB2LV4750000
code	string	query	是	服务编码    示例: ppm0000123371,ppm0000123370

## 3. 请求示例

Url: /yonbip/digitalModel/iuap-apcom-workbench/manager/license/getCurrentByServiceCode?access_token=访问令牌&tenantId=0000LXSN26GB2LV4750000&code=ppm0000123371%2Cppm0000123370

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
status	string	否	状态 示例：1
data	object	是	购买状态
displayCode	string	否	业务异常码 示例：000-545-100001
level	number
小数位数:0,最大长度:1	否	异常级别，0：错误，1：警告 示例：0

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"status": "1",
		"data": [
			{}
		],
		"displayCode": "000-545-100001",
		"level": 0
	}
}

## 6. 业务异常码

异常码	异常码信息	描述
000-555-411004
	参数异常	

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
999	服务端逻辑异常	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-07-02	
新增
返回参数 displayCode
新增
返回参数 level
新增
错误码 999

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

