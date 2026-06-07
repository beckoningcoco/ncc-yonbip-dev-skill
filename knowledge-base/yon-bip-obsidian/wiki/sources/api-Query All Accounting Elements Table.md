---
title: "查询全部会计要素表"
apiId: "2236625479575011334"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Accounting Element Table"
domain: "AMP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Accounting Element Table]
platform_version: "BIP"
source_type: community-api-docs
---

# 查询全部会计要素表

> `ContentType	application/json` 请求方式	POST | 分类: Accounting Element Table (AMP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/AMP/yonbip-fi-epub/accelementlist/bill/querytree

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	MDD幂等

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| billnum | string | 否 | 是 | billnum 示例：fiepub_accelementlist 默认值：fiepub_accelementlist |
| treename | string | 否 | 是 | treename 示例：epub.basic.Accelement 默认值：epub.basic.Accelement |
| query | object | 否 | 是 | query |
| serviceCode | string | 否 | 是 | serviceCode 示例：fiepub_accelementlist 默认值：fiepub_accelementlist |

## 3. 请求示例

Url: /yonbip/AMP/yonbip-fi-epub/accelementlist/bill/querytree?access_token=访问令牌
Body: {
	"billnum": "fiepub_accelementlist",
	"treename": "epub.basic.Accelement",
	"query": {
		"serviceCode": "fiepub_accelementlist"
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
| code | number |
| 小数位数:0,最大长度:10 | 否 | 状态码 示例：200 |
| message | string | 否 | 提示信息 示例：操作成功 |
| data | object | 是 | 响应实体 |
| code | string | 否 | 编码 示例：01 |
| sysid | string | 否 | 来源主键 示例：ZM0000DEFAULTACCELEMENT000000001 |
| description | object | 否 | 描述 |
| bsystem | boolean | 否 | 是否系统预置 示例：true |
| modifyTime | string | 否 | 修改时间 示例：2017-02-16 16:01:25 |
| createTime | string | 否 | 创建时间 示例：2017-02-16 16:01:25 |
| accstandard_name | string | 否 | 会计准则名称 示例：企业会计准则 |
| name | object | 否 | 会计要素表名称 |
| accstandard_code | string | 否 | 会计准则编码 示例：01 |
| id | string | 否 | 会计要素表id 示例：1525643757385416711 |
| accstandard | string | 否 | 会计准则id 示例：1525643757385416705 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": [
		{
			"code": "01",
			"sysid": "ZM0000DEFAULTACCELEMENT000000001",
			"description": {},
			"bsystem": true,
			"modifyTime": "2017-02-16 16:01:25",
			"createTime": "2017-02-16 16:01:25",
			"accstandard_name": "企业会计准则",
			"name": {
				"zh_TW": "企業會計準則要素表",
				"en_US": "Enterprise Accounting Standards Element List",
				"zh_CN": "企业会计准则要素表"
			},
			"accstandard_code": "01",
			"id": "1525643757385416711",
			"accstandard": "1525643757385416705"
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	服务异常


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

