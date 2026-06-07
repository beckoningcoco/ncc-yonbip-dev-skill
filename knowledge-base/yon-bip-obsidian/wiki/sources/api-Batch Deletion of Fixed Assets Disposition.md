---
title: "固定资产处置批量删除"
apiId: "1872942604105023492"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Fixed Asset Disposal"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Fixed Asset Disposal]
platform_version: "BIP"
source_type: community-api-docs
---

# 固定资产处置批量删除

> `ContentType	application/json` 请求方式	POST | 分类: Fixed Asset Disposal (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/EFI/disposal_bill/batchdelete

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
| billnum | string | 否 | 是 | 单据编码 示例：at_disposalbilllist 默认值：at_disposalbilllist |
| data | object | 是 | 是 | 处置信息 |
| id | string | 否 | 否 | 单据id,单据id和单据编码不能同时为空,id和编码同时存在,以id为准 示例：1796677711656648705 |
| code | string | 否 | 否 | 单据编码,单据id和单据编码不能同时为空,id和编码同时存在,以id为准 示例：gl00048 |
| _fromApi | boolean | 否 | 是 | 来源标识(必输:true) 示例：true 默认值：true |
| pubts | string | 否 | 是 | 单据时间戳,格式yyyy-MM-dd HH:mm:ss 示例：2023-11-23 19:38:32 |

## 3. 请求示例

Url: /yonbip/EFI/disposal_bill/batchdelete?access_token=访问令牌
Body: {
	"billnum": "at_disposalbilllist",
	"data": [
		{
			"id": "1796677711656648705",
			"code": "gl00048",
			"_fromApi": true,
			"pubts": "2023-11-23 19:38:32"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 返回描述 示例：操作成功 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	单据[gl00048]删除报错,错误原因:当前单据不是最新状态，请刷新重试。	重新查询单据后再删除


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

