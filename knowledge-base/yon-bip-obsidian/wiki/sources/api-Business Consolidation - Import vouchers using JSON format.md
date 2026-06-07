---
title: "合并报表-使用Json格式导入凭证"
apiId: "2011770343860994050"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Financial Consolidation"
domain: "EPM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Financial Consolidation]
platform_version: "BIP"
source_type: community-api-docs
---

# 合并报表-使用Json格式导入凭证

> `ContentType	application/json` 请求方式	POST | 分类: Financial Consolidation (EPM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/qyjx/vouch/open/importvouch

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
| pkCube | string | 否 | 是 | 应用模型主键（来自于【合并报表获取租户模型接口】接口返回值 cubeId） |
| sysAppCode | string | 否 | 是 | 节点编码，固定值 使用默认值就可以 默认值：BCS09008 |
| data | object | 是 | 是 | 导入的凭证数据 |
| scenario | string | 否 | 是 | 业务方案 |
| year | string | 否 | 是 | 年 |
| period | string | 否 | 是 | 期间 |
| version | string | 否 | 否 | 版本 |
| voucherGroupCode | string | 否 | 是 | 凭证分组编码 |
| safeClassCode | string | 否 | 是 | 安全类编码 |
| vouchCode | string | 否 | 是 | 凭证号 |
| balanceType | string | 否 | 是 | 平衡类型（不平衡、借贷平衡，按主体平衡） 示例：不平衡 |
| voucherAbstract | string | 否 | 否 | 凭证头摘要 |
| lineSummary | string | 否 | 否 | 凭证行摘要 |
| trailCode | string | 否 | 是 | 审计线索编码（<EOAdjs>,<PCAdjs> ,[PAdjs],[Elim],[ConsAdjs]） 示例：<EOAdjs> |
| voucherStatus | string | 否 | 是 | 凭证状态（保存，已提交，已审核，已过账） 示例：保存 |
| con1003 | string | 否 | 否 | 凭证行摘要（业务参数 CON1003） |
| con1004 | string | 否 | 否 | 凭证行摘要（业务参数 CON1004） |
| entityCode | string | 否 | 是 | 主体编码 |
| accountCode | string | 否 | 是 | 科目编码 |
| customerCode | string | 否 | 是 | 客商编码 |
| debitAmt | string | 否 | 否 | 借方金额 |
| creditAmt | string | 否 | 否 | 贷方金额 |
| c1 | string | 否 | 是 | C1 |
| c2 | string | 否 | 是 | C2 |
| c3 | string | 否 | 否 | C3 |
| c4 | string | 否 | 否 | C4 |
| c5 | string | 否 | 否 | C5 |
| c6 | string | 否 | 否 | C6 |
| c7 | string | 否 | 否 | C7 |
| c8 | string | 否 | 否 | C8 |
| c9 | string | 否 | 否 | C9 |
| c10 | string | 否 | 否 | C10 |
| currencyCode | string | 否 | 否 | 币种编码 |
| async | boolean | 否 | 否 | 是否是异步请求。该参数默认为 false ，false 就是同步请求，返回结果同步返回。传 true 为异步请求，接口会返回一个进程 id，使用该进程 id 通过传入【合并报表-长操作结果查询结果】接口，获取返回结果 |

## 3. 请求示例

Url: /yonbip/qyjx/vouch/open/importvouch?access_token=访问令牌
Body: {
	"pkCube": "",
	"sysAppCode": "",
	"data": [
		{
			"scenario": "",
			"year": "",
			"period": "",
			"version": "",
			"voucherGroupCode": "",
			"safeClassCode": "",
			"vouchCode": "",
			"balanceType": "不平衡",
			"voucherAbstract": "",
			"lineSummary": "",
			"trailCode": "<EOAdjs>",
			"voucherStatus": "保存",
			"con1003": "",
			"con1004": "",
			"entityCode": "",
			"accountCode": "",
			"customerCode": "",
			"debitAmt": "",
			"creditAmt": "",
			"c1": "",
			"c2": "",
			"c3": "",
			"c4": "",
			"c5": "",
			"c6": "",
			"c7": "",
			"c8": "",
			"c9": "",
			"c10": "",
			"currencyCode": ""
		}
	],
	"async": true
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 状态码 |
| data | object | 否 | 文件 pk |
| success | string | 否 | 成功状态 示例：success |
| message | string | 否 | 导入状态信息 示例：导入成功 1 条数据! |

## 5. 正确返回示例

{
	"code": "",
	"data": {
		"success": "success",
		"message": "导入成功 1 条数据!"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-04-20

更新

请求说明

新增

请求参数 version

更新

返回参数 code

更新

返回参数 data

删除

返回参数 success


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

