---
title: "档案服务归档税务完税凭证文件采集接口-通过唯一标识"
apiId: "2004366962698747905"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "One-key declaration"
domain: "TAX"
date: 2026-06-07
tags: [YonBIP, OpenAPI]
source_type: community-api-docs
---

# 档案服务归档税务完税凭证文件采集接口-通过唯一标识

>  请求方式	POST | One-key declaration (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/tax/yonbip-fi-taxreturn/api/archive/billList
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

只看必填项
名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
企业自建获取token
服务商获取token
Body参数
名称	类型	数组	必填	描述
billtype	string	否	否	事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、
billtype	string	否	否	事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、
billtype	string	否	否	事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、
billtype	string	否	否	事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、
docPkList	string	是	是	税务回调返回的pk(主键id) 示例：[ "2444139785392640" ]
callbackUrl	string	否	是	档案回调地址 示例：https://****/yonbip-fi-eafmid/cloudrecord-imw/api/nc/v2/doc/push?corpId=1690359953843814406&tenantId=0000LFRUUK7D7ECT1M0000&taskCode=S202301-471426&ts=1680255371629&signature=7c1172a16d62e1483420e56978d015ba
fileServer	object	否	是	文件服务器配置
accessKey	string	否	是	用户名 示例：****
bucketName	string	否	否	桶名只有serverType为minio时候为必须 示例：****
endpoint	string	否	是	文件服务地址 示例：https://****/yonbip-fi-eaffile/cloudrecord-file
secretKey	string	否	是	密码 示例：****
serverType	string	否	是	文件服务类型，默认gateway 示例：gateway
orgInfo	object	否	是	全宗信息
code	string	否	是	全宗编码（对应业务单元编码） 示例：nzj0328
type	string	否	否	unit 业务单元 book 核算账簿（默认）
showUpper	string	否	是	是否采集上游单据数据 0：否 1：是 示例：0
srcSys	string	否	否	来源系统 档案-IDOC 示例：IDOC
taskId	string	否	是	采集任务编码，长度限制500 示例：S202301-471426
type	string	否	否	档案类型（前缀）（NSSBB\WSZM\OTHER）,为空默认全部 示例：NSSBB

## 3. 请求示例

Url: /yonbip/tax/yonbip-fi-taxreturn/api/archive/billList?access_token=访问令牌
Body: {
	"docPkList": [
		"2444139785392640"
	],
	"callbackUrl": "https://****/yonbip-fi-eafmid/cloudrecord-imw/api/nc/v2/doc/push?corpId=1690359953843814406&tenantId=0000LFRUUK7D7ECT1M0000&taskCode=S202301-471426&ts=1680255371629&signature=7c1172a16d62e1483420e56978d015ba",
	"fileServer": {
		"accessKey": "****",
		"bucketName": "****",
		"endpoint": "https://****/yonbip-fi-eaffile/cloudrecord-file",
		"secretKey": "****",
		"serverType": "gateway"
	},
	"orgInfo": {
		"code": "nzj0328",
		"type": ""
	},
	"showUpper": "0",
	"srcSys": "IDOC",
	"taskId": "S202301-471426",
	"type": "NSSBB"
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
code	string	否	code 示例：0000
message	string	否	message 示例：操作成功
data	string	否	data 示例：null

## 5. 正确返回示例

{
	"code": "0000",
	"message": "操作成功",
	"data": "null"
}

## 6. 业务异常码

查看业务异常码
异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
暂时没有数据哦~

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-11-05	
更新
请求说明
更新
请求参数 type

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

