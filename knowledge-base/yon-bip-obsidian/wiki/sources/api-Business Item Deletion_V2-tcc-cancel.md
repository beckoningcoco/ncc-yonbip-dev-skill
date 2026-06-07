---
title: "业务事项删除_V2-tcc-cancel"
apiId: "1959637584136110086"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Business Event"
domain: "AMP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Business Event]
platform_version: "BIP"
source_type: community-api-docs
---

# 业务事项删除_V2-tcc-cancel

> `ContentType	application/json` 请求方式	POST | 分类: Business Event (AMP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/AMP/openapi/busievent/reverseCancel

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
| eventInfo | object | 否 | 是 | 单据信息 |
| reqId | string | 否 | 是 | 请求id，每次请求都要新生成 （长度不超过36） 示例：79c44fcb-0dc0-42d4-bb7e-f15a27442acd |
| srcBusiId | string | 否 | 是 | 来源单据id 示例：1949250437570887690 |
| srcClassifier | string | 否 | 否 | 一单多目的、多阶段过账限定值，默认状态下不需要填值 |
| srcSystemId | string | 否 | 是 | 来源系统Id，注册的来源系统档案值。YB系统填0即可。 示例：1 |
| srcModule | string | 否 | 否 | 来源微服务或者子领域，回写消息会作为路由监听标签 示例：yonbip-fi-earapbill |
| srcBillTypeId | string | 否 | 是 | 单据类型的id 示例：2614099822008320 |
| srcTradeTypeId | string | 否 | 否 | 交易类型的id,单据类型上如果启用了交易类型，则交易类型id必填,否则可以不填 示例：2614289958408704 |
| srcBillNo | string | 否 | 否 | 来源单据号 示例：OARar240311005303 |
| action | string | 否 | 是 | 请求动作 新增：add(事件中心异步) 删除：delete(rpc同步) 更新：update(暂不支持) 示例：delete |
| busiDate | string | 否 | 是 | 单据日期 示例：2024-03-11 |
| orgId | string | 否 | 否 | 来源组织id 示例：1608898451414712328 |
| srcBillVersion | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 数据版本，严格要求单调递增。事项中心使用此 用于处理消息顺序。建议增加单据版本字段，单据变更时严格递增。如果没有单据版本可以使用pubts的long值，需要处理时钟回拨风险。 示例：2 |

## 3. 请求示例

Url: /yonbip/AMP/openapi/busievent/reverseCancel?access_token=访问令牌
Body: {
	"eventInfo": {
		"reqId": "79c44fcb-0dc0-42d4-bb7e-f15a27442acd",
		"srcBusiId": "1949250437570887690",
		"srcClassifier": "",
		"srcSystemId": "1",
		"srcModule": "yonbip-fi-earapbill",
		"srcBillTypeId": "2614099822008320",
		"srcTradeTypeId": "2614289958408704",
		"srcBillNo": "OARar240311005303",
		"action": "delete",
		"busiDate": "2024-03-11",
		"orgId": "1608898451414712328",
		"srcBillVersion": 2
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
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 返回信息 示例：reverseCancel成功 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "reverseCancel成功"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

500	reverseCancel失败	请等待自动重试，或联系集团开发


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

