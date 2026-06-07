---
title: "共享作业审批驳回"
apiId: "1838075922172346376"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "SSC Task"
domain: "SSC"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, SSC Task]
platform_version: "BIP"
source_type: community-api-docs
---

# 共享作业审批驳回

> `ContentType	application/json` 请求方式	POST | 分类: SSC Task (SSC)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ssc/task/reject

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
| data | object | 否 | 是 | 请求参数 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| taskPoolId | string | 否 | 是 | 作业id：共享作业唯一标识 示例：1449165817337872393 |
| taskEncryptInfo | string | 否 | 是 | 作业加密参数：用于检查作业处理人、作业版本等信息 示例：cyo0rpSSyE687jvJwaB9i7qPUFyiWamjfwlBQ1Tyzrw= |
| handlingSuggestion | string | 否 | 否 | 处理意见：默认“驳回制单人”，用户可自定义 示例：驳回制单人 |
| rejectType | string | 否 | 否 | 驳回方式：默认重走流程（1.重走流程：startagain 2.直送至我：jumpToRejectActivity) 示例：startagain 默认值：startagain |
| externalData | string | 否 | 否 | 扩展参数：用于客开扩展逻辑参数传递，可以是json字符串 |

## 3. 请求示例

Url: /yonbip/ssc/task/reject?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"taskPoolId": "1449165817337872393",
		"taskEncryptInfo": "cyo0rpSSyE687jvJwaB9i7qPUFyiWamjfwlBQ1Tyzrw=",
		"handlingSuggestion": "驳回制单人",
		"rejectType": "startagain",
		"externalData": ""
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

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1023020400300	非本人作业，不允许进行审批操作	查询最新作业数据，确认后再进行审批操作

1023020400301	非待处理作业，不允许进行审批操作	查询最新作业数据，确认后再进行审批操作

1023020400302	该作业数据已被修改，请查询最新数据后重试	查询最新作业数据，确认后再进行审批操作

1023020400303	作业相关数据为空，操作失败	请联系共享管理员

1023020400304	该作业正在进行审批操作，请稍后重试	该作业正在进行审批操作，请稍后重试

1023020400305	加密参数和作业不匹配，不允许进行审批操作	作业加密参数和作业id参数不匹配，需要重新获取该作业的加密参数

1023000500036	服务端逻辑异常	请联系共享管理员


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

