---
title: "固定资产减值单元批量保存"
apiId: "1798911403880873990"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Impairment Unit"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Impairment Unit]
platform_version: "BIP"
source_type: community-api-docs
---

# 固定资产减值单元批量保存

>  请求方式	POST | Impairment Unit (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/EFI/FixedAssetImpairmentUnit/save
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	是	是	固定资产减值单元信息
accentity	string	否	否	会计主体ID,会计主体id和会计主体编码 不能同时为空，id和编码同时存在，以i d为准 示例：1525772228455038981
accentity_code	string	否	否	会计主体编码, 会计主体id和会计主体编码 不能同时为空，id和编码同时存在，以i d为准 示例：fa
code	string	否	是	减值单元编码 示例：2800
name	string	否	是	减值单元名称 示例：市场减值
enable	string	否	是	启用状态 示例：1 默认值：1
_status	string	否	否	操作标识 (Insert:新增, 本接口只支持单据保存，不支持编辑更新。如果数据错误请删除数据后重新保存) 示例：Insert 默认值：Insert

## 3. 请求示例

Url: /yonbip/EFI/FixedAssetImpairmentUnit/save?access_token=访问令牌
Body: {
	"data": [
		{
			"accentity": "1525772228455038981",
			"accentity_code": "fa",
			"code": "2800",
			"name": "市场减值",
			"enable": "1",
			"_status": "Insert"
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
code	string	否	状态值 示例：200
message	string	否	返回信息 示例：操作成功
data	object	否	返回数据
count	long	否	总条数 示例：1
sucessCount	long	否	成功条数 示例：1
failCount	long	否	失败条数 示例：0
messages	string	是	返回信息明细
failInfos	string	是	失败信息明细
infos	object	是	返回数据明细

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			""
		],
		"failInfos": [
			""
		],
		"infos": [
			{
				"code": "2800",
				"accentity": "1525772228455038981",
				"enable": "1",
				"id": "1816588209388257281",
				"creator": "00001951-7ca3-47ac-a462-d5a66e3e6724",
				"createTime": "2023-09-14 16:05:01",
				"name": {
					"zh_CN": "市场减值"
				},
				"creator_userName": "默认用户"
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
999	名称不允许为空	填写名称

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

