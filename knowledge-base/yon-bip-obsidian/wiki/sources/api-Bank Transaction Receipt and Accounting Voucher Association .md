---
title: "银行交易回单与会计凭证关联关系-新增"
apiId: "2362791489070170115"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Archive Accession"
domain: "EAF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Archive Accession]
platform_version: "BIP"
source_type: community-api-docs
---

# 银行交易回单与会计凭证关联关系-新增

> `ContentType	application/json` 请求方式	POST | 分类: Archive Accession (EAF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/FCC/v1/bankReceipt/save/voucherLinkAssist

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
| voucherLinkAssistLists | object | 是 | 否 | 关联信息实体列表 |
| orgCode | string | 否 | 是 | 全宗编码 |
| accountYear | string | 否 | 是 | 会计年 |
| accountMonth | string | 否 | 是 | 会计月 |
| bankAccount | string | 否 | 否 | 银行账号 |
| debitsAccount | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 原币借方发生额 |
| creditAccount | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 原币贷方发生额 |
| voucherDate | string | 否 | 否 | 凭证日期 |
| voucherNumber | string | 否 | 否 | 凭证号 |
| bankName | string | 否 | 否 | 银行名称 |
| currency | string | 否 | 否 | 币种 |

## 3. 请求示例

Url: /yonbip/FCC/v1/bankReceipt/save/voucherLinkAssist?access_token=访问令牌
Body: {
	"voucherLinkAssistLists": [
		{
			"orgCode": "",
			"accountYear": "",
			"accountMonth": "",
			"bankAccount": "",
			"debitsAccount": 0,
			"creditAccount": 0,
			"voucherDate": "",
			"voucherNumber": "",
			"bankName": "",
			"currency": ""
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
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 提示信息 示例：描述信息 |
| data | object | 否 | 响应实体 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "描述信息",
	"data": {}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-12-04

更新

请求说明

新增

请求参数 bankName

新增

请求参数 currency

认证业务插件勾选

2	2025-11-28

更新

请求说明

新增

请求参数 bankName

新增

请求参数 currency

迁移测试环境重新发布


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

