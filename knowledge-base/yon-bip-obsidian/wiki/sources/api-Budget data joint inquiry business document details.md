---
title: "预算数据联查业务单据明细"
apiId: "1711871469260636169"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Budget Execution Control"
domain: "EPM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Budget Execution Control]
platform_version: "BIP"
source_type: community-api-docs
---

# 预算数据联查业务单据明细

> `ContentType	application/json` 请求方式	POST | 分类: Budget Execution Control (EPM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/qyjx/yonbip-fi-sepmbcdc/execdata/openQueryBuisBillInfo

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
| cubeCode | string | 否 | 是 | 模型编码 示例：openCube |
| sysCode | string | 否 | 是 | 系统编码 示例：openSys |
| pageIndex | long | 否 | 是 | 当前页码 示例：1 |
| pageNum | long | 否 | 是 | 页码总数 示例：10 |
| dimData | object | 否 | 是 | 查询条件（以下条件为示例条件，具体值由用户注册决定） |
| cfinaceorg | string | 否 | 否 | 示例维度主体 示例：1788263463746734676 |
| vfinacedeptid | string | 否 | 否 | 示例维度币种 示例：1878236476374673452 |
| pk_busimemo | string | 否 | 否 | 示例维度预留字段 示例：1967254345755782364 |
| pk_project | string | 否 | 否 | 示例维度项目 示例：1989128658262637255 |
| pk_cusdoc | string | 否 | 否 | 示例维度科目 示例：1882452472638797233 |
| month | string | 否 | 否 | 示例维度期间（月） 示例：12 |
| pk_customer | string | 否 | 否 | 示例维度客户 示例：1988934783868346386 |

## 3. 请求示例

Url: /yonbip/qyjx/yonbip-fi-sepmbcdc/execdata/openQueryBuisBillInfo?access_token=访问令牌
Body: {
	"cubeCode": "openCube",
	"sysCode": "openSys",
	"pageIndex": 1,
	"pageNum": 10,
	"dimData": {
		"cfinaceorg": "1788263463746734676",
		"vfinacedeptid": "1878236476374673452",
		"pk_busimemo": "1967254345755782364",
		"pk_project": "1989128658262637255",
		"pk_cusdoc": "1882452472638797233",
		"month": "12",
		"pk_customer": "1988934783868346386"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 响应码 示例：200 |
| data | object | 否 | 数据集合 |
| data | object | 否 | 内部数据集合 |

## 5. 正确返回示例

{
	"code": "200",
	"data": {
		"data": {
			"pageInfo": {
				"total": 13,
				"pageIndex": 1,
				"totalPage": 2,
				"pageSize": 10
			},
			"rows": [
				{
					"values": {
						"busiSysName": {
							"display": "报账服务",
							"scale": -1,
							"value": "报账服务"
						},
						"billTypeCode": {
							"display": "znbzbx_expensebill",
							"scale": -1,
							"value": "znbzbx_expensebill"
						},
						"billOpeationDate": {
							"display": "2023-04-07 00:00:00",
							"scale": -1,
							"value": "2023-04-07 00:00:00"
						},
						"serviceCode": {
							"display": "znbzbx_expensebilllist",
							"scale": -1,
							"value": "znbzbx_expensebilllist"
						},
						"line": {
							"display": "1",
							"scale": -1,
							"value": "1"
						},
						"fetchRuleCode": {
							"display": "",
							"scale": -1,
							"value": ""
						},
						"billid": {
							"display": "1697703995657158663",
							"scale": -1,
							"value": "1697703995657158663"
						},
						"action": {
							"display": "预占",
							"scale": -1,
							"value": "预占"
						},
						"ruleName": {
							"display": "Lucy测试规则",
							"scale": -1,
							"value": "Lucy测试规则"
						},
						"ruleId": {
							"display": "1686661574618513411",
							"scale": -1,
							"value": "1686661574618513411"
						},
						"transacCode": {
							"display": "RBSM005",
							"scale": -1,
							"value": "RBSM005"
						},
						"billTypeId": {
							"display": "1682926567967162424",
							"scale": -1,
							"value": "1682926567967162424"
						},
						"busiSysId": {
							"display": "1682926567967162371",
							"scale": -1,
							"value": "1682926567967162371"
						},
						"actual": {
							"display": "0",
							"scale": -1,
							"value": "0"
						},
						"billLineId": {
							"display": "",
							"scale": -1,
							"value": ""
						},
						"ctrlRuleCode": {
							"display": "LucyRule",
							"scale": -1,
							"value": "LucyRule"
						},
						"ruleCode": {
							"display": "LucyRule",
							"scale": -1,
							"value": "LucyRule"
						},
						"ctrlRuleName": {
							"display": "Lucy测试规则",
							"scale": -1,
							"value": "Lucy测试规则"
						},
						"beforeActual": {
							"display": "1.0",
							"scale": -1,
							"value": "1.0"
						},
						"fetchRuleName": {
							"display": "",
							"scale": -1,
							"value": ""
						},
						"transacName": {
							"display": "通用报销单",
							"scale": -1,
							"value": "通用报销单"
						},
						"busiSysCode": {
							"display": "RBSM",
							"scale": -1,
							"value": "RBSM"
						},
						"billTypeName": {
							"display": "通用报销单",
							"scale": -1,
							"value": "通用报销单"
						},
						"billno": {
							"display": "GRRD230407000001",
							"scale": -1,
							"value": "GRRD230407000001"
						},
						"transacId": {
							"display": "1682926628096704517",
							"scale": -1,
							"value": "1682926628096704517"
						}
					},
					"rowId": "0"
				}
			],
			"allpks": [
				"2"
			]
		}
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

500	系统编码都不能为空	系统编码都不能为空


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

