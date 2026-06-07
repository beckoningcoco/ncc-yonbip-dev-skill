---
title: "智能收单上传图片"
apiId: "1449388803444703232"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Intelligent Receipt Collection"
domain: "SSC"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Intelligent Receipt Collection]
platform_version: "BIP"
source_type: community-api-docs
---

# 智能收单上传图片

> `ContentType	application/json` 请求方式	POST | 分类: Intelligent Receipt Collection (SSC)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ssc/appDevice/v1/file/upload

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
| data | object | 否 | 是 | 请求数据区 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| businessId | string | 否 | 是 | 业务id：uuid即可，同一批次扫描图片该值要相同 示例：bd274193-634d-42e4-6719-ac66463d2e3b |
| image | string | 否 | 是 | 图片base64：将图片信息转为base64编码之后的字符串 |
| uploadImageId | string | 否 | 否 | 图片标识：机器端自身的图片标识，用于机器端标识唯一图片，长度不能超过32位 示例：sjLm9Tu0gFJatgxOcRiSUd9s9DRozfxK4IWE |
| fileName | string | 否 | 是 | 文件名称：上传图片带有文件后缀的文件名 示例：test.jpg |
| deviceCode | string | 否 | 是 | 设备唯一编号：收单机获取唯一物理ID，用作收单机唯一身份标识 示例：yonyou00001 |
| manufacturer | string | 否 | 是 | 终端所属厂商标识：由用友分发标识符 示例：yonyou |

## 3. 请求示例

Url: /yonbip/ssc/appDevice/v1/file/upload?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"businessId": "bd274193-634d-42e4-6719-ac66463d2e3b",
		"image": "",
		"uploadImageId": "sjLm9Tu0gFJatgxOcRiSUd9s9DRozfxK4IWE",
		"fileName": "test.jpg",
		"deviceCode": "yonyou00001",
		"manufacturer": "yonyou"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 成功为200，错误提示为其他值 示例：200 |
| message | string | 否 | 成功提示或错误提示 示例：操作成功 |
| data | object | 否 | 返回数据 |
| businessId | string | 否 | 业务id：同参数businessId 示例：bd274193-634d-42e4-6719-ac66463d2e3b |
| uploadImageId | string | 否 | 图片机器端标识：同参数uploadImageId 示例：sjLm9Tu0gFJatgxOcRiSUd9s9DRozfxK4IWE |
| fileId | string | 否 | 图片id：对象存储服务器中的图片唯一id 示例：625908037ca0ec3ccea206e8 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"businessId": "bd274193-634d-42e4-6719-ac66463d2e3b",
		"uploadImageId": "sjLm9Tu0gFJatgxOcRiSUd9s9DRozfxK4IWE",
		"fileId": "625908037ca0ec3ccea206e8"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1023060400013	数据重复提交	更新幂等key值提交

1023060400026	图片解析失败	图片编码错误

1023060400027	协同云文件上传失败	联系开发解决


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

