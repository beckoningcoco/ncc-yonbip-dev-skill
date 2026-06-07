---
title: "批量新增开函申请"
apiId: "1513025384105902085"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "L/G Issuing Business Application"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, L/G Issuing Business Application]
platform_version: "BIP"
source_type: community-api-docs
---

# 批量新增开函申请

> `ContentType	application/json` 请求方式	POST | 分类: L/G Issuing Business Application (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/lgmOpenApi/addGuaranteeApply

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
| serialNumber | string | 否 | 是 | 流水号(必填且唯一) 示例：1424 |
| accentity | string | 否 | 是 | 会计主体名称 示例：上级公司 |
| guaranteeTypeName | string | 否 | 否 | 保函类型 示例：投标保函 |
| openAgencyName | string | 否 | 否 | 开立机构名称 示例：银行 |
| agencyNameForOther | string | 否 | 否 | 机构名称 示例：中国工商银行深泽支行 |
| issuingMethod | string | 否 | 否 | 开立方式 mail = 信开 phone = 电开 示例：mail |
| isOpen | string | 否 | 否 | 是否敞口 yes=是 no = 否 示例：yes |
| currency | string | 否 | 否 | 币种 示例：美元 |
| guaranteeAmount | BigDecimal | 否 | 否 | 保函金额 示例：100000.5 |
| guaranteeBeginDate | Date | 否 | 否 | 保函开始日期 示例：2021-09-16 |
| guaranteeEndDate | Date | 否 | 否 | 保函结束日期 示例：2023-10-16 |
| isForeign | string | 否 | 否 | 是否涉外 yes=是 no = 否 示例：yes |
| transForwardOrg | string | 否 | 否 | 转开转递机构 示例：中国工商银行深泽支行 |
| contractType | string | 否 | 是 | 合同类型 1=采购订单 2=采购合同 3=销售合同 4=销售订单 5=融资合同 6=销售信用 other=其他 示例：1 |
| contractNumber | string | 否 | 否 | 合同编号 示例：HT12312ABCFX |
| isAgent | string | 否 | 否 | 代理开函 yes=是 no=否 示例：no |
| agentAccentity | string | 否 | 否 | 被代理组织 示例：冰露的子公司 |
| recipientType | string | 否 | 是 | 收函方 1=客户 2=供应商 3=资金业务对象 示例：1 |
| recipientForOhter | string | 否 | 是 | 收函人 示例：万科 |
| recipientAddress | string | 否 | 否 | 收函人地址 示例：北京市海淀区 |
| recipientPhone | string | 否 | 否 | 收函人联系电话 示例：18599999999 |

## 3. 请求示例

Url: /yonbip/ctm/lgmOpenApi/addGuaranteeApply?access_token=访问令牌
Body: [{
	"serialNumber": "1424",
	"accentity": "上级公司",
	"guaranteeTypeName": "投标保函",
	"openAgencyName": "银行",
	"agencyNameForOther": "中国工商银行深泽支行",
	"issuingMethod": "mail",
	"isOpen": "yes",
	"currency": "美元",
	"guaranteeAmount": 100000.5,
	"guaranteeBeginDate": "2021-09-16",
	"guaranteeEndDate": "2023-10-16",
	"isForeign": "yes",
	"transForwardOrg": "中国工商银行深泽支行",
	"contractType": "1",
	"contractNumber": "HT12312ABCFX",
	"isAgent": "no",
	"agentAccentity": "冰露的子公司",
	"recipientType": "1",
	"recipientForOhter": "万科",
	"recipientAddress": "北京市海淀区",
	"recipientPhone": "18599999999"
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
| message | string | 否 | 操作信息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| msgs | string | 是 | 数据信息 |
| sucessCount | long | 否 | 成功执行条数 示例：1 |
| failCount | long | 否 | 失败执行条数 示例：0 |
| successRecords | object | 是 | 成功执行的记录 |
| totalCount | long | 否 | 数据总数 示例：1 |

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
				"issuingMethod": "mail",
				"recipientPhone": "18599999999",
				"agencyNameForOther": "中国工商银行深泽支行",
				"contractType": "1",
				"guaranteeAmount": 100000.5,
				"contractNumber": "HT12312ABCFX",
				"guaranteeTypeName": "投标保函",
				"accentity": "1457320036072423425",
				"recipientForOhter": "万科",
				"guaranteeEndDate": "2023-10-16 00:00:00",
				"openAgencyName": "银行",
				"recipientType": "1",
				"isAgent": "yes",
				"currency": "2163654411440900",
				"recipientAddress": "北京市海淀区",
				"guaranteeBeginDate": "2021-09-16 00:00:00",
				"applicationDate": "2022-08-04 14:22:26",
				"customer": 2285369502011648,
				"status": 0,
				"auditstatus": 1,
				"id": 1515214176723665000,
				"isFromOut": "no",
				"bustype": "2431114315043072",
				"tenant": 2163654053351680
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

10000002	传入数据存在没有流水号的记录,请检查数据

10000003	传入数据存在重复的流水号,请检查数据


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

