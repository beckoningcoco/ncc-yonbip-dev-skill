---
title: "职位族群批量新增更新_集成_API"
apiId: "2132882116574707712"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Job Family"
domain: "CHR"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Job Family]
platform_version: "BIP"
source_type: community-api-docs
---

# 职位族群批量新增更新_集成_API

>  请求方式	POST | Job Family (CHR)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/hrcloud/postfamily/batchSaveOrUpdateForIntegration
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
data	object	是	是	data
code	string	否	是	编码 示例：423423
name	object	否	是	名称
orgId	string	否	否	所属组织 示例：1231232
id	string	否	否	主键 示例：124321321
enable	string	否	否	启用状态，1:启用，0:停用 示例：1
memo	string	否	否	描述 示例：我我饿哦
effectiveDate	string	否	否	生效日期 示例：2024-11-19
pubts	string	否	否	时间戳 示例：2024-11-19 00:00:00
distributionSite	string	否	否	站点
dr	string	否	否	删除状态 0:未删除，1:删除 示例：0
creator	string	否	否	创建人 示例：8c4a75a9-41ac-4367-abbd-5692a1bee11d
createTime	string	否	否	创建时间 示例：2024-11-18 15:44:14
modifier	string	否	否	修改人 示例：81ee321b-8c73-49ee-9335-3e53c795f66a
modifyTime	string	否	否	修改时间 示例：2024-04-03 10:50:13
objid	string	否	否	来源id
tenant	string	否	否	租户id
ytenant	string	否	否	租户id

## 3. 请求示例

Url: /yonbip/hrcloud/postfamily/batchSaveOrUpdateForIntegration?access_token=访问令牌
Body: {
	"data": [
		{
			"code": "423423",
			"name": {
				"zh_CN": "中文",
				"zh_TW": "繁体",
				"en_US": "英文"
			},
			"orgId": "1231232",
			"id": "124321321",
			"enable": "1",
			"memo": "我我饿哦",
			"effectiveDate": "2024-11-19",
			"pubts": "2024-11-19 00:00:00",
			"distributionSite": "",
			"dr": "0",
			"creator": "8c4a75a9-41ac-4367-abbd-5692a1bee11d",
			"createTime": "2024-11-18 15:44:14",
			"modifier": "81ee321b-8c73-49ee-9335-3e53c795f66a",
			"modifyTime": "2024-04-03 10:50:13",
			"objid": "",
			"tenant": "",
			"ytenant": ""
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
				"data": {
					"code": "423423",
					"name": {
						"zh_CN": "中文",
						"zh_TW": "繁体",
						"en_US": "英文"
					},
					"orgId": "1231232",
					"id": "124321321",
					"enable": "1",
					"memo": "我我饿哦",
					"effectiveDate": "2024-11-19",
					"pubts": "2024-11-19 00:00:00",
					"distributionSite": "",
					"creator": "8c4a75a9-41ac-4367-abbd-5692a1bee11d",
					"createTime": "2024-11-18 15:44:14",
					"modifier": "81ee321b-8c73-49ee-9335-3e53c795f66a",
					"modifyTime": "2024-04-03 10:50:13",
					"dr": "0",
					"tenant": "",
					"ytenant": ""
				}
			}
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
999	操作失败	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-20	
新增
请求参数 tenant
新增
请求参数 ytenant
新增
请求参数 user_define_character
新增
返回参数 tenant
新增
返回参数 ytenant
HXRL-123878 职位族群接特征

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

