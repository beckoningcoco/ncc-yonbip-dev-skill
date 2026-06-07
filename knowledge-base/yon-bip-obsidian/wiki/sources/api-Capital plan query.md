---
title: "资金计划查询"
apiId: "1759453238686384129"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Inquire Plan Summary"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Inquire Plan Summary]
platform_version: "BIP"
source_type: community-api-docs
---

# 资金计划查询

> `ContentType	application/json` 请求方式	POST | 分类: Inquire Plan Summary (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/capitalPlanProject/querycapitalplanproject

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	MDD幂等

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| accentity | string | 否 | 是 | 业务单据对应的资金组织，支持id和code查询 示例：pkm00 |
| dept | string | 否 | 否 | 业务单据对应的部门，支持id和code查询，为空时默认查询部门为空的数据 示例：0001 |
| currency | string | 否 | 是 | 币种，支持id和code查询 示例：152564370585577，CNY，人民币 |
| businessDate | Date | 否 | 是 | 业务日期 示例：2023-12-09 |
| capitalPlanProjectNo | string | 否 | 否 | 计划项目编号 示例：R1001 |

## 3. 请求示例

Url: /yonbip/ctm/capitalPlanProject/querycapitalplanproject?access_token=访问令牌
Body: {
	"accentity": "pkm00",
	"dept": "0001",
	"currency": "152564370585577，CNY，人民币",
	"businessDate": "2023-12-09",
	"capitalPlanProjectNo": "R1001"
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
| code | string | 否 | 状态码 示例：“200” |
| message | string | 否 | 状态信息 示例：操作成功 |
| data | object | 是 | 返回信息 |
| capitalPlancode | string | 否 | 资金计划编号，返回已生效的计划编制单编号 示例：CSPLST230710000352 |
| capitalPlanName | string | 否 | 资金计划名称，返回已生效的计划编制单名称 示例：7月份测试api |
| capitalPlanSubList | object | 是 | 资金计划编制单子表 |

## 5. 正确返回示例

{
	"code": "“200”",
	"message": "操作成功",
	"data": [
		{
			"capitalPlancode": "CSPLST230710000352",
			"capitalPlanName": "7月份测试api",
			"capitalPlanSubList": [
				{
					"id": "1767532896821182471",
					"capitalPlanProjectNo": "Q001",
					"capitalPlanProjectName": "QICHU",
					"amountControlMode": 1,
					"executeProportion": 10,
					"warningProportion": 10,
					"thisPeriodPlanAmt": 600,
					"employAmt": 0,
					"noEmployAmt": 600,
					"executeRatio": 0
				}
			]
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	错误信息

10000001	参数为空


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

