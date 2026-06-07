---
title: "辅助核算明细查询"
apiId: "5bc7662eb7664b89aebaccd19c64da1e"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Auxiliary Accounting Item"
domain: "AMP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Auxiliary Accounting Item]
platform_version: "BIP"
source_type: community-api-docs
---

# 辅助核算明细查询

> `ContentType	application/json` 请求方式	POST | 分类: Auxiliary Accounting Item (AMP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/fi/fipub/cash/getmultidimensionbysubject

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| subjectId | string | 否 | 是 | 科目id 示例：5A29C7C7-9C8D-4AA9-BE53-0C34F52D80B7 |

## 3. 请求示例

Url: /yonbip/fi/fipub/cash/getmultidimensionbysubject?access_token=访问令牌
Body: {
	"subjectId": "5A29C7C7-9C8D-4AA9-BE53-0C34F52D80B7"
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
| code | long | 否 | 返回码 示例：200 |
| data | object | 是 | 辅助核算项列表 |
| doctype | string | 否 | 辅助核算项对应档案的编码 示例：ucfdef_0111 |
| code | string | 否 | 辅助核算项的编码 示例：021213 |
| datatype | string | 否 | 辅助核算项的类型（doc为档案、txt为文本） 示例：doc |
| vrs | string | 否 | 科目表中对应字段为1，说明有该辅助核算项 示例：vr11 |
| name | string | 否 | 辅助核算项名称 示例：0101档案 |
| id | string | 否 | 辅助核算项id 示例：4206CBA9-FEC2-4B7B-BE63-F7022C632E9B |
| success | boolean | 否 | 成功标识（true：成功；false：失败） 示例：true |

## 5. 正确返回示例

{
	"code": 200,
	"data": [
		{
			"doctype": "ucfdef_0111",
			"code": "021213",
			"datatype": "doc",
			"vrs": "vr11",
			"name": "0101档案",
			"id": "4206CBA9-FEC2-4B7B-BE63-F7022C632E9B"
		}
	],
	"success": true
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

500	科目不存在	根据科目id查找科目不存在！


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

