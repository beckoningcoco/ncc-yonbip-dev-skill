---
title: "资产变动保存"
apiId: "b23e4a7f51b245658ad6f073e219782a"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Fixed Asset Change Request"
domain: "FI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Fixed Asset Change Request]
platform_version: "BIP"
source_type: community-api-docs
---

# 资产变动保存

> `ContentType	application/json` 请求方式	POST | 分类: Fixed Asset Change Request (FI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/fi/changebill/save

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 否 | 是 | 资产变动单 |
| accentity_code | string | 否 | 否 | 会计主体编码 |
| accpurpose | string | 否 | 否 | 核算目的id |
| accpurpose_name | string | 否 | 否 | 核算目的名称 |
| creator | string | 否 | 否 | 创建人 |
| accentity | string | 否 | 是 | 会计主体ID |
| createTime | string | 否 | 否 | 创建时间 |
| accentity_name | string | 否 | 否 | 会计主体名称 |
| tradetype | string | 否 | 否 | 交易类型ID |
| modifier | string | 否 | 否 | 修改人 |
| busiaccbook | string | 否 | 否 | 业务账簿id |
| modifyTime | string | 否 | 否 | 修改时间 |
| busiaccbook_name | string | 否 | 否 | 业务账簿名称 |
| auditor | string | 否 | 否 | 审核人 |
| code | string | 否 | 是 | 变动单编码 |
| auditTime | string | 否 | 否 | 审核日期 |
| businessdate | string | 否 | 是 | 单据日期 |
| changetypeid | string | 否 | 是 | 变动类型ID |
| changetype | string | 否 | 否 | 变动类型编码id |
| changetype_name | string | 否 | 否 | 变动类型名称 |
| changetype_optionname | string | 否 | 否 | 变动类型对应的optionname |
| showcolumns | string | 是 | 否 | 需要显示的字段 |
| changetype_beforechange | string | 否 | 否 | 变动前字段 |
| changetype_isvoucher | string | 否 | 否 | 是否生成凭证 |
| changetype_afterchange | string | 否 | 否 | 变动后字段 |
| changedate | string | 否 | 否 | 变动日期 |
| auditstatus | string | 否 | 否 | 单据状态，由系统业务自动生成，接口无需传值。 |
| enabled | string | 否 | 否 | 是否可用 |
| isnoweffect | string | 否 | 否 | 是否当期生效, true:是、false:否、 |
| isWfControlled | string | 否 | 否 | 是否工作流控制 |
| verifystate | string | 否 | 否 | 审批状态，由系统业务自动生成，接口无需传值。 |
| returncount | string | 否 | 否 | 返回次数 |
| pubts | string | 否 | 否 | 时间戳 |
| auditorId | string | 否 | 否 | 审批人id |
| auditorId_name | string | 否 | 否 | 审批人名称 |
| currency | string | 否 | 否 | 币种id |
| id | string | 否 | 否 | ID 新增时无需填写，修改时必填 |
| currency_name | string | 否 | 否 | 币种名称 |
| currency_priceDigit | string | 否 | 否 | 币种单价精度 |
| currency_moneyDigit | string | 否 | 否 | 币种金额精度 |
| changetype_code | string | 否 | 否 | 变动方式编码 |
| periodcode | string | 否 | 否 | 会计期间 |
| _status | string | 否 | 是 | 操作标识, Insert:新增、Update:更新 |
| bodies | object | 是 | 是 | 变动单卡片子表 |

## 3. 请求示例

Url: /yonbip/fi/changebill/save?access_token=访问令牌
Body: {
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
		"showcolumns": [
			""
		],
		"changetype_beforechange": "",
		"changetype_isvoucher": "",
		"changetype_afterchange": "",
		"changedate": "",
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
		"_status": "",
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
				"description": "",
				"_status": "",
				"beUserDefs": "",
				"afUserDefs": ""
			}
		]
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| message | string | 否 | 调用失败时的错误信息 |
| data | object | 否 | 调用成功时的返回数据 |
| period | string | 否 | 会计期间ID |
| vouchdate | string | 否 | 单据日期 |
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
| changetypeid | string | 否 | 变动类型ID |
| changetype | string | 否 | 变动类型编码id |
| changetype_name | string | 否 | 变动类型名称 |
| changetype_optionname | string | 否 | 变动类型对应的optionname |
| showcolumns | string | 否 | 需要显示的字段 |
| changetype_beforechange | string | 否 | 变动前字段 |
| changetype_isvoucher | string | 否 | 是否生成凭证 |
| changetype_afterchange | string | 否 | 变动后字段 |
| changedate | string | 否 | 变动日期 |
| description |  | 否 | 变动原因,支持多语 |
| auditstatus | string | 否 | 单据状态 |
| enabled | string | 否 | 是否可用 |
| isnoweffect | string | 否 | 是否当期生效, true:是、false:否、 |
| isWfControlled | string | 否 | 是否工作流控制 |
| verifystate | string | 否 | 审批状态 |
| returncount | string | 否 | 返回次数 |
| pubts | string | 否 | 时间戳 |
| auditorId | string | 否 | 审批人id |
| auditorId_name | string | 否 | 审批人名称 |
| currency | string | 否 | 币种id |
| id | string | 否 | ID |
| currency_name | string | 否 | 币种名称 |
| currency_priceDigit | string | 否 | 币种单价精度 |
| currency_moneyDigit | string | 否 | 币种金额精度 |
| changetype_code | string | 否 | 变动方式编码 |
| periodcode | string | 否 | 会计期间 |
| bodies | object | 是 | 变动单卡片子表 |
| beusedeafdepts | object | 是 | 变动单卡片变动后 |
| beusedepredepts | object | 是 | 变动单卡片变动前 |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"period": "",
		"vouchdate": "",
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
		"description": "",
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
				"afworkloadunit": "",
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
				"description": "",
				"beUserDefs": "",
				"afUserDefs": ""
			}
		],
		"beusedeafdepts": [
			{
				"afusedepredept": "",
				"afusedepredept_name": "",
				"proportion": 0,
				"pubts": "",
				"id": ""
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
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	启用期间为[2020-03]，会计期间不允许小于启用期间


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-06-25

新增

请求参数 beUserDefs

新增

请求参数 afUserDefs

更新

请求参数 (104)

新增

返回参数 beUserDefs

新增

返回参数 afUserDefs

更新

返回参数 (120)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

