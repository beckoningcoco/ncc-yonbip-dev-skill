---
title: "预勾选发票查询"
apiId: "1761580888192188416"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Input Tax Invoice Management"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Input Tax Invoice Management]
platform_version: "BIP"
source_type: community-api-docs
---

# 预勾选发票查询

> `ContentType	application/json` 请求方式	POST | 分类: Input Tax Invoice Management (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/input-tax/api/vat/queryPreckInvoice

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
| hmDms | object | 是 | 否 | 代码号码列表 period、hmDms 与 开票日期起至少一个必填 |
| fpHm | string | 否 | 否 | 发票号码 示例：11111 |
| fpDm | string | 否 | 否 | 发票代码 示例：11111111 |
| rq_q | string | 否 | 否 | 开票起始日期 yyyy-MM-dd格式 period、hmDms 与 rq_q至少一个必填 示例：2023-01-01 |
| rq_z | string | 否 | 否 | 开票截止日期 yyyy-MM-dd格式 示例：2023-01-01 |
| xsfnsrsbh | string | 否 | 否 | 销售方纳税人识别号 示例：xsf0001 |
| xsfmc | string | 否 | 否 | 销售方名称 示例：xsf |
| fpzt | string | 否 | 否 | 发票状态 空：全部，0：正常，1：失控，2：作废，3：红冲，4：异常 示例：4 |
| fplx | string | 否 | 否 | 发票类型 空：全部，4：增值税专用发票，6：货运专用发票，5：机动车发票，认证发票类型 示例：4 |
| rzztList | string | 是 | 否 | 认证状态 空：全部，2：未勾选，3：已勾选未认证，4：已认证 示例：["2","3"] |
| period | string | 否 | 否 | 认证期间 yyyyMM格式 period、hmDms 与 rq_q至少一个必填 示例：202301 |
| nsrsbh | string | 否 | 是 | 纳税人识别号 示例：test001 |
| orgcode | string | 否 | 否 | 组织编码 示例：test |
| page | long | 否 | 否 | 页数 不填默认1,起始页是1 示例：1 |
| size | long | 否 | 否 | 当前页数量 不填默认50 示例：50 |
| selectPerson | string | 否 | 否 | 勾选人-用友姓名，非用户id、用户编号 示例：11 |
| precheckPerson | string | 否 | 否 | 预勾选人-用友姓名，非用户id、用户编号 示例：11 |
| precheckStatus | int | 否 | 否 | 预勾选状态 0：未勾选；1：已勾选 示例：1 |
| accountUser | string | 否 | 否 | 记账人 示例：11 |
| accountPeriod | string | 否 | 否 | 记账期间 yyyyMM 示例：202301 |
| precheckTimeStart | string | 否 | 否 | 预勾选日期开始 yyyy-MM-dd 示例：2017-01-01 |
| precheckTimeEnd | string | 否 | 否 | 预勾选日期截止 yyyy-MM-dd 示例：2017-01-01 |
| voucherId | string | 否 | 否 | 凭证号 示例：test |
| srcBillcode | string | 否 | 否 | 来源单据号 示例：test |
| bsubinvoice | string | 否 | 否 | 是否分包- Y:是;N:否 示例：N |
| relationBusiCollection | string | 否 | 否 | 是否在台账 0-不在 1-在 示例：0 |
| projectNames | string | 是 | 否 | 项目名称,来自【数字化建模-基础数据-项目】节点 示例：["test"] |
| projectCodes | string | 是 | 否 | 项目编码,来自【数字化建模-基础数据-项目】节点 示例：["1234"] |

## 3. 请求示例

Url: /yonbip/tax/input-tax/api/vat/queryPreckInvoice?access_token=访问令牌
Body: {
	"hmDms": [
		{
			"fpHm": "11111",
			"fpDm": "11111111"
		}
	],
	"rq_q": "2023-01-01",
	"rq_z": "2023-01-01",
	"xsfnsrsbh": "xsf0001",
	"xsfmc": "xsf",
	"fpzt": "4",
	"fplx": "4",
	"rzztList": [
		"2",
		"3"
	],
	"period": "202301",
	"nsrsbh": "test001",
	"orgcode": "test",
	"page": 1,
	"size": 50,
	"selectPerson": "11",
	"precheckPerson": "11",
	"precheckStatus": 1,
	"accountUser": "11",
	"accountPeriod": "202301",
	"precheckTimeStart": "2017-01-01",
	"precheckTimeEnd": "2017-01-01",
	"voucherId": "test",
	"srcBillcode": "test",
	"bsubinvoice": "N",
	"relationBusiCollection": "0",
	"projectNames": [
		"test"
	],
	"projectCodes": [
		"1234"
	]
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
| message | string | 否 | 消息 示例：SUCCESS |
| data | object | 否 | 数据 |
| contents | object | 是 | 信息说明 |
| totalNum | long | 否 | 总数量 示例：1286 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "SUCCESS",
	"data": {
		"contents": [
			{
				"fpDm": "3300162130",
				"fpHm": "15414913",
				"kprq": "20170831",
				"xsfMc": "杭州目庭酒店管理有限公司",
				"hjje": 175.47,
				"hjse": 10.53,
				"verifyStatus": 2,
				"selectTime": "2023-01-01 11:11:11",
				"verifyTime": "2023-01-01 11:11:11",
				"verifyType": "1",
				"fplx": "4",
				"fpzt": "0",
				"xsfNsrsbh": "9133010659309462XE",
				"period": "202301",
				"taskStatus": 1
			}
		],
		"totalNum": 1286
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

9999	未知错误	按返回信息处理


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-04-21

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

