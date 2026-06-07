---
title: "资金收款单详情查询"
apiId: "1437908063813107712"
apiPath: "请求方式	GET"
method: "ContentType"
category: "Collection Document"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Collection Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 资金收款单详情查询

> `ContentType` 请求方式	GET | 分类: Collection Document (ctm)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/fi/fundcollection/detail

请求方式	GET

ContentType

应用场景	开放API/集成API

API类别	详情查询

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| code | string | query | 否 | 单据编码code（单据id或单据编码不能同时传递）    示例: FDR20220509000459 |
| id | long | query | 否 | 资金收款单id（单据id或单据编码不能同时传递）    示例: 2766952819151360 |
| fundBillSubPubtsBegin | DateTime | query | 否 | 资金收款单子表时间戳pubts开始时间    示例: 2022-11-01 00:00:00 |
| fundBillSubPubtsEnd | DateTime | query | 否 | 资金收款单子表时间戳pubts截止时间    示例: 2022-11-30 00:00:00 |
| settleStatus | float | query | 否 | 资金收款单子表结算状态(1："待结算", 2："结算中", 3："结算成功", 4："结算止付", 5："部分成功", 6："退票", 7："已结算补单")    示例: 1 |

## 3. 请求示例

Url: /yonbip/fi/fundcollection/detail?access_token=访问令牌&code=FDR20220509000459&id=2766952819151360&fundBillSubPubtsBegin=2022-11-01%2000%3A00%3A00&fundBillSubPubtsEnd=2022-11-30%2000%3A00%3A00&settleStatus=1

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
| message | string | 否 | 调用失败时的错误信息 示例：操作成功 |
| data | object | 否 | 返回的数据 |
| verifystate | string | 否 | 审批状态；0：初始开立，1：审批中，2：审批完成，3：流程终止，4：驳回到制单 示例：0 |
| enterprisebankaccount | string | 否 | 收款银行账户id 示例：2719941813391872 |
| code | string | 否 | 资金收款单号 示例：FDR20220519000022 |
| settlemode | long | 否 | 结算方式ID 示例：2591099436552463 |
| enterprisebankaccount_name | string | 否 | 收款银行账户名称，示例：A公司银行账户 示例：A公司银行账户 |
| creatorId | long | 否 | 创建人ID 示例：2591579673162752 |
| project | string | 否 | 项目id 示例：2591605862453504 |
| enterprisebankaccount_bankNumber_name | string | 否 | 收款银行账户开户行名称，示例：A银行网点 示例：A公司银行账户 |
| description | string | 否 | 备注 示例：银行-+客户 |
| exchRate | double | 否 | 汇率 示例：1 |
| caobject | long | 否 | 收款对象(1：客户，2：供应商，3：员工，4：其他) 示例：1 |
| accentity | string | 否 | 资金组织id 示例：2591580914225408 |
| operator | string | 否 | 业务员id 示例：2687914564882944 |
| vouchdate | string | 否 | 单据日期 示例：2022-05-19 00:00:00 |
| accentityRaw | string | 否 | 核算会计主体id 示例：2591580914225409 |
| natCurrency | string | 否 | 本币币种id 示例：2591342867010560 |
| billtype | long | 否 | 单据类型，0："现金期初日记账未达", 1："销售发票", 2："其它应收事项", 5："订单日报", 6："内部交易结算单", 7："收款单", 8："其它应付事项", 9："客户退款单", 10："付款单", 11："供应商退款单", 12："转账单", 13："汇率损益单", 14："外币兑换单", 15："薪资支付单", 16："银行对账单", 17："资金收款单", 18："资金付款单", 50："应收票据期初", 51："收票登记", 52："银行托收", 53："到期兑付", 54："应付票据期初", 55："票据签发", 56："付票登记", 57："票据贴现", 58："票据背书", 59："付款申请单", 60："资金结算明细", 70："销售费用", 71："供应链费用", 72："销售费用", 73："供应链费用", 72："内部交易待结算单", 74："内部交易待结算单" 示例：17 |
| currency | string | 否 | 币种id 示例：2591342867010560 |
| id | long | 否 | 资金收款单主表ID 示例：2781092214035200 |
| pubts | string | 否 | 时间戳 示例：2022-05-19 15:13:19 |
| tenant | long | 否 | 租户主键 示例：2591339872260352 |
| createDate | string | 否 | 创建日期 示例：2022-05-19 00:00:00 |
| creator | string | 否 | 创建人 示例：曾刚 |
| oriSum | double | 否 | 收款金额 示例：872.97 |
| org | string | 否 | 业务组织id 示例：2591580914225408 |
| isWfControlled | boolean | 否 | 是否审批流控制（true：是，false：否） 示例：false |
| dept | string | 否 | 部门id 示例：2663265966461184 |
| natSum | double | 否 | 本币金额 示例：872.97 |
| srcitem | long | 否 | 事项来源, 9:导入、8:现金管理、1:销售管理、2:B2C订单中心、6:应收应付、7:采购管理、10:费用管理、3:在线商城、4:零售、5:库存、11:总账、12:内部交易、20:第三方 示例：8 |
| voucherstatus | long | 否 | 凭证状态(1：已生成， 2：未生成， 3：已接收未生成， 4：不生成) 示例：2 |
| tradetype | string | 否 | 交易类型id 示例：2571644308067072 |
| exchangeRateType | string | 否 | 汇率类型id 示例：0000KY14MIJC0SDERP0000 |
| expenseitem | long | 否 | 费用项目id 示例：2591608810393856 |
| createTime | string | 否 | 创建时间 示例：2022-05-19 15:13:17 |
| isEnabledBsd | boolean | 否 | 是否启用商业汇票 示例：true |
| status | long | 否 | 审核状态；0 未审核， 1已审核 示例：0 |
| accentity_name | string | 否 | 资金组织 示例：资金组织A |
| FundCollection_b | object | 是 | 资金收款单明细 |
| defines | object | 是 | 资金收款单表头自由自定义项 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"verifystate": "0",
		"enterprisebankaccount": "2719941813391872",
		"code": "FDR20220519000022",
		"settlemode": 2591099436552463,
		"enterprisebankaccount_name": "A公司银行账户",
		"creatorId": 2591579673162752,
		"project": "2591605862453504",
		"enterprisebankaccount_bankNumber_name": "A公司银行账户",
		"description": "银行-+客户",
		"exchRate": 1,
		"caobject": 1,
		"accentity": "2591580914225408",
		"operator": "2687914564882944",
		"vouchdate": "2022-05-19 00:00:00",
		"accentityRaw": "2591580914225409",
		"natCurrency": "2591342867010560",
		"billtype": 17,
		"currency": "2591342867010560",
		"id": 2781092214035200,
		"pubts": "2022-05-19 15:13:19",
		"tenant": 2591339872260352,
		"createDate": "2022-05-19 00:00:00",
		"creator": "曾刚",
		"oriSum": 872.97,
		"org": "2591580914225408",
		"isWfControlled": false,
		"dept": "2663265966461184",
		"natSum": 872.97,
		"srcitem": 8,
		"voucherstatus": 2,
		"tradetype": "2571644308067072",
		"exchangeRateType": "0000KY14MIJC0SDERP0000",
		"expenseitem": 2591608810393856,
		"createTime": "2022-05-19 15:13:17",
		"isEnabledBsd": true,
		"status": 0,
		"accentity_name": "资金组织A",
		"FundCollection_b": [
			{
				"enterprisebankaccount": "2719941813391872",
				"settlemode": 2591099436552463,
				"project": "2591605862453504",
				"description": "摘要1 ",
				"exchRate": 1,
				"caobject": 1,
				"settlestatus": 1,
				"operator": "2687914564882944",
				"quickType": 2590051481424516,
				"oppositeaccountid": "2591591360532740",
				"currency": "2591342867010560",
				"id": 2781092214035201,
				"mainid": 2781092214035200,
				"oppositeaccountname": "客户测试账号1",
				"pubts": "2022-05-19 15:13:18",
				"oppositeobjectid": "2591591360532736",
				"tenant": 2591339872260352,
				"taxSum": 1.8033,
				"oriSum": 120.22,
				"oppositeaccountno": "112233",
				"natSum": 120.22,
				"dept": "2663265966461184",
				"taxCategory": "2591342869926912",
				"oppositeobjectname": "阿里巴巴",
				"exchangeRateType": "0000KY14MIJC0SDERP0000",
				"expenseitem": 2591608810393856,
				"taxRate": 1.5,
				"oppositebankaddr": "中国建设银行股份有限公司高安八景支行",
				"smartcheckno": "",
				"enterprisebankaccount_name": "A公司银行账户",
				"enterprisebankaccount_bankNumber_name": "A银行网点"
			}
		],
		"defines": [
			{
				"define1": "银行-+客户",
				"id": 2781092214035200
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	单据id或单据编码不能同时传递	单据id或单据编码二选一选填


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-01-20

新增

返回参数 (5)

更新

返回参数 (5)

2	2025-04-23

更新

请求说明

更新

返回参数 accentityRaw


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

