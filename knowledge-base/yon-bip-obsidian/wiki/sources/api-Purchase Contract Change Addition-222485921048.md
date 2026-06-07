---
title: "采购合同变更详情查询"
apiId: "2224859210482974727"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Purchase Contract Change"
domain: "STC"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Purchase Contract Change]
platform_version: "BIP"
source_type: community-api-docs
---

# 采购合同变更详情查询

>  请求方式	POST | Purchase Contract Change (STC)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/cpu/contractChangenew/detail
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
id	string	否	否	采购合同变更id 示例：2226102182708510722

## 3. 请求示例

Url: /yonbip/cpu/contractChangenew/detail?access_token=访问令牌
Body: {
	"id": "2226102182708510722"
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
code	number
小数位数:0,最大长度:10	否	状态码 示例：200
message	string	否	返回消息 示例：操作成功
data	object	否	返回数据
id	string	否	变更单id 示例：2242528182054420487
code	string	否	合同编码 示例：CGHT20250410000004
subject	string	否	合同名称 示例：采购合同变更测试0410-005
collabStatus	number
小数位数:0,最大长度:10	否	协同状态，0：无需协同，1：待发布，2：待卖方确认，3：协同一致，4：卖方发起磋商，5：卖方已拒绝 示例：3
deptName	string	否	采购部门名称 示例：yx000部门1
secondPartyId	string	否	乙方id 示例：2197257525966405635
consultVersion	number
小数位数:0,最大长度:10	否	磋商版本 示例：1
modifierId	string	否	修改人id 示例：2195844120949293057
totalPartialMoney	number
小数位数:0,最大长度:10	否	部分预付总价 示例：0
quotaSupplys	number
小数位数:0,最大长度:10	否	quotaSupplys 示例：供应商报价家数
stockStampFileId	string	否	采购商盖章合同附件id 示例：b647f11d-45eb-44ea-9ae4-b95c43e78181
actualvalidate	string	否	合同生效日期 示例：2025-04-10 00:00:00
natCurrency	string	否	本币id 示例：2184781513546006532
parentContractName	string	否	父合同名称 示例：采购合同变更保存测试0410-004
signatureEffect	number
小数位数:0,最大长度:10	否	是否签章生效，0：否，1：是 示例：0
epayType	boolean	否	超合同付款，true：是，false：否 示例：false
currencyId	string	否	币种id 示例：2184781513546006532
CTHistoryHeaderDefine	object	否	采购合同变更特征属性组
eContractCreateType	string	否	合同生成方式，0：基于模板生成，1：非制式合同上传，2：不生成 示例：2
purPersonMobile	string	否	采购员手机号 示例：+86-17710311730
purPersonId	string	否	采购员id 示例：2195844120936710148
isWfControlled	boolean	否	是否受审批流控制 示例：false
deptId	string	否	采购部门id 示例：2195839903293505544
internalFileId	string	否	内控附件id 示例：2f2e8d9d-b737-4dba-a9cb-7f21daa10c94
signedFileId	string	否	采购商盖章合同附件id 示例：edae7cb6-93ef-4f1c-823e-8c762cbcf1c2
practicalPaymentmny	number
小数位数:8,最大长度:28	否	累计实付金额 示例：0
intendPaymentmny	number
小数位数:8,最大长度:28	否	累计付款金额 示例：0
supPersionId	string	否	供应商联系人id 示例：2197257525966405636
changingCommitterName	string	否	合同变更人 示例：1730员工
sourceType	string	否	合同来源，1：自制，3：询报价，4：招投标，5：期初补录，7：请购单，8：采购需求，9：委外申请单，10：竞拍 示例：5
natCurrency_priceDigit	number
小数位数:0,最大长度:10	否	本币单价精度 示例：4
moneyControlType	number
小数位数:0,最大长度:10	否	金额控制方式，0：不控制，1：整单控制 示例：0
exchRateType	string	否	汇率类型id 示例：0000M67RM84365MO010000
verifystate	number
小数位数:0,最大长度:10	否	审批状态，0：未提交审批，1：审批中，2：审批通过，3：不通过流程终止，4：驳回到制单 示例：0
subscribedate	string	否	合同签订日期 示例：2025-04-10 00:00:00
purUserId	string	否	采购员用户id 示例：1495181315211788288
cumulativeMoney	number
小数位数:0,最大长度:10	否	累计下单无税金额 示例：0
changingConfirmedDate	string	否	变更确认时间 示例：2025-04-10 13:58:26
taxlessPartialMoney	number
小数位数:0,最大长度:10	否	无税总价部分预付 示例：0
orgId	string	否	采购组织id 示例：2195839585465925640
CTHistoryHeaderDefine__id	string	否	采购合同变更特征属性组id 示例：2242528182054420488
supplierId_name	string	否	供应商名称 示例：gu-日常通用供应商02
offerType	string	否	价格类型，1：实价，2：浮动金额，3：浮动比例 示例：1
natCurrency_name	string	否	本币名称 示例：人民币
eContractServiceType	string	否	合同服务类型，0：友云采电子合同，1：平台电子合同 示例：1
serviceConfirMode	string	否	服务确认方式,0：按物料明细确认，1：按付款协议确认 示例：0
supplyType	number
小数位数:0,最大长度:10	否	供应商类型 示例：0
exchRateDate	string	否	汇率日期 示例：2025-04-10 00:00:00
ctjlCode	string	否	合同台账编码 示例：2025000222
pubts	string	否	时间戳 示例：2025-04-10 13:58:26
createDate	string	否	创建日期 示例：2025-04-10 00:00:00
creator	string	否	创建人 示例：1730员工
totalFullMoney	number
小数位数:8,最大长度:28	否	全额预付总价 示例：0
transactionTypeId	string	否	交易类型id 示例：2200130472522547200
natTaxMoney	number
小数位数:8,最大长度:28	否	本币价税合计 示例：1000
exchRateType_name	string	否	汇率类型名称 示例：基准汇率
currencySymbol	string	否	币种符号 示例：?
ctjlId	string	否	合同台账ID 示例：2242526326630121477
eContractWordFileId	string	否	电子合同word附件id 示例：a4e9e13a-feaf-4a57-ab33-1a0cd2d35a98
parentContractId	string	否	父合同id 示例：2242522761805692934
agentConfirmPersonId	string	否	代确认人id 示例：2195844120936710148
createTime	string	否	创建时间 示例：2025-04-10 13:57:21
supPersonMobile	string	否	供应商联系人手机号 示例：15830328736
dealPsnName	string	否	处理人名称 示例：1730员工
signOffline	number
小数位数:0,最大长度:10	否	是否线下签署，0：否，1：是 示例：0
changingStatus	string	否	变更状态，11：变更审批中，14：取消发布，18：卖方已变更，20：已生效，22：审批驳回，23：签章拒签，24：审批中，25：变更保存，26：变更签章待提交，27：变更签章中，6：卖方已接受，7：卖方已拒绝，8：买方已确认，9：待卖方确认 示例：6
orgScope	number
小数位数:0,最大长度:10	否	适用于所有组织，0：否，1：是 示例：0
currencyCode	string	否	币种编码 示例：CNY
natMoney	number
小数位数:8,最大长度:28	否	本币无税总金额 示例：884.96
ts	string	否	时间戳 示例：2025-04-10 13:56:01
modifier	string	否	修改人 示例：1730员工
agentConfirmDate	string	否	代确认时间 示例：2025-04-10 13:58:26
supMsgNotifierId	string	否	乙方联系人id 示例：2197257525966405636
dealPsnId	string	否	处理人id 示例：2195844120936710148
pricedigit	number
小数位数:0,最大长度:10	否	价格精度 示例：4
transtypeName	string	否	交易类型名称 示例：导入交易类型A
modifyTime	string	否	修改时间 示例：2025-04-10 13:58:03
isAllowAdjustPrice	string	否	允许订单调价，0：否，1：是 示例：0
totalnum	number
小数位数:8,最大长度:28	否	总数量 示例：100
supPersionName	string	否	供应商联系人名称 示例：谷晓珍
settlementBasis	string	否	结算依据 示例：0
moneyRatio	number
小数位数:0,最大长度:10	否	金额超量比例% 示例：0
consultTemplateId	string	否	采购磋商模板id 示例：2242528379639693319
nonStandardFileId	string	否	非制式合同附件id 示例：8d85066c-f783-4950-b7bc-082e42001c46
orgName	string	否	采购组织名称 示例：yx000
modifyDate	string	否	修改日期 示例：2025-04-10 00:00:00
fbillstatus	string	否	审批状态，0：未提交，1：审批中，2：审批通过，3：审批拒绝 示例：0
billstatus	string	否	单据状态，-1：作废，0：期初补录，1：待买方推单，2：买方已推单，3：待买方确认，4：卖方变更中，5：卖方已变更，6：卖方已接受，7：卖方已拒绝，8：买方已确认，9：买方变更中，10：买方已变更，11：买方审批中，12：买方已审批，13：已废弃，14：取消发布，15：合同已删除，16：合同已关闭，17：待卖方确认，18：卖方已变更，19：已推送ERP，20：已生效，21：已终止，22：审批驳回，23：签章拒签，32：已冻结 示例：20
supMsgNotifierName	string	否	乙方联系人 示例：谷晓珍
executionStatus	number
小数位数:0,最大长度:10	否	执行状态，0：未执行，1：部分执行，2：已完成 示例：0
taxMoney	number
小数位数:8,最大长度:28	否	含税金额 示例：1000
ctChangeStatus	number
小数位数:0,最大长度:10	否	合同变更状态，0：开立，1：已生效，2：已关闭，3：已终止，4：已作废，5：审核中，6：已审核，7：协同中，8：协同完成，20：变更保存，21：变更中 示例：21
natCurrency_moneyDigit	number
小数位数:0,最大长度:10	否	本币金额精度 示例：2
isMaterialClass	boolean	否	物料分类合同，是：true，否：false 示例：false
ctTransTypeId	string	否	采购合同交易类型id 示例：2200130472522547200
isPushPaycontract	boolean	否	是否推支出合同 示例：false
chgStateFileId	string	否	履约状态变更附件id 示例：8b44ee61-276d-4a31-8d1d-8daaf46b20c1
exchRateType_Digit	number
小数位数:0,最大长度:10	否	汇率类型精度 示例：6
natCurrency_code	string	否	本币编码 示例：CNY
externalFileId	string	否	对外附件id 示例：16ea3a21-5786-4339-a9a2-023b886636fc
supplierId	string	否	供应商id 示例：2197257525966405635
creatorId	string	否	创建人id 示例：2195844120949293057
exchRate	number
小数位数:8,最大长度:28	否	汇率 示例：1
cumulativeTaxMoney	number
小数位数:8,最大长度:28	否	累计下单含税金额 示例：0
saleStampFileId	string	否	供应商盖章合同附件id 示例：39c2b30b-190e-45a6-8159-5aa05c56627c
taxlessFullMoney	number
小数位数:8,最大长度:28	否	无税总价全额预付 示例：0
secondPartyName	string	否	乙方名称 示例：gu-日常通用供应商02
modifiedtime	string	否	修改时间 示例：2025-04-10 13:53:44
billtype	string	否	合同性质，1：框架协议，2：普通合同 示例：2
firstPartyId	string	否	甲方id 示例：2195839585465925640
currencyName	string	否	币种名称 示例：人民币
pushPaycontractStatus	string	否	推支出合同状态，0：无需生成，1：待生成，2：生成中，3：已生成，4：生成失败，11：变更待生成 示例：0
moneydigit	number
小数位数:0,最大长度:10	否	金额精度 示例：2
execType	string	否	可超数量执行，是：1，否：0 示例：0
transtypeId	string	否	采购合同交易类型id 示例：2200130472522547200
accPayApplyMoney	number
小数位数:8,最大长度:28	否	累计付款申请金额 示例：0
otherStampFileId	string	否	其他需签署附件id 示例：f7a9a1b6-b70f-439e-ba1d-68a156aeedc7
eContractbCanModify	boolean	否	电子合同可编辑，false：否，true：是， 示例：false
bAllowConsult	boolean	否	是否与供应商磋商，false：否，true：是 示例：true
changingVersion	string	否	变更版本 示例：1
advanceRatio	number
小数位数:0,最大长度:10	否	预付比例 示例：0
agentConfirmPersonName	string	否	代确认人 示例：1730员工（代供方接受）
natCurrency_priceRount	number
小数位数:0,最大长度:10	否	本币单价舍人 示例：4
changingCommittedDate	string	否	合同变更时间 示例：2025-04-10 13:58:02
purPersonName	string	否	采购员名称 示例：1730员工
saleFileId	string	否	供应商附件id 示例：09c5021a-e4d9-4003-b0c1-b5332f4900b5
effectContract	string	否	是否需要与供应商协同，1：是，2：否 示例：1
money	number
小数位数:8,最大长度:28	否	无税金额 示例：884.96
controlType	string	否	签订形式，0：标准合同，1：单价合同，2：数量合同，3：金额合同 示例：0
eContractFileId	string	否	电子合同附件id 示例：d2551c1a-1469-43f4-a5ab-e95062e077ca
firstPartyName	string	否	甲方名称 示例：yx000
contractId	string	否	原合同id 示例：2242525252886724616
supplierSupName	string	否	供应商名称 示例：gu-日常通用供应商02
transtypeCode	string	否	交易类型编码 示例：ExcelA
changingConfirmerName	string	否	变更确认人 示例：1730员工
parentContractno	string	否	父合同编码 示例：CGHT20250410000003
businessType	string	否	业务类型，0：普通，1：VMI，2：全程委外，3：工序委外 示例：0
isMultiParty	string	否	是否多方合同，0：否，1：是 示例：0
originaContract	object	否	原合同数据
contractMaterialList	object	是	物料子表信息
contractPartyList	object	是	合同签署方子表
contractScopeList	object	是	合同执行组织范围
contractExpList	object	否	合同费用
contractPayTermList	object	否	付款协议信息
contractPrepayList	object	否	采购合同付款单

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"id": "2242528182054420487",
		"code": "CGHT20250410000004",
		"subject": "采购合同变更测试0410-005",
		"collabStatus": 3,
		"deptName": "yx000部门1",
		"secondPartyId": "2197257525966405635",
		"consultVersion": 1,
		"modifierId": "2195844120949293057",
		"totalPartialMoney": 0,
		"quotaSupplys": NaN,
		"stockStampFileId": "b647f11d-45eb-44ea-9ae4-b95c43e78181",
		"actualvalidate": "2025-04-10 00:00:00",
		"natCurrency": "2184781513546006532",
		"parentContractName": "采购合同变更保存测试0410-004",
		"signatureEffect": 0,
		"epayType": false,
		"currencyId": "2184781513546006532",
		"CTHistoryHeaderDefine": {},
		"eContractCreateType": "2",
		"purPersonMobile": "+86-17710311730",
		"purPersonId": "2195844120936710148",
		"isWfControlled": false,
		"deptId": "2195839903293505544",
		"internalFileId": "2f2e8d9d-b737-4dba-a9cb-7f21daa10c94",
		"signedFileId": "edae7cb6-93ef-4f1c-823e-8c762cbcf1c2",
		"practicalPaymentmny": 0,
		"intendPaymentmny": 0,
		"supPersionId": "2197257525966405636",
		"changingCommitterName": "1730员工",
		"sourceType": "5",
		"natCurrency_priceDigit": 4,
		"moneyControlType": 0,
		"exchRateType": "0000M67RM84365MO010000",
		"verifystate": 0,
		"subscribedate": "2025-04-10 00:00:00",
		"purUserId": "1495181315211788288",
		"cumulativeMoney": 0,
		"changingConfirmedDate": "2025-04-10 13:58:26",
		"taxlessPartialMoney": 0,
		"orgId": "2195839585465925640",
		"CTHistoryHeaderDefine__id": "2242528182054420488",
		"supplierId_name": "gu-日常通用供应商02",
		"offerType": "1",
		"natCurrency_name": "人民币",
		"eContractServiceType": "1",
		"serviceConfirMode": "0",
		"supplyType": 0,
		"exchRateDate": "2025-04-10 00:00:00",
		"ctjlCode": "2025000222",
		"pubts": "2025-04-10 13:58:26",
		"createDate": "2025-04-10 00:00:00",
		"creator": "1730员工",
		"totalFullMoney": 0,
		"transactionTypeId": "2200130472522547200",
		"natTaxMoney": 1000,
		"exchRateType_name": "基准汇率",
		"currencySymbol": "?",
		"ctjlId": "2242526326630121477",
		"eContractWordFileId": "a4e9e13a-feaf-4a57-ab33-1a0cd2d35a98",
		"parentContractId": "2242522761805692934",
		"agentConfirmPersonId": "2195844120936710148",
		"createTime": "2025-04-10 13:57:21",
		"supPersonMobile": "15830328736",
		"dealPsnName": "1730员工",
		"signOffline": 0,
		"changingStatus": "6",
		"orgScope": 0,
		"currencyCode": "CNY",
		"natMoney": 884.96,
		"ts": "2025-04-10 13:56:01",
		"modifier": "1730员工",
		"agentConfirmDate": "2025-04-10 13:58:26",
		"supMsgNotifierId": "2197257525966405636",
		"dealPsnId": "2195844120936710148",
		"pricedigit": 4,
		"transtypeName": "导入交易类型A",
		"modifyTime": "2025-04-10 13:58:03",
		"isAllowAdjustPrice": "0",
		"totalnum": 100,
		"supPersionName": "谷晓珍",
		"settlementBasis": "0",
		"moneyRatio": 0,
		"consultTemplateId": "2242528379639693319",
		"nonStandardFileId": "8d85066c-f783-4950-b7bc-082e42001c46",
		"orgName": "yx000",
		"modifyDate": "2025-04-10 00:00:00",
		"fbillstatus": "0",
		"billstatus": "20",
		"supMsgNotifierName": "谷晓珍",
		"executionStatus": 0,
		"taxMoney": 1000,
		"ctChangeStatus": 21,
		"natCurrency_moneyDigit": 2,
		"isMaterialClass": false,
		"ctTransTypeId": "2200130472522547200",
		"isPushPaycontract": false,
		"chgStateFileId": "8b44ee61-276d-4a31-8d1d-8daaf46b20c1",
		"exchRateType_Digit": 6,
		"natCurrency_code": "CNY",
		"externalFileId": "16ea3a21-5786-4339-a9a2-023b886636fc",
		"supplierId": "2197257525966405635",
		"creatorId": "2195844120949293057",
		"exchRate": 1,
		"cumulativeTaxMoney": 0,
		"saleStampFileId": "39c2b30b-190e-45a6-8159-5aa05c56627c",
		"taxlessFullMoney": 0,
		"secondPartyName": "gu-日常通用供应商02",
		"modifiedtime": "2025-04-10 13:53:44",
		"billtype": "2",
		"firstPartyId": "2195839585465925640",
		"currencyName": "人民币",
		"pushPaycontractStatus": "0",
		"moneydigit": 2,
		"execType": "0",
		"transtypeId": "2200130472522547200",
		"accPayApplyMoney": 0,
		"otherStampFileId": "f7a9a1b6-b70f-439e-ba1d-68a156aeedc7",
		"eContractbCanModify": false,
		"bAllowConsult": true,
		"changingVersion": "1",
		"advanceRatio": 0,
		"agentConfirmPersonName": "1730员工（代供方接受）",
		"natCurrency_priceRount": 4,
		"changingCommittedDate": "2025-04-10 13:58:02",
		"purPersonName": "1730员工",
		"saleFileId": "09c5021a-e4d9-4003-b0c1-b5332f4900b5",
		"effectContract": "1",
		"money": 884.96,
		"controlType": "0",
		"eContractFileId": "d2551c1a-1469-43f4-a5ab-e95062e077ca",
		"firstPartyName": "yx000",
		"contractId": "2242525252886724616",
		"supplierSupName": "gu-日常通用供应商02",
		"transtypeCode": "ExcelA",
		"changingConfirmerName": "1730员工",
		"parentContractno": "CGHT20250410000003",
		"businessType": "0",
		"isMultiParty": "0",
		"originaContract": {
			"id": "2242528182054420487",
			"billno": "CGHT20250410000004",
			"subject": "采购合同变更测试0410-005",
			"collabStatus": 3,
			"deptName": "yx000部门1",
			"secondPartyId": "2197257525966405635",
			"consultVersion": 1,
			"modifierId": "2195844120949293057",
			"totalPartialMoney": 0,
			"quotaSupplys": NaN,
			"stockStampFileId": "b647f11d-45eb-44ea-9ae4-b95c43e78181",
			"actualvalidate": "2025-04-10 00:00:00",
			"natCurrency": "2184781513546006532",
			"parentContractName": "采购合同变更保存测试0410-004",
			"signatureEffect": 0,
			"epayType": false,
			"currencyId": "2184781513546006532",
			"CTHistoryHeaderDefine": {},
			"eContractCreateType": "2",
			"purPersonMobile": "+86-17710311730",
			"purPersonId": "2195844120936710148",
			"isWfControlled": false,
			"deptId": "2195839903293505544",
			"internalFileId": "2f2e8d9d-b737-4dba-a9cb-7f21daa10c94",
			"signedFileId": "edae7cb6-93ef-4f1c-823e-8c762cbcf1c2",
			"practicalPaymentmny": 0,
			"intendPaymentmny": 0,
			"supPersionId": "2197257525966405636",
			"changingCommitterName": "1730员工",
			"sourceType": "5",
			"natCurrency_priceDigit": 4,
			"moneyControlType": 0,
			"exchRateType": "0000M67RM84365MO010000",
			"verifystate": 0,
			"subscribedate": "2025-04-10 00:00:00",
			"purUserId": "1495181315211788288",
			"cumulativeMoney": 0,
			"changingConfirmedDate": "2025-04-10 13:58:26",
			"taxlessPartialMoney": 0,
			"orgId": "2195839585465925640",
			"supplierId_name": "gu-日常通用供应商02",
			"offerType": "1",
			"natCurrency_name": "人民币",
			"eContractServiceType": "1",
			"serviceConfirMode": "0",
			"supplyType": 0,
			"exchRateDate": "2025-04-10 00:00:00",
			"ctjlCode": "2025000222",
			"pubts": "2025-04-10 13:58:26",
			"createDate": "2025-04-10 00:00:00",
			"creator": "1730员工",
			"totalFullMoney": 0,
			"transactionTypeId": "2200130472522547200",
			"natTaxMoney": 1000,
			"exchRateType_name": "基准汇率",
			"currencySymbol": "?",
			"ctjlId": "2242526326630121477",
			"eContractWordFileId": "a4e9e13a-feaf-4a57-ab33-1a0cd2d35a98",
			"parentContractId": "2242522761805692934",
			"agentConfirmPersonId": "2195844120936710148",
			"createTime": "2025-04-10 13:57:21",
			"supPersonMobile": "15830328736",
			"dealPsnName": "1730员工",
			"signOffline": 0,
			"changingStatus": "6",
			"orgScope": 0,
			"currencyCode": "CNY",
			"natMoney": 884.96,
			"ts": "2025-04-10 13:56:01",
			"modifier": "1730员工",
			"agentConfirmDate": "2025-04-10 13:58:26",
			"supMsgNotifierId": "2197257525966405636",
			"dealPsnId": "2195844120936710148",
			"pricedigit": 4,
			"transtypeName": "导入交易类型A",
			"modifyTime": "2025-04-10 13:58:03",
			"isAllowAdjustPrice": "0",
			"totalnum": 100,
			"supPersionName": "谷晓珍",
			"settlementBasis": "0",
			"moneyRatio": 0,
			"consultTemplateId": "2242528379639693319",
			"nonStandardFileId": "8d85066c-f783-4950-b7bc-082e42001c46",
			"orgName": "yx000",
			"modifyDate": "2025-04-10 00:00:00",
			"fbillstatus": "0",
			"billstatus": "20",
			"supMsgNotifierName": "谷晓珍",
			"executionStatus": 0,
			"taxMoney": 1000,
			"ctChangeStatus": 21,
			"natCurrency_moneyDigit": 2,
			"isMaterialClass": false,
			"ctTransTypeId": "2200130472522547200",
			"isPushPaycontract": false,
			"chgStateFileId": "8b44ee61-276d-4a31-8d1d-8daaf46b20c1",
			"exchRateType_Digit": 6,
			"natCurrency_code": "CNY",
			"externalFileId": "16ea3a21-5786-4339-a9a2-023b886636fc",
			"supplierId": "2197257525966405635",
			"creatorId": "2195844120949293057",
			"exchRate": 1,
			"cumulativeTaxMoney": 0,
			"saleStampFileId": "39c2b30b-190e-45a6-8159-5aa05c56627c",
			"taxlessFullMoney": 0,
			"secondPartyName": "gu-日常通用供应商02",
			"modifiedtime": "2025-04-10 13:53:44",
			"billtype": "2",
			"firstPartyId": "2195839585465925640",
			"currencyName": "人民币",
			"pushPaycontractStatus": "0",
			"moneydigit": 2,
			"execType": "0",
			"transtypeId": "2200130472522547200",
			"accPayApplyMoney": 0,
			"otherStampFileId": "f7a9a1b6-b70f-439e-ba1d-68a156aeedc7",
			"eContractbCanModify": false,
			"bAllowConsult": true,
			"changingVersion": "1",
			"advanceRatio": 0,
			"agentConfirmPersonName": "1730员工（代供方接受）",
			"natCurrency_priceRount": 4,
			"changingCommittedDate": "2025-04-10 13:58:02",
			"purPersonName": "1730员工",
			"saleFileId": "09c5021a-e4d9-4003-b0c1-b5332f4900b5",
			"effectContract": "1",
			"money": 884.96,
			"controlType": "0",
			"eContractFileId": "d2551c1a-1469-43f4-a5ab-e95062e077ca",
			"firstPartyName": "yx000",
			"supplierSupName": "gu-日常通用供应商02",
			"transtypeCode": "ExcelA",
			"changingConfirmerName": "1730员工",
			"parentContractno": "CGHT20250410000003",
			"businessType": "0",
			"isMultiParty": "0",
			"contractMaterialList": [
				{
					"gift": "0",
					"natTaxPrice": 10,
					"materialIdFile": "2184805462273163273",
					"mainNum": 100,
					"materialClassName": "自动化_采购物料分类",
					"num": 100,
					"mainMetrologyName": "千克",
					"natTax": 115.04,
					"accomplishedQuantity": 0,
					"contractMetarialId": "2242525252886724617",
					"price": 8.8496,
					"rowNum": 1,
					"unitCode": "KGM",
					"unit_code": "KGM",
					"id": "2242528182054420489",
					"enableExecNum": 100,
					"purchaseUnitId": "2184793067018518538",
					"taxrate": "13",
					"natPrice": 8.8496,
					"priceValidateStartdate": "2025-04-10 00:00:00",
					"executionStatus": 0,
					"tax": 115.04,
					"materialClassCode": "CGY001",
					"takerOrgId": "2195839585465925640",
					"materialId": "2184805462273163273",
					"taxMoney": 1000,
					"materialName": "自动化_采购物料",
					"unit": "千克",
					"purchaseDigit": 2,
					"purchaseExchRate": 1,
					"isOnShelf": true,
					"discountTaxType": 0,
					"contractHistoryId": "2242528182054420487",
					"taxCategoryId": "10004",
					"takerOrgName": "yx000",
					"ContractBodyNewVOFreeCharacteristics": {
						"ytenant": "0000M67RM84365MO010000",
						"id": "2242528182054420491",
						"pubts": "2025-04-10 13:57:21"
					},
					"materialId_model": "型号1",
					"priceExchRate": 1,
					"unitDigit": 2,
					"ContractBodyNewVODefineCharacter__id": "2242528182054420490",
					"materialId_modelDescription": "规格1",
					"takerOrgCode": "yx000",
					"mainMetrologyCode": "KGM",
					"unit_precision": 2,
					"materialClassId": "2184805436524331023",
					"natTaxMoney": 1000,
					"materialCode": "zidonghua001",
					"purchaseUnitName": "千克",
					"mainMetrologyId": "2184793067018518538",
					"money": 884.96,
					"unitid": "2184793067018518538",
					"taxPrice": 10,
					"ContractBodyNewVODefineCharacter": {
						"ytenant": "0000M67RM84365MO010000",
						"id": "2242528182054420490",
						"pubts": "2025-04-10 13:57:21"
					},
					"purchaseNum": 100,
					"mainDigit": 2,
					"natMoney": 884.96,
					"priceMark": 0,
					"accomplishedPurchaseNum": 0,
					"accomplishedPriceNum": 0,
					"spec": "规格1",
					"model": "型号1",
					"purchaseExchRateNum": 1,
					"purchaseExchRateDen": 1,
					"priceExchRateNum": 1,
					"priceExchRateDen": 1
				}
			],
			"contractPartyList": [
				{
					"id": "",
					"contractId": "",
					"ContractSignPartyHistoryChd": {},
					"supplydocId": "2197257525966405635",
					"supplydocId_name": "gu-日常通用供应商02",
					"type": "1"
				}
			],
			"contractScopeList": [
				{
					"id": "2242528182054420494",
					"contractId": "",
					"puorgId": "2195839585465925640",
					"puorgName": "yx000",
					"puorgCode": "yx000",
					"ts": "2025-04-10 13:51:41"
				}
			],
			"contractExpList": {
				"id": "",
				"contractId": "",
				"expcode": "",
				"expname": "",
				"expsum": 0,
				"memo": "",
				"ts": ""
			},
			"contractPayTermList": {
				"id": "",
				"contractId": "",
				"payPeriod": 0,
				"payPointId": "",
				"payPoint": "",
				"payPointName": "",
				"payPointAfterDay": 0,
				"payRatio": 0,
				"payTaxMoney": 0,
				"advancePay": 0,
				"shelf": 0,
				"settleTypeId": "",
				"settleType": "",
				"settleTypeName": "",
				"memo": "",
				"defaultValueEditable": true,
				"changingInfo": "",
				"initialDate": "",
				"intendPaymentmny": 0,
				"practicalPaymentmny": 0,
				"accPayApplyMoney": 0,
				"prServiceConfirmMoney": 0,
				"prePayType": "",
				"isProgressConfirm": "",
				"payName": "",
				"delayDay": 0,
				"delayMonth": 0,
				"payPointAfterDayNew": 0,
				"outDay": "",
				"outDayType": "",
				"fixedoutDay": 0,
				"fixedoutDay1": 0,
				"fixedoutDay2": 0,
				"fixedoutDay3": 0,
				"fixedoutDay4": 0,
				"dueDate": "",
				"dueDateType": "",
				"fixedexpireDay": 0,
				"fixedexpireDay1": 0,
				"fixedexpireDay2": 0,
				"fixedexpireDay3": 0,
				"fixedexpireDay4": 0,
				"totalPayContractMoney": 0,
				"CtPayTermCharacterDefine": {}
			},
			"contractPrepayList": {
				"id": 0,
				"contractId": 0,
				"contractPaytermId": 0,
				"serialNumber": 0,
				"payPeriod": 0,
				"payPoint": "",
				"payPointName": "",
				"payPointAfterDay": 0,
				"takerOrgId": "",
				"takerOrgCode": "",
				"takerOrgName": "",
				"payRatio": 0,
				"payTaxMoney": 0,
				"advancePay": true,
				"settleTypeId": "",
				"settleType": "",
				"settleTypeName": "",
				"initialDate": "2025-04-10 00:00:00",
				"dueDate": "2025-04-10 00:00:00",
				"intendPaymentmny": 0,
				"practicalPaymentmny": 0,
				"accPayApplyMoney": 0,
				"ts": ""
			}
		},
		"contractMaterialList": [
			{
				"gift": "0",
				"natTaxPrice": 10,
				"materialIdFile": "2184805462273163273",
				"mainNum": 100,
				"materialClassName": "自动化_采购物料分类",
				"num": 100,
				"mainMetrologyName": "千克",
				"natTax": 115.04,
				"accomplishedQuantity": 0,
				"contractMetarialId": "2242525252886724617",
				"price": 8.8496,
				"rowNum": 1,
				"unitCode": "KGM",
				"unit_code": "KGM",
				"id": "2242528182054420489",
				"enableExecNum": 100,
				"purchaseUnitId": "2184793067018518538",
				"taxrate": "13",
				"natPrice": 8.8496,
				"priceValidateStartdate": "2025-04-10 00:00:00",
				"executionStatus": 0,
				"tax": 115.04,
				"materialClassCode": "CGY001",
				"takerOrgId": "2195839585465925640",
				"materialId": "2184805462273163273",
				"taxMoney": 1000,
				"materialName": "自动化_采购物料",
				"unit": "千克",
				"purchaseDigit": 2,
				"purchaseExchRate": 1,
				"isOnShelf": true,
				"discountTaxType": 0,
				"contractHistoryId": "2242528182054420487",
				"taxCategoryId": "10004",
				"takerOrgName": "yx000",
				"ContractBodyNewVOFreeCharacteristics": {
					"ytenant": "0000M67RM84365MO010000",
					"id": "2242528182054420491",
					"pubts": "2025-04-10 13:57:21"
				},
				"materialId_model": "型号1",
				"priceExchRate": 1,
				"unitDigit": 2,
				"ContractBodyNewVODefineCharacter__id": "2242528182054420490",
				"materialId_modelDescription": "规格1",
				"takerOrgCode": "yx000",
				"mainMetrologyCode": "KGM",
				"unit_precision": 2,
				"materialClassId": "2184805436524331023",
				"natTaxMoney": 1000,
				"materialCode": "zidonghua001",
				"purchaseUnitName": "千克",
				"mainMetrologyId": "2184793067018518538",
				"money": 884.96,
				"unitid": "2184793067018518538",
				"taxPrice": 10,
				"ContractBodyNewVODefineCharacter": {
					"ytenant": "0000M67RM84365MO010000",
					"id": "2242528182054420490",
					"pubts": "2025-04-10 13:57:21"
				},
				"purchaseNum": 100,
				"mainDigit": 2,
				"natMoney": 884.96,
				"priceMark": 0,
				"accomplishedPurchaseNum": 0,
				"accomplishedPriceNum": 0,
				"spec": "规格1",
				"model": "型号1",
				"purchaseExchRateNum": 1,
				"purchaseExchRateDen": 1,
				"priceExchRateNum": 1,
				"priceExchRateDen": 1
			}
		],
		"contractPartyList": [
			{
				"contractPartySignId": "2242525252886724620",
				"ContractSignPartyHistoryChd": {
					"ytenant": "0000M67RM84365MO010000",
					"id": "2242528182054420493",
					"pubts": "2025-04-10 13:57:21"
				},
				"ContractSignPartyHistoryChd__id": "2242528182054420493",
				"supplydocId": "2197257525966405635",
				"id": "2242528182054420492",
				"supplydocId_name": "gu-日常通用供应商02",
				"type": "1",
				"contractHistoryId": "2242528182054420487"
			}
		],
		"contractScopeList": [
			{
				"contractId": "2242525252886724616",
				"puorgId": "2195839585465925640",
				"id": "2242528182054420494",
				"puorgName": "yx000",
				"puorgCode": "yx000",
				"contractOrgId": "2242525252886724622",
				"contractHistoryId": "2242528182054420487",
				"ts": "2025-04-10 13:51:41"
			}
		],
		"contractExpList": {
			"id": 0,
			"contractId": 0,
			"expcode": "",
			"expname": "",
			"expsum": 0,
			"memo": "",
			"ts": "",
			"contractHistoryId": 0,
			"contractExpId": 0
		},
		"contractPayTermList": {
			"id": 0,
			"contractId": 0,
			"contractHistoryId": 0,
			"payPeriod": 0,
			"payPointId": "",
			"payPoint": "",
			"payPointName": "",
			"payPointAfterDay": 0,
			"payRatio": 0,
			"payTaxMoney": 0,
			"advancePay": 0,
			"shelf": 0,
			"settleTypeId": "",
			"settleType": "",
			"settleTypeName": "",
			"memo": "",
			"defaultValueEditable": true,
			"changingInfo": "",
			"initialDate": "",
			"intendPaymentmny": 0,
			"practicalPaymentmny": 0,
			"accPayApplyMoney": 0,
			"prServiceConfirmMoney": 0,
			"prePayType": "",
			"isProgressConfirm": "",
			"payName": "",
			"delayDay": 0,
			"delayMonth": 0,
			"payPointAfterDayNew": 0,
			"outDay": "",
			"outDayType": "",
			"fixedoutDay": 0,
			"fixedoutDay1": 0,
			"fixedoutDay2": 0,
			"fixedoutDay3": 0,
			"fixedoutDay4": 0,
			"dueDate": "",
			"dueDateType": "",
			"fixedexpireDay": 0,
			"fixedexpireDay1": 0,
			"fixedexpireDay2": 0,
			"fixedexpireDay3": 0,
			"fixedexpireDay4": 0,
			"totalPayContractMoney": 0,
			"CtPayTermCharacterDefine": {}
		},
		"contractPrepayList": {
			"id": 0,
			"contractId": 0,
			"contractHistoryId": 0,
			"contractPrepayId": 0,
			"contractPaytermId": 0,
			"serialNumber": 0,
			"payPeriod": 0,
			"payPoint": "",
			"payPointName": "",
			"payPointAfterDay": 0,
			"takerOrgId": "",
			"takerOrgCode": "",
			"takerOrgName": "",
			"payRatio": 0,
			"payTaxMoney": 0,
			"advancePay": true,
			"settleTypeId": "",
			"settleType": "",
			"settleTypeName": "",
			"initialDate": "2025-04-10 00:00:00",
			"dueDate": "2025-04-10 00:00:00",
			"intendPaymentmny": 0,
			"practicalPaymentmny": 0,
			"accPayApplyMoney": 0,
			"ts": ""
		}
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
999	采购合同变更查询失败	查询失败原因

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2026-01-22	
新增
返回参数 (8)
更新
返回参数 (176)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

