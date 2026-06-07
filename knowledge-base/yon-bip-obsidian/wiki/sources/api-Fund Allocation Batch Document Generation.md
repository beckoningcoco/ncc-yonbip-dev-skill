---
title: "资金调拨批量生单"
apiId: "2253034917529124869"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Funds Transfer"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Funds Transfer]
platform_version: "BIP"
source_type: community-api-docs
---

# 资金调拨批量生单

> `ContentType	application/json` 请求方式	POST | 分类: Funds Transfer (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/fdtr/transfer/save

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
| accentity | string | 否 | 是 | 上级资金组织(支持编码和名称，平台的已启用资金组织档案) 示例："JT000000001"或者"集团资金组织" |
| strategyCode | string | 否 | 是 | 调拨编码。租户级唯一 示例："FDTR0001" |
| strategyName | string | 否 | 是 | 调拨名称。租户级唯一 示例："资金调拨" |
| vouchdate | date |
| 格式:yyyy-MM-dd | 否 | 是 | 单据日期 示例：2025-01-01 |
| currency | string | 否 | 是 | 币种（支持编码和名称,校验是平台的已启用币种档案） 示例："CNY"或者"人民币" |
| transferExplain | string | 否 | 否 | 备注 示例：描述说明 |
| auditstatus | string | 否 | 是 | 审批状态（支持编码，枚举类型：1-待提交、4-审批通过） 示例："1"或者"4" |
| fundTransferBodyList | object | 是 | 是 | 资金调拨子表 |
| exchangeRateType | string | 否 | 否 | 本币汇率类型（支持编码和名称，校验是平台的已启用汇率类型档案） |
| exchangeRateOps | number |
| 小数位数:0,最大长度:1 | 否 | 否 | 本币汇率折算方式（枚举类型，1为乘；2为除；如果本币汇率类型是自定义汇率，该字段没值默认取1(乘)） |
| exchangeRate | number |
| 小数位数:8,最大长度:22 | 否 | 否 | 本币汇率（如果该字段有值，本币汇率类型取自定义汇率；） |
| paymentAccentity | string | 否 | 是 | 付款方资金组织(支持编码和名称，平台的已启用资金组织档案) 示例："ZJZZ00002"或者"二级资金组织" |
| paymentSettleMode | string | 否 | 是 | 付款方结算方式(支持编码和名称，平台的已启用且业务属性=银行业务的结算方式档案) 示例："system_0001"或者"银行转账" |
| paymentAccount | string | 否 | 是 | 付款方银行账户（支持账号和名称,1、校验是平台的已启用企业银行账户档案，且开户类型=银行开户、财务公司 2、校验必须是付款方资金组织的使用权账户。 3、校验账户币种与主表币种一致。 4、校验付款方银行账号的是否直联必须符合付款方结算方式的是否直联） 示例："01000"或者"付款账号" |
| bankEnterprisePay | boolean | 否 | 是 | 是否直联。支持编码，枚举：true-是、false-否。首先取结算方式的是否直联，如果结算方式的是否直联为空，则会取银行账号的是否直联【财资公共-账户直联状态】节点； 当是否直联=是时，可修改；是否直联=否时，不允许修改； 示例：true |
| paySupplementary | boolean | 否 | 否 | 付方是否结算补单（该字段V5升级新结算流程后生效;未升级，则不生效） 示例：false |
| paymentInnerAccount | string | 否 | 否 | 付款方内部账户（支持账号和名称,1、校验是平台的已启用企业银行账户档案，且开户类型=结算中心开户。 2、校验必须是付款方资金组织的使用权账户。 3、校验账户币种与主表币种一致。） 示例："INT0000001000000031"或者"调拨内部账户" |
| payOlcratetype | string | 否 | 否 | 付款方汇率类型（支持编码和名称，校验是平台的已启用汇率类型档案） 示例："01"或者"基准汇率" |
| payExchangerateOps | number |
| 小数位数:0,最大长度:1 | 否 | 否 | 付方汇率折算方式（枚举类型，1为乘；2为除；如果付款方汇率类型是自定义汇率，该字段没值默认取1(乘)） |
| payExchangerate | number |
| 小数位数:8,最大长度:22 | 否 | 否 | 付方汇率（如果该字段有值，付款方汇率类型取自定义汇率；） |
| receiveAccentity | string | 否 | 是 | 收款方资金组织(支持编码和名称，校验是平台的已启用资金组织档案） 示例："ZJZZ00003"或者"三级资金组织" |
| receiverSettleMode | string | 否 | 是 | 收款方结算方式(支持编码和名称，校验是平台的已启用且业务属性=银行业务的结算方式档案） 示例："system_0001"或者"银行转账" |
| receiveAccount | string | 否 | 是 | 收款方银行账户（支持账号和名称,1、校验是平台的已启用企业银行账户档案，且开户类型=银行开户、财务公司 2、校验必须是收款方资金组织的使用账户。 3、校验账户币种与主表币种一致。） 示例："02000"或者"收款账号" |
| receSupplementary | boolean | 否 | 否 | 收方是否结算补单（该字段V5升级新结算流程后生效;未升级，则不生效） 示例：true |
| receiveInnerAccount | string | 否 | 否 | 收款方内部账户（支持账号和名称,1、校验是平台的已启用企业银行账户档案，且开户类型=结算中心开户。 2、校验必须是收款方资金组织的使用账户。 3、校验账户币种与主表币种一致。） 示例："INT0000001000000031"或者"调拨内部账户" |
| receiveOlcratetype | string | 否 | 否 | 收款方汇率类型（支持编码和名称，校验是平台的已启用汇率类型档案） 示例："01"或者"基准汇率" |
| receiveExchangerateOps | number |
| 小数位数:0,最大长度:1 | 否 | 否 | 收方汇率折算方式（枚举类型，1为乘；2为除；如果收款方汇率类型是自定义汇率，该字段没值默认取1(乘)） |
| receiveExchangerate | number |
| 小数位数:8,最大长度:22 | 否 | 否 | 收方汇率（如果该字段有值，收款方汇率类型取自定义汇率；） |
| transferAmount | number |
| 小数位数:8,最大长度:22 | 否 | 是 | 调拨金额(金额校验大于0) 示例：10.23 |
| expenseItem | string | 否 | 否 | 费用项目(支持编码和名称,校验是平台的已启用费用项目档案） 示例："FFA00001"或者"市内交通费" |
| proceedtype | string | 否 | 否 | 款项类型(支持编码和名称,校验是平台的已启用款项类型档案） 示例："01"或者"预收款" |
| project | string | 否 | 否 | 项目(支持编码和名称,校验是平台的已启用项目档案） 示例："000000003"或者"资金流入流出" |
| wbs | string | 否 | 否 | wbs(支持编码和名称,校验是平台的已启用WBS档案） 示例："00000005"或者"税费" |
| activity | string | 否 | 否 | 活动(支持编码和名称,校验是平台的已启用项目活动档案） 示例："00000001"或者"项目活动" |
| payerRemark | string | 否 | 否 | 备注 示例：备注说明 |
| purpose | string | 否 | 否 | 用途 示例：用途说明 |
| postScript | string | 否 | 否 | 附言 示例：附言说明 |

## 3. 请求示例

Url: /yonbip/ctm/fdtr/transfer/save?access_token=访问令牌
Body: [{
	"accentity": "\"JT000000001\"或者\"集团资金组织\"",
	"strategyCode": "\"FDTR0001\"",
	"strategyName": "\"资金调拨\"",
	"vouchdate": "2025-01-01",
	"currency": "\"CNY\"或者\"人民币\"",
	"transferExplain": "描述说明",
	"auditstatus": "\"1\"或者\"4\"",
	"fundTransferBodyList": [
		{
			"exchangeRateType": "",
			"exchangeRateOps": 0,
			"exchangeRate": 0,
			"paymentAccentity": "\"ZJZZ00002\"或者\"二级资金组织\"",
			"paymentSettleMode": "\"system_0001\"或者\"银行转账\"",
			"paymentAccount": "\"01000\"或者\"付款账号\"",
			"bankEnterprisePay": true,
			"paySupplementary": false,
			"paymentInnerAccount": "\"INT0000001000000031\"或者\"调拨内部账户\"",
			"payOlcratetype": "\"01\"或者\"基准汇率\"",
			"payExchangerateOps": 0,
			"payExchangerate": 0,
			"receiveAccentity": "\"ZJZZ00003\"或者\"三级资金组织\"",
			"receiverSettleMode": "\"system_0001\"或者\"银行转账\"",
			"receiveAccount": "\"02000\"或者\"收款账号\"",
			"receSupplementary": true,
			"receiveInnerAccount": "\"INT0000001000000031\"或者\"调拨内部账户\"",
			"receiveOlcratetype": "\"01\"或者\"基准汇率\"",
			"receiveExchangerateOps": 0,
			"receiveExchangerate": 0,
			"transferAmount": 10.23,
			"expenseItem": "\"FFA00001\"或者\"市内交通费\"",
			"proceedtype": "\"01\"或者\"预收款\"",
			"project": "\"000000003\"或者\"资金流入流出\"",
			"wbs": "\"00000005\"或者\"税费\"",
			"activity": "\"00000001\"或者\"项目活动\"",
			"payerRemark": "备注说明",
			"purpose": "用途说明",
			"postScript": "附言说明"
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
| code | string | 否 | 返回码 示例：200 |
| message | string | 否 | 返回信息 示例：抱歉，服务出现异常，请稍后再试。如果问题持续，请上报或联系技术支持。 |
| data | object | 否 | 返回数据 |
| status | string | 否 | 返回码，全部失败时返回FAIL,全部成功时返回SUCCESS，部分成功时返回PARTSUCCESS 示例：PARTSUCCESS |
| total | string | 否 | 返回执行总数 示例：1 |
| successNum | string | 否 | 返回成功数量 示例：1 |
| errorNum | string | 否 | 返回失败数量 示例：1 |
| resultDataVOs | object | 否 | 返回数据 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "抱歉，服务出现异常，请稍后再试。如果问题持续，请上报或联系技术支持。",
	"data": {
		"status": "PARTSUCCESS",
		"total": "1",
		"successNum": "1",
		"errorNum": "1",
		"resultDataVOs": {
			"requestSeqNo": "",
			"code": "200",
			"message": "保存成功"
		}
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	抱歉，服务出现异常，请稍后再试。如果问题持续，请上报或者联系技术支持！


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-11-27

更新

请求说明

新增

请求参数 (9)

更新

请求参数 payerRemark

资金调拨统一汇率适配

2	2025-09-05

新增

请求参数 paySupplementary

新增

请求参数 receSupplementary

更新

返回参数 (11)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

