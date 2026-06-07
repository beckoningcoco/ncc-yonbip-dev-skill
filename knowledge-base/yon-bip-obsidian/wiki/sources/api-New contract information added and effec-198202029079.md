---
title: "合同信息新增并生效"
apiId: "1982020290794749960"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Contract Registration"
domain: "CLMS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Contract Registration]
platform_version: "BIP"
source_type: community-api-docs
---

# 合同信息新增并生效

>  请求方式	POST | Contract Registration (CLMS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/CLMS/v1.0/contract/createAndForce
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	否	是	合同数据
_status	string	否	否	单据状态 目前仅支持Insert 示例：Insert 默认值：Insert
orgId	string	否	否	签约组织ID，签约组织编码和签约组织ID至少录入一项，签约组织编码和签约组织ID同时存在时，以ID为准，varchar(36)，来源档案：ucf-org-center.org_pure_tree_ref 示例：1817417739359748103
orgId___code	string	否	否	签约组织编码 示例：qwert
type	string	否	否	合同类型ID，合同类型编码和合同类型ID同时存在时，以ID为准，varchar(22)，来源档案：DZHTFW.econtract.contractType 示例：1862442766275444739
type___code	string	否	否	合同类型编码 示例：zuzhi2
bustype	string	否	否	交易类型ID，交易类型编码和交易类型ID同时存在时，以ID为准，varchar(36)，来源档案：bd.bill.TransType 示例：1818179305792864264
bustype___code	string	否	否	交易类型编码 示例：WZLCGHT
serialNumber	string	否	否	合同流水号，合同台账的单据编码规则为自动编码+手工可改时，以传入的此字段为准，varchar(200) 示例：000013
code	string	否	否	合同编号，varchar(200) 示例：0000001 默认值：单据编码规则为自动编码+手工可改时，以传入的此字段为准
econtractTempId	string	否	否	合同模板ID，合同模板编码和合同模板ID同时存在时，以ID为准，varchar(22)，来源档案：DZHTFW.econtract.econtractTemplate 示例：1853639388987654150
beginningFlag	string	否	否	期初标记，0：非期初合同，1：期初合同 示例：0 默认值：0
efileMode	string	否	否	文件模式，1：有文件模式，2：无文件模式 示例：2 默认值：2
econtractTempId___code	string	否	否	合同模板编码 示例：000001
econtractVersion	string	否	否	合同模板版本ID(即历史版本ID)，合同模板版本编号和合同模板版本ID同时存在时，以ID为准，varchar(200) 示例：1868538544649666560
econtractVersion___versionNo	string	否	否	合同模板版本编号 示例：v1
currencyId	string	否	否	币种ID，币种编码和币种ID同时存在时，以ID为准，varchar(36)，来源档案：bd.currencytenant.CurrencyTenantVO 示例：1817179643556921384
currencyId___code	string	否	否	币种编码 示例：EUR
signSubjectId	string	否	否	承办组织ID，承办组织编码和承办组织ID同时存在时，以ID为准，varchar(256)，来源档案：aa.baseorg.OrgMV 示例：1817417739359748103
signSubjectId___code	string	否	否	承办组织编码 示例：qwert
settleOrgid	string	否	否	结算组织ID，结算组织编码和结算组织ID同时存在时，以ID为准，varchar(36)，来源档案：org.func.FinanceOrg 示例：1817417739359748103
settleOrgid___code	string	否	否	结算组织编码 示例：qwert
deptId	string	否	否	承办部门ID，承办部门编码和承办部门ID同时存在时，以ID为准，varchar(36)，来源档案：bd.adminOrg.AdminOrgVO 示例：1817417979877916676
deptId___code	string	否	否	承办部门编码 示例：assddfg
personId	string	否	否	承办人ID，承办人编码和承办人ID同时存在时，以ID为准，varchar(36)，来源档案：bd.staff.StaffNew 示例：1873882695134609417
personId___code	string	否	否	承办人编码(即员工编码) 示例：00000006
signDate	Date	否	否	合同签订日期(格式:YYYY-MM-DD)，char(10) 示例：2023-11-09
createMethod	string	否	否	合同生成方式 1-标准合同 0-非标准合同 目前仅支持标准合同 示例：1 默认值：1
maintenanceType	string	否	否	维护类型 1-新合同 2-历史合同 目前仅支持新合同 示例：1 默认值：1
title	string	否	否	合同名称，varchar(200) 示例：我的120602
mny	BigDecimal	否	否	合同金额，decimal(32,8) 示例：345
physicalStamp	string	否	否	物理印章ID，物理印章编码和物理印章ID同时存在时，以ID为准，varchar(22)，DZHTFW.econtract.physicalStamp 示例：1858901033172860937
physicalStamp___code	string	否	否	物理印章编码 示例：000002
settleAccountType	string	否	否	结算方式ID，结算方式编码和结算方式ID同时存在时，以ID为准，bigint(20)，来源档案：aa.settlemethod.SettleMethod 示例：1817180167541359459
settleAccountType___code	string	否	否	结算方式编码 示例：system_0004
lawType	string	否	否	法律类别ID，法律类别编码和法律类别ID同时存在时，以ID为准，varchar(22)，来源档案：DZHTFW.econtract.contractLegalType 示例：L0001
lawType___code	string	否	否	法律类别编码 示例：L0001
ctClass	string	否	否	合同性质 1-普通合同 2-框架协议 示例：1 默认值：1
isMaterial	string	否	否	物料分类合同 1-是 0-否 示例：0 默认值：0
concludeType	string	否	否	签订类型 1-新签 2-续签 3-变更 4-其他 示例：1 默认值：1
contractFileStatus	string	否	否	合同归档状态 0-未归档 1-已归档 目前仅支持未归档 示例：0 默认值：0
ctPeriod	string	否	否	合同期限 0-固定期限 1-无固定期限 示例：1 默认值：1
reDirection	string	否	否	收支方向 0-无 1-收款 2-付款 示例：0 默认值：0
isHaveTax	string	否	否	合同金额是否含税 1-是 0-否 示例：1 默认值：1
importantLevel	string	否	否	重要程度 1-一般 2-普通 3-重大 示例：2 默认值：2
secretLevel	string	否	否	密级 1-公开 2-限制 3-秘密 4-机密 5-绝密 示例：0 默认值：0
urgentLevel	string	否	否	紧急程度 1-一般 2-紧急 3-特急 示例：1 默认值：1
isOpenContract	string	否	否	是否开口合同 1-是 0-否 示例：0 默认值：0
isBackDate	string	否	否	是否倒签 1-是 0-否 示例：0 默认值：0
signType	string	否	否	签署方式 0-不签署 1-电子签署 2-线下签署 示例：0 默认值：0
bWatermark	string	否	否	是否无水印 1-是 0-否 示例：0 默认值：0
valiDate	Date	否	否	合同生效日期(格式:YYYY-MM-DD)，char(10) 示例：2023-11-09
planValidate	Date	否	否	计划生效日期(格式:YYYY-MM-DD)，char(10) 示例：2023-11-16
planInvallidate	Date	否	否	计划失效日期(格式:YYYY-MM-DD)，char(10) 示例：2023-11-16
invaliDate	Date	否	否	合同终止日期(格式:YYYY-MM-DD)，char(10) 示例：2023-11-16
signAddress	string	否	否	签订地点，varchar(200) 示例：北京
ctSummary	string	否	否	合同概要，varchar(200) 示例：合同概要
performAddress	string	否	否	履约地点，varchar(200) 示例：用友
memo	string	否	否	备注，varchar(200) 示例：合同备注
appendix	string	否	否	附件，longtext 示例：3e1222233750-0603-11ef-8740-bd6d5b7a6fb2
projectId	number
小数位数:0,最大长度:20	否	否	关联项目 ID，关联项目 ID 和关联项目编码同时存在时，以ID 为准，varchar(36)，来源档案：bd.project.ProjectVO 示例：1934726980662697984
projectId___code	string	否	否	关联项目编码 示例：01
contractId	string	否	否	关联合同 ID，关联合同 ID 和关联合同编码同时存在时，以ID 为准，varchar(22)，来源档案：CLM.clmContract.clm_contract 示例：1836037540662697984
contractId___code	string	否	否	关联合同编码 示例：ceshi
wbs	string	否	否	WBS ID，WBS ID 和WBS编码同时存在时，以ID 为准，varchar(22)，来源档案：yonbip-pm-commonbd.wbs_doc_ref 示例：1920464175173206017
wbs___code	string	否	否	WBS编码 示例：1920464175161671682
exchangeRate	string	否	是	汇率,decimal(32,8) 示例：1
taxAmount	string	否	否	税额（有标的物明细时必传），decimal(32,8)
clm_contract_counterpartList	object	是	是	合同相对方
clm_contract_rectermList	object	是	否	收款协议
clm_appointmentList	object	是	否	履约计划
clm_contract_paytermList	object	是	否	付款协议
clm_contract_itemList	object	是	否	标的物明细
clmEventRecordList	object	是	否	合同大事记
fileobject	object	否	否	文本对象，如果是期初合同，合同文件配置id固定值，即："contractfileConfigId"：2196510613857894400，且期初接口仅允许上传两个文件，一个正文，一个附件

## 3. 请求示例

Url: /yonbip/CLMS/v1.0/contract/createAndForce?access_token=访问令牌
Body: {
	"data": {
		"_status": "Insert",
		"orgId": "1817417739359748103",
		"orgId___code": "qwert",
		"type": "1862442766275444739",
		"type___code": "zuzhi2",
		"bustype": "1818179305792864264",
		"bustype___code": "WZLCGHT",
		"serialNumber": "000013",
		"code": "0000001",
		"econtractTempId": "1853639388987654150",
		"beginningFlag": "0",
		"efileMode": "2",
		"econtractTempId___code": "000001",
		"econtractVersion": "1868538544649666560",
		"econtractVersion___versionNo": "v1",
		"currencyId": "1817179643556921384",
		"currencyId___code": "EUR",
		"signSubjectId": "1817417739359748103",
		"signSubjectId___code": "qwert",
		"settleOrgid": "1817417739359748103",
		"settleOrgid___code": "qwert",
		"deptId": "1817417979877916676",
		"deptId___code": "assddfg",
		"personId": "1873882695134609417",
		"personId___code": "00000006",
		"signDate": "2023-11-09",
		"createMethod": "1",
		"maintenanceType": "1",
		"title": "我的120602",
		"mny": 345,
		"physicalStamp": "1858901033172860937",
		"physicalStamp___code": "000002",
		"settleAccountType": "1817180167541359459",
		"settleAccountType___code": "system_0004",
		"lawType": "L0001",
		"lawType___code": "L0001",
		"ctClass": "1",
		"isMaterial": "0",
		"concludeType": "1",
		"contractFileStatus": "0",
		"ctPeriod": "1",
		"reDirection": "0",
		"isHaveTax": "1",
		"importantLevel": "2",
		"secretLevel": "0",
		"urgentLevel": "1",
		"isOpenContract": "0",
		"isBackDate": "0",
		"signType": "0",
		"bWatermark": "0",
		"valiDate": "2023-11-09",
		"planValidate": "2023-11-16",
		"planInvallidate": "2023-11-16",
		"invaliDate": "2023-11-16",
		"signAddress": "北京",
		"ctSummary": "合同概要",
		"performAddress": "用友",
		"memo": "合同备注",
		"appendix": "3e1222233750-0603-11ef-8740-bd6d5b7a6fb2",
		"projectId": 1934726980662697984,
		"projectId___code": "01",
		"contractId": "1836037540662697984",
		"contractId___code": "ceshi",
		"wbs": "1920464175173206017",
		"wbs___code": "1920464175161671682",
		"exchangeRate": "1",
		"taxAmount": "",
		"clm_contract_counterpartList": [
			{
				"_status": "Insert",
				"merchantType": "2",
				"customerId": "1836012980662697984",
				"customerId___code": "00000000000001",
				"supplierId": "1824945133389348867",
				"supplierId___code": "0001000001"
			}
		],
		"clm_contract_rectermList": [
			{
				"_status": "Insert",
				"type": "1817179652154195991",
				"type___code": "1",
				"condition": "收款",
				"paymentScale": 100,
				"planPaymentMny": 4141.32,
				"planPaymentDate": "2023-11-09",
				"upToDate": "2023-11-09",
				"mny": 4141.32,
				"memo": "收款协议备注",
				"feature": ""
			}
		],
		"clm_appointmentList": [
			{
				"_status": "Insert",
				"name": "我的计划",
				"planEndDate": "2023-11-10",
				"accomState": "true",
				"endDate": "2023-11-10",
				"accomRemark": "计划备注"
			}
		],
		"clm_contract_paytermList": [
			{
				"_status": "Insert",
				"type": "1817179652154195993",
				"type___code": "5",
				"payCondition": "付款",
				"payRatio": 0,
				"planPayDate": "2023-11-09",
				"payDate": "2023-11-09",
				"planPayMoney": 222,
				"payMoney": 222,
				"memo": "付款协议备注",
				"feature": "特征值"
			}
		],
		"clm_contract_itemList": [
			{
				"_status": "Insert",
				"materialId": "1845463824254107656",
				"materialId___code": "0001000001",
				"unitId": "1845463248728489991",
				"unitId___code": "A001",
				"num": 1,
				"taxRate": "10001",
				"taxRate___code": "VATR6",
				"taxprice": 10,
				"taxmny": 10,
				"price": 10,
				"tax": 0,
				"mny": 10
			}
		],
		"clmEventRecordList": [
			{
				"_status": "Insert",
				"code": "002",
				"content": "我的大事记",
				"remark": "大事记备注"
			}
		],
		"fileobject": {
			"createType": "2",
			"contractfileConfigId": "-1",
			"clmContractFileDetailList": [
				{
					"fileBussinessid": "3e133750-0603-11ef-8740-bd6d5b7a6fb2",
					"fileClass": "1",
					"docDefClass": "销售合同",
					"fileMakeWay": "3",
					"contractTemplateId": "1855846246166560776",
					"contractTemplateVersionId": "1855846254756495360",
					"fileExtention": "2",
					"extractionResultId": "ext0001",
					"attachmentClass": "1",
					"clmconfigDetail_id": "1975412208627613707",
					"clmphaseDetail_id": "1975412208627613710"
				}
			]
		}
	}
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
code	string	否	状态码 示例：200
message	string	否	状态信息 示例：操作成功
data	object	否	返回数据
busiObj	string	否	业务对象 示例：clmContract
memo	string	否	备注 示例：合同备注
ctSummary	string	否	合同概要 示例：合同概要
type	string	否	合同类型id，来源档案：DZHTFW.econtract.contractType 示例：1852916168056635392
valiDate	string	否	合同生效日期 示例：2023-11-09
signSubjectId	string	否	签约组织id，来源档案：aa.baseorg.OrgMV 示例：1809173068584583170
planInvallidate	string	否	计划失效日期 示例：2023-11-16
feature	string	否	合同基本信息特征
urgentLevel	string	否	紧急程度 1-一般 2-紧急 3-特急 示例：1
serialNumber	string	否	合同编号
signType	string	否	签署方式 0-不签署 1-电子签署 2-线下签署 示例：0
clm_contract_counterpartList	object	是	合同相对方
id	string	否	合同id 示例：1858893345170391047
clm_contract_rectermList	object	是	收款协议
clm_contract_paytermList	object	是	付款协议
deptId	string	否	部门id，来源档案：bd.adminOrg.AdminOrgVO 示例：1809173334883565572
version	string	否	合同版本号 示例：0
secretLevel	string	否	密级 1-公开 2-限制 3-秘密 4-机密 5-绝密 示例：0
concludeType	string	否	签订类型 1-新签 2-续签 3-变更 4-其他 示例：1
personId	string	否	承办人id，来源档案：bd.staff.StaffNew 示例：1857970073239552010
ctPeriod	string	否	合同期限 0-固定期限 1-无固定期限 示例：0
clm_contract_itemList	object	是	标的物明细
orgId	string	否	主组织id，来源档案：ucf-org-center.org_pure_tree_ref 示例：1809173068584583170
contractFileStatus	string	否	合同归档状态 0-未归档 1-已归档 示例：0
econtractTempId	string	否	合同模板id，来源档案：DZHTFW.econtract.econtractTemplate 示例：1810748342340681731
ctClass	string	否	合同性质 1-普通合同 2-框架协议 示例：1
creator	string	否	创建人id 示例：00001951-7ca3-47ac-a462-d5a66e3e6724
isBackDate	string	否	是否倒签 示例：0
businessFileId	string	否	合同文本附件id
importantLevel	string	否	重要程度 1-一般 2-普通 3-重大 示例：2
reDirection	string	否	收支方向 0-无 1-收款 2-付款 示例：0
clm_appointmentList	object	是	履约计划
signAddress	string	否	签订地点 示例：北京
createMethod	string	否	合同生成方式 示例：1
signDate	string	否	合同签订日期 示例：2023-11-09
settleAccountType	string	否	结算方式id，来源档案：aa.settlemethod.SettleMethod 示例：1809147754069360760
invaliDate	string	否	合同终止日期 示例：2023-11-16
maintenanceType	string	否	维护类型 示例：1
lawType	string	否	法律类别id，来源档案：DZHTFW.econtract.contractLegalType 示例：1846082600192442376
performAddress	string	否	履约地点 示例：用友
ytenantId	string	否	租户id 示例：0000LM4K5NIS40WWEG0000
isHaveTax	string	否	合同金额是否含税 1-是 0-否 示例：1
settleOrgid	string	否	结算组织id，来源档案：org.func.FinanceOrg 示例：1810592246039314440
code	string	否	合同编码 示例：005468
title	string	否	合同名称 示例：我的组织翻1译2334
planValidate	string	否	计划生效日期 示例：2023-11-16
finalizeStatus	string	否	定稿状态 示例：0
econtractVersion	string	否	合同模板版本号 示例：1810748342340681732
isOpenContract	string	否	是否开口合同 示例：0
bustype	string	否	交易类型id，来源档案：bd.bill.TransType 示例：1810505376027639818
bWatermark	string	否	是否无水印 示例：0
mny	BigDecimal	否	合同金额 示例：10
isMaterial	string	否	物料分类合同 1-是 0-否 示例：0
submitCsFile	string	否	送审文件 示例：1713170640408_api_submitCsFile
appendix	string	否	附件 示例：3e1222233750-0603-11ef-8740-bd6d5b7a6fb2
projectId	string	否	关联项目 ID，来源档案：bd.project.ProjectVO
contractId	string	否	关联合同 ID，来源档案：CLM.clmContract.clm_contract
wbs	string	否	WBS

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"busiObj": "clmContract",
		"memo": "合同备注",
		"ctSummary": "合同概要",
		"type": "1852916168056635392",
		"valiDate": "2023-11-09",
		"signSubjectId": "1809173068584583170",
		"planInvallidate": "2023-11-16",
		"feature": "",
		"urgentLevel": "1",
		"serialNumber": "",
		"signType": "0",
		"clm_contract_counterpartList": [
			{
				"creator": "00001951-7ca3-47ac-a462-d5a66e3e6724",
				"supplierId": "1815801431496065031",
				"ytenantId": "0000LM4K5NIS40WWEG0000",
				"dr": 0,
				"contractId": "1858893345170391047",
				"merchantType": "2"
			}
		],
		"id": "1858893345170391047",
		"clm_contract_rectermList": [
			{
				"memo": "收款协议备注",
				"type": "1809147204306731326",
				"planPaymentMny": 2,
				"paymentScale": 0.2,
				"id": "1858893345170391049",
				"pubts": "2023-11-10 16:07:47",
				"ytenantId": "0000LM4K5NIS40WWEG0000",
				"planPaymentDate": "2023-11-09 00:00:00",
				"condition": "收款",
				"upToDate": "2023-11-09 00:00:00",
				"contractId": "1858893345170391047",
				"mny": 200
			}
		],
		"clm_contract_paytermList": [
			{
				"memo": "付款协议备注",
				"type": "1809147204306731328",
				"payMoney": 100,
				"id": "1858893345170391050",
				"payCondition": "付款",
				"payRatio": 0.1,
				"ytenantId": "0000LM4K5NIS40WWEG0000",
				"planPayMoney": 1,
				"planPayDate": "2023-11-09",
				"contractId": "1858893345170391047",
				"payDate": "2023-11-09"
			}
		],
		"deptId": "1809173334883565572",
		"version": "0",
		"secretLevel": "0",
		"concludeType": "1",
		"personId": "1857970073239552010",
		"ctPeriod": "0",
		"clm_contract_itemList": [
			{
				"num": 1,
				"taxprice": 10,
				"price": 9.85,
				"unitId": "1835815764334477318",
				"id": "1858893345170391053",
				"tax": 0.15,
				"ytenantId": "0000LM4K5NIS40WWEG0000",
				"materialId": "1835816348468903942",
				"taxmny": 10,
				"mny": 9.85,
				"contractId": "1858893345170391047",
				"materialId___code": "0001000001",
				"unitId___code": "A001",
				"taxRate.ntaxrate": "1.5",
				"taxRate___code": "VATR6"
			}
		],
		"orgId": "1809173068584583170",
		"contractFileStatus": "0",
		"econtractTempId": "1810748342340681731",
		"ctClass": "1",
		"creator": "00001951-7ca3-47ac-a462-d5a66e3e6724",
		"isBackDate": "0",
		"businessFileId": "",
		"importantLevel": "2",
		"reDirection": "0",
		"clm_appointmentList": [
			{
				"accomRemark": "计划备注",
				"endDate": "2023-11-10",
				"accomState": true,
				"ytenantId": "0000LM4K5NIS40WWEG0000",
				"contractId": "1858893345170391047",
				"name": "我的计划",
				"id": "1858893345170391051",
				"planEndDate": "2023-11-10"
			}
		],
		"signAddress": "北京",
		"createMethod": "1",
		"signDate": "2023-11-09",
		"settleAccountType": "1809147754069360760",
		"invaliDate": "2023-11-16",
		"maintenanceType": "1",
		"lawType": "1846082600192442376",
		"performAddress": "用友",
		"ytenantId": "0000LM4K5NIS40WWEG0000",
		"isHaveTax": "1",
		"settleOrgid": "1810592246039314440",
		"code": "005468",
		"title": "我的组织翻1译2334",
		"planValidate": "2023-11-16",
		"finalizeStatus": "0",
		"econtractVersion": "1810748342340681732",
		"isOpenContract": "0",
		"bustype": "1810505376027639818",
		"bWatermark": "0",
		"mny": 10,
		"isMaterial": "0",
		"submitCsFile": "1713170640408_api_submitCsFile",
		"appendix": "3e1222233750-0603-11ef-8740-bd6d5b7a6fb2",
		"projectId": "",
		"contractId": "",
		"wbs": ""
	}
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
500	服务异常	异常信息
999	接口调用错误	异常信息,请联系管理员
1001001000003	参数错误	异常信息,请检查数据
310008	参数错误	参数结构错误
500064	合同状态变更失败，不支持当前操作！	合同生效失败，传入生效参数错误
500082	客户编码错误	客户档案填写错误，未查询到相应档案
500083	供应商编码错误	供应商案填写错误，未查询到相应档案
500084	相对方签署顺序必须为正数	相对方签署顺序必须为正数
59999	其他错误	参数列表外的其他错误
2401	参照查询错误	参照未按照 code 查询到信息
500116	该合同模板无权限，请修改	合同模板未在此组织的交易类型下
500178	未检测到合同文件，请确认	合同文件配置 id 不能为空

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-11-14	
更新
请求说明
新增
请求参数 beginningFlag
新增
请求参数 efileMode
更新
请求参数 fileobject
更新
请求参数 createType
新增文件模式和期初标记字段，完善文件模式关于期初合同的描述
	2	2025-05-09	
新增
请求参数 exchangeRate
更新
请求参数 feature
更新
请求参数 feature
修改特征字段属性

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

