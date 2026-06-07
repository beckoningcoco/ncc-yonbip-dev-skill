---
title: "归集剔除申请生单接口"
apiId: "2034089055520555012"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Accumulation Removal Application"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Accumulation Removal Application]
platform_version: "BIP"
source_type: community-api-docs
---

# 归集剔除申请生单接口

> `ContentType	application/json` 请求方式	POST | 分类: Accumulation Removal Application (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/fdtr/eliminateApply/save

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
| applyAccentity | string | 否 | 是 | 申请资金组织：如id或code 示例："1794282751976275977" |
| applyCode | string | 否 | 否 | 申请编号 示例："ELIMINATEAPPLY20240319000058" |
| applyDate | string | 否 | 否 | 申请日期 示例："2024-03-19" |
| applyReason | string | 否 | 否 | 申请原因：如id或code 示例："1812321666163802125" |
| applyUser | string | 否 | 否 | 申请人 示例："9be34b54-06be-42c8-a975-49a7a642d193" |
| auditstatus | string | 否 | 是 | 审批状态：1-待提交；4-已通过； 示例："1" |
| eliminateApplybList | object | 是 | 是 | 申请明细-子表 |
| bankAccount | string | 否 | 是 | 银行账号：如id或code 示例："1794284487158792192" |
| currencyb | string | 否 | 是 | 币种：如id或code 示例："1793546697674588191" |
| allEliminate | string | 否 | 是 | 全额剔除：0-否；1-是； 示例："0" |
| applyEliminateBalance | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 申请剔除金额 示例：299.21 |
| eliminateStartTime | string | 否 | 是 | 剔除开始日期 示例："2024-03-19" |
| eliminateStopTime | string | 否 | 是 | 剔除到期日期 示例："2024-03-21" |
| eliminateRule | string | 否 | 是 | 剔除规则：1-每天；2-每周；3-按月；4-按季；5-按年； 示例："2" |
| eliminateCycle | string | 否 | 否 | 剔除周期 示例："2" |
| eliminateCycleValue | string | 否 | 否 | 剔除日期值：如：按周 1;2; 按月 3;4; 按季 1:60 按年 06-18 示例：3;5; |
| applyReason | string | 否 | 否 | 申请原因详述 示例："我要归集剔除申请" |

## 3. 请求示例

Url: /yonbip/ctm/fdtr/eliminateApply/save?access_token=访问令牌
Body: {
	"applyAccentity": "\"1794282751976275977\"",
	"applyCode": "\"ELIMINATEAPPLY20240319000058\"",
	"applyDate": "\"2024-03-19\"",
	"applyReason": "\"1812321666163802125\"",
	"applyUser": "\"9be34b54-06be-42c8-a975-49a7a642d193\"",
	"auditstatus": "\"1\"",
	"eliminateApplybList": [
		{
			"bankAccount": "\"1794284487158792192\"",
			"currencyb": "\"1793546697674588191\"",
			"allEliminate": "\"0\"",
			"applyEliminateBalance": 299.21,
			"eliminateStartTime": "\"2024-03-19\"",
			"eliminateStopTime": "\"2024-03-21\"",
			"eliminateRule": "\"2\"",
			"eliminateCycle": "\"2\"",
			"eliminateCycleValue": "3;5;",
			"applyReason": "\"我要归集剔除申请\""
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
| code | number |
| 小数位数:0,最大长度:10 | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 调用成功时的返回数据 |
| code | string | 否 | 单据编码 示例：ELIMINATEAPPLY20240319000058 |
| applyUser | string | 否 | 申请人 示例：9be34b54-06be-42c8-a975-49a7a642d193 |
| vouchdate | string | 否 | 单据日期 示例：2024-03-19 |
| currency | string | 否 | 币种 示例：1793546697674588191 |
| id | string | 否 | ID 示例：1955470632647393281 |
| pubts | string | 否 | 时间戳 示例：2024-03-19 19:12:27 |
| auditstatus | string | 否 | 审批状态 示例：4 |
| creator | string | 否 | 创建人 示例：9be34b54-06be-42c8-a975-49a7a642d193 |
| applyReason | string | 否 | 申请原因 示例：1812321666163802125 |
| auditor | string | 否 | 审批人 示例：9be34b54-06be-42c8-a975-49a7a642d193 |
| bustype | string | 否 | 交易类型 示例：1793546671915271131 |
| verifyState | number |
| 小数位数:0,最大长度:10 | 否 | 单据状态 示例：2 |
| auditTime | string | 否 | 审批时间 示例：2024-03-19 19:12:27 |
| createTime | string | 否 | 创建时间 示例：2024-03-19 19:11:53 |
| applyAccentity | string | 否 | 申请资金组织 示例：1794282751976275977 |
| applyDate | string | 否 | 申请日期 示例：2024-03-19 |
| reasoncCassfy | string | 否 | 原因分类 示例：1812321666163802123 |
| eliminateApplybList | object | 是 | 归集剔除申请子表 |
| fdtrDefineCharacter | object | 否 | 自定义项特征组 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"code": "ELIMINATEAPPLY20240319000058",
		"applyUser": "9be34b54-06be-42c8-a975-49a7a642d193",
		"vouchdate": "2024-03-19",
		"currency": "1793546697674588191",
		"id": "1955470632647393281",
		"pubts": "2024-03-19 19:12:27",
		"auditstatus": "4",
		"creator": "9be34b54-06be-42c8-a975-49a7a642d193",
		"applyReason": "1812321666163802125",
		"auditor": "9be34b54-06be-42c8-a975-49a7a642d193",
		"bustype": "1793546671915271131",
		"verifyState": 2,
		"auditTime": "2024-03-19 19:12:27",
		"createTime": "2024-03-19 19:11:53",
		"applyAccentity": "1794282751976275977",
		"applyDate": "2024-03-19",
		"reasoncCassfy": "1812321666163802123",
		"eliminateApplybList": [
			{
				"fdtrDefineCharacter": {
					"ddtest1031004": false,
					"id": "1955470632647393285",
					"ytenantId": "0000LLAIV00S4P20HX0000",
					"dr": 0
				},
				"currencyb": "1793546697674588191",
				"eliminateCycleValue": "3;4;",
				"eliminateRule": "2",
				"eliminateCycle": "2",
				"eliminateDate": "每2周 第3天、第4天",
				"accountNature": "1",
				"id": "1955470632647393282",
				"pubts": "2024-03-19 19:12:23",
				"bankAccount": "1794284487158792192",
				"allEliminate": "0",
				"eliminateApply_id": "1955470632647393281",
				"eliminateStartTime": "2024-03-19",
				"eliminateStopTime": "2024-03-21",
				"applyEliminateBalance": 299.21
			}
		],
		"fdtrDefineCharacter": {
			"ddtest1031004": false,
			"id": "1955470632647393284",
			"ytenantId": "0000LLAIV00S4P20HX0000",
			"dr": 0
		}
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

暂时没有数据哦~


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

