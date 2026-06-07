---
title: "可使用票据查询"
apiId: "2003611967565070344"
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

# 可使用票据查询

> `ContentType	application/json` 请求方式	POST | 分类: Bill Registration (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/api/noteInformation/query

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
| accentityCode | string | 否 | 否 | 会计主体编码，名称编码二者其一必填 示例：A001 |
| accentityName | string | 否 | 否 | 会计主体名称，名称编码二者其一必填 示例：成都分公司 |
| direction | number |
| 小数位数:0,最大长度:1 | 否 | 是 | 收付类型 0=收款 1=付款 示例：0 |
| billDirection | number |
| 小数位数:0,最大长度:1 | 否 | 否 | 票据方向 1=应收票据 2=应付票据 示例：1 |
| billType | string | 否 | 否 | 票据类型编码，取BIP商业汇票/票据类型配置的编码 示例：D001 |
| noteno | string | 否 | 否 | 票据号，支持模糊查询 示例：558489400055848940005584894212 |
| businessDate | date |
| 格式:yyyy-MM-dd | 否 | 否 | 业务日期，做补录业务时，传入调用方系统设置的业务日期 示例：2025-01-01 |

## 3. 请求示例

Url: /yonbip/ctm/api/noteInformation/query?access_token=访问令牌
Body: {
	"accentityCode": "A001",
	"accentityName": "成都分公司",
	"direction": 0,
	"billDirection": 1,
	"billType": "D001",
	"noteno": "558489400055848940005584894212",
	"businessDate": "2025-01-01"
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
| code | string | 否 | 请求结果 00=查询成功 01=查询失败 示例：00 |
| message | string | 否 | 失败原因 示例：查询成功 |
| data | object | 否 | data |
| recordNum | long | 否 | 本次查询记录数 示例：1 |
| recordList | object | 是 | recordList |

## 5. 正确返回示例

{
	"code": "00",
	"message": "查询成功",
	"data": {
		"recordNum": 1,
		"recordList": [
			{
				"pkRegister": "123456789",
				"noteNo": "558489400055848940005584894212",
				"billType": "D001",
				"billTypeName": "商业承兑汇票",
				"availableRange": "1-50000,70001-100000",
				"oneAvailableMoney": 500,
				"availableMoney": 0,
				"invoiceDate": "20240523",
				"endDate": "20241123",
				"noteMoney": 1000,
				"ifSepFlow": true,
				"payer": "尼卡",
				"payerCode": "N001",
				"invoicer": "尾田",
				"acceptancer": "红发",
				"receiver": "路飞",
				"noteStatus": "3",
				"billDirection": 1,
				"eleAccount": "88888888",
				"openFlag": true,
				"acceptBankTypeName": "中国工商银行",
				"extendData": ""
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

暂时没有数据哦~


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

