---
title: "授信合同新增"
apiId: "1836626439416315912"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Credit Contract"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Credit Contract]
platform_version: "BIP"
source_type: community-api-docs
---

# 授信合同新增

> `ContentType	application/json` 请求方式	POST | 分类: Credit Contract (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/camAgreementOpenApi/agreementAdd

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
| accentity | string | 否 | 是 | 资金组织id|code|name 示例：测试专用 |
| agreementNo | string | 否 | 是 | 授信协议号 示例：授信001 |
| relatedHead | string | 否 | 否 | 关联总授信id|code|name 示例：总授信 |
| creditSource | string | 否 | 是 | 授信来源id|code|name 示例：银行 |
| headOfficeOrg | string | 否 | 否 | 总行机构id|code|name（授信类型为总授信时必输） 示例：人民银行 |
| creditOrganAcc | string | 否 | 否 | 授信机构id|code|name（授信类型=企业授信、集团授信、内部授信时必输） 示例：北京银行中关村广场支行 |
| trustedTarget | string | 否 | 否 | 授信对象id|code|name（默认为资金组织） 示例：测试专用 |
| creditType | short | 否 | 是 | 授信类型；枚举：企业授信-1、集团授信-2、内部授信-3、总授信- 4 示例：1 |
| currency | string | 否 | 是 | 授信币种id|code|name 示例：人民币 |
| creditQuota | number |
| 小数位数:2,最大长度:10 | 否 | 是 | 授信总额度 示例：10000 |
| creditStart | date |
| 格式:yyyy-MM-dd | 否 | 是 | 授信开始日 示例：2025-03-17 |
| creditEnd | date |
| 格式:yyyy-MM-dd | 否 | 是 | 授信结束日 示例：2026-03-17 |
| creditTerm | int | 否 | 否 | 授信期限（数值） 示例：1 |
| creditTermType | short | 否 | 否 | 授信期限（类型）；枚举：年-0，月-1，日-2 示例：0 |
| guaranteeType | string | 否 | 是 | 担保方式；枚举：信用-0,抵押-1,质押-2,第三方保证-3,第三方抵押-4,第三方质押-5,定金-8,留置-9,流动性支持函-a,差额补足承诺-b,承诺函-c,安慰函-d,共同借款合同-e,其他隐性担保-f 示例：0 |
| creditOpenQuota | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 授信敞口额度 示例：10000 |
| controlMode | short | 否 | 是 | 控制方式；枚举：提示-0、控制-1 示例：0 |
| creditEmployMode | short | 否 | 是 | 授信占用方式；枚举：一次性-0、可循环-1 示例：1 |
| quotaUsageMode | string | 否 | 否 | 额度使用模式；枚举：额度专享-0,额度共享-1 示例：0 |
| waveScale | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 动拨比例（%） 示例：10 |
| backup | string | 否 | 否 | 备注 示例：备注 |
| contractType | string | 否 | 否 | 合同类型（只有结转合同时需要填写）；枚举：结转-carryOver 示例：carryOver |
| originAgreementId | string | 否 | 否 | 结转前关联协议id|code|name 示例：结转前协议 |
| agreement_b | object | 是 | 否 | 授信明细 |
| useEnterprise | string | 否 | 否 | 使用企业id|code|name（默认为资金组织） 示例：测试专用 |
| creditVarieties | string | 否 | 否 | 授信类别id|code|name 示例：授信 |
| creditVarietiesLimit | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 授信类别限额 示例：10000 |
| finProducts | string | 否 | 否 | 金融产品id|code|name 示例：银行贷款 |
| finProductsLimit | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 金融产品限额 示例：10000 |
| exclusive | string | 否 | 否 | 是否专享；枚举：否-0，是-1 示例：0 默认值：0 |
| backup | string | 否 | 否 | 备注 示例：备注 |

## 3. 请求示例

Url: /yonbip/ctm/camAgreementOpenApi/agreementAdd?access_token=访问令牌
Body: {
	"accentity": "测试专用",
	"agreementNo": "授信001",
	"relatedHead": "总授信",
	"creditSource": "银行",
	"headOfficeOrg": "人民银行",
	"creditOrganAcc": "北京银行中关村广场支行",
	"trustedTarget": "测试专用",
	"creditType": 1,
	"currency": "人民币",
	"creditQuota": 10000,
	"creditStart": "2025-03-17",
	"creditEnd": "2026-03-17",
	"creditTerm": 1,
	"creditTermType": 0,
	"guaranteeType": "0",
	"creditOpenQuota": 10000,
	"controlMode": 0,
	"creditEmployMode": 1,
	"quotaUsageMode": "0",
	"waveScale": 10,
	"backup": "备注",
	"contractType": "carryOver",
	"originAgreementId": "结转前协议",
	"agreement_b": [
		{
			"useEnterprise": "测试专用",
			"creditVarieties": "授信",
			"creditVarietiesLimit": 10000,
			"finProducts": "银行贷款",
			"finProductsLimit": 10000,
			"exclusive": "0",
			"backup": "备注"
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
| code | long | 否 | code 示例：200 |
| message | string | 否 | message 示例：操作成功 |
| data | object | 否 | data |
| trustedTarget | string | 否 | trustedTarget 示例：1525653687361339397 |
| itemType | long | 否 | itemType 示例：1 |
| showCreditTerm | string | 否 | showCreditTerm 示例：2年 |
| code | string | 否 | code 示例：CAMCONT202310111213 |
| createMethod | string | 否 | createMethod 示例：2 |
| creatorId | string | 否 | creatorId 示例：1525641755939569667 |
| creditTermType | long | 否 | creditTermType 示例：0 |
| occupiedQuota | long | 否 | occupiedQuota 示例：0 |
| accentity | string | 否 | accentity 示例：1525653687361339397 |
| creditType | long | 否 | creditType 示例：1 |
| vouchdate | string | 否 | vouchdate 示例：2023-10-11 00:00:00 |
| creditEnd | string | 否 | creditEnd 示例：2022-03-10 00:00:00 |
| creditSource | string | 否 | creditSource 示例：TBOT0005 |
| isHistoryMargin | long | 否 | isHistoryMargin 示例：0 |
| creditQuota | double | 否 | creditQuota 示例：40023.234333 |
| residueAvailableQuota | double | 否 | residueAvailableQuota 示例：40023.234333 |
| creditTerm | long | 否 | creditTerm 示例：2 |
| currency | string | 否 | currency 示例：1525643705855773169 |
| id | string | 否 | id 示例：1836593780388003841 |
| pubts | string | 否 | pubts 示例：2023-10-11 15:01:02 |
| tenant | long | 否 | tenant 示例：2909930715861584 |
| createDate | string | 否 | createDate 示例：2023-10-11 00:00:00 |
| approvalStatus | long | 否 | approvalStatus 示例：0 |
| controlMode | long | 否 | controlMode 示例：3 |
| creator | string | 否 | creator 示例：测试管理员111 |
| releasedQuota | long | 否 | releasedQuota 示例：0 |
| isWfControlled | boolean | 否 | isWfControlled 示例：false |
| basebilltype | long | 否 | basebilltype 示例：101 |
| creditStart | string | 否 | creditStart 示例：2021-03-10 00:00:00 |
| creditBillStatus | long | 否 | creditBillStatus 示例：0 |
| bustype | string | 否 | bustype 示例：2538797006344704 |
| guaranteeType | string | 否 | guaranteeType 示例：0 |
| createTime | string | 否 | createTime 示例：2023-10-11 15:00:57 |
| agreementNo | string | 否 | agreementNo 示例：123dsfasd115 |
| backup6 | string | 否 | backup6 示例：1 |
| itemSource | long | 否 | itemSource 示例：1 |
| creditEmployMode | long | 否 | creditEmployMode 示例：1 |
| status | long | 否 | status 示例：0 |
| agreement_b | object | 是 | agreement_b |
| statusMsg | string | 否 | statusMsg 示例：保存成功 |
| traceId | string | 否 | traceId 示例：4177994353efbd21 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"trustedTarget": "1525653687361339397",
		"itemType": 1,
		"showCreditTerm": "2年",
		"code": "CAMCONT202310111213",
		"createMethod": "2",
		"creatorId": "1525641755939569667",
		"creditTermType": 0,
		"occupiedQuota": 0,
		"accentity": "1525653687361339397",
		"creditType": 1,
		"vouchdate": "2023-10-11 00:00:00",
		"creditEnd": "2022-03-10 00:00:00",
		"creditSource": "TBOT0005",
		"isHistoryMargin": 0,
		"creditQuota": 40023.234333,
		"residueAvailableQuota": 40023.234333,
		"creditTerm": 2,
		"currency": "1525643705855773169",
		"id": "1836593780388003841",
		"pubts": "2023-10-11 15:01:02",
		"tenant": 2909930715861584,
		"createDate": "2023-10-11 00:00:00",
		"approvalStatus": 0,
		"controlMode": 3,
		"creator": "测试管理员111",
		"releasedQuota": 0,
		"isWfControlled": false,
		"basebilltype": 101,
		"creditStart": "2021-03-10 00:00:00",
		"creditBillStatus": 0,
		"bustype": "2538797006344704",
		"guaranteeType": "0",
		"createTime": "2023-10-11 15:00:57",
		"agreementNo": "123dsfasd115",
		"backup6": "1",
		"itemSource": 1,
		"creditEmployMode": 1,
		"status": 0,
		"agreement_b": [
			{
				"finProducts": "1614687569122426880",
				"finOccupyAmt": 0,
				"useEnterprise": "1525653687361339397",
				"creditOccupyAmt": 0,
				"creditVarietyActualAvailableAmt": 123.12332111,
				"finProductsLimit": 13.23123,
				"finUnReleaseAmt": 0,
				"isOwnAdd": "1",
				"finRemainingActualAvailableAmt": 13.23123,
				"creditVarietiesLimit": 123.12332111,
				"id": "1836593797567873027",
				"mainid": "1836593780388003841",
				"pubts": "2023-10-11 15:00:58",
				"creditVarieties": "1617053546362437634",
				"tenant": 2909930715861584,
				"creditRemainingAvailableAmt": 123.12332111,
				"finRemainingAvailableAmt": 13.23123
			}
		],
		"statusMsg": "保存成功"
	},
	"traceId": "4177994353efbd21"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

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

