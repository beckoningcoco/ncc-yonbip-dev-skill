---
title: "信用评价V1"
apiId: "2273734830213562369"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Credits"
domain: "SSC"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Credits]
platform_version: "BIP"
source_type: community-api-docs
---

# 信用评价V1

> `ContentType	application/json` 请求方式	POST | 分类: Credits (SSC)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ssc/YGXYGL/credit/evaluateBill/evaluate

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
| data | object | 否 | 是 | 入参实体 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| billTypeId | string | 否 | 是 | 单据类型id 示例：2333826110575360 |
| transTypeId | string | 否 | 是 | 交易类型id 示例：2333826110575361 |
| billId | string | 否 | 是 | 单据id 示例：2284275204068212739 |
| billCode | string | 否 | 是 | 单据编号 示例：TYGD2506050001 |
| evaluatedStaffId | string | 否 | 是 | 被评价人员工id 示例：2030142624808042502 |
| evaluatorStaffId | string | 否 | 是 | 评价人员工id 示例：2030142624808042502 |
| domain | string | 否 | 否 | 领域 |
| action | string | 否 | 是 | 审批动作（1：驳回到制单人） 示例：1 |
| sourceSystem | string | 否 | 是 | 来源（znbzbx：费控服务；GXZY：共享作业） 示例：GXZY |
| taskId | string | 否 | 否 | 作业id，共享作业必填 示例：1722904767816007688 |
| linkId | string | 否 | 否 | 环节id |
| processId | string | 否 | 否 | 主流程实例ID |
| source | string | 否 | 否 | 单据在云审注册source源 |
| linkIds | string | 是 | 否 | 所有启用信用的环节ID |
| questionList | object | 是 | 是 | 问题列表 |

## 3. 请求示例

Url: /yonbip/ssc/YGXYGL/credit/evaluateBill/evaluate?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"billTypeId": "2333826110575360",
		"transTypeId": "2333826110575361",
		"billId": "2284275204068212739",
		"billCode": "TYGD2506050001",
		"evaluatedStaffId": "2030142624808042502",
		"evaluatorStaffId": "2030142624808042502",
		"domain": "",
		"action": "1",
		"sourceSystem": "GXZY",
		"taskId": "1722904767816007688",
		"linkId": "",
		"processId": "",
		"source": "",
		"linkIds": [
			""
		],
		"questionList": [
			{
				"questionId": "2030176383240503303",
				"reason": "驳回",
				"result": "1"
			}
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
| code | string | 否 | 调用返回码 示例：200 |
| message | string | 否 | 调用完成返回信息 示例：操作成功 |
| displayCode | string | 否 | 异常码 |
| level | string | 否 | 异常级别 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"displayCode": "",
	"level": ""
}

## 6. 业务异常码

036-502-000047

系统异常，请稍后重试

036-502-000054

被评价人的信用档案正在被操作，自动重试失败，请及时联系管理员排查问题并手动重试。

036-502-000199

被评价人不可为空

036-502-000200

来源系统为空

036-502-000201

评价场景有误

036-502-000202

action不能为空

036-502-000056

当前无已启用的信用方案，请前往【信用方案】节点维护配置

036-502-000165

没有不通过的稽核规则,不需扣分

036-502-000106

单据号为空

036-502-000107

单据ID为空

036-502-000108

036-502-000111

评价人工号为空

036-502-000159

员工信用许可不存在，请前往订阅

036-502-000160

员工信用许可已到期，请前往订阅

036-502-000161

员工信用许可未启用，请前往订阅

036-502-000109

审核问题为空,不生成评价记录单

036-502-000155

共享作业驳回时taskId不能为空

036-502-000181

查询当前启用的信用管理方案应用单据范围错误，请刷新重试或联系系统管理员

036-502-000059

036-502-000060

036-502-000137

获取信用参数错误，请刷新重试或联系系统管理员

036-502-000057

评价失败，评价人和评价对象不可为同一人。如需修改，请前往【信用参数】节点维护配置

036-502-000058

当前信用方案不存在已启用的扣分规则

036-502-000113

所选问题不在信用方案（{0}）的范围内。

036-502-000097

获取信用档案失败，请稍后重试

036-502-000242

【信用评价记录单】生成失败，请稍后重试或联系系统管理员

036-502-000243

未查询到被评价人的员工信息


## 7. 错误返回码

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

