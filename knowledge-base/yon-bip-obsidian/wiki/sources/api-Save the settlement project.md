---
title: "结算项目保存"
apiId: "2289154991168421895"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Settlement Item"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Settlement Item]
platform_version: "BIP"
source_type: community-api-docs
---

# 结算项目保存

> `ContentType	application/json` 请求方式	POST | 分类: Settlement Item (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/EFI/revenue/feeProject/batchInsert

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
| rev_fee_category_code | string | 否 | 是 | 结算项目大类编码，编码不存在则先新增大类再新增结算项目，存在则只处理结算项目 示例：tgfy |
| rev_fee_category_name | object | 否 | 否 | 新增时结项项目大类名称必填，如果结算项目大类已存在则可不填 |
| zh_CN | string | 否 | 否 | 中文 |
| en_US | string | 否 | 否 | 英文 |
| zh_TW | string | 否 | 否 | 繁体 |
| creator | string | 否 | 否 | 创建人，传用户id或code；若未传，则为“默认用户”； 示例：99ea7655-00a2-4bda-b23c-19ade37ea574 |
| rev_fee_projectList | object | 是 | 否 | rev_fee_projectList |
| code | string | 否 | 是 | 结算项目编码 示例：000560 |
| name | object | 否 | 是 | 结算项目名称 |
| tax_rate | string | 否 | 是 | 税率 示例：10156 |
| remake | string | 否 | 否 | 备注 |
| enable | string | 否 | 否 | 是否开启，1开启，0关闭 示例：0 默认值：1 |
| settlementType | string | 否 | 是 | 结算类型，1应付，2应收 示例：1 |

## 3. 请求示例

Url: /yonbip/EFI/revenue/feeProject/batchInsert?access_token=访问令牌
Body: [{
	"rev_fee_category_code": "tgfy",
	"rev_fee_category_name": {
		"zh_CN": "",
		"en_US": "",
		"zh_TW": ""
	},
	"creator": "99ea7655-00a2-4bda-b23c-19ade37ea574",
	"rev_fee_projectList": [
		{
			"code": "000560",
			"name": {
				"zh_CN": "",
				"en_US": "",
				"zh_TW": ""
			},
			"tax_rate": "10156",
			"remake": "",
			"enable": "0",
			"settlementType": "1"
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

2	2025-12-11

更新

请求说明

新增

请求参数 (6)

更新

请求参数 rev_fee_category_name

更新

请求参数 name


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

