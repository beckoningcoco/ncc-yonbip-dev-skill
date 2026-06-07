---
title: "内部账户利率批量设置"
apiId: "2460129392906993671"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Internal Account IR Settings"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Internal Account IR Settings]
platform_version: "BIP"
source_type: community-api-docs
---

# 内部账户利率批量设置

> `ContentType	application/json` 请求方式	POST | 分类: Internal Account IR Settings (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/FCC/stct/openapi/interestRateSetting

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
| settlementCenter | string | 否 | 是 | 结算中心 ：平台的已启用业务单元档案，且勾选结算中心属性；支持录入编码和名称； 示例："ZSZB"或"曾氏总部" |
| accentity | string | 否 | 是 | 开户资金组织：平台的已启用业务单元档案，且勾选资金组织属性，且与结算中心搭建资金结算委托关系；支持录入编码和名称； 示例："ZSFB"或"曾氏分部" |
| currency | string | 否 | 是 | 币种：平台的已启用币种档案，支持录入编码和名称； 示例："CNY"或"人民币" |
| innerAccountNum | string | 否 | 是 | 内部账号：平台的已启用企业资金账户档案，且开户类型为结算中心账户、账户性质为一般、账户类型为活期；支持录入编码和账户名称； 示例："INT000000ZSZB000002"或"分部内部户" |
| depositChangeType | string | 否 | 否 | 活期存款利率变更方式：枚举值：1表示按比例增减%、2表示增加/减少固定值、3表示调整为固定值；仅支持录入编码； 示例："1" |
| depositChangeValue | number |
| 小数位数:6,最大长度:15 | 否 | 否 | 活期存款利率变更值：活期存款利率变更方式有值时，活期存款利率变更值必填； 示例：0.5 |
| interestDays | number |
| 小数位数:0,最大长度:3 | 否 | 否 | 计息天数：需录入360或365； 示例：365 |
| overdraftChangeType | string | 否 | 否 | 活期透支利率变更方式：枚举值：1表示按比例增减%、2表示增加/减少固定值、3表示调整为固定值；仅支持录入编码； 示例："1" |
| overdraftChangeValue | number |
| 小数位数:6,最大长度:15 | 否 | 否 | 活期透支利率变更值 ：活期透支利率变更方式有值时，活期透支利率变更值必填； 示例：0.5 |
| startDate | date |
| 格式:yyyy-MM-dd | 否 | 是 | 利率生效日期：yyyy-MM-dd 利率生效日期不能小于开户日期； 利率生效日期大于预提结束日； 利率生效日期大于结息结束日 示例："2026-02-02" |

## 3. 请求示例

Url: /yonbip/FCC/stct/openapi/interestRateSetting?access_token=访问令牌
Body: [{
	"settlementCenter": "\"ZSZB\"或\"曾氏总部\"",
	"accentity": "\"ZSFB\"或\"曾氏分部\"",
	"currency": "\"CNY\"或\"人民币\"",
	"innerAccountNum": "\"INT000000ZSZB000002\"或\"分部内部户\"",
	"depositChangeType": "\"1\"",
	"depositChangeValue": 0.5,
	"interestDays": 365,
	"overdraftChangeType": "\"1\"",
	"overdraftChangeValue": 0.5,
	"startDate": "2026-02-02"
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
| code | string | 否 | code |
| data | object | 否 | 返回值 |
| status | string | 否 | 状态 SUCCESS 成功 FAIL 失败 |
| total | number |
| 小数位数:0,最大长度:10 | 否 | 请求总数 |
| errorNum | number |
| 小数位数:0,最大长度:10 | 否 | 失败数量 |
| successNum | number |
| 小数位数:0,最大长度:10 | 否 | 成功数量 |
| resultDataVOs | object | 是 | 具体返回数据 |

## 5. 正确返回示例

{
	"code": "",
	"data": {
		"status": "",
		"total": 0,
		"errorNum": 0,
		"successNum": 0,
		"resultDataVOs": [
			{
				"requestSeqNo": "",
				"code": 0,
				"message": ""
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	抱歉，服务出现异常，请稍后再试。如果问题持续，请上报或者联系


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

