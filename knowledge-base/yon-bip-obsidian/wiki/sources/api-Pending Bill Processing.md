---
title: "待签收票据处理"
apiId: "2005104580363812869"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Bill Pending Sign-in"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Bill Pending Sign-in]
platform_version: "BIP"
source_type: community-api-docs
---

# 待签收票据处理

> `ContentType	application/json` 请求方式	POST | 分类: Bill Pending Sign-in (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/api/waitsign/operate

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
| accentityCode | string | 否 | 否 | 会计主体编码,与会计主体名称二者其一必填 示例：A001 |
| accentityName | string | 否 | 否 | 会计主体名称，与会计主体编码二者其一必填 示例：成都分公司 |
| operateType | number |
| 小数位数:0,最大长度:1 | 否 | 是 | 操作类型 1=签收，2=拒收 示例：1 |
| needPush | boolean | 否 | 否 | 是否需要生单 true =需要，false=不需要，对操作类型=拒收且签收类型=提示收票、背书转让时生效，为空按票据参数设置 示例：false |
| auditStatus | number |
| 小数位数:0,最大长度:1 | 否 | 否 | 审批状态，1=待提交，2=审批通过，为空默认审批通过，对于需要生单的签收类型生效 示例：1 |
| recordNumber | number |
| 小数位数:0,最大长度:4 | 否 | 是 | 本次请求记录数 示例：1 |
| recordList | object | 是 | 否 | 请求数据 |
| serialno | string | 否 | 是 | 请求流水号，来源系统唯一标识 示例：1234567 |
| elecSignAccount | string | 否 | 是 | 电票账号 示例：88888888 |
| signType | string | 否 | 是 | 签收类型1=提示收票待签收，2=背书转让待签收，3=提示付款待签收，6=解质押待签收，7=提示承兑待签收，10=不可转让撤销待签收，12=质押待签收 示例：1 |
| noteNo | string | 否 | 是 | 票据号码 示例：6238290006238290006238290000001 |
| billRange | string | 否 | 否 | 子票区间 示例：1-500000 |
| refuseReason | string | 否 | 否 | 拒收理由 当操作类型=拒收且签收类型≠提示付款，必填 示例：不要了 |
| payRefuseReason | string | 否 | 否 | 提示付款拒收理由 当操作类型=拒收且签收类型=提示付款，必填，为“其他”时“拒收理由”必填01与自己有直接债权债务关系的持票人未履行约定义务 02持票人以欺诈、偷盗或者胁迫等手段取得票据 03持票人明知有欺诈、偷盗或者胁迫等情形，出于恶意取得票据 04持票人明知债务人与出票人或者持票人的前手之间存在抗辩事由而取得票据 05持票人因重大过失取得不符合《票据法》规定的票据 06超过提示付款期 07被法院冻结或收到法院止付通知书 08票据未到期 09商业承兑汇票承兑人账户余额不足 10其他（必须注明） 示例：10 |

## 3. 请求示例

Url: /yonbip/ctm/api/waitsign/operate?access_token=访问令牌
Body: {
	"accentityCode": "A001",
	"accentityName": "成都分公司",
	"operateType": 1,
	"needPush": false,
	"auditStatus": 1,
	"recordNumber": 1,
	"recordList": [
		{
			"serialno": "1234567",
			"elecSignAccount": "88888888",
			"signType": "1",
			"noteNo": "6238290006238290006238290000001",
			"billRange": "1-500000",
			"refuseReason": "不要了",
			"payRefuseReason": "10"
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
| code | string | 否 | 请求结果 00=成功 01=失败 02=处理中 示例：00 |
| message | string | 否 | 返回信息 示例：查询成功 |
| extendData | string | 否 | 扩展字段 |
| data | object | 否 | data |
| recordList | object | 是 | 返回数据循环 |

## 5. 正确返回示例

{
	"code": "00",
	"message": "查询成功",
	"extendData": "",
	"data": {
		"recordList": [
			{
				"serialNo": "33334444555",
				"waitsignId": "3455555",
				"result": "01",
				"resultMsg": "没事",
				"billType": "51",
				"billId": "987654321",
				"billCode": "register001"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-02-06

更新

请求参数 payRefuseReason


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

