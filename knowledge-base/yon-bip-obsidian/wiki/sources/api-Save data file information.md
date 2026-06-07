---
title: "数据文件信息保存"
apiId: "1780243302768443395"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Data Import Parsing"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Data Import Parsing]
platform_version: "BIP"
source_type: community-api-docs
---

# 数据文件信息保存

> `ContentType	application/json` 请求方式	POST | 分类: Data Import Parsing (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/AMP/revenue/data/file/saveDataFileInfo

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
| file_id | string | 否 | 是 | 文件id |
| import_config_code | string | 否 | 是 | 数据导入配置编码 |
| bill_date | Date | 否 | 是 | 账务日期 |
| file_unzip_key | string | 否 | 是 | 文件解压码 |

## 3. 请求示例

Url: /yonbip/AMP/revenue/data/file/saveDataFileInfo?access_token=访问令牌
Body: {
	"file_id": "",
	"import_config_code": "",
	"bill_date": "",
	"file_unzip_key": ""
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| success | boolean | 否 | 是否成功 |
| code | string | 否 | 编码 |
| data | object | 否 | 数据体 |
| config_id | string | 否 | 配置id |
| config_code | string | 否 | 配置编码 |
| config_name | string | 否 | 配置名称 |
| file_id | string | 否 | 文件id |
| file_name | string | 否 | 文件名称 |
| import_start_time | DateTime | 否 | 导入开始时间 |
| import_end_time | DateTime | 否 | 导入结束时间 |
| import_type | string | 否 | 导入类型 |
| import_total_count | string | 否 | 总条数 |
| import_fail_count | string | 否 | 失败条数 |
| import_succ_count | string | 否 | 成功条数 |
| import_status | string | 否 | 导入状态 |
| import_fail_message | string | 否 | 导入失败原因 |
| batch_no | string | 否 | 批次号 |
| version_no | string | 否 | 版本号 |
| bill_date | string | 否 | 业务日期 |
| entity_table | string | 否 | 实体表 |

## 5. 正确返回示例

{
	"success": true,
	"code": "",
	"data": {
		"config_id": "",
		"config_code": "",
		"config_name": "",
		"file_id": "",
		"file_name": "",
		"import_start_time": "",
		"import_end_time": "",
		"import_type": "",
		"import_total_count": "",
		"import_fail_count": "",
		"import_succ_count": "",
		"import_status": "",
		"import_fail_message": "",
		"batch_no": "",
		"version_no": "",
		"bill_date": "",
		"entity_table": ""
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

20000000L	数据保存失败


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-04-02

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

