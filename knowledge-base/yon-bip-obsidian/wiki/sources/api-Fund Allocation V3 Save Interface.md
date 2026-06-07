---
title: "资金下拨V3保存接口"
apiId: "2022196866578907140"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Funds Allocation (V3)"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Funds Allocation (V3)]
platform_version: "BIP"
source_type: community-api-docs
---

# 资金下拨V3保存接口

> `ContentType	application/json` 请求方式	POST | 分类: Funds Allocation (V3) (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/fdtr/allocate/save

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| accentity | string | 否 | 是 | 资金组织，可以传入id或code 示例："2029398873896648709" 或 "ZSZB" |
| superiorOlccurrency | string | 否 | 是 | 账户币种，可以传入id或code 示例："2029362297966166280" 或 "CNY" |
| paymentSettleMode | string | 否 | 否 | 付款方结算方式，可以传入编码或者名称 |
| superiorAccount | string | 否 | 是 | 下拨银行账号，可以传入id或code 示例："1956702034117787648" 或 "BH3210003" |
| bankEnterprisePay | string | 否 | 否 | 是否直联，1-是 0-否，填入1或者0 示例：1 |
| payOlcratetype | string | 否 | 是 | 付款方汇率类型，可以传入id或code 示例："0000LXWJE34WA58UB40000" 或 "01" |
| billDate | date |
| 格式:yyyy-MM-dd | 否 | 否 | 单据日期 示例：2024-11-21 |
| allocatExplain | string | 否 | 否 | 说明 示例：描述信息 |
| code | string | 否 | 否 | 单据编号 示例：HANDLEALLOCATE24062800001 |
| allocateBodyList | object | 是 | 是 | 子表实体引用 |
| collectionAccentity | string | 否 | 是 | 收款方资金组织，可以传入id或code 示例："1949249432653398023" 或 "ZSFB" |
| receiverSettleMode | string | 否 | 否 | 收款方结算方式，可以传入编码或者名称 |
| allocateAccount | string | 否 | 是 | 收款银行账号，可以传入id或code 示例："1956702034117787648" 或 "BH3210003" |
| innerAccount | string | 否 | 否 | 内部账户，可以传入id或code 示例："2012675293473406978" 或 "JSZXH" |
| allocateMoney | number |
| 小数位数:8,最大长度:22 | 否 | 是 | 金额 示例：200 |
| receiveOlcratetype | string | 否 | 是 | 收款方汇率类型，可以传入id或code 示例："2012675293473406978" 或 "JSZXH" |
| isBankEnterprisePay | boolean | 否 | 否 | 是否直联：true、false 示例：true |
| remark | string | 否 | 否 | 备注 示例：备注信息 |

## 3. 请求示例

Url: /yonbip/ctm/fdtr/allocate/save?access_token=访问令牌
Body: {
	"accentity": "\"2029398873896648709\" 或 \"ZSZB\"",
	"superiorOlccurrency": "\"2029362297966166280\" 或 \"CNY\"",
	"paymentSettleMode": "",
	"superiorAccount": "\"1956702034117787648\" 或 \"BH3210003\"",
	"bankEnterprisePay": "1",
	"payOlcratetype": "\"0000LXWJE34WA58UB40000\" 或 \"01\"",
	"billDate": "2024-11-21",
	"allocatExplain": "描述信息",
	"code": "HANDLEALLOCATE24062800001",
	"allocateBodyList": [
		{
			"collectionAccentity": "\"1949249432653398023\" 或 \"ZSFB\"",
			"receiverSettleMode": "",
			"allocateAccount": "\"1956702034117787648\" 或 \"BH3210003\"",
			"innerAccount": "\"2012675293473406978\" 或 \"JSZXH\"",
			"allocateMoney": 200,
			"receiveOlcratetype": "\"2012675293473406978\" 或 \"JSZXH\"",
			"isBankEnterprisePay": true,
			"remark": "备注信息"
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
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 调用成功时的返回数据 |
| accentity | string | 否 | 资金组织 示例：1957418804026802180 |
| superiorOlccurrency | string | 否 | 币种 示例：1800246726388875297 |
| superiorAccount | string | 否 | 银行账号 示例：1959620172346032137 |
| totalNumber | number |
| 小数位数:0,最大长度:10 | 否 | 总笔数 示例：1 |
| totalAmount | number |
| 小数位数:8,最大长度:22 | 否 | 总金额 示例：200 |
| id | string | 否 | ID 示例：2028946192762667016 |
| code | string | 否 | 编码 示例：000004 |
| AllocateBodyList | object | 否 | 子表 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"accentity": "1957418804026802180",
		"superiorOlccurrency": "1800246726388875297",
		"superiorAccount": "1959620172346032137",
		"totalNumber": 1,
		"totalAmount": 200,
		"id": "2028946192762667016",
		"code": "000004",
		"AllocateBodyList": {
			"collectionAccentity": "1957419164804055042",
			"allocateCurrency": "1800246726388875297",
			"allocateAccount": "1962594694902841351",
			"allocateMoney": 200,
			"id": "2028946192762667017"
		}
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-03-12

更新

请求说明

更新

请求参数 (5)

tiaozheng shuoming

2	2025-07-29

更新

请求说明


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

