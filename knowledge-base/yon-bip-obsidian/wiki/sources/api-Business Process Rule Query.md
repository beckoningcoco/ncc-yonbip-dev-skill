---
title: "业务流规则查询"
apiId: "2123101599885688840"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Business Process"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Business Process]
platform_version: "BIP"
source_type: community-api-docs
---

# 业务流规则查询

> `ContentType	application/json` 请求方式	GET | 分类: Business Process (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/businessFlow/getFlowRulesByFlowId

请求方式	GET

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| flowId | string | query | 否 | 业务流id |

## 3. 请求示例

Url: /yonbip/digitalModel/businessFlow/getFlowRulesByFlowId?access_token=访问令牌&flowId=

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 状态信息 示例：OK |
| data | object | 是 | 数据信息 |
| name | string | 否 | 规则名称（中文） 示例：销售订单生成销售发票 |
| name2 | string | 否 | 规则名称（英文） 示例：销售订单生成销售发票 |
| name3 | string | 否 | 规则名称（繁体） 示例：销售订单生成销售发票 |
| name4 | string | 否 | 规则名称 |
| name5 | string | 否 | 规则名称 |
| name6 | string | 否 | 规则名称 |
| name_resid | string | 否 | 规则名称资源id |
| id | string | 否 | 业务流规则id 示例：7489464d-962a-4faf-ab7f-d9aa7444d11c |
| ruleId | string | 否 | 流程级转换规则id 示例：1426035837914054925 |
| ruleCode | string | 否 | 流程级转换规则code 示例：order_saleinvoice |
| refRuleId | string | 否 | 租户级转换规则id 示例：1426035837914054925 |
| refRuleCode | string | 否 | 租户级转换规则code 示例：order_saleinvoice |
| sysRuleId | string | 否 | 系统级转换规则id 示例：1426035837914054925 |
| sysRuleCode | string | 否 | 系统级转换规则code 示例：order_saleinvoice |
| sysId | string | 否 | 系统级业务流规则id 示例：7489464d-962a-4faf-ab7f-d9aa7444d11c |
| tenantId | string | 否 | 租户 示例：0000LUIDSWVV2WNFUS0000 |
| nodeId | string | 否 | 前端节点对应id 示例：d2beb3a4-73ce-46fa-b724-2206a0d89f45 |
| businessFlowId | string | 否 | 业务流id 示例：0ee1a675-62d0-4a2c-bb89-3109e922d224 |
| businessFlowName | string | 否 | 业务流名称 示例：销售订单开票1 |
| pushRuleType | number |
| 小数位数:-1,最大长度:9 | 否 | 推送类型， 推单0，拉单6， 回写9 示例：0 |
| pushOpportunity | number |
| 小数位数:-1,最大长度:6 | 否 | 推送时机，0：单据生效，1：环节完成时，2：手工推，3：流程操作，4：单据动作 示例：2 |
| pushOpportunityStr | string | 否 | 推送时机json |
| pushMode | number |
| 小数位数:0,最大长度:2 | 否 | 推送方式，0：新增单据，1：仅更新单据，2：更新或新增 示例：0 |
| verifyState | number |
| 小数位数:0,最大长度:1 | 否 | 单据状态 0:草稿态 1:提交态 示例：0 |
| targetConditions | string | 否 | 目标单据范围的条件 示例：[] |
| showConvertedBill | boolean | 否 | 是否显示转单页面，1：是，0：否 示例：true |
| originType | string | 否 | 启用状态，1：启用，0：停用 示例：voucher_order |
| originDes | string | 否 | 来源单据名 示例：销售订单 |
| originSubId | string | 否 | 来源单据应用code 示例：SCMSA |
| originDomain | string | 否 | 来源单据domain 示例：udinghuo |
| originBillType | number |
| 小数位数:0,最大长度:2 | 否 | 来源单据类型, 低代码单据0， 领域单据2 示例：2 |
| originFlowBillNodeId | string | 否 | 来源单据节点id（前端图形数据中的id) 示例：billItemNode_cb0938c8-ea9e-44bb-80b5-312b6812b345 |
| srcBizTypeId | string | 否 | 来源交易类型id 示例：1965914679008038290 |
| srcBizTypeName | string | 否 | 来源交易类型名称 示例：订单开票 |
| targetType | string | 否 | 目标单据billnum 示例：voucher_saleinvoice |
| targetDes | string | 否 | 目标单据名 示例：销售发票 |
| targetSubId | string | 否 | 目标单据应用code 示例：SCMSA |
| targetDomain | string | 否 | 目标单据domain 示例：udinghuo |
| targetBillType | number |
| 小数位数:0,最大长度:10 | 否 | 目标单据类型, 低代码单据0， 领域单据2 示例：2 |
| targetFlowBillNodeId | string | 否 | 目标单据节点id（前端图形数据中的id) 示例：billItemNode_8f9610ac-8b95-4623-a463-2c5752fcae9d |
| tarBizTypeId | string | 否 | 目标交易类型id |
| tarBizTypeName | string | 否 | 目标交易类型名称 |
| expression | string | 否 | 过滤公式 |
| expressionDisplay | string | 否 | 过滤公式显示值 |
| dataItems | string | 否 | 转换字段 |
| groupItems | string | 否 | 分组字段 |
| collectItems | string | 否 | 分单设置 |
| filterItems | string | 否 | 公式过滤规则json 示例：[] |
| pushTimeType | number |
| 小数位数:0,最大长度:1 | 否 | 推送时间类型，0：即时推送，1：定时推送 示例：0 |
| timeSetting | string | 否 | 定时设计 |
| enableToDo | boolean | 否 | 是否发送待办，1：是，0：否 示例：false |
| toDoSetting | string | 否 | 待办设置 |
| enableFailureToDo | boolean | 否 | 是否启用失败通知，1：是，0：否 示例：false |
| failureToDoSetting | string | 否 | 失败通知设置 |
| status | boolean | 否 | 启用状态，1：启用，0：停用 示例：true |
| order | number |
| 小数位数:0,最大长度:10 | 否 | 规则排序 示例：1 |
| description | string | 否 | 描述 |
| descriptionStr | string | 否 | 描述串 |
| pullMetaPk | string | 否 | 拉单页面元数据PK |
| pullType | string | 否 | 拉单页面billnum |
| pullDomain | string | 否 | 拉单页面domain |
| pullMultiSelect | boolean | 否 | 拉单时是否可以多选 ，1：是，0：否 示例：true |
| pullShowAll | boolean | 否 | 拉单时显示所有数据，1：是，0：否 示例：true |
| createUserType | number |
| 小数位数:0,最大长度:10 | 否 | 制单人类型（暂时没有使用） 示例：0 |
| createUserId | string | 否 | 制单人id 示例：880d5f77-a8fe-4de3-bcba-b676c25abd4e |
| createUserName | string | 否 | 制单人名称 示例：苑洪军 |
| createTime | string | 否 | 创建时间 示例：2024-04-02 20:57:57 |
| sysRuleCategory | string | 否 | 引用规则的领域编码 自定义扩展为"DEV" 示例：SCMSA |
| sysRuleIsSys | boolean | 否 | 引用规则是否是预置，1：是，0：否 示例：true |
| originBusiCode | string | 否 | 来源业务对象编码 示例：udinghuo.voucher_order |
| targetBusiCode | string | 否 | 目标业务对象编码 示例：udinghuo.voucher_saleinvoice |
| locationPath | string | 否 | 资源多语路径 示例：tenant/BIZFLOW-BE/0000LUIDSWVV2WNFUS0000/flowRule/7489464d-962a-4faf-ab7f-d9aa7444d11c |

