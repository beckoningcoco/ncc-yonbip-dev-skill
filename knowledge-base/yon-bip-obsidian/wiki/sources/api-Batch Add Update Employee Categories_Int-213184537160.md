---
title: "员工类别批量新增更新_集成_API"
apiId: "2131845371606335490"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Employee Category"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Employee Category]
platform_version: "BIP"
source_type: community-api-docs
---

# 员工类别批量新增更新_集成_API

>  请求方式	POST | Employee Category (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/digitalModel/psnlcatg/batchSaveOrUpdateForIntegration
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
data	object	是	否	入参
creator	string	否	否	creator 示例：00001951-7ca3-47ac-a462-d5a66e3e6724
code	string	否	是	编码 示例：yglb23500421
level	number
小数位数:0,最大长度:10	否	否	level 示例：1
sysid	string	否	否	sysid 示例：diwork
ytenant	string	否	否	ytenant 示例：0000LDVLBFJI3Y0MIR0000
isEnd	boolean	否	否	isEnd 示例：true
dr	number
小数位数:0,最大长度:10	否	否	dr 示例：0
path	string	否	否	path 示例：1655485738453041152|
enable	number
小数位数:0,最大长度:10	否	否	启用状态，1 启用 2 停用 如不填写默认为启用 示例：1
tenantid	string	否	否	tenantid 示例：0000LDVLBFJI3Y0MIR0000
name	object	否	是	名称，支持多语
creationtime	string	否	否	creationtime 示例：2023-02-09 14:25:06
id	string	否	否	员工类别ID 新增时不填，修改时必填 示例：1655485738453041152
pubts	date
格式:yyyy-MM-dd HH:mm:ss	否	否	pubts 示例：2023-02-09 14:25:05
tenant	string	否	否	tenant 示例：0000LDVLBFJI3Y0MIR0000
distributionSite	string	否	否	distributionSite
ts	string	否	否	ts 示例：2023-02-09 14:25:05
parentid	string	否	否	parentid 示例：212
memo	string	否	否	memo
parent	string	否	否	parent 示例：parent
country	string	否	否	country 示例：2323
objid	string	否	否	来源主键新增必填

## 3. 请求示例

Url: /yonbip/digitalModel/psnlcatg/batchSaveOrUpdateForIntegration?access_token=访问令牌
Body: {
	"data": [
		{
			"creator": "00001951-7ca3-47ac-a462-d5a66e3e6724",
			"code": "yglb23500421",
			"level": 1,
			"sysid": "diwork",
			"ytenant": "0000LDVLBFJI3Y0MIR0000",
			"isEnd": true,
			"dr": 0,
			"path": "1655485738453041152|",
			"enable": 1,
			"tenantid": "0000LDVLBFJI3Y0MIR0000",
			"name": {
				"zh_CN": "",
				"en_US": "",
				"zh_TW": ""
			},
			"creationtime": "2023-02-09 14:25:06",
			"id": "1655485738453041152",
			"pubts": "2023-02-09 14:25:05",
			"tenant": "0000LDVLBFJI3Y0MIR0000",
			"distributionSite": "",
			"ts": "2023-02-09 14:25:05",
			"parentid": "212",
			"memo": "",
			"parent": "parent",
			"country": "2323",
			"objid": ""
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
小数位数:0,最大长度:10	否	count 示例：1
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
		"count": 1,
		"sucessCount": 2,
		"failCount": 0,
		"messages": [
			{
				"sourceUnique": "11",
				"messages": "错误信息描述"
			}
		],
		"infos": [
			{
				"data": {
					"sourceUnique": "11",
					"targetUnique": "21",
					"code": "11",
					"name": {
						"zh_CN": "测试",
						"en_US": "test",
						"zh_TW": "测试",
						"__rowNum": 1,
						"__orginSheetName": "PsnlCatg(2)"
					},
					"parent": "d1170ea764cb4d95a30554cda58866c9",
					"sysid": "diwork",
					"enable": 1,
					"memo": "test",
					"fromApi_orgStaff": true,
					"id": "f46bf63c95ce4261a80b19a2c419c773",
					"creator": "00001951-7ca3-47ac-a462-d5a66e3e6724",
					"creationtime": "2021-04-20 10:51:49",
					"dr": 0,
					"pubts": "2021-04-20 10:51:50",
					"yhtTenantId": "hxetunde",
					"tenant": "hxetunde",
					"yTenantId": "hxetunde",
					"yhtTenant": "hxetunde"
				}
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
999	后台逻辑异常	联系管理员

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2026-03-13	
更新
请求参数 (10)
	2	2025-09-24	
更新
请求说明
更新
请求参数 user_define_character
删除
请求参数 ytenant
删除
请求参数 id
删除
请求参数 pubts

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

