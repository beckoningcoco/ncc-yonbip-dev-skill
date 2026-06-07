---
title: "采购订单协同详情查询"
apiId: "957e966fb07f4b6fa1a43d7445a38f4f"
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

# 采购订单协同详情查询

>  请求方式	POST | Procure-to-Pay (SCC)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/cpu/puorder/getPurOrder
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
orderid	string	否	否	云采采购订单id（orderid，ordercode选其一必填） 示例：100135971
ordercode	string	否	否	云采采购订单编码（orderid，ordercode选其一必填） 示例：202201120002

## 3. 请求示例

Url: /yonbip/cpu/puorder/getPurOrder?access_token=访问令牌
Body: {
	"orderid": "100135971",
	"ordercode": "202201120002"
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
code	long	否	返回状态码 示例：200
message	string	否	返回信息 示例：查询成功
data	object	否	返回数据
deptName	string	否	采购部门名称 示例：总公司采购部
corpSubAccount	string	否	ERP采购员编码 示例：2430238099837186
changeDeptId	string	否	变更采购部门id 示例：454646
changeRejectReason	string	否	变更拒绝理由
erpProductVersion	string	否	ERP产品及版本
signatureEffect	boolean	否	是否启用电子签章 示例：false
currencyId	string	否	币种id 示例：G001ZM0000DEFAULTCURRENCT00000000001
invalidateTime	string	否	作废时间 示例：2022-02-12 15:18:57
sendErpMsg	string	否	发送到ERP的成功失败信息 示例：发送erp成功
deptId	long	否	采购部门id 示例：2430225189441792
confirmUser	string	否	确认人id 示例：4797956
sourceType	string	否	订单来源-1：定标生单 2：ERP上传 3：超市订单 4：云采自建 5：协议直采 6：合同生单 7：跟单采购 8：协议直采自动化 示例：5
ectBillCode	string	否	电子订单编号 示例：22
purContentType	string	否	采购内容编码 示例：235646
gmtModified	long	否	修改时间 示例：1644907528000
receivingRemark	string	否	收货备注 示例：收货
isConQuantity	string	否	是否允许确认数量 0 : 不允许 1：允许 示例：0
projectDocId	string	否	项目Id 示例：454665454545
projectDocCode	string	否	项目编码 示例：code001
settleMethod	string	否	结算方式id 示例：124646
vreason	string	否	供应商拒绝/变更理由 示例：拒绝
updateAfterIsGenEleOrder	string	否	修改订单后是否更新了电子订单，默认空，修改数据时赋值0 代表未更新，生成电子订单后更新为1 示例：0
signatureFailMessage	string	否	签章失败原因 示例：签章失败原因
transactionTypeId	string	否	交易类型：普通是1 vmi是2 示例：1
ectOldFilePath	string	否	旧电子合同文件路径 示例：旧电子合同文件路径
confirmUserName	string	否	确认人名称 示例：采购员修改
currencySymbol	string	否	币种符号 示例：￥
transactionTypeName	string	否	交易类型名称 示例：普通采购
settleMethodName	string	否	结算方式 示例：现金结算
invalidatePer	string	否	作废人 示例：采购员修改
bankAccountLink	string	否	联行号 示例：4799898
supEnterpriseName	string	否	供应商的租户名称 示例：云采测试专用供应商02（yctest_gys02)
dealPsnName	string	否	处理人名称 示例：采购员修改
currencyCode	string	否	币种编码 示例：CNY
ts	long	否	时间戳 示例：1644907528000
erpprojectName	string	否	erp项目名称 示例：erp项目
agentConfirmDate	string	否	代确认时间 示例：2022-02-12 15:18:57
dealPsnId	long	否	处理人id 示例：596137
buyerConfirOpinion	string	否	买方确认意见 示例：确认
area	string	否	区域 示例：区域
bankAccount	string	否	银行账号 示例：7664645489799798978
orderSourceId	string	否	erp订单id 示例：1216464646
bankType	string	否	银行类型编码 示例：code002
supMsgNotifierPhone	string	否	供应商消息通知人手机 示例：18989999102
ectOldBillCode	string	否	旧电子订单编号 示例：cd8423423
agentConfirmUser	long	否	代确认人id 示例：596137
isContract	string	否	是否需要协同 0 : 不需要 1：需要 示例：1
bankId	string	否	来源银行档案库id 示例：242
ectOldTemplateCode	string	否	旧电子合同模板编号 示例：1
sendErpCode	string	否	推送ERP状态 “3”表示已推送成功 “2”表示推送失败 示例：3 示例：3
paymentAgreementId	string	否	付款协议id 示例：212
isConPrice	string	否	是否允许确认单价 0-不允许 1-允许 示例：0
paymentAgreementCode	string	否	付款协议code 示例：de33
transactionTypeCode	string	否	交易类型code 示例：21-01
settlementMethod	string	否	结算方式 (含预付比例) 示例：预付比例
settleMethodCode	string	否	结算方式编码 示例：code2233
purchasePhone	string	否	采购员电话 示例：18989999102
ectFilePath	string	否	电子合同文件路径 示例：1
supplyPersionName	string	否	供应商联系人名称 示例：gys02
agentConfirmUserName	string	否	代确认人名称 示例：采购员修改
transportType	string	否	运输方式编码 示例：code99
closeUser	string	否	关闭用户姓名 示例：采购员修改
changeTransportName	string	否	变更运输方式名称 示例：轮船
confirmDate	string	否	确认时间 示例：2022-02-12 15:18:57
businessType	long	否	业务类型 示例：1
busitype	string	否	业务流 示例：14
orderstatus	string	否	订单状态 示例：1
refReaStatus	string	否	拒绝理由状态 示例：0
memo	string	否	备注 示例：memo
bankTypeName	string	否	银行类型名称 示例：建行
id	long	否	订单id 示例：2075432
notaxMoney	long	否	含税金额 示例：55
totalMoney	long	否	总金额 示例：55
changeDeptName	string	否	变更采购部门名称 示例：采购部
isEffective	string	否	是否变更生效过 0: 没有 1：有 示例：0
purEnterpriseName	string	否	采购商企业名称 示例：0913生产旗舰采购云友企连
projectDocName	string	否	项目名称 示例：项目1
paymentAgreementName	string	否	付款协议名称 示例：付款协议001
purchaseName	string	否	采购员姓名 示例：采购员修改
changeStatusName	string	否	变更状态 示例：未变更
changeTransportType	string	否	变更运输方式编码 示例：001
supplyPhone	string	否	供应商电话 示例：18989999102
orgId	long	否	采购组织id 示例：2430224905195777
bankCode	string	否	银行编码 示例：001
priceType	string	否	价格类型 示例：1
gmtCreate	long	否	创建时间 示例：1644650337000
buyofferSubject	string	否	寻源项目名称（询价单标题） 示例：询价单001
corpAccount	string	否	外系统企业账号(ERP组织编码) 示例：1464
enterpriseId	long	否	采购商id 示例：254050
transportName	string	否	运输方式名称 示例：火车
orderno	string	否	云采订单编码 示例：PO202202120001
subject	string	否	订单标题 示例：协议直采
dealPsnPhone	string	否	处理人联系方式 示例：18989999102
supMsgNotifierId	long	否	供应商消息通知人id 示例：2430295141372160
orderTime	long	否	订单日期 示例：1644650337000
pkSupplier	string	否	nc供应商档案主键 示例：1001A2100000000004MV
orgName	string	否	采购组织名称 示例：天海总公司
billstatus	string	否	单据审批状态 示例：1
supMsgNotifierName	string	否	供应商消息通知人名称 示例：gys02
orderOtherId	string	否	订单编号(来源于其他系统)
invalidateMemo	string	否	作废备注 示例：作废备注
supOperatorName	string	否	供应商操作人名称 示例：gys02
creater	string	否	创建人 示例：采购员修改
buyerConfirName	string	否	买方确认人名称 示例：gys02
changeStatus	string	否	变更子状态 未变更 : 0 待卖方确认变更 : 1 卖方拒绝变更 : 2 变更已生效 : 3 示例：0
invoicerName	string	否	发票方 示例：云采测试专用供应商02（yctest_gys02)
supplierId	long	否	供应商档案id 示例：2430294500135168
accountName	string	否	银行账号名称 示例：建行
bankName	string	否	开户银行 示例：建行
prepaidRatio	string	否	预付比例 示例：0E-8
signatureStatus	string	否	签章状态：待签章、签章中、签章拒签、签章通过（签章失败时，状态变为待签章） 示例：待签章
currencyName	string	否	币种名称 示例：人民币
closeTime	string	否	关闭时间 示例：2022-02-12 15:18:57
supplierName	string	否	供应商 示例：云采测试专用供应商02（yctest_gys02)
changeMemo	string	否	变更备注 示例：memo
orderSource	string	否	订单来源标识 示例：云采
supOperationDate	string	否	供应商操作时间 示例：2022-02-12 15:18:57
buyerConfirTime	string	否	买方确认时间 示例：2022-02-12 15:18:57
supEnterpriseId	long	否	供应商的租户id 示例：218629
purOrderPayTermList	object	否	付款协议子表
detailEntityList	object	是	订单子表
field1	string	否	系统自定义项1，可用来做拓展业务，记录字段
field2	string	否	field2
field3	string	否	field3
field4	string	否	field4
field5	string	否	field5
field6	string	否	field6
field7	string	否	field7
field8	string	否	field8
field9	string	否	field9
field10	string	否	field10
field11	string	否	field11
field12	string	否	field12
field13	string	否	field13
field14	string	否	field14
field15	string	否	field15
field16	string	否	field16
field17	string	否	field17
field18	string	否	field18
field19	string	否	field19
field20	string	否	field20
define1	string	否	平台自定义项1，可用来做拓展业务，记录字段
define2	string	否	define2
define3	string	否	define3
define4	string	否	define4
define5	string	否	define5
define6	string	否	define6
define7	string	否	define7
define8	string	否	define8
define9	string	否	define9
define10	string	否	define10
define11	string	否	define11
define12	string	否	define12
define13	string	否	define13
define14	string	否	define14
define15	string	否	define15
define16	string	否	define16
define17	string	否	define17
define18	string	否	define18
define19	string	否	define19
define20	string	否	define20
define21	string	否	define21
define22	string	否	define22
define23	string	否	define23
define24	string	否	define24
define25	string	否	define25
define26	string	否	define26
define27	string	否	define27
define28	string	否	define28
define29	string	否	define29
define30	string	否	define30
define31	string	否	define31
define32	string	否	define32
define33	string	否	define33
define34	string	否	define34
define35	string	否	define35
define36	string	否	define36
define37	string	否	define37
define38	string	否	define38
define39	string	否	define39
define40	string	否	define40
define41	string	否	define41
define42	string	否	define42
define43	string	否	define43
define44	string	否	define44
define45	string	否	define45
define46	string	否	define46
define47	string	否	define47
define48	string	否	define48
define49	string	否	define49
define50	string	否	define50
define51	string	否	define51
define52	string	否	define52
define53	string	否	define53
define54	string	否	define54
define55	string	否	define55
define56	string	否	define56
define57	string	否	define57
define58	string	否	define58
define59	string	否	define59
define60	string	否	define60

