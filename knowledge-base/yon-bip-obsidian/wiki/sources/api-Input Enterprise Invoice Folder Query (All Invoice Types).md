---
title: "进项企业票夹查询（全票种）"
apiId: "1758817909940420608"
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

# 进项企业票夹查询（全票种）

> `ContentType	application/json` 请求方式	POST | 分类: Input Tax Invoice Management (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/input-tax/api/bill/querybilllist

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
| searchParam | object | 否 | 是 | 查询参数 |
| billType | string | 否 | 是 | 票据类型 invoice:增值税发票/tolls:过路费/train:火车票/quota:定额发票/machine:机打发票/taxi:出租车发票/passenger:客运发票/air:航空电子行程单/other:其他发票/nontax:非税发票/custbook:海关缴款书/tax_payment_proof:完税证明 示例：invoice |
| busiType | string | 否 | 否 | 业务类型（billType=nontax时根据业务类型busiType区分详细票种 64-财政非税票据 65-进项医疗门诊票据 66-进项医疗住院票据） 示例：64 |
| orgCode | string | 否 | 否 | 税务组织编码 示例：11111 |
| invoiceCode | string | 否 | 否 | 发票代码 示例：11111 |
| invoiceNum | string | 否 | 否 | 发票号码 示例：11111 |
| billDateBegin | string | 否 | 否 | 开票日期段-开始时间,格式（yyyy-MM-dd） 示例：2022-01-01 |
| billDateEnd | string | 否 | 否 | 开票日期段-结束时间,格式（yyyy-MM-dd） 示例：2023-01-01 |
| submitter | string | 否 | 否 | 保存票据人 示例：张三 |
| xsfMc | string | 否 | 否 | 销售方名称 示例：用友xxxxxxxx |
| xsfNsrsbh | string | 否 | 否 | 销售方税号 示例：12345678 |
| reimburseStatus | long | 是 | 否 | 报账状态，0-未报账，1-报账中,5-部分已报账, 10-已报账 示例：[0] |
| accountStatus | long | 是 | 否 | 记账状态:0-未记账, 5-部分已记账, 10-已记账 示例：[0] |
| suspectFlag | string | 是 | 否 | 票据合规标识:1-合规 ，2-存疑， 3-不合规 示例：["1"] |
| suspectStatus | long | 是 | 否 | 票据合规处理:1-未通过，2-已通过，3-已禁止 示例：[1] |
| compareStatus | long | 是 | 否 | 下载比对状态:0-未比对,1-相符, 2-不相符,3-未通过,4-失败 示例：[0] |
| yyVerifyStatus | long | 是 | 否 | 用友查验状态:0-未查验,1-相符, 2-不相符,3-未通过,4-失败 示例：[0] |
| thirdVerifyStatus | long | 是 | 否 | 第三方查验状态:0-未查验,1-相符, 2-不相符,3-未通过,4-失败 示例：[0] |
| signStatus | long | 是 | 否 | 验签状态:0-未验签,1-完整,2-被修改,3-无签章,4-失败 示例：[0] |
| srcBilltype | string | 否 | 否 | 来单据类型，或者单据类型id,如果传的是平台单据类型id，会转换成对应的类型业务 示例：单据类型 |
| srcBillcode | string | 否 | 否 | 业务系统单据号 示例：123 |
| srcBillid | string | 否 | 否 | 业务单据id 示例：134 |
| uniqueCode | string | 否 | 否 | 航空客票唯一码 示例：134 |
| ticketNum | string | 否 | 否 | 航空客票电子客票号码 示例：111 |
| receiptNumber | string | 否 | 否 | 航空客票行程单号 示例：456778 |
| printNumber | string | 否 | 否 | 航空客票印刷序号 示例：356484 |
| number | string | 否 | 否 | 火车票号 示例：78900 |
| invoicingPartyName | string | 否 | 否 | 开票单位名称 示例：北京xxxxxx |
| recName | string | 否 | 否 | 收款单位名称 示例：北京xxxxxx |
| submitDateBegin | string | 否 | 否 | 保存票据日期:起始日期时间,只传日期，默认起始时间就是00:00:00，增值税对应createTime字段值，其它票种对应submitDate字段值。 示例：2023-03-01 00:00:00 |
| submitDateEnd | string | 否 | 否 | 保存票据日期:终止日期时间,只传日期默认截止时间是23:59:59，，增值税对应createTime字段值，其它票种对应submitDate字段值。 示例：2023-03-02 23:59:59 |
| pubtsBegin | string | 否 | 否 | 时间戳格式：yyyy-MM-dd HH:mm:ss 示例：2024-01-01 12:00:00 |
| pubtsEnd | string | 否 | 否 | 时间戳格式：yyyy-MM-dd HH:mm:ss 示例：2024-01-01 13:00:00 |
| verifyStatus | string | 是 | 否 | 认证状态：1-不需认证；2-未勾选；3-已勾选；4-已认证（增值税发票有效） 示例：[2] |
| userMobileOrEmail | string | 否 | 否 | 用户电话或邮箱(个人票夹) 示例：12345@qq.com |
| gmfMcFuzzy | string | 否 | 否 | 购买方名称（增值税发票查询使用，左匹配模糊查询） 示例：用友xxxxx |
| gmfNsrsbhFuzzy | string | 否 | 否 | 购买方税号（增值税发票查询使用，左匹配模糊查询） 示例：123xxxxx |
| occupySystemCode | string | 否 | 否 | 占用系统 示例：BIP-RBSM |
| dzbs | string | 否 | 否 | 独占标识：0-未独占 1-系统独占 示例：1 |
| usageStatuses | string | 是 | 否 | 占用状态：0-未使用，5-部分使用，10-完全使用，15-使用完毕 示例：[10] |
| remark | string | 否 | 否 | 发票的备注，模糊查询 |
| pagenum | long | 否 | 是 | 页码 示例：1 |
| pagesize | long | 否 | 是 | 每页显示条数 示例：20 |

## 3. 请求示例

Url: /yonbip/tax/input-tax/api/bill/querybilllist?access_token=访问令牌
Body: {
	"searchParam": {
		"billType": "invoice",
		"busiType": "64",
		"orgCode": "11111",
		"invoiceCode": "11111",
		"invoiceNum": "11111",
		"billDateBegin": "2022-01-01",
		"billDateEnd": "2023-01-01",
		"submitter": "张三",
		"xsfMc": "用友xxxxxxxx",
		"xsfNsrsbh": "12345678",
		"reimburseStatus": [
			0
		],
		"accountStatus": [
			0
		],
		"suspectFlag": [
			"1"
		],
		"suspectStatus": [
			1
		],
		"compareStatus": [
			0
		],
		"yyVerifyStatus": [
			0
		],
		"thirdVerifyStatus": [
			0
		],
		"signStatus": [
			0
		],
		"srcBilltype": "单据类型",
		"srcBillcode": "123",
		"srcBillid": "134",
		"uniqueCode": "134",
		"ticketNum": "111",
		"receiptNumber": "456778",
		"printNumber": "356484",
		"number": "78900",
		"invoicingPartyName": "北京xxxxxx",
		"recName": "北京xxxxxx",
		"submitDateBegin": "2023-03-01 00:00:00",
		"submitDateEnd": "2023-03-02 23:59:59",
		"pubtsBegin": "2024-01-01 12:00:00",
		"pubtsEnd": "2024-01-01 13:00:00",
		"verifyStatus": [
			2
		],
		"userMobileOrEmail": "12345@qq.com",
		"gmfMcFuzzy": "用友xxxxx",
		"gmfNsrsbhFuzzy": "123xxxxx",
		"occupySystemCode": "BIP-RBSM",
		"dzbs": "1",
		"usageStatuses": [
			10
		],
		"remark": ""
	},
	"pagenum": 1,
	"pagesize": 20
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
| message | string | 否 | 信息说明 示例：操作成功 |
| data | object | 否 | 返回信息 |
| bills | object | 是 | 发票信息 见开放平台接口信息补充描述-进项发票管理fapiao.yonyoucloud.com/apidoc/appendix/ 示例：[{"发票信息":"见开放平台接口信息补充描述-进项发票管理fapiao.yonyoucloud.com/apidoc/appendix/"}] |
| totalEntity | object | 否 | 合计 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"bills": [
			{
				"发票信息": "见开放平台接口信息补充描述-进项发票管理fapiao.yonyoucloud.com/apidoc/appendix/"
			}
		],
		"totalEntity": {
			"totalCount": 3
		}
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

9999	未知错误	按返回信息处理


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-05-20

更新

请求说明

更新

返回参数 data

返回体示例修改

2	2026-05-20

更新

请求说明

修改返回值

3	2025-07-07

新增

请求参数 (4)

更新

请求参数 orgCode

4	2025-07-07

新增

请求参数 (4)

更新

请求参数 orgCode


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

