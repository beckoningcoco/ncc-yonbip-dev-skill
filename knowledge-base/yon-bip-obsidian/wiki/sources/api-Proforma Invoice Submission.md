---
title: "预提单提交"
apiId: "1519137002287005696"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Accrual Document"
domain: "ZNBZ"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Accrual Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 预提单提交

> `ContentType	application/json` 请求方式	POST | 分类: Accrual Document (ZNBZ)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/znbz/rbsm/api/bill/manualwithholding/submit

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
| id | long | 否 | 是 | 单据ID 示例：2365029317071104 |

## 3. 请求示例

Url: /yonbip/znbz/rbsm/api/bill/manualwithholding/submit?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": 2365029317071104
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 响应码 示例：200 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 响应信息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| id | long | 否 | id 示例：1524058777133777000 |
| resubmitCheckKey | string | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| pk_billtype | string | 否 | 单据类型（znbzbx_memoapply:通用申请单;znbzbx_busistrip:出差申请单;znbzbx_expensebill:通用报销单;znbzbx_travelexpbill:差旅报销单） 示例：znbzbx_manualwithholding |
| bustype | string | 否 | 交易类型.ID 示例：2554302900933952 |
| chandleorg | string | 否 | 报销人组织 示例：2560211497063168 |
| status | long | 否 | 单据状态(0:待提交;1:审批完成;2:已关闭;3:审批中) 示例：3 |
| ibudgetctrltype | long | 否 | 预算控制结果(0:预算内;2:超预算;3:超预警;99:未匹配到预算) 示例：99 |
| chandlecostcenter | long | 否 | 申请人成本中心.ID 示例：2739724343382528 |
| cfinaceorg | string | 否 | 费用承担组织.ID 示例：2560211497063168 |
| vfinacedeptid | string | 否 | 费用承担部门.ID 示例：2560214375846144 |
| caccountorg | string | 否 | 会计主体ID 示例：2560211497063168 |
| cfinacecostcenter | long | 否 | 费用承担成本中心 示例：2739724343382528 |
| vcurrency | string | 否 | 原币 示例：2554302895838464 |
| vnatexchratetype | string | 否 | 汇率类型 示例：0000KWZR3QO969OC1X0000 |
| isWfControlled | boolean | 否 | 是否审批流控制(true:是;false:不是) 示例：true |
| pubts | string | 否 | 更新时间 示例：2022-08-31 13:23:59 |
| verifystate | long | 否 | 审批状态(0:初始开立;1:审批中;2:审批完成;3:不通过流程终止;4:驳回到制单) 示例：1 |
| irejectstatus | long | 否 | 驳回状态(0:正常;1:驳回) 示例：0 |

## 5. 正确返回示例

{
	"code": "200",
	"displayCode": "",
	"message": "操作成功",
	"data": {
		"id": 1524058777133777000,
		"resubmitCheckKey": "OPENAPI_1519137002287005696_0000KWZR3QO969OC1X0000_ewwew",
		"pk_billtype": "znbzbx_manualwithholding",
		"bustype": "2554302900933952",
		"chandleorg": "2560211497063168",
		"status": 3,
		"ibudgetctrltype": 99,
		"chandlecostcenter": 2739724343382528,
		"cfinaceorg": "2560211497063168",
		"vfinacedeptid": "2560214375846144",
		"caccountorg": "2560211497063168",
		"cfinacecostcenter": 2739724343382528,
		"vcurrency": "2554302895838464",
		"vnatexchratetype": "0000KWZR3QO969OC1X0000",
		"isWfControlled": true,
		"pubts": "2022-08-31 13:23:59",
		"verifystate": 1,
		"irejectstatus": 0
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1021000999999	服务器异常	请联系系统管理员


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-11

新增

返回参数 displayCode


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

