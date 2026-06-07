---
title: "支付渠道保存"
apiId: "2154278509788790786"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "支付渠道"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, 支付渠道]
platform_version: "BIP"
source_type: community-api-docs
---

# 支付渠道保存

> `ContentType	application/json` 请求方式	POST | 分类: 支付渠道 (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/EFI/revenue/paymentChannel/batchInsert

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
| code | string | 否 | 是 | 支付渠道编码 |
| name | object | 否 | 是 | 支付渠道名称 |
| zh_CN | string | 否 | 否 | 中文 |
| en_US | string | 否 | 否 | 英文 |
| zh_TW | string | 否 | 否 | 繁体 |
| liquidation_date_type | string | 否 | 否 | 清算日期类型，单选；枚举增加：周期清算、固定日清算、按日清算 |
| liquidation_date | string | 否 | 否 | 偏移量，单选 |
| cycle_val | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 周期，短整数 |
| fixed_days | string | 否 | 否 | 固定日，单选 |
| holiday_handle_type | string | 否 | 否 | 节假日处理类型，单选；(0：忽略，1：顺延下个工作日) |
| parent_payment_channel_id | string | 否 | 否 | 上级支付渠道 |
| remark | string | 否 | 否 | 备注，文本 |
| enable | string | 否 | 是 | 档案状态，1：启用；0：停用 |
| creator | string | 否 | 否 | 创建人，传用户id或code；若未传，则为“默认用户”； |

## 3. 请求示例

Url: /yonbip/EFI/revenue/paymentChannel/batchInsert?access_token=访问令牌
Body: [{
	"code": "",
	"name": {
		"zh_CN": "",
		"en_US": "",
		"zh_TW": ""
	},
	"liquidation_date_type": "",
	"liquidation_date": "",
	"cycle_val": 0,
	"fixed_days": "",
	"holiday_handle_type": "",
	"parent_payment_channel_id": "",
	"remark": "",
	"enable": "",
	"creator": ""
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

新增

请求参数 (6)

更新

请求参数 (9)

2	2025-11-11

新增

请求参数 zh_CN

新增

请求参数 en_US

新增

请求参数 zh_TW

更新

请求参数 name

3	2025-10-14

新增

请求参数 parent_payment_channel_id

新增上级支付渠道字段保存


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

