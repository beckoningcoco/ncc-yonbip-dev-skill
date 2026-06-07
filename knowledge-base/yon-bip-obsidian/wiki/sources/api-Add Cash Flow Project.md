---
title: "现金流量项目新增"
apiId: "1804548299358732288"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Cash Flow Item"
domain: "AMP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Cash Flow Item]
platform_version: "BIP"
source_type: community-api-docs
---

# 现金流量项目新增

> `ContentType	application/json` 请求方式	POST | 分类: Cash Flow Item (AMP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/AMP/yonbip-fi-epub/bill/save

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	MDD幂等

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 否 | 是 | 数据 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| code | string | 否 | 是 | 编码 示例：1011 |
| name | object | 否 | 是 | 名称 |
| cashflowtype | string | 否 | 是 | 现金流量类型id 示例：11111 |
| parent | string | 否 | 否 | 上级项目id 示例：44444 |
| mainattachedtable | boolean | 否 | 是 | 主表/附表(主表:true;附表:fasle)) 示例：true |
| directionattribute | string | 否 | 否 | 方向属性(流入:IN;流出:OUT）) 示例：IN |
| id | string | 否 | 否 | 现金流量项目id(新增时不传，修改时必传) 示例：111 |
| _status | string | 否 | 是 | 状态(新增为Insert;更新为Update) 示例：Insert |

## 3. 请求示例

Url: /yonbip/AMP/yonbip-fi-epub/bill/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"code": "1011",
		"name": {
			"zh_CN": "中文名称",
			"zh_TW": "繁体名称",
			"en_US": "英文名称"
		},
		"cashflowtype": "11111",
		"parent": "44444",
		"mainattachedtable": true,
		"directionattribute": "IN",
		"id": "111",
		"_status": "Insert"
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
| code | string | 否 | 返回状态编码 示例：200 |
| message | string | 否 | 返回信息 |
| data | object | 否 | 返回数据 |
| id | string | 否 | 现金流量项目主键 示例：E4DF5B92-0589-4ECE-9925-4ED393B022BF |
| code | string | 否 | 现金流量项目编码 示例：111 |
| name | object | 否 | 名称对象 |
| cashflowtype | string | 否 | 现金流量类型id 示例：2222 |
| mainattachedtable | boolean | 否 | 主表/附表(主表:true;附表:false) 示例：true |
| directionattribute | string | 否 | 流入/流出(流入:IN;流出:OUT) 示例：IN |
| isEnd | boolean | 否 | 是否末级项目(是:true;否:false) 示例：true |
| tenant | long | 否 | 租户id 示例：3333 |
| pubts | string | 否 | 时间戳 示例：2023-08-30 10:55:01 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"id": "E4DF5B92-0589-4ECE-9925-4ED393B022BF",
		"code": "111",
		"name": {
			"zh_CN": "中文名称",
			"zh_TW": "繁体名称",
			"en_US": "英文名称"
		},
		"cashflowtype": "2222",
		"mainattachedtable": true,
		"directionattribute": "IN",
		"isEnd": true,
		"tenant": 3333,
		"pubts": "2023-08-30 10:55:01"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	服务端逻辑异常	服务端逻辑异常


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

