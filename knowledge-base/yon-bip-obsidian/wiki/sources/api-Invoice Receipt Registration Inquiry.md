---
title: "收票登记查询"
apiId: "2044411562739367944"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Bill Registration"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Bill Registration]
platform_version: "BIP"
source_type: community-api-docs
---

# 收票登记查询

> `ContentType	application/json` 请求方式	POST | 分类: Bill Registration (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/api/register/detail

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
| id | string | 否 | 否 | 收票登记主键 |
| accentityCode | string | 否 | 否 | 会计主体编码 |
| accentityName | string | 否 | 否 | 会计主体名称 |
| gatherDateStart | date |
| 格式:yyyy-MM-dd | 否 | 否 | 收票时间开始 |
| gatherDateEnd | date |
| 格式:yyyy-MM-dd | 否 | 否 | 收票时间结束 |
| noteno | string | 否 | 否 | 票据号 |
| srcFlag | string | 否 | 否 | 收票来源 0:业务收票 2:人工拆分 3:质押拆分 4:解押拆分 5:托收拆分 6:质押入池拆分 7:质押出池拆分 8:背书拆分 9:贴现拆分 示例：9 |
| billTypeName | string | 否 | 否 | 票据类型 |
| invoiceDateStart | date |
| 格式:yyyy-MM-dd | 否 | 否 | 出票时间开始 |
| invoiceDateEnd | date |
| 格式:yyyy-MM-dd | 否 | 否 | 出票时间结束 |
| endDateStart | date |
| 格式:yyyy-MM-dd | 否 | 否 | 到期时间开始 |
| endDateEnd | date |
| 格式:yyyy-MM-dd | 否 | 否 | 到期时间结束 |
| billStatus | string | 否 | 否 | 单据状态(2:已作废，13：在收票，14：已收票) |

## 3. 请求示例

Url: /yonbip/ctm/api/register/detail?access_token=访问令牌
Body: {
	"id": "",
	"accentityCode": "",
	"accentityName": "",
	"gatherDateStart": "2026-06-07",
	"gatherDateEnd": "2026-06-07",
	"noteno": "",
	"srcFlag": "9",
	"billTypeName": "",
	"invoiceDateStart": "2026-06-07",
	"invoiceDateEnd": "2026-06-07",
	"endDateStart": "2026-06-07",
	"endDateEnd": "2026-06-07",
	"billStatus": ""
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
| success | boolean | 否 | 是否成功 示例：true |
| message | string | 否 | 提示信息 示例：如：异常信息 |
| id | string | 否 | 主键 |
| accentityCode | string | 否 | 会计主体编码 |
| accentityName | string | 否 | 会计主体名称 |
| gatherDate | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 收票日期 |
| businessAccountDate | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 业务记账日期 |
| signRefuse | number |
| 小数位数:0,最大长度:10 | 否 | 签收|拒签（1：签收 2：拒收） |
| code | string | 否 | 单据编号 |
| currencyName | string | 否 | 币种 |
| olcCurrencyName | string | 否 | 组织本币 |
| olcRate | number |
| 小数位数:6,最大长度:20 | 否 | 组织本币汇率 |
| noteno | string | 否 | 票据号 |
| billRange | string | 否 | 子票区间 |
| noteMoney | number |
| 小数位数:6,最大长度:20 | 否 | 票据金额 |
| availableMoney | number |
| 小数位数:6,最大长度:20 | 否 | 可用金额 |
| availableRange | string | 否 | 可用区间 |
| oneAvailableMoney | number |
| 小数位数:6,最大长度:20 | 否 | 单笔可操作金额 |
| billType | string | 否 | 票据类型 |
| billbtype | number |
| 小数位数:0,最大长度:10 | 否 | 票据大类( 0:银行汇票 1:商业汇票 2:债权凭证) |
| iselecbill | number |
| 小数位数:0,最大长度:10 | 否 | 票据介质( 1:电子票据 2:纸质票据) |
| srcFlag | number |
| 小数位数:0,最大长度:10 | 否 | 收票来源 0:业务收票 2:人工拆分 3:质押拆分 4:解押拆分 5:托收拆分 6:质押入池拆分 7:质押出池拆分 8:背书拆分 9:贴现拆分 |
| ticketCollectionEnd | boolean | 否 | 收票完成（true: 是，false:否） |
| hasused | boolean | 否 | 已占用（true: 是，false:否） |
| settledate | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 结算成功日期 |
| oripk_register | string | 否 | 业务收票主键 |
| initialRegister | string | 否 | 最初业务收票主键 |
| description | string | 否 | 备注 |
| invoiceDate | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 出票日期 |
| endDate | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 到期日期 |
| istransfer | boolean | 否 | 可转让（true：是 false:否） |
| paybillroles | number |
| 小数位数:0,最大长度:10 | 否 | 付票方（0:资金业务对象 1：客户 2：供应商 3：其他 4：内部单位） |
| payerCode | string | 否 | 付票人编码 |
| ifsepFlow | boolean | 否 | 是否分包流转（true：是 false：否） |
| payerName | string | 否 | 付票人名称 |
| payAcc | string | 否 | 付票账号 |
| invoiceroles | number |
| 小数位数:0,最大长度:10 | 否 | 出票方（1：客户 2：供应商 3：其他 4：内部单位 5：资金业务对象） |
| invoicerCode | string | 否 | 出票人编码 |
| invoicerName | string | 否 | 出票人名称 |
| invoicerbankacc | string | 否 | 出票人账号 |
| invoiceropenbank | string | 否 | 出票人开户行 |
| invoiceropenbanknum | string | 否 | 出票人开户行行号 |
| receiveroles | number |
| 小数位数:0,最大长度:10 | 否 | 收票方（1：客户 2：供应商 3：其他 4：内部单位 5：资金业务对象） |
| receiverCode | string | 否 | 收票人编码 |
| receiverName | string | 否 | 收票人名称 |
| receiverbankacc | string | 否 | 收票人账号 |
| receiveropenbank | string | 否 | 收票人开户行 |
| receiveropenbanknum | string | 否 | 收票人开户行行号 |
| acceptanceroles | number |
| 小数位数:0,最大长度:10 | 否 | 承兑方（1：客户 2：供应商 3：其他 4：银行 5：内部单位 6：资金业务对象） |
| acceptancerCode | string | 否 | 承兑人编码 |
| acceptancerName | string | 否 | 承兑人名称 |
| acceptancerbankacc | string | 否 | 承兑人账号 |
| acceptanceropenbank | string | 否 | 承兑人开户行 |
| acceptanceropenbanknum | string | 否 | 承兑人开户行行号 |
| notedescription | string | 否 | 票据备注 |
| noteStatus | number |
| 小数位数:0,最大长度:10 | 否 | 票据状态（0:已作废 1:无状态 10:在背书 11:已背书 12:在贴现 13:已贴现 14:在托收 15:已托收 16:在兑付 17:已兑付 18:在申请 19:已申请 2:在收票 20:在解押 21:在质押入池 22:已质押入池 23:在解押出池 24:在上收申请 25:已上收申请 26:已部分托收 27:已部分兑付 28:已撤票 3:已收票 31:已解押 32:在冲抵 33:已冲抵 34:在承兑 35:已承兑 4:在质押 5:已质押 6:在签发 7:已签发 8:在付票 9:已付票） |
| billStatus | number |
| 小数位数:0,最大长度:10 | 否 | 单据状态（0:在贴现 1:已贴现 10:已部分兑付 11:在付票 12:已付票 13:在收票 14:已收票 15:在质押 16:已质押 17:在解押 18:已解押 19:在拒收 2:已作废 20:已拒收 3:在托收 4:已部分托收 5:已托收 6:在背书 7:已背书 8:在兑付 9:已兑付） |
| org | string | 否 | 业务组织 |
| project | string | 否 | 项目 |
| activity | string | 否 | 活动 |
| wbs | string | 否 | WBS |
| dept | string | 否 | 部门 |
| operator | string | 否 | 业务员 |
| nameListType | string | 否 | 承兑人名单类型 |
| returnbill | boolean | 否 | 回头票（true：是 false：否） |
| instructStatus | number |
| 小数位数:0,最大长度:10 | 否 | 指令状态（0:未发送 1:发送中 2:发送成功 3:发送失败 4:未知） |
| payResult | string | 否 | 交易结果 |
| respondMsg | string | 否 | 响应信息 |
| elecsignacc | string | 否 | 电票账号 |
| ecdsStatus | string | 否 | 银企联电票状态 |
| circulateflag | string | 否 | 流通标志 |
| extend | object | 否 | 扩展字段Map<String,Object> |
| files | object | 否 | 附件 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"success": true,
		"message": "如：异常信息",
		"id": "",
		"accentityCode": "",
		"accentityName": "",
		"gatherDate": "2026-06-07 12:10:24",
		"businessAccountDate": "2026-06-07 12:10:24",
		"signRefuse": 0,
		"code": "",
		"currencyName": "",
		"olcCurrencyName": "",
		"olcRate": 0,
		"noteno": "",
		"billRange": "",
		"noteMoney": 0,
		"availableMoney": 0,
		"availableRange": "",
		"oneAvailableMoney": 0,
		"billType": "",
		"billbtype": 0,
		"iselecbill": 0,
		"srcFlag": 0,
		"ticketCollectionEnd": true,
		"hasused": true,
		"settledate": "2026-06-07 12:10:24",
		"oripk_register": "",
		"initialRegister": "",
		"description": "",
		"invoiceDate": "2026-06-07 12:10:24",
		"endDate": "2026-06-07 12:10:24",
		"istransfer": true,
		"paybillroles": 0,
		"payerCode": "",
		"ifsepFlow": true,
		"payerName": "",
		"payAcc": "",
		"invoiceroles": 0,
		"invoicerCode": "",
		"invoicerName": "",
		"invoicerbankacc": "",
		"invoiceropenbank": "",
		"invoiceropenbanknum": "",
		"receiveroles": 0,
		"receiverCode": "",
		"receiverName": "",
		"receiverbankacc": "",
		"receiveropenbank": "",
		"receiveropenbanknum": "",
		"acceptanceroles": 0,
		"acceptancerCode": "",
		"acceptancerName": "",
		"acceptancerbankacc": "",
		"acceptanceropenbank": "",
		"acceptanceropenbanknum": "",
		"notedescription": "",
		"noteStatus": 0,
		"billStatus": 0,
		"org": "",
		"project": "",
		"activity": "",
		"wbs": "",
		"dept": "",
		"operator": "",
		"nameListType": "",
		"returnbill": true,
		"instructStatus": 0,
		"payResult": "",
		"respondMsg": "",
		"elecsignacc": "",
		"ecdsStatus": "",
		"circulateflag": "",
		"extend": {},
		"files": {
			"fileName": "",
			"fileText": ""
		}
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

1022020403001	参数错误

1022020403500	服务器异常

1022020403004	日期格式错误

1022020403002	参数为空


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-12-04

更新

请求说明

更新

返回参数 (4)

2	2025-08-18

新增

返回参数 success

新增

返回参数 message


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

