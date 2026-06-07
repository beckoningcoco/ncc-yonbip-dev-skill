---
title: "内转协议单个保存"
apiId: "1820269906882461703"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Internal Transfer Agreement"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Internal Transfer Agreement]
platform_version: "BIP"
source_type: community-api-docs
---

# 内转协议单个保存

> `ContentType	application/json` 请求方式	POST | 分类: Internal Transfer Agreement (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/transferProtocol/save

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
| data | object | 否 | 是 | 内转协议请求入参 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| id | long | 否 | 否 | 内转协议主表id 新增时无需填写，修改时必填 示例：2763855623180544 |
| accentity_code | string | 否 | 是 | 资金组织id，或资金组织code 示例：110 |
| project_code | string | 否 | 是 | 项目id，或项目编码 示例：pcode |
| isEnabledType | short | 否 | 是 | 启停用状态（启用：0；停用：1） 示例：0 默认值：0 |
| transferOutAccountAllocation | short | 否 | 是 | 转出账户分配（随前端业务： 0，手工设置账户： 1） 示例：1 默认值：1 |
| enterprisebankaccount_code | string | 否 | 否 | 银行账户ID，或银行账户编码，转出账户分配为手工设置账户时必填 示例：北京用友融联科技有限公司 |
| currency_code | string | 否 | 是 | 币种id，或币种code 示例：CNY |
| code | string | 否 | 否 | 单据编号(以系统编码规则配置为准：系统设置为手工编号时必输，系统设置为自动编号时非必输) 示例：CTM00210708000001 |
| org_code | string | 否 | 否 | 责任主体id，或责任主体e 示例：110 |
| internalTransferProtocolCode | string | 否 | 否 | 内转协议编号 示例：BH0001 |
| contractNo | string | 否 | 否 | 合同号 示例：HT0001 |
| contractName | string | 否 | 否 | 合同名称 示例：HTM0001 |
| description | string | 否 | 否 | 备注 示例：这是一段描述 |
| _status | string | 否 | 是 | 操作标识, Insert:新增、 Update:更新 示例：Update |
| TransfereeInformation | object | 是 | 是 | 内转协议子表 |

## 3. 请求示例

Url: /yonbip/ctm/transferProtocol/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": 2763855623180544,
		"accentity_code": "110",
		"project_code": "pcode",
		"isEnabledType": 0,
		"transferOutAccountAllocation": 1,
		"enterprisebankaccount_code": "北京用友融联科技有限公司",
		"currency_code": "CNY",
		"code": "CTM00210708000001",
		"org_code": "110",
		"internalTransferProtocolCode": "BH0001",
		"contractNo": "HT0001",
		"contractName": "HTM0001",
		"description": "这是一段描述",
		"_status": "Update",
		"TransfereeInformation": [
			{
				"id": 2763855623180545,
				"intoAccentity_code": "ZT00001",
				"expenseitem_code": "ecode",
				"apportionmentMethod": 1,
				"apportionmentRatio": 354,
				"fixedAmount": 1200,
				"enterpriseBankAccount_code": "2412846184550912",
				"description": "这是一段描述",
				"_status": "Update"
			}
		]
	}
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
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| currency_moneyDigit | int | 否 | 币种金额精度 示例：2 |
| currency_priceDigit | int | 否 | 币种价格精度 示例：4 |
| code | string | 否 | 单据编号 示例：NZXY20220524000252 |
| enterprisebankaccount | string | 否 | 银行账户ID 示例：3563453456 |
| isDiscard | short | 否 | 是否废弃（0：否；1：是） 示例：0 |
| modifier | string | 否 | 修改人 示例：yonyou_test |
| internalTransferProtocolCode | string | 否 | 内转协议编号 示例：NZ001 |
| project | string | 否 | 项目id 示例：233323 |
| project_name | string | 否 | 项目名称 示例：TS |
| accentity_name | string | 否 | 会计主体名称 示例：KJZXT |
| contractNo | string | 否 | 合同号 示例：HTH001 |
| accentity | string | 否 | 会计主体ID 示例：2430524000252 |
| isEnabledType | short | 否 | 启停用状态(0:启用；1：停用) 示例：0 |
| modifyTime | string | 否 | 修改时间 示例：2022-05-24 23:04:31 |
| contractName | string | 否 | 合同名称 示例：HTMC001 |
| billtype | short | 否 | 单据类型（118：内转协议） 示例：118 |
| enterprisebankaccount_account | string | 否 | 银行账号 示例：432 |
| currency | string | 否 | 币种ID 示例：4534534 |
| id | string | 否 | 主表ID 示例：345345 |
| dataSources | short | 否 | 数据来源 示例：2 |
| creator | string | 否 | 创建人 示例：yonyou |
| enterprisebankaccount_bank_name | string | 否 | 银行类别 示例：中国银行 |
| currency_name | string | 否 | 币种 示例：人民币 |
| acctOpenType | short | 否 | 开户类型 示例：1 |
| enterprisebankaccount_name | string | 否 | 银行账户名称 示例：123123 |
| accentity_code | string | 否 | 资金组织编码 示例：213123 |
| transferOutAccountAllocation | short | 否 | 转出账户分配（随前端业务： 0，手工设置账户： 1） 示例：12312 |
| createTime | string | 否 | 创建时间 示例：123123 |
| enterprisebankaccount_bankNumber_name | string | 否 | 银行网点 示例：123123 |
| description | string | 否 | 备注 示例：21312312 |
| TransfereeInformation | object | 是 | 内转协议子表 |
| resubmitCheckKey | string | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"currency_moneyDigit": 2,
		"currency_priceDigit": 4,
		"code": "NZXY20220524000252",
		"enterprisebankaccount": "3563453456",
		"isDiscard": 0,
		"modifier": "yonyou_test",
		"internalTransferProtocolCode": "NZ001",
		"project": "233323",
		"project_name": "TS",
		"accentity_name": "KJZXT",
		"contractNo": "HTH001",
		"accentity": "2430524000252",
		"isEnabledType": 0,
		"modifyTime": "2022-05-24 23:04:31",
		"contractName": "HTMC001",
		"billtype": 118,
		"enterprisebankaccount_account": "432",
		"currency": "4534534",
		"id": "345345",
		"dataSources": 2,
		"creator": "yonyou",
		"enterprisebankaccount_bank_name": "中国银行",
		"currency_name": "人民币",
		"acctOpenType": 1,
		"enterprisebankaccount_name": "123123",
		"accentity_code": "213123",
		"transferOutAccountAllocation": 12312,
		"createTime": "123123",
		"enterprisebankaccount_bankNumber_name": "123123",
		"description": "21312312",
		"TransfereeInformation": [
			{
				"intoAccentity": "2435243524352345",
				"apportionmentMethod": 0,
				"enterpriseBankAccount": "4542352220524000252",
				"acctOpenType": "0",
				"description": "这是备注",
				"enterpriseBankAccount_account": "34534534000252",
				"expenseitem": "345353453453455",
				"intoAccentity_code": "1845645620524000252",
				"expenseitem_name": "报销费用",
				"intoAccentity_name": "用友网络",
				"id": "18020220524000252",
				"apportionmentRatio": 20,
				"fixedAmount": 1000,
				"pubts": "2022-05-24 23:04:31",
				"mainid": "2788633340514560"
			}
		],
		"resubmitCheckKey": "OPENAPI_65537be0b2f64738aadac480dbc327d7_0000KY14MIJC0SDERP0000_liu052500199986"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	内转协议明细行上的分摊比例总和不能大于100!	分摊比例总和要小于等于100


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

