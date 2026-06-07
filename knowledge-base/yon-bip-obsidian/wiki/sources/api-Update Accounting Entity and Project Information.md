---
title: "更新会计主体与项目信息"
apiId: "2165261316589617152"
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

# 更新会计主体与项目信息

> `ContentType	application/json` 请求方式	POST | 分类: Outbound Enterprise Invoice Folder (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/output-tax/api/invoice-his/updateProjectAndOrgCode

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
| data | object | 是 | 否 | 入参 最大请求量：200 |
| fpHm | string | 否 | 是 | 发票号码 示例：123123 |
| fpDm | string | 否 | 否 | 发票代码 示例：123 |
| xsfNsrsbh | string | 否 | 否 | 销售方纳税人识别号 示例：12311 |
| orgCode | string | 否 | 否 | 开票点编码 示例：123 |
| finOrgCode | string | 否 | 否 | 会计主体编码 示例：2222 |
| projectCode | string | 否 | 否 | 项目编码 示例：111 |
| wbsCode | string | 否 | 否 | wbs编码 示例：111 |

## 3. 请求示例

Url: /yonbip/tax/output-tax/api/invoice-his/updateProjectAndOrgCode?access_token=访问令牌
Body: {
	"data": [
		{
			"fpHm": "123123",
			"fpDm": "123",
			"xsfNsrsbh": "12311",
			"orgCode": "123",
			"finOrgCode": "2222",
			"projectCode": "111",
			"wbsCode": "111"
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
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| message | string | 否 | 信息说明 示例：操作成功 |

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

