---
title: "物料需求单据更新"
apiId: "2131371756972670980"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Material Demand Document"
domain: "SCCS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Material Demand Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 物料需求单据更新

> `ContentType	application/json` 请求方式	POST | 分类: Material Demand Document (SCCS)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/cpu/praybill/update

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	批量保存/更新

事务和幂等性	MDD幂等

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| datas | object | 是 | 否 | datas |
| id | number |
| 小数位数:0,最大长度:20 | 否 | 否 | 需求申请表头id 示例：4026759413518592 |
| purchaseRequestDefineCharacter | object | 否 | 否 | 这个key不需要动，只动下面的结构即可 |
| prayBillDetails | object | 是 | 否 | 需求申请表体key，不需要动 |

## 3. 请求示例

Url: /yonbip/cpu/praybill/update?access_token=访问令牌
Body: {
	"datas": [
		{
			"id": 4026759413518592,
			"purchaseRequestDefineCharacter": {
				"MC01": "api更xiin"
			},
			"prayBillDetails": [
				{
					"id": 4026759413518593,
					"purchaseReqlistChildDefineCharacter": {
						"A0001": "sjshsdfhf"
					}
				}
			]
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
| salesOrgId | string | 否 | 销售组织id |
| saleDepartmentId | string | 否 | 销售部门id |
| transactionTypeId | string | 否 | 交易类型id |
| settlementOrgId | string | 否 | 开票组织id |
| bizId | string | 否 | 商家id |
| createDate | string | 否 | 创建时间 |
| synSourceOrg | string | 否 | 协同来源组织id |
| ecsuiteuser | string | 否 | 气泡联系人 |
| ecsuiteuser | string | 否 | 气泡联系人 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	更新自定义项特征组[purchaseRequestDefineCharacter]入参[id]:[40236759413518592]错误,不存在	不符合更新条件就会报错


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-12-27

更新

请求参数 id

更新

请求参数 id

修改Id字段长度


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

