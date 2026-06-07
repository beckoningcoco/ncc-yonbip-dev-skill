---
title: "会计档案-财务会计报告-新增V1"
apiId: "2351711332439425028"
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

# 会计档案-财务会计报告-新增V1

> `ContentType	application/json` 请求方式	POST | 分类: Archive Accession (EAF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/FCC/v1/api/collection/account/report

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
| orgCode | string | 否 | 是 | 全宗编码 示例：ORG001 |
| categoryPrefix | string | 否 | 是 | 分类标识 "YJBNBG": 月季半年报告 "NDBG": 年度报告 "BNBG": 半年报告 "JDBG": 季度报告 "YDBG": 月度报告 示例：YDBG |
| accountYear | string | 否 | 是 | 年度 示例：2023 |
| accountMonth | string | 否 | 是 | 月份 示例：03 |
| mainRecord | object | 否 | 是 | 主记录对象 |
| title | string | 否 | 是 | 题名 示例：支出报告 |
| fileNo | string | 否 | 否 | 文号 示例：001 |
| keywords | string | 否 | 否 | 关键词 示例：财务, 报告, 年度 |
| abstracts | string | 否 | 否 | 摘要 示例：本年度财务报告详细说明了公司的经营状况和财务数据。 |
| srcSys | string | 否 | 否 | 来源系统 示例：ERP系统 |
| owner | string | 否 | 否 | 责任者 示例：财务部 |
| docDate | string | 否 | 否 | 所属日期 示例：2023-03-13 |
| storeType | string | 否 | 是 | 存储形式 “1”: 电子/纸质 “2”: 电子 “3”: 纸质 “4”: 数字化成果/纸质 示例：1 默认值：1 |
| secretLevel | string | 否 | 是 | 密级 “0”: 公开 “1”: 限制 “2”: 秘密 “3”: 机密 “4”: 绝密 示例：0 默认值：0 |
| pages | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 页数 示例：50 |
| barcode | string | 否 | 否 | 条形码 示例：1234567890 |
| billNo | string | 否 | 否 | 凭证单据号 示例：BILL2023-001 |
| billMaker | string | 否 | 否 | 制单人 示例：张三 |
| billCode | string | 否 | 否 | 单据编号 示例：INV2023-001 |
| billType | string | 否 | 否 | 单据类型 示例：report |
| billPk | string | 否 | 否 | 单据识别码 示例：B001 |
| total | string | 否 | 否 | 总金额 示例：1000000.00 |
| transType | string | 否 | 否 | 交易类型 示例：收入 |
| srcFileName | string | 否 | 否 | 原始文件名 示例：financial_report_2023.pdf |
| fileType | string | 否 | 否 | 文件格式 示例：pdf |
| fileSize | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 文件大小 示例：1024000 |
| fdfsId | string | 否 | 否 | 文件存储路径，需要按照规范将文件存放在“租户ID/idoc/third/”目录下 示例：FDFS123456/idoc/third/financial_report_2023.pdf |
| signAlgorithm | string | 否 | 否 | 签名算法 |
| fileSign | string | 否 | 否 | 数字摘要 示例：a1b2c3d4e5f6 |
| assist1 | string | 否 | 否 | 扩充字段1 |
| assist2 | string | 否 | 否 | 扩充字段2 |
| assist3 | string | 否 | 否 | 扩充字段3 |
| assist4 | string | 否 | 否 | 扩充字段4 |
| assist5 | string | 否 | 否 | 扩充字段5 |
| assist6 | string | 否 | 否 | 扩充字段6 |
| assist7 | string | 否 | 否 | 扩充字段7 |
| assist8 | string | 否 | 否 | 扩充字段8 |
| assist9 | string | 否 | 否 | 扩充字段9 |
| assist10 | string | 否 | 否 | 扩充字段10 |
| assist11 | string | 否 | 否 | 扩充字段11 |
| assist12 | string | 否 | 否 | 扩充字段12 |
| assist13 | string | 否 | 否 | 扩充字段13 |
| assist14 | string | 否 | 否 | 扩充字段14 |
| assist15 | string | 否 | 否 | 扩充字段15 |
| assist16 | string | 否 | 否 | 扩充字段16 |
| assist17 | string | 否 | 否 | 扩充字段17 |
| assist18 | string | 否 | 否 | 扩充字段18 |
| assist19 | string | 否 | 否 | 扩充字段19 |
| assist20 | string | 否 | 否 | 扩充字段20 |
| businessMetaData | object | 否 | 否 | 业务元数据信息 |
| subRecordList | object | 是 | 否 | 次级记录列表 |

## 3. 请求示例

Url: /yonbip/FCC/v1/api/collection/account/report?access_token=访问令牌
Body: {
	"orgCode": "ORG001",
	"categoryPrefix": "YDBG",
	"accountYear": "2023",
	"accountMonth": "03",
	"mainRecord": {
		"title": "支出报告",
		"fileNo": "001",
		"keywords": "财务, 报告, 年度",
		"abstracts": "本年度财务报告详细说明了公司的经营状况和财务数据。",
		"srcSys": "ERP系统",
		"owner": "财务部",
		"docDate": "2023-03-13",
		"storeType": "1",
		"secretLevel": "0",
		"pages": 50,
		"barcode": "1234567890",
		"billNo": "BILL2023-001",
		"billMaker": "张三",
		"billCode": "INV2023-001",
		"billType": "report",
		"billPk": "B001",
		"total": "1000000.00",
		"transType": "收入",
		"srcFileName": "financial_report_2023.pdf",
		"fileType": "pdf",
		"fileSize": 1024000,
		"fdfsId": "FDFS123456/idoc/third/financial_report_2023.pdf",
		"signAlgorithm": "",
		"fileSign": "a1b2c3d4e5f6",
		"assist1": "",
		"assist2": "",
		"assist3": "",
		"assist4": "",
		"assist5": "",
		"assist6": "",
		"assist7": "",
		"assist8": "",
		"assist9": "",
		"assist10": "",
		"assist11": "",
		"assist12": "",
		"assist13": "",
		"assist14": "",
		"assist15": "",
		"assist16": "",
		"assist17": "",
		"assist18": "",
		"assist19": "",
		"assist20": "",
		"businessMetaData": {},
		"subRecordList": [
			{
				"title": "第一季度报告",
				"fileNo": "Q1-2023-001",
				"keywords": "季度, 报告",
				"abstracts": "第一季度财务报告摘要。",
				"srcSys": "ERP系统",
				"owner": "财务部",
				"docDate": "2023-12-31",
				"storeType": "1",
				"secretLevel": "0",
				"pages": 15,
				"barcode": "1234567891",
				"billNo": "BILL2023-002",
				"billMaker": "李四",
				"billCode": "INV2023-002",
				"billType": "attach",
				"billPk": "B002",
				"total": "250000.00",
				"transType": "收入",
				"srcFileName": "q4_report_2023.pdf",
				"fileType": "pdf",
				"fileSize": 256000,
				"fdfsId": "FDFS123457/idoc/third/q1_report_2023.pdf",
				"signAlgorithm": "",
				"fileSign": "b1c2d3e4f5g6",
				"receiptsFlag": "4",
				"assist1": "",
				"assist2": "",
				"assist3": "",
				"assist4": "",
				"assist5": "",
				"assist6": "",
				"assist7": "",
				"assist8": "",
				"assist9": "",
				"assist10": "",
				"assist11": "",
				"assist12": "",
				"assist13": "",
				"assist14": "",
				"assist15": "",
				"assist16": "",
				"assist17": "",
				"assist18": "",
				"assist19": "",
				"assist20": "",
				"businessMetaData": {},
				"subRecordList": [
					{}
				]
			}
		]
	}
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
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 提示信息 示例：描述信息 |
| data | object | 否 | 响应实体 |

## 5. 正确返回示例

{
	"code": "200",
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

1	2025-12-22

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

