---
title: "合同涉税信息-导入合同项目信息"
apiId: "1758125707242242057"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Tax Related Data Management"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Tax Related Data Management]
platform_version: "BIP"
source_type: community-api-docs
---

# 合同涉税信息-导入合同项目信息

>  请求方式	POST | Tax Related Data Management (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/tax/yonbip-fi-taxbd/bd/api/contract/import-contract-project
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
orgCode	string	否	是	组织编码 示例：ASD
contracts	object	是	否	导入合同
code	string	否	是	合同编号,合同编号长度不能超过50个字符 示例：code
name	string	否	是	合同名称,合同名称长度不能超过550个字符 示例：合同名称
contractTypeCode	string	否	否	合同类型编码 示例：add
contractType	string	否	否	合同类型 1采购合同;2销售合同;3加工合同;4承揽合同;5建设工程勘察合同;6建设工程设计合同;7建筑安装工程承包合同;8财产租赁合同;9货物运输合同;10仓储保管合同;11借款合同;12财产保险合同;13技术合同;14产权转移书据;15不征税合同; 示例：1
paymentType	string	否	否	收支类型 1:收入类；2：支出类；3：有收有支 示例：1
contractStatus	string	否	否	合同状态 1：正常；2：终止 示例：1
isFrame	string	否	否	是否框架合同Y:是 N:否 示例：Y
sisNonTaxContract	string	否	否	是否不征税合同（Y、是；N、否） 示例：Y
isContainsTax	string	否	否	是否含税金额计税（Y、是；N、 否） 示例：Y
signDate	string	否	否	合同签订日期，日期格式为yyyy-MM-dd 示例：2023-07-08
terminationDate	string	否	否	合同终止日期，日期格式yyyy-MM-dd 示例：2023-05-06
validDate	string	否	否	合同有效期，日期格式为yyyy-MM-dd 示例：2023-09-02
stampTaxItem	string	否	否	印花税税目（传入的为编码） 示例：税目
subItem	string	否	否	印花税子目（传入的为编码） 示例：子目
relativeName	string	否	否	合同相对方名称 示例：合同相对方名称
relativeNsrsbh	string	否	否	合同相对方税号 示例：ASDGSSSSS
amount	number
小数位数:2,最大长度:15	否	否	合同金额(含税) 示例：3223
amountExcludingTax	number
小数位数:2,最大长度:15	否	否	合同金额（不含税） 示例：123
note	string	否	否	备注 示例：SSS
projects	object	否	是	导入项目
projectCode	string	否	是	项目编号，项目编号长度不能超过50个字符 示例：SSS
projectName	string	否	是	项目名称，项目名称长度不能超过350个字符 示例：SSS
taxMethod	string	否	是	计税方式；1-一般计税，2-简易征收（老项目），3-简易征收（甲供材）、4-简易征收（其他） 示例：1
taxRelatedType	string	否	否	项目涉税类型；1-建筑服务，2-出租不动产，3-销售不动产 示例：1
relativeName	string	否	否	合同相对方名称，合同相对方名称长度不能超过50个字符 示例：合同相对方名称
customerNsrsbh	string	否	否	合同相对纳税人识别号(统一社会信用代码)，合同相对纳税人识别号长度不能超过250个字符 示例：合同相对方税号
bankAndAccount	string	否	否	开户银行及账号，开户银行及账号长度不能超过190个字符 示例：122345667543
addressAndPhone	string	否	否	开票地址及电话，开票地址及电话长度不能超过200个字符 示例：银行地址
progress	string	否	否	完成进度 示例：SSSS
contractCodes	string	是	是	合同编号 示例：["saaa"]

## 3. 请求示例

Url: /yonbip/tax/yonbip-fi-taxbd/bd/api/contract/import-contract-project?access_token=访问令牌
Body: {
	"orgCode": "ASD",
	"contracts": [
		{
			"code": "code",
			"name": "合同名称",
			"contractTypeCode": "add",
			"contractType": "1",
			"paymentType": "1",
			"contractStatus": "1",
			"isFrame": "Y",
			"sisNonTaxContract": "Y",
			"isContainsTax": "Y",
			"signDate": "2023-07-08",
			"terminationDate": "2023-05-06",
			"validDate": "2023-09-02",
			"stampTaxItem": "税目",
			"subItem": "子目",
			"relativeName": "合同相对方名称",
			"relativeNsrsbh": "ASDGSSSSS",
			"amount": 3223,
			"amountExcludingTax": 123,
			"note": "SSS"
		}
	],
	"projects": {
		"projectCode": "SSS",
		"projectName": "SSS",
		"taxMethod": "1",
		"taxRelatedType": "1",
		"relativeName": "合同相对方名称",
		"customerNsrsbh": "合同相对方税号",
		"bankAndAccount": "122345667543",
		"addressAndPhone": "银行地址",
		"progress": "SSSS",
		"contractCodes": [
			"saaa"
		]
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
displayCode	string	否	异常码
code	string	否	编码 示例：200
message	string	否	信息 示例：操作成功

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功"
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
9999	系统错误，提示具体的错误信息	根据提示信息修改

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2026-03-26	
更新
请求说明
更新
请求参数 (7)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

