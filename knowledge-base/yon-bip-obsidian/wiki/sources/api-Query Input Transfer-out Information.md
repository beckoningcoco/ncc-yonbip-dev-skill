---
title: "查询进项转出信息"
apiId: "1760323588055891972"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Value-added Tax"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Value-added Tax]
platform_version: "BIP"
source_type: community-api-docs
---

# 查询进项转出信息

> `ContentType	application/json` 请求方式	POST | 分类: Value-added Tax (TAX)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/tax/input-tax/api/deduction/outdetail/query

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	列表查询

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| pagesize | int | query | 是 | 每页大小    示例: 20 |
| pagenum | int | query | 是 | 第几页    示例: 1 |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| orgcode | string | 否 | 否 | 受票组织编码（纳税人识别号和组织编码不能同时为空!） 示例：12345 |
| nsrsbh | string | 否 | 否 | 受票企业纳税人识别号（纳税人识别号和组织编码不能同时为空!） 示例：3456 |
| createTimeStart | string | 否 | 是 | 操作日期-起（yyyy-MM-dd HH:mm:ss） 示例：2021-01-01 00:00:00 |
| createTimeEnd | string | 否 | 是 | 操作日期-止（yyyy-MM-dd HH:mm:ss） 示例：2021-01-01 00:00:00 |
| outTimeStart | string | 否 | 否 | 转出税款所属期-起(yyyy-MM)) 示例：2024-04 |
| outTimeEnd | string | 否 | 否 | 转出税款所属期-止(yyyy-MM)) 示例：2024-04 |
| secretLevelIds | string | 是 | 否 | 单据密集 1742345679572828161:公开;1742345679572828162:内部;1742345679572828163:秘密;1742345679572828164:机密 示例：["1742345679572828161"] |
| srcIds | string | 是 | 否 | 数据来源ID 示例：["111"] |
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 页数（此参数设置值会覆盖pagenum） 示例：1 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 每页大小 示例：20 |

## 3. 请求示例

Url: /yonbip/tax/input-tax/api/deduction/outdetail/query?access_token=访问令牌&pagesize=20&pagenum=1
Body: {
	"orgcode": "12345",
	"nsrsbh": "3456",
	"createTimeStart": "2021-01-01 00:00:00",
	"createTimeEnd": "2021-01-01 00:00:00",
	"outTimeStart": "2024-04",
	"outTimeEnd": "2024-04",
	"secretLevelIds": [
		"1742345679572828161"
	],
	"srcIds": [
		"111"
	],
	"pageIndex": 1,
	"pageSize": 20
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| message | string | 否 | 提示信息 示例：操作成功 |
| data | object | 是 | 返回数据 |
| totalCount | long | 否 | 总记录数 示例：100 |
| bills | object | 是 | 查询结果明细 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"totalCount": 100,
			"bills": [
				{
					"fpDm": "1234",
					"fpHm": "34456",
					"kprq": "2023-06-07 10:02:03",
					"fplx": "1",
					"xsfNsrsbh": "12456",
					"xsfMc": "北京xxxxxx",
					"gmfNsrsbh": "23456",
					"gmfMc": "北京XXXX",
					"hjje": 100.1,
					"hjse": 20.3,
					"outMoney": 40.5,
					"outDate": "2023-05-06",
					"outPeriod": "2023-01",
					"reason": "1",
					"vnote": "备注1",
					"srcId": "",
					"id": "2018413644632031232",
					"taxRebate": "N",
					"accountPeriod": "2025-02",
					"defineTerm": {
						"sg_einvoice_type": "380",
						"camboo": true
					}
				}
			]
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

9999	未知错误	按返回信息处理


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-04-10

更新

请求说明

更新

请求参数 (5)

更新

返回参数 (5)

1

2	2025-09-03

新增

返回参数 defineTerm


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

