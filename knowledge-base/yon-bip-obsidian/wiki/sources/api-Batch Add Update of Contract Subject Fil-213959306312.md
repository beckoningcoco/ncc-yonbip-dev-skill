---
title: "合同主体档案批量新增更新_全球化_上传下发"
apiId: "2139593063120502789"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Contract Party"
domain: "CHR"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Contract Party]
platform_version: "BIP"
source_type: community-api-docs
---

# 合同主体档案批量新增更新_全球化_上传下发

>  请求方式	POST | Contract Party (CHR)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/hrcloud/contract/batchSaveOrUpdate
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
creator	string	否	否	creator 示例：昵称-人力测试管理员
enablets	string	否	否	enablets 示例：2024-11-23 19:55:56
code	string	否	否	code 示例：3
modifyDate	string	否	否	modifyDate 示例：2024-11-23 21:12:16
ytenant	string	否	否	ytenant 示例：0000M3MN5ZJM5YP8940000
modifier	string	否	否	modifier 示例：昵称-人力测试管理员
creatorId	number
小数位数:0,最大长度:19	否	否	creatorId 示例：2136412528175480800
modifierId	number
小数位数:0,最大长度:19	否	否	modifierId 示例：2136412528175480800
orgId	string	否	否	orgId 示例：2137225857531379716
modifyTime	string	否	否	modifyTime 示例：2024-11-23 21:12:16
isDeleted	number
小数位数:0,最大长度:10	否	否	isDeleted 示例：0
isCorp	boolean	否	否	isCorp 示例：false
createTime	string	否	否	createTime 示例：2024-11-23 19:55:56
enable	number
小数位数:0,最大长度:10	否	否	状态 示例：0
name	string	否	否	name 示例：234324
id	string	否	否	id 示例：2140293494971301891
pubts	string	否	否	时间戳 示例：2024-11-23 19:55:56
contractentityScopeOrgdept	object	是	否	contractentityScopeOrgdept
tenant	string	否	否	租户ID 示例：0000M3MN5ZJM5YP8940000
createDate	string	否	否	createDate 示例：2024-11-23 19:55:56
memo	string	否	否	memo 示例：111

## 3. 请求示例

Url: /yonbip/hrcloud/contract/batchSaveOrUpdate?access_token=访问令牌
Body: {
	"data": [
		{
			"creator": "昵称-人力测试管理员",
			"enablets": "2024-11-23 19:55:56",
			"code": "3",
			"modifyDate": "2024-11-23 21:12:16",
			"ytenant": "0000M3MN5ZJM5YP8940000",
			"modifier": "昵称-人力测试管理员",
			"creatorId": 2136412528175480800,
			"modifierId": 2136412528175480800,
			"orgId": "2137225857531379716",
			"modifyTime": "2024-11-23 21:12:16",
			"isDeleted": 0,
			"isCorp": false,
			"createTime": "2024-11-23 19:55:56",
			"enable": 0,
			"name": "234324",
			"id": "2140293494971301891",
			"pubts": "2024-11-23 19:55:56",
			"contractentityScopeOrgdept": [
				{
					"orgdeptName": "企业账号级",
					"isDeleted": false,
					"ytenant": "0000M3MN5ZJM5YP8940000",
					"contractentityId": "2140293494971301891",
					"orgdeptId": "666666",
					"id": "2140293494971301892",
					"pubts": "2024-11-23 19:55:56",
					"tenant": "0000M3MN5ZJM5YP8940000"
				}
			],
			"tenant": "0000M3MN5ZJM5YP8940000",
			"createDate": "2024-11-23 19:55:56",
			"memo": "111"
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
				"creator": "昵称-人力测试管理员",
				"enablets": "2024-11-23 19:55:56",
				"code": "3",
				"modifyDate": "2024-11-23 21:12:16",
				"ytenant": "0000M3MN5ZJM5YP8940000",
				"modifier": "昵称-人力测试管理员",
				"creatorId": 2136412528175480800,
				"modifierId": 2136412528175480800,
				"orgId": "2137225857531379716",
				"modifyTime": "2024-11-23 21:12:16",
				"isDeleted": 0,
				"isCorp": false,
				"createTime": "2024-11-23 19:55:56",
				"enable": 0,
				"name": "234324",
				"id": "2140293494971301891",
				"pubts": "2024-11-23 19:55:56",
				"contractentityScopeOrgdept": [
					{
						"orgdeptName": "企业账号级",
						"isDeleted": false,
						"ytenant": "0000M3MN5ZJM5YP8940000",
						"contractentityId": "2140293494971301891",
						"orgdeptId": "666666",
						"id": "2140293494971301892",
						"pubts": "2024-11-23 19:55:56",
						"tenant": "0000M3MN5ZJM5YP8940000"
					}
				],
				"tenant": "0000M3MN5ZJM5YP8940000",
				"createDate": "2024-11-23 19:55:56",
				"memo": "111"
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

