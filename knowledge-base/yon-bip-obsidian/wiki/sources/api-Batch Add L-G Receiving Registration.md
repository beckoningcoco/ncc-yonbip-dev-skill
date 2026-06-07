---
title: "批量新增收函登记"
apiId: "1509914367484755973"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "L/G Receiving Registration"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, L/G Receiving Registration]
platform_version: "BIP"
source_type: community-api-docs
---

# 批量新增收函登记

> `ContentType	application/json` 请求方式	POST | 分类: L/G Receiving Registration (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/lgmOpenApi/addAccGuaranteeReg

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
| serialNumber | string | 否 | 是 | 流水号(必填且唯一) |
| accentity | string | 否 | 是 | 会计主体名称 示例：冰露 |
| guaranteeNumber | string | 否 | 是 | 保函编号 示例：BH20210924001 |
| acceptDate | Date | 否 | 否 | 收函日期 示例：2021-09-16 |
| guaranteeTypeName | string | 否 | 否 | 保函类型 示例：投标保函 |
| openAgencyName | string | 否 | 否 | 开立机构名称 示例：银行 |
| agencyNameForOther | string | 否 | 否 | 机构名称 示例：中信银行郑州总部港支行 |
| issuingMethod | string | 否 | 否 | 开立方式 mail = 信开 phone = 电开 示例：mail |
| isOpen | string | 否 | 否 | 是否敞口 yes=是 no = 否 示例：yes |
| currency | string | 否 | 否 | 币种 示例：美元 |
| guaranteeAmount | BigDecimal | 否 | 否 | 保函金额 示例：100000.50 |
| guaranteeBeginDate | Date | 否 | 否 | 保函开始日期 示例：2021-09-16 |
| guaranteeEndDate | Date | 否 | 否 | 保函结束日期 示例：2021-10-16 |
| isForeign | string | 否 | 否 | 是否涉外 yes=是 no = 否 示例：no |
| transForwardOrg | string | 否 | 否 | 转开转递机构 示例：中国工商银行西安含光路支行 |
| contractType | string | 否 | 是 | 合同类型 1=采购订单 2=采购合同 3=销售合同 4=销售订单 5=融资合同 6=销售信用 other=其他 示例：1 |
| contractNumber | string | 否 | 否 | 合同编号 示例：HT12312ABCFX |
| issueType | short | 否 | 是 | 开函方 1=客户 2=供应商 3=资金业务对象 示例：1 |
| issuerForOhter | string | 否 | 是 | 开函人 示例：哇哈哈 |
| issuerAddress | string | 否 | 否 | 开函人地址 示例：北京市海淀区 |
| issuerPhone | string | 否 | 否 | 开函人联系电话 示例：18599999999 |

## 3. 请求示例

Url: /yonbip/ctm/lgmOpenApi/addAccGuaranteeReg?access_token=访问令牌
Body: [{
	"serialNumber": "",
	"accentity": "冰露",
	"guaranteeNumber": "BH20210924001",
	"acceptDate": "2021-09-16",
	"guaranteeTypeName": "投标保函",
	"openAgencyName": "银行",
	"agencyNameForOther": "中信银行郑州总部港支行",
	"issuingMethod": "mail",
	"isOpen": "yes",
	"currency": "美元",
	"guaranteeAmount": 100000.5,
	"guaranteeBeginDate": "2021-09-16",
	"guaranteeEndDate": "2021-10-16",
	"isForeign": "no",
	"transForwardOrg": "中国工商银行西安含光路支行",
	"contractType": "1",
	"contractNumber": "HT12312ABCFX",
	"issueType": 1,
	"issuerForOhter": "哇哈哈",
	"issuerAddress": "北京市海淀区",
	"issuerPhone": "18599999999"
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
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 结果数据 |
| msgs | string | 是 | 错误信息集合 |
| sucessCount | long | 否 | 成功条数 示例：1 |
| failCount | long | 否 | 失败条数 示例：0 |
| successRecords | object | 是 | 成功执行的记录 |
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
				"serialNumber": "",
				"accentity": "2312820403671296",
				"guaranteeNumber": "BH20450924004",
				"acceptDate": "2021-09-16 00:00:00",
				"guaranteeTypeName": "投标保函",
				"agency": 2163654411440900,
				"openInstitution": 2312820403671296,
				"issuingMethod": "mail",
				"isOpen": "yes",
				"currency": "2163654411440900",
				"guaranteeAmount": 100000.5,
				"guaranteeBeginDate": "2021-09-16 00:00:00",
				"guaranteeEndDate": "2023-10-16 00:00:00",
				"isForeign": "yes",
				"transForwardOrg": "1514550681598427190",
				"contractType": "1",
				"contractNumber": "HT12312ABCFX",
				"issueType": 1,
				"issuerForOhter": "哇哈哈",
				"issuerAddress": "北京市海淀区",
				"issuerPhone": "18599999999",
				"guaranteeType": 2432541240627456,
				"customer": 2472435015831808,
				"ifUsed": "notUsed",
				"auditStatus": 1,
				"id": 1510778162718965762,
				"code": "LGSDJ22072900003"
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

10000002	传入数据存在重复的保函编号,请检查数据

10000003	传入数据存在没有保函编号的记录,请检查数据


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

