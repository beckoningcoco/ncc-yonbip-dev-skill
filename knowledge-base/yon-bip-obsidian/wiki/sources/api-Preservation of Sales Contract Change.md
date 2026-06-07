---
title: "销售合同变更保存"
apiId: "2387917738376429577"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Sales Contract Change"
domain: "SCMSD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Sales Contract Change]
platform_version: "BIP"
source_type: community-api-docs
---

# 销售合同变更保存

> `ContentType	application/json` 请求方式	POST | 分类: Sales Contract Change (SCMSD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/SCC/revise/save

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	单条保存/更新

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 否 | 是 | 销售合同变更[sact.contractrevise.ContractRevise] |
| id | string | 否 | 否 | 合同变更单id。id、code、sactOid 三者必传其一，当_status为Insert时id不要传，优先级：id>sactOid>code 示例：1910284570205880324 |
| sactOid | string | 否 | 否 | 原销售合同id。id、code、sactOid 三者必传其一，当_status为Insert时id不要传，优先级：id>sactOid>code |
| code | string | 否 | 否 | 单据编码。id、code、sactOid 三者必传其一，当_status为Insert时id不要传，优先级：id>sactOid>code 示例：SACT2024011800000202 |
| _status | string | 否 | 是 | 操作标识。Insert：创建新版本变更单, Update：更新变更中的变更单。 示例：Insert |
| name | string | 否 | 否 | 合同名称 |
| receiveContacterId | string | 否 | 否 | 客户联系人ID，需存在于客户的联系人信息子表中 |
| receiveContacterPhone | string | 否 | 否 | 客户联系电话 示例：17899992222 |
| exchangeRateType | string | 否 | 否 | 汇率类型ID，传id或code 示例：0000LF11UTRA5P7VGH0000 |
| exchRate | string | 否 | 否 | 汇率 示例：1 |
| salesmanId | string | 否 | 否 | 销售业务员ID，传id或code 示例：1680084794281558023 |
| invoiceAgentId | string | 否 | 否 | 开票客户ID，传id或code 示例：1680224423651573767 |
| saleDepartmentId | string | 否 | 否 | 销售部门ID，传id或code 示例：1680078154248486914 |
| receiverCustId | string | 否 | 否 | 收货客户ID，传id或code，需存在于使用组织是当前销售组织的客户业务信息档案中且为启用态 示例：1680224423651573767 |
| planExpirationDate | string | 否 | 否 | 计划失效日期 示例：2024-01-21 00:00:00 |
| settlementId | string | 否 | 否 | 结算方式ID，传id或code，需存在于结算方式档案且为启用态 |
| receiverId | string | 否 | 否 | 收货人ID，需存在于使用组织是当前销售组织，客户为当前收货客户的客户业务信息的地址信息子表中 |
| receiveAddress | string | 否 | 否 | 收货地址 |
| receiveMobile | string | 否 | 否 | 收货电话 |
| planEffectiveDate | string | 否 | 否 | 计划生效日期 |
| memo | string | 否 | 否 | 备注 |
| projectId | string | 否 | 否 | 项目ID，传id或code |
| bussinessTelephone | string | 否 | 否 | 营业电话 |
| bussinessAddress | string | 否 | 否 | 营业地址 |
| modifyInvoiceType | number |
| 小数位数:0,最大长度:1 | 否 | 否 | 发票类型可改， 0：否、1：是 |
| invoiceTypeId | string | 否 | 否 | 发票类型id，传入id或者code，需存在于发票类型档案，且应用范围是“销售”的 |
| invoiceTitleType | string | 否 | 否 | 抬头类型，0：企业、1：个人、2：非营利组织 |
| invoiceTitle | string | 否 | 否 | 发票抬头，传入id或者name，需存在于开票客户的发票信息子表中 |
| taxNum | string | 否 | 否 | 纳税识别号 |
| bankName | string | 否 | 否 | 开户银行，传入id或者code，需存在于银行网点且为启用状态 |
| subBankName | string | 否 | 否 | 开户支行 |
| invoiceTelephone | string | 否 | 否 | 发票营业电话 |
| invoiceAddress | string | 否 | 否 | 发票营业地址 |
| receievInvoiceMobile | string | 否 | 否 | 收票手机号 |
| receievInvoiceEmail | string | 否 | 否 | 收票邮箱 |
| orderPayType | string | 否 | 否 | 支付方式，0：款到发货、1：按款发货、99：其他 |
| pubts | string | 否 | 否 | 时间戳 |
| childs | object | 是 | 否 | 合同标的子表 |
| receiveAgreement | object | 是 | 否 | 收款协议子表 |

## 3. 请求示例

Url: /yonbip/SCC/revise/save?access_token=访问令牌
Body: {
	"data": {
		"id": "1910284570205880324",
		"sactOid": "",
		"code": "SACT2024011800000202",
		"_status": "Insert",
		"name": "",
		"receiveContacterId": "",
		"receiveContacterPhone": "17899992222",
		"exchangeRateType": "0000LF11UTRA5P7VGH0000",
		"exchRate": "1",
		"salesmanId": "1680084794281558023",
		"invoiceAgentId": "1680224423651573767",
		"saleDepartmentId": "1680078154248486914",
		"receiverCustId": "1680224423651573767",
		"planExpirationDate": "2024-01-21 00:00:00",
		"settlementId": "",
		"receiverId": "",
		"receiveAddress": "",
		"receiveMobile": "",
		"planEffectiveDate": "",
		"memo": "",
		"projectId": "",
		"bussinessTelephone": "",
		"bussinessAddress": "",
		"modifyInvoiceType": 0,
		"invoiceTypeId": "",
		"invoiceTitleType": "",
		"invoiceTitle": "",
		"taxNum": "",
		"bankName": "",
		"subBankName": "",
		"invoiceTelephone": "",
		"invoiceAddress": "",
		"receievInvoiceMobile": "",
		"receievInvoiceEmail": "",
		"orderPayType": "",
		"pubts": "",
		"childs": [
			{
				"id": "1910284570205880328",
				"sacoOId": "1910284570205880324",
				"_status": "Update",
				"lineno": "",
				"productId": "1679833349694160901",
				"skuId": "1679833358284095499",
				"productClass": "",
				"taxcCodeId": "11001",
				"masterUnitId": "1679256999440678918",
				"saleunitId": "1679256999440678918",
				"cqtUnitId": "1679256999440678918",
				"qty": "10",
				"subQty": "10",
				"priceQty": "10",
				"invExchRate": "1",
				"invPriceExchRate": "1",
				"finOrgId": "1680077467067875331",
				"stockOrgId": "1680077467067875331",
				"receiverCustId": "1680224423651573767",
				"quoteIdentification": "1",
				"oriTaxUnitPrice": "",
				"oriSum": "",
				"oriUnitPrice": "",
				"oriMoney": "",
				"oriTax": "",
				"natTaxUnitPrice": "",
				"natSum": "",
				"natUnitPrice": "",
				"natMoney": "",
				"natTax": "",
				"salePrice": "",
				"saleMoney": "",
				"basePrice": "",
				"baseCost": "",
				"stockId": "",
				"projectId": "",
				"receiverId": "",
				"receiveAddress": "",
				"receiveMobile": "",
				"memo": "",
				"permitRatio": 0,
				"discRate": 100,
				"favorableRate": 0,
				"discMoney": "",
				"natDiscMoney": "",
				"baseDiscountRate": 100,
				"cusFavorableRate": 0,
				"baseDiscountMoney": "",
				"quoteExclTax": "",
				"quoteAmtExclTax": "",
				"invExchRateNum": 1,
				"pubts": "2024-01-18 21:59:57",
				"invExchRateDen": 1,
				"invPriceExchRateNum": 1,
				"invPriceExchRateDen": 1
			}
		],
		"receiveAgreement": [
			{
				"id": "1910284570205880327",
				"agreeOId": "1910284570205880324",
				"_status": "Update",
				"order": "1",
				"receiveName": "阶段一",
				"receivePercent": "100",
				"accountType": "0",
				"controlLink": "0",
				"receiveStartBase": "1676440505943588867",
				"startBaseDate": "2024-01-18 00:00:00",
				"sourceType": true,
				"accountUnit": "0",
				"accountDay": "0",
				"delayMonths": "0",
				"delayDays": "0",
				"arMoney": "1000",
				"preReceive": false,
				"deposit": false,
				"settleWay": "16764405059435888655",
				"fixedoaday": "1",
				"fixedoaday1": "1",
				"fixedoaday2": "2",
				"fixedoaday3": "3",
				"fixedoaday4": "4",
				"accountDate": "2024-01-18 00:00:00",
				"fixedexpireday": "1",
				"fixedexpireday1": "1",
				"fixedexpireday2": "2",
				"fixedexpireday3": "3",
				"fixedexpireday4": "4",
				"expireDate": "2024-01-18 00:00:00",
				"controlOppt": "0",
				"controlMode": "0",
				"preReceiveType": "0",
				"pubts": "2024-01-18 21:59:57"
			}
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
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用失败时的错误信息 示例：操作成功 |
| data | object | 否 | 调用成功时的返回数据 |
| id | string | 否 | 单据ID 示例：1910284570205880324 |
| code | string | 否 | 单据编码 示例：SACT2024011800000202 |
| vouchdate | string | 否 | 单据日期 示例：2024-01-18 00:00:00 |
| contractStatus | string | 否 | 合同状态：0.开立、1.已审核、3.审核中、5.已生效、6.已冻结、7.已终止 示例：0 |
| status | string | 否 | 单据状态，非展示字段 示例：0 |
| signStatus | string | 否 | 电子签署状态：0.未签署、1.签署中、2.已完成、3.已撤销、4.已终止、5.已过期、6.已删除、7.已拒签 示例：0 |
| changestatus | string | 否 | 变更状态，非展示字段 示例：0 |
| pubts | string | 否 | 时间戳 示例：2024-01-18 22:05:38 |
| transactionTypeId | string | 否 | 交易类型ID 示例：1676439981957579566 |
| transactionTypeId_name | string | 否 | 交易类型名称 示例：数量合同 |
| contractCtrlType | string | 否 | 合同签订形式：1.标准合同、2.数量合同、3.价格合同、4.金额合同 示例：2 |
| salesOrgId | string | 否 | 销售组织ID 示例：1680077467067875331 |
| salesOrgId_name | string | 否 | 销售组织名称 示例：CRM集团 |
| agentId | string | 否 | 客户ID 示例：1680224423651573767 |
| agentId_name | string | 否 | 客户名称 示例：lyp正式客户01 |
| isSubSact | boolean | 否 | 是否子合同 示例：false |
| receiveContacter | string | 否 | 客户联系人 示例：商机客户联系人0905 |
| wholeDiscRate | string | 否 | 整单扣率% 示例：100 |
| wholeFavorableRate | string | 否 | 整单倒扣 示例：0 |
| totalOriReceipts | string | 否 | 累计已收款金额 示例：0 |
| totalTax | string | 否 | 合计税额 示例：0 |
| payMoneyOrigTaxfree | string | 否 | 合计无税金额 示例：1000 |
| exchRateDate | string | 否 | 汇率日期 示例：2024-01-18 00:00:00 |
| exchangeRateType | string | 否 | 汇率类型ID 示例：0000LF11UTRA5P7VGH0000 |
| exchangeRateType_name | string | 否 | 汇率类型名称 示例：基准汇率 |
| exchangeRateType_digit | string | 否 | 汇率精度 示例：6 |
| exchRate | string | 否 | 汇率 示例：1 |
| exchRateOps | number |
| 小数位数:0,最大长度:1 | 否 | 汇率折算方式 示例：1 |
| isExecute | boolean | 否 | 是否参与执行 示例：true |
| salesmanId | string | 否 | 销售业务员ID 示例：1680084794281558023 |
| salesmanId_name | string | 否 | 销售业务员名称 示例：郝娟 |
| isWfControlled | boolean | 否 | 是否审批流控制 示例：false |
| invoiceAgentId | string | 否 | 开票客户ID 示例：1680224423651573767 |
| invoiceAgentId_name | string | 否 | 开票客户名称 示例：lyp正式客户01 |
| creatorId | string | 否 | 创建人ID 示例：1796537420843843587 |
| creatorId_name | string | 否 | 创建人名称 示例：昵称-苑洪军 |
| createTime | string | 否 | 创建时间 示例：2024-01-18 21:59:56 |
| modifierId | string | 否 | 修改人ID 示例：1796537420843843587 |
| modifierId_name | string | 否 | 修改人名称 示例：昵称-苑洪军 |
| modifyTime | string | 否 | 修改时间 示例：2024-01-18 22:05:37 |
| orderPayType | string | 否 | 支付方式 示例：99 |
| bizFlow | string | 否 | 流程ID 示例：13ea896b-7d68-41dd-a2e7-b4139c9330ec |
| bizFlow_version | string | 否 | 流程版本 示例：V1.0 |
| bizFlow_name | string | 否 | 流程名称 示例：test1 |
| currency | string | 否 | 币种ID 示例：1676440497353654309 |
| currency_code | string | 否 | 币种简称 示例：CNY |
| currency_name | string | 否 | 币种名称 示例：人民币 |
| currency_priceRount | string | 否 | 币种单价舍位方式 示例：4 |
| currency_priceDigit | string | 否 | 币种单价精度 示例：5 |
| currency_moneyRount | string | 否 | 币种金额舍位方式 示例：4 |
| currency_moneyDigit | string | 否 | 币种金额精度 示例：2 |
| natCurrency | string | 否 | 本币ID 示例：1676440497353654309 |
| natCurrency_code | string | 否 | 本币编码 示例：CNY |
| natCurrency_name | string | 否 | 本币名称 示例：人民币 |
| natCurrency_priceRount | string | 否 | 本币单价舍位方式 示例：4 |
| natCurrency_priceDigit | string | 否 | 本币单价精度 示例：5 |
| natCurrency_moneyRount | string | 否 | 本币金额舍位方式 示例：4 |
| natCurrency_moneyDigit | string | 否 | 本币金额精度 示例：2 |
| saleAreaId | string | 否 | 销售区域ID 示例：1680085146443710471 |
| saleAreaId_name | string | 否 | 销售区域名称 示例：北京区 |
| isFlowCoreBill | boolean | 否 | 是否核心单据 示例：true |
| isTransferTaxsact | boolean | 否 | 是否同步税务合同 示例：false |
| totalPriceTax | string | 否 | 合计含税金额 示例：1000 |
| saleDepartmentId | string | 否 | 销售部门ID 示例：1680078154248486914 |
| saleDepartmentId_name | string | 否 | 销售部门 示例：销管一部 |
| receiverCustId | string | 否 | 收货客户ID 示例：1680224423651573767 |
| receiverCustId_name | string | 否 | 收货客户名称 示例：lyp正式客户01 |
| salesContractDefineCharacter__id | string | 否 | 自定义项特征组ID 示例：1910284570205880332 |
| planExpirationDate | string | 否 | 计划失效日期 示例：2024-01-21 00:00:00 |
| taxSettingType | string | 否 | 计税方式：0.行计税、1.整单计税 示例：0 |
| settlementId | string | 否 | 结算方式ID |
| settlementId_code | string | 否 | 结算方式编码 |
| settlementId_name | string | 否 | 结算方式名称 |
| receiverId | string | 否 | 收货人ID |
| receiver | string | 否 | 收货人名称 |
| receiveMobile | string | 否 | 收货电话 |
| planEffectiveDate | string | 否 | 计划生效日期 |
| memo | string | 否 | 备注 |
| projectId | string | 否 | 项目ID |
| projectId_code | string | 否 | 项目编码 |
| projectId_name | string | 否 | 项目名称 |
| frozenDate | string | 否 | 冻结日期 |
| closeDate | string | 否 | 终止日期 |
| shippingChoiceId | string | 否 | 发运方式ID |
| shippingChoiceId_code | string | 否 | 发运方式编码 |
| shippingChoiceId_name | string | 否 | 发运方式名称 |
| custId | string | 否 | 伙伴ID |
| custId_name | string | 否 | 伙伴名称 |
| bussinessTelephone | string | 否 | 营业电话 |
| bussinessAddress | string | 否 | 营业地址 |
| deliAddr | string | 否 | 交货地点ID |
| deliAddr_address | string | 否 | 交货地点名称 |
| oadayConfirmType | string | 否 | 出账日确定方式：0.按月、1.按周 |
| expiredayConfirmType | string | 否 | 到期日确定方式：0.按月、1.按周 |
| ctTplId | string | 否 | 合同模板ID |
| ctTplCode | string | 否 | 合同模板编码 |
| ctTplName | string | 否 | 合同模板名称 |
| ctTplVersion | string | 否 | 合同模板版本 |
| mainSactcode | string | 否 | 主合同号 |
| salesContractDefineCharacter | object | 否 | 自定义项特征组 |
| childs | object | 是 | 合同标的子表 |
| name | string | 否 | 合同名称 |
| receiveAgreement | object | 是 | 收款协议子表 |
| shareMerchants | object | 是 | 共享客户子表 |
| executeOrganizations | object | 是 | 执行组织子表 |
| orderExecutes | object | 是 | 执行情况子表 |
| receiveContacterPhone | string | 否 | 客户联系电话 |
| agreement | string | 否 | 收款协议ID |
| agreement_name | string | 否 | 收款协议名称 |
| validDate | string | 否 | 生效日期 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"id": "1910284570205880324",
		"code": "SACT2024011800000202",
		"vouchdate": "2024-01-18 00:00:00",
		"contractStatus": "0",
		"status": "0",
		"signStatus": "0",
		"changestatus": "0",
		"pubts": "2024-01-18 22:05:38",
		"transactionTypeId": "1676439981957579566",
		"transactionTypeId_name": "数量合同",
		"contractCtrlType": "2",
		"salesOrgId": "1680077467067875331",
		"salesOrgId_name": "CRM集团",
		"agentId": "1680224423651573767",
		"agentId_name": "lyp正式客户01",
		"isSubSact": false,
		"receiveContacter": "商机客户联系人0905",
		"wholeDiscRate": "100",
		"wholeFavorableRate": "0",
		"totalOriReceipts": "0",
		"totalTax": "0",
		"payMoneyOrigTaxfree": "1000",
		"exchRateDate": "2024-01-18 00:00:00",
		"exchangeRateType": "0000LF11UTRA5P7VGH0000",
		"exchangeRateType_name": "基准汇率",
		"exchangeRateType_digit": "6",
		"exchRate": "1",
		"exchRateOps": 1,
		"isExecute": true,
		"salesmanId": "1680084794281558023",
		"salesmanId_name": "郝娟",
		"isWfControlled": false,
		"invoiceAgentId": "1680224423651573767",
		"invoiceAgentId_name": "lyp正式客户01",
		"creatorId": "1796537420843843587",
		"creatorId_name": "昵称-苑洪军",
		"createTime": "2024-01-18 21:59:56",
		"modifierId": "1796537420843843587",
		"modifierId_name": "昵称-苑洪军",
		"modifyTime": "2024-01-18 22:05:37",
		"orderPayType": "99",
		"bizFlow": "13ea896b-7d68-41dd-a2e7-b4139c9330ec",
		"bizFlow_version": "V1.0",
		"bizFlow_name": "test1",
		"currency": "1676440497353654309",
		"currency_code": "CNY",
		"currency_name": "人民币",
		"currency_priceRount": "4",
		"currency_priceDigit": "5",
		"currency_moneyRount": "4",
		"currency_moneyDigit": "2",
		"natCurrency": "1676440497353654309",
		"natCurrency_code": "CNY",
		"natCurrency_name": "人民币",
		"natCurrency_priceRount": "4",
		"natCurrency_priceDigit": "5",
		"natCurrency_moneyRount": "4",
		"natCurrency_moneyDigit": "2",
		"saleAreaId": "1680085146443710471",
		"saleAreaId_name": "北京区",
		"isFlowCoreBill": true,
		"isTransferTaxsact": false,
		"totalPriceTax": "1000",
		"saleDepartmentId": "1680078154248486914",
		"saleDepartmentId_name": "销管一部",
		"receiverCustId": "1680224423651573767",
		"receiverCustId_name": "lyp正式客户01",
		"salesContractDefineCharacter__id": "1910284570205880332",
		"planExpirationDate": "2024-01-21 00:00:00",
		"taxSettingType": "0",
		"settlementId": "",
		"settlementId_code": "",
		"settlementId_name": "",
		"receiverId": "",
		"receiver": "",
		"receiveMobile": "",
		"planEffectiveDate": "",
		"memo": "",
		"projectId": "",
		"projectId_code": "",
		"projectId_name": "",
		"frozenDate": "",
		"closeDate": "",
		"shippingChoiceId": "",
		"shippingChoiceId_code": "",
		"shippingChoiceId_name": "",
		"custId": "",
		"custId_name": "",
		"bussinessTelephone": "",
		"bussinessAddress": "",
		"deliAddr": "",
		"deliAddr_address": "",
		"oadayConfirmType": "",
		"expiredayConfirmType": "",
		"ctTplId": "",
		"ctTplCode": "",
		"ctTplName": "",
		"ctTplVersion": "",
		"mainSactcode": "",
		"salesContractDefineCharacter": {
			"id": "1910284570205880332",
			"pubts": "2024-01-18 21:59:57",
			"ytenant": "0000LF11UTRA5P7VGH0000"
		},
		"childs": [
			{
				"id": "1910284570205880328",
				"sactVId": "1910284570205880324",
				"pubts": "2024-01-18 21:59:57",
				"rowno": "10",
				"lineno": "10",
				"productId": "1679833349694160901",
				"productId_code": "000003",
				"productId_name": "猪头肉",
				"productId_url": "65bc3908-f842-413d-ae50-eb5d1b3d3639",
				"productId_modelDescription": "乳猪1号",
				"skuId": "1679833358284095499",
				"skuId_code": "000003",
				"skuId_name": "猪头肉",
				"skuId_modelDescription": "乳猪1号",
				"discRate": "100",
				"favorableRate": "0",
				"taxcCodeId": "11001",
				"taxRate": "0",
				"masterUnitId": "1679256999440678918",
				"masterUnitId_name": "亩",
				"masterUnitId_precision": "4",
				"saleunitId": "1679256999440678918",
				"saleunitId_name": "亩",
				"saleunitId_precision": "4",
				"saleUnitExchangeType": "0",
				"cqtUnitId": "1679256999440678918",
				"cqtUnitId_name": "亩",
				"cqtUnitId_precision": "4",
				"cqtUnitExchangeType": "0",
				"isExpiryDateManage": false,
				"qty": "10",
				"subQty": "10",
				"priceQty": "10",
				"invExchRate": "1",
				"invPriceExchRate": "1",
				"finOrgId": "1680077467067875331",
				"finOrgId_name": "CRM集团",
				"stockOrgId": "1680077467067875331",
				"stockOrgId_name": "CRM集团",
				"isBatchManage": false,
				"baseDiscountRate": "100",
				"cusFavorableRate": "0",
				"receiverCustId": "1680224423651573767",
				"receiverCustId_name": "lyp正式客户01",
				"quoteIdentification": "1",
				"isOptionalMaterial": "0",
				"firstsourceid": "1910284570205880324",
				"firstlineno": "10",
				"firstsource": "sact.sact_salescontract",
				"firstupcode": "SACT2024011800000202",
				"firstsourceautoid": "1910284570205880328",
				"contractObjectDefineCharacter__id": "1910284570205880330",
				"optionCharacteristics": {
					"id": "1910284570205880331",
					"pubts": "2024-01-18 21:56:30",
					"ytenant": "0000LF11UTRA5P7VGH0000"
				},
				"contractObjectCharacteristics": {
					"id": "1910284570205880329",
					"pubts": "2024-01-18 21:56:30",
					"ytenant": "0000LF11UTRA5P7VGH0000"
				},
				"contractObjectDefineCharacter": {
					"id": "1910284570205880330",
					"pubts": "2024-01-18 21:56:30",
					"ytenant": "0000LF11UTRA5P7VGH0000"
				},
				"productId_productLine": "",
				"productId_productLine_name": "",
				"oriTaxUnitPrice": "",
				"oriSum": "",
				"oriUnitPrice": "",
				"oriMoney": "",
				"oriTax": "",
				"natTaxUnitPrice": "",
				"natSum": "",
				"natUnitPrice": "",
				"natMoney": "",
				"natTax": "",
				"salePrice": "",
				"saleMoney": "",
				"discMoney": "",
				"basePrice": "",
				"baseDiscountMoney": "",
				"lowestPrice": "",
				"stockId": "",
				"stockId_name": "",
				"batchId": "",
				"batchNo": "",
				"projectId": "",
				"projectId_code": "",
				"projectId_name": "",
				"wbs": "",
				"wbsCode": "",
				"wbsName": "",
				"uplineno": "",
				"source": "",
				"sourceType": "",
				"sourceType_code": "",
				"sourceType_name": "",
				"sourceid": "",
				"sourceautoid": "",
				"upcode": "",
				"natTaxReceiEMoney": "",
				"natReceiEMoney": "",
				"natTaxPayEMoney": "",
				"natPayEMoney": "",
				"costPrice": "",
				"costMoney": "",
				"costCurrency": "",
				"costCurrency_code": "",
				"costCurrency_name": "",
				"costExchRate": "",
				"preGProfit": "",
				"preGProfitRate": "",
				"agentProductId": "",
				"agentProductCode": "",
				"agentProductName": "",
				"agentSkuCode": "",
				"agentSkuName": "",
				"receiverId": "",
				"receiver": "",
				"skuId_model": "",
				"skuId_specs": "",
				"productClass": "",
				"productClass_code": "",
				"productClass_name": "",
				"productId_model": "",
				"variantconfigctsCode": "",
				"variantconfigctsVersion": "",
				"optionalQuotationId": "",
				"optionalQuotationIdCode": "",
				"optionalType": "",
				"variantconfigctsId": "",
				"variantConfiguration": ""
			}
		],
		"name": "",
		"receiveAgreement": [
			{
				"id": "1910284570205880327",
				"sactVId": "1910284570205880324",
				"pubts": "2024-01-18 21:59:57",
				"order": "1",
				"receiveName": "阶段一",
				"receivePercent": "100",
				"accountType": "0",
				"controlLink": "0",
				"receiveStartBase": "1676440505943588867",
				"startBaseCode": "NotSet",
				"receiveStartBase_name": "不设起算日、到期日",
				"sourceType": true,
				"accountUnit": "0",
				"accountDay": "0",
				"delayMonths": "0",
				"delayDays": "0",
				"arMoney": "1000",
				"recMoney": "1000",
				"preReceive": false,
				"deposit": false,
				"settleWay": "16764405059435888655",
				"settleWay_name": "结算方式",
				"startBaseDate": "2024-01-18 00:00:00",
				"fixedoaday": "1",
				"fixedoaday1": "1",
				"fixedoaday2": "2",
				"fixedoaday3": "3",
				"fixedoaday4": "4",
				"accountDate": "2024-01-18 00:00:00",
				"fixedexpireday": "1",
				"fixedexpireday1": "1",
				"fixedexpireday2": "2",
				"fixedexpireday3": "3",
				"fixedexpireday4": "4",
				"expireDate": "2024-01-18 00:00:00",
				"controlOppt": "0",
				"controlMode": "0",
				"preReceiveType": "0"
			}
		],
		"shareMerchants": [
			{
				"id": "1910284570205880325",
				"shareAgentId": "1680224423651573767",
				"shareAgentId_name": "lyp正式客户01",
				"sactVId": "1910284570205880324"
			}
		],
		"executeOrganizations": [
			{
				"id": "1910284570205880326",
				"sactVId": "1910284570205880324",
				"execOrgId": "1680077467067875331",
				"execOrgId_name": "CRM集团"
			}
		],
		"orderExecutes": [
			{
				"id": "1910284570205880328",
				"sacoOId": "1910284570205880328",
				"sactVId": "1910284570205880324",
				"pubts": "2024-01-18 21:59:57",
				"rowNo": "10",
				"sactUnitId": "1910284570205880325",
				"sactNum": "0",
				"sactMoney": "0",
				"totalInvoiceNum": "0",
				"totalOutNum": "0",
				"totalSendNum": "0",
				"totalInvoiceMoney": "0",
				"orderNum": "0",
				"orderMoney": "0",
				"projectNum": "10",
				"demandNum": "0"
			}
		],
		"receiveContacterPhone": "",
		"agreement": "",
		"agreement_name": "",
		"validDate": ""
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	服务端逻辑异常


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-01-21

新增

请求参数 (4)

更新

请求参数 (59)

更新

返回参数 (112)

换算率分子分母


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

