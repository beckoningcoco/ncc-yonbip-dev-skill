---
title: "辅助核算项修改"
apiId: "2004207155553501187"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Auxiliary Accounting Item"
domain: "AMP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Auxiliary Accounting Item]
platform_version: "BIP"
source_type: community-api-docs
---

# 辅助核算项修改

> `ContentType	application/json` 请求方式	POST | 分类: Auxiliary Accounting Item (AMP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/AMP/epub/v1/multidimext/update

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
| data | object | 是 | 否 | 辅助核算项传参集合 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| id | string | 否 | 是 | 辅助核算项id 示例：1799499041208270851 |
| code | string | 否 | 是 | 辅助核算项编码 示例：testCode |
| name | object | 否 | 是 | 辅助核算项名称（多语对象） |

## 3. 请求示例

Url: /yonbip/AMP/epub/v1/multidimext/update?access_token=访问令牌
Body: {
	"data": [
		{
			"resubmitCheckKey": "",
			"id": "1799499041208270851",
			"code": "testCode",
			"name": {
				"zh_CN": "测试名称"
			}
		}
	]
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
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 提示信息 示例：操作成功 |
| data | object | 否 | 返回数据结果 |
| count | number |
| 小数位数:0,最大长度:10 | 否 | 操作总数 示例：1 |
| successCount | number |
| 小数位数:0,最大长度:10 | 否 | 操作成功数 示例：1 |
| failCount | number |
| 小数位数:0,最大长度:10 | 否 | 操作失败数 示例：0 |
| errorMessages | string | 是 | 失败信息集合 |
| dataInfos | object | 是 | 操作成功数据实体信息集合 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 1,
		"successCount": 1,
		"failCount": 0,
		"errorMessages": [
			""
		],
		"dataInfos": [
			{
				"id": "1799499041208270851",
				"code": "testCode",
				"name": {
					"zh_CN": "测试名称"
				},
				"sourcedoc": "102",
				"sourcedoccode": "dept",
				"datatype": "doc",
				"vrs": "vr10"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	传参不能为空！	传参data集合不能为空集合，需要有正确的传参！


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

