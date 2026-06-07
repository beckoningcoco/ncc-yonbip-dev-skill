---
title: "高级版协同附件同步查询增量附件"
apiId: "1840394508713328649"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Purchase Order"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Purchase Order]
platform_version: "BIP"
source_type: community-api-docs
---

# 高级版协同附件同步查询增量附件

> `ContentType	application/json` 请求方式	POST | 分类: Purchase Order (MM)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/scm/api/listIncrementalAttachmentsByPubts

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	列表查询

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| taskId | string | 否 | 是 | 任务ID 示例：123456789 |
| ts | string | 否 | 否 | 时间戳 示例：1284791238947 |
| billnum | string | 否 | 是 | 查询的单据编码 示例：st_purchaseorder |
| pageIndex | int | 否 | 否 | 分页页面 示例：1 |
| pageSize | int | 否 | 否 | 每页记录数 示例：1 |

## 3. 请求示例

Url: /yonbip/scm/api/listIncrementalAttachmentsByPubts?access_token=访问令牌
Body: {
	"taskId": "123456789",
	"ts": "1284791238947",
	"billnum": "st_purchaseorder",
	"pageIndex": 1,
	"pageSize": 1
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
| code | long | 否 | code 示例：200 |
| message | string | 否 | message 示例：操作成功 |
| data | object | 否 | data |
| list | object | 是 | list |
| haveNextPage | boolean | 否 | haveNextPage 示例：true |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"list": [
			{
				"tempFilePathInfo": "https://ykj-open-api-test.yonyoucloud.com/iuap-apcom-file-public/iuap-apcom-file/0000LJCKGBU23PERKE0000/2023101619/73ea4375-7792-4ea2-8a26-6a9eb8409143.png",
				"size": "210889",
				"fileExtension": ".png",
				"fileName": "销售订单-供方附件1",
				"groupname": "supplierattachment",
				"puId": "1840438772653096963",
				"erpId": "1840438772653096963",
				"fileId": "652d1dc21c07e77b8209703e"
			}
		],
		"haveNextPage": true
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

暂时没有数据哦~


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

