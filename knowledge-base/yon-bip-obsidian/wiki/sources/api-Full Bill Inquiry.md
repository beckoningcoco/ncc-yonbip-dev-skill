---
title: "全部票据查询"
apiId: "2388102736380428294"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Input Tax Invoice Management"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Input Tax Invoice Management]
platform_version: "BIP"
source_type: community-api-docs
---

# 全部票据查询

> `ContentType	application/json` 请求方式	POST | 分类: Input Tax Invoice Management (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/FCC/api/bill/summary/all

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
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 页数 示例：1 默认值：1 |
| pagesize | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 每页数据数 示例：10 默认值：10 |
| searchParam | object | 否 | 否 | 查询参数 |
| nsrsbhs | string | 是 | 否 | 受票企业纳税人识别号 示例：["AAAA"] 最大请求量：100 |
| orgCodes | string | 是 | 否 | 税务组织编码 示例：["bbbb"] 最大请求量：100 |
| billTypes | string | 是 | 否 | 票据类型 示例：["invoice","other"] |
| fplxs | string | 是 | 否 | 发票类型 |
| billNums | string | 是 | 否 | 票据号码 |
| billCodes | string | 是 | 否 | 票据代码 |
| billDateStart | date |
| 格式:yyyy-MM-dd | 否 | 否 | 票据日期起 |
| billDateEnd | date |
| 格式:yyyy-MM-dd | 否 | 否 | 票据日期止 |
| submitDateStart | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 提交日期起始 |
| submitDateEnd | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 提交日期结束 |
| pubtsDateStart | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 更新时间起始 |
| pubtsDateEnd | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 更新时间结束 |
| calculateVerifyPeriodBegin | string | 否 | 否 | 请求参数格式：yyyy-MM |
| calculateVerifyPeriodEnd | string | 否 | 否 | 请求参数格式：yyyy-MM |
| reimburseStatus | string | 是 | 否 | 报账状态：0-未报账，1-报账中,5-部分已报账, 10-已报账 |
| accountStatus | string | 是 | 否 | 记账状态 0-未记账, 5-部分已记账, 10-已记账 |
| precheckStatus | string | 是 | 否 | 预勾选状态： 1. 已勾选 0.未勾选 |
| srcBillcodes | string | 是 | 否 | 业务系统单据号 |
| srcBillids | string | 是 | 否 | 业务系统单据ID |
| mobileOrEmail | string | 否 | 否 | 用户的手机号或邮箱 |
| jshjStart | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 价税合计起 |
| jshjEnd | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 价税合计止 |
| settleStatus | string | 是 | 否 | 采购结算状态（参考枚举档案settleStatus） |
| paymentStatus | string | 是 | 否 | 支付状态（参考枚举档案TaxCollectionPaymentStatus） |
| reimburseMoneyStart | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 累计报账价税合计起 |
| reimburseMoneyEnd | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 累计报账价税合计止 |
| verifyStatus | string | 是 | 否 | 抵扣状态（参考枚举档案taxVerifyStatus） |
| calculateVerifyStatus | string | 是 | 否 | 计算抵扣状态（参考枚举档案taxCalculateVerifyStatus） |
| suspectFlags | string | 是 | 否 | 票据合规标识（参考枚举档案suspectFlag） |
| suspectStatus | string | 是 | 否 | 票据合规处理（参考枚举档案suspectStatus） |
| suspectRule | string | 否 | 否 | 票据合规判定规则 |
| receiveStatuses | string | 是 | 否 | 收票状态（参考枚举档案invoiceReceiveStatus） |
| compareStatuses | string | 是 | 否 | 下载比对状态（参考枚举档案compareStatus） |
| signStatuses | string | 是 | 否 | 验签状态（参考枚举档案signStatus） |
| billStatuses | string | 是 | 否 | 发票状态（参考枚举档案itBillStatus） |
| busiFlags | string | 是 | 否 | 业务标识（参考枚举档案busiFlag） |
| yyVerifyStatuses | string | 是 | 否 | 用友查验状态（参考枚举档案taxYyVerifyStatus） |
| thirdVerifyStatuses | string | 是 | 否 | 第三方查验状态（参考枚举档案taxYyVerifyStatus） |
| faceCompareStatus | string | 是 | 否 | 票面比对状态（参考枚举档案faceCompareStatus） |
| modifyStatuses | string | 是 | 否 | 票面修改状态（参考枚举档案modifyStatus） |
| srcChannels | string | 是 | 否 | 票据来源渠道（参考枚举档案srcChannel） |
| srcSystems | string | 是 | 否 | 票据来源系统（参考枚举档案srcSystem） |
| gatherModels | string | 是 | 否 | 票据采集方式（参考枚举档案gatherModel） |
| sfrzs | string | 是 | 否 | 入账状态（参考枚举档案taxSfrz） |
| rzyts | string | 是 | 否 | 入账用途（参考枚举档案taxRzyt） |
| usageStatus | string | 是 | 否 | 使用状态（参考枚举档案billUsageStatus） |
| taxRebates | string | 是 | 否 | 即征即退标识（参考枚举档案taxRebate） |
| rzsjBegin | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 入账时间起始 |
| rzsjEnd | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 入账时间终止 |
| rzgxsjBegin | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 入账标识下载日期起始 |
| rzgxsjEnd | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 入账标识下载日期终止 |
| receiverMobileOrEmail | string | 否 | 否 | 签收人手机或邮箱 |
| receiverSignTimeStart | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 签收时间起 |
| receiverSignTimeEnd | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 签收时间止 |
| billIds | string | 是 | 否 | 票据id |
| ctgryPeriodDateBegin | string | 否 | 否 | 应税期日期开始（格式yyyy-MM） |
| ctgryPeriodDateEnd | string | 否 | 否 | 应税期日期结束(格式yyyy-MM) |
| submitter | string | 否 | 否 | 保存票据人 |
| deptCode | string | 是 | 否 | 部门编码 |

## 3. 请求示例

Url: /yonbip/FCC/api/bill/summary/all?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pagesize": 10,
	"searchParam": {
		"nsrsbhs": [
			"AAAA"
		],
		"orgCodes": [
			"bbbb"
		],
		"billTypes": [
			"invoice",
			"other"
		],
		"fplxs": [
			""
		],
		"billNums": [
			""
		],
		"billCodes": [
			""
		],
		"billDateStart": "2026-06-07",
		"billDateEnd": "2026-06-07",
		"submitDateStart": "2026-06-07 12:04:21",
		"submitDateEnd": "2026-06-07 12:04:21",
		"pubtsDateStart": "2026-06-07 12:04:21",
		"pubtsDateEnd": "2026-06-07 12:04:21",
		"calculateVerifyPeriodBegin": "",
		"calculateVerifyPeriodEnd": "",
		"reimburseStatus": [
			""
		],
		"accountStatus": [
			""
		],
		"precheckStatus": [
			""
		],
		"srcBillcodes": [
			""
		],
		"srcBillids": [
			""
		],
		"mobileOrEmail": "",
		"jshjStart": 0,
		"jshjEnd": 0,
		"settleStatus": [
			""
		],
		"paymentStatus": [
			""
		],
		"reimburseMoneyStart": 0,
		"reimburseMoneyEnd": 0,
		"verifyStatus": [
			""
		],
		"calculateVerifyStatus": [
			""
		],
		"suspectFlags": [
			""
		],
		"suspectStatus": [
			""
		],
		"suspectRule": "",
		"receiveStatuses": [
			""
		],
		"compareStatuses": [
			""
		],
		"signStatuses": [
			""
		],
		"billStatuses": [
			""
		],
		"busiFlags": [
			""
		],
		"yyVerifyStatuses": [
			""
		],
		"thirdVerifyStatuses": [
			""
		],
		"faceCompareStatus": [
			""
		],
		"modifyStatuses": [
			""
		],
		"srcChannels": [
			""
		],
		"srcSystems": [
			""
		],
		"gatherModels": [
			""
		],
		"sfrzs": [
			""
		],
		"rzyts": [
			""
		],
		"usageStatus": [
			""
		],
		"taxRebates": [
			""
		],
		"rzsjBegin": "2026-06-07 12:04:21",
		"rzsjEnd": "2026-06-07 12:04:21",
		"rzgxsjBegin": "2026-06-07 12:04:21",
		"rzgxsjEnd": "2026-06-07 12:04:21",
		"receiverMobileOrEmail": "",
		"receiverSignTimeStart": "2026-06-07 12:04:21",
		"receiverSignTimeEnd": "2026-06-07 12:04:21",
		"billIds": [
			""
		],
		"ctgryPeriodDateBegin": "",
		"ctgryPeriodDateEnd": "",
		"submitter": "",
		"deptCode": [
			""
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
| code | string | 否 | 状态编码 示例：0000 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| msg | string | 否 | 返回信息 示例：操作成功 |
| datas | object | 否 | 返回数据 |
| recordList | object | 是 | 全部票据信息 |
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 页数 示例：1 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 每页数据数量 示例：10 |
| recordCount | number |
| 小数位数:0,最大长度:10 | 否 | 数据总数 示例：100 |

## 5. 正确返回示例

{
	"code": "0000",
	"msg": "操作成功",
	"datas": {
		"recordList": [
			{
				"id": "",
				"invoiceUniqueCode": "",
				"taxpayerEntityId": "",
				"diworkOrgId": "",
				"outMoney": 0,
				"ytenantId": "",
				"billType": "",
				"fplx": "",
				"billId": "",
				"billCode": "",
				"billNum": "",
				"billDate": "",
				"jshj": 0,
				"se": 0,
				"submitter": "",
				"submitDate": "",
				"submitStatus": "",
				"reimburseStatus": "",
				"settleStatus": "",
				"paymentStatus": "",
				"reimburseMoney": 0,
				"reimburseTax": 0,
				"accountStatus": "",
				"ctgryPeriod": "",
				"suspectFlag": "",
				"suspectStatus": "",
				"suspectRule": "",
				"yyVerifyStatus": "",
				"thirdVerifyStatus": "",
				"receiveStatus": "",
				"compare_status": "",
				"faceCompareStatus": "",
				"signStatus": "",
				"billStatus": "",
				"declareStatus": "",
				"archiveStatus": "",
				"busiFlag": "",
				"modifyStatus": "",
				"srcChannel": "",
				"srcSystem": "",
				"gatherModel": "",
				"srcBilltype": "",
				"srcBillTypeName": "",
				"srcBillcode": "",
				"srcBillid": "",
				"deptId": "",
				"userId": "",
				"billBusinessSummary": "",
				"billSummary": "",
				"precheckStatus": "",
				"precheckUserid": "",
				"precheckTime": "",
				"calculateVerifyStatus": "",
				"calculateVerifyPeriod": "",
				"verifyStatus": "",
				"verifyTime": "2026-06-07 12:04:21",
				"selectPerson": "",
				"sfrz": "",
				"rzyt": "",
				"rzsj": "2026-06-07 12:04:21",
				"rzgxsj": "",
				"receiver": "",
				"receiveTime": "2026-06-07 12:04:21",
				"dzbs": "",
				"occupyJshj": 0,
				"taxRebate": "",
				"usageStatus": "",
				"nsrsbh": "",
				"nsrmc": "",
				"orgName": "",
				"data": {}
			}
		],
		"pageIndex": 1,
		"pageSize": 10,
		"recordCount": 100
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-12-21

更新

请求说明

新增

请求参数 (39)

更新

请求参数 submitDateStart

更新

请求参数 submitDateEnd

友互通鉴权


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

