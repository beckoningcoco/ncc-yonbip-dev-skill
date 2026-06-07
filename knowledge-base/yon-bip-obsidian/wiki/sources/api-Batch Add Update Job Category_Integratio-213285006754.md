---
title: "职位序列批量新增更新_集成_API"
apiId: "2132850067540279304"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Job Category"
domain: "CHR"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Job Category]
platform_version: "BIP"
source_type: community-api-docs
---

# 职位序列批量新增更新_集成_API

>  请求方式	POST | Job Category (CHR)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/hrcloud/postsequence/batchSaveOrUpdateForIntegration
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
creator	string	否	否	创建人 示例：8c4a75a9-41ac-4367-abbd-5692a1bee11d
code	string	否	是	编码 示例：1
level	number
小数位数:0,最大长度:10	否	否	层级 示例：1
ytenant	string	否	否	租户id 示例：0000M358B9M63D1F5T0000
modifier	string	否	否	修改人 示例：8c4a75a9-41ac-4367-abbd-5692a1bee11d
isEnd	boolean	否	否	是否末级节点 示例：true
dr	number
小数位数:0,最大长度:10	否	否	删除状态 0:未删除，1:删除 示例：0
orgId	string	否	是	所属组织 示例：666666
path	string	否	否	路径 示例：2136450968127012869|
modifyTime	string	否	否	修改时间 示例：2024-11-18 15:40:34
postFamilyId	string	否	否	职位族群 示例：2136450512860479491
createTime	string	否	否	创建时间 示例：2024-11-18 15:40:28
enable	number
小数位数:0,最大长度:10	否	否	启用状态；0:未启用，1:启用 示例：1
orgGroupId	string	否	否	适用范围id 示例：2136450968127012867
name	object	否	是	名称
orgGroupDetailList	object	是	否	适用范围详情
parent	string	否	否	上级职位序列 示例：34234234
id	string	否	否	主键 示例：2136450968127012869
jobType	string	否	否	职务类别 示例：456456546546
pubts	string	否	否	时间戳 示例：2024-11-18 15:40:34
tenant	string	否	否	租户id 示例：0000M358B9M63D1F5T0000
effectiveDate	string	否	否	生效日期 示例：2024-11-18 00:00:00
memo	string	否	否	备注 示例：柔柔弱弱
distributionSite	string	否	否	站点
objid	string	否	否	来源id，id有值时，与id值保持一致
hashCode	string	否	否	适用范围HASH

## 3. 请求示例

Url: /yonbip/hrcloud/postsequence/batchSaveOrUpdateForIntegration?access_token=访问令牌
Body: {
	"data": [
		{
			"creator": "8c4a75a9-41ac-4367-abbd-5692a1bee11d",
			"code": "1",
			"level": 1,
			"ytenant": "0000M358B9M63D1F5T0000",
			"modifier": "8c4a75a9-41ac-4367-abbd-5692a1bee11d",
			"isEnd": true,
			"dr": 0,
			"orgId": "666666",
			"path": "2136450968127012869|",
			"modifyTime": "2024-11-18 15:40:34",
			"postFamilyId": "2136450512860479491",
			"createTime": "2024-11-18 15:40:28",
			"enable": 1,
			"orgGroupId": "2136450968127012867",
			"name": {
				"zh_CN": "职位序列",
				"en_US": "",
				"zh_TW": ""
			},
			"orgGroupDetailList": [
				{
					"groupId": "1940320324493508610",
					"id": "1940320324493508611",
					"orgId": "666666"
				}
			],
			"parent": "34234234",
			"id": "2136450968127012869",
			"jobType": "456456546546",
			"pubts": "2024-11-18 15:40:34",
			"tenant": "0000M358B9M63D1F5T0000",
			"effectiveDate": "2024-11-18 00:00:00",
			"memo": "柔柔弱弱",
			"distributionSite": "",
			"objid": "",
			"hashCode": ""
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
					"creator": "8c4a75a9-41ac-4367-abbd-5692a1bee11d",
					"code": "1",
					"level": 1,
					"ytenant": "0000M358B9M63D1F5T0000",
					"modifier": "8c4a75a9-41ac-4367-abbd-5692a1bee11d",
					"isEnd": true,
					"dr": 0,
					"orgId": "666666",
					"path": "2136450968127012869|",
					"modifyTime": "2024-11-18 15:40:34",
					"postFamilyId": "2136450512860479491",
					"createTime": "2024-11-18 15:40:28",
					"enable": 1,
					"orgGroupId": "2136450968127012867",
					"name": {
						"zh_CN": "职位序列",
						"en_US": "",
						"zh_TW": ""
					},
					"orgGroupDetailList": [
						{
							"ytenant": "0000LDVLBFJI3Y0MIR0000",
							"groupId": "1940320324493508610",
							"id": "1940320324493508611",
							"orgId": "666666"
						}
					],
					"parent": "34234234",
					"id": "2136450968127012869",
					"jobType": "456456546546",
					"pubts": "2024-11-18 15:40:34",
					"tenant": "0000M358B9M63D1F5T0000",
					"effectiveDate": "2024-11-18 00:00:00",
					"distributionSite": "",
					"user_define_character": {
						"ytenant": "0000LSU86TH67MZUOG0000",
						"id": "1966344373138358281",
						"pubts": "2024-04-03 10:50:14"
					},
					"hashCode": "",
					"memo": ""
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
暂时没有数据哦~

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

