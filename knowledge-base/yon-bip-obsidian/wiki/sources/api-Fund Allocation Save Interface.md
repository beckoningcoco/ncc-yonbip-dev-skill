---
title: "资金下拨保存接口"
apiId: "2282671119580266498"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Funds Allocation"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Funds Allocation]
platform_version: "BIP"
source_type: community-api-docs
---

# 资金下拨保存接口

> `ContentType	application/json` 请求方式	POST | 分类: Funds Allocation (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/fdtr/allocation/openapi/save

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
| allocations | object | 是 | 否 | 资金下拨单对象列表 |
| sourceSystem | string | 否 | 是 | 上游业务系统，只支持编码 示例：3 |
| accentity | string | 否 | 是 | 下拨资金组织，支持名称和编码 示例：用友集团或YYJT |
| paymentCurrency | string | 否 | 是 | 下拨币种 示例：人民币或CNY |
| businessDate | string | 否 | 是 | 单据日期 示例：2025-05-30 |
| verifyState | number |
| 小数位数:0,最大长度:1 | 否 | 是 | 单据状态，仅支持 0 :开立态 示例：开立态：0 |
| remark | string | 否 | 否 | 备注 |
| sourceId | string | 否 | 否 | 上游业务单据主表id 示例：2414626636856033285 |
| details | object | 是 | 否 | 资金下拨明细 |

## 3. 请求示例

Url: /yonbip/ctm/fdtr/allocation/openapi/save?access_token=访问令牌
Body: {
	"allocations": [
		{
			"sourceSystem": "3",
			"accentity": "用友集团或YYJT",
			"paymentCurrency": "人民币或CNY",
			"businessDate": "2025-05-30",
			"verifyState": NaN,
			"remark": "",
			"sourceId": "2414626636856033285",
			"details": [
				{
					"paySettleMode": "银行转账或system_0001",
					"expectSettleDate": "2025-07-15",
					"allocateAmount": 0,
					"payAccount": "曾式分部或6226033845759225",
					"directConnection": "枚举：是、否",
					"paySupplementary": "枚举：是、否",
					"payOlcratetype": "基准汇率或者01",
					"recAccentity": "曾式子部或ZSZB",
					"recSettleMode": "银行转账或system_0001",
					"recAccount": "曾式子部或6226033845759225",
					"recSupplementary": "枚举：是、否",
					"payInnerAccount": "曾式分部或INT00158793448852",
					"recOlcratetype": "基准汇率或者01",
					"purpose": "",
					"postScript": "",
					"sourceChildId": "2414626636856033285",
					"sourceId": "",
					"payOlcratetypeOps": "1 *  2 /",
					"recOlcratetypeOps": "1 * 2 /",
					"recExchangerate": 0,
					"payExchangerate": 0
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

1	2026-01-27

新增

请求参数 (4)

更新

请求参数 (9)

调整汇率小数位

2	2025-12-19

新增

请求参数 sourceId

新增

请求参数 sourceChildId

新增

请求参数 sourceId

增加上游单据主表 id 字段，调整超时时间


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

