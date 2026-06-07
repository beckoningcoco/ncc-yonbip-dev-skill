---
title: "研发项目信息编辑"
apiId: "2009357680341680129"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Tax Related Data Management"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Tax Related Data Management]
platform_version: "BIP"
source_type: community-api-docs
---

# 研发项目信息编辑

> `ContentType	application/json` 请求方式	POST | 分类: Tax Related Data Management (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/yonbip-fi-taxgateway/yonbip-fi-taxspec/api/tax-rd-project/edit

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
| id | string | 否 | 是 | 主键，新增接口返回的id字段 示例：101 |
| mode | string | 否 | 是 | 研发形式，枚举：{1:自主研发,2:委托研发,3:合作研发,4:集中研发} 示例：1 |
| startTime | string | 否 | 是 | 研发项目起始时间，格式：YYYY-MM-DD 示例：2024-01-01 |
| endTime | string | 否 | 否 | 研发项目结束时间，格式：YYYY-MM-DD 示例：2024-01-01 |
| deductionPreferentialItem | string | 否 | 是 | 加计扣除优惠事项，枚举：{5:企业开发新技术、新产品、新工艺发生的研究开发费用加计扣除（按100%加计扣除）,6:企业为获得创新性、创意性、突破性的产品进行创意设计活动发生的相关费用加计扣除（按100%加计扣除）,7:企业开发新技术、新产品、新工艺发生的研究开发费用加计扣除（集成电路和工业母机企业按120%加计扣除）,8:企业为获得创新性、创意性、突破性的产品进行创意设计活动发生的相关费用加计扣除（集成电路和工业母机企业按120%加计扣除）} 示例：5 |
| state | string | 否 | 是 | 项目状态，枚举：{1:未完成,2:已完成} 示例：1 |
| achievementName | string | 否 | 否 | 研发成果名称 示例：101 |
| achievementCode | string | 否 | 否 | 研发成果编号 示例：101 |
| awardTime | string | 否 | 否 | 研发成果颁发日期，格式：YYYY-MM-DD 示例：2024-01-01 |
| awardMechanism | string | 否 | 否 | 研发成果颁发机构 示例：101 |
| entrustedName | string | 否 | 否 | 受委托方名称 示例：101 |
| iprAscription | string | 否 | 否 | 知识产权归属，枚举：{1:委托方所有,2:受托方所有,3:双方共有} 示例：1 |
| brelationship | string | 否 | 否 | 是否存在关联关系，枚举：{1:是,2:否} 示例：1 |
| bentrustedOverseas | string | 否 | 否 | 是否委托境外，枚举：{1:是,2:否} 示例：1 |
| divisions | object | 是 | 否 | 研发部门 |
| divisionCode | string | 否 | 否 | 员工编码 示例：101 |
| contracts | object | 是 | 否 | 合同信息 |
| contractCode | string | 否 | 否 | 合同编码 示例：101 |
| partners | object | 是 | 否 | 合作方信息 |
| partnerName | string | 否 | 否 | 合作方名称 示例：101 |
| members | object | 是 | 否 | 集中研发成员企业 |
| enterpriseName | string | 否 | 否 | 集中研发成员企业名称 示例：101 |
| relationType | string | 否 | 否 | 成员关系类型，枚举：{1:母公司,2:子公司,3:参股公司,4:其他成员} 示例：1 |
| staffs | object | 是 | 否 | 项目人员 |
| staffCode | string | 否 | 否 | 员工编码 示例：101 |

## 3. 请求示例

Url: /yonbip/tax/yonbip-fi-taxgateway/yonbip-fi-taxspec/api/tax-rd-project/edit?access_token=访问令牌
Body: {
	"id": "101",
	"mode": "1",
	"startTime": "2024-01-01",
	"endTime": "2024-01-01",
	"deductionPreferentialItem": "5",
	"state": "1",
	"achievementName": "101",
	"achievementCode": "101",
	"awardTime": "2024-01-01",
	"awardMechanism": "101",
	"entrustedName": "101",
	"iprAscription": "1",
	"brelationship": "1",
	"bentrustedOverseas": "1",
	"divisions": [
		{
			"divisionCode": "101"
		}
	],
	"contracts": [
		{
			"contractCode": "101"
		}
	],
	"partners": [
		{
			"partnerName": "101"
		}
	],
	"members": [
		{
			"enterpriseName": "101",
			"relationType": "1"
		}
	],
	"staffs": [
		{
			"staffCode": "101"
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
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 描述信息 示例：操作成功 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

9999	系统异常	根据具体返回信息调整参数

1001	参数异常	根据具体返回信息调整参数


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-12-15

更新

请求参数 deductionPreferentialItem

修改位置到涉水数据管理


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

