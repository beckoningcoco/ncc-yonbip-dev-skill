---
title: "销项发票记账"
apiId: "8b104e9ba3e5477498c9b077b48da51a"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Outbound Enterprise Invoice Folder"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Outbound Enterprise Invoice Folder]
platform_version: "BIP"
source_type: community-api-docs
---

# 销项发票记账

> `ContentType	application/json` 请求方式	POST | 分类: Outbound Enterprise Invoice Folder (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/output-tax/api/invoice-his/account

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
| bills | object | 是 | 否 | 发票详情 |
| fpDm | string | 否 | 否 | 发票代码 示例：121321453513 |
| fpHm | string | 否 | 是 | 发票号码 示例：121313 |
| accountVoucherNo | string | 否 | 否 | 凭证号 示例：1231 |
| srcVoucherId | string | 否 | 否 | 凭证主键(长度不能超过300位) 示例：123123 |
| accountTime | date |
| 格式:yyyy-MM-dd | 否 | 否 | 记账日期 示例：2024-01-01 |
| accountUser | string | 否 | 否 | 记账人 示例：张三 |
| accountNote | string | 否 | 否 | 记账备注 示例：备注 |
| nsrsbh | string | 否 | 否 | 纳税人识别号 示例：21312332 |
| orgCode | string | 否 | 否 | 开票点编码，去开票点档案中查询； 示例：1212 |

## 3. 请求示例

Url: /yonbip/tax/output-tax/api/invoice-his/account?access_token=访问令牌
Body: {
	"bills": [
		{
			"fpDm": "121321453513",
			"fpHm": "121313",
			"accountVoucherNo": "1231",
			"srcVoucherId": "123123",
			"accountTime": "2024-01-01",
			"accountUser": "张三",
			"accountNote": "备注"
		}
	],
	"nsrsbh": "21312332",
	"orgCode": "1212"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| message | string | 否 | 提示信息 示例：操作成功 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

9999	返回错误状态码	系统发生异常错误


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-03

更新

请求说明


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

