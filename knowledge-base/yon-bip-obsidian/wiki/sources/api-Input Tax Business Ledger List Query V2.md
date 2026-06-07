---
title: "进项业务台账列表查询V2V2"
apiId: "2486864387507224582"
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

# 进项业务台账列表查询V2V2

> `ContentType	application/json` 请求方式	POST | 分类: Input Tax Invoice Management (TAX)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/FCC/TAX/TAXIT/input-tax/api/busi-collection/searchV2

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
| orgcode | string | 否 | 否 | 税务组织编码 示例：pjzx |
| billType | string | 否 | 否 | 票据类型 invoice:增值税发票/tolls:过路费/train:火车票/quota:定额发票/machine:机打发票/taxi:出租车发票/passenger:客运发票/air:航空电子行程单/other:其他发票/nontax:非税发票/custbook:海关缴款书/tax_payment_proof:完税证明 示例：invoice |
| fpHm | string | 否 | 否 | 发票号码（以下必填其一：fpHm，billDateStart、billDateEnd，submitDateStart、submitDateEnd，accountTimeStart、accountTimeEnd，reimburseDateStart、reimburseDateEnd，srcBilltype，srcBillcode，srcBillid，busiFlags） 示例：12356 |
| busiFlags | string | 是 | 否 | 业务类型(0:报销 1:采购) 示例：["0"] |
| billDateStart | string | 否 | 否 | 业务单据制单开始日期(yyyy-MM-dd，以下必填其一：fpHm，billDateStart、billDateEnd，submitDateStart、submitDateEnd，accountTimeStart、accountTimeEnd，reimburseDateStart、reimburseDateEnd，srcBilltype，srcBillcode，srcBillid，busiFlags) 示例：2022-08-01 |
| billDateEnd | string | 否 | 否 | 业务单据制单结束日期(yyyy-MM-dd，以下必填其一：fpHm，billDateStart、billDateEnd，submitDateStart、submitDateEnd，accountTimeStart、accountTimeEnd，reimburseDateStart、reimburseDateEnd，srcBilltype，srcBillcode，srcBillid，busiFlags) 示例：2023-01-01 |
| submitDateStart | string | 否 | 否 | 登记开始日期(yyyy-MM-dd，以下必填其一：fpHm，billDateStart、billDateEnd，submitDateStart、submitDateEnd，accountTimeStart、accountTimeEnd，reimburseDateStart、reimburseDateEnd，srcBilltype，srcBillcode，srcBillid，busiFlags) 示例：2023-02-01 |
| submitDateEnd | string | 否 | 否 | 登记结束日期(yyyy-MM-dd，以下必填其一：fpHm，billDateStart、billDateEnd，submitDateStart、submitDateEnd，accountTimeStart、accountTimeEnd，reimburseDateStart、reimburseDateEnd，srcBilltype，srcBillcode，srcBillid，busiFlags) 示例：2023-02-01 |
| reimburseDateStart | string | 否 | 否 | 报账开始日期(yyyy-MM-dd，以下必填其一：fpHm，billDateStart、billDateEnd，submitDateStart、submitDateEnd，accountTimeStart、accountTimeEnd，reimburseDateStart、reimburseDateEnd，srcBilltype，srcBillcode，srcBillid，busiFlags) 示例：2023-02-01 |
| reimburseDateEnd | string | 否 | 否 | 报账终止日期(yyyy-MM-dd，以下必填其一：fpHm，billDateStart、billDateEnd，submitDateStart、submitDateEnd，accountTimeStart、accountTimeEnd，reimburseDateStart、reimburseDateEnd，srcBilltype，srcBillcode，srcBillid，busiFlags) 示例：2023-02-01 |
| accountTimeStart | string | 否 | 否 | 记账开始日期(yyyy-MM-dd，以下必填其一：fpHm，billDateStart、billDateEnd，submitDateStart、submitDateEnd，accountTimeStart、accountTimeEnd，reimburseDateStart、reimburseDateEnd，srcBilltype，srcBillcode，srcBillid，busiFlags) 示例：2023-02-01 |
| accountTimeEnd | string | 否 | 否 | 记账终止日期(yyyy-MM-dd，以下必填其一：fpHm，billDateStart、billDateEnd，submitDateStart、submitDateEnd，accountTimeStart、accountTimeEnd，reimburseDateStart、reimburseDateEnd，srcBilltype，srcBillcode，srcBillid，busiFlags) 示例：2023-02-01 |
| srcBilltype | string | 否 | 否 | 业务来源类型(（来源于上游系统，非枚举）（以下必填其一：fpHm，billDateStart、billDateEnd，submitDateStart、submitDateEnd，accountTimeStart、accountTimeEnd，reimburseDateStart、reimburseDateEnd，srcBilltype，srcBillcode，srcBillid，busiFlags）） 示例：业务来源类型 |
| srcBillcode | string | 否 | 否 | 业务系统单据号（以下必填其一：fpHm，billDateStart、billDateEnd，submitDateStart、submitDateEnd，accountTimeStart、accountTimeEnd，reimburseDateStart、reimburseDateEnd，srcBilltype，srcBillcode，srcBillid，busiFlags） 示例：12345 |
| srcBillid | string | 否 | 否 | 业务系统单据ID（以下必填其一：fpHm，billDateStart、billDateEnd，submitDateStart、submitDateEnd，accountTimeStart、accountTimeEnd，reimburseDateStart、reimburseDateEnd，srcBilltype，srcBillcode，srcBillid，busiFlags） 示例：34567 |
| contractId | string | 否 | 否 | 合同ID 示例：123 |
| contractNo | string | 否 | 否 | 合同编号 示例：123 |
| contractName | string | 否 | 否 | 合同名称 示例：123 |
| pubtsBegin | string | 否 | 否 | 时间戳格式：yyyy-MM-dd HH:mm:ss 示例：2024-02-12 12:00:00 |
| page | object | 否 | 否 | 分页对象 |
| page | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 当前页数 默认值：1 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 每页数量 默认值：2 |
| pubtsEnd | string | 否 | 否 | 时间戳格式：yyyy-MM-dd HH:mm:ss 示例：2024-02-12 13:00:00 |

## 3. 请求示例

Url: /yonbip/FCC/TAX/TAXIT/input-tax/api/busi-collection/searchV2?access_token=访问令牌
Body: {
	"orgcode": "pjzx",
	"billType": "invoice",
	"fpHm": "12356",
	"busiFlags": [
		"0"
	],
	"billDateStart": "2022-08-01",
	"billDateEnd": "2023-01-01",
	"submitDateStart": "2023-02-01",
	"submitDateEnd": "2023-02-01",
	"reimburseDateStart": "2023-02-01",
	"reimburseDateEnd": "2023-02-01",
	"accountTimeStart": "2023-02-01",
	"accountTimeEnd": "2023-02-01",
	"srcBilltype": "业务来源类型",
	"srcBillcode": "12345",
	"srcBillid": "34567",
	"contractId": "123",
	"contractNo": "123",
	"contractName": "123",
	"pubtsBegin": "2024-02-12 12:00:00",
	"page": {
		"page": 0,
		"pageSize": 0
	},
	"pubtsEnd": "2024-02-12 13:00:00"
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
| data | object | 否 | 返回数据( 不同业务场景返回字段有差异 ) |
| totalEntity | object | 否 | 总计 |
| busiCollectionInvoiceApiDTOS | object | 是 | 报账返回对象 |
| message | string | 否 | 信息说明 示例：success |

## 5. 正确返回示例

{
	"code": "200",
	"data": {
		"totalEntity": {
			"totalCount": 6,
			"totalReimburseHjseSum": 0,
			"totalReimburseJeSum": 3384.87,
			"totalReimburseJshjSum": 3384.87
		},
		"busiCollectionInvoiceApiDTOS": [
			{
				"accountStatus": "0",
				"billDate": "2022-08-13 11:39:42",
				"billType": "invoice",
				"busiFlag": "0",
				"declareStatus": "1",
				"equalSale": "N",
				"fpDm": "123",
				"fpHm": "54157056",
				"fplx": "1",
				"nsrsbh": "91150291740146937K",
				"nsrsmc": "东方希望包头稀土铝业有限责任公司",
				"orgName": "票据中心-东方希望全电",
				"paymentStatus": "0",
				"pkInvoice": "1521809854949228549",
				"reimburseStatus": "10",
				"reimburseUser": "XXXXXX",
				"srcBillcode": "业务系统单据号",
				"srcBillid": "eryu245",
				"srcBilltype": "来源业务系统",
				"submitDate": "2022-08-13 11:39:44",
				"submitter": "XXXXXX",
				"suspectFlag": "1",
				"taxRebate": "N",
				"xsfMc": "北京市政交通一卡通有限公司",
				"xsfNsrsbh": "91110000801145381H",
				"contractId": "123",
				"contractNo": "123",
				"contractName": "123",
				"voucherid": "123",
				"sfrz": "01",
				"rzyt": "02",
				"rzsj": "2024-07-31 00:00:00"
			}
		]
	},
	"message": "success"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

9999	未知错误	按返回信息处理


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

