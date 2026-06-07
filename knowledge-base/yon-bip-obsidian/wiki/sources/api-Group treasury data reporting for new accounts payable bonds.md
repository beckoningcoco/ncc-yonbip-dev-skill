---
title: "集团司库数据上报应付债券整单新增"
apiId: "2184684936802336775"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Regulatory Reporting"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Regulatory Reporting]
platform_version: "BIP"
source_type: community-api-docs
---

# 集团司库数据上报应付债券整单新增

> `ContentType	application/json` 请求方式	POST | 分类: Regulatory Reporting (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/submit/api/group/paybond/bill/insert

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
| dataDate | string | 否 | 是 | 数据日期 |
| submitType | string | 否 | 是 | 报送业务类型 PAY_BOND 示例：PAY_BOND |
| detailList | object | 是 | 是 | 明细 |
| submitGroupCreditCode | string | 否 | 是 | 所属集团编码 |
| submitGroupName | string | 否 | 是 | 所属集团名称 |
| dataSource | string | 否 | 是 | 数据来源 MANUAL_INPUT手工录入 FINANCE_MANG 融资管理 FINANCE_MANG_REVIS 融资管理修订 |
| sourceId | string | 否 | 是 | 外部数据来源id |
| bondNumber | string | 否 | 是 | 债券代码 |
| bondName | string | 否 | 是 | 债券名称 |
| bondClass | string | 否 | 是 | 债券类型 |
| accentityName | string | 否 | 是 | 发债主体名称 |
| currency | string | 否 | 是 | 币种 |
| beginDate | string | 否 | 是 | 发行起始日期 |
| bondAmount | number |
| 小数位数:2,最大长度:32 | 否 | 是 | 发行规模 |
| bondRate | number |
| 小数位数:2,最大长度:32 | 否 | 是 | 票面利率 |
| term | string | 否 | 是 | 期限 |
| bondBalance | number |
| 小数位数:2,最大长度:32 | 否 | 是 | 债券余额 |
| countryzone | string | 否 | 是 | 融资国家地区id |

## 3. 请求示例

Url: /yonbip/ctm/submit/api/group/paybond/bill/insert?access_token=访问令牌
Body: {
	"dataDate": "",
	"submitType": "PAY_BOND",
	"detailList": [
		{
			"submitGroupCreditCode": "",
			"submitGroupName": "",
			"dataSource": "",
			"sourceId": "",
			"bondNumber": "",
			"bondName": "",
			"bondClass": "",
			"accentityName": "",
			"currency": "",
			"beginDate": "",
			"bondAmount": 0,
			"bondRate": 0,
			"term": "",
			"bondBalance": 0,
			"countryzone": ""
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
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

暂时没有数据哦~


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

