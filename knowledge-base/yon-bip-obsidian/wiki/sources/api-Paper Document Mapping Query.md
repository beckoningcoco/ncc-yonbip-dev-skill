---
title: "实物单据映射查询"
apiId: "1980473174875701250"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Paper Document Mapping"
domain: "SSC"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Paper Document Mapping]
platform_version: "BIP"
source_type: community-api-docs
---

# 实物单据映射查询

> `ContentType	application/json` 请求方式	POST | 分类: Paper Document Mapping (SSC)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ssc/pdm/openapi/getPdmBillMapping

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
| data | object | 否 | 是 | 请求参数 |
| billNum | string | 否 | 否 | 单据编码，与单据类型ID任选其一 示例：znbz****bill |
| billType | string | 否 | 否 | 单据类型ID，与单据编码任选其一 示例：19870****4720 |

## 3. 请求示例

Url: /yonbip/ssc/pdm/openapi/getPdmBillMapping?access_token=访问令牌
Body: {
	"data": {
		"billNum": "znbz****bill",
		"billType": "19870****4720"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 请求返回编码 示例：200 |
| message | string | 否 | 请求返回信息 示例：操作成功 |
| data | object | 否 | 请求返回数据 |
| billTypeCode | string | 否 | 单据类型：单据类型编码 示例：znbz****bill |
| billTypeName | string | 否 | 单据类型：单据类型名称 示例：通用****单 |
| transTypeMapping | string | 否 | 交易类型映射 示例：{"id":"transType","name":"交易类型ID"} |
| orgMapping | string | 否 | 交单组织映射 示例：{"id":"chandleorg","name":"报销人组织"} |
| deptMapping | string | 否 | 交单部门映射 示例：{"id":"vhandledeptid","name":"报销人部门"} |
| submitterMapping | string | 否 | 交单人映射 示例："{"id":"creatorId.id","name":"创建人.ID"}" |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"billTypeCode": "znbz****bill",
		"billTypeName": "通用****单",
		"transTypeMapping": "{\"id\":\"transType\",\"name\":\"交易类型ID\"}",
		"orgMapping": "{\"id\":\"chandleorg\",\"name\":\"报销人组织\"}",
		"deptMapping": "{\"id\":\"vhandledeptid\",\"name\":\"报销人部门\"}",
		"submitterMapping": "\"{\"id\":\"creatorId.id\",\"name\":\"创建人.ID\"}\""
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

036-507-020001	服务端逻辑异常	服务端报错，请联系开发人员

036-507-020004	操作失败，xxx参数不能为空	缺少必要参数，请补全

036-507-020016	未购买实物管理服务授权许可，请尽快加购/实物管理授权许可已过期，请及时续费	实物管理许可未购买或者不在许可期间内，需要加购实物管理


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2024-08-26

新增

错误码 (4)

删除

错误码 (4)

异常规范专项，修改异常码格式


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

