---
title: "门店信息添加资金账号接口"
apiId: "2340517354015817732"
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

# 门店信息添加资金账号接口

> `ContentType	application/json` 请求方式	POST | 分类: 门店信息 (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/FCC/revenue/store/storeAccountBatchInsert

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	MDD幂等

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| code | string | 否 | 是 | 门店信息 示例：000015 |
| rev_store_accountList | object | 是 | 否 | 门店关联资金账户 |
| account_type | string | 否 | 是 | 资金账户类型（0:银行账户;1:商户号） |
| account_id | string | 否 | 否 | 银行账号，资金账户类型为银行账户时，必填 |
| merchant_no | string | 否 | 否 | 商户号，资金账户类型为商户号时，必填 |
| enable | string | 否 | 否 | 使用状态，1：启用，0:停用 示例：1 |

## 3. 请求示例

Url: /yonbip/FCC/revenue/store/storeAccountBatchInsert?access_token=访问令牌
Body: {
	"code": "000015",
	"rev_store_accountList": [
		{
			"account_type": "",
			"account_id": "",
			"merchant_no": "",
			"enable": "1"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 状态标识 示例：200 |
| message | string | 否 | 返回描述 示例：操作成功 |
| data | object | 否 | 返回体 |
| count | number |
| 小数位数:0,最大长度:10 | 否 | 总条数 |
| successCount | number |
| 小数位数:0,最大长度:10 | 否 | 成功数量 |
| failCount | number |
| 小数位数:0,最大长度:10 | 否 | 失败数量 |
| messages | object | 是 | 保存失败的数据code及原因 |

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
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-12-11

更新

请求说明

新增

请求参数 account_type

新增

请求参数 merchant_no

更新

请求参数 account_id

删除

请求参数 account_name


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

