---
title: "新增开函登记"
apiId: "1837457111885807623"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "L/G Issuing Registration"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, L/G Issuing Registration]
platform_version: "BIP"
source_type: community-api-docs
---

# 新增开函登记

> `ContentType	application/json` 请求方式	POST | 分类: L/G Issuing Registration (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/lgmOpenApi/addGuaranteeRegisterSingle

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
| accentity | string | 否 | 是 | 会计主体名称 示例：冰露 |
| guaranteeNumber | string | 否 | 是 | 保函编号 示例：BH20210924001 |
| guaranteeOpenDate | Date | 否 | 是 | 开函日期 示例：2021-09-16 |
| guaranteeTypeName | string | 否 | 是 | 保函类型 示例：投标保函 |
| agencyNameForOther | string | 否 | 是 | 机构名称 示例：中国工商银行深泽支行 |
| issuingMethod | string | 否 | 是 | 开立方式 mail = 信开 phone = 电开 示例：mail |
| isOpen | string | 否 | 否 | 是否敞口 yes=是 no=否 示例：yes |
| currency | string | 否 | 是 | 币种 示例：美元 |
| guaranteeAmount | BigDecimal | 否 | 是 | 保函金额 示例：100000.50 |
| guaranteeBeginDate | Date | 否 | 是 | 保函开始日期 示例：2021-09-16 |
| guaranteeEndDate | Date | 否 | 是 | 保函结束日期 示例：2021-10-16 |
| isForeign | string | 否 | 否 | 是否涉外 yes=是 no=否 示例：yes |
| transForwardOrg | string | 否 | 否 | 转开转递机构 示例：中国工商银行西安含光路支行 |
| contractType | string | 否 | 是 | 合同类型 1=采购订单 2=采购合同 3=销售合同 4=销售订单 5=融资合同 6=销售信用 other=其他 示例：1 |
| contractNumber | string | 否 | 否 | 合同编号 示例：HT12312ABCFX |
| isAgent | string | 否 | 否 | 代理开函 yes=是 no=否 示例：yes |
| applicantaccid | string | 否 | 否 | 申请人 |
| estimateBasis | string | 否 | 否 | 预估依据 |
| remarks | string | 否 | 否 | 备注 |
| recipientType | string | 否 | 是 | 受益方 1=客户 2=供应商 3=资金业务对象 示例：1 |
| recipientForOhter | string | 否 | 是 | 受益人 示例：哇哈哈 |
| recipientAddress | string | 否 | 否 | 受益方地址 示例：北京市海淀区 |
| recipientPhone | string | 否 | 否 | 受益方联系电话 示例：18599999999 |
| country | string | 否 | 是 | 受益人国家地区 |

## 3. 请求示例

Url: /yonbip/ctm/lgmOpenApi/addGuaranteeRegisterSingle?access_token=访问令牌
Body: {
	"accentity": "冰露",
	"guaranteeNumber": "BH20210924001",
	"guaranteeOpenDate": "2021-09-16",
	"guaranteeTypeName": "投标保函",
	"agencyNameForOther": "中国工商银行深泽支行",
	"issuingMethod": "mail",
	"isOpen": "yes",
	"currency": "美元",
	"guaranteeAmount": 100000.5,
	"guaranteeBeginDate": "2021-09-16",
	"guaranteeEndDate": "2021-10-16",
	"isForeign": "yes",
	"transForwardOrg": "中国工商银行西安含光路支行",
	"contractType": "1",
	"contractNumber": "HT12312ABCFX",
	"isAgent": "yes",
	"applicantaccid": "",
	"estimateBasis": "",
	"remarks": "",
	"recipientType": "1",
	"recipientForOhter": "哇哈哈",
	"recipientAddress": "北京市海淀区",
	"recipientPhone": "18599999999",
	"country": ""
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
| code | string | 否 | code 示例：200 |
| message | string | 否 | message 示例：操作成功 |
| data | object | 否 | data |
| msgs | string | 是 | msgs 示例：[""] |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"msgs": [
			""
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

10000001	传入参数为空

10000002	传入数据存在重复的保函编号,请检查数据

10000003	传入数据存在没有保函编号的记录,请检查数据


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2024-12-12

更新

请求说明

1


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

