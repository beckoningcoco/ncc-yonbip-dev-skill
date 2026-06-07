---
title: "资源税税源信息-查询"
apiId: "2413318166380806149"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Resource tax source information"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Resource tax source information]
platform_version: "BIP"
source_type: community-api-docs
---

# 资源税税源信息-查询

> `ContentType	application/json` 请求方式	POST | 分类: Resource tax source information (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/FCC/TAX/TAXOHTER/yonbip-fi-taxoth/api/taxRBasic/query

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
| orgCodes | string | 是 | 是 | 税务组织组织编码 |

## 3. 请求示例

Url: /yonbip/FCC/TAX/TAXOHTER/yonbip-fi-taxoth/api/taxRBasic/query?access_token=访问令牌
Body: {
	"orgCodes": [
		""
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 响应码 示例：200 |
| message | string | 否 | 响应信息 示例：操作成功 |
| data | object | 是 | 数据 |
| code | string | 否 | 资源税税源编号 示例：1 |
| taxCode | string | 否 | 应税产品编码 示例：1 |
| taxName | string | 否 | 应税产品名称 示例：1 |
| calcUnit | string | 否 | 计量单位 示例：克 |
| calcTaxType | string | 否 | 计征方式 示例：从价计征 |
| applicableMode | string | 否 | 使用方式 示例：对外销售 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"code": "1",
			"taxCode": "1",
			"taxName": "1",
			"calcUnit": "克",
			"calcTaxType": "从价计征",
			"applicableMode": "对外销售"
		}
	]
}

## 6. 业务异常码

037-502-102999

获取所有的会计主体异常


## 7. 错误返回码

999	组织编码不能为空


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

