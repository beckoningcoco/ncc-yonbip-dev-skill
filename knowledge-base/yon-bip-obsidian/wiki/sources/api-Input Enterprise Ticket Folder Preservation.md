---
title: "进项企业票夹保存"
apiId: "1758836687537438721"
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

# 进项企业票夹保存

> `ContentType	application/json` 请求方式	POST | 分类: Input Tax Invoice Management (TAX)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/tax/input-tax/api/bill/saveonlytobillcenter

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	批量保存/更新

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| orgcode | string | 否 | 否 | 税务编码（纳税人识别号和税务组织编码至少传入一项）组织最值 示例：test001 |
| nsrsbh | string | 否 | 否 | 纳税人识别号（纳税人识别号和税务组织编码至少传入一项）组织 示例：SWOPENAPI519354 |
| submitter | string | 否 | 是 | 提交人 示例：刘玲 |
| busiFlag | int | 否 | 否 | 业务标识 0- 报销，1-采购 示例：0 |
| srcBillType | string | 否 | 否 | 来源业务系统 示例：系统1 |
| srcBillCode | string | 否 | 否 | 业务系统单据号 示例：1345 |
| srcBillid | string | 否 | 否 | 业务单据id 示例：1566 |
| failMode | string | 否 | 否 | 失败模式 batch- 批量成功/失败，single-逐条成功/失败 示例：batch |
| multiFileMode | string | 否 | 否 | 是否开启多附件模式 | Y-开启，N-关闭，不填时默认为关闭。多附件模式：1.批量上传同一发票的多个版式文件 支持捏合 2.支持已有发票补传附件 示例：N |
| userMobileOrEmail | string | 否 | 否 | 用户电话或邮箱(个人票夹) 示例：1234567@qq.com |
| bills | object | 是 | 是 | 票据信息（ 数量必须小于等于100，超出请分批请求） |
| billType | string | 否 | 是 | 票据类型 目前仅支持 invoice增值税，tax_payment_proof完税证明，custbook海关缴款书，nontax财政非税票据(根据票面信息的busiType判断具体业务类型 64-财政非税票据 65-进项医疗门诊票据 66-进项医疗住院票据) 示例：invoice |
| imageId | long | 否 | 否 | 图片id(（税务云返回的才可获取到对应的文件）,优先获取filePath，filePath为空是才会跟进imageid获取文件路径 示例：1234 |
| filePath | string | 否 | 否 | 文件路径,优先获取filePath，filePath为空是才会跟进imageid获取文件路径 示例："obs://2023-07-06/000a80fde8ba7a3fcc.pdf" |
| data | object | 否 | 是 | 发票信息 见开放平台接口信息补充描述-进项发票管理fapiao.yonyoucloud.com/apidoc/appendix/ 示例：发票信息 见开放平台接口信息补充描述-进项发票管理fapiao.yonyoucloud.com/apidoc/appendix/ |
| attachs | object | 是 | 否 | 附件信息 由税务云解析接口/input-tax/api/invoice/parse返回，多附件模式下必填，需要根据attaches信息补充附件路径 |

## 3. 请求示例

Url: /yonbip/tax/input-tax/api/bill/saveonlytobillcenter?access_token=访问令牌
Body: {
	"orgcode": "test001",
	"nsrsbh": "SWOPENAPI519354",
	"submitter": "刘玲",
	"busiFlag": 0,
	"srcBillType": "系统1",
	"srcBillCode": "1345",
	"srcBillid": "1566",
	"failMode": "batch",
	"multiFileMode": "N",
	"userMobileOrEmail": "1234567@qq.com",
	"bills": [
		{
			"billType": "invoice",
			"imageId": 1234,
			"filePath": "\"obs://2023-07-06/000a80fde8ba7a3fcc.pdf\"",
			"data": "发票信息 见开放平台接口信息补充描述-进项发票管理fapiao.yonyoucloud.com/apidoc/appendix/",
			"attachs": [
				{
					"fileId": "1704423224656060416",
					"fileType": "xml",
					"businessType": "1"
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
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| message | string | 否 | 提示信息 示例：操作成功 |
| data | object | 是 | 返回数据（在failMode为single时，才返回data） |
| code | string | 否 | 状态 示例：0000 |
| billType | string | 否 | 票据类型 目前仅支持 invoice增值税，tax_payment_proof完税证明，custbook海关缴款书，nontax财政非税票据(根据票面信息的busiType判断具体业务类型 64-财政非税票据 65-进项医疗门诊票据 66-进项医疗住院票据) 示例：invoice |
| invoiceCode | string | 否 | 代码 示例：111111 |
| invoiceNum | string | 否 | 号码 示例：222222222 |
| errmsg | string | 否 | 错误信息(票面数据错误) 示例：保存成功 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"code": "0000",
			"billType": "invoice",
			"invoiceCode": "111111",
			"invoiceNum": "222222222",
			"errmsg": "保存成功"
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

1	2025-07-14

更新

请求参数 orgcode

更新

请求参数 nsrsbh


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

