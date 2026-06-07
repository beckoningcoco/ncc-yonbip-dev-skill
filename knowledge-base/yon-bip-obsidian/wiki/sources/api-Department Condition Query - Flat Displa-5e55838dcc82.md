---
title: "部门条件查询-平铺展示"
apiId: "5e55838dcc824f2e82bccda6e7a81644"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Department"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Department]
platform_version: "BIP"
source_type: community-api-docs
---

# 部门条件查询-平铺展示

>  请求方式	POST | Department (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/digitalModel/basedoc/dept/list
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
data	object	否	是	业务数据
code	string	是	否	编码 示例：["Q1","Q2"]
pubts	string	是	否	时间戳，查询结果大于等于时间戳数据 示例：2020-08-29 03:39:14 示例：["2021-01-07 15:33:14"]

## 3. 请求示例

Url: /yonbip/digitalModel/basedoc/dept/list?access_token=访问令牌
Body: {
	"data": {
		"code": [
			"Q1",
			"Q2"
		],
		"pubts": [
			"2021-01-07 15:33:14"
		]
	}
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
code	long	否	状态码 示例：200
message	string	否	返回消息 示例：操作成功
data	object	是	业务数据
orgtype	int	否	组织类型，1组织 2部门
code	string	否	编码
sysid	string	否	系统标识
displayorder	int	否	排序
parentid	string	否	上级节点主键
dr	int	否	删除标识，0未删除 1已删除
parentCode	string	否	上级节点编码
parentorgid	string	否	所属组织主键
enable	long	否	启用状态，0初始化 1启用 2停用
is_biz_unit	int	否	是否为业务单元，0否 1是
tenantid	string	否	租户标识
name	string	否	名称
id	string	否	主键ID
pubts	string	否	时间戳，格式yyyy-MM-dd HH:mm:ss
displayCode	string	否	业务异常码 示例：000-545-100001
level	number
小数位数:0,最大长度:1	否	异常级别，0：错误，1：警告 示例：0

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": [
		{
			"orgtype": 0,
			"code": "",
			"sysid": "",
			"displayorder": 0,
			"parentid": "",
			"dr": 0,
			"parentCode": "",
			"parentorgid": "",
			"enable": 0,
			"is_biz_unit": 0,
			"tenantid": "",
			"name": "",
			"id": "",
			"pubts": ""
		}
	],
	"displayCode": "000-545-100001",
	"level": 0
}

## 6. 业务异常码

异常码	异常码信息	描述
000-545-000512
	查询数据为空	

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
999	操作失败	

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

