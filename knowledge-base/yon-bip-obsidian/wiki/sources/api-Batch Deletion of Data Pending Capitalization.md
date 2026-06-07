---
title: "待转固数据批量删除"
apiId: "1935935489282932742"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Fixed Asset Transfer Document"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Fixed Asset Transfer Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 待转固数据批量删除

> `ContentType	application/json` 请求方式	POST | 分类: Fixed Asset Transfer Document (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/EFI/faToFixed/batchDelete

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
| ids | string | 是 | 否 | 待删除转固单id列表 示例：["1935887926634217478"] |

## 3. 请求示例

Url: /yonbip/EFI/faToFixed/batchDelete?access_token=访问令牌
Body: {
	"ids": [
		"1935887926634217478"
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | number |
| 小数位数:0,最大长度:10 | 否 | 返回状态码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 返回批量删除转固单信息 |
| success | string | 是 | 操作成功单据ID（数组） 示例：["1935887926634217479","1935887926634217480"] |
| failed | object | 是 | 操作失败单据列表 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"success": [
			"1935887926634217479",
			"1935887926634217480"
		],
		"failed": [
			{
				"id": "1935887926634217478",
				"message": "com.yonyou.ucf.mdd.common.exceptions.error.MddOrmErrorException: 开启分布式事务失败, error:Token过期"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

503	异常	环境问题，刷新重试


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

