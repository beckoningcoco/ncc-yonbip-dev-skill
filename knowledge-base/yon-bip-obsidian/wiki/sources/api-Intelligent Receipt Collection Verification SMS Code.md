---
title: "智能收单验证短信验证码"
apiId: "1442553268520615936"
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

# 智能收单验证短信验证码

> `ContentType	application/json` 请求方式	POST | 分类: Intelligent Receipt Collection (SSC)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ssc/appDevice/v1/verifyAuthcode

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
| phone | string | 否 | 是 | 手机号：接收验证码手机号 示例：13678590002 |
| authcode | string | 否 | 是 | 验证码：如果验证码为固定码，则限制为6-10位数字 示例：138556 |
| action | int | 否 | 是 | 动作类型：发送验证码，业务标识，与发送验证码对应关联（1:取消授权 2:开箱取件） 示例：1 |
| deviceCode | string | 否 | 是 | 设备唯一编号：收单机获取唯一物理ID，用作收单机唯一身份标识 示例：yonyou00001 |
| manufacturer | string | 否 | 是 | 终端所属厂商标识：由用友分发标识符 示例：yonyou |

## 3. 请求示例

Url: /yonbip/ssc/appDevice/v1/verifyAuthcode?access_token=访问令牌
Body: {
	"phone": "13678590002",
	"authcode": "138556",
	"action": 1,
	"deviceCode": "yonyou00001",
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
| cancelDeviceKey | string | 否 | 取消设备授权key：用于取消授权做校验码使用，当入参action=1时，返回该参数 示例：4b635939-8727-4788-aba7-43523e6fd0e1 |
| pickUpBillsKey | string | 否 | 开箱取件授权key：用于开箱取件做校验码使用，当入参action=2的时候，返回该参数 示例：4b635939-8727-4788-aba7-43523e6fd0e2 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"cancelDeviceKey": "4b635939-8727-4788-aba7-43523e6fd0e1",
		"pickUpBillsKey": "4b635939-8727-4788-aba7-43523e6fd0e2"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1023060400024	校验验证码失败	联系开发解决


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

