---
title: "交单办理批量保存"
apiId: "2131949421484048387"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Presentation of Documents"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Presentation of Documents]
platform_version: "BIP"
source_type: community-api-docs
---

# 交单办理批量保存

> `ContentType	application/json` 请求方式	POST | 分类: Presentation of Documents (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/presentationOpenApi/saveData

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
| accentity | string | 否 | 是 | 组织机构编码 |
| status | string | 否 | 是 | 审批状态: 0已保存 |
| presentations | object | 是 | 是 | 交单办理列表 |
| number | number |
| 小数位数:-1,最大长度:18 | 否 | 是 | 流水号 示例：使用时间戳 |
| vouchdate | date |
| 格式:yyyy-MM-dd | 否 | 否 | 单据日期 |
| receiptCertificate | string | 否 | 是 | 信用证编号 |
| dept | string | 否 | 否 | 部门编码 |
| costCenter | string | 否 | 否 | 成本中心编码 |
| profitCenter | string | 否 | 否 | 利润中心编码 |
| project | string | 否 | 否 | 项目编码 |
| wbs | string | 否 | 否 | WBS编码 |
| activity | string | 否 | 否 | 活动编码 |
| presentationNo | string | 否 | 是 | 交单编号 |
| presentationDate | date |
| 格式:yyyy-MM-dd | 否 | 否 | 交单日期 |
| presentationType | string | 否 | 否 | 交单类型：1全部交单 2部分交单 |
| shippingDate | date |
| 格式:yyyy-MM-dd | 否 | 否 | 发运日期 |
| presentationAmt | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 交单金额 |
| presentationBank | string | 否 | 否 | 交单行编码 |
| presentationPerson | string | 否 | 否 | 交单人编码 |
| lastDate | date |
| 格式:yyyy-MM-dd | 否 | 否 | 对方最迟付款/承兑确认日期 |
| financing | string | 否 | 否 | 是否融资：true是 false否 |
| undertakeConfirm | string | 否 | 否 | 对方处理方式：1承兑 2拒付 3付款 |
| undertakeType | string | 否 | 否 | 对方兑付方式：1即期付款 2承兑 3议付 4延期付款 5混合付款 |
| protestReason | string | 否 | 否 | 拒付原因 |
| estimateDate | date |
| 格式:yyyy-MM-dd | 否 | 否 | 对方最迟付款日期 |
| presentationPropertys | object | 是 | 否 | 物权子表 |

## 3. 请求示例

Url: /yonbip/ctm/presentationOpenApi/saveData?access_token=访问令牌
Body: {
	"accentity": "",
	"status": "",
	"presentations": [
		{
			"number": NaN,
			"vouchdate": "2026-06-07",
			"receiptCertificate": "",
			"dept": "",
			"costCenter": "",
			"profitCenter": "",
			"project": "",
			"wbs": "",
			"activity": "",
			"presentationNo": "",
			"presentationDate": "2026-06-07",
			"presentationType": "",
			"shippingDate": "2026-06-07",
			"presentationAmt": 0,
			"presentationBank": "",
			"presentationPerson": "",
			"lastDate": "2026-06-07",
			"financing": "",
			"undertakeConfirm": "",
			"undertakeType": "",
			"protestReason": "",
			"estimateDate": "2026-06-07",
			"presentationPropertys": [
				{
					"propertyRightRate": 0
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
| code | string | 否 | 返回码 |
| message | string | 否 | 描述信息 |
| data | object | 是 | 返回数据 |
| responseCode | string | 否 | 单个单据返回码：200保存成功 500 501 502 保存失败 |
| message | string | 否 | 失败信息 |
| id | string | 否 | 保存单据Id |
| number | string | 否 | 流水码 |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": [
		{
			"responseCode": "",
			"message": "",
			"id": "",
			"number": ""
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	服务端异常


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

