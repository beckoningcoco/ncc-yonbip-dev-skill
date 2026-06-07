---
title: "跟踪线索单个保存"
apiId: "2196431028113899520"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Tracking Lead"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Tracking Lead]
platform_version: "BIP"
source_type: community-api-docs
---

# 跟踪线索单个保存

> `ContentType	application/json` 请求方式	POST | 分类: Tracking Lead (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/reservation/save

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
| data | object | 否 | 是 | 跟踪线索参数 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| id | string | 否 | 否 | 跟踪线索ID，更新操作时必填 |
| code | string | 否 | 是 | 跟踪线索编码 示例：WHH |
| name | string | 否 | 否 | 跟踪线索名称，WBS跟踪线索会根据跟踪线索编码规则生成 示例：娃哈哈 |
| demandtype | string | 否 | 是 | 需求跟踪方式编码，WBS=7，自定义=99 示例：99 |
| project | string | 否 | 否 | 项目ID或编码，WBS跟踪线索必填 |
| wbs | string | 否 | 否 | wbsID或编码，WBS跟踪线索WBS跟踪线索必填 |
| _status | string | 否 | 是 | 操作标识, Insert:新增、Update:更新 示例：Insert 默认值：Insert |

## 3. 请求示例

Url: /yonbip/scm/reservation/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": "",
		"code": "WHH",
		"name": "娃哈哈",
		"demandtype": "99",
		"project": "",
		"wbs": "",
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
| code | number |
| 小数位数:0,最大长度:10 | 否 | code 示例：200 |
| message | string | 否 | message 示例：操作成功 |
| data | object | 否 | data |
| id | string | 否 | 跟踪线索ID 示例：2196428296623226884 |
| code | string | 否 | 跟踪线索编码 示例：S0111 |
| name | string | 否 | 跟踪线索名称 示例：S0111_用友网络科技111 |
| typeid | string | 否 | 需求跟踪方式ID 示例：1697052002426829326 |
| demandtype | number |
| 小数位数:0,最大长度:10 | 否 | 需求跟踪方式编码 示例：99 |
| wbsName | string | 否 | wbs名称 |
| project_name | string | 否 | 项目名称 |
| pubts | string | 否 | 时间戳 示例：2025-02-07 11:11:47 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"id": "2196428296623226884",
		"code": "S0111",
		"name": "S0111_用友网络科技111",
		"typeid": "1697052002426829326",
		"demandtype": 99,
		"wbsName": "",
		"project_name": "",
		"pubts": "2025-02-07 11:11:47"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	服务端逻辑异常	联系技术人员


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

