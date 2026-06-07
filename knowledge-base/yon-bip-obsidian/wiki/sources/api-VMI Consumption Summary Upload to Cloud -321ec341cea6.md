---
title: "vmi消耗汇总单上传云采"
apiId: "321ec341cea64e3b899ebddd54393234"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Procure-to-Pay"
domain: "SCC"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Procure-to-Pay]
platform_version: "BIP"
source_type: community-api-docs
---

# vmi消耗汇总单上传云采

>  请求方式	POST | Procure-to-Pay (SCC)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/cpu/cpu-vmi/vmi/consumerdata
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	是	是	erp传来的数据
billDate	string	否	是	单据时间 示例：2021-08-23 16:22:21
changeRate	string	否	是	换算率 示例：1/1
ctrantypeid	string	否	是	消耗汇总单交易类型id 示例：0001A110000000002MMC
currencyCode	string	否	是	币种编码 示例：CNY
billStatus	string	否	是	消耗汇总单状态 示例：1：ERP删除； 2：审批中； 3：审批未通过； 4：审批通过
currencyName	string	否	是	币种名称 示例：人民币
dmakedate	string	否	是	制单日期 示例：2021-08-23 16:22:21
erpBillBid	string	否	是	erp消耗汇总单B主键 示例：1001A11000000083YP9F
erpBillHid	string	否	是	erp消耗汇总单H主键 示例：1001A11000000083YP94
erpBillId	string	否	是	erp消耗汇总单Id 示例：1001A11000000083YP94
erpBillNo	string	否	是	erp消耗汇总单单号 示例：KYHX202108230244
erpBillRowno	string	否	是	erp消耗汇总单表体行号 示例：10
erpCurrencyId	string	否	是	erp币种id 示例：1002Z0100000000001K1
erpFanaceorgOid	string	否	是	erp结算财务组织ID 示例：0001A11000000000348N
erpFanaceorgVid	string	否	是	erp结算财务组织VID 示例：0001A11000000000348M
erpGroup	string	否	是	erp集团主键 示例：0001A110000000000NEB
erpMainUnit	string	否	是	erp主单位id 示例：0001Z0100000000000XI
erpMaterialId	string	否	是	对应erp物料主键 示例：1001A110000000011NLP
erpMaterialVid	string	否	是	erp物料VID 示例：1
erpStockorgId	string	否	是	erp库存组织主键 示例：0001A1100000000034AG
erpStockorgVid	string	否	是	erp库存组织版本主键 示例：0001A1100000000034AF
erpSupplyId	string	否	是	erp供应商ID 示例：0001A1100000007HFD0N
erpUnit	string	否	是	erp单位id 示例：0001Z0100000000000XI
godownMainNum	BigDecimal	否	是	可开票主数量 = 实收主数量-累计开票主数量 示例：450
godownNum	BigDecimal	否	是	可开票数量 = 可开票主数量 * 换算率 示例：450
hfanorgCode	string	否	是	结算财务组织编码 示例：01010101
mainPrice	BigDecimal	否	是	主无税单价 示例：117.07
mainTaxPrice	BigDecimal	否	是	主含税单价 示例：132.2891
mainUnitCode	string	否	是	主单位编码 示例：KGM
mainUnitName	string	否	是	主单位名称 示例：千克
mny	BigDecimal	否	是	总金额（无税金额） 示例：52681.5
ntotalNum	BigDecimal	否	是	总数量 示例：450
ntotalPrice	BigDecimal	否	是	总金额 示例：59530.1
price	BigDecimal	否	是	无税单价（计算得到，=无税金额mny/godownNum） 示例：117.07
signDate	string	否	是	签字日期 示例：2021-08-23 16:22:21
stockorgCode	string	否	是	库存组织编码（yc） 示例：010101010706
supplyCode	string	否	是	供应商编码 示例：S200071
taxAmount	BigDecimal	否	是	税额 示例：6848.6
taxMny	BigDecimal	否	是	价税合计 示例：59530.1
taxPrice	BigDecimal	否	是	含税单价（==价税合计taxMny/godownNum） 示例：132.2891
taxRate	BigDecimal	否	是	税率 示例：13
taxtypeFlag	string	否	是	扣税类别 示例：1：普通 2：采购
totalMainNum	BigDecimal	否	是	主总数量（应收主数量） 示例：450
totalNum	BigDecimal	否	是	总数量（应收数量） 示例：450
unitCode	string	否	是	单位编码 示例：KGM
unitName	string	否	是	单位名称 示例：千克
vtrantypecode	string	否	是	消耗汇总单交易类型Code 示例：50-01
erpBrandCode	string	否	否	erp品牌编码 示例：000011
orderNo	string	否	否	云采订单号 示例：VO202103020001
erpBrandId	string	否	否	erp品牌id 示例：1001A11000000000RHZA
billmarker	string	否	否	制单人 示例：0001A110000000003U4O
bmemo	string	否	否	备注 示例：20201209L50092004
signaturer	string	否	否	签字人 示例：0001A110000000003U4O
erpBatch	string	否	否	批次 示例：20201209L50092004
bmakeuserCode	string	否	否	制单用户编码（yc） 示例：FH002402
signpsnCode	string	否	否	签字人编码（yc） 示例：FH002402
purEnterpriseName	string	否	否	采购商租户名称 示例：采购云与NC65集成企业
supEnterpriseName	string	否	否	供应商租户名称 示例：云采测试专用供应商03（yctest_gys03)
supplyId	string	否	否	供应商主键（yc） 示例：2427170343702784
supplyName	string	否	否	供应商名称 示例：云采测试专用供应商02（yctest_gys02)
stockorgName	string	否	否	库存组织名称（yc） 示例：天海华北公司
stockorgId	string	否	否	库存组织主键（yc） 示例：2426961269739776
erpWhId	string	否	否	erp仓库Id 示例：2426961269739776
whCode	string	否	否	仓库编码 示例：FH002402
whName	string	否	否	仓库名称 示例：天海华北公司
erpWhpsnId	string	否	否	erp库管员Id 示例：2426961269739776
whpsnCode	string	否	否	库管员编码 示例：FH002401
whpsnName	string	否	否	库管员名称 示例：王采购
whpsnId	string	否	否	库管员主键(yc) 示例：2426961269739
erpPurchaseorgId	string	否	否	erp采购组织主键 示例：0001A11000000000348N
erpPurchaseorgVid	string	否	否	erp采购组织版本主键 示例：0001A11000000000348N
purorgId	string	否	否	采购组织主键（yc） 示例：2426961269739776
purorgCode	string	否	否	采购组织编码 示例：010101010706
purorgName	string	否	否	采购组织名称 示例：天海华北公司
erpPurchasedeptId	string	否	否	erp采购部门主键 示例：010101010706
erpPurchasedeptVid	string	否	否	erp采购部门版本主键 示例：010101010706
purdeptCode	string	否	否	采购部门编码 示例：FH002401
purdeptName	string	否	否	采购部门名称 示例：天海华北公司
purdeptId	string	否	否	采购部门主键（yc） 示例：010101010706
erpPurchaserId	string	否	否	erp采购员主键 示例：0001A110000000003U4O
purchaserCode	string	否	否	采购员编码 示例：FH002401
purchaserName	string	否	否	采购员名称 示例：王采购
purchaserId	string	否	否	采购员主键（yc） 示例：010101010706
hfanorgName	string	否	否	结算财务组织名称 示例：天海集团总公司
hfanorgId	string	否	否	结算财务组织主键（yc） 示例：2063331945255168
erpCompanyId	string	否	否	ERP公司主键 示例：0001E210000000002O5P
erpCompanyVid	string	否	否	ERP公司版本主键 示例：0001E210000000002O5O
compCode	string	否	否	公司编码 示例：01
compName	string	否	否	公司名称 示例：天海集团总公司
erpFirstbillId	string	否	否	消耗汇总单源头单据id 示例：YH156568411111
erpSourcebillId	string	否	否	消耗汇总单来源单据id 示例：YH0000ER0002111
erpSourcebillType	string	否	否	消耗汇总单来源单据类型 示例：01
bmakeuserName	string	否	否	制单用户名称（yc） 示例：王采购员
bmakeuserId	string	否	否	制单用户主键（yc） 示例：010101010706
signpsnName	string	否	否	签字人名称（yc） 示例：yc_18989999102
signpsnId	string	否	否	签字人主键（yc） 示例：2090517
hmemo	string	否	否	备注 示例：签字
balanceStatus	string	否	否	对账状态 示例："-1", "未对账";"0", "一致"; "1", "差异";"2", "遗留";"3", "无需对账"
balanceTime	string	否	否	对账时间 示例：2021-08-23 16:22:21
balanceUserid	string	否	否	对账用户id 示例：010101010706
balanceUsercode	string	否	否	对账用户code 示例：FH002401
balanceUsername	string	否	否	对账用户名称 示例：王采购员
dr	string	否	否	删除标识 示例：0：未删除 1：删除
ts	string	否	否	时间戳 示例：2021-08-23 16:22:21
id	string	否	否	主键 示例：123
hid	string	否	否	消耗汇总单主键 示例：456
erpSourceType	string	否	否	ERP来源单据类型 示例：1：ERP订单 2：跟单采购
erpSourcetransType	string	否	否	来源交易类型 示例：1：普通 2：备件
erpSourceHid	string	否	否	ERP来源单据表头主键 示例：01010101075578
erpSourceHno	string	否	否	ERP来源单据号 示例：0101010107587
erpSourceBid	string	否	否	ERP来源单据表体行主键 示例：0101010107587
erpSourceBno	string	否	否	ERP来源单据表体行号 示例：0001E210000000002O5P
erpFirstbillType	string	否	否	源头单据类型 示例：1：询价单 2：定标单
erpFirsttransType	string	否	否	源头交易类型 示例：1：普通 2：备件
erpFirstbillHid	string	否	否	源头单据表头主键 示例：0001E210000000002O5O
erpFirstbillHno	string	否	否	源头单据号 示例：0001E2100000000
erpFirstbillBid	string	否	否	源头单据表体主键 示例：0001E21000000000ER02
erpFirstbillBno	string	否	否	源头单据表体行号 示例：10
erpCompanyBid	string	否	否	ERP公司主键 示例：213256
erpCompanyBvid	string	否	否	ERP公司版本主键 示例：54613265
bcompCode	string	否	否	公司编码 示例：01
bcompName	string	否	否	公司名称 示例：天海集团总公司
erpReqstoorgId	string	否	否	ERP需求库存组织主键 示例：0001E210000000002O5O
erpReqstoorgVid	string	否	否	ERP需求库存组织版本主键 示例：0001E210000000002O5O
reqStkorgCode	string	否	否	需求库存组织编码 示例：FH002401
reqStkorgName	string	否	否	需求库存组织名称 示例：天海集团总公司
reqStkorgId	string	否	否	需求库存组织主键 示例：54613265
erpStockwh	string	否	否	erp库存仓库主键 示例：52423
stkwhcode	string	否	否	库存仓库编码 示例：FH002401
stkwhname	string	否	否	库存仓库名称 示例：天海集团
erpReqwh	string	否	否	erp需求仓库主键 示例：45665642
reqwhCode	string	否	否	需求仓库编码 示例：WH1245644
reqwhName	string	否	否	需求仓库名称 示例：天海集团总公司
erpMaterialSpe	string	否	否	erp物料规格 示例：规格
materialId	string	否	否	物料主键（yc） 示例：2115836286832896
materialCode	string	否	否	物料编码 示例：401010026
materialName	string	否	否	物料名称 示例：维京米兰肠
materialSpec	string	否	否	物料规格 示例：规格
materialModel	string	否	否	物料型号 示例：型号
brandId	string	否	否	品牌id 示例：1452545
brandCode	string	否	否	品牌编码 示例：PP200121
confirmBrand	string	否	否	品牌名称 示例：双汇
currencySymbol	string	否	否	币种符号 示例：￥
chargebackTaxMny	BigDecimal	否	否	扣款金额 示例：22.2
invoicedMainNum	BigDecimal	否	否	计开票主数量 示例：33
contractNo	string	否	否	云采合同号 示例：CT221546112
deliveryNo	string	否	否	云采发货单号 示例：FH12454566456
arriveNo	string	否	否	云采到货单号 示例：DH22545565645
purchaseUnitId	string	否	否	采购单位id 多单位
mainUnitId	string	否	否	主单位id 多单位
unitId	string	否	否	计价单位id 多单位
purchaseExchRate	BigDecimal	否	否	采购换算率 多单位
priceExchRate	BigDecimal	否	否	计价换算率 多单位
godownPurNum	BigDecimal	否	否	对账采购数量
erpPurUnit	string	否	否	erp采购单位id

