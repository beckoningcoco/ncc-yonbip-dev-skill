---
title: "职务批量新增更新_集成_API"
apiId: "2127365153799274497"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Title"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Title]
platform_version: "BIP"
source_type: community-api-docs
---

# 职务批量新增更新_集成_API

>  请求方式	POST | Title (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/digitalModel/duty/batchSaveOrUpdateForIntegration
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
data	object	是	否	数据
name	muti_lang	否	是	名称
objid	string	否	是	来源系统主键 示例：123
code	string	否	是	编码 示例：0000001
enable	int	否	是	启用状态，0初始化 1启用 2停用 示例：1
jobtype_id	string	否	否	所属职务类别ID或者编码 示例：1793555717112725505
jobgrade_id	string	否	否	职级ID或者编码 示例：1793555717112725505
maxrank_id	string	否	否	最高职等ID或者编码 示例：1793555004148154378
minrank_id	string	否	否	最低职等ID或者编码 示例：1793555004148154378
org_id	string	否	是	所属组织ID或者编码 示例：666
duties	string	否	否	职责 示例：职责
memo	muti_lang	否	否	备注
orgGroupId	string	否	是	适用范围ID 示例：1793555004148154378
orgGroupDetailList	object	是	是	适用范围详情
hashCode	string	否	是	适用范围HASH 示例：e9ce3112ad89bbf526771e54da157c10
id	string	否	否	主键 示例：232323
distributionSite	string	否	否	distributionSite
dr	string	否	否	删除状态
modifyTime	date
格式:yyyy-MM-dd HH:mm:ss	否	否	修改时间
createTime	date
格式:yyyy-MM-dd HH:mm:ss	否	否	创建时间
creator	string	否	否	创建人
modifier	string	否	否	修改人
sysid	string	否	是	sysid 默认值：diwork

## 3. 请求示例

Url: /yonbip/digitalModel/duty/batchSaveOrUpdateForIntegration?access_token=访问令牌
Body: {
	"data": [
		{
			"name": {
				"zh_TW": "繁体",
				"en_US": "英文",
				"zh_CN": "中文"
			},
			"objid": "123",
			"code": "0000001",
			"enable": 1,
			"jobtype_id": "1793555717112725505",
			"jobgrade_id": "1793555717112725505",
			"maxrank_id": "1793555004148154378",
			"minrank_id": "1793555004148154378",
			"org_id": "666",
			"duties": "职责",
			"memo": {
				"zh_TW": "繁体",
				"en_US": "英文",
				"zh_CN": "中文"
			},
			"orgGroupId": "1793555004148154378",
			"orgGroupDetailList": [
				{
					"id": "",
					"orgId": "",
					"groupId": ""
				}
			],
			"hashCode": "e9ce3112ad89bbf526771e54da157c10",
			"id": "232323",
			"distributionSite": "",
			"dr": "",
			"modifyTime": "2026-06-07 12:44:51",
			"createTime": "2026-06-07 12:44:51",
			"creator": "",
			"modifier": "",
			"sysid": ""
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
					"code": "1472146898874793985",
					"enable": 1,
					"name": {
						"zh_CN": "职务1"
					},
					"jobtype_id": "551c3b4bf27a4b49a5ed834fe8cc0347",
					"id": "1472146898874793985",
					"pubts": "2022-06-07 13:40:56",
					"user_define_character": {},
					"memo": {
						"zh_CN": "备注"
					},
					"org_id": "1945848780620300296"
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
999	操作失败	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2026-03-09	
更新
请求参数 jobtype_id
商开、海外支持

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

