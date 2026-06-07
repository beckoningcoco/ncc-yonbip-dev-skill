---
title: "电子文件-银行交易回单-新增"
apiId: "2351810915551150085"
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

# 电子文件-银行交易回单-新增

>  请求方式	POST | Archive Accession (EAF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/FCC/v1/api/bankreceipt/batchInsert
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
bankReceipts	object	是	是	银行回单 最大请求量：10
billNo	string	否	否	单据号 示例：DJ20230001
productName	string	否	否	产品名称 示例：贷款产品A
bankName	string	否	否	银行名称 示例：中国工商银行
billType	string	否	否	单据类型 示例：转账支票
pages	number
小数位数:0,最大长度:8	否	是	页数 示例：3
paymentAccount	string	否	否	本方账户/付款人账户 示例：6222021234567890123
paymentAccountName	string	否	否	本方账户名称/付款人账户名称 示例：张三
receiveAccount	string	否	否	对方账户/收款人账户 示例：6222029876543210987
receiveAccountName	string	否	否	对方账户名称/收款人账户名称 示例：李四
useage	string	否	否	用途 示例：货款
abstracts	string	否	否	摘要 示例：销售商品款
moneyAmount	number
小数位数:2,最大长度:28	否	否	金额 示例：10000.00
lsbs	string	否	否	流水标识 示例：LS20230601001
imageNum	string	否	否	影像档号 示例：YXDH20230601001
remark	string	否	否	备注 示例：特殊说明
receivePaymentDate	string	否	是	收付日期 YYYY-MM-DD 示例：2023-06-01
receivePaymentTime	string	否	否	收付时间 HH:MM:SS 示例：14:30:25
belongVoucherTime	string	否	否	银行回单所属凭证时间 示例：202306
srcFileName	string	否	是	文件名 示例：银行回单.pdf
srcFilePath	string	否	是	文件路径 示例：group1/M00/00/01/xxx.pdf
transferFilePath	string	否	否	转换后的文件路径 示例：group1/M00/00/01/yyy.pdf
uploadTime	string	否	否	上传时间 示例：20230601
srcType	number
小数位数:0,最大长度:8	否	否	来源类型 1-接口同步 2-手工采集 示例：2
realFileSize	number
小数位数:0,最大长度:20	否	否	文件真实大小 示例：102400
fileType	string	否	否	文件类型 示例：pdf
clientNo	string	否	否	客户号 示例：KH20230001
currency	string	否	否	币种 示例：CNY
borrowingDirection	string	否	否	借贷方向:1-借-付款；2-贷-收款 示例：1
receiveBank	string	否	否	对方开户行 示例：中国建设银行
receiveBankSite	string	否	否	对方开户行名 示例：北京分行朝阳支行
bankTransactionSerial	string	否	否	银行交易流水号 示例：JYLSH20230601001
receiptNo	string	否	否	回单编号 示例：HD20230601001
ledgerBlendingCode	string	否	否	总账勾对码 示例：ZLGD20230601001
pk	string	否	否	业务系统回单pk 示例：YWHDPK20230601001
financialOrg	string	否	否	财务组织 示例：财务部
srcSystem	string	否	否	来源系统 示例：ERP系统
downFileFlag	string	否	否	是否已下载回单 示例：1
bankReceiptStatus	string	否	否	生成电子回单状态 示例：已生成
bankReceiptCreator	string	否	否	回单创建人 示例：张三
bankReceiptModifier	string	否	否	回单修改人 示例：李四
receiptMark	string	否	否	收付标志 示例：收

## 3. 请求示例

Url: /yonbip/FCC/v1/api/bankreceipt/batchInsert?access_token=访问令牌&orgCode=
Body: {
	"bankReceipts": [
		{
			"billNo": "DJ20230001",
			"productName": "贷款产品A",
			"bankName": "中国工商银行",
			"billType": "转账支票",
			"pages": 3,
			"paymentAccount": "6222021234567890123",
			"paymentAccountName": "张三",
			"receiveAccount": "6222029876543210987",
			"receiveAccountName": "李四",
			"useage": "货款",
			"abstracts": "销售商品款",
			"moneyAmount": 10000,
			"lsbs": "LS20230601001",
			"imageNum": "YXDH20230601001",
			"remark": "特殊说明",
			"receivePaymentDate": "2023-06-01",
			"receivePaymentTime": "14:30:25",
			"belongVoucherTime": "202306",
			"srcFileName": "银行回单.pdf",
			"srcFilePath": "group1/M00/00/01/xxx.pdf",
			"transferFilePath": "group1/M00/00/01/yyy.pdf",
			"uploadTime": "20230601",
			"srcType": 2,
			"realFileSize": 102400,
			"fileType": "pdf",
			"clientNo": "KH20230001",
			"currency": "CNY",
			"borrowingDirection": "1",
			"receiveBank": "中国建设银行",
			"receiveBankSite": "北京分行朝阳支行",
			"bankTransactionSerial": "JYLSH20230601001",
			"receiptNo": "HD20230601001",
			"ledgerBlendingCode": "ZLGD20230601001",
			"pk": "YWHDPK20230601001",
			"financialOrg": "财务部",
			"srcSystem": "ERP系统",
			"downFileFlag": "1",
			"bankReceiptStatus": "已生成",
			"bankReceiptCreator": "张三",
			"bankReceiptModifier": "李四",
			"receiptMark": "收"
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

