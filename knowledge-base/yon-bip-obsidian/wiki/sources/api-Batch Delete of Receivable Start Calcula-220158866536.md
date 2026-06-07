---
title: "收款起算批量删除-新集成"
apiId: "2201588665360056328"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Collection Start Date"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Collection Start Date]
platform_version: "BIP"
source_type: community-api-docs
---

# 收款起算批量删除-新集成

>  请求方式	POST | Collection Start Date (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/digitalModel/basedoc/async/receivestartbase/batchDelete
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
data	object	是	否	请求体
sourceUnique	string	否	是	源系统唯一标识 示例：2217322771360776203
id	string	否	否	档案ID。与档案编码二选一输入，全传入以档案ID为准。 示例：2217322771360776203
code	string	否	否	档案编码 示例：code01

## 3. 请求示例

Url: /yonbip/digitalModel/basedoc/async/receivestartbase/batchDelete?access_token=访问令牌
Body: {
	"data": [
		{
			"sourceUnique": "2217322771360776203",
			"id": "2217322771360776203",
			"code": "code01"
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
code	string	否	返回码，调用成功是返回200 示例：200
message	string	否	提示信息 示例：异步执行中，请调用结果查询接口查询执行结果
data	object	否	响应数据
jobId	string	否	任务ID，用于查询异步任务执行结果，具体请调用【汇率批量删除结果查询】接口查询结果 示例：2217253570730524676
displayCode	string	否	业务异常码 示例：000-525-000066
level	number
小数位数:0,最大长度:1	否	异常级别，0：错误，1：警告 示例：0

## 5. 正确返回示例

{
	"code": "200",
	"message": "异步执行中，请调用结果查询接口查询执行结果",
	"data": {
		"jobId": "2217253570730524676"
	},
	"displayCode": "000-525-000066",
	"level": 0
}

## 6. 业务异常码

异常码	异常码信息	描述
000-525-000066
	传入的数据列表为空或存在空对象，请检查代码	

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
暂时没有数据哦~

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-07-29	
新增
返回参数 displayCode
新增
返回参数 level
收款起算批量删除

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

