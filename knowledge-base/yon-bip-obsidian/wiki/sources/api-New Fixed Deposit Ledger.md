---
title: "定期存款台账新增"
apiId: "1852166893821493253"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Risk Management"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Risk Management]
platform_version: "BIP"
source_type: community-api-docs
---

# 定期存款台账新增

> `ContentType	application/json` 请求方式	POST | 分类: Risk Management (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/lqrisk/api/businledger/save

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
| pk_entity | string | 否 | 否 | 资金组织ID(与资金组织名称,资金组织编码必填一项) 示例：1525652227072458756 |
| entityName | string | 否 | 否 | 资金组织名称(与资金组织ID,资金组织编码必填一项) 示例：收入中台演示销售组织1 |
| entityCode | string | 否 | 否 | 资金组织编码(与资金组织ID,资金组织名称必填一项) 示例：123123 |
| busin_type | string | 否 | 是 | 业务类型(1:线下业务) 示例：1 默认值：1 |
| remark | string | 否 | 否 | 备注 示例：备注 |
| faOtherBusinessList | object | 是 | 是 | 成员单位定期存款子表 |
| protocol_numbe | string | 否 | 是 | 协议号 示例：111 |
| sideType | string | 否 | 是 | 对方类型(agent:客户;supplier:供应商;person:人员;fund:资金业务对象) 示例：agent |
| sideCode | string | 否 | 是 | 对方编码 示例：111 |
| currencyName | string | 否 | 否 | 原币币种名称(与币种ID,币种编码必填一项) 示例：人民币 |
| currency | string | 否 | 否 | 原币币种ID(与币种名称,币种编码必填一项) 示例：1623643074168094746 |
| currencyCode | string | 否 | 否 | 原币币种编码(与币种名称,币种ID必填一项) 示例：RMB |
| amount | number |
| 小数位数:2,最大长度:10 | 否 | 是 | 原币金额 示例：11 |
| startDate | Date | 否 | 是 | 开始日期 示例：2023-11-01 |
| expireDate | Date | 否 | 是 | 到期日期 示例：2023-11-02 |
| rate | number |
| 小数位数:2,最大长度:10 | 否 | 是 | 利率 示例：1 |
| planDate | Date | 否 | 否 | 计划日期 示例：2023-11-01 |
| direction | string | 否 | 否 | 收支方向(income:收入,outcome:支出) 示例：income |

## 3. 请求示例

Url: /yonbip/ctm/lqrisk/api/businledger/save?access_token=访问令牌
Body: {
	"pk_entity": "1525652227072458756",
	"entityName": "收入中台演示销售组织1",
	"entityCode": "123123",
	"busin_type": "1",
	"remark": "备注",
	"faOtherBusinessList": [
		{
			"protocol_numbe": "111",
			"sideType": "agent",
			"sideCode": "111",
			"currencyName": "人民币",
			"currency": "1623643074168094746",
			"currencyCode": "RMB",
			"amount": 11,
			"startDate": "2023-11-01",
			"expireDate": "2023-11-02",
			"rate": 1,
			"planDate": "2023-11-01",
			"direction": "income"
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
| code | string | 否 | 接口返回码 示例：200 |
| message | string | 否 | 接口返回信息 示例：操作成功 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

1000001	传入参数为空


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

