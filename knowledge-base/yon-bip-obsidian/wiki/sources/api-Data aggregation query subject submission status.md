---
title: "数据归集查询主体提交状态"
apiId: "1877409842562334722"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "EPM Data Pipeline"
domain: "EPM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, EPM Data Pipeline]
platform_version: "BIP"
source_type: community-api-docs
---

# 数据归集查询主体提交状态

> `ContentType	application/json` 请求方式	POST | 分类: EPM Data Pipeline (EPM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/qyjx/entity/mapping/openApi

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
| cubeCode | string | 否 | 是 | 模型编码 |
| sysCode | string | 否 | 是 | 外部系统编码 |
| ruleCode | string | 否 | 否 | 导入规则编码 |
| mappingPeriod | string | 否 | 否 | 映射期间 |
| periodType | string | 否 | 是 | 期间类型 |
| sPeriodYear | string | 否 | 是 | 源期间年 |
| sPeriodMonth | string | 否 | 是 | 源期间月 示例：01 |
| sDimValList | string | 是 | 是 | 源主体编码集合 示例：["textEntity"] |

## 3. 请求示例

Url: /yonbip/qyjx/entity/mapping/openApi?access_token=访问令牌
Body: {
	"cubeCode": "",
	"sysCode": "",
	"ruleCode": "",
	"mappingPeriod": "",
	"periodType": "",
	"sPeriodYear": "",
	"sPeriodMonth": "01",
	"sDimValList": [
		"textEntity"
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| textEntity(非固定key,为传入的主体或者账簿,可以为多个) | string | 否 | 传入的主体或者账簿 示例：true |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"textEntity(非固定key,为传入的主体或者账簿,可以为多个)": "true"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

102	未查询到目标期间	未查询到目标期间

103	未查询到应用模型编码	未查询到应用模型编码

104	未查询到外部系统编码	未查询到外部系统编码

105	未查询到导入规则编码	未查询到导入规则编码

106	未查询到映射期间编码	未查询到映射期间编码

107	源主体编码为空	源主体编码为空


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-03-26

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

