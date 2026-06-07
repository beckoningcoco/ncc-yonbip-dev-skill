---
title: "保存函数信息"
apiId: "2134239695615819779"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "HR Business Rule"
domain: "HRCS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, HR Business Rule]
platform_version: "BIP"
source_type: community-api-docs
---

# 保存函数信息

>  请求方式	POST | HR Business Rule (HRCS)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/hrcloud/bizrule/openApi/ruleFunctionSave
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
data	object	是	否	函数列表
implType	string	否	否	实现类型 示例：2
creator	string	否	否	creator 示例：99ea7655-00a2-4bda-b23c-19ade37ea574
code	string	否	否	函数编码 示例：0910003
enablets	string	否	否	enablets 示例：2024-09-10 09:58:21
productId	string	否	否	产品id 示例：HRED
level	string	否	否	函数等级 示例：2
ytenant	string	否	否	ytenant 示例：0000L6YQ8AVLFUZPXD0000
returnDataType	string	否	否	返回值类型 示例：1
fullName	string	否	否	类全称 示例：hrcb.rule_function.RuleFunction
description	object	否	否	描述信息
hasValue	number
小数位数:0,最大长度:10	否	否	是否有返回值 示例：2
dr	number
小数位数:0,最大长度:10	否	否	dr 示例：0
createTime	string	否	否	createTime 示例：2024-09-10 09:50:05
enable	string	否	否	enable 示例：1
distributionSite	string	否	否	站点id 示例：123456
name	object	否	否	函数名称
id	string	否	否	id 示例：2085060636351922180
category	string	否	否	函数分类 示例：4
pubts	string	否	否	pubts 示例：2024-11-13 22:44:23
tenant	string	否	否	tenant 示例：0000L6YQ8AVLFUZPXD0000
arguments	object	是	否	函数参数
_convert_arguments	string	否	否	_convert_arguments 示例：ok
content	object	否	否	函数内容
_convert_content	string	否	否	_convert_content 示例：ok

## 3. 请求示例

Url: /yonbip/hrcloud/bizrule/openApi/ruleFunctionSave?access_token=访问令牌
Body: {
	"data": [
		{
			"implType": "2",
			"creator": "99ea7655-00a2-4bda-b23c-19ade37ea574",
			"code": "0910003",
			"enablets": "2024-09-10 09:58:21",
			"productId": "HRED",
			"level": "2",
			"ytenant": "0000L6YQ8AVLFUZPXD0000",
			"returnDataType": "1",
			"fullName": "hrcb.rule_function.RuleFunction",
			"description": {},
			"hasValue": 2,
			"dr": 0,
			"createTime": "2024-09-10 09:50:05",
			"enable": "1",
			"distributionSite": "123456",
			"name": {
				"zh_CN": "【测试自定义聚合】查询字段"
			},
			"id": "2085060636351922180",
			"category": "4",
			"pubts": "2024-11-13 22:44:23",
			"tenant": "0000L6YQ8AVLFUZPXD0000",
			"arguments": [
				{
					"code": "param0",
					"ytenant": "0000L6YQ8AVLFUZPXD0000",
					"dataType": "11",
					"required": 0,
					"dr": 0,
					"sequence": 0,
					"functionId": "2085060636351922180",
					"enable": "0",
					"name": "查询字段",
					"supportMulti": 0,
					"id": "2085060636351922181",
					"pubts": "2024-09-10 09:50:05",
					"tenant": "0000L6YQ8AVLFUZPXD0000"
				}
			],
			"_convert_arguments": "ok",
			"content": {
				"ytenant": "0000L6YQ8AVLFUZPXD0000",
				"enable": "0",
				"id": "2085060636351922180",
				"pubts": "2024-09-10 09:50:05",
				"content": "1",
				"dr": 0,
				"tenant": "0000L6YQ8AVLFUZPXD0000"
			},
			"_convert_content": "ok"
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
code	number
小数位数:0,最大长度:10	否	状态码 示例：200
message	string	否	提示信息 示例：操作成功
traceId	string	否	traceId 示例：057e5ebe062762f3
uploadable	string	否	uploadable 示例：0

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"traceId": "057e5ebe062762f3",
	"uploadable": "0"
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
暂时没有数据哦~

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

