---
title: "固定资产调出审核"
apiId: "2018319851164532738"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Fixed Asset Transfer-Out"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Fixed Asset Transfer-Out]
platform_version: "BIP"
source_type: community-api-docs
---

# 固定资产调出审核

> `ContentType	application/json` 请求方式	POST | 分类: Fixed Asset Transfer-Out (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/EFI/FaAllocateOut/audit

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
| data | object | 否 | 是 | 业务数据 |
| id | string | 否 | 是 | 固定资产调出id 示例：1483387421116596230 |

## 3. 请求示例

Url: /yonbip/EFI/FaAllocateOut/audit?access_token=访问令牌
Body: {
	"data": {
		"id": "1483387421116596230"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用返回信息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| busiObj | string | 否 | 固定资产调出业务对象 示例：FaAllocateOut |
| id | string | 否 | 固定资产调出id 示例：1734829976437915649 |
| ytenantId | string | 否 | 租户id 示例：0000LCAALQGPE642KN0000 |
| verifyState | number |
| 小数位数:0,最大长度:10 | 否 | 审核状态, 枚举值(0:初始开立,1:审批中,2:审批完成,3:不通过流程终止,4:驳回到制单) 示例：2 |
| auditTime | string | 否 | 审核时间 示例：2024-06-12 17:09:37 |
| cBillNo | string | 否 | 调出单billnum 示例：FaAllocateOut |
| busiPostStatus | string | 否 | 过账状态(0:未过账, 1:过账成功,2:过账失败3:过账中) 示例：3 |
| pubts | string | 否 | pubts 示例：2024-06-12 17:09:37 |
| auditor | string | 否 | 审核人id 示例：00001951-7ca3-47ac-a462-d5a66e3e6724 |
| auditor_name | string | 否 | 审核人 示例：默认用户 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"busiObj": "FaAllocateOut",
		"id": "1734829976437915649",
		"ytenantId": "0000LCAALQGPE642KN0000",
		"verifyState": 2,
		"auditTime": "2024-06-12 17:09:37",
		"cBillNo": "FaAllocateOut",
		"busiPostStatus": "3",
		"pubts": "2024-06-12 17:09:37",
		"auditor": "00001951-7ca3-47ac-a462-d5a66e3e6724",
		"auditor_name": "默认用户"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	该单据已审核！	输入有效且未审核的单据id


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

