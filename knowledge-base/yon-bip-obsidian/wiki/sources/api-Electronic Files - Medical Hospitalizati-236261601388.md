---
title: "电子文件-医疗住院-新增"
apiId: "2362616013886324736"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Archive Accession"
domain: "EAF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Archive Accession]
platform_version: "BIP"
source_type: community-api-docs
---

# 电子文件-医疗住院-新增

>  请求方式	POST | Archive Accession (EAF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/FCC/v1/api/hospital/batchInsert
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
orgCode	string	query	是	全宗编码
Body参数
名称	类型	数组	必填	描述
nontaxList	object	是	是	非税票据信息列表 最大请求量：10
seqno	string	否	否	全局流水号 示例：SN20230520001
titleType	string	否	否	其它非税票据标题类型 1-行政事业单位资金往来结算票据（电子）2-非税收入统一票据（电子）3-社会团体会费统一票据（电子）4-人民法院诉讼费专用票据 5-公益事业捐款统一票据（电子）6-社会保险基金统一收据（电子）7-罚款统一收据（电子）8-非税收入一般缴款书（电子）9-住宅专项维修资金专用票据（电子） 示例：1
invoiceId	string	否	否	电子票据id 示例：INV20230520001
bizCode	string	否	否	业务流水号 示例：BIZ20230520001
filePath	string	否	否	文件路径 示例：/files/nontax_invoice_20230520.pdf
einvoiceName	string	否	否	电子票据名称 示例：非税收入统一票据
invoiceCode	string	否	否	发票代码 示例：12345678901234567890
invoiceNum	string	否	否	发票号码 示例：12345678901234567890123456789012
randomNumber	string	否	否	校验码 示例：123456
einvoiceSpecimenCode	string	否	否	电子票据模板代码 示例：TEMPLATE001
supervisorAreaCode	string	否	否	电子票据监管机构代码 示例：SUPERVISOR001
totalAmount	number
小数位数:2,最大长度:15	否	是	票面金额 示例：100.00
issueDate	string	否	否	开票日期 示例：2023-05-20
issueTime	string	否	否	开票时间 示例：14:30:00
invoicingPartyCode	string	否	否	开票单位代码 示例：ORG001
invoicingPartyName	string	否	否	开票单位名称 示例：某某单位
recName	string	否	否	收款人全称 示例：张三
recAcct	string	否	否	收款人账号 示例：1234567890123456
recOpBk	string	否	否	收款人开户行 示例：中国银行北京分行
payerPartyType	string	否	否	交款人类型 1-个人 2-单位 示例：1
payerPartyCode	string	否	否	交款人代码 示例：PAYER001
payerPartyName	string	否	否	缴款人名称 示例：李四
payerAcct	string	否	否	缴款人账号 示例：0987654321098765
payerOpBk	string	否	否	缴款人开户行 示例：工商银行上海分行
payMode	string	否	否	交款方式 示例：现金
bizCodeXml	string	否	否	业务流水号（XML里） 示例：XMLBIZ20230520001
currencyType	string	否	否	货币种类 示例：CNY
exchangeRate	number
小数位数:2,最大长度:15	否	否	汇率 示例：1.00
remark	string	否	否	备注 示例：备注信息
handlingPerson	string	否	否	开票人 示例：王五
checker	string	否	否	复核人 示例：赵六
supervisorRemark	string	否	否	财政部门备注 示例：财政部门备注信息
sealId	string	否	否	印章编号 示例：SEAL001
sealName	string	否	否	印章名称 示例：某某单位财务章
sealHash	string	否	否	印章Hash 示例：abc123def456
suSealId	string	否	否	财政部门印章编号 示例：SU_SEAL001
suSealName	string	否	否	财政部门印章名称 示例：某某财政局章
suSealHash	string	否	否	财政部门印章Hash 示例：def456ghi789
orgId	number
小数位数:0,最大长度:19	否	否	组织id 示例：1001
submitter	string	否	否	提交人 示例：提交人姓名
submitStatus	string	否	否	提交状态 0-未提交，1-已提交 示例：1
settleStatus	string	否	否	采购结算状态 0：未结算 1：已结算 示例：1
paymentStatus	string	否	否	支付状态 0-未支付, 5-部分已支付, 10-已支付 示例：10
reimburseMoney	number
小数位数:2,最大长度:15	否	否	累计报账价税合计 示例：80.00
accountStatus	string	否	否	记账状态 0-未记账, 5-部分已记账, 10-已记账 示例：10
suspectFlag	string	否	否	疑票标识 1：合规 2：存疑 3：不合规 示例：1
suspectStatus	string	否	否	疑票状态:1.未处理2.已放行3.已禁止 示例：2
suspectRule	string	否	否	疑票规则 示例：规则1
receiveStatus	string	否	否	收票状态 0-未收票 1-已收票 示例：1
archiveStatus	string	否	否	归档状态 0-未归档 1-已归档 示例：1
busiFlag	string	否	否	业务标识 0：报销；1：采购 示例：0
modifyStatus	string	否	否	票面修改状态 0-未修改 1-已修改 示例：0
srcChannel	string	否	否	票据来源渠道: platform-税务云平台,api-系统同步,personal-个人票夹提交,email-受票邮箱,tax_bureau-税局下载,bank-银行下载,enterprise_package_input -企业票夹采集,enterprise_package_receive-企业票夹认领, 示例：platform
srcSystem	string	否	否	票据来源系统：billcenter-电子票据中心, scm-供应链协同, buy_farm-开具收购发票, country_tax_bureau-国税总局, zhejiang_tax_bureau-浙江税局, deduct_plat-税局勾选抵扣平台, yinzhangtong-银账通, email-税务云企业受票邮箱, piaoyouji-票友记, person_web-税务云个人端, api-接口提交,enterprise_package-企业员工票夹 示例：billcenter
gatherModel	string	否	否	票据采集方式：source_file-源文件解析,ocr-OCR识别,hand-手工录入,import-文件导入,wechat_scan-微信扫码,download-下载,api_collaboration-系统协同,wechat_card-微信卡包 示例：ocr
srcBilltype	string	否	否	业务单据类型 示例：报销单
srcBillcode	string	否	否	业务系统单据号 示例：SRC20230520001
srcBillid	string	否	否	业务系统单据ID 示例：SRCID20230520001
voucherPath	string	否	否	电子凭证路径 示例：/files/voucher_20230520.pdf
deptId	string	否	否	部门id 示例：DEPT001
receiveUserId	string	否	否	关联用户id 示例：USER001
fileBusinessId	string	否	否	协同附件 示例：FILEBUS001
voucherBusinessId	string	否	否	协同凭证附件 示例：VOUBUS001
free	string	否	否	自定义项 示例：自定义信息
fplxId	string	否	否	发票类型id 示例：FPLX001
sfrz	string	否	否	入账状态 00-未入账 01-已入账 示例：01
rzyt	string	否	否	入账用途 01-未入账 02-已入账（企业所得税税前扣除） 03-已入账（企业所得税不扣除） 06-入账撤销 示例：02
rzsj	date
格式:yyyy-MM-dd HH:mm:ss	否	否	入账时间 示例：2023-05-20 14:30:00
rzgxsj	date
格式:yyyy-MM-dd	否	否	入账标识下载日期 示例：2023-05-20
srcBillTypeName	string	否	否	来源单据类型名 示例：报销单
receiver	string	否	否	签收人 示例：签收人姓名
receiveTime	date
格式:yyyy-MM-dd HH:mm:ss	否	否	签收时间 示例：2023-05-20 14:30:00
taxRebate	string	否	否	即征即退标识 示例：0
usageStatus	string	否	否	使用状态 示例：已使用
occupyJshj	number
小数位数:2,最大长度:15	否	否	已占用价税合计 示例：50.00
dzbs	string	否	否	独占标识 示例：0
creator	string	否	否	创建者 示例：创建者姓名
modifier	string	否	否	修改者 示例：修改者姓名
secretLimit	string	否	否	保密期限 示例：1年
fileName	string	否	是	原始文件名，包含后缀名 示例：nontax_invoice.pdf
fileUrl	string	否	是	文件地址 示例：/files/nontax_invoice_20230520.pdf
fileSign	string	否	否	数字摘要 示例：abc123def456
signAlgorithm	string	否	否	签名算法 示例：SHA256
signRegulation	string	否	否	签名规则 示例：摘要签名
fileSize	number
小数位数:0,最大长度:19	否	否	文件大小 示例：102400
invoiceNature	string	否	否	发票性质:input/output output：销项发票 示例：input
submitterId	string	否	否	提交人 示例：SUBMITTER001
submitDate	date
格式:yyyy-MM-dd	否	否	提交日期 示例：2023-05-20
purchaserStatus	string	否	否	报销状态（delete) 示例：39
kind	string	否	否	发票消费类型 示例：办公用品
checkStatus	string	否	否	收票状态 0-未收票 1-已收票 示例：1
reimburseStatus	string	否	否	报销状态 0未报销、1报销中、2已报销 示例：2
bookStatus	string	否	否	购方记账状态 0-未记账 1-已记账 示例：1
payStatus	string	否	否	支付状态 0-未支付 1-已支付 示例：1
deductStatus	string	否	否	抵扣状态 0-未抵扣 1-已抵扣 示例：1
verifyStatus	string	否	否	查验状态 0-未查验 1-已查验 示例：1
yyVerifyStatus	string	否	否	用友查验状态 0-未查验；1-已查验 示例：1
thirdVerifyStatus	string	否	否	第三方查验状态 0-未查验；1-已查验 示例：1
basicExt	object	否	否	基本信息扩展
details	object	是	否	项目明细信息 最大请求量：10
auxdetails	object	是	否	辅助明细信息 最大请求量：10

