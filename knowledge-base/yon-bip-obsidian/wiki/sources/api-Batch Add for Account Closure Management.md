---
title: "销户管理批量新增"
apiId: "2024209368015175683"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Account Closure Management"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Account Closure Management]
platform_version: "BIP"
source_type: community-api-docs
---

# 销户管理批量新增

> `ContentType	application/json` 请求方式	POST | 分类: Account Closure Management (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/bam/cancelAccount/batchSave

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| accentityName | string | 否 | 是 | 资金组织名称 示例：用友网络科技股份有限公司 |
| applyDate | string | 否 | 是 | 申请日期 示例：2024-06-20 |
| bankNo | string | 否 | 是 | 银行账号 示例：6777733999929 |
| cancelAccountReason | string | 否 | 是 | 销户原因 示例：无业务需求 |
| fundNeedOut | string | 否 | 否 | 需转出资金:当银行账号非结算中心账户时必填，是结算中心账户时非必填，0-否 1-是 示例：1 |
| balanceTransUnitType | string | 否 | 否 | 余额划转单位类型：条件必填； 当需转出资金为是时必填：1-本单位 2-集团内单位 3-其他 示例：1 |
| balanceTransAccount | string | 否 | 否 | 余额划转账号：当需转出资金为是时必填 示例：334343457777 |
| transAccountName | string | 否 | 否 | 划转账号户名：条件必填 当余额划转单位类型为其他时，文本类型，手工填写 示例：用友网络 |
| transAccountAccentity | string | 否 | 否 | 划转资金组织名称：条件必填 当余额划转单位类型为其他时，文本类型，手工填写 示例：用友金融股份有限公司 |
| applyStatus | number |
| 小数位数:0,最大长度:1 | 否 | 是 | 申请状态 ：1-待提交 示例：1 |

## 3. 请求示例

Url: /yonbip/ctm/bam/cancelAccount/batchSave?access_token=访问令牌
Body: [{
	"accentityName": "用友网络科技股份有限公司",
	"applyDate": "2024-06-20",
	"bankNo": "6777733999929",
	"cancelAccountReason": "无业务需求",
	"fundNeedOut": "1",
	"balanceTransUnitType": "1",
	"balanceTransAccount": "334343457777",
	"transAccountName": "用友网络",
	"transAccountAccentity": "用友金融股份有限公司",
	"applyStatus": 1
}]

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| code | string | 否 | 接口返回码 示例：200 |
| message | string | 否 | 返回消息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| data | object | 是 | 各账号结果 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"data": [
			{
				"bankNo": "74363645646",
				"code": "200",
				"message": "保存成功",
				"id": "2253545445"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

200	成功

500	失败


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-08-19

更新

请求说明

api改名


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

