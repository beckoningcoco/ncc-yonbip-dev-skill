---
title: "账户冻结审批"
apiId: "1908464852697874432"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Freeze Account"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Freeze Account]
platform_version: "BIP"
source_type: community-api-docs
---

# 账户冻结审批

> `ContentType	application/json` 请求方式	POST | 分类: Freeze Account (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/bam/accountFreeze/batchSave

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
| code | string | 否 | 否 | 单据编码 示例：BAMFRE202401161054 |
| currency | string | 否 | 是 | 币种 示例：CNY |
| bankAccont | string | 否 | 是 | 银行账号 示例：0001 |
| freezeDate | date |
| 格式:yyyy-MM-dd | 否 | 是 | 冻结日期 示例：2024-01-15 |
| freezeType | string | 否 | 是 | 冻结类型 枚举：1全部冻结，2部分冻结 示例：1 |
| freezeControl | string | 否 | 否 | 冻结控制 枚举：1只收不付，2不收不付；当冻结类型为部分冻结时，不传该字段；当冻结类型为全部冻结时，传 只收不付1， 不收不付2 示例：1 |
| frozenAmount | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 冻结金额 示例：10.00 |
| freezePeriodStart | date |
| 格式:yyyy-MM-dd | 否 | 否 | 冻结开始日期 示例：2024-01-15 |
| freezePeriodEnd | date |
| 格式:yyyy-MM-dd | 否 | 否 | 冻结结束日期 示例：2024-01-15 |
| courtNumber | string | 否 | 否 | 法院文号 示例：XC1001 |
| freezeReason | string | 否 | 否 | 冻结原因 示例：冻结原因是 |
| requestSeqNo | string | 否 | 否 | 请求流水号 |

## 3. 请求示例

Url: /yonbip/ctm/bam/accountFreeze/batchSave?access_token=访问令牌
Body: [{
	"code": "BAMFRE202401161054",
	"currency": "CNY",
	"bankAccont": "0001",
	"freezeDate": "2024-01-15",
	"freezeType": "1",
	"freezeControl": "1",
	"frozenAmount": 10,
	"freezePeriodStart": "2024-01-15",
	"freezePeriodEnd": "2024-01-15",
	"courtNumber": "XC1001",
	"freezeReason": "冻结原因是",
	"requestSeqNo": ""
}]

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| code | string | 否 | 接口返回码 示例：200 |
| message | string | 否 | 返回消息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| data | object | 是 | 各vo结果 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"data": [
			{
				"bankNo": "",
				"code": "",
				"message": "",
				"requestSeqNo": "",
				"currency": ""
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

200	成功

500	失败


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

