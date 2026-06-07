---
title: "收票登记新增"
apiId: "2044505948940664839"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Bill Registration"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Bill Registration]
platform_version: "BIP"
source_type: community-api-docs
---

# 收票登记新增

> `ContentType	application/json` 请求方式	POST | 分类: Bill Registration (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/api/register/batchAdd

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
| accentityCode | string | 否 | 否 | 会计主体编码 |
| accentityName | string | 否 | 否 | 会计主体名称 |
| billTargetStatus | string | 否 | 否 | 单据目标审批状态(01:待提交/02:审批通过，为空默认审批通过) |
| dataList | object | 是 | 是 | 单据信息 |
| requestNo | string | 否 | 是 | 请求流水号 |
| gatherDate | date |
| 格式:yyyy-MM-dd | 否 | 是 | 收票日期 |
| signRefuse | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 签收|拒签（1：签收 2：拒签） |
| paybillroles | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 付票方（0:资金业务对象 1：客户 2：供应商 3：其他 4：内部单位） |
| payerCode | string | 否 | 否 | 付票人编码 |
| payerName | string | 否 | 否 | 付票人名称 |
| payAcc | string | 否 | 否 | 付票账号 |
| entrustedPaybillroles | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 被委托付票方（0:资金业务对象 1：客户 2：供应商 3：其他） |
| entrustedPayerName | string | 否 | 否 | 被委托付票人 |
| description | string | 否 | 否 | 备注 |
| elecsignacc | string | 否 | 否 | 电票账号 |
| noteno | string | 否 | 是 | 票据号 |
| ifsepFlow | boolean | 否 | 是 | 能否分包流转 |
| billRangeStart | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 子票区间开始 |
| noteMoney | number |
| 小数位数:6,最大长度:20 | 否 | 是 | 票据金额 |
| noteType | string | 否 | 是 | 票据类型（来源票据类型节点） |
| invoiceDate | date |
| 格式:yyyy-MM-dd | 否 | 否 | 出票日期 |
| endDate | date |
| 格式:yyyy-MM-dd | 否 | 是 | 到期日期 |
| istransfer | boolean | 否 | 是 | 可转让 |
| invoiceroles | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 出票方（1：客户 2：供应商 3：其他 4：内部单位 5：资金业务对象） |
| invoicerCode | string | 否 | 否 | 出票人编码 |
| invoicerName | string | 否 | 否 | 出票人名称 |
| invoicerbankacc | string | 否 | 否 | 出票人账号 |
| invoiceropenbank | string | 否 | 否 | 出票人开户行 |
| invoiceropenbanknum | string | 否 | 否 | 出票人开户行行号 |
| receiveroles | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 收票方（1：客户 2：供应商 3：其他 4：内部单位 5：资金业务对象） |
| receiverCode | string | 否 | 否 | 收票人编码 |
| receiverName | string | 否 | 否 | 收票人名称 |
| receiverbankacc | string | 否 | 否 | 收票人账号 |
| receiveropenbank | string | 否 | 否 | 收票人开户行 |
| receiveropenbanknum | string | 否 | 否 | 收票人开户行行号 |
| acceptanceroles | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 承兑方（1：客户 2：供应商 3：其他 4：银行 5：内部单位 6：资金业务对象） |
| acceptancerCode | string | 否 | 否 | 承兑人编码 |
| acceptancerName | string | 否 | 否 | 承兑人名称 |
| acceptancerbankacc | string | 否 | 否 | 承兑人账号 |
| acceptanceropenbank | string | 否 | 否 | 承兑人开户行 |
| acceptanceropenbanknum | string | 否 | 否 | 承兑人开户行行号 |
| contractNo | string | 否 | 否 | 交易合同号 |
| notedescription | string | 否 | 否 | 票据备注 |
| costproject | string | 否 | 否 | 费用项目 |
| org | string | 否 | 否 | 业务组织 |
| project | string | 否 | 否 | 项目 |
| activity | string | 否 | 否 | 活动 |
| wbs | string | 否 | 否 | WBS |
| dept | string | 否 | 否 | 部门 |
| operator | string | 否 | 否 | 业务员 |
| olcratetype | string | 否 | 否 | 汇率类型 |
| extend | object | 否 | 否 | 扩展字段 （key:value） |
| files | object | 是 | 否 | 附件 |

## 3. 请求示例

Url: /yonbip/ctm/api/register/batchAdd?access_token=访问令牌
Body: {
	"accentityCode": "",
	"accentityName": "",
	"billTargetStatus": "",
	"dataList": [
		{
			"requestNo": "",
			"gatherDate": "2026-06-07",
			"signRefuse": 0,
			"paybillroles": 0,
			"payerCode": "",
			"payerName": "",
			"payAcc": "",
			"entrustedPaybillroles": 0,
			"entrustedPayerName": "",
			"description": "",
			"elecsignacc": "",
			"noteno": "",
			"ifsepFlow": true,
			"billRangeStart": 0,
			"noteMoney": 0,
			"noteType": "",
			"invoiceDate": "2026-06-07",
			"endDate": "2026-06-07",
			"istransfer": true,
			"invoiceroles": 0,
			"invoicerCode": "",
			"invoicerName": "",
			"invoicerbankacc": "",
			"invoiceropenbank": "",
			"invoiceropenbanknum": "",
			"receiveroles": 0,
			"receiverCode": "",
			"receiverName": "",
			"receiverbankacc": "",
			"receiveropenbank": "",
			"receiveropenbanknum": "",
			"acceptanceroles": 0,
			"acceptancerCode": "",
			"acceptancerName": "",
			"acceptancerbankacc": "",
			"acceptanceropenbank": "",
			"acceptanceropenbanknum": "",
			"contractNo": "",
			"notedescription": "",
			"costproject": "",
			"org": "",
			"project": "",
			"activity": "",
			"wbs": "",
			"dept": "",
			"operator": "",
			"olcratetype": "",
			"extend": {},
			"files": [
				{
					"fileText": "",
					"fileName": ""
				}
			]
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
| code | string | 否 | code 示例：200 |
| message | string | 否 | message 示例：操作成功 |
| data | object | 否 | data |
| id | string | 否 | 收票登记主键 示例：12345 |
| isSuccess | boolean | 否 | 是否成功 示例：true |
| message | string | 否 | 失败表述 示例：单据不存在 |
| requestNo | string | 否 | 请求流水号 示例：34234234 |
| code | string | 否 | 单据编码 |
| oripkRegister | string | 否 | 业务收票主键 |
| initialRegister | string | 否 | 最初业务收票主键 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"id": "12345",
		"isSuccess": true,
		"message": "单据不存在",
		"requestNo": "34234234",
		"code": "",
		"oripkRegister": "",
		"initialRegister": ""
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

1022020403001	参数错误

1022020403500	服务器异常

1022020403004	日期格式错误

1022020403002	参数为空


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-12-04

更新

请求说明

更新

请求参数 (4)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

