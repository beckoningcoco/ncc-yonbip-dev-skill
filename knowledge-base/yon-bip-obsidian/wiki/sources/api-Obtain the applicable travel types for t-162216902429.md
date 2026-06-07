---
title: "通过userId、staffId或staffCode获取该员工适用的出差类型"
apiId: "1622169024294027272"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Travel Type"
domain: "TIME"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Travel Type]
platform_version: "BIP"
source_type: community-api-docs
---

# 通过userId、staffId或staffCode获取该员工适用的出差类型

>  请求方式	GET | Travel Type (TIME)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/time/businessTrip/getBusinessTripType
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	MDD幂等
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
userId	string	query	否	用户userId（staffId、staffCode、userId三选一必填，有staffId时优先使用staffId）
staffId	string	query	否	员工id（staffId、staffCode、userId三选一必填，有staffId时优先使用staffId）
staffCode	string	query	否	员工编码（staffId、staffCode、userId三选一必填，有staffId时优先使用staffId）

## 3. 请求示例

Url: /yonbip/hrcloud/time/businessTrip/getBusinessTripType?access_token=访问令牌&userId=&staffId=&staffCode=

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
id	string	否	出差类型主键 示例：a10c4d73f1bc444482a02ded12c325b5
ts	long	否	时间戳 示例：1595832458000
es	long	否	是否支持 ElasticSearch，0=不支持，1=支持 示例：0
tenantid	string	否	租户id 示例：e1dpehzh
ytenantId	string	否	全局租户id 示例：e1dpehzh
mainid	string	否	该出差类型关联的出差规则主键 示例：4dfe521a309e475e8e402177af3492cc
refid	string	否	该出差类型引用的出差类型主键 示例：e1dpehzhtriptype00002
enablestate	string	否	默认1：启用 示例：1
isdefault	string	否	默认0：用户自定义 示例：0
name	string	否	出差类型名称 示例：外地出差
unit	string	否	计量单位 1：小时，2：天 示例：2
caltype	string	否	公休日结算方式 0：不计为出差，1：计为出差 示例：1
mintime	string	否	最小出差时间 1：0.5(小时/天)，2：1(小时/天) 示例：1
roundmode	string	否	取整方式 0: 向上取整，1: 向下取整，2: 四舍五入 示例：0
intersected	string	否	是否与工作日取交集 0: 不取交集 1:取交集 示例：1
typeOrder	int	否	在出差规则中的排序，默认0 示例：0

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"id": "a10c4d73f1bc444482a02ded12c325b5",
			"ts": 1595832458000,
			"es": 0,
			"tenantid": "e1dpehzh",
			"ytenantId": "e1dpehzh",
			"mainid": "4dfe521a309e475e8e402177af3492cc",
			"refid": "e1dpehzhtriptype00002",
			"enablestate": "1",
			"isdefault": "0",
			"name": "外地出差",
			"unit": "2",
			"caltype": "1",
			"mintime": "1",
			"roundmode": "0",
			"intersected": "1",
			"typeOrder": 0
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
500	获取出差类型失败	检查出差类型

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-03-18	
更新
请求说明
新增
请求参数 staffCode
更新
请求参数 userId
更新
请求参数 staffId

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

