---
title: "电子文件-出租车发票-新增"
apiId: "2352456543625019398"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Archive Accession"
domain: "EAF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Archive Accession]
platform_version: "BIP"
source_type: community-api-docs
---

# 电子文件-出租车发票-新增

> `ContentType	application/json` 请求方式	POST | 分类: Archive Accession (EAF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/FCC/v1/api/taxi/batchInsert

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| orgCode | string | query | 是 | 全宗编码 |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| taxiList | object | 是 | 是 | 出租车票信息列表 最大请求量：10 |
| invoiceCode | string | 否 | 是 | 发票代码 示例：123456789012 |
| invoiceNum | string | 否 | 是 | 发票号码 示例：1234567890123456 |
| invoiceNumSuf | string | 否 | 是 | 发票号码全文索引字段 示例：23423 |
| taxiDate | string | 否 | 是 | 乘车日期 示例：2023-05-20 |
| carNum | string | 否 | 否 | 车牌号 示例：京A12345 |
| mileage | number |
| 小数位数:2,最大长度:15 | 否 | 否 | 里程 示例：15.50 |
| startTime | string | 否 | 否 | 上车时间 示例：14:30:00 |
| endTime | string | 否 | 否 | 下车时间 示例：15:00:00 |
| fuelSurcharge | number |
| 小数位数:2,最大长度:15 | 否 | 否 | 燃油附加费 示例：2.00 |
| totalAmount | number |
| 小数位数:2,最大长度:15 | 否 | 是 | 金额 示例：35.50 |
| invoiceAmount | number |
| 小数位数:2,最大长度:15 | 否 | 否 | 发票金额 示例：35.50 |
| place | string | 否 | 否 | 发票所在地 示例：北京市 |
| province | string | 否 | 否 | 省份 示例：北京 |
| city | string | 否 | 否 | 城市 示例：北京市 |
| fileName | string | 否 | 是 | 原始文件名，包含后缀名 示例：taxi_invoice.pdf |
| fileUrl | string | 否 | 是 | 文件地址 示例：/files/taxi_invoice_20230520.pdf |
| fileSize | number |
| 小数位数:0,最大长度:19 | 否 | 否 | 文件大小 示例：102400 |
| fileSign | string | 否 | 否 | 数字摘要 示例：abc123def456 |
| signAlgorithm | string | 否 | 否 | 签名算法 示例：SHA256 |
| signRegulation | string | 否 | 否 | 签名规则 示例：摘要签名 |
| invoiceNature | string | 否 | 否 | 发票性质:input/output output：销项发票 示例：input |
| submitterId | string | 否 | 否 | 提交人 示例：user001 |
| submitDate | date |
| 格式:yyyy-MM-dd | 否 | 否 | 提交日期 示例：2023-05-20 |
| purchaserStatus | string | 否 | 否 | 报销状态(delete) 示例：39 |
| kind | string | 否 | 否 | 发票消费类型 示例：交通费 |
| checkStatus | number |
| 小数位数:0,最大长度:3 | 否 | 否 | 收票状态 0-未收票 1-已收票 示例：1 |
| reimburseStatus | string | 否 | 否 | 报销状态 0未报销、1报销中、2已报销 示例：2 |
| bookStatus | string | 否 | 否 | 购方记账状态 0-未记账 1-已记账 示例：1 |
| payStatus | string | 否 | 否 | 支付状态 0-未支付 1-已支付 示例：1 |
| deductStatus | string | 否 | 否 | 抵扣状态 0-未抵扣 1-已抵扣 示例：1 |
| verifyStatus | string | 否 | 否 | 查验状态 0-未查验 1-已查验 示例：1 |
| yyVerifyStatus | string | 否 | 否 | 用友查验状态 0-未查验；1-已查验 示例：1 |
| thirdVerifyStatus | string | 否 | 否 | 第三方查验状态 0-未查验；1-已查验 示例：1 |

## 3. 请求示例

Url: /yonbip/FCC/v1/api/taxi/batchInsert?access_token=访问令牌&orgCode=
Body: {
	"taxiList": [
		{
			"invoiceCode": "123456789012",
			"invoiceNum": "1234567890123456",
			"invoiceNumSuf": "23423",
			"taxiDate": "2023-05-20",
			"carNum": "京A12345",
			"mileage": 15.5,
			"startTime": "14:30:00",
			"endTime": "15:00:00",
			"fuelSurcharge": 2,
			"totalAmount": 35.5,
			"invoiceAmount": 35.5,
			"place": "北京市",
			"province": "北京",
			"city": "北京市",
			"fileName": "taxi_invoice.pdf",
			"fileUrl": "/files/taxi_invoice_20230520.pdf",
			"fileSize": 102400,
			"fileSign": "abc123def456",
			"signAlgorithm": "SHA256",
			"signRegulation": "摘要签名",
			"invoiceNature": "input",
			"submitterId": "user001",
			"submitDate": "2023-05-20",
			"purchaserStatus": "39",
			"kind": "交通费",
			"checkStatus": 1,
			"reimburseStatus": "2",
			"bookStatus": "1",
			"payStatus": "1",
			"deductStatus": "1",
			"verifyStatus": "1",
			"yyVerifyStatus": "1",
			"thirdVerifyStatus": "1"
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
| code | string | 否 | 状态码 示例：0000 |
| message | string | 否 | 提示信息 示例：描述信息 |
| data | object | 否 | 响应实体 |

## 5. 正确返回示例

{
	"code": "0000",
	"message": "描述信息",
	"data": {}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-12-17

更新

请求说明

更新

请求参数 totalAmount


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

