---
title: "实物管理开箱取件"
apiId: "1719218234176045060"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Device Registration Management"
domain: "SSC"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Device Registration Management]
platform_version: "BIP"
source_type: community-api-docs
---

# 实物管理开箱取件

> `ContentType	application/json` 请求方式	POST | 分类: Device Registration Management (SSC)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ssc/pdm/postbox/pickupcallback

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
| data | object | 否 | 是 | 请求数据 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| deviceNo | string | 否 | 是 | 设备编号：邮单筒出厂唯一编号 示例：US90A*****059020 |
| pickupBoxNos | string | 是 | 是 | 取件筒号：要打开的投递筒号列表 示例：["1", "2"] |

## 3. 请求示例

Url: /yonbip/ssc/pdm/postbox/pickupcallback?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"deviceNo": "US90A*****059020",
		"pickupBoxNos": [
			"1",
			"2"
		]
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 请求返回编码 示例：200 |
| message | string | 否 | 请求返回信息 示例：操作成功 |
| data | object | 否 | 请求返回数据 |
| deviceNo | string | 否 | 设备编号：邮单筒出厂唯一编号 示例：US90A*****059020 |
| pickupBoxNos | string | 是 | 取件筒号：打开的投递筒号列表 示例：["1","2"] |
| pickupLotNo | string | 否 | 取件批次号：后台生成的取件批号（格式：设备编号-当前取件筒号列表的首项编号-时间戳） 示例：US90A*****059020-1-16*****35018 |
| pickupAmount | long | 否 | 取件数量：当次开箱取出的实物数量 示例：10 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"deviceNo": "US90A*****059020",
		"pickupBoxNos": [
			"1",
			"2"
		],
		"pickupLotNo": "US90A*****059020-1-16*****35018",
		"pickupAmount": 10
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

036-507-020001	服务端逻辑异常	服务端报错，请联系开发人员

036-507-020002	当前数据正在被新增或修改，请稍后再试	并发错误，请检查单据状态，重新操作

036-507-020004	操作失败，xxx参数不能为空	缺少必要参数，请补全

036-507-020006	操作失败，未找到该设备的绑定信息！ 设备编号：xxxxxxxxx	设备未绑定

036-507-020016	未购买实物管理服务授权许可，请尽快加购/实物管理授权许可已过期，请及时续费	实物管理许可未购买或者不在许可期间内，需要加购实物管理


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

