---
title: "预算系统注册的删除"
apiId: "66875f1faee244258740a6854ad2fb0e"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Budget Execution Control"
domain: "EPM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Budget Execution Control]
platform_version: "BIP"
source_type: community-api-docs
---

# 预算系统注册的删除

> `ContentType	application/json` 请求方式	POST | 分类: Budget Execution Control (EPM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/qyjx/yonbip-fi-sepmbcdc/open/openDel

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
| data | object | 是 | 是 | 数据仓库 |
| type | int | 否 | 是 | 删除类型(0代表系统，1代表模型) 如果删除系统，此系统下有模型，则会给出提示先删其下的所有模型 示例：1 |
| sysCode | string | 否 | 是 | 系统编码 示例：EBDG |
| cubeCode | string | 否 | 否 | 模型编码（如果type为0，则无须传模型编码） 示例：wxy0802 |

## 3. 请求示例

Url: /yonbip/qyjx/yonbip-fi-sepmbcdc/open/openDel?access_token=访问令牌
Body: {
	"data": [
		{
			"type": 1,
			"sysCode": "EBDG",
			"cubeCode": "wxy0802"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| message | string | 否 | 接口信息（成功 : 无 失败 : 提示信息） |
| code | string | 否 | 响应码 |
| data | string | 否 | 返回数据 |

## 5. 正确返回示例

{
	"message": "",
	"code": "",
	"data": ""
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

500	要删除的系统中有系统下存在模型,请先删除模型	先删除模型，再删除系统


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-04-27

更新

请求参数 sysCode

更新

请求参数 cubeCode


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

