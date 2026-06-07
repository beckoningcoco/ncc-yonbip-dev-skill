---
title: "当前税号税期查询"
apiId: "1759459681137328130"
apiPath: "请求方式	GET"
method: "ContentType"
category: "Input Tax Invoice Management"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Input Tax Invoice Management]
platform_version: "BIP"
source_type: community-api-docs
---

# 当前税号税期查询

> `ContentType` 请求方式	GET | 分类: Input Tax Invoice Management (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/invoiceclient-web/api/vat/period

请求方式	GET

ContentType

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| nsrsbh | string | query | 是 | 纳税人识别号    示例: 111 |

## 3. 请求示例

Url: /yonbip/tax/invoiceclient-web/api/vat/period?access_token=访问令牌&nsrsbh=111

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
| data | object | 否 | 数据 |
| expirationDate | string | 否 | 当前税期截止日期，一般为次月15号（yyyyMMdd） 查询成功时才返回 示例：20200615 |
| period | string | 否 | 税期（yyyyMM） 查询成功时才返回 示例：202005 |
| message | string | 否 | 消息 示例：SUCCESS |

## 5. 正确返回示例

{
	"code": "200",
	"data": {
		"expirationDate": "20200615",
		"period": "202005"
	},
	"message": "SUCCESS"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

9999	未知错误	按返回信息处理


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-04-21

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

