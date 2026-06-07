---
title: "工作地点档案批量新增更新_全球化_上传下发"
apiId: "2069712278777233408"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Certificate Application"
domain: "CHR"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Certificate Application]
platform_version: "BIP"
source_type: community-api-docs
---

# 工作地点档案批量新增更新_全球化_上传下发

>  请求方式	POST | Certificate Application (CHR)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/hrcloud/contract/batchSaveOrUpdatelocal
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
data	object	是	否	data
country	string	否	否	country 示例：0040be98-735b-44c0-afe5-54d11a96037b
parent	string	否	否	parent
code	string	否	否	code 示例：5
timezone	string	否	否	timezone 示例：Africa/Abidjan
modifier	string	否	否	modifier 示例：昵称-人力测试管理员
creatorId	number
小数位数:0,最大长度:19	否	否	creatorId 示例：2136412528175480800
modifierId	number
小数位数:0,最大长度:19	否	否	modifierId 示例：2136412528175480800
memo	string	否	否	memo 示例：5
LocationScopeOrg	object	是	否	LocationScopeOrg
path	string	否	否	path 示例：2143255459046359049|
modifyTime	string	否	否	modifyTime 示例：2024-11-27 20:47:15
isDeleted	number
小数位数:0,最大长度:10	否	否	isDeleted 示例：0
enable	number
小数位数:0,最大长度:10	否	否	状态 示例：1
id	string	否	否	id 示例：2143255459046359049
pubts	string	否	否	时间戳 示例：2024-11-27 20:47:15
tenant	string	否	否	租户ID 示例：0000M3MN5ZJM5YP8940000
createDate	string	否	否	createDate 示例：2024-11-27 19:42:54
creator	string	否	否	creator 示例：昵称-人力测试管理员
address	string	否	否	address 示例：5
enablets	string	否	否	enablets 示例：2024-11-27 19:42:54
modifyDate	string	否	否	modifyDate 示例：2024-11-27 20:47:15
level	number
小数位数:0,最大长度:10	否	否	level 示例：1
ytenant	string	否	否	ytenant 示例：0000M3MN5ZJM5YP8940000
isEnd	boolean	否	否	isEnd 示例：true
createTime	string	否	否	createTime 示例：2024-11-27 19:42:54
name	string	否	否	name 示例：5

## 3. 请求示例

Url: /yonbip/hrcloud/contract/batchSaveOrUpdatelocal?access_token=访问令牌
Body: {
	"data": [
		{
			"country": "0040be98-735b-44c0-afe5-54d11a96037b",
			"parent": "",
			"code": "5",
			"timezone": "Africa/Abidjan",
			"modifier": "昵称-人力测试管理员",
			"creatorId": 2136412528175480800,
			"modifierId": 2136412528175480800,
			"memo": "5",
			"LocationScopeOrg": [
				{
					"isDeleted": false,
					"ytenant": "0000M3MN5ZJM5YP8940000",
					"locationId": "2143255459046359049",
					"id": "2143255459046359000",
					"pubts": "2024-11-27 19:42:54",
					"orgId": "666666",
					"tenant": "0000M3MN5ZJM5YP8940000"
				}
			],
			"path": "2143255459046359049|",
			"modifyTime": "2024-11-27 20:47:15",
			"isDeleted": 0,
			"enable": 1,
			"id": "2143255459046359049",
			"pubts": "2024-11-27 20:47:15",
			"tenant": "0000M3MN5ZJM5YP8940000",
			"createDate": "2024-11-27 19:42:54",
			"creator": "昵称-人力测试管理员",
			"address": "5",
			"enablets": "2024-11-27 19:42:54",
			"modifyDate": "2024-11-27 20:47:15",
			"level": 1,
			"ytenant": "0000M3MN5ZJM5YP8940000",
			"isEnd": true,
			"createTime": "2024-11-27 19:42:54",
			"name": "5"
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
code	string	否	code 示例：200
message	string	否	message 示例：操作成功
data	object	否	data
count	number
小数位数:0,最大长度:10	否	count 示例：2
sucessCount	number
小数位数:0,最大长度:10	否	sucessCount 示例：2
failCount	number
小数位数:0,最大长度:10	否	failCount 示例：0
messages	object	是	messages
infos	object	是	infos
failInfos	object	是	failInfos

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 2,
		"sucessCount": 2,
		"failCount": 0,
		"messages": [
			{}
		],
		"infos": [
			{
				"country": "0040be98-735b-44c0-afe5-54d11a96037b",
				"parent": "",
				"code": "5",
				"timezone": "Africa/Abidjan",
				"modifier": "昵称-人力测试管理员",
				"creatorId": 2136412528175480800,
				"modifierId": 2136412528175480800,
				"memo": "5",
				"LocationScopeOrg": [
					{
						"isDeleted": false,
						"ytenant": "0000M3MN5ZJM5YP8940000",
						"locationId": "2143255459046359049",
						"id": "2143255459046359000",
						"pubts": "2024-11-27 19:42:54",
						"orgId": "666666",
						"tenant": "0000M3MN5ZJM5YP8940000"
					}
				],
				"path": "2143255459046359049|",
				"modifyTime": "2024-11-27 20:47:15",
				"isDeleted": 0,
				"enable": 1,
				"id": "2143255459046359049",
				"pubts": "2024-11-27 20:47:15",
				"tenant": "0000M3MN5ZJM5YP8940000",
				"createDate": "2024-11-27 19:42:54",
				"creator": "昵称-人力测试管理员",
				"address": "5",
				"enablets": "2024-11-27 19:42:54",
				"modifyDate": "2024-11-27 20:47:15",
				"level": 1,
				"ytenant": "0000M3MN5ZJM5YP8940000",
				"isEnd": true,
				"createTime": "2024-11-27 19:42:54",
				"name": "5"
			}
		],
		"failInfos": [
			{}
		]
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
999	请联系开发处理	请联系开发处理

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

