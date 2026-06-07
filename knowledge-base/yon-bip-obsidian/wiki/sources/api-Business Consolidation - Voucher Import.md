---
title: "合并报表-凭证导入"
apiId: "1756484711902347273"
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

# 合并报表-凭证导入

> `ContentType	application/json` 请求方式	POST | 分类: Financial Consolidation (EPM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/qyjx/vouch/open/importEpmVouch

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
| pkCube | string | 否 | 是 | 应用模型主键（来自于【合并报表获取租户模型接口】接口返回值 cubeId） |
| sysAppCode | string | 否 | 是 | 节点编码，固定值 使用默认值就可以 默认值：BCS09008 |
| fileStr | string | 否 | 是 | 导入文件的 base64 字符串， 可以使用【合并报表_凭证导出】接口的返回值字段 file 作为入参进行凭证导入，也可以将需要导入的数据整理成符合规范（即与导出接口的返回值格式一致）的 excel 表格，转化成 Base64 的字符串 |
| fileName | string | 否 | 是 | 导入文件名称，后缀为 .xlsx，例：凭证数据.xlsx |

## 3. 请求示例

Url: /yonbip/qyjx/vouch/open/importEpmVouch?access_token=访问令牌
Body: {
	"pkCube": "",
	"sysAppCode": "",
	"fileStr": "",
	"fileName": ""
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 状态码 |
| data | object | 否 | 文件 pk |
| success | string | 否 | 成功状态 示例：success |
| message | string | 否 | 导入状态信息 示例：导入成功 1 条数据! |

## 5. 正确返回示例

{
	"code": "",
	"data": {
		"success": "success",
		"message": "导入成功 1 条数据!"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-04-20

更新

请求说明

更新

返回参数 code

更新

返回参数 data

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

