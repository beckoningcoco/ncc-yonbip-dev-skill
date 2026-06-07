---
title: "业务量指标定义查询"
apiId: "2339074588597026817"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Business Volume Indicator Definition"
domain: "AMP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Business Volume Indicator Definition]
platform_version: "BIP"
source_type: community-api-docs
---

# 业务量指标定义查询

> `ContentType	application/json` 请求方式	POST | 分类: Business Volume Indicator Definition (AMP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/FCC/yonbip-fi-epub/businessvolumeindex/bill/list

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	MDD幂等

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| queryMode | string | header | 否 | 查询方案    默认值: commonVOs|simpleVOs |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 分页大小 示例：20 默认值：20 |
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 当前页大小 示例：1 默认值：1 |
| totalCount | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 是否仅有总条数 示例：1 默认值：1 |
| billnum | string | 否 | 否 | 单据编码 示例：fiepub_business_volume_index_list 默认值：fiepub_business_volume_index_list |
| code | string | 否 | 否 | 指标定义编码 |
| name | string | 否 | 否 | 指标定义名称 |

## 3. 请求示例

Url: /yonbip/FCC/yonbip-fi-epub/businessvolumeindex/bill/list?access_token=访问令牌
Header: 
	queryMode : ""
Body: {
	"pageSize": 20,
	"pageIndex": 1,
	"totalCount": 1,
	"billnum": "fiepub_business_volume_index_list",
	"code": "",
	"name": ""
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
| data | object | 否 | 响应数据 |
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 当前页的页号 示例：1 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 每页大小 示例：20 |
| recordCount | number |
| 小数位数:0,最大长度:10 | 否 | 条数总 示例：1 |
| recordList | object | 是 | 数据集合 |
| pageCount | number |
| 小数位数:0,最大长度:10 | 否 | 总页数 示例：1 |
| beginPageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 开始页页号 示例：1 |
| endPageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 结束页页号 示例：1 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 20,
		"recordCount": 1,
		"recordList": [
			{
				"code": "activityqty",
				"creatorId": "1665912501609431043",
				"indicatorUnit_name": "个",
				"creatorId_name": "郭威",
				"bsystem": 0,
				"businessDesc": {},
				"indicatorUnit": "1526454844699705346",
				"indicatorType": "sum",
				"createTime": "2023-09-04 14:47:54",
				"indicatorStatus": "0",
				"name": {
					"zh_CN": "作业耗用量"
				},
				"sumPeriod": "month",
				"id": "1809126760174321666"
			}
		],
		"pageCount": 1,
		"beginPageIndex": 1,
		"endPageIndex": 1
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	查询异常	查询异常


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

