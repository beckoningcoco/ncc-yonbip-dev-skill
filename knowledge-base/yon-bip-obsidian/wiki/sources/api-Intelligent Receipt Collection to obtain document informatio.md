---
title: "智能收单获取单据信息"
apiId: "1448432846820081664"
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

# 智能收单获取单据信息

> `ContentType	application/json` 请求方式	POST | 分类: Intelligent Receipt Collection (SSC)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ssc/appDevice/v1/getBillByBarCode

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
| barCode | string | 否 | 是 | 单据条码 示例：znbzbx_expensebill|1471476961281310722 |
| deviceCode | string | 否 | 是 | 设备唯一编号：收单机获取唯一物理ID，用作收单机唯一身份标识 示例：yonyou000001 |
| manufacturer | string | 否 | 是 | 终端所属厂商标识：由用友分发标识符 示例：yonyou |

## 3. 请求示例

Url: /yonbip/ssc/appDevice/v1/getBillByBarCode?access_token=访问令牌
Body: {
	"barCode": "znbzbx_expensebill|1471476961281310722",
	"deviceCode": "yonyou000001",
	"manufacturer": "yonyou"
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
| barCode | string | 否 | 单据条码 示例：znbzbx_expensebill|263540345934592 |
| billNum | string | 否 | 单据号 示例：GRRD220225000002 |
| deliveryBatch | int | 否 | 收单批次号 示例：2 |
| boxNum | object | 是 | 归档箱号：指定该单据放到对应收单箱号（适用优易讯） 示例：["1","2","3"] |
| billCreatorOrgCode | string | 否 | 单据组织编码 示例：test |
| billCreatorOrgName | string | 否 | 单据组织名称 示例：test |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"barCode": "znbzbx_expensebill|263540345934592",
		"billNum": "GRRD220225000002",
		"deliveryBatch": 2,
		"boxNum": [
			"1",
			"2",
			"3"
		],
		"billCreatorOrgCode": "test",
		"billCreatorOrgName": "test"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1023060400010	设备编号不存在	设备编号未绑定

1023060400001	设备处于离线状态，请检查许可截止日期	设备已过期

1023060400002	未解析到合法的条码前缀,请检查条码	条码不正确，检查单据条码

1023060400003	该报销单不在本机器收单范围内	后台配置该收单机收单范围


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

