---
title: "职级批量新增更新_集成_API"
apiId: "2132686154423599112"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Job Level"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Job Level]
platform_version: "BIP"
source_type: community-api-docs
---

# 职级批量新增更新_集成_API

>  请求方式	POST | Job Level (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/digitalModel/rank/batchSaveOrUpdateForIntegration
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
ranktype_id	string	否	否	职级类别ID 示例：11
code	string	否	是	编码 示例：22
enable	int	否	是	启用状态，0初始化 1启用 2停用 示例：1
name	object	否	是	名称
id	string	否	否	objid和id，二选一，若都填写，则需要一致 示例：1
objid	string	否	否	objid和id，二选一，若都填写，则需要一致 示例：objid
org_id	string	否	是	所属组织ID 示例：113343435435
minrank_id	string	否	否	最低职等ID 示例：1
maxrank_id	string	否	否	最高职等ID 示例：1
memo	object	否	否	备注
orgGroupId	string	否	是	适用范围ID 示例：适用范围ID
hashCode	string	否	是	适用范围HASH 示例：e9ce3112ad89bbf526771e54da157c10
orgGroupDetailList	object	是	是	适用范围详情
orderNo	number
小数位数:0,最大长度:10	否	是	顺序号 示例：1
distributionSite	string	否	否	distributionSite
dr	string	否	否	删除,0,未删除；1，删除
sysid	string	否	是	sysid 示例：diwork 默认值：diwork
creator	string	否	否	创建人
modifier	string	否	否	修改人
modifyTime	date
格式:yyyy-MM-dd HH:mm:ss	否	否	修改时间
createTime	date
格式:yyyy-MM-dd HH:mm:ss	否	否	创建时间

## 3. 请求示例

Url: /yonbip/digitalModel/rank/batchSaveOrUpdateForIntegration?access_token=访问令牌
Body: {
	"data": [
		{
			"ranktype_id": "11",
			"code": "22",
			"enable": 1,
			"name": {
				"zh_CN": "",
				"en_US": "",
				"zh_TW": ""
			},
			"id": "1",
			"objid": "objid",
			"org_id": "113343435435",
			"minrank_id": "1",
			"maxrank_id": "1",
			"memo": {
				"zh_CN": "中文",
				"en_US": "英文",
				"zh_TW": "繁体"
			},
			"orgGroupId": "适用范围ID",
			"hashCode": "e9ce3112ad89bbf526771e54da157c10",
			"orgGroupDetailList": [
				{
					"id": "1",
					"orgId": "222222",
					"groupId": "333333"
				}
			],
			"orderNo": 1,
			"distributionSite": "",
			"dr": "",
			"sysid": "diwork",
			"creator": "",
			"modifier": "",
			"modifyTime": "2026-06-07 12:44:57",
			"createTime": "2026-06-07 12:44:57"
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
code	number
小数位数:0,最大长度:10	否	code 示例：200
message	string	否	message 示例：操作成功
data	object	否	data
sucessCount	number
小数位数:0,最大长度:10	否	sucessCount 示例：1
failCount	number
小数位数:0,最大长度:10	否	failCount 示例：0
count	number
小数位数:0,最大长度:10	否	count 示例：1
messages	object	是	messages
infos	object	是	infos

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"sucessCount": 1,
		"failCount": 0,
		"count": 1,
		"messages": [
			{
				"sourceUnique": "211221",
				"message": "失败原因"
			}
		],
		"infos": [
			{
				"data": {
					"code": "1111",
					"enable": 1,
					"name": {
						"zh_CN": "中文",
						"en_US": "英文",
						"zh_TW": "繁体"
					},
					"id": "2133530356013858821",
					"objid": "objid",
					"org_id": "212121",
					"orderNo": 1,
					"ranktype_id": "2108972428782731266",
					"minrank_id": "2108834148020912149",
					"maxrank_id": "2108834148020912149",
					"memo": {
						"zh_CN": "中文",
						"en_US": "英文",
						"zh_TW": "繁体"
					},
					"orgGroupId": "21212",
					"hashCode": "12121312",
					"orgGroupDetailList": [
						{
							"id": "2323",
							"orgId": "23232",
							"groupId": "23423"
						}
					],
					"_status": "Insert",
					"vid": "121212",
					"creator": "00001951-7ca3-47ac-a462-d5a66e3e6724",
					"createTime": "2024-11-14 17:13:43",
					"yhtTenant": "0000M0Q43BMZ17WMCB0000",
					"tenant": "0000M0Q43BMZ17WMCB0000",
					"yhtTenantId": "0000M0Q43BMZ17WMCB0000",
					"_entityName": "bd.duty.RankTimeLine",
					"sourceUnique": "5555",
					"targetUnique": "66666"
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
999	后端错误，请联系开发人员	

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

