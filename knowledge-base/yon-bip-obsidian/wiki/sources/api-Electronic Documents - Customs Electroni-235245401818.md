---
title: "电子文件-海关电子缴款书-新增"
apiId: "2352454018184249350"
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

# 电子文件-海关电子缴款书-新增

>  请求方式	POST | Archive Accession (EAF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/FCC/v1/api/custbook/batchInsert
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
custbookList	object	是	是	海关缴款书信息列表 最大请求量：10
billingNo	string	否	是	专用缴款书号码 示例：JKS123456789012
billingNoSuf	string	否	是	专用缴款书号码全文索引
billingDate	string	否	否	填发日期 示例：2023-05-20
customsName	string	否	否	海关名称 示例：北京海关
incomeSystem	string	否	否	收入系统 示例：关税系统
revenueOrg	string	否	否	收入机关 示例：北京海关
account	string	否	否	收入科目 示例：关税收入
budgetaryLevels	string	否	否	预算级次 示例：中央级
revenueTreasury	string	否	否	收款国库 示例：中央国库
treasuryBank	string	否	否	收入国库银行 示例：中国人民银行
paymentOrg	string	否	是	缴款单位 示例：某某进出口公司
paymentAccount	string	否	否	缴款账号 示例：1234567890123456
paymentBank	string	否	否	缴款单位-银行 示例：中国银行
price	number
小数位数:6,最大长度:20	否	否	完税价格合计 示例：10000.0000000000
tax	number
小数位数:2,最大长度:15	否	是	税款金额合计 示例：1300.00
customsCode	string	否	否	进口口岸代码 示例：1101
applyOrgNo	string	否	否	申请单位编号 示例：A123456
customsNo	string	否	否	报关单编号 示例：B12345678901
transportNo	string	否	否	运输工具号 示例：T123456
contractNo	string	否	否	合同（批文）号 示例：C123456789
cargoOwner	string	否	否	货主单位 示例：某某贸易公司
operationEntity	string	否	否	经营单位 示例：某某进出口公司
paymentPeriod	string	否	否	缴款期限 示例：2023-06-20
ladingNo	string	否	否	提/装货单号 示例：L1234567890
vnote	string	否	否	备注 示例：进口货物关税
billingMaker	string	否	否	制单人 示例：张三
reviewer	string	否	否	复核人 示例：李四
businessman	string	否	否	业务员 示例：王五
status	string	否	否	状态; 0-未记账；1-已记账 示例：1
extraNote	string	否	否	额外备注，操作人员的备注非单据备注 示例：特殊处理
checkDate	string	否	否	稽查日期 示例：2023-05-25
accountUser	string	否	否	记账人 示例：赵六
accountTime	date
格式:yyyy-MM-dd	否	否	记账日期 示例：2023-05-20
accountNote	string	否	否	记账备注 示例：已入账
voucherid	string	否	否	凭证号 示例：V1234567890
srcType	string	否	否	来源类型 1:手工界面上传；2:外系统接口调用 示例：1
receiveTicketOrganization	string	否	否	受票组织 示例：某某公司
busiType	string	否	否	业务类型 10-报销 20-采购 30-不动产 40-海关缴款书 100-销售 110-销售&报销 示例：40
settleStatus	string	否	否	采购结算 0-未结算 1-已结算 示例：1
auditStatus	string	否	否	稽核状态 0-稽核中 1-未报送 2-待处理 3-相符 4-不符 5-滞留 6-缺联 7-重号 示例：3
fileName	string	否	是	原始文件名，包含后缀名 示例：customs_invoice.pdf
fileUrl	string	否	是	文件地址 示例：/files/customs_invoice_20230520.pdf
fileSize	number
小数位数:0,最大长度:19	否	否	文件大小 示例：102400
fileSign	string	否	否	数字摘要 示例：abc123def456
signAlgorithm	string	否	否	签名算法 示例：SHA256
signRegulation	string	否	否	签名规则 示例：摘要签名
invoiceNature	string	否	否	发票性质:input/output output：销项发票 示例：input
submitterId	string	否	否	提交人 示例：user001
submitDate	date
格式:yyyy-MM-dd	否	否	提交日期 示例：2023-05-20
checkStatus	string	否	否	收票状态 0-未收票 1-已收票 示例：1
reimburseStatus	string	否	否	报销状态 0未报销、1报销中、2已报销 示例：2
bookStatus	string	否	否	购方记账状态 0-未记账 1-已记账 示例：1
payStatus	string	否	否	支付状态 0-未支付 1-已支付 示例：1
deductStatus	string	否	否	抵扣状态 0-未抵扣 1-已抵扣 示例：1
verifyStatus	string	否	否	查验状态 0-未查验 1-已查验 示例：1
yyVerifyStatus	string	否	否	用友查验状态 0-未查验；1-已查验 示例：1
thirdVerifyStatus	string	否	否	第三方查验状态 0-未查验；1-已查验 示例：1
purchaserStatus	string	否	否	报销状态(delete) 示例：39
kind	string	否	否	发票消费类型 示例：进口关税

## 3. 请求示例

Url: /yonbip/FCC/v1/api/custbook/batchInsert?access_token=访问令牌&orgCode=
Body: {
	"custbookList": [
		{
			"billingNo": "JKS123456789012",
			"billingNoSuf": "",
			"billingDate": "2023-05-20",
			"customsName": "北京海关",
			"incomeSystem": "关税系统",
			"revenueOrg": "北京海关",
			"account": "关税收入",
			"budgetaryLevels": "中央级",
			"revenueTreasury": "中央国库",
			"treasuryBank": "中国人民银行",
			"paymentOrg": "某某进出口公司",
			"paymentAccount": "1234567890123456",
			"paymentBank": "中国银行",
			"price": 10000,
			"tax": 1300,
			"customsCode": "1101",
			"applyOrgNo": "A123456",
			"customsNo": "B12345678901",
			"transportNo": "T123456",
			"contractNo": "C123456789",
			"cargoOwner": "某某贸易公司",
			"operationEntity": "某某进出口公司",
			"paymentPeriod": "2023-06-20",
			"ladingNo": "L1234567890",
			"vnote": "进口货物关税",
			"billingMaker": "张三",
			"reviewer": "李四",
			"businessman": "王五",
			"status": "1",
			"extraNote": "特殊处理",
			"checkDate": "2023-05-25",
			"accountUser": "赵六",
			"accountTime": "2023-05-20",
			"accountNote": "已入账",
			"voucherid": "V1234567890",
			"srcType": "1",
			"receiveTicketOrganization": "某某公司",
			"busiType": "40",
			"settleStatus": "1",
			"auditStatus": "3",
			"fileName": "customs_invoice.pdf",
			"fileUrl": "/files/customs_invoice_20230520.pdf",
			"fileSize": 102400,
			"fileSign": "abc123def456",
			"signAlgorithm": "SHA256",
			"signRegulation": "摘要签名",
			"invoiceNature": "input",
			"submitterId": "user001",
			"submitDate": "2023-05-20",
			"checkStatus": "1",
			"reimburseStatus": "2",
			"bookStatus": "1",
			"payStatus": "1",
			"deductStatus": "1",
			"verifyStatus": "1",
			"yyVerifyStatus": "1",
			"thirdVerifyStatus": "1",
			"purchaserStatus": "39",
			"kind": "进口关税"
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