## 3. 请求示例

Url: /yonbip/FCC/v1/api/hospital/batchInsert?access_token=访问令牌&orgCode=
Body: {
	"nontaxList": [
		{
			"seqno": "SN20230520001",
			"titleType": "1",
			"invoiceId": "INV20230520001",
			"bizCode": "BIZ20230520001",
			"filePath": "/files/nontax_invoice_20230520.pdf",
			"einvoiceName": "非税收入统一票据",
			"invoiceCode": "12345678901234567890",
			"invoiceNum": "12345678901234567890123456789012",
			"randomNumber": "123456",
			"einvoiceSpecimenCode": "TEMPLATE001",
			"supervisorAreaCode": "SUPERVISOR001",
			"totalAmount": 100,
			"issueDate": "2023-05-20",
			"issueTime": "14:30:00",
			"invoicingPartyCode": "ORG001",
			"invoicingPartyName": "某某单位",
			"recName": "张三",
			"recAcct": "1234567890123456",
			"recOpBk": "中国银行北京分行",
			"payerPartyType": "1",
			"payerPartyCode": "PAYER001",
			"payerPartyName": "李四",
			"payerAcct": "0987654321098765",
			"payerOpBk": "工商银行上海分行",
			"payMode": "现金",
			"bizCodeXml": "XMLBIZ20230520001",
			"currencyType": "CNY",
			"exchangeRate": 1,
			"remark": "备注信息",
			"handlingPerson": "王五",
			"checker": "赵六",
			"supervisorRemark": "财政部门备注信息",
			"sealId": "SEAL001",
			"sealName": "某某单位财务章",
			"sealHash": "abc123def456",
			"suSealId": "SU_SEAL001",
			"suSealName": "某某财政局章",
			"suSealHash": "def456ghi789",
			"orgId": 1001,
			"submitter": "提交人姓名",
			"submitStatus": "1",
			"settleStatus": "1",
			"paymentStatus": "10",
			"reimburseMoney": 80,
			"accountStatus": "10",
			"suspectFlag": "1",
			"suspectStatus": "2",
			"suspectRule": "规则1",
			"receiveStatus": "1",
			"archiveStatus": "1",
			"busiFlag": "0",
			"modifyStatus": "0",
			"srcChannel": "platform",
			"srcSystem": "billcenter",
			"gatherModel": "ocr",
			"srcBilltype": "报销单",
			"srcBillcode": "SRC20230520001",
			"srcBillid": "SRCID20230520001",
			"voucherPath": "/files/voucher_20230520.pdf",
			"deptId": "DEPT001",
			"receiveUserId": "USER001",
			"fileBusinessId": "FILEBUS001",
			"voucherBusinessId": "VOUBUS001",
			"free": "自定义信息",
			"fplxId": "FPLX001",
			"sfrz": "01",
			"rzyt": "02",
			"rzsj": "2023-05-20 14:30:00",
			"rzgxsj": "2023-05-20",
			"srcBillTypeName": "报销单",
			"receiver": "签收人姓名",
			"receiveTime": "2023-05-20 14:30:00",
			"taxRebate": "0",
			"usageStatus": "已使用",
			"occupyJshj": 50,
			"dzbs": "0",
			"creator": "创建者姓名",
			"modifier": "修改者姓名",
			"secretLimit": "1年",
			"fileName": "nontax_invoice.pdf",
			"fileUrl": "/files/nontax_invoice_20230520.pdf",
			"fileSign": "abc123def456",
			"signAlgorithm": "SHA256",
			"signRegulation": "摘要签名",
			"fileSize": 102400,
			"invoiceNature": "input",
			"submitterId": "SUBMITTER001",
			"submitDate": "2023-05-20",
			"purchaserStatus": "39",
			"kind": "办公用品",
			"checkStatus": "1",
			"reimburseStatus": "2",
			"bookStatus": "1",
			"payStatus": "1",
			"deductStatus": "1",
			"verifyStatus": "1",
			"yyVerifyStatus": "1",
			"thirdVerifyStatus": "1",
			"basicExt": {
				"relatedInvoiceCode": "REL123456789012",
				"relatedInvoiceNumber": "REL123456789012",
				"payCode": "PAY20230520001",
				"businessNumber": "BUS20230520001",
				"businessDate": "2023-05-20",
				"gender": "男",
				"medicalType": "门诊",
				"patientNumber": "PAT20230520001",
				"medicalDate": "2023-05-20",
				"orgType": "三甲医院",
				"medicalInsuranceType": "城镇医保",
				"medicalInsuranceId": "MED20230520001",
				"fundPayAmount": 30,
				"otherPayAmount": 20,
				"accountPayAmount": 10,
				"ownPayAmount": 40,
				"selfpaymentAmount": 50,
				"selfpaymentCost": 60,
				"caseNumber": "CASE20230520001",
				"hospitalizationNumber": "HOS20230520001",
				"departmentName": "内科",
				"inhospitalDate": "2023-05-20",
				"outhospitalDate": "2023-05-25",
				"prepayAmount": 100,
				"rechargeAmount": 50,
				"refundAmount": 20
			},
			"details": [
				{
					"itemCode": "ITEM001",
					"itemName": "办公用品",
					"itemAmount": 50,
					"itemUnit": "件",
					"itemQuantity": 2,
					"itemStd": 25,
					"itemDetailName": "A4打印纸",
					"creator": "创建人姓名",
					"modifier": "修改人姓名"
				}
			],
			"auxdetails": [
				{
					"auxItemRelatedCode": "AUXREL001",
					"auxItemRelatedName": "相关项目名称",
					"auxItemCode": "AUX001",
					"auxItemName": "服务费",
					"auxItemAmount": 10,
					"auxItemUnit": "次",
					"auxItemQuantity": 1,
					"auxItemStd": 10,
					"auxItemRemark": NaN,
					"creator": "创建人姓名",
					"modifier": "修改人姓名"
				}
			]
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
code	string	否	状态码 示例：0000
message	string	否	提示信息 示例：描述信息
data	object	否	响应实体

## 5. 正确返回示例

{
	"code": "0000",
	"message": "描述信息",
	"data": {}
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
暂时没有数据哦~

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-12-17	
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

