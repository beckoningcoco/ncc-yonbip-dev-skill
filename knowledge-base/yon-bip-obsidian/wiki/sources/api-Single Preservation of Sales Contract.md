---
title: "销售合同单个保存"
apiId: "53bc242f06fb4c21969c2717f5213274"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Sales Contract"
domain: "SCMSD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Sales Contract]
platform_version: "BIP"
source_type: community-api-docs
---

# 销售合同单个保存

> `ContentType	application/json` 请求方式	POST | 分类: Sales Contract (SCMSD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/sd/sact/save

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
| data | object | 否 | 是 | 销售合同[sact.contract.SalesContract] |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| id | string | 否 | 否 | 主表id,当_status为Update时,必填 |
| salesOrgId | string | 否 | 是 | 销售组织id 示例：1839391506075904 |
| salesOrgId_name | string | 否 | 否 | 销售组织 示例：lcy销售 |
| transactionTypeId | string | 否 | 是 | 合同类型id 示例：2019269036986624 |
| transactionTypeId_name | string | 否 | 否 | 合同类型 示例：lcy标准合同 |
| contractCtrlType | string | 否 | 否 | 合同控制类型：1标准合同，2数量合同，3价格合同，4金额合同 示例：1 |
| name | string | 否 | 否 | 合同名称 示例：1231 |
| code | string | 否 | 是 | 合同编号 示例：SACT20210202000001 |
| contractStatus | long | 否 | 否 | 合同状态,由接口新增的数据默认是开立态，请传值0。 示例：0 |
| status | long | 否 | 否 | 单据状态，由系统业务自动生成，接口无需传值。 示例：0 |
| vouchdate | DateTime | 否 | 是 | 合同日期,格式为:yyyy-MM-dd HH:mm:ss 示例：2021-02-02 00:00:00 |
| agentId | string | 否 | 是 | 客户id 示例：1906217436975360 |
| agentId_name | string | 否 | 否 | 客户 示例：lcy客户0507 |
| receiveContacter | string | 否 | 否 | 客户联系人 示例：刘德华 |
| receiveContacterPhone | string | 否 | 否 | 客户联系电话 示例：17899992222 |
| bussinessTelephone | string | 否 | 否 | 营业电话 示例：123123 |
| bussinessAddress | string | 否 | 否 | 营业地址 示例：12312 |
| deliAddr | string | 否 | 否 | 交货地点id 示例：1906217436991744 |
| deliAddr_address | string | 否 | 否 | 交货地点 示例：3213 |
| invoiceAgentId | string | 否 | 是 | 开票客户id 示例：1906217436975360 |
| invoiceAgentId_name | string | 否 | 否 | 开票客户 示例：lcy客户0507 |
| currency | string | 否 | 是 | 原币 示例：G001ZM0000DEFAULTCURRENCT00000000001 |
| currency_priceDigit | long | 否 | 否 | 原币单价精度 示例：6 |
| currency_moneyDigit | long | 否 | 否 | 原币金额精度 示例：6 |
| currency_priceRount | long | 否 | 否 | 原币单价舍入方式 示例：4 |
| currency_moneyRount | long | 否 | 否 | 原币金额舍入方式 示例：4 |
| currency_code | string | 否 | 否 | 原币简称 示例：CNY |
| currency_name | string | 否 | 否 | 币种 示例：人民币 |
| natCurrency | string | 否 | 是 | 本币 示例：G001ZM0000DEFAULTCURRENCT00000000001 |
| natCurrency_priceDigit | long | 否 | 否 | 本币单价精度 示例：6 |
| natCurrency_moneyDigit | long | 否 | 否 | 本币金额精度 示例：6 |
| natCurrency_priceRount | long | 否 | 否 | 本币单价舍入方式 示例：4 |
| natCurrency_moneyRount | long | 否 | 否 | 本币金额舍入方式 示例：4 |
| natCurrency_code | string | 否 | 否 | 本币简称 示例：CNY |
| natCurrency_name | string | 否 | 否 | 本币 示例：人民币 |
| exchangeRateType | string | 否 | 是 | 汇率类型Id 示例：lzsrm3iy |
| exchangeRateType_name | string | 否 | 否 | 汇率类型 示例：基准汇率 |
| exchangeRateType_digit | long | 否 | 否 | 汇率精度 示例：6 |
| exchRate | number |
| 小数位数:8,最大长度:28 | 否 | 是 | 汇率 示例：1 |
| exchRateOps | number |
| 小数位数:0,最大长度:1 | 否 | 否 | 汇率折算方式 示例：1 |
| saleDepartmentId | string | 否 | 否 | 销售部门id 示例：1904571799147008 |
| planEffectiveDate | string | 否 | 否 | 计划生效日期,格式为:yyyy-MM-dd 示例：2021-02-02 |
| saleDepartmentId_name | string | 否 | 否 | 销售部门 示例：444 |
| salesmanId | string | 否 | 否 | 销售业务员id 示例：1908809846018304 |
| salesmanId_name | string | 否 | 否 | 销售业务员 示例：刘德华 |
| agreement | string | 否 | 否 | 收款协议id 示例：2027785920599296 |
| agreement_name | string | 否 | 否 | 收款协议 示例：合同协议 |
| defines!id | long | 否 | 否 | 表头自定义项id（有自定义项且修改时候必填） 示例：1232143432432 |
| defines!define1 | string | 否 | 否 | 表头自定义项1 示例：大号 |
| defines!define2 | string | 否 | 否 | 表头自定义项2 示例：红色 |
| frees!id | long | 否 | 否 | 表头自由自定义项id（有自定义项且修改时候必填） 示例：543245235423 |
| frees!define1 | string | 否 | 否 | 表头自由自定义项1 示例：发放 |
| frees!define2 | string | 否 | 否 | 表头自由自定义项2 示例：热情 |
| totalPriceTax | number |
| 小数位数:8,最大长度:28 | 否 | 否 | 合计含税金额 示例：14 |
| payMoneyOrigTaxfree | double | 否 | 否 | 合计无税金额 示例：12.389381 |
| totalTax | double | 否 | 否 | 合计税额 示例：1.610619 |
| totalOriReceipts | number |
| 小数位数:8,最大长度:28 | 否 | 否 | 累计已收款金额 示例：0 |
| memo | string | 否 | 否 | 备注 示例：123214 |
| oadayConfirmType | string | 否 | 否 | 出账日确定方式：0.按月、1.按周 示例：0 |
| expiredayConfirmType | string | 否 | 否 | 到期日确定方式：0.按月、1.按周 示例：0 |
| childs | object | 是 | 是 | 合同子表 |
| receiveAgreement | object | 是 | 否 | 收款协议子表 |
| orderExecutes | string | 是 | 否 | 订单执行情况 |
| out_sys_id | string | 否 | 否 | 外部来源线索 示例：1730486466924801 |
| out_sys_code | string | 否 | 否 | 外部来源编码 示例：AAA |
| out_sys_version | string | 否 | 否 | 外部来源版本 示例：3 |
| out_sys_type | string | 否 | 否 | 外部来源类型 示例：SALE |
| settlementId | string | 否 | 否 | 结算方式ID 示例：1906217436975360 |
| settlementId_code | string | 否 | 否 | 结算方式编码 示例：code1 |
| settlementId_name | string | 否 | 否 | 结算方式名称 示例：结算方式1 |
| modifyInvoiceType | number |
| 小数位数:0,最大长度:1 | 否 | 否 | 发票类型可改：0.否、1.是 示例：1 |
| invoiceTitleType | string | 否 | 否 | 抬头类型：0.企业、1.个人、2.非营利组织 示例：0 |
| invoiceTitle | string | 否 | 否 | 发票抬头 示例：1 |
| taxNum | string | 否 | 否 | 纳税识别号 示例：3 |
| bankName | string | 否 | 否 | 开户银行 示例：招商银行 |
| subBankName | string | 否 | 否 | 开户支行 示例：永丰支行 |
| bankAccount | string | 否 | 否 | 银行账号 示例：333 |
| invoiceTelephone | string | 否 | 否 | 发票营业电话 示例：010-647891 |
| invoiceAddress | string | 否 | 否 | 发票营业地址 示例：北京市昌平区 |
| receievInvoiceMobile | string | 否 | 否 | 收票手机号 示例：18856982134 |
| receievInvoiceEmail | string | 否 | 否 | 收票邮箱 示例：10256489@qq.com |
| invoiceTypeId | string | 否 | 否 | 发票类型id 示例：0 |
| _status | string | 否 | 是 | 状态, Insert:新增, Update更新 示例：Insert |

## 3. 请求示例

Url: /yonbip/sd/sact/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": "",
		"salesOrgId": "1839391506075904",
		"salesOrgId_name": "lcy销售",
		"transactionTypeId": "2019269036986624",
		"transactionTypeId_name": "lcy标准合同",
		"contractCtrlType": "1",
		"name": "1231",
		"code": "SACT20210202000001",
		"contractStatus": 0,
		"status": 0,
		"vouchdate": "2021-02-02 00:00:00",
		"agentId": "1906217436975360",
		"agentId_name": "lcy客户0507",
		"receiveContacter": "刘德华",
		"receiveContacterPhone": "17899992222",
		"bussinessTelephone": "123123",
		"bussinessAddress": "12312",
		"deliAddr": "1906217436991744",
		"deliAddr_address": "3213",
		"invoiceAgentId": "1906217436975360",
		"invoiceAgentId_name": "lcy客户0507",
		"currency": "G001ZM0000DEFAULTCURRENCT00000000001",
		"currency_priceDigit": 6,
		"currency_moneyDigit": 6,
		"currency_priceRount": 4,
		"currency_moneyRount": 4,
		"currency_code": "CNY",
		"currency_name": "人民币",
		"natCurrency": "G001ZM0000DEFAULTCURRENCT00000000001",
		"natCurrency_priceDigit": 6,
		"natCurrency_moneyDigit": 6,
		"natCurrency_priceRount": 4,
		"natCurrency_moneyRount": 4,
		"natCurrency_code": "CNY",
		"natCurrency_name": "人民币",
		"exchangeRateType": "lzsrm3iy",
		"exchangeRateType_name": "基准汇率",
		"exchangeRateType_digit": 6,
		"exchRate": 1,
		"exchRateOps": 1,
		"saleDepartmentId": "1904571799147008",
		"planEffectiveDate": "2021-02-02",
		"saleDepartmentId_name": "444",
		"salesmanId": "1908809846018304",
		"salesmanId_name": "刘德华",
		"agreement": "2027785920599296",
		"agreement_name": "合同协议",
		"defines!id": 1232143432432,
		"defines!define1": "大号",
		"defines!define2": "红色",
		"frees!id": 543245235423,
		"frees!define1": "发放",
		"frees!define2": "热情",
		"totalPriceTax": 14,
		"payMoneyOrigTaxfree": 12.389381,
		"totalTax": 1.610619,
		"totalOriReceipts": 0,
		"memo": "123214",
		"oadayConfirmType": "0",
		"expiredayConfirmType": "0",
		"childs": [
			{
				"productClass_name": "食品",
				"productClass": "1730487698084096",
				"skuId_code": "lcysku编码1",
				"oriTax": 0.460177,
				"masterUnitId_precision": 1,
				"productId_name": "lcy物料全",
				"natTax": 0.460177,
				"taxcCodeId": "8b99f589-bc47-4c3a-bf1c-13d47caa20b0",
				"subQty": 0.0435,
				"masterUnitId_name": "个",
				"productId_model": "这是型号！！",
				"cqtUnitId_name": "个",
				"skuId_specs": "颜色:红色;",
				"invPriceExchRate": 1,
				"cqtUnitExchangeType": 0,
				"saleunitId_precision": "4",
				"free1": "红色",
				"finOrgId_name": "lcy销售",
				"id": "",
				"pubts": "",
				"skuId": "1996592658731265",
				"cqtUnitId": "1730486466924800",
				"saleunitId": "1730490635325696",
				"productId_code": "00000572",
				"rowno": "10",
				"cqtUnitId_precision": "1",
				"productId": "1996592658731264",
				"oriSum": 4,
				"skuId_model": "sku红型号",
				"sactVId": "",
				"skuId_name": "lcy物料全红",
				"saleUnitExchangeType": 0,
				"oriUnitPrice": 3.539823,
				"natSum": 4,
				"skuId_modelDescription": "这是规格！！！sku红",
				"taxRate": 13,
				"masterUnitId": "1730486466924800",
				"priceQty": 1,
				"productId_modelDescription": "这是规格！！！",
				"qty": 1,
				"oriTaxUnitPrice": 4,
				"saleunitId_name": "箱",
				"oriMoney": 3.539823,
				"invExchRate": 23,
				"natTaxUnitPrice": 4,
				"finOrgId": "1839391506075904",
				"natMoney": 3.539823,
				"natUnitPrice": 3.539823,
				"defines!id": "432432",
				"defines!define1": "黑色",
				"defines!define2": "小号",
				"defines!pubts": "",
				"frees!id": "865432132",
				"frees!define1": "合同规格",
				"frees!define2": "业务员",
				"frees!pubts": "",
				"_status": "Insert",
				"saleunitId_Precision": 4,
				"cqtUnitId_Precision": 1,
				"out_sys_rowno": "10",
				"out_sys_lineid": "1730486466924800",
				"permitRatio": 0,
				"invExchRateNum": 1,
				"invExchRateDen": 1,
				"invPriceExchRateNum": 1,
				"invPriceExchRateDen": 1
			}
		],
		"receiveAgreement": [
			{
				"order": 1,
				"receiveName": "1",
				"receivePercent": "100",
				"arMoney": 12,
				"accountType": 0,
				"accountDay": 10,
				"accountUnit": 0,
				"preReceive": 0,
				"deposit": 0,
				"receiveStartBase": "1592490250532814886",
				"startBaseDate": "2024-01-01",
				"delayMonths": "0",
				"delayDays": "0",
				"fixedoaday1": 1,
				"fixedoaday2": 2,
				"fixedoaday3": 3,
				"fixedoaday4": 4,
				"accountDate": "2024-01-01",
				"fixedexpireday1": 1,
				"fixedexpireday2": 2,
				"fixedexpireday3": 3,
				"fixedexpireday4": 4,
				"expireDate": "2024-01-01",
				"controlLink": 0,
				"controlOppt": 0,
				"controlMode": 0,
				"preReceiveType": 0,
				"id": "",
				"pubts": "",
				"settleWay": "1906217436975360",
				"settleWay_code": "code1",
				"settleWay_name": "结算方式1",
				"_status": "Insert"
			}
		],
		"orderExecutes": [
			""
		],
		"out_sys_id": "1730486466924801",
		"out_sys_code": "AAA",
		"out_sys_version": "3",
		"out_sys_type": "SALE",
		"settlementId": "1906217436975360",
		"settlementId_code": "code1",
		"settlementId_name": "结算方式1",
		"modifyInvoiceType": 1,
		"invoiceTitleType": "0",
		"invoiceTitle": "1",
		"taxNum": "3",
		"bankName": "招商银行",
		"subBankName": "永丰支行",
		"bankAccount": "333",
		"invoiceTelephone": "010-647891",
		"invoiceAddress": "北京市昌平区",
		"receievInvoiceMobile": "18856982134",
		"receievInvoiceEmail": "10256489@qq.com",
		"invoiceTypeId": "0",
		"_status": "Insert"
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
| salesOrgId | string | 否 | 销售组织id 示例：1839391506075904 |
| salesOrgId_name | string | 否 | 销售组织 示例：lcy销售 |
| transactionTypeId | string | 否 | 合同类型id 示例：2019269036986624 |
| transactionTypeId_name | string | 否 | 合同类型 示例：lcy标准合同 |
| contractCtrlType | long | 否 | 合同控制类型 示例：1 |
| name | string | 否 | 合同名称 示例：1231 |
| code | string | 否 | 合同编号 示例：SACT20210202000001 |
| contractStatus | long | 否 | 合同状态：0开立，1已审核，2已关闭，3审核中，4锁定，5已生效，6已冻结，7已终止 示例：0 |
| status | long | 否 | 单据状态：0开立，1已审核，2已关闭，3审核中，4锁定 示例：0 |
| vouchdate | string | 否 | 合同日期 示例：2021-02-02 00:00:00 |
| agentId | long | 否 | 客户id 示例：1906217436975360 |
| agentId_name | string | 否 | 客户 示例：lcy客户0507 |
| receiveContacter | string | 否 | 客户联系人 示例：刘德华 |
| receiveContacterPhone | string | 否 | 客户联系电话 示例：17899992222 |
| bussinessTelephone | string | 否 | 营业电话 示例：123123 |
| bussinessAddress | string | 否 | 营业地址 示例：12312 |
| deliAddr | long | 否 | 交货地点id 示例：1906217436991744 |
| deliAddr_address | string | 否 | 交货地点 示例：3213 |
| invoiceAgentId | long | 否 | 开票客户id 示例：1906217436975360 |
| invoiceAgentId_name | string | 否 | 开票客户 示例：lcy客户0507 |
| currency | string | 否 | 原币pk 示例：G001ZM0000DEFAULTCURRENCT00000000001 |
| currency_priceDigit | long | 否 | 原币单价精度 示例：6 |
| currency_moneyDigit | long | 否 | 原币金额精度 示例：6 |
| currency_priceRount | long | 否 | 原币单价舍入方式 示例：4 |
| currency_moneyRount | long | 否 | 原币金额舍入方式 示例：4 |
| currency_code | string | 否 | 原币简称 示例：CNY |
| currency_name | string | 否 | 币种 示例：人民币 |
| natCurrency | string | 否 | 本币pk 示例：G001ZM0000DEFAULTCURRENCT00000000001 |
| natCurrency_priceDigit | string | 否 | 本币单价精度 示例：6 |
| natCurrency_moneyDigit | string | 否 | 本币金额精度 示例：6 |
| natCurrency_priceRount | string | 否 | 本币单价舍入方式 示例：4 |
| natCurrency_moneyRount | string | 否 | 本币金额舍入方式 示例：4 |
| natCurrency_code | string | 否 | 本币简称 示例：CNY |
| natCurrency_name | string | 否 | 本币 示例：人民币 |
| exchangeRateType | string | 否 | 汇率类型Id 示例：lzsrm3iy |
| exchangeRateType_name | string | 否 | 汇率类型 示例：基准汇率 |
| exchangeRateType_digit | string | 否 | 汇率精度 示例：6 |
| exchRateOps | number |
| 小数位数:0,最大长度:1 | 否 | 汇率折算方式 示例：1 |
| exchRate | long | 否 | 汇率 示例：1 |
| planEffectiveDate | string | 否 | 计划生效日期 示例：2021-02-02 00:00:00 |
| saleDepartmentId | string | 否 | 销售部门id 示例：1904571799147008 |
| saleDepartmentId_name | string | 否 | 销售部门 示例：444 |
| salesmanId | string | 否 | 销售业务员id 示例：1908809846018304 |
| salesmanId_name | string | 否 | 销售业务员 示例：刘德华 |
| agreement | long | 否 | 收款协议id 示例：2027785920599296 |
| agreement_name | string | 否 | 收款协议 示例：合同协议 |
| totalPriceTax | long | 否 | 合计含税金额 示例：14 |
| payMoneyOrigTaxfree | double | 否 | 合计无税金额 示例：12.389381 |
| totalTax | double | 否 | 合计税额 示例：1.610619 |
| totalOriReceipts | long | 否 | 累计已收款金额 示例：0 |
| childs | object | 是 | 合同标的 |
| skuId_code | string | 否 | SKU编码 示例：lcysku编码1 |
| oriTax | double | 否 | 税额 示例：0.460177 |
| masterUnitId_precision | string | 否 | 主计量单位精度 示例：1 |
| productId_name | string | 否 | 商品名称 示例：lcy物料全 |
| natTax | double | 否 | 本币税额 示例：0.460177 |
| taxcCodeId | string | 否 | 税码 示例：8b99f589-bc47-4c3a-bf1c-13d47caa20b0 |
| subQty | double | 否 | 销售数量 示例：0.0435 |
| masterUnitId_name | string | 否 | 主计量单位 示例：个 |
| productId_model | string | 否 | 型号 示例：这是型号！！ |
| cqtUnitId_name | string | 否 | 计价单位 示例：个 |
| skuId_specs | string | 否 | SKU规格说明 示例：颜色:红色; |
| invPriceExchRate | long | 否 | 计价换算率 示例：1 |
| cqtUnitExchangeType | long | 否 | 固定-浮动（计价） 示例：0 |
| saleunitId_precision | string | 否 | 销售单位精度 示例：4 |
| free1 | string | 否 | 物料规格1 示例：红色 |
| finOrgId_name | string | 否 | 开票组织 示例：lcy销售 |
| id | long | 否 | 子表id 示例：2114336928829696 |
| pubts | string | 否 | 时间戳 示例：2021-02-02 14:54:45 |
| skuId | long | 否 | SKUId 示例：1996592658731265 |
| cqtUnitId | long | 否 | 计价单位id 示例：1730486466924800 |
| saleunitId | long | 否 | 销售单位id 示例：1730490635325696 |
| productId_code | string | 否 | 商品编码 示例：00000572 |
| rowno | long | 否 | 行号 示例：10 |
| cqtUnitId_precision | string | 否 | 计价单位精度 示例：1 |
| productId | long | 否 | 物料id 示例：1996592658731264 |
| oriSum | long | 否 | 含税金额 示例：4 |
| skuId_model | string | 否 | SKU型号 示例：sku红型号 |
| sactVId | long | 否 | 外键 示例：2114336928796928 |
| skuId_name | string | 否 | SKU名称 示例：lcy物料全红 |
| saleUnitExchangeType | long | 否 | 固定-浮动（销售） 示例：0 |
| oriUnitPrice | double | 否 | 无税单价 示例：3.539823 |
| natSum | long | 否 | 本币含税金额 示例：4 |
| skuId_modelDescription | string | 否 | SKU规格描述 示例：这是规格！！！sku红 |
| taxRate | long | 否 | 税率 示例：13 |
| masterUnitId | long | 否 | 主计量单位id 示例：1730486466924800 |
| priceQty | long | 否 | 计价数量 示例：1 |
| productId_modelDescription | string | 否 | 规格说明 示例：这是规格！！！ |
| qty | long | 否 | 主计量数量 示例：1 |
| oriTaxUnitPrice | long | 否 | 含税单价 示例：4 |
| saleunitId_name | string | 否 | 销售单位 示例：箱 |
| oriMoney | double | 否 | 无税金额 示例：3.539823 |
| invExchRate | long | 否 | 销售换算率 示例：23 |
| natTaxUnitPrice | long | 否 | 本币含税单价 示例：4 |
| finOrgId | string | 否 | 开票组织id 示例：1839391506075904 |
| natMoney | double | 否 | 本币无税金额 示例：3.539823 |
| natUnitPrice | double | 否 | 本币无税单价 示例：3.539823 |
| saleunitId_Precision | string | 否 | 销售单位精度 示例：4 |
| cqtUnitId_Precision | string | 否 | 计价单位精度 示例：1 |
| tenant | long | 否 | 租户 示例：1730438231412992 |
| out_sys_rowno | string | 否 | 外部来源行号 示例：10 |
| out_sys_lineid | string | 否 | 外部来源行 示例：1839391506075905 |
| permitRatio | number |
| 小数位数:2,最大长度:10 | 否 | 容差比例% |
| invExchRateNum | number |
| 小数位数:8,最大长度:28 | 否 | 销售换算率分子 示例：1 |
| invExchRateDen | number |
| 小数位数:8,最大长度:28 | 否 | 销售换算率分母 示例：1 |
| invPriceExchRateNum | number |
| 小数位数:8,最大长度:28 | 否 | 计价换算率分子 示例：1 |
| invPriceExchRateDen | number |
| 小数位数:8,最大长度:28 | 否 | 计价换算率分母 示例：1 |
| receiveAgreement | object | 是 | 收款协议 |
| periodId | long | 否 | 收款协议账期ID 示例：2027785920615680 |
| accountDate | string | 否 | 出账日 示例：2021-03-03 00:00:00 |
| agreeOId | long | 否 | 收款历史 示例：2114336928862464 |
| receivePercent | long | 否 | 应收比例 示例：10 |
| controlLink | long | 否 | 控制环节 示例：0 |
| sactVId | long | 否 | 外键 示例：2114336928796928 |
| receiveStartBase | long | 否 | 起算时点id 示例：1989790973121277 |
| preReceive | boolean | 否 | 0无预收，1预收 示例：false |
| startBaseCode | string | 否 | 起算时点编码 示例：ContractBillDate |
| startBaseDate | string | 否 | 起算日 示例：2021-02-02 00:00:00 |
| delayMonths | long | 否 | 起算日延迟月 示例：1 |
| accountDay | long | 否 | 账期 示例：11 |
| receiveName | string | 否 | 阶段名称 示例：1 |
| sourceType | boolean | 否 | 起算时点是否是系统预制 示例：true |
| delayDays | long | 否 | 起算日延迟日 示例：1 |
| receiveStartBase_name | string | 否 | 起算时点 示例：合同单据日期 |
| arMoney | double | 否 | 应收金额 示例：1.4 |
| deposit | boolean | 否 | 有无保证金 示例：false |
| expireDate | string | 否 | 到期日 示例：2021-03-14 00:00:00 |
| id | long | 否 | 子表id 示例：2114336928862464 |
| preReceiveType | long | 否 | 预收折算方式 示例：0 |
| pubts | string | 否 | 时间戳 示例：2021-02-02 14:54:45 |
| order | long | 否 | 期号 示例：1 |
| accentity | string | 否 | 会计主体 示例：1839391506075904 |
| accountUnit | long | 否 | 账期单位 示例：0 |
| tenant | long | 否 | 租户 示例：1730438231412992 |
| id | long | 否 | 主表id 示例：2114336928796928 |
| changestatus | long | 否 | 变更状态 示例：0 |
| creator | string | 否 | 制单人 示例：lcy |
| creatorId | long | 否 | 制单人Id 示例：1838303819272448 |
| createTime | string | 否 | 制单时间 示例：2021-02-02 14:54:45 |
| createDate | string | 否 | 制单日期 示例：2021-02-02 14:54:45 |
| isWfControlled | boolean | 否 | 是否审批流控制 示例：false |
| pubts | string | 否 | 时间戳 示例：2021-02-02 14:54:46 |
| tenant | long | 否 | 租户 示例：1730438231412992 |
| out_sys_id | string | 否 | 外部来源线索 示例：1730438231412991 |
| out_sys_code | string | 否 | 外部来源编码 示例：AAA |
| out_sys_version | string | 否 | 外部来源版本 示例：3 |
| out_sys_type | string | 否 | 外部来源类型 示例：SALE |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"salesOrgId": "1839391506075904",
		"salesOrgId_name": "lcy销售",
		"transactionTypeId": "2019269036986624",
		"transactionTypeId_name": "lcy标准合同",
		"contractCtrlType": 1,
		"name": "1231",
		"code": "SACT20210202000001",
		"contractStatus": 0,
		"status": 0,
		"vouchdate": "2021-02-02 00:00:00",
		"agentId": 1906217436975360,
		"agentId_name": "lcy客户0507",
		"receiveContacter": "刘德华",
		"receiveContacterPhone": "17899992222",
		"bussinessTelephone": "123123",
		"bussinessAddress": "12312",
		"deliAddr": 1906217436991744,
		"deliAddr_address": "3213",
		"invoiceAgentId": 1906217436975360,
		"invoiceAgentId_name": "lcy客户0507",
		"currency": "G001ZM0000DEFAULTCURRENCT00000000001",
		"currency_priceDigit": 6,
		"currency_moneyDigit": 6,
		"currency_priceRount": 4,
		"currency_moneyRount": 4,
		"currency_code": "CNY",
		"currency_name": "人民币",
		"natCurrency": "G001ZM0000DEFAULTCURRENCT00000000001",
		"natCurrency_priceDigit": "6",
		"natCurrency_moneyDigit": "6",
		"natCurrency_priceRount": "4",
		"natCurrency_moneyRount": "4",
		"natCurrency_code": "CNY",
		"natCurrency_name": "人民币",
		"exchangeRateType": "lzsrm3iy",
		"exchangeRateType_name": "基准汇率",
		"exchangeRateType_digit": "6",
		"exchRateOps": 1,
		"exchRate": 1,
		"planEffectiveDate": "2021-02-02 00:00:00",
		"saleDepartmentId": "1904571799147008",
		"saleDepartmentId_name": "444",
		"salesmanId": "1908809846018304",
		"salesmanId_name": "刘德华",
		"agreement": 2027785920599296,
		"agreement_name": "合同协议",
		"totalPriceTax": 14,
		"payMoneyOrigTaxfree": 12.389381,
		"totalTax": 1.610619,
		"totalOriReceipts": 0,
		"childs": [
			{
				"skuId_code": "lcysku编码1",
				"oriTax": 0.460177,
				"masterUnitId_precision": "1",
				"productId_name": "lcy物料全",
				"natTax": 0.460177,
				"taxcCodeId": "8b99f589-bc47-4c3a-bf1c-13d47caa20b0",
				"subQty": 0.0435,
				"masterUnitId_name": "个",
				"productId_model": "这是型号！！",
				"cqtUnitId_name": "个",
				"skuId_specs": "颜色:红色;",
				"invPriceExchRate": 1,
				"cqtUnitExchangeType": 0,
				"saleunitId_precision": "4",
				"free1": "红色",
				"finOrgId_name": "lcy销售",
				"id": 2114336928829696,
				"pubts": "2021-02-02 14:54:45",
				"skuId": 1996592658731265,
				"cqtUnitId": 1730486466924800,
				"saleunitId": 1730490635325696,
				"productId_code": "00000572",
				"rowno": 10,
				"cqtUnitId_precision": "1",
				"productId": 1996592658731264,
				"oriSum": 4,
				"skuId_model": "sku红型号",
				"sactVId": 2114336928796928,
				"skuId_name": "lcy物料全红",
				"saleUnitExchangeType": 0,
				"oriUnitPrice": 3.539823,
				"natSum": 4,
				"skuId_modelDescription": "这是规格！！！sku红",
				"taxRate": 13,
				"masterUnitId": 1730486466924800,
				"priceQty": 1,
				"productId_modelDescription": "这是规格！！！",
				"qty": 1,
				"oriTaxUnitPrice": 4,
				"saleunitId_name": "箱",
				"oriMoney": 3.539823,
				"invExchRate": 23,
				"natTaxUnitPrice": 4,
				"finOrgId": "1839391506075904",
				"natMoney": 3.539823,
				"natUnitPrice": 3.539823,
				"saleunitId_Precision": "4",
				"cqtUnitId_Precision": "1",
				"tenant": 1730438231412992,
				"out_sys_rowno": "10",
				"out_sys_lineid": "1839391506075905",
				"permitRatio": 0,
				"invExchRateNum": 1,
				"invExchRateDen": 1,
				"invPriceExchRateNum": 1,
				"invPriceExchRateDen": 1
			}
		],
		"receiveAgreement": [
			{
				"periodId": 2027785920615680,
				"accountDate": "2021-03-03 00:00:00",
				"agreeOId": 2114336928862464,
				"receivePercent": 10,
				"controlLink": 0,
				"sactVId": 2114336928796928,
				"receiveStartBase": 1989790973121277,
				"preReceive": false,
				"startBaseCode": "ContractBillDate",
				"startBaseDate": "2021-02-02 00:00:00",
				"delayMonths": 1,
				"accountDay": 11,
				"receiveName": "1",
				"sourceType": true,
				"delayDays": 1,
				"receiveStartBase_name": "合同单据日期",
				"arMoney": 1.4,
				"deposit": false,
				"expireDate": "2021-03-14 00:00:00",
				"id": 2114336928862464,
				"preReceiveType": 0,
				"pubts": "2021-02-02 14:54:45",
				"order": 1,
				"accentity": "1839391506075904",
				"accountUnit": 0,
				"tenant": 1730438231412992
			}
		],
		"id": 2114336928796928,
		"changestatus": 0,
		"creator": "lcy",
		"creatorId": 1838303819272448,
		"createTime": "2021-02-02 14:54:45",
		"createDate": "2021-02-02 14:54:45",
		"isWfControlled": false,
		"pubts": "2021-02-02 14:54:46",
		"tenant": 1730438231412992,
		"out_sys_id": "1730438231412991",
		"out_sys_code": "AAA",
		"out_sys_version": "3",
		"out_sys_type": "SALE"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-02-28

新增

请求参数 (5)

更新

请求参数 (27)

新增

返回参数 (5)

更新

返回参数 (6)

BIP-BUG-00010436【日常环境】销售合同单个保存API请求 ,销售换算率和计价换算率 应可以录入小数

2	2025-04-01

新增

请求参数 permitRatio

更新

请求参数 arMoney

新增

返回参数 permitRatio

支持行容差比例


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

