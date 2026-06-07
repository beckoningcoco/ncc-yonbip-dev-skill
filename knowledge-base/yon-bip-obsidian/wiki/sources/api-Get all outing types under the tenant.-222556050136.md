---
title: "获取租户下所有的外出类型"
apiId: "2225560501363933184"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Out-of-Office Type"
domain: "TIME"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Out-of-Office Type]
platform_version: "BIP"
source_type: community-api-docs
---

# 获取租户下所有的外出类型

>  请求方式	GET | Out-of-Office Type (TIME)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/time/outTrip/getOutTypeByTenant
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	MDD幂等
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
language	string	query	否	多语参数zh_CN,zh_TW,en_US.错误或空参数系统默认租户默认语言    示例: zh_CN    默认值: zh_CN

## 3. 请求示例

Url: /yonbip/hrcloud/time/outTrip/getOutTypeByTenant?access_token=访问令牌&language=zh_CN

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
message	string	否	返回信息 示例：操作成功
data	object	是	返回结果集
id	string	否	外出类型主键 示例：a10c4d73f1bc444482a02ded12c325b5
ts	string	否	记录创建的时间戳 示例：1595832458000
creationtime	string	否	创建时间 示例：1595832458000
creator	string	否	创建人 示例：f322bb55-d693-46eb-ab4c-6868fa2c1bad
tenantid	string	否	租户id 示例：e1dpehzh
ytenantId	string	否	租户id 示例：wvcxfph6
mainid	string	否	该外出类型关联的外出规则主键 示例：4dfe521a309e475e8e402177af3492cc
refid	string	否	该外出类型引用的外出类型主键 示例：e1dpehzhtriptype00002
enablestate	string	否	0=停用，1=启用 示例：1
isdefault	string	否	默认返回0:用户自定义 示例：0
name	string	否	外出类型名称 示例：本地外出
unit	string	否	计量单位, 1:小时,2:天 示例：2
caltype	string	否	公休日结算方式 0：不计为外出，1：计为外出 示例：1
mintime	string	否	最小外出时间 1:小时,2:天 示例：1
roundmode	string	否	取整方式 0: 向上取整，1: 向下取整，2: 四舍五入 示例：0
typeOrder	string	否	排序 示例：0
intersected	string	否	是否与工作日取交集 0: 不取交集 1:取交集 示例：1

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"id": "a10c4d73f1bc444482a02ded12c325b5",
			"ts": "1595832458000",
			"creationtime": "1595832458000",
			"creator": "f322bb55-d693-46eb-ab4c-6868fa2c1bad",
			"tenantid": "e1dpehzh",
			"ytenantId": "wvcxfph6",
			"mainid": "4dfe521a309e475e8e402177af3492cc",
			"refid": "e1dpehzhtriptype00002",
			"enablestate": "1",
			"isdefault": "0",
			"name": "本地外出",
			"unit": "2",
			"caltype": "1",
			"mintime": "1",
			"roundmode": "0",
			"typeOrder": "0",
			"intersected": "1"
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
500	获取外出类型失败！	检查外出类型

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