## 5. 正确返回示例

{
	"code": "200",
	"message": "OK",
	"data": [
		{
			"name": "销售订单生成销售发票",
			"name2": "销售订单生成销售发票",
			"name3": "销售订单生成销售发票",
			"name4": "",
			"name5": "",
			"name6": "",
			"name_resid": "",
			"id": "7489464d-962a-4faf-ab7f-d9aa7444d11c",
			"ruleId": "1426035837914054925",
			"ruleCode": "order_saleinvoice",
			"refRuleId": "1426035837914054925",
			"refRuleCode": "order_saleinvoice",
			"sysRuleId": "1426035837914054925",
			"sysRuleCode": "order_saleinvoice",
			"sysId": "7489464d-962a-4faf-ab7f-d9aa7444d11c",
			"tenantId": "0000LUIDSWVV2WNFUS0000",
			"nodeId": "d2beb3a4-73ce-46fa-b724-2206a0d89f45",
			"businessFlowId": "0ee1a675-62d0-4a2c-bb89-3109e922d224",
			"businessFlowName": "销售订单开票1",
			"pushRuleType": 0,
			"pushOpportunity": 2,
			"pushOpportunityStr": "",
			"pushMode": 0,
			"verifyState": 0,
			"targetConditions": "[]",
			"showConvertedBill": true,
			"originType": "voucher_order",
			"originDes": "销售订单",
			"originSubId": "SCMSA",
			"originDomain": "udinghuo",
			"originBillType": 2,
			"originFlowBillNodeId": "billItemNode_cb0938c8-ea9e-44bb-80b5-312b6812b345",
			"srcBizTypeId": "1965914679008038290",
			"srcBizTypeName": "订单开票",
			"targetType": "voucher_saleinvoice",
			"targetDes": "销售发票",
			"targetSubId": "SCMSA",
			"targetDomain": "udinghuo",
			"targetBillType": 2,
			"targetFlowBillNodeId": "billItemNode_8f9610ac-8b95-4623-a463-2c5752fcae9d",
			"tarBizTypeId": "",
			"tarBizTypeName": "",
			"expression": "",
			"expressionDisplay": "",
			"dataItems": "",
			"groupItems": "",
			"collectItems": "",
			"filterItems": "[]",
			"pushTimeType": 0,
			"timeSetting": "",
			"enableToDo": false,
			"toDoSetting": "",
			"enableFailureToDo": false,
			"failureToDoSetting": "",
			"status": true,
			"order": 1,
			"description": "",
			"descriptionStr": "",
			"pullMetaPk": "",
			"pullType": "",
			"pullDomain": "",
			"pullMultiSelect": true,
			"pullShowAll": true,
			"createUserType": 0,
			"createUserId": "880d5f77-a8fe-4de3-bcba-b676c25abd4e",
			"createUserName": "苑洪军",
			"createTime": "2024-04-02 20:57:57",
			"sysRuleCategory": "SCMSA",
			"sysRuleIsSys": true,
			"originBusiCode": "udinghuo.voucher_order",
			"targetBusiCode": "udinghuo.voucher_saleinvoice",
			"locationPath": "tenant/BIZFLOW-BE/0000LUIDSWVV2WNFUS0000/flowRule/7489464d-962a-4faf-ab7f-d9aa7444d11c"
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

50001	未找到相关数据	根据传入的业务流id没有查到规则数据


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

