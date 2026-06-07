---
title: "银行对账单查询"
apiId: "1658523817918595078"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Bank Transaction Processing"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Bank Transaction Processing]
platform_version: "BIP"
source_type: community-api-docs
---

# 银行对账单查询

> `ContentType	application/json` 请求方式	POST | 分类: Bank Transaction Processing (ctm)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/ctm/cmp/bankReconciliationQuery

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
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| pageIndex | int | 否 | 否 | 页号 默认值：1 |
| pageSize | int | 否 | 否 | 每页行数 默认值：10 |
| accentity | string | 否 | 否 | 账户使用组织id 示例：2591580914225408 |
| accentity_code | string | 否 | 否 | 账户使用组织编码；只有账户使用组织id为空时该条件生效 示例：110 |
| dc_flag | int | 否 | 否 | 收付方向 1：支出 2：收入 示例：1 |
| currency | string | 否 | 否 | 币种id 示例：2350737731850752 |
| currency_name | string | 否 | 否 | 币种名称；只有在币种id为空时该条件才会生效 示例：人民币 |
| bank_seq_no | string | 否 | 否 | 银行交易流水号 示例：test01 |
| begindate | Date | 否 | 否 | 交易日期(开始)；与交易日期互斥；返回晚于等于该交易日期的银行对账单数据 示例：2023-02-10 |
| enddate | Date | 否 | 否 | 交易日期(截止)；查询交易日期在交易日期（开始）-交易日期（截止）范围内的数据，需晚于等于开始日期；与交易日期（开始）需同时有值\无值，与交易日期互斥 示例：2023-02-15 |
| tran_date | Date | 否 | 否 | 交易日期；与开始日期、结束日期互斥 示例：2023-02-10 |
| bankaccount | string | 否 | 否 | 本方银行账户id 示例：1510000739330031619 |
| bankaccount_account | string | 否 | 否 | 本方银行账号；只有本方银行账户id为空时该条件生效 示例：622221444555 |
| bankaccounts | string | 否 | 否 | 本方银行账户(批量);按照银行账号进行批量查询,与本方银行账户互斥 示例：1510000739330031619,1510000739330031563,151000073933003696 |
| creat_begintime | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 创建时间(开始);返回晚于等于该创建时间的银行对账单数据 示例：2024-01-17 16:05:19 |
| creat_endtime | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 创建时间(结束);返回早于等于该创建时间的银行对账单数据，需晚于创建时间（开始），与创建时间（开始）需同时有值\无值 示例：2024-01-17 16:05:19 |
| updatebegintime | string | 否 | 否 | 修改时间(开始)：返回晚于或等于该修改时间的诗句 示例：2024-01-17 16:05:19 |
| updateendtime | string | 否 | 否 | 修改时间(结束)：返回早于或等于修改结束时间的数据，跟修改开始同时有值或同时为空 示例：2024-01-18 16:05:19 |

## 3. 请求示例

Url: /yonbip/ctm/cmp/bankReconciliationQuery?access_token=访问令牌
Body: {
	"pageIndex": 0,
	"pageSize": 0,
	"accentity": "2591580914225408",
	"accentity_code": "110",
	"dc_flag": 1,
	"currency": "2350737731850752",
	"currency_name": "人民币",
	"bank_seq_no": "test01",
	"begindate": "2023-02-10",
	"enddate": "2023-02-15",
	"tran_date": "2023-02-10",
	"bankaccount": "1510000739330031619",
	"bankaccount_account": "622221444555",
	"bankaccounts": "1510000739330031619,1510000739330031563,151000073933003696",
	"creat_begintime": "2024-01-17 16:05:19",
	"creat_endtime": "2024-01-17 16:05:19",
	"updatebegintime": "2024-01-17 16:05:19",
	"updateendtime": "2024-01-18 16:05:19"
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
| data | object | 否 | 返回数据 |
| recordList | object | 是 | 返回数据 |
| totalCount | number |
| 小数位数:2,最大长度:10 | 否 | 总记录数 示例：10 |
| pageNum | number |
| 小数位数:2,最大长度:10 | 否 | 总页数 示例：10 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"recordList": [
			{
				"id": 2788485821747968,
				"accentity": "2591580914225408",
				"accentity_code": "ZSZB",
				"accentity_name": "曾氏总部",
				"currency": "2591342867010560",
				"currency_name": "人民币",
				"bankaccount": "1510000739330031619",
				"bankaccount_acctName": "测试银行账户户名",
				"bankaccount_account": "622221444555",
				"bank_seq_no": "test01",
				"tran_date": "2023-03-01",
				"dc_flag": 1,
				"tran_amt": 22.3,
				"to_acct_no": "622221444555",
				"to_acct_name": "测试银行账户户名",
				"to_acct_bank": "建设银行",
				"to_acct_bank_name": "曾氏总部",
				"use_name": "用途",
				"remark": "摘要",
				"bankcheckno": "",
				"currency_code": "CNY",
				"tran_time": "2023-01-01 00:00:00",
				"remark01": "",
				"interest": "100",
				"dataOrigin": "",
				"unique_no": "abcd888888",
				"acct_bal": "10.00",
				"smartcheckno": "A0123BCD",
				"createTime": "",
				"createDate": "",
				"associationstatus": 0,
				"serialdealendstate": 0,
				"serialdealtype": 0
			}
		],
		"totalCount": 10,
		"pageNum": 10
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	服务端逻辑异常:XXX	根据提示调整参数重试请求


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-12-19

更新

请求说明

新增

请求参数 updatebegintime

新增

请求参数 updateendtime

更新

返回参数 serialdealtype

2	2025-05-28

更新

请求参数 dc_flag

删除

返回参数 bankNumberName


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

