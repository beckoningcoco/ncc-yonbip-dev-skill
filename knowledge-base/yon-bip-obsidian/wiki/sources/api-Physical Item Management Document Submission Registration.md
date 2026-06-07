---
title: "实物管理交单登记"
apiId: "1980462437457461257"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Document Submission Registration"
domain: "SSC"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Document Submission Registration]
platform_version: "BIP"
source_type: community-api-docs
---

# 实物管理交单登记

> `ContentType	application/json` 请求方式	POST | 分类: Document Submission Registration (SSC)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ssc/pdm/openapi/docRegister

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	MDD幂等

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 否 | 是 | 请求参数 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| billNum | string | 否 | 否 | 单据编码，与单据类型ID任选其一 示例：znbz****bill |
| billType | string | 否 | 否 | 单据类型ID，与单据编码任选其一 示例：19870****4720 |
| billId | string | 否 | 是 | 单据ID 示例：19650****5410 |
| docPage | number |
| 小数位数:0,最大长度:5 | 否 | 否 | 实物张数 示例：1 |
| operator | string | 否 | 否 | 登记人，支持传入员工ID或者用户ID 示例：18782****6182 |

## 3. 请求示例

Url: /yonbip/ssc/pdm/openapi/docRegister?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"billNum": "znbz****bill",
		"billType": "19870****4720",
		"billId": "19650****5410",
		"docPage": 1,
		"operator": "18782****6182"
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
| billTypeName | string | 否 | 单据类型：单据类型名称 示例：通用****单 |
| billCode | string | 否 | 单据编号：登记成功的单据编号 示例：TYG*******0001 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"billTypeName": "通用****单",
		"billCode": "TYG*******0001"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

036-507-020001	服务端逻辑异常	服务端报错，请联系开发人员

036-507-020002	当前数据正在被新增或修改，请稍后再试	并发错误，请检查单据状态，重新操作

036-507-020004	操作失败，xxx参数不能为空	缺少必要参数，请补全

036-507-020012	实物登记失败，非交单已登记状态的单据不允许再次登记	单据已登记，且当前单据状态不允许再次登记

036-507-020016	未购买实物管理服务授权许可，请尽快加购/实物管理授权许可已过期，请及时续费	实物管理许可未购买或者不在许可期间内，需要加购实物管理

036-507-020018	实物登记失败，无法获取可被登记的单据	根据单据编码和单据id未找到对应单据，请检查单据是否存在

036-507-020019	实物登记失败，根据参数xxx未查询到匹配的员工	根据请求参数中的登记人字段未查询到对应的员工信息

036-507-020003	操作失败，请联系系统管理员修改API调用设置，将实物管理API关联的用户身份修改为员工	API调用受限，请联系管理员将API关联的用户身份修改为员工


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

