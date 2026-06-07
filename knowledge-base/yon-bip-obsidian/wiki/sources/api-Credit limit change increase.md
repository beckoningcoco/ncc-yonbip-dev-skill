---
title: "授信变更新增"
apiId: "1837516416782696456"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Credit Change"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Credit Change]
platform_version: "BIP"
source_type: community-api-docs
---

# 授信变更新增

> `ContentType	application/json` 请求方式	POST | 分类: Credit Change (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/camCreditChangeOpenApi/creditChangeAdd

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
| changeAgreementNum | string | 否 | 否 | 变更协议号 示例：变更协议号 |
| changeReasons | string | 否 | 否 | 变更原因 示例：变更原因 |
| accentity | string | 否 | 是 | 资金组织id|code|name 示例：测试专用 |
| agreementNo | string | 否 | 是 | 授信协议号id|code|name 示例：协议号 |
| relatedHead | string | 否 | 否 | 关联总授信id|code|name 示例：总授信 |
| creditQuota | string | 否 | 是 | 授信总额度 示例：1000 |
| creditStart | Date | 否 | 是 | 授信开始日期 示例：2025-03-26 |
| creditEnd | Date | 否 | 是 | 授信到期日期 示例：2026-03-26 |
| creditTerm | short | 否 | 否 | 授信期限（数值） 示例：1 |
| creditTermType | short | 否 | 否 | 授信期限（类型）；枚举：年-0，月-1，日-2 示例：0 |
| guaranteeType | string | 否 | 是 | 担保方式；枚举：信用-0,抵押-1,质押-2,第三方保证-3,第三方抵押-4,第三方质押-5,定金-8,留置-9,流动性支持函-a,差额补足承诺-b,承诺函-c,安慰函-d,共同借款合同-e,其他隐性担保-f 示例：0 |
| creditOpenQuota | string | 否 | 否 | 授信敞口额度 示例：1000 |
| controlMode | short | 否 | 是 | 控制方式；枚举：提示-0、控制-1 示例：0 |
| creditEmployMode | long | 否 | 是 | 授信占用方式；枚举：一次性-0、可循环-1 示例：1 |
| waveScale | string | 否 | 否 | 动拨比例（%） 示例：10 |
| backup | string | 否 | 否 | 备注 示例：备注 |
| creditChange_b | object | 是 | 否 | 授信明细 |
| useEnterprise | string | 否 | 否 | 使用企业id|code|name 示例：测试专用 |
| creditVarieties | string | 否 | 否 | 授信类别id|code|name 示例：授信类别 |
| creditVarietiesLimit | string | 否 | 否 | 授信类别限额 示例：10000 |
| finProducts | string | 否 | 否 | 金融产品id|code|name 示例：银行贷款 |
| finProductsLimit | string | 否 | 否 | 金融产品限额 示例：10000 |
| exclusive | string | 否 | 否 | 是否专享；枚举：否-0，是-1 示例：0 默认值：0 |
| backup | string | 否 | 否 | 备注 示例：备注 |

## 3. 请求示例

Url: /yonbip/ctm/camCreditChangeOpenApi/creditChangeAdd?access_token=访问令牌
Body: {
	"changeAgreementNum": "变更协议号",
	"changeReasons": "变更原因",
	"accentity": "测试专用",
	"agreementNo": "协议号",
	"relatedHead": "总授信",
	"creditQuota": "1000",
	"creditStart": "2025-03-26",
	"creditEnd": "2026-03-26",
	"creditTerm": 1,
	"creditTermType": 0,
	"guaranteeType": "0",
	"creditOpenQuota": "1000",
	"controlMode": 0,
	"creditEmployMode": 1,
	"waveScale": "10",
	"backup": "备注",
	"creditChange_b": [
		{
			"useEnterprise": "测试专用",
			"creditVarieties": "授信类别",
			"creditVarietiesLimit": "10000",
			"finProducts": "银行贷款",
			"finProductsLimit": "10000",
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
| statusMsg | string | 否 | statusMsg 示例：保存成功 |
| _realtype | string | 否 | _realtype 示例：true |
| _entityName | string | 否 | _entityName 示例：cam.creditchange.CreditChange |
| _keyName | string | 否 | _keyName 示例：id |
| trustedTarget | string | 否 | trustedTarget 示例：1525652227072458756 |
| backup | string | 否 | backup 示例：hhhhhhhhhhh |
| showCreditTerm | string | 否 | showCreditTerm 示例：1年 |
| code | string | 否 | code 示例：CAMCHAN202310120162 |
| createMethod | string | 否 | createMethod 示例：5 |
| creatorId | string | 否 | creatorId 示例：1525641755939569667 |
| agreementCode | string | 否 | agreementCode 示例：测试银团3-1 |
| creditTermType | long | 否 | creditTermType 示例：0 |
| occupiedQuota | long | 否 | occupiedQuota 示例：0 |
| accentity | string | 否 | accentity 示例：1525653687361339397 |
| changeReasons | string | 否 | changeReasons 示例：1233333 |
| creditType | long | 否 | creditType 示例：1 |
| vouchdate | string | 否 | vouchdate 示例：2023-10-12 00:00:00 |
| relatedAgreementPubs | string | 否 | relatedAgreementPubs 示例：1697082000000 |
| creditEnd | string | 否 | creditEnd 示例：2022-03-10 00:00:00 |
| creditSource | string | 否 | creditSource 示例：2910129489830144 |
| creditQuota | double | 否 | creditQuota 示例：59999.3 |
| creditTerm | long | 否 | creditTerm 示例：1 |
| residueAvailableQuota | double | 否 | residueAvailableQuota 示例：59999.3 |
| changeAgreementNum | string | 否 | changeAgreementNum 示例：camchan123dsfasd1214 |
| currency | string | 否 | currency 示例：1525643705855773169 |
| id | string | 否 | id 示例：1837516116031176710 |
| pubts | string | 否 | pubts 示例：2023-10-12 20:50:31 |
| tenant | long | 否 | tenant 示例：2909930715861584 |
| createDate | string | 否 | createDate 示例：2023-10-12 00:00:00 |
| controlMode | long | 否 | controlMode 示例：1 |
| creator | string | 否 | creator 示例：测试管理员111 |
| isWfControlled | boolean | 否 | isWfControlled 示例：false |
| basebilltype | long | 否 | basebilltype 示例：102 |
| creditStart | string | 否 | creditStart 示例：2021-03-10 00:00:00 |
| bustype | string | 否 | bustype 示例：2538803834163712 |
| creditOrganAcc | string | 否 | creditOrganAcc 示例：1553115673901137927 |
| guaranteeType | string | 否 | guaranteeType 示例：0,1 |
| createTime | string | 否 | createTime 示例：2023-10-12 20:50:30 |
| agreementNo | string | 否 | agreementNo 示例：1820311516427583498 |
| changeStatus | long | 否 | changeStatus 示例：1 |
| creditEmployMode | long | 否 | creditEmployMode 示例：1 |
| status | long | 否 | status 示例：0 |
| _status | string | 否 | _status 示例：Unchanged |
| traceId | string | 否 | traceId 示例：28181feaf419ba42 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"statusMsg": "保存成功",
		"_realtype": "true",
		"_entityName": "cam.creditchange.CreditChange",
		"_keyName": "id",
		"trustedTarget": "1525652227072458756",
		"backup": "hhhhhhhhhhh",
		"showCreditTerm": "1年",
		"code": "CAMCHAN202310120162",
		"createMethod": "5",
		"creatorId": "1525641755939569667",
		"agreementCode": "测试银团3-1",
		"creditTermType": 0,
		"occupiedQuota": 0,
		"accentity": "1525653687361339397",
		"changeReasons": "1233333",
		"creditType": 1,
		"vouchdate": "2023-10-12 00:00:00",
		"relatedAgreementPubs": "1697082000000",
		"creditEnd": "2022-03-10 00:00:00",
		"creditSource": "2910129489830144",
		"creditQuota": 59999.3,
		"creditTerm": 1,
		"residueAvailableQuota": 59999.3,
		"changeAgreementNum": "camchan123dsfasd1214",
		"currency": "1525643705855773169",
		"id": "1837516116031176710",
		"pubts": "2023-10-12 20:50:31",
		"tenant": 2909930715861584,
		"createDate": "2023-10-12 00:00:00",
		"controlMode": 1,
		"creator": "测试管理员111",
		"isWfControlled": false,
		"basebilltype": 102,
		"creditStart": "2021-03-10 00:00:00",
		"bustype": "2538803834163712",
		"creditOrganAcc": "1553115673901137927",
		"guaranteeType": "0,1",
		"createTime": "2023-10-12 20:50:30",
		"agreementNo": "1820311516427583498",
		"changeStatus": 1,
		"creditEmployMode": 1,
		"status": 0,
		"_status": "Unchanged"
	},
	"traceId": "28181feaf419ba42"
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

