---
title: "里程控制规则新增控制范围"
apiId: "2144596416538869765"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Mileage Control"
domain: "ZNBZ"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Mileage Control]
platform_version: "BIP"
source_type: community-api-docs
---

# 里程控制规则新增控制范围

>  请求方式	POST | Mileage Control (ZNBZ)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/znbz/yonbip-fi-expsrbsm/api/bill/mileagecontrol/addMileageControlPartScope
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	MDD幂等
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
pk_mileagecontrol	string	否	是	里程控制规则主表主键
controlobj	number
小数位数:0,最大长度:1	否	是	控制对象,默认值:[0:员工] 示例：0
dbegindate	date
格式:yyyy-MM-dd	否	否	有效期从 示例：2024-11-29
denddate	date
格式:yyyy-MM-dd	否	否	有效期到 示例：2024-11-30
scopevos	object	是	否	人员范围
scope	string	否	否	员工信息id 示例：1971540690850545673

## 3. 请求示例

Url: /yonbip/znbz/yonbip-fi-expsrbsm/api/bill/mileagecontrol/addMileageControlPartScope?access_token=访问令牌
Body: [{
	"pk_mileagecontrol": "",
	"controlobj": 0,
	"dbegindate": "2024-11-29",
	"denddate": "2024-11-30",
	"scopevos": [
		{
			"scope": "1971540690850545673"
		}
	]
}]

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
displayCode	string	否	异常码
code	string	否	返回编码 示例：200
message	string	否	返回信息 示例：操作成功
data	object	否	返回数据

## 5. 正确返回示例

{
	"displayCode": "",
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
999	插入失败	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-07-11	
新增
返回参数 displayCode

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

