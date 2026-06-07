---
title: "归集策略变更接口"
apiId: "2148126407205060608"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Accumulation Policy Change"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Accumulation Policy Change]
platform_version: "BIP"
source_type: community-api-docs
---

# 归集策略变更接口

> `ContentType	application/json` 请求方式	POST | 分类: Accumulation Policy Change (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/fdtr/collectChange/save

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
| requestSeqNo | string | 否 | 是 | 请求流水号（保证唯一性） 示例：req2024110700001 |
| sourceSystem | string | 否 | 是 | 来源系统（CTMFA：资金分析，StwbSettlement：资金结算，ConcentrationOfFunds：资金集中，CapitalPlan：资金计划，ControlOfCash：现金管理，Heterogeneous：异构系统）（外部系统赋值 Heterogeneous 即可） 示例：CTMFA |
| changeFields | string | 否 | 是 | 变更字段，传变更字段编码，如果变更多个字段，用“,”拼接 示例：keepBalance,remark |
| strategyCode | string | 否 | 是 | 策略编码 示例：GJ2024-04-01558280 |
| vouchdate | date |
| 格式:yyyy-MM-dd | 否 | 是 | 单据日期 示例：2024-11-07 |
| reason | string | 否 | 是 | 变更原因 示例：变更留存余额 |
| auditstatus | string | 否 | 是 | 审批状态：目前只支持已通过状态（"1"：待提交；"2"：审批中；"3"：已驳回；"4"：已通过；"5"：已终止；"6"：已作废；） 示例："4" |
| receiverSettleMode | string | 否 | 否 | 收款方结算方式，可输入code或name 示例："system_0001"或者"银行转账" |
| bankAccount | string | 否 | 否 | 银行账户，支持ID、编码、账户号 示例：1526422477916864514 |
| receiveOlcratetype | string | 否 | 否 | 收款方汇率类型，支持ID、编码 示例：0000L6YQ8AVLFUZPXD0000 |
| isAutoExecute | boolean | 否 | 否 | 自动执行（注意：当归集策略的银行资金池为是时，不允许变更） 示例：false |
| exceutionStrategy | number |
| 小数位数:0,最大长度:1 | 否 | 否 | 执行方式（1：定时执行；2：周期执行）（注意：当归集策略的银行资金池为是时，不允许变更） 示例：1 |
| timingCategory | string | 否 | 否 | 定时类别：执行方式为定时执行时必填（d：每日；w：每周；m：每月）（注意：当归集策略的银行资金池为是时，不允许变更） 示例：d |
| weeks | string | 否 | 否 | 执行日期-周几：定时类别为每周时必填（1：周日；2：周一；3：周二；4：周三；5：周四；6：周五；7：周六）（注意：当归集策略的银行资金池为是时，不允许变更） 示例：1 |
| monthDays | string | 否 | 否 | 执行日期-每月第几天：定时类别为每月时必填（1、2、3、4、5、6、7、8、9、10、11、12、13、14、15、16、17、18、19、20、21、22、23、24、25、26、27、28、29、30、31、32）（支持多个，用逗号“,”或分号“;”隔开。其中，32表示“每月最后一天”）（注意：当归集策略的银行资金池为是时，不允许变更） 示例：1;2;31; |
| exceutionDate | string | 否 | 否 | 执行时间：执行方式为定时执行时必填（格式为 HH:mm:ss）（注意：当归集策略的银行资金池为是时，不允许变更） 示例：14:10:08 |
| frequencyType | string | 否 | 否 | 频率类型，执行方式为周期执行时必填（h: 小时；m：分钟）（注意：当归集策略的银行资金池为是时，不允许变更） 示例：h |
| executeFrequency | string | 否 | 否 | 执行频率：执行方式为周期执行时必填（频率类型为小时时取值范围：1、2、3、4、6、8、12；频率类型为分钟时取值范围：5、10、15、20、30）（注意：当归集策略的银行资金池为是时，不允许变更） 示例：1 |
| holidayNoExecute | boolean | 否 | 否 | 节假日不执行（注意：当归集策略的银行资金池为是时，不允许变更） 示例：false |
| collectChangebList | object | 是 | 否 | 归集策略变更子表 |
| changeType | string | 否 | 否 | 变更类型（1：修改；2：新增；3：删除）（如果需要对子表数据进行修改、新增、删除，该字段必填。该字段表示对“变更付款方银行账户”进行的操作） 示例：1 |
| changePaymentAccount | string | 否 | 否 | 变更付款方银行账户（如果需要对子表数据进行修改、删除，该字段必填。用于作为归集策略变更子表的唯一标志。）（支持ID、编码、账户号） 示例：1624297524208074756 |
| paymentAccentity | string | 否 | 否 | 付款方资金组织（子表“变更类型”等于“新增”时，该字段必填）（支持ID、编码） 示例：1624209735062913034 |
| paymentSettleMode | string | 否 | 否 | 付款方结算方式，可输入code或name 示例："system_0001"或者"银行转账" |
| bankEnterprisePay | boolean | 否 | 否 | 是否直联 示例：true |
| paymentAccount | string | 否 | 否 | 付款方银行账户（子表“变更类型”等于“新增”时，该字段必填）（支持ID、编码、账户号） 示例：1624297524208074756 |
| innerAccount | string | 否 | 否 | 内部账户（支持ID、编码、账户号） 示例：1624314618177912837 |
| payOlcratetype | string | 否 | 否 | 付款方汇率类型，支持ID、编码 示例：0000LF13R13GARCYDE0000 |
| collectRule | string | 否 | 否 | 策略规则：（1：固定金额；2：比例调拨；3：留存余额；5：逐笔归集）（子表“变更类型”等于“新增”时，该字段必填） 示例：3 |
| allocateNoColl | string | 否 | 否 | 下拨不归集（0: 否、1: 是） 示例：”0“ |
| inneracctIsbooked | string | 否 | 否 | 内部账户是否记账（0: 否、1: 是） 示例：”1“ |
| collectSum | number |
| 小数位数:8,最大长度:20 | 否 | 否 | 固定金额：策略规则=固定金额时必填 示例：100.00000000 |
| collectProp | number |
| 小数位数:8,最大长度:20 | 否 | 否 | 归集比例：策略规则=比例调拨时必填 示例：3.00000000 |
| keepBalance | number |
| 小数位数:8,最大长度:20 | 否 | 否 | 留存余额：策略规则=留存余额时必填 示例：700.00000000 |
| childOpenStatus | string | 否 | 否 | 启用状态：子策略启用状态（"0"：未启用、"1"：已启用）（子表“变更类型”等于“新增”时，该字段必填） 示例：”1“ |
| remark | string | 否 | 否 | 备注 示例：这是备注 |

## 3. 请求示例

Url: /yonbip/ctm/fdtr/collectChange/save?access_token=访问令牌
Body: [{
	"requestSeqNo": "req2024110700001",
	"sourceSystem": "CTMFA",
	"changeFields": "keepBalance,remark",
	"strategyCode": "GJ2024-04-01558280",
	"vouchdate": "2024-11-07",
	"reason": "变更留存余额",
	"auditstatus": "\"4\"",
	"receiverSettleMode": "\"system_0001\"或者\"银行转账\"",
	"bankAccount": "1526422477916864514",
	"receiveOlcratetype": "0000L6YQ8AVLFUZPXD0000",
	"isAutoExecute": false,
	"exceutionStrategy": 1,
	"timingCategory": "d",
	"weeks": "1",
	"monthDays": "1;2;31;",
	"exceutionDate": "14:10:08",
	"frequencyType": "h",
	"executeFrequency": "1",
	"holidayNoExecute": false,
	"collectChangebList": [
		{
			"changeType": "1",
			"changePaymentAccount": "1624297524208074756",
			"paymentAccentity": "1624209735062913034",
			"paymentSettleMode": "\"system_0001\"或者\"银行转账\"",
			"bankEnterprisePay": true,
			"paymentAccount": "1624297524208074756",
			"innerAccount": "1624314618177912837",
			"payOlcratetype": "0000LF13R13GARCYDE0000",
			"collectRule": "3",
			"allocateNoColl": "”0“",
			"inneracctIsbooked": "”1“",
			"collectSum": 100,
			"collectProp": 3,
			"keepBalance": 700,
			"childOpenStatus": "”1“",
			"remark": "这是备注"
		}
	]
}]

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

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功"
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

