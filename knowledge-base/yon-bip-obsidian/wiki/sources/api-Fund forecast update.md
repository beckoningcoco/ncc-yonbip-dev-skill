---
title: "资金预测更新"
apiId: "1825511519322898437"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Reserve Pool"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Reserve Pool]
platform_version: "BIP"
source_type: community-api-docs
---

# 资金预测更新

> `ContentType	application/json` 请求方式	POST | 分类: Reserve Pool (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/fundpredictionpool/openapi/update

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
| data | object | 是 | 是 | data |
| businessSerialNum | string | 否 | 是 | 业务流水号,上游系统传入，作为数据唯一标识，不允许重复 示例：1749064322671181825 |
| sourceBusinessSystem | string | 否 | 是 | 来源业务系统,1、 BIP内部系统按应用服务编码传入 2、 BIP以外的系统按业务系统注册中的业务系统编码传入 示例：资金结算：yonbip-fi-ctmstwb，费用控制：BZFW_FYGL |
| accentityCode | string | 否 | 否 | 资金组织编码和名称必填其一 示例：G002 |
| accentityName | string | 否 | 否 | 资金组织名称 示例：二公司 |
| businessOrg | string | 否 | 否 | 业务组织编码 示例：ZERO |
| departmentCode | string | 否 | 否 | 部门编码 示例：0001 |
| projectCode | string | 否 | 否 | 项目编码 示例：000001 |
| businessDate | Date | 否 | 是 | 单据日期，若为空，默认为当前系统日期 示例：2023-06-15 |
| businessType | string | 否 | 是 | 业务单据类型。1、 BIP内部系统按单据类型枚举值传入 2、 BIP以外的系统按业务系统注册中的业务单据类型编码传入 示例：内部系统枚举：190（营销费用业务核销单）,191(营销费用财务核销单),210(费用付款申请单) |
| businessNum | string | 否 | 是 | 来源业务系统的单据编码 示例：FFD230705000032 |
| businessDetailNum | string | 否 | 是 | 单据明细行编码，如果业务单据存在多行表体明细，需按照业务单据明细的粒度传送 示例：FFD230705000030 |
| transactionType | string | 否 | 否 | 交易类型编码，业务单据明细对应的交易类型，平台交易类型档案编码 示例：cspl_capitalplandraw |
| paymentType | string | 否 | 否 | 款项类型编码，业务单据明细对应的款项类型，平台款项类型档案编码 示例：1 |
| settlementMethod | string | 否 | 否 | 结算方式编码，业务单据明细对应的结算方式编码 示例：system_0001 |
| expenseItem | string | 否 | 否 | 费用项目编码，业务单据明细对应的费用项目，平台费用项目档案编码 示例：0909 |
| contractNum | string | 否 | 否 | 合同编号 示例：0001 |
| contractName | string | 否 | 否 | 合同名称 示例：一合同 |
| oppType | short | 否 | 否 | 对方类型，枚举值：资金业务对象(1)、供应商(2)、 客户(3)、个人(4)、其他(9) 示例：1 |
| oppDocCode | string | 否 | 否 | 对方档案编码 示例：zjywdx-1 |
| oppName | string | 否 | 否 | 对方名称 示例：资金业务对象档案-1 |
| oppAcc | string | 否 | 否 | 对方银行账号 示例：4 |
| oppAccName | string | 否 | 否 | 对方账户名称 示例：资金业务对象账户-1 |
| oppAccType | string | 否 | 否 | 对方银行类别 示例：招商银行 |
| oppAccOpenName | string | 否 | 否 | 对方开户行名 示例：招商银行深圳分行 |
| receiptType | short | 否 | 否 | 收支类型，枚举值：1 收入、2 支出；isBeginReceType 为0必填 示例：1 |
| originCurrency | string | 否 | 是 | 币种 示例：人民币、CNY、2925229555814656 |
| originAmount | string | 否 | 是 | 金额 示例：100.00 |
| exchangeRateType | string | 否 | 否 | 汇率类型编码 示例：01 |
| note | string | 否 | 否 | 备注 |
| planSettlementDate | Date | 否 | 否 | 计划结算日期 示例：2023-07-06 |
| planCycle | short | 否 | 否 | 计划周期，枚举值：年(1)、半年(2)、季度(3)、月(4)、周(5) 示例：4 |
| planProjectCode | string | 否 | 否 | 计划项目编码 示例：G005 |
| businessContrastCode | string | 否 | 否 | 业务对照编码，上游系统可通过接口直接传入对照表中的业务编码，对照表节点位于资金结算-资金计划项目对照表 示例：G005 |
| extra | string | 否 | 否 | 扩展字段，暂无空能，留做后续需求 |
| businessDetailType | string | 否 | 否 | 业务单据明细类型，枚举值：交易成交登记、交易平仓登记、交易交割登记、申购登记、投资赎回、投资收息、投资付费、投资分红、融入登记、融资还本、融资付息、融资付费 示例：100 |
| isBeginReceType | short | 否 | 否 | 是否期初，0否，1是；上游系统未传入时，默认为否，收支类型必传；上游系统传入“是”时，收支类型可为空 示例：0 |
| thisAccNo | string | 否 | 否 | 本方银行账号 示例：11111111 |
| thisCashAccNo | string | 否 | 否 | 本方现金账号 示例：222222 |
| ticketNo | string | 否 | 否 | 票证号 示例：333333 |
| planYearMon | Date | 否 | 否 | 计划年月；传入格式：yyyy-MM-dd，日期传当月1日即可 示例：2023-10-01 |

## 3. 请求示例

Url: /yonbip/ctm/fundpredictionpool/openapi/update?access_token=访问令牌
Body: {
	"data": [
		{
			"businessSerialNum": "1749064322671181825",
			"sourceBusinessSystem": "资金结算：yonbip-fi-ctmstwb，费用控制：BZFW_FYGL",
			"accentityCode": "G002",
			"accentityName": "二公司",
			"businessOrg": "ZERO",
			"departmentCode": "0001",
			"projectCode": "000001",
			"businessDate": "2023-06-15",
			"businessType": "内部系统枚举：190（营销费用业务核销单）,191(营销费用财务核销单),210(费用付款申请单)",
			"businessNum": "FFD230705000032",
			"businessDetailNum": "FFD230705000030",
			"transactionType": "cspl_capitalplandraw",
			"paymentType": "1",
			"settlementMethod": "system_0001",
			"expenseItem": "0909",
			"contractNum": "0001",
			"contractName": "一合同",
			"oppType": 1,
			"oppDocCode": "zjywdx-1",
			"oppName": "资金业务对象档案-1",
			"oppAcc": "4",
			"oppAccName": "资金业务对象账户-1",
			"oppAccType": "招商银行",
			"oppAccOpenName": "招商银行深圳分行",
			"receiptType": 1,
			"originCurrency": "人民币、CNY、2925229555814656",
			"originAmount": "100.00",
			"exchangeRateType": "01",
			"note": "",
			"planSettlementDate": "2023-07-06",
			"planCycle": 4,
			"planProjectCode": "G005",
			"businessContrastCode": "G005",
			"extra": "",
			"businessDetailType": "100",
			"isBeginReceType": 0,
			"thisAccNo": "11111111",
			"thisCashAccNo": "222222",
			"ticketNo": "333333",
			"planYearMon": "2023-10-01"
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
| code | string | 否 | 状态码 示例：“200” |
| message | string | 否 | 状态信息 示例：操作成功 |
| data | string | 否 | 错误信息，为null表示无错误，其他有错误 示例：null |

## 5. 正确返回示例

{
	"code": "“200”",
	"message": "操作成功",
	"data": "null"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	错误信息

10000001	参数为空


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

