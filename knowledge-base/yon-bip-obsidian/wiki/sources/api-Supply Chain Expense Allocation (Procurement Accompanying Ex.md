---
title: "供应链费用单分摊（采购随单费用）"
apiId: "1994014760058748929"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Supply Chain Expense Document"
domain: "SCCS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Supply Chain Expense Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 供应链费用单分摊（采购随单费用）

> `ContentType	application/json` 请求方式	POST | 分类: Supply Chain Expense Document (SCCS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/sd/scmmp/expense/dividePurchase

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
| data | object | 否 | 是 | 供应链费用单[scmmp] |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| id | number |
| 小数位数:0,最大长度:19 | 否 | 否 | 费用单主表id， code和id至少填一项 示例：1989208608284835849 |
| code | string | 否 | 否 | 单据编码，code和id至少填一项 示例：FYD20221101000004 |
| divideType | string | 否 | 否 | 分摊方式：1 数量；2 重量； 3 体积； 4 原币含税金额； 5 本币含税金额 示例：1 |
| expenseDetails | object | 是 | 否 | 费用子表 |

## 3. 请求示例

Url: /yonbip/sd/scmmp/expense/dividePurchase?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": 1989208608284835849,
		"code": "FYD20221101000004",
		"divideType": "1",
		"expenseDetails": [
			{
				"divideSourceId": 1993239192055840772,
				"expenseDivideDetails": [
					{
						"sourceid": 1898208127262130178,
						"sourceautoid": 1898208127262130178,
						"dividedMoney": 9.52
					}
				]
			}
		]
	}
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
| message | string | 否 | 返回描述 示例：操作成功 |
| salesOrgId | string | 否 | 销售组织id |
| saleDepartmentId | string | 否 | 销售部门id |
| transactionTypeId | string | 否 | 交易类型id |
| settlementOrgId | string | 否 | 开票组织id |
| bizId | string | 否 | 商家id |
| createDate | string | 否 | 创建时间 |
| synSourceOrg | string | 否 | 协同来源组织id |
| ecsuiteuser | string | 否 | 气泡联系人 |
| ecsuiteuser | string | 否 | 气泡联系人 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	服务端逻辑异常	请检查传入数据的正确性


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

