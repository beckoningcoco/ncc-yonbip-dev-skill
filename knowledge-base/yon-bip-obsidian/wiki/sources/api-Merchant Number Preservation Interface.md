---
title: "商户号保存接口"
apiId: "2319714413620232193"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "商户号"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, 商户号]
platform_version: "BIP"
source_type: community-api-docs
---

# 商户号保存接口

> `ContentType	application/json` 请求方式	POST | 分类: 商户号 (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/FCC/revenue/merchant/batchInsert

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	MDD幂等

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| code | string | 否 | 是 | 商户号 示例：123 |
| name | object | 否 | 是 | 商户号名称 |
| zh_CN | string | 否 | 否 | 中文 |
| en_US | string | 否 | 否 | 英文 |
| zh_TW | string | 否 | 否 | 繁体 |
| payment_channel_id | string | 否 | 否 | 支付渠道，传id或code 示例：1703180190540103689 |
| sales_org_id | string | 否 | 是 | 销售组织，传id或code 示例：1528682489709592585 |
| open_bank_link | boolean | 否 | 否 | 是否开通银企联 示例：false 默认值：false |
| bank_link_no | string | 否 | 否 | 银企联客户号 示例：4396 |
| parent | string | 否 | 否 | 上级商户号，传id或code 示例：001 |
| remark | string | 否 | 否 | 备注 示例：备注 |
| creator | string | 否 | 否 | 创建人，传用户id或code；若未传，则为“默认用户” 示例：13918408065 |
| enable | string | 否 | 否 | 档案状态，1：启用；0：停用 示例：1 默认值：1 |
| rev_merchant_bankList | object | 是 | 否 | rev_merchant_bankList |
| bank_account_id | string | 否 | 否 | 银行账号，传入银行账号 示例：4365768768 |
| default_flag | string | 否 | 否 | 是否默认，0否，1是 示例：1 |

## 3. 请求示例

Url: /yonbip/FCC/revenue/merchant/batchInsert?access_token=访问令牌
Body: [{
	"code": "123",
	"name": {
		"zh_CN": "",
		"en_US": "",
		"zh_TW": ""
	},
	"payment_channel_id": "1703180190540103689",
	"sales_org_id": "1528682489709592585",
	"open_bank_link": false,
	"bank_link_no": "4396",
	"parent": "001",
	"remark": "备注",
	"creator": "13918408065",
	"enable": "1",
	"rev_merchant_bankList": [
		{
			"bank_account_id": "4365768768",
			"default_flag": "1"
		}
	]
}]

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 状态标识 示例：200 |
| message | string | 否 | 提示信息 示例：操作成功 |
| data | object | 否 | 响应体 |
| count | number |
| 小数位数:0,最大长度:10 | 否 | 总条数 |
| successCount | number |
| 小数位数:0,最大长度:10 | 否 | 成功数量 |
| failCount | number |
| 小数位数:0,最大长度:10 | 否 | 失败数量 |
| messages | object | 是 | 保存失败的数据ID及原因 |
| infos | object | 是 | 保存成功的数据集合 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 0,
		"successCount": 0,
		"failCount": 0,
		"messages": [
			{
				"code": "",
				"message": ""
			}
		],
		"infos": [
			{
				"data": {
					"code": "",
					"message": ""
				}
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-04-02

更新

请求说明

2	2025-12-19

新增

请求参数 zh_CN

新增

请求参数 en_US

新增

请求参数 zh_TW

更新

请求参数 name

更新

请求参数 sales_org_id

更新

请求参数 bank_account_id

改销售组织必填


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

