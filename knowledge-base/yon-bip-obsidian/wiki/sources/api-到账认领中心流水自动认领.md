---
title: "到账认领中心流水自动认领"
apiId: "2482160848544464901"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "My Claiming"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, My Claiming]
platform_version: "BIP"
source_type: community-api-docs
---

# 到账认领中心流水自动认领

> `ContentType	application/json` 请求方式	POST | 分类: My Claiming (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/cmp/bankReconciliationClaim

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
| autocommit | string | 否 | 是 | 0生成保存态的认领单，1生成认领单后自动提交 默认值：0 |
| data | object | 是 | 否 | 认领单表头 |
| vouchdate | string | 否 | 是 | 认领日期 默认值：2026-03-03 |
| remark | string | 否 | 是 | 认领说明 默认值：认领说明 |
| userId | string | 否 | 否 | 创建人id |
| usercode | string | 否 | 否 | 创建人编码，与userId二选一，全部传递时以id为准 |
| dept | string | 否 | 否 | 部门ID |
| deptcode | string | 否 | 否 | 部门编码，与部门ID二选一，全部传递时以id为准 |
| org | string | 否 | 否 | 业务组织ID |
| orgcode | string | 否 | 否 | 业务组织编码，与业务组织ID二选一，全部传递时以id为准 |
| project | string | 否 | 否 | 项目ID |
| projectcode | string | 否 | 否 | 项目编码，与项目ID二选一，全部传递时以id为准 |
| quicktype | string | 否 | 否 | 款项类型 |
| quicktypecode | string | 否 | 否 | 款项类型编码，与款项类型二选一，全部传递时以id为准 |
| smartcheckno | string | 否 | 否 | 财资统一对账码 |
| manualgenertbilltype | string | 否 | 否 | 手工生单类型 |
| data | object | 是 | 是 | 认领明细 |

## 3. 请求示例

Url: /yonbip/ctm/cmp/bankReconciliationClaim?access_token=访问令牌
Body: {
	"autocommit": "",
	"data": [
		{
			"vouchdate": "",
			"remark": "",
			"userId": "",
			"usercode": "",
			"dept": "",
			"deptcode": "",
			"org": "",
			"orgcode": "",
			"project": "",
			"projectcode": "",
			"quicktype": "",
			"quicktypecode": "",
			"smartcheckno": "",
			"manualgenertbilltype": "",
			"data": [
				{
					"id": "",
					"oppositetype": "",
					"oppositeobjectid": "",
					"claimamount": ""
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

1022020403000	接口请求异常！异常详细信息：XXXXX	根据错误提示修改请求参数或者选择正确的业务单据


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