## 5. 正确返回示例

{
	"code": 200,
	"message": "查询成功",
	"data": {
		"deptName": "总公司采购部",
		"corpSubAccount": "2430238099837186",
		"changeDeptId": "454646",
		"changeRejectReason": "",
		"erpProductVersion": "",
		"signatureEffect": false,
		"currencyId": "G001ZM0000DEFAULTCURRENCT00000000001",
		"invalidateTime": "2022-02-12 15:18:57",
		"sendErpMsg": "发送erp成功",
		"deptId": 2430225189441792,
		"confirmUser": "4797956",
		"sourceType": "5",
		"ectBillCode": "22",
		"purContentType": "235646",
		"gmtModified": 1644907528000,
		"receivingRemark": "收货",
		"isConQuantity": "0",
		"projectDocId": "454665454545",
		"projectDocCode": "code001",
		"settleMethod": "124646",
		"vreason": "拒绝",
		"updateAfterIsGenEleOrder": "0",
		"signatureFailMessage": "签章失败原因",
		"transactionTypeId": "1",
		"ectOldFilePath": "旧电子合同文件路径",
		"confirmUserName": "采购员修改",
		"currencySymbol": "￥",
		"transactionTypeName": "普通采购",
		"settleMethodName": "现金结算",
		"invalidatePer": "采购员修改",
		"bankAccountLink": "4799898",
		"supEnterpriseName": "云采测试专用供应商02（yctest_gys02)",
		"dealPsnName": "采购员修改",
		"currencyCode": "CNY",
		"ts": 1644907528000,
		"erpprojectName": "erp项目",
		"agentConfirmDate": "2022-02-12 15:18:57",
		"dealPsnId": 596137,
		"buyerConfirOpinion": "确认",
		"area": "区域",
		"bankAccount": "7664645489799798978",
		"orderSourceId": "1216464646",
		"bankType": "code002",
		"supMsgNotifierPhone": "18989999102",
		"ectOldBillCode": "cd8423423",
		"agentConfirmUser": 596137,
		"isContract": "1",
		"bankId": "242",
		"ectOldTemplateCode": "1",
		"sendErpCode": "3",
		"paymentAgreementId": "212",
		"isConPrice": "0",
		"paymentAgreementCode": "de33",
		"transactionTypeCode": "21-01",
		"settlementMethod": "预付比例",
		"settleMethodCode": "code2233",
		"purchasePhone": "18989999102",
		"ectFilePath": "1",
		"supplyPersionName": "gys02",
		"agentConfirmUserName": "采购员修改",
		"transportType": "code99",
		"closeUser": "采购员修改",
		"changeTransportName": "轮船",
		"confirmDate": "2022-02-12 15:18:57",
		"businessType": 1,
		"busitype": "14",
		"orderstatus": "1",
		"refReaStatus": "0",
		"memo": "memo",
		"bankTypeName": "建行",
		"id": 2075432,
		"notaxMoney": 55,
		"totalMoney": 55,
		"changeDeptName": "采购部",
		"isEffective": "0",
		"purEnterpriseName": "0913生产旗舰采购云友企连",
		"projectDocName": "项目1",
		"paymentAgreementName": "付款协议001",
		"purchaseName": "采购员修改",
		"changeStatusName": "未变更",
		"changeTransportType": "001",
		"supplyPhone": "18989999102",
		"orgId": 2430224905195777,
		"bankCode": "001",
		"priceType": "1",
		"gmtCreate": 1644650337000,
		"buyofferSubject": "询价单001",
		"corpAccount": "1464",
		"enterpriseId": 254050,
		"transportName": "火车",
		"orderno": "PO202202120001",
		"subject": "协议直采",
		"dealPsnPhone": "18989999102",
		"supMsgNotifierId": 2430295141372160,
		"orderTime": 1644650337000,
		"pkSupplier": "1001A2100000000004MV",
		"orgName": "天海总公司",
		"billstatus": "1",
		"supMsgNotifierName": "gys02",
		"orderOtherId": "",
		"invalidateMemo": "作废备注",
		"supOperatorName": "gys02",
		"creater": "采购员修改",
		"buyerConfirName": "gys02",
		"changeStatus": "0",
		"invoicerName": "云采测试专用供应商02（yctest_gys02)",
		"supplierId": 2430294500135168,
		"accountName": "建行",
		"bankName": "建行",
		"prepaidRatio": "0E-8",
		"signatureStatus": "待签章",
		"currencyName": "人民币",
		"closeTime": "2022-02-12 15:18:57",
		"supplierName": "云采测试专用供应商02（yctest_gys02)",
		"changeMemo": "memo",
		"orderSource": "云采",
		"supOperationDate": "2022-02-12 15:18:57",
		"buyerConfirTime": "2022-02-12 15:18:57",
		"supEnterpriseId": 218629,
		"purOrderPayTermList": {
			"memo": "付款协议",
			"payTaxMoney": 55,
			"dr": 0,
			"purOrderId": 2075432,
			"sourcePayTermId": "12415",
			"payTermDetailId": "4564",
			"payPeriod": 1,
			"id": 163065,
			"payPoint": "NotSet",
			"enterpriseName": "0913生产旗舰采购云友企连",
			"settleTypeName": "现金返利",
			"payRatio": 100,
			"saleOrderPayTermId": "154646",
			"advancePay": true,
			"shelf": true,
			"payPointAfterDay": 11,
			"payPointName": "不设起算日、到期日",
			"rowStatus": "删除",
			"enterpriseId": 254050,
			"settleType": "system_0003",
			"ts": 1644907529000
		},
		"detailEntityList": [
			{
				"productModel": "型号",
				"changeReqContact": "采购员",
				"changeReqOrgName": "采购组织",
				"mainMetrologyName": "个",
				"purchaseUnitCode": "ge",
				"deliverAddress": "北京",
				"changeActive": "0",
				"inwhNum": "0",
				"changeMaterialCode": "001",
				"diffReceivedNum": "0",
				"contractMaterialId": 3346115,
				"materialclassId": "312316",
				"changePurQuantity": "0",
				"actualMoney": "11",
				"noTaxAssPrice": 55,
				"contractRowNum": 1,
				"fisactive": "1",
				"conTaxPrice": 55,
				"requireBrand": "华为",
				"changeQuantity": "0",
				"changeProductIid": "",
				"giftsFlag": "0",
				"changeReqContactId": "001",
				"assUnit": "个",
				"reqDate": 1640563200000,
				"recvstor": "仓库1",
				"requireBrandCode": "code001",
				"productSpec": "物料规格",
				"executionStatusCode": "001",
				"fisactiveName": "正常",
				"settlementType": "2022-02-12 15:18:57",
				"changeProductModel": "型号5",
				"receiveOrgName": "天海总公司",
				"materialSpec": "物料规格",
				"rowRefuseReason": "拒绝",
				"materialCode": "0001AMINO-THIOU",
				"reqOrgName": "天海总公司",
				"mainMetrologyId": "",
				"unitid": "2430301273560832",
				"lineNum": 1,
				"changeBrand": "三星",
				"reqDeptName": "总公司采购部",
				"countInContract": 113,
				"invoiceClose": "0",
				"mainNum": 1,
				"contractBillno": "CT20211016K59B0001",
				"exchangeRate": 1,
				"rowRefReaStatus": "1",
				"recPeople": "王采购员",
				"purchaseUnitId": "12121",
				"priceSignNum": 0,
				"isMaterialClass": "0",
				"changeReqDeptId": "154646",
				"projectName": "项目1",
				"purchaseExchRate": 1,
				"projectId": "121",
				"materialModel": "物料型号",
				"isBarcodeMng": 0,
				"pritemId": 4545334,
				"conPrice": 55,
				"conQuantity": 1,
				"mainMetrologyCode": "code001",
				"receiveOrgId": 2430224905195777,
				"purInwhNum": "0",
				"changeProductName": "2-氨基-5-甲基噻唑",
				"changeBrandId": "0",
				"reqContactId": 2430238099837186,
				"arriveClose": "0",
				"signNum": 0,
				"changeMainQuantity": "0",
				"contractId": 371410,
				"taxPrice": 55,
				"contactWay": "18989999102",
				"memo": "memo",
				"productName": "2-氨基-5-甲基噻唑",
				"price": 55,
				"requireBrandErpId": "1545646",
				"unitCode": "code001",
				"id": 10209675,
				"materialclassName": "第六十三个分类",
				"changeBrandCode": "code001",
				"conMainQuantity": 1,
				"closeOrderReason": "理由",
				"paymentClose": "0",
				"changePlanDeliverDate": "2022-02-12 15:18:57",
				"totalPrice": 55,
				"materialBrand": "华为",
				"diffStorageNum": "0",
				"projectCode": "code001",
				"godownClose": "0",
				"refArea": "北京",
				"reqOrgId": 2430224905195777,
				"confirmBrandErpId": "2430678678605195777",
				"priceInwhNum": "0",
				"conPurQuantity": 1,
				"arrivedateSupconfirm": "2022-02-12 15:18:57",
				"purchaseNum": 1,
				"istorestatus": "1",
				"changeBrandErpId": 2430224905195777,
				"changeReqOrgId": 2430224905195777,
				"pricedecidetailid": 12456,
				"requireBrandId": 4235423,
				"buyofferdetailid": 564,
				"floatMoney": 0,
				"taxrate": 0,
				"finalClose": 0,
				"executionStatus": "已执行",
				"productIid": "2430301863793664",
				"productDescribe": "型号",
				"reqContact": "王采购员",
				"confirmBrandCode": "code001",
				"receivePersonId": 2430238099837186,
				"unit": "个",
				"changeReqDeptName": "采购部门",
				"changeUnit": "条",
				"taxAmount": 55,
				"reqDeptId": 5431534534,
				"priceExchRate": 1,
				"confirmBrand": "华为",
				"assPrice": 55,
				"confirmBrandId": 3121231243,
				"planDeliverDate": "2022-02-12 15:18:57",
				"SignNum": 0,
				"reqPurUser": "王采购员",
				"deliverEnterprise": "用友",
				"changeMemo": "备注",
				"amount": 55,
				"purSignNum": 0,
				"quantity": 1,
				"rowConMessage": "13",
				"purchaseUnitName": "个",
				"deliveredNum": 0,
				"floatProp": "0",
				"materialclassCode": "code003",
				"field1": "",
				"field2": "",
				"field3": "",
				"field4": "",
				"field5": "",
				"field6": "",
				"field7": "",
				"field8": "",
				"field9": "",
				"field10": "",
				"field11": "",
				"field12": "",
				"field13": "",
				"field14": "",
				"field15": "",
				"field16": "",
				"field17": "",
				"field18": "",
				"field19": "",
				"field20": "",
				"define1": "",
				"define2": "",
				"define3": "",
				"define4": "",
				"define5": "",
				"define6": "",
				"define7": "",
				"define8": "",
				"define9": "",
				"define10": "",
				"define11": "",
				"define12": "",
				"define13": "",
				"define14": "",
				"define15": "",
				"define16": "",
				"define17": "",
				"define18": "",
				"define19": "",
				"define20": "",
				"define21": "",
				"define22": "",
				"define23": "",
				"define24": "",
				"define25": "",
				"define26": "",
				"define27": "",
				"define28": "",
				"define29": "",
				"define30": "",
				"define31": "",
				"define32": "",
				"define33": "",
				"define34": "",
				"define35": "",
				"define36": "",
				"define37": "",
				"define38": "",
				"define39": "",
				"define40": "",
				"define41": "",
				"define42": "",
				"define43": "",
				"define44": "",
				"define45": "",
				"define46": "",
				"define47": "",
				"define48": "",
				"define49": "",
				"define50": "",
				"define51": "",
				"define52": "",
				"define53": "",
				"define54": "",
				"define55": "",
				"define56": "",
				"define57": "",
				"define58": "",
				"define59": "",
				"define60": ""
			}
		],
		"field1": "",
		"field2": "",
		"field3": "",
		"field4": "",
		"field5": "",
		"field6": "",
		"field7": "",
		"field8": "",
		"field9": "",
		"field10": "",
		"field11": "",
		"field12": "",
		"field13": "",
		"field14": "",
		"field15": "",
		"field16": "",
		"field17": "",
		"field18": "",
		"field19": "",
		"field20": "",
		"define1": "",
		"define2": "",
		"define3": "",
		"define4": "",
		"define5": "",
		"define6": "",
		"define7": "",
		"define8": "",
		"define9": "",
		"define10": "",
		"define11": "",
		"define12": "",
		"define13": "",
		"define14": "",
		"define15": "",
		"define16": "",
		"define17": "",
		"define18": "",
		"define19": "",
		"define20": "",
		"define21": "",
		"define22": "",
		"define23": "",
		"define24": "",
		"define25": "",
		"define26": "",
		"define27": "",
		"define28": "",
		"define29": "",
		"define30": "",
		"define31": "",
		"define32": "",
		"define33": "",
		"define34": "",
		"define35": "",
		"define36": "",
		"define37": "",
		"define38": "",
		"define39": "",
		"define40": "",
		"define41": "",
		"define42": "",
		"define43": "",
		"define44": "",
		"define45": "",
		"define46": "",
		"define47": "",
		"define48": "",
		"define49": "",
		"define50": "",
		"define51": "",
		"define52": "",
		"define53": "",
		"define54": "",
		"define55": "",
		"define56": "",
		"define57": "",
		"define58": "",
		"define59": "",
		"define60": ""
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
201	错误详细信息	

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

