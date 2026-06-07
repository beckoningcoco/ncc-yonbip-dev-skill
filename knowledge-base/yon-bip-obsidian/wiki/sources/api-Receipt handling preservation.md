---
title: "收证办理保存"
apiId: "1867928057987727368"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Dealing of L/C Receipt"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Dealing of L/C Receipt]
platform_version: "BIP"
source_type: community-api-docs
---

# 收证办理保存

> `ContentType	application/json` 请求方式	POST | 分类: Dealing of L/C Receipt (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/receiptCertificateOpenApi/saveData

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
| accentity | string | 否 | 是 | 资金组织id 示例：2569943754297600 |
| openingFlag | boolean | 否 | 是 | 期初 示例：true |
| vouchdate | Date | 否 | 是 | 收证日期 示例：2023-11-11 |
| certificateNo | string | 否 | 是 | 信用证编号 示例：23423423423 |
| org | string | 否 | 否 | 业务组织 示例：1524864006176636931 |
| dept | string | 否 | 否 | 部门 示例：1223 |
| employee | string | 否 | 否 | 业务员 示例：23324 |
| busiContact | string | 否 | 否 | 业务联系方式 示例：1232 |
| approvalStatus | short | 否 | 是 | 审批状态：0已保存；1审批中；2已驳回；3审批通过；4已终止 示例：1 |
| certificateStatus | short | 否 | 是 | 信用证状态：1在登记；2已生效；3已闭卷；4已撤证；5改正中；6闭卷中；7撤证中 示例：1 |
| presentationStatus | short | 否 | 是 | 交单状态：1未交单；2在交单；3部分交单；4全部交单 示例：1 |
| sumPresentationAmt | BigDecimal | 否 | 否 | 累计交单金额 示例：11.23 |
| totalReceivedMoney | BigDecimal | 否 | 否 | 累计已收金额(含付费及在途）：期初=“是”时需传，不传则默认为0 示例：12.23 |
| totalPaidMoney | BigDecimal | 否 | 否 | 累计付费金额(含在途)：期初=“是”时需传，不传则默认为0 示例：1.25 |
| sumWritePresAmt | BigDecimal | 否 | 否 | 累计已核销交单金额：期初=“是”时需传，不传则默认为0 示例：1.25 |
| openCertificateBank | string | 否 | 否 | 开证行 示例：1525008248371937285 |
| openWay | short | 否 | 否 | 开证方式：1SWIFT；2信开；3其他电开 示例：2 |
| openCertificateDate | Date | 否 | 是 | 开证日期 示例：2023-11-11 |
| certificateRanger | short | 否 | 是 | 信用证类型：1国际；2国内 示例：1 |
| spotForward | short | 否 | 否 | 信用证期限：1即期信用证；2远期信用证 示例：1 |
| lcmType | string | 否 | 否 | 信用证种类(参照) 示例：1577428556138414080 |
| isCanCancel | boolean | 否 | 否 | 是否可撤销 示例：false |
| isCanTransfer | boolean | 否 | 否 | 是否可转让 示例：true |
| validDate | Date | 否 | 是 | 到期日期 示例：2023-11-11 |
| currency | string | 否 | 是 | 信用证币种 示例：122 |
| certificateAmt | BigDecimal | 否 | 是 | 信用证金额 示例：1.25 |
| amtFloatingWay | short | 否 | 是 | 金额浮动方式：0无；1溢短装；2最大金额 示例：1 |
| maxAmt | BigDecimal | 否 | 否 | 最大金额：金额浮动方式=“最大金额”时，为必填项 示例：1.25 |
| upFloatingRatio | int | 否 | 否 | 上浮比例%：金额浮动方式=“溢短装”时,为必填项 |
| downFloatingRatio | int | 否 | 否 | 下浮比例% ：金额浮动方式=“溢短装”时,为必填项 |
| applicantCustAccount | string | 否 | 否 | 开证人账号（客户） 示例：1235 |
| beneficiary | string | 否 | 是 | 受益人 示例：xXXXX |
| beneficiaryAccount | string | 否 | 否 | 受益人账号 示例：1233 |
| beneficiaryName | string | 否 | 否 | 受益人户名 示例：1222 |
| beneficiaryArea | string | 否 | 否 | 受益人国家地区 示例：2222 |
| beneficiaryAdd | string | 否 | 否 | 受益人地址 示例：xxxxx |
| negotiation | boolean | 否 | 否 | 是否议付 示例：true |
| negotiationDate | Date | 否 | 否 | 议付日期：是否议付=是时需传值 示例：2023-11-11 |
| noticeBank | string | 否 | 否 | 通知行 示例：02112 |
| swfitCode | string | 否 | 否 | 通知行SWFIT码 示例：12345 |
| payWay | short | 否 | 否 | 兑付方式：1即期付款；2承兑；3议付；4延期付款；5混合付款 示例：2 |
| longTermDays | int | 否 | 否 | 远期天数：兑付方式=“承兑、延期付款”时需传值 示例：12 |
| bankType | short | 否 | 否 | 兑用银行类型：1任何银行；2开证行；3通知行；4其他银行 示例：2 |
| negotiatBank | string | 否 | 否 | 兑用银行：兑用银行类型=“其他”时需传值 示例：xxxxx |
| isConfirm | short | 否 | 否 | 保兑指示：1保兑；2可加保兑；3不保兑 示例：1 |
| confirmBank | string | 否 | 否 | 保兑行：保兑指示=“保兑”时需传值 示例：11 |
| beneficiaryFlag | boolean | 否 | 否 | 保兑行是否由受益人指定：保兑指示=“保兑、可加保兑”时需传值 示例：true |
| reimbursementBank | string | 否 | 否 | 偿付行 示例：1235 |
| presentationStartDate | Date | 否 | 否 | 预计交单开始日 示例：2023-11-11 |
| presentationEndDate | Date | 否 | 否 | 预计交单结束日 示例：2023-11-11 |
| isSplitBatch | boolean | 否 | 否 | 是否分批 示例：false |
| isTransshipable | boolean | 否 | 否 | 是否可转运 示例：false |
| shipWay | string | 否 | 否 | 运输方式 示例：25 |
| startPlace | string | 否 | 否 | 起运地 示例：1234456 |
| destination | string | 否 | 否 | 目的地 示例：535 |
| latestShipment | Date | 否 | 否 | 最迟装运 示例：2023-11-11 |
| goodDescription | string | 否 | 否 | 货物/服务描述 示例：23423423423 |
| otherRemark | string | 否 | 否 | 其他备注 示例：1 |
| reccertificaterequired_b | object | 是 | 否 | 单据要求-子表 |
| billType | short | 否 | 否 | 单据类型:0-商业发票;;1-海运提单;2-空运单据;3-装箱单;4-保险单;5-原产地证;6-数量/重量证明;7-质量证明;8-检疫证明;9-受益人证明;10-寄送通知;11-样品报告;12-河运提单;13-铁路运单;14-公路运单;15-邮政收据;16-货物收据;17-其他; 示例：0 |
| billRequired | string | 否 | 否 | 单据要求 示例：12352 |
| clauseDescription | string | 否 | 否 | 条款说明 示例：12352 |
| reccertificateadditional_b | object | 是 | 否 | 附加条款-子表 |
| termDescription | string | 否 | 否 | 条款描述 示例：12352 |
| termNotes | string | 否 | 否 | 条款说明 示例：12352 |
| recCertificateContract_b | object | 是 | 否 | 合同信息-子表 |
| contractCode | string | 否 | 否 | 合同号 示例：12352 |
| contractCurrency | string | 否 | 否 | 合同币种 示例：12352 |
| goodServices | long | 否 | 否 | 物料 示例：12354 |
| orderNumber | string | 否 | 否 | 订单号 示例：12352 |
| orderQuantity | int | 否 | 否 | 订货数量 示例：11 |
| taxUnitPrice | BigDecimal | 否 | 否 | 含税单价 示例：11.11 |
| taxTotalPrice | BigDecimal | 否 | 否 | 含税总金额 示例：11.11 |
| applicantType | short | 否 | 是 | 开证人类型：1客户；2供应商 示例：1 |
| applicanArea | string | 否 | 否 | 申请人国家地区 示例：bf8fafe3-f309-11e8-817e-7cd30abea0c0 |
| showApplicantAddress | string | 否 | 否 | 申请人地址 示例：你猜 |
| totalPayMoney | BigDecimal | 否 | 否 | 累计交单金额(含在途)：期初=“是”时需传，不传则默认为0 |
| applicantSuppAccount | string | 否 | 否 | 开证人账号(供应商) |
| customer | number |
| 小数位数:0,最大长度:50 | 否 | 否 | 开证人客户：当申开征人类型为1是不可为空 |
| supplier | number |
| 小数位数:0,最大长度:50 | 否 | 否 | 开证人供应商：当申开征人类型为2是不可为空 |

## 3. 请求示例

Url: /yonbip/ctm/receiptCertificateOpenApi/saveData?access_token=访问令牌
Body: {
	"accentity": "2569943754297600",
	"openingFlag": true,
	"vouchdate": "2023-11-11",
	"certificateNo": "23423423423",
	"org": "1524864006176636931",
	"dept": "1223",
	"employee": "23324",
	"busiContact": "1232",
	"approvalStatus": 1,
	"certificateStatus": 1,
	"presentationStatus": 1,
	"sumPresentationAmt": 11.23,
	"totalReceivedMoney": 12.23,
	"totalPaidMoney": 1.25,
	"sumWritePresAmt": 1.25,
	"openCertificateBank": "1525008248371937285",
	"openWay": 2,
	"openCertificateDate": "2023-11-11",
	"certificateRanger": 1,
	"spotForward": 1,
	"lcmType": "1577428556138414080",
	"isCanCancel": false,
	"isCanTransfer": true,
	"validDate": "2023-11-11",
	"currency": "122",
	"certificateAmt": 1.25,
	"amtFloatingWay": 1,
	"maxAmt": 1.25,
	"upFloatingRatio": 0,
	"downFloatingRatio": 0,
	"applicantCustAccount": "1235",
	"beneficiary": "xXXXX",
	"beneficiaryAccount": "1233",
	"beneficiaryName": "1222",
	"beneficiaryArea": "2222",
	"beneficiaryAdd": "xxxxx",
	"negotiation": true,
	"negotiationDate": "2023-11-11",
	"noticeBank": "02112",
	"swfitCode": "12345",
	"payWay": 2,
	"longTermDays": 12,
	"bankType": 2,
	"negotiatBank": "xxxxx",
	"isConfirm": 1,
	"confirmBank": "11",
	"beneficiaryFlag": true,
	"reimbursementBank": "1235",
	"presentationStartDate": "2023-11-11",
	"presentationEndDate": "2023-11-11",
	"isSplitBatch": false,
	"isTransshipable": false,
	"shipWay": "25",
	"startPlace": "1234456",
	"destination": "535",
	"latestShipment": "2023-11-11",
	"goodDescription": "23423423423",
	"otherRemark": "1",
	"reccertificaterequired_b": [
		{
			"billType": 0,
			"billRequired": "12352",
			"clauseDescription": "12352"
		}
	],
	"reccertificateadditional_b": [
		{
			"termDescription": "12352",
			"termNotes": "12352"
		}
	],
	"recCertificateContract_b": [
		{
			"contractCode": "12352",
			"contractCurrency": "12352",
			"goodServices": 12354,
			"orderNumber": "12352",
			"orderQuantity": 11,
			"taxUnitPrice": 11.11,
			"taxTotalPrice": 11.11
		}
	],
	"applicantType": 1,
	"applicanArea": "bf8fafe3-f309-11e8-817e-7cd30abea0c0",
	"showApplicantAddress": "你猜",
	"totalPayMoney": 0,
	"applicantSuppAccount": "",
	"customer": 0,
	"supplier": 0
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
| code | string | 否 | 状态码 |
| message | string | 否 | 描述信息 |
| data | object | 否 | 返回数据 |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	服务端异常	uri:lcm.receiptcertificate 不是合法实体URI，实体的uri的格式是:a.b.c。请检查代码或者UI模板是否配置错误


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-05-08

更新

请求参数 (21)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

