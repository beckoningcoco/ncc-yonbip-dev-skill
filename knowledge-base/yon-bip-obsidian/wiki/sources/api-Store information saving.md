---
title: "门店信息保存"
apiId: "2144486628584849413"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "门店信息"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, 门店信息]
platform_version: "BIP"
source_type: community-api-docs
---

# 门店信息保存

> `ContentType	application/json` 请求方式	POST | 分类: 门店信息 (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/EFI/revenue/store/batchInsert

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
| id | string | 否 | 否 | 主键，更新时必输 |
| code | string | 否 | 是 | 门店编码 |
| name | object | 否 | 是 | 门店名称 |
| zh_CN | string | 否 | 否 | 中文 |
| en_US | string | 否 | 否 | 英文 |
| zh_TW | string | 否 | 否 | 繁体 |
| sales_org_id | string | 否 | 是 | 业务组织编码，示例：test1 |
| store_status | string | 否 | 是 | 营业状态，0:开店；1:闭店 |
| store_character | string | 否 | 是 | 门店性质，0:加盟；1:直营；2:联营 |
| open_date | date |
| 格式:yyyy-MM-dd | 否 | 否 | 门店开业日期，示例：yyyy-mm-dd |
| detail_address | string | 否 | 否 | 详细地址，示例：建设大道190号建设大厦 |
| store_type | string | 否 | 是 | 门店类型，0:线上;1:线下; |
| enable | string | 否 | 是 | 档案状态，1：启用；0：停用 |
| creator | string | 否 | 否 | 创建人，传用户id或code；若未传，则为“默认用户”； |
| _status | number |
| 小数位数:-1,最大长度:1 | 否 | 否 | 操作标识, 2:新增、1:更新 |
| rev_store_accountList | object | 是 | 否 | 门店关联资金账户 |
| id | string | 否 | 否 | 主键，更新时必输 |
| account_type | string | 否 | 是 | 资金账户类型（0:银行账户;1:商户号） |
| account_id | string | 否 | 否 | 银行账号，资金账户类型为银行账户时，必填 |
| merchant_no | string | 否 | 否 | 商户号，资金账户类型为商户号时，必填 |
| _status | string | 否 | 否 | 操作标识, 2:新增、1:更新、3：删除 |
| enable | string | 否 | 否 | 使用状态，1：启用；0：停用 |

## 3. 请求示例

Url: /yonbip/EFI/revenue/store/batchInsert?access_token=访问令牌
Body: [{
	"id": "",
	"code": "",
	"name": {
		"zh_CN": "",
		"en_US": "",
		"zh_TW": ""
	},
	"sales_org_id": "",
	"store_status": "",
	"store_character": "",
	"open_date": "2026-06-07",
	"detail_address": "",
	"store_type": "",
	"enable": "",
	"creator": "",
	"_status": 0,
	"rev_store_accountList": [
		{
			"id": "",
			"account_type": "",
			"account_id": "",
			"merchant_no": "",
			"_status": "",
			"enable": ""
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
| count | int | 否 | 总条数 |
| successCount | int | 否 | 成功数量 |
| failCount | int | 否 | 失败数量 |
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
				"sourceUnique": "",
				"message": ""
			}
		],
		"infos": [
			{
				"data": {
					"sourceUnique": "",
					"targetUnique": ""
				}
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

20000000	接口请求异常	接口返回信息处理


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-04-02

更新

请求说明

2	2025-12-16

更新

请求说明

新增

请求参数 (5)

更新

请求参数 name

更新

请求参数 account_id

3	2025-07-31

新增

请求参数 character_define

4	2025-06-25

更新

请求参数 store_status


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

