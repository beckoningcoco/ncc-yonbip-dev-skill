---
title: "卡券账单批量新增"
apiId: "2032412454909116422"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Card bill pool"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Card bill pool]
platform_version: "BIP"
source_type: community-api-docs
---

# 卡券账单批量新增

> `ContentType	application/json` 请求方式	POST | 分类: Card bill pool (EFI)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/AMP/revenue/revCouponBill/insertBatch

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	批量保存/更新

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| sales_org_id | string | 否 | 是 | 销售组织，传id或code，示例：000001 示例：1525652227072458756 |
| sales_channel_id | string | 否 | 是 | 销售渠道，传id或code，示例：000047 示例：1841039629899792407 |
| payment_channel_id | string | 否 | 是 | 支付渠道，传id或code，示例：000006 示例：1841039629899792403 |
| serial_no | string | 否 | 否 | 流水号，示例: 123123 示例：123123 |
| trans_date | date |
| 格式:yyyy-MM-dd | 否 | 是 | 交易日期，示例: 2024-06-25 示例：2024-06-25 |
| busi_date | date |
| 格式:yyyy-MM-dd | 否 | 是 | 账务日期，该交易的账务处理日期，一般用交易日期赋值 示例：2024-06-25 |
| merchant_no | string | 否 | 否 | 商户号，发卡机构给每个企业分配商户号 示例：2342314223 |
| store_id | string | 否 | 是 | 门店，传id或code，示例：000046 示例：1909205081603440647 |
| trans_amt | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 交易金额 示例：100 |
| coupon_no | string | 否 | 是 | 卡券号，示例: hsp001 示例：hsp001 |
| coupon_name | string | 否 | 是 | 卡券名称，示例: 测试卡券 示例：测试卡券 |
| coupon_type | string | 否 | 是 | 卡券类型，0：电子卡；1：实体卡；2：电子券；3：实体券 示例：0 |
| busi_no | string | 否 | 否 | 业务单号，账单数据可能存在多个单号，指定一个单号作为数据追踪。若为汇总交易，则按规则编码，，用作数据追踪。 示例：3151351 |
| trans_time | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 交易时间，格式：yyyy-mm-dd hh:mm:ss 示例：2024-06-25 09:48:51 |
| batch_no | string | 否 | 否 | 批次号，映射来源单据字段的批次号 |
| effective_date | date |
| 格式:yyyy-MM-dd | 否 | 否 | 生效日期，格式：yyyy-mm-dd 示例：2024-06-25 |
| expiration_date | date |
| 格式:yyyy-MM-dd | 否 | 否 | 到期日期，格式：yyyy-mm-dd 示例：2024-06-29 |
| remark | string | 否 | 否 | 备注 |
| source_unique | string | 否 | 否 | 来源数据唯一标识，映射“来源单据的ID字段” 示例：123456789 |
| id | string | 否 | 否 | id 示例：45678757868 |
| currency_id | string | 否 | 是 | 币种，传id或code，示例：CNY 示例：CNY |
| amount | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 数量 |
| pool_coupon_rec_status | string | 否 | 否 | 卡券对账状态，无需对账传13，未对账传11，不传默认为未对账 |

## 3. 请求示例

Url: /yonbip/AMP/revenue/revCouponBill/insertBatch?access_token=访问令牌
Body: [{
	"sales_org_id": "1525652227072458756",
	"sales_channel_id": "1841039629899792407",
	"payment_channel_id": "1841039629899792403",
	"serial_no": "123123",
	"trans_date": "2024-06-25",
	"busi_date": "2024-06-25",
	"merchant_no": "2342314223",
	"store_id": "1909205081603440647",
	"trans_amt": 100,
	"coupon_no": "hsp001",
	"coupon_name": "测试卡券",
	"coupon_type": "0",
	"busi_no": "3151351",
	"trans_time": "2024-06-25 09:48:51",
	"batch_no": "",
	"effective_date": "2024-06-25",
	"expiration_date": "2024-06-29",
	"remark": "",
	"source_unique": "123456789",
	"id": "45678757868",
	"currency_id": "CNY",
	"amount": 0,
	"pool_coupon_rec_status": ""
}]

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | code 示例：200 |
| message | string | 否 | message |
| data | object | 否 | data |
| count | number |
| 小数位数:0,最大长度:10 | 否 | count 示例：0 |
| successCount | number |
| 小数位数:0,最大长度:10 | 否 | successCount 示例：0 |
| failCount | number |
| 小数位数:0,最大长度:10 | 否 | failCount 示例：0 |
| messages | object | 否 | messages |
| infos | object | 否 | infos |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"count": 0,
		"successCount": 0,
		"failCount": 0,
		"messages": {
			"message": "",
			"sourceUnique": ""
		},
		"infos": {
			"data": {
				"sourceUnique": "",
				"targetUnique": ""
			}
		}
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-06-25

新增

请求参数 pool_coupon_rec_status

删除

请求参数 coupon_rec_status


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

