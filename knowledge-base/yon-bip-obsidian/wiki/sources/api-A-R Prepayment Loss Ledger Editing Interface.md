---
title: "《应收预付损失台账》编辑接口"
apiId: "2055516604411150338"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Accounts receivable bad debt loss account"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Accounts receivable bad debt loss account]
platform_version: "BIP"
source_type: community-api-docs
---

# 《应收预付损失台账》编辑接口

> `ContentType	application/json` 请求方式	POST | 分类: Accounts receivable bad debt loss account (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/other-tax/api/tax-s-rec-loss/batch-edit

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 是 | 否 | 入参数据 |
| taxBasics | number |
| 小数位数:2,最大长度:15 | 否 | 是 | 计税基础 |
| nature | string | 否 | 是 | 账务处理方式 示例：1.损失直接计入本年损益 2.核销坏账准备 |
| lossType | string | 否 | 是 | 损失性质 示例：1.应收账款损失 2.预付账款损失 |
| dealAdjustAmt | number |
| 小数位数:2,最大长度:15 | 否 | 否 | 处置收入调整金额 |
| dealAccountAmt | number |
| 小数位数:2,最大长度:15 | 否 | 否 | 处置收入账载金额 |
| cusName | string | 否 | 是 | 客户/供应商名称 |
| cusCode | string | 否 | 是 | 客户/供应商编码 |
| compensateAdjustAmt | number |
| 小数位数:2,最大长度:15 | 否 | 否 | 赔偿收入调整金额 |
| compensateAccountAmt | number |
| 小数位数:2,最大长度:15 | 否 | 否 | 赔偿收入账载金额 |
| arriveDate | string | 否 | 是 | 到账日期 示例：2024-07-01 |
| adjustAmt | number |
| 小数位数:2,最大长度:15 | 否 | 是 | 调整金额 |
| accountDate | string | 否 | 是 | 记账日期 示例：2024-07-01 |
| accountAmt | number |
| 小数位数:2,最大长度:15 | 否 | 是 | 账载金额 |
| projectCode | string | 否 | 否 | 项目编码 |
| id | string | 否 | 是 | 主键id |

## 3. 请求示例

Url: /yonbip/tax/other-tax/api/tax-s-rec-loss/batch-edit?access_token=访问令牌
Body: {
	"data": [
		{
			"taxBasics": 0,
			"nature": "1.损失直接计入本年损益 2.核销坏账准备",
			"lossType": "1.应收账款损失 2.预付账款损失",
			"dealAdjustAmt": 0,
			"dealAccountAmt": 0,
			"cusName": "",
			"cusCode": "",
			"compensateAdjustAmt": 0,
			"compensateAccountAmt": 0,
			"arriveDate": "2024-07-01",
			"adjustAmt": 0,
			"accountDate": "2024-07-01",
			"accountAmt": 0,
			"projectCode": "",
			"id": ""
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 状态码 示例：0000 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| data | object | 是 | 返回对象 |
| count | number |
| 小数位数:0,最大长度:10 | 否 | 总条数 示例：2 |
| successCount | number |
| 小数位数:0,最大长度:10 | 否 | 成功条数 示例：1 |
| failCount | number |
| 小数位数:0,最大长度:10 | 否 | 失败条数 示例：1 |
| infos | object | 是 | 成功数据 |
| messages | object | 是 | 失败数据 |
| message | string | 否 | 提示信息 示例：操作成功 |

## 5. 正确返回示例

{
	"code": "0000",
	"data": [
		{
			"count": 2,
			"successCount": 1,
			"failCount": 1,
			"infos": [
				{
					"sourceUnique": "1",
					"id": "1"
				}
			],
			"messages": [
				{
					"sourceUnique": "1",
					"message": "依据组织编码【1】查询组织为空"
				}
			]
		}
	],
	"message": "操作成功"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

9999	系统异常	错误提示信息


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

