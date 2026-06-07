---
title: "合并工作台-审核_退回_取消审核"
apiId: "1820878795802935302"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Financial Consolidation"
domain: "EPM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Financial Consolidation]
platform_version: "BIP"
source_type: community-api-docs
---

# 合并工作台-审核_退回_取消审核

> `ContentType	application/json` 请求方式	POST | 分类: Financial Consolidation (EPM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/qyjx/epm/reportworkbench/approvetbcontaskapiaction

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
| pk_cube | string | 否 | 是 | 应用模型主键 |
| year | string | 否 | 是 | 年 |
| month | string | 否 | 是 | 月 |
| conTask | string | 否 | 是 | 任务 |
| approveType | string | 否 | 是 | 审批类型："0"：审核；"1"：退回；"2"：取消审核 |
| step | string | 否 | 是 | 阶段 |
| isCascade | string | 否 | 是 | 层级 |
| scenario | string | 否 | 是 | 业务方案 |
| remark | string | 否 | 否 | 注释 |
| isView | string | 否 | 否 | 可见性，值："No"(默认)和"ok" 默认值：No |
| version | string | 否 | 否 | 版本 默认值：v0 |
| file | object | 否 | 否 | 文件 |
| fileName | string | 否 | 否 | 文件名 |
| sysParamJson | object | 否 | 是 | 系统参数 |
| appcode | string | 否 | 是 | 节点编码 默认值：BCS13005 |

## 3. 请求示例

Url: /yonbip/qyjx/epm/reportworkbench/approvetbcontaskapiaction?access_token=访问令牌
Body: {
	"pk_cube": "",
	"year": "",
	"month": "",
	"conTask": "",
	"approveType": "",
	"step": "",
	"isCascade": "",
	"scenario": "",
	"remark": "",
	"isView": "",
	"version": "",
	"file": {},
	"fileName": "",
	"sysParamJson": {
		"appcode": ""
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 状态码 示例：200 |
| data | object | 否 | 数据 |
| code | number |
| 小数位数:0,最大长度:10 | 否 | 状态码 示例：200 |
| success | boolean | 否 | 操作状态 示例：true |

## 5. 正确返回示例

{
	"code": "200",
	"data": {
		"code": 200,
		"success": true
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

500	阶段状态/数据状态不满足审核条件，请检查！


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-04-20

更新

请求说明

新增

返回参数 data

新增

返回参数 code

新增

返回参数 success

更新

返回参数 code

删除

返回参数 success


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