## 3. 请求示例

Url: /yonbip/cpu/cpu-vmi/vmi/consumerdata?access_token=访问令牌
Body: {
	"data": [
		{
			"billDate": "2021-08-23 16:22:21",
			"changeRate": "1/1",
			"ctrantypeid": "0001A110000000002MMC",
			"currencyCode": "CNY",
			"billStatus": "1：ERP删除；     2：审批中；     3：审批未通过；     4：审批通过",
			"currencyName": "人民币",
			"dmakedate": "2021-08-23 16:22:21",
			"erpBillBid": "1001A11000000083YP9F",
			"erpBillHid": "1001A11000000083YP94",
			"erpBillId": "1001A11000000083YP94",
			"erpBillNo": "KYHX202108230244",
			"erpBillRowno": "10",
			"erpCurrencyId": "1002Z0100000000001K1",
			"erpFanaceorgOid": "0001A11000000000348N",
			"erpFanaceorgVid": "0001A11000000000348M",
			"erpGroup": "0001A110000000000NEB",
			"erpMainUnit": "0001Z0100000000000XI",
			"erpMaterialId": "1001A110000000011NLP",
			"erpMaterialVid": "1",
			"erpStockorgId": "0001A1100000000034AG",
			"erpStockorgVid": "0001A1100000000034AF",
			"erpSupplyId": "0001A1100000007HFD0N",
			"erpUnit": "0001Z0100000000000XI",
			"godownMainNum": 450,
			"godownNum": 450,
			"hfanorgCode": "01010101",
			"mainPrice": 117.07,
			"mainTaxPrice": 132.2891,
			"mainUnitCode": "KGM",
			"mainUnitName": "千克",
			"mny": 52681.5,
			"ntotalNum": 450,
			"ntotalPrice": 59530.1,
			"price": 117.07,
			"signDate": "2021-08-23 16:22:21",
			"stockorgCode": "010101010706",
			"supplyCode": "S200071",
			"taxAmount": 6848.6,
			"taxMny": 59530.1,
			"taxPrice": 132.2891,
			"taxRate": 13,
			"taxtypeFlag": "1：普通  2：采购",
			"totalMainNum": 450,
			"totalNum": 450,
			"unitCode": "KGM",
			"unitName": "千克",
			"vtrantypecode": "50-01",
			"erpBrandCode": "000011",
			"orderNo": "VO202103020001",
			"erpBrandId": "1001A11000000000RHZA",
			"billmarker": "0001A110000000003U4O",
			"bmemo": "20201209L50092004",
			"signaturer": "0001A110000000003U4O",
			"erpBatch": "20201209L50092004",
			"bmakeuserCode": "FH002402",
			"signpsnCode": "FH002402",
			"purEnterpriseName": "采购云与NC65集成企业",
			"supEnterpriseName": "云采测试专用供应商03（yctest_gys03)",
			"supplyId": "2427170343702784",
			"supplyName": "云采测试专用供应商02（yctest_gys02)",
			"stockorgName": "天海华北公司",
			"stockorgId": "2426961269739776",
			"erpWhId": "2426961269739776",
			"whCode": "FH002402",
			"whName": "天海华北公司",
			"erpWhpsnId": "2426961269739776",
			"whpsnCode": "FH002401",
			"whpsnName": "王采购",
			"whpsnId": "2426961269739",
			"erpPurchaseorgId": "0001A11000000000348N",
			"erpPurchaseorgVid": "0001A11000000000348N",
			"purorgId": "2426961269739776",
			"purorgCode": "010101010706",
			"purorgName": "天海华北公司",
			"erpPurchasedeptId": "010101010706",
			"erpPurchasedeptVid": "010101010706",
			"purdeptCode": "FH002401",
			"purdeptName": "天海华北公司",
			"purdeptId": "010101010706",
			"erpPurchaserId": "0001A110000000003U4O",
			"purchaserCode": "FH002401",
			"purchaserName": "王采购",
			"purchaserId": "010101010706",
			"hfanorgName": "天海集团总公司",
			"hfanorgId": "2063331945255168",
			"erpCompanyId": "0001E210000000002O5P",
			"erpCompanyVid": "0001E210000000002O5O",
			"compCode": "01",
			"compName": "天海集团总公司",
			"erpFirstbillId": "YH156568411111",
			"erpSourcebillId": "YH0000ER0002111",
			"erpSourcebillType": "01",
			"bmakeuserName": "王采购员",
			"bmakeuserId": "010101010706",
			"signpsnName": "yc_18989999102",
			"signpsnId": "2090517",
			"hmemo": "签字",
			"balanceStatus": "\"-1\", \"未对账\";\"0\", \"一致\"; \"1\", \"差异\";\"2\", \"遗留\";\"3\", \"无需对账\"",
			"balanceTime": "2021-08-23 16:22:21",
			"balanceUserid": "010101010706",
			"balanceUsercode": "FH002401",
			"balanceUsername": "王采购员",
			"dr": "0：未删除  1：删除",
			"ts": "2021-08-23 16:22:21",
			"id": "123",
			"hid": "456",
			"erpSourceType": "1：ERP订单  2：跟单采购",
			"erpSourcetransType": "1：普通 2：备件",
			"erpSourceHid": "01010101075578",
			"erpSourceHno": "0101010107587",
			"erpSourceBid": "0101010107587",
			"erpSourceBno": "0001E210000000002O5P",
			"erpFirstbillType": "1：询价单 2：定标单",
			"erpFirsttransType": "1：普通  2：备件",
			"erpFirstbillHid": "0001E210000000002O5O",
			"erpFirstbillHno": "0001E2100000000",
			"erpFirstbillBid": "0001E21000000000ER02",
			"erpFirstbillBno": "10",
			"erpCompanyBid": "213256",
			"erpCompanyBvid": "54613265",
			"bcompCode": "01",
			"bcompName": "天海集团总公司",
			"erpReqstoorgId": "0001E210000000002O5O",
			"erpReqstoorgVid": "0001E210000000002O5O",
			"reqStkorgCode": "FH002401",
			"reqStkorgName": "天海集团总公司",
			"reqStkorgId": "54613265",
			"erpStockwh": "52423",
			"stkwhcode": "FH002401",
			"stkwhname": "天海集团",
			"erpReqwh": "45665642",
			"reqwhCode": "WH1245644",
			"reqwhName": "天海集团总公司",
			"erpMaterialSpe": "规格",
			"materialId": "2115836286832896",
			"materialCode": "401010026",
			"materialName": "维京米兰肠",
			"materialSpec": "规格",
			"materialModel": "型号",
			"brandId": "1452545",
			"brandCode": "PP200121",
			"confirmBrand": "双汇",
			"currencySymbol": "￥",
			"chargebackTaxMny": 22.2,
			"invoicedMainNum": 33,
			"contractNo": "CT221546112",
			"deliveryNo": "FH12454566456",
			"arriveNo": "DH22545565645",
			"purchaseUnitId": "",
			"mainUnitId": "",
			"unitId": "",
			"purchaseExchRate": 0,
			"priceExchRate": 0,
			"godownPurNum": 0,
			"erpPurUnit": ""
		}
	]
}

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
displayCode	string	否	异常码
message	string	否	信息 示例：操作成功
data	string	否	响应信息
code	string	否	成功编码 示例：200
message	string	否	返回信息 示例：操作成功
data	object	否	返回数据
result	string	否	成功 示例：success
msg	string	否	返回信息 示例：成功执行:1条;
successNum	string	否	成功条数 示例：1
successPk	string	是	成功对应的pk

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"result": "success",
		"msg": "成功执行:1条;",
		"successNum": "1",
		"successPk": [
			""
		]
	}
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
999	云采接收ERP补货数据失败	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-24	
更新
请求说明
新增
请求参数 (7)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

