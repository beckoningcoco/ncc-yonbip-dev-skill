---
title: "新增物权登记记录"
apiId: "1514398648351326214"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Security Interest"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Security Interest]
platform_version: "BIP"
source_type: community-api-docs
---

# 新增物权登记记录

> `ContentType	application/json` 请求方式	POST | 分类: Security Interest (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/grmOpenApi/addPropertyRightList

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
| serialNumber | string | 否 | 是 | 流水号不允许重复 示例：12345678999 |
| accentity | string | 否 | 是 | 资金组织名称 示例：冰露 |
| prTypeName | string | 否 | 是 | 物权类别 示例：土地使用权 |
| purpose | short | 否 | 是 | 用途分类 1=抵押 2 = 质押 示例：1 |
| businessCode | string | 否 | 是 | 业务编号 示例：TZ20250001 |
| prSourceType | short | 否 | 是 | 所属类型 1=自有物权 2=收到物权 示例：2 |
| prName | string | 否 | 是 | 物权名称不允许重复 示例：里根号航母 |
| unitProperty | short | 否 | 是 | 所属单位属性 自有物权时，需指定,1 = 本单位、5=集团共享。 收到物权时，需指定，包括2=客户、3=供应商、4=资金业务对象 示例：2 |
| unitName | string | 否 | 是 | 所属单位名称 自有物权时，无需填写。 收到物权时，需传入，所属单位的名称 示例：娃哈哈 |
| currency | string | 否 | 是 | 币种 示例：人民币 |
| prPrice | BigDecimal | 否 | 否 | 物权价值 示例：10000 |
| startDate | Date | 否 | 否 | 开始日期(需要小于到期日期) 示例：2022-01-23 |
| endDate | Date | 否 | 否 | 到期日期(需要大于当前日期) 示例：2022-03-23 |
| assessDate | Date | 否 | 否 | 评估日期(需要小于到期日期) 示例：2022-03-01 |
| assessUnit | string | 否 | 否 | 评估机构名称 示例：中国海军 |
| assessPrice | BigDecimal | 否 | 否 | 评估价值 示例：5000 |
| rate | string | 否 | 否 | 抵质押率%(大于0） 示例：50 |
| auditStatus | string | 否 | 否 | 审批状态 1=已保存 4=审批通过；不传值则默认为已保存 示例：1 |
| prStatus | string | 否 | 否 | 物权状态 1=在登记 2=待押 3=已押 保存态可不传,自动赋值为在登记;审批通过态,不传值默认赋值为待押 示例：1 |
| remark | string | 否 | 否 | 备注 示例：物权登记保存 |
| propertyRightFiear | object | 是 | 否 | 物权应收账款 |
| eventType_code | string | 否 | 否 | 会计事务记录号 |
| remark | string | 否 | 否 | 备注 |

## 3. 请求示例

Url: /yonbip/ctm/grmOpenApi/addPropertyRightList?access_token=访问令牌
Body: [{
	"serialNumber": "12345678999",
	"accentity": "冰露",
	"prTypeName": "土地使用权",
	"purpose": 1,
	"businessCode": "TZ20250001",
	"prSourceType": 2,
	"prName": "里根号航母",
	"unitProperty": 2,
	"unitName": "娃哈哈",
	"currency": "人民币",
	"prPrice": 10000,
	"startDate": "2022-01-23",
	"endDate": "2022-03-23",
	"assessDate": "2022-03-01",
	"assessUnit": "中国海军",
	"assessPrice": 5000,
	"rate": "50",
	"auditStatus": "1",
	"prStatus": "1",
	"remark": "物权登记保存",
	"propertyRightFiear": [
		{
			"eventType_code": "",
			"remark": ""
		}
	]
}]

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
| message | string | 否 | 返回消息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| msgs | string | 是 | 返回错误信息集合 |
| sucessCount | long | 否 | 保存成功条数 示例：1 |
| failCount | long | 否 | 保存失败条数 示例：0 |
| successRecords | object | 是 | 成功的数据记录 |
| totalCount | long | 否 | 总条数 示例：1 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"msgs": [
			""
		],
		"sucessCount": 1,
		"failCount": 0,
		"successRecords": [
			{
				"serialNumber": "123456789914",
				"accentity": "2312820403671296",
				"prName": "小鹰号航母14",
				"prSourceType": 1,
				"unitProperty": 1,
				"unitName": "冰露",
				"prTypeName": "土地使用权",
				"purpose": 1,
				"currency": "2163654411424512",
				"prPrice": 10000,
				"startDate": "2022-01-23 00:00:00",
				"endDate": "2023-03-23 00:00:00",
				"assessDate": "2022-03-01 00:00:00",
				"assessUnit": "1538815442944000005",
				"assessPrice": 5000,
				"rate": 50,
				"prType": 2454172890452234,
				"pledgePrice": 2500,
				"id": 1515200243853426696,
				"auditStatus": 1,
				"prStatus": 1,
				"code": "GRMREM220804001",
				"usePledgePrice": 0,
				"tenant": 2163654053351680,
				"yTenantId": "jrig9o3z"
			}
		],
		"totalCount": 1
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

10000001	传入参数为空

10000003	传入数据存在缺少流水号的数据,请检查数据

10000004	传入数据流水号已经在数据库中存在,请检查数据


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-12-05

更新

请求说明

新增

请求参数 propertyRightFiear

新增

请求参数 eventType_code

新增

请求参数 remark

增加子表数据

2	2025-06-09

新增

请求参数 (5)

更新

请求参数 (9)

更新

返回参数 (33)

修改示例显示


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

