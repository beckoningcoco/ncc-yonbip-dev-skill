---
title: "期初收款退款详情查询"
apiId: "1835911413267693572"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Opening Collection Refund"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Opening Collection Refund]
platform_version: "BIP"
source_type: community-api-docs
---

# 期初收款退款详情查询

>  请求方式	GET | Opening Collection Refund (EFI)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/EFI/openingreceivementrefundevent/detail
请求方式	GET
ContentType	application/json
应用场景	开放API/集成API
API类别	详情查询
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	string	query	是	事务id    示例: 1572409517496336389

## 3. 请求示例

Url: /yonbip/EFI/openingreceivementrefundevent/detail?access_token=访问令牌&id=1572409517496336389

## 4. 返回值参数

名称	类型	数组	描述
billtype	string	否	事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、
creator	string	否	创建人
creator	string	否	创建人
displayCode	string	否	异常码
displayCode	string	否	异常码
message	string	否	信息 示例：操作成功
data	string	否	响应信息
salesOrgId	string	否	销售组织id
saleDepartmentId	string	否	销售部门id
transactionTypeId	string	否	交易类型id
settlementOrgId	string	否	开票组织id
bizId	string	否	商家id
createDate	string	否	创建时间
synSourceOrg	string	否	协同来源组织id
ecsuiteuser	string	否	气泡联系人
ecsuiteuser	string	否	气泡联系人
billtype	string	否	事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、
creator	string	否	创建人
code	long	否	返回码，调用成功时返回200 示例：200
message	string	否	调用返回信息 示例：操作成功
data	object	否	返回期初收款退款详情数据
id	string	否	ID 示例：1837196072339898377
financeOrg	string	否	会计主体ID 示例：1812935142113017863
financeOrg_code	string	否	会计主体编码 示例：0909
financeOrg_name	string	否	会计主体 示例：收付多版本测试组织
accBook	string	否	财务账簿ID 示例：1814181773554221071
accBook_code	string	否	财务账簿编码 示例：w3232kk3gv4k
accBook_name	string	否	财务账簿 示例：会计账薄2
accPurpose	string	否	核算目的ID 示例：1580569448542109991
accPurpose_code	string	否	核算目的编码 示例：0911
accPurpose_name	string	否	核算目的 示例：法人核算目的
arapEventType	string	否	会计事务 示例：107
code	string	否	会计事务编号 示例：AR04230630000015
accDate	string	否	记账日期 示例：2023-06-30 00:00:00
accPeriod	string	否	会计期间ID 示例：1582788383257657354
accYear	string	否	会计年度ID 示例：1591544722069913603
accPeriodCode	string	否	会计期间 示例：2023-07
srcBillDate	string	否	单据日期 示例：2023-06-30 00:00:00
bizBillCode	string	否	单据编号 示例：AR04230630000020
srcSystem	string	否	来源系统 示例：0
org	string	否	业务组织ID 示例：1812935142113017863
org_code	string	否	业务组织编码 示例：0909
org_name	string	否	业务组织 示例：收付多版本测试组织
objectType	string	否	往来对象类型（0：供应商；1：客户；2：员工；3：资金业务对象；） 示例：1
customer	string	否	客户ID 示例：1814472164876222466
customer_code	string	否	客户编码 示例：091329473764
customer_name	string	否	客户 示例：张三
employee	string	否	员工ID 示例：193837337278473368
employee_code	string	否	员工编码 示例：249823453323
funder	string	否	资金业务对象ID 示例：184384748943837
funder_code	string	否	资金业务对象编码 示例：13440382938427
partner	string	否	业务伙伴ID 示例：344432283288
partner_code	string	否	业务伙伴编码 示例：244523224982229722
oriCurrency	string	否	币种ID 示例：1580569439952699425
oriCurrency_code	string	否	币种简称 示例：CNY
oriCurrency_moneyDigit	int	否	币种金额精度 示例：3
oriCurrency_name	string	否	币种 示例：人民币
oriCurrency_priceDigit	int	否	币种单价精度 示例：3
oriAmount	BigDecimal	否	退款金额 示例：0
bodyItem	object	是	表体数据
oriBalance	BigDecimal	否	余额 示例：-80
accCurrency	string	否	本币币种ID 示例：184384908943843
accConvertParam	string	否	账簿币折算参数（1：按原币折算；2：按组织币折算；3：按账簿币折算；） 示例：1
accCurrency_code	string	否	本币币种编码 示例：CNY
accCurrency_name	string	否	本币币种名称 示例：人民币
accCurrency_moneyDigit	int	否	本币金额精度 示例：0
accCurrency_priceDigit	int	否	本币单价精度 示例：0
accAmount	BigDecimal	否	本币金额 示例：0
accBalance	BigDecimal	否	本币余额 示例：-80
orgCurrency	string	否	组织本币ID 示例：189884908943843
orgConvertParam	string	否	组织币折算参数（1：按原币折算；2：按组织币折算；3：按账簿币折算；） 示例：1
orgCurrency_name	string	否	组织币名称 示例：组织币名称2
orgCurrency_moneyDigit	int	否	组织本币金额精度 示例：0
orgCurrency_priceDigit	int	否	组织本币单价精度 示例：0
orgAmount	BigDecimal	否	组织币金额 示例：0
orgBalance	BigDecimal	否	组织币余额 示例：0
grpCurrency	string	否	集团本币ID 示例：189884906543843
grpConvertParam	string	否	集团币折算参数（1：按原币折算；2：按组织币折算；3：按账簿币折算；） 示例：1
grpCurrency_moneyDigit	int	否	集团本币金额精度 示例：0
grpCurrency_priceDigit	int	否	集团本币单价精度 示例：0
grpAmount	BigDecimal	否	集团币金额 示例：0
grpBalance	BigDecimal	否	集团币余额 示例：0
gblCurrency	string	否	全局本币ID 示例：189884986543843
gblConvertParam	string	否	全局币折算参数（1：按原币折算；2：按组织币折算；3：按账簿币折算；） 示例：1
gblCurrency_moneyDigit	int	否	全局本币金额精度 示例：0
gblCurrency_priceDigit	int	否	全局本币单价精度 示例：0
gblAmount	BigDecimal	否	全局币金额 示例：0
gblBalance	BigDecimal	否	全局币余额 示例：0
remarks	string	否	备注 示例：采购退款
status	string	否	事务状态（0: 未审核； 1: 已审核；） 示例：1
eventType	string	否	会计事务类型ID 示例：182494837363
eventType_name	string	否	会计事务类型名称 示例：会计事务类型名称2
entryCode	string	否	事项分录编码 示例：item18327
voucherCode	string	否	总账凭证号 示例：23993749274923763
settleState	string	否	结算状态（枚举值 0：待结算；1：结算中；2：不结算；3：全部成功；4：部分成功；5：全部止付；） 示例：2
blnEffect	string	否	生效状态（枚举值 0：未生效；1：已生效；） 示例：1
balanceState	string	否	清账状态（枚举值 0：未清账；1：已清账；2：部分清账；） 示例：1
postState	string	否	过账状态（枚举值 0：未过账；1：过账中；2：过账成功；3：过账失败；4：不过账；） 示例：1
pubts	string	否	时间戳 示例：2023-10-12 10:29:33
srcApp	string	否	来源应用列表ID 示例：13847394737
srcApp_name	string	否	来源应用 示例：应收管理
copyBill	string	否	单据复制标识 示例：1

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"id": "1837196072339898377",
		"financeOrg": "1812935142113017863",
		"financeOrg_code": "0909",
		"financeOrg_name": "收付多版本测试组织",
		"accBook": "1814181773554221071",
		"accBook_code": "w3232kk3gv4k",
		"accBook_name": "会计账薄2",
		"accPurpose": "1580569448542109991",
		"accPurpose_code": "0911",
		"accPurpose_name": "法人核算目的",
		"arapEventType": "107",
		"code": "AR04230630000015",
		"accDate": "2023-06-30 00:00:00",
		"accPeriod": "1582788383257657354",
		"accYear": "1591544722069913603",
		"accPeriodCode": "2023-07",
		"srcBillDate": "2023-06-30 00:00:00",
		"bizBillCode": "AR04230630000020",
		"srcSystem": "0",
		"org": "1812935142113017863",
		"org_code": "0909",
		"org_name": "收付多版本测试组织",
		"objectType": "1",
		"customer": "1814472164876222466",
		"customer_code": "091329473764",
		"customer_name": "张三",
		"employee": "193837337278473368",
		"employee_code": "249823453323",
		"funder": "184384748943837",
		"funder_code": "13440382938427",
		"partner": "344432283288",
		"partner_code": "244523224982229722",
		"oriCurrency": "1580569439952699425",
		"oriCurrency_code": "CNY",
		"oriCurrency_moneyDigit": 3,
		"oriCurrency_name": "人民币",
		"oriCurrency_priceDigit": 3,
		"oriAmount": 0,
		"bodyItem": [
			{
				"id": "1837196072339898377",
				"rowNo": "10",
				"event": "1837196072339898375",
				"quickType": "1580569448542110004",
				"quickTypeCode": "2",
				"quickType_name": "应收款",
				"blnPrepare": "0",
				"expenseItem": "1791319611115307017",
				"expenseItem_code": "adoo6",
				"material": "1814953364432093192",
				"material_code": "561405",
				"settleMode": "1691202935474880529",
				"settleMode_code": "system_0001",
				"settleMode_serviceAttr": "sdf234f233",
				"oriCurrency": "1580569439952699425",
				"oriCurrency_code": "CNY",
				"oriCurrency_name": "人民币",
				"oriCurrency_moneyDigit": 3,
				"oriCurrency_priceDigit": 3,
				"enterpriseBankAccount": "2344345669233243",
				"enterpriseBankAccount_no": "3487g8238283",
				"enterpriseCashAccount": "34828237327273",
				"customerBankAccount": "2382823727293922727",
				"customerBankAccount_no": "2383828f88d83w",
				"employeeBankAccount": "3489394382828",
				"employeeBankAccount_no": "184384748943843",
				"funderBankAccount": "184384748943843",
				"funderBankAccount_no": "184384748943845",
				"objectBankAccountNo": "184384748943843",
				"oriTaxIncludedAmount": -80,
				"oriOcupyAmount": 0,
				"oriBalance": -80,
				"accExchangeRateType": "0000L9WH2UZ56SI9FH0000",
				"accExchangeRateType_code": "01",
				"accExchangeRateType_name": "基准汇率",
				"accExchangeRateType_digit": 7,
				"exchangeRateDate": "2023-06-30 00:00:00",
				"accExchangeRate": "1",
				"accTaxIncludedAmount": -80,
				"accBalance": -80,
				"orgExchangeRateType": "0000L9WH2UZ56SI9FH0000",
				"orgExchangeRateType_code": "01",
				"orgExchangeRateType_digit": 7,
				"orgExchangeRate": "1",
				"orgTaxIncludedAmount": 0,
				"orgBalance": 0,
				"grpExchangeRateType": "0000L9WH2UZ56SI9FH0001",
				"grpExchangeRateType_code": "0214",
				"grpExchangeRateType_digit": 0,
				"grpExchangeRate": "0",
				"grpTaxIncludedAmount": 0,
				"grpBalance": 0,
				"gblExchangeRateType": "0000L9WH2UZ56SI9FH0002",
				"gblExchangeRateType_code": "0917",
				"gblExchangeRateType_digit": 0,
				"gblExchangeRate": "0",
				"gblTaxIncludedAmount": 0,
				"gblBalance": 0,
				"dept": "1818042519668129796",
				"dept_code": "er",
				"staff": "182494837363",
				"staff_code": "182494837363",
				"project": "1815140547702554913",
				"project_code": "00000031",
				"orderNo": "order123",
				"contractNo": "3845629333345667",
				"issueNo": "1",
				"expireDate": "2023-06-30 00:00:00",
				"remarks": "采购退款",
				"arSubjectVid": "1814206727330463772",
				"arSubjectVid_name": "原材料",
				"arSubject": "1814179823639068699",
				"arSubjectVid_code": "1403",
				"arSubject_name": "1212121212",
				"costCenter": "2382832828238828",
				"costCenter_code": "3443343282823",
				"proCenter": "2323298482883",
				"proCenter_code": "32482348ff827237",
				"oppProCenter": "1581880753585127430",
				"oppProCenter_code": "HL+BZ+JD01",
				"oriBillNo": "184384748943843",
				"oriBillId": "184384748943843",
				"oriBillType": "184384748943843",
				"oriBillRowId": "184384748943843",
				"srcBillNo": "184384748943843",
				"srcBillId": "184384748943843",
				"srcBillType": "184384748943843",
				"srcBillRowId": "184384748943843",
				"settleState": "2",
				"settleDate": "2023-06-30 00:00:00",
				"pubts": "2023-10-12 10:29:33"
			}
		],
		"oriBalance": -80,
		"accCurrency": "184384908943843",
		"accConvertParam": "1",
		"accCurrency_code": "CNY",
		"accCurrency_name": "人民币",
		"accCurrency_moneyDigit": 0,
		"accCurrency_priceDigit": 0,
		"accAmount": 0,
		"accBalance": -80,
		"orgCurrency": "189884908943843",
		"orgConvertParam": "1",
		"orgCurrency_name": "组织币名称2",
		"orgCurrency_moneyDigit": 0,
		"orgCurrency_priceDigit": 0,
		"orgAmount": 0,
		"orgBalance": 0,
		"grpCurrency": "189884906543843",
		"grpConvertParam": "1",
		"grpCurrency_moneyDigit": 0,
		"grpCurrency_priceDigit": 0,
		"grpAmount": 0,
		"grpBalance": 0,
		"gblCurrency": "189884986543843",
		"gblConvertParam": "1",
		"gblCurrency_moneyDigit": 0,
		"gblCurrency_priceDigit": 0,
		"gblAmount": 0,
		"gblBalance": 0,
		"remarks": "采购退款",
		"status": "1",
		"eventType": "182494837363",
		"eventType_name": "会计事务类型名称2",
		"entryCode": "item18327",
		"voucherCode": "23993749274923763",
		"settleState": "2",
		"blnEffect": "1",
		"balanceState": "1",
		"postState": "1",
		"pubts": "2023-10-12 10:29:33",
		"srcApp": "13847394737",
		"srcApp_name": "应收管理",
		"copyBill": "1"
	}
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
999	当前单据被删除或没有权限	请求参数中输入有效的事务id

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

