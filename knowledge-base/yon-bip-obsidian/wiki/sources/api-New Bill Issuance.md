---
title: "票据签发新增"
apiId: "1982696292889395205"
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

# 票据签发新增

> `ContentType	application/json` 请求方式	POST | 分类: Bill Registration (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/api/signnote/signnoteadd

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
| accentity | string | 否 | 是 | 会计主体 示例：北京分公司 |
| record | object | 是 | 是 | 签发数据集合 |
| serialnumber | number |
| 小数位数:0,最大长度:30 | 否 | 是 | 流水号 示例：888888888 |
| reviewstatus | number |
| 小数位数:0,最大长度:1 | 否 | 是 | 审核状态（1保存2提交） 示例：1 |
| elecsignacc | string | 否 | 否 | 电票账号 示例：6825621542563541 |
| iselec | boolean | 否 | 否 | 是否直联 示例：true |
| elecinvoicemode | string | 否 | 是 | 出票方式(01 授信开票 02 质押开票 03 其他 04 票据池开票) 示例：01 |
| newNoteFlag | boolean | 否 | 是 | 是否新一代票 示例：true |
| ifsepFlow | boolean | 否 | 是 | 能否分包流转 示例：true |
| noteno | string | 否 | 否 | 票号 示例：584383191058438319105843831913 |
| notetype | string | 否 | 是 | 票据类型 示例：电子银行承兑 |
| notemoney | number |
| 小数位数:2,最大长度:28 | 否 | 是 | 票面金额 示例：66666.66 |
| paymenttermtype | number |
| 小数位数:-1,最大长度:1 | 否 | 否 | 承诺付款期类型(1 确定日期 2 出票日期+付款期 3付款期限) 示例：1 |
| paymentDate | number |
| 小数位数:0,最大长度:4 | 否 | 否 | 付款期(正整数，如果为空，根据票据类型自动带出) 示例：3 |
| payperiodunit | number |
| 小数位数:-1,最大长度:1 | 否 | 否 | 付款期单位(0 年 1 月 2 日) 示例：0 |
| invoicedate | date |
| 格式:yyyy-MM-dd | 否 | 否 | 出票日期，以下场景必填 1、如果承诺付款日类型=指定出票日期+付款期限； 2、票号不为空且票据大类≠债权凭证 对于是否直联=是，校验出票日期>=当前系统日期。 示例：2024-05-01 |
| applydate | date |
| 格式:yyyy-MM-dd | 否 | 否 | 签发日期(票据签发单的签发日期，如果签发日期有值按签发日期赋值，无值按当前系统日期赋值) 示例：2024-05-01 |
| enddate | date |
| 格式:yyyy-MM-dd | 否 | 否 | 到期日期(1、如果承诺付款日类型=确定日期； 2、票号不为空) 示例：2025-05-01 |
| istransfer | number |
| 小数位数:-1,最大长度:1 | 否 | 是 | 是否可转让(1:可再转让 0:不得转让) 示例：1 |
| invoiceroles | number |
| 小数位数:0,最大长度:1 | 否 | 否 | 出票方(默认：4 内部单位) 示例：4 默认值：4 |
| invoicerbyorg | string | 否 | 否 | 出票人(会计主体参照名称) 示例：会计主体参照名称 |
| invoicerbankacc | string | 否 | 否 | 出票人账号 (企业银行账号参照) 示例：852563254125362145 |
| elecinvoiceaccname | string | 否 | 否 | 出票人账户名称(企业银行账号参照，无需传，根据出票人账号自动带出) 示例：出票人账户名称 |
| invoiceOpenbankname | string | 否 | 否 | 出票人开户行(银行网点参照) 示例：出票人开户行 |
| issuercreditcode | string | 否 | 否 | 出票人统一社会信用代码（无需传，根据出票人账号自动带出） 示例：25120 |
| acceptanceroles | number |
| 小数位数:-1,最大长度:1 | 否 | 否 | 承兑方(1 客户 2 供应商 3 其他 4 银行 5 内部单位 6 资金伙伴,枚举。票据大类≠债权凭证时必填；票据大类=银行汇票，承兑方必须为银行；票据大类=商业汇票，承兑方可以为本企业、资金伙伴、客户、供应商、其他) 示例：1 |
| acceptor | string | 否 | 否 | 承兑人(按名称+承兑方转成对象，参照导入逻辑，票据大类=债权凭证或者非直连时非必填。如果为空，按界面逻辑带出（商票并且当对方为本企业时带出出票人，银票带出出票人开户行）) 示例：承兑人 |
| acceptoraccount | string | 否 | 否 | 承兑人账号 (票据大类为非债权凭证，同时是否直联为是且承兑方≠银行必填，如果为空，按界面逻辑带出（商票并且当对方为本企业时带出出票人账号，银票为空）) 示例：8888888888888 |
| acceptorname | string | 否 | 否 | 承兑人账户名称 (票据大类为非债权凭证，同时是否直联为是且承兑方≠银行必填，如果为空，按界面逻辑带出（商票并且当对方为本企业时带出出票人账户名称，银票为空）) 示例：王小二 |
| acceptorbank | string | 否 | 否 | 承兑人开户行（票据大类为非债权凭证，同时是否直联为是且承兑方≠银行必填，如果为空，按界面逻辑带出（商票并且当对方为本企业时带出出票人账号开户行，银票带出承兑人），支持传行号/名称） 示例：中国建设银行北京市北清路支行 |
| receiveroles | number |
| 小数位数:-1,最大长度:1 | 否 | 是 | 收票方（1 客户 2 供应商 3 其他 4 内部单位 5 资金伙伴） 示例：1 |
| payee | string | 否 | 否 | 收票人收票方对应档案的编码或者名称（） 示例：收票方对应档案的编码或者名称 |
| elecreceivetype | string | 否 | 否 | 收票人类别（RC00 银行 RC01 企业 RC02 央行 RC03 被代理行 RC04 财务公司，枚举，收票方为其他是收票人类别必填） 示例：RC00 |
| payeeaccount | string | 否 | 否 | 收票人账号（如果是否直联=否或者票据大类=债权凭证，则非必填） 示例：收票人账号 |
| elecreceiveaccname | string | 否 | 否 | 收票人账户名称（是否直联=否，或者票据大类=债权凭证，则非必填） 示例：收票人账户名称 |
| receiveOpenbankname | string | 否 | 否 | 收票人开户行（是否直联=否，或者票据大类=债权凭证，则非必填，转成银行网点参照，支持传行号/名称） 示例：收票人开户行 |
| payeecreditcode | string | 否 | 否 | 收票人统一社会信用代码（为空时按页面逻辑赋值，债权凭证且是否直联=是时必填） 示例：收票人统一社会信用代码 |
| nextmerchantdesignated | boolean | 否 | 否 | 是否指定下一手客商（是/否，票据大类=债权凭证时可以有值 ） 示例：false |
| designatedparty | number |
| 小数位数:-1,最大长度:1 | 否 | 否 | 被指定方（1 客户 2 供应商 3 其他 5 资金伙伴，枚举,“是否指定下一手客商”为是时必填，枚举） 示例：1 |
| designatedperson | string | 否 | 否 | 被指定人（按名称+被指定方转成对象,“是否指定下一手客商”为是时必填） 示例：被指定人 |
| designatedpersoncreditcode | string | 否 | 否 | 被指定人统一社会信用代码（“是否指定下一手客商”为是且是否直联=是时必填） 示例：被指定人统一社会信用代码 |
| interestpaymentmode | number |
| 小数位数:-1,最大长度:1 | 否 | 否 | 付息模式（0 卖方付息 1 买方付息） 示例：0 |
| contractno | string | 否 | 否 | 交易合同号 示例：交易合同号 |
| invoiceno | string | 否 | 否 | 发票号码 示例：发票号码 |
| acceptanceno | string | 否 | 否 | 承兑协议号 示例：承兑协议号 |
| securityflag | boolean | 否 | 否 | 是否有保证金 示例：true |
| paymentway | number |
| 小数位数:-1,最大长度:1 | 否 | 否 | 保证金付款方式（1 主动付款 2 对方扣款 3 不结算，保证金为是必填） 示例：1 |
| securitymoney | number |
| 小数位数:1,最大长度:28 | 否 | 否 | 保证金金额（保证金为是必填） 示例：888.5 |
| securityaccount | string | 否 | 否 | 保证金账号（保证金付款方式=主动付款时必填） 示例：保证金账号 |
| transoutaccount | string | 否 | 否 | 保证金转出银行账号（保证金为是必填） 示例：保证金转出银行账号 |
| settlemodesec | string | 否 | 否 | 保证金结算方式（保证金付款方式≠不结算时必填，根据结算方式名称查询结算方式参照主键） 示例：结算方式参照名称或编码 |
| securitySettlementStatus | string | 否 | 否 | 保证金结算状态（1 结算中 2 结算成功 3 结算失败） 示例：1 |
| poundageflag | boolean | 否 | 否 | 是否有手续费（） 示例：true |
| poundageamount | number |
| 小数位数:1,最大长度:28 | 否 | 否 | 手续费金额（是否有手续费为是必填） 示例：666.66 |
| poundageaccount | string | 否 | 否 | 手续费账号 示例：手续费账号 |
| settlemodepound | string | 否 | 否 | 手续费结算方式（结算方式参照） 示例：结算方式参照名称或编码 |
| agreementId_agreementNo | string | 否 | 否 | 已弃用，请使用credits参数传入 示例：授信协议号 |
| agreementId_creditOrganName | string | 否 | 否 | 已弃用，请使用credits参数传入 示例：授信机构 |
| agreementId_creditVarieties_name | string | 否 | 否 | 已弃用，请使用credits参数传入 示例：授信类别 |
| agreementamount | number |
| 小数位数:1,最大长度:28 | 否 | 否 | 已弃用，请使用credits参数传入 示例：553.66 |
| contractId_contractCode | string | 否 | 否 | 已弃用，请使用contracts参数传入 示例：担保合同编号 |
| contractamount | number |
| 小数位数:1,最大长度:28 | 否 | 否 | 已弃用，请使用contracts参数传入 示例：88.88 |
| billPool | string | 否 | 否 | 票据池协议编号（当出票方式=票据池开票时必填） 示例：票据池协议编号 |
| description | string | 否 | 否 | 备注 示例：备注 |
| org | string | 否 | 否 | 业务组织 示例：业务组织 |
| dept | string | 否 | 否 | 部门 示例：部门 |
| operator | string | 否 | 否 | 业务员 示例：业务员 |
| costproject | string | 否 | 否 | 费用项目 示例：费用项目 |
| project | string | 否 | 否 | 项目 示例：项目 |
| WBS | string | 否 | 否 | WBS 示例：WBS |
| activity | string | 否 | 否 | 活动 示例：活动 |
| filename | string | 否 | 否 | 附件名称（附件名称需要带后缀，附件名称和附件同时不为空才会上传） 示例：票据签发附件.pdf |
| filetext | string | 否 | 否 | 附件(BASE64，转成附件挂在单据上) |
| drftNoteInformationDef | object | 否 | 否 | 特征（json格式drftNoteInformationDef:{特征的key：特征的value}） 示例：{key:value,key1:value} |
| credits | object | 是 | 否 | 授信信息 |
| contracts | object | 是 | 否 | 担保信息 |

## 3. 请求示例

Url: /yonbip/ctm/api/signnote/signnoteadd?access_token=访问令牌
Body: {
	"accentity": "北京分公司",
	"record": [
		{
			"serialnumber": 888888888,
			"reviewstatus": 1,
			"elecsignacc": "6825621542563541",
			"iselec": true,
			"elecinvoicemode": "01",
			"newNoteFlag": true,
			"ifsepFlow": true,
			"noteno": "584383191058438319105843831913",
			"notetype": "电子银行承兑",
			"notemoney": 66666.66,
			"paymenttermtype": 1,
			"paymentDate": 3,
			"payperiodunit": 0,
			"invoicedate": "2024-05-01",
			"applydate": "2024-05-01",
			"enddate": "2025-05-01",
			"istransfer": 1,
			"invoiceroles": 4,
			"invoicerbyorg": "会计主体参照名称",
			"invoicerbankacc": "852563254125362145",
			"elecinvoiceaccname": "出票人账户名称",
			"invoiceOpenbankname": "出票人开户行",
			"issuercreditcode": "25120",
			"acceptanceroles": 1,
			"acceptor": "承兑人",
			"acceptoraccount": "8888888888888",
			"acceptorname": "王小二",
			"acceptorbank": "中国建设银行北京市北清路支行",
			"receiveroles": 1,
			"payee": "收票方对应档案的编码或者名称",
			"elecreceivetype": "RC00",
			"payeeaccount": "收票人账号",
			"elecreceiveaccname": "收票人账户名称",
			"receiveOpenbankname": "收票人开户行",
			"payeecreditcode": "收票人统一社会信用代码",
			"nextmerchantdesignated": false,
			"designatedparty": 1,
			"designatedperson": "被指定人",
			"designatedpersoncreditcode": "被指定人统一社会信用代码",
			"interestpaymentmode": 0,
			"contractno": "交易合同号",
			"invoiceno": "发票号码",
			"acceptanceno": "承兑协议号",
			"securityflag": true,
			"paymentway": 1,
			"securitymoney": 888.5,
			"securityaccount": "保证金账号",
			"transoutaccount": "保证金转出银行账号",
			"settlemodesec": "结算方式参照名称或编码",
			"securitySettlementStatus": "1",
			"poundageflag": true,
			"poundageamount": 666.66,
			"poundageaccount": "手续费账号",
			"settlemodepound": "结算方式参照名称或编码",
			"agreementId_agreementNo": "授信协议号",
			"agreementId_creditOrganName": "授信机构",
			"agreementId_creditVarieties_name": "授信类别",
			"agreementamount": 553.66,
			"contractId_contractCode": "担保合同编号",
			"contractamount": 88.88,
			"billPool": "票据池协议编号",
			"description": "备注",
			"org": "业务组织",
			"dept": "部门",
			"operator": "业务员",
			"costproject": "费用项目",
			"project": "项目",
			"WBS": "WBS",
			"activity": "活动",
			"filename": "票据签发附件.pdf",
			"filetext": "",
			"drftNoteInformationDef": {
				"key": "value",
				"key1": "value"
			},
			"credits": [
				{
					"agreementId_agreementNo": "",
					"agreementId_creditOrganName": "",
					"agreementId_creditVarieties_name": "",
					"agreementId_financeProduct_productName": "",
					"ratetype_name": "",
					"rate": 0,
					"agreementamount": 0
				}
			],
			"contracts": [
				{
					"contractId_contractCode": "",
					"contractamount": 0
				}
			]
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

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-12-12

新增

请求参数 (11)

更新

请求参数 (19)

2	2025-09-24

更新

请求说明


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

