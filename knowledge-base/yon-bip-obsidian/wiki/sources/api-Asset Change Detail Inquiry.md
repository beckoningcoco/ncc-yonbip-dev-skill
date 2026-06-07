---
title: "资产变动详情查询"
apiId: "4bb0f86f742d4064918227ed7676a730"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Fixed Asset Change Request"
domain: "FI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Fixed Asset Change Request]
platform_version: "BIP"
source_type: community-api-docs
---

# 资产变动详情查询

> `ContentType	application/json` 请求方式	GET | 分类: Fixed Asset Change Request (FI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/fi/changebill/detail

请求方式	GET

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | string | query | 是 | 资产变动单ID |

## 3. 请求示例

Url: /yonbip/fi/changebill/detail?access_token=访问令牌&id=

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| message | string | 否 | 调用失败时的错误信息 |
| data | object | 否 | 调用成功时的返回数据 |
| accentity_code | string | 否 | 会计主体编码 |
| accpurpose | string | 否 | 核算目的id |
| accpurpose_name | string | 否 | 核算目的名称 |
| creator | string | 否 | 创建人 |
| accentity | string | 否 | 会计主体id |
| createTime | string | 否 | 创建时间 |
| accentity_name | string | 否 | 会计主体名称 |
| tradetype | string | 否 | 交易类型 |
| modifier | string | 否 | 修改人 |
| busiaccbook | string | 否 | 业务账簿id |
| modifyTime | string | 否 | 修改时间 |
| busiaccbook_name | string | 否 | 业务账簿名称 |
| auditor | string | 否 | 审核人 |
| code | string | 否 | 变动单编码 |
| auditTime | string | 否 | 审核日期 |
| businessdate | string | 否 | 单据日期 |
| changetypeid | string | 否 | 变动类型 |
| changetype | string | 否 | 变动类型id |
| changetype_name | string | 否 | 变动类型名称 |
| changetype_optionname | string | 否 | 变动类型对应的optionname |
| showcolumns | string | 否 | 需要显示的字段 |
| changetype_beforechange | string | 否 | 变动前字段 |
| changetype_isvoucher | string | 否 | 是否生成凭证 |
| changetype_afterchange | string | 否 | 变动后字段 |
| changedate | string | 否 | 变动日期 |
| description | muti_lang | 否 | 变动原因,支持多语 |
| auditstatus | string | 否 | 审批状态, 0:未审核、1:已审核、 |
| enabled | string | 否 | 是否可用 |
| isnoweffect | string | 否 | 是否当期生效, true:是、false:否、 |
| isWfControlled | string | 否 | 是否工作流控制 |
| verifystate | string | 否 | 审批状态, 0:未审核、1:已审核、2:已关闭、3:审核中、 |
| returncount | string | 否 | 返回次数 |
| pubts | string | 否 | 时间戳 |
| auditorId | string | 否 | 审批人id |
| auditorId_name | string | 否 | 审批人名称 |
| currency | string | 否 | 币种id |
| id | string | 否 | 变动单ID |
| currency_name | string | 否 | 币种名称 |
| currency_priceDigit | string | 否 | 币种单价精度 |
| currency_moneyDigit | string | 否 | 币种金额精度 |
| changetype_code | string | 否 | 变动方式编码 |
| periodcode | string | 否 | 会计期间 |
| bodies | object | 是 | 变动单卡片子表 |
| beusedepredepts | object | 是 | 变动单卡片变动前 |
| masterOrgKeyField | string | 否 | 主组织键领域 示例：accentity |
| changebilldetailid | string | 否 | 变动单详情id 示例：1837202656270849 |
| auditDate | string | 否 | 审核日期 示例：2020-05-19 00:00:00 |
| transTypeKeyField | string | 否 | 交易类型键领域 示例：tradetype |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"accentity_code": "",
		"accpurpose": "",
		"accpurpose_name": "",
		"creator": "",
		"accentity": "",
		"createTime": "",
		"accentity_name": "",
		"tradetype": "",
		"modifier": "",
		"busiaccbook": "",
		"modifyTime": "",
		"busiaccbook_name": "",
		"auditor": "",
		"code": "",
		"auditTime": "",
		"businessdate": "",
		"changetypeid": "",
		"changetype": "",
		"changetype_name": "",
		"changetype_optionname": "",
		"showcolumns": "",
		"changetype_beforechange": "",
		"changetype_isvoucher": "",
		"changetype_afterchange": "",
		"changedate": "",
		"description": {
			"zh_CN": "中文",
			"en_US": "英文",
			"zh_TW": "繁体"
		},
		"auditstatus": "",
		"enabled": "",
		"isnoweffect": "",
		"isWfControlled": "",
		"verifystate": "",
		"returncount": "",
		"pubts": "",
		"auditorId": "",
		"auditorId_name": "",
		"currency": "",
		"id": "",
		"currency_name": "",
		"currency_priceDigit": "",
		"currency_moneyDigit": "",
		"changetype_code": "",
		"periodcode": "",
		"bodies": [
			{
				"assetid": "",
				"assetid_accruedoriginalvalue": "",
				"assetid_code": "",
				"assetid_name": "",
				"beaccruedoriginalvalue": 0,
				"befcoriginalvalue": 0,
				"afaccruedoriginalvalue": 0,
				"affcoriginalvalue": 0,
				"bedepreciation": 0,
				"afdepreciation": 0,
				"bescrapvaluerate": 0,
				"afscrapvaluerate": 0,
				"bescrapvalue": 0,
				"betotalworkload": 0,
				"afscrapvalue": 0,
				"bedepreciationmethod": "",
				"bedepreciationmethod_name": "",
				"afdepreciationmethod": "",
				"afdepreciationmethod_code": "",
				"afdepreciationmethod_name": "",
				"belifemonth": 0,
				"aftotalworkload": 0,
				"aflifemonth": 0,
				"beusagestate": "",
				"afexistingworkload": 0,
				"beusagestate_name": "",
				"afworkloadunit": {
					"zh_CN": "中文",
					"en_US": "英文",
					"zh_TW": "繁体"
				},
				"afusagestate": "",
				"afusagestate_name": "",
				"bemanagedepredept": "",
				"bemanagedepredept_name": "",
				"afmanagedepredept": "",
				"afmanagedepredept_name": "",
				"beusedepredept": "",
				"afusedepredept": "",
				"becategory": "",
				"becategory_name": "",
				"afcategory": "",
				"beaddway": "",
				"afaddway": "",
				"beuser": "",
				"afuser": "",
				"beproject": "",
				"afproject": "",
				"afcategory_name": "",
				"beaddway_name": "",
				"afaddway_name": "",
				"beuser_name": "",
				"afuser_name": "",
				"beproject_name": "",
				"afproject_name": "",
				"changebill": "",
				"id": "",
				"calculateid": "",
				"totalworkload": 0,
				"bodies_exchangerate": "",
				"assetid_currency": "",
				"assetid_currency_priceDigit": "",
				"assetid_currency_moneyDigit": "",
				"description": ""
			}
		],
		"beusedepredepts": [
			{
				"beusedepredept": "",
				"beusedepredept_name": "",
				"proportion": 0,
				"pubts": "",
				"id": ""
			}
		],
		"masterOrgKeyField": "accentity",
		"changebilldetailid": "1837202656270849",
		"auditDate": "2020-05-19 00:00:00",
		"transTypeKeyField": "tradetype"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

200	操作成功	查询时不会出现错误信息，只是查出来的data为空。


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-06-25

更新

请求参数 id

更新

返回参数 (116)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

