---
title: "蓝票回调接口(拆分开票)"
apiId: "1867603160891129859"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Invoicing Request"
domain: "B2C"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Invoicing Request]
platform_version: "BIP"
source_type: community-api-docs
---

# 蓝票回调接口(拆分开票)

>  请求方式	POST | Invoicing Request (B2C)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/invoice/batchbluecallback
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
data	string	否	否	data(拆分开票后，返回的开票结果) 示例：{hcyy:1,bmbBbh:48.34,corpId:0000LEC83AYQD8S8W60000,ewm:01,10,202319115953,15009528,-283.19,20231019,77432162363170653878,2124,fhr:,sblx:unknown,fpDm:202319115953,fpHm:15009528,fpjz:0,fplx:1,zsfs:0,fpMw:03-188574&lt;*7-9*56458*81-9&gt;&lt;&gt;0-9&gt;988*2&
code	string	否	否	code 示例：0000
msg	string	否	否	msg 示例：开票成功
fpqqlsh	string	否	否	fpqqlsh 示例：28938248059673018567
pdf	string	否	否	pdf
shareurl	string	否	否	shareurl 示例：https://bip-daily.yonyoucloud.com/yonbip-fi-taxgateway/output-tax/s/f2e8c055cb9b8d1b749582a87fd5ae09?tenantId=0000LEC83AYQD8S8W60000
corpid	string	否	否	corpid 示例：0000LEC83AYQD8S8W60000
sharecode	string	否	否	sharecode 示例：N903
fileType	string	否	否	fileType 示例：pdf
kpsj	string	否	否	kpsj 示例："2024-04-25 11:04:25"

## 3. 请求示例

Url: /yonbip/sd/invoice/batchbluecallback?access_token=访问令牌
Body: {
	"data": "{hcyy:1,bmbBbh:48.34,corpId:0000LEC83AYQD8S8W60000,ewm:01,10,202319115953,15009528,-283.19,20231019,77432162363170653878,2124,fhr:,sblx:unknown,fpDm:202319115953,fpHm:15009528,fpjz:0,fplx:1,zsfs:0,fpMw:03-188574&lt;*7-9*56458*81-9&gt;&lt;&gt;0-9&gt;988*2&",
	"code": "0000",
	"msg": "开票成功",
	"fpqqlsh": "28938248059673018567",
	"pdf": "",
	"shareurl": "https://bip-daily.yonyoucloud.com/yonbip-fi-taxgateway/output-tax/s/f2e8c055cb9b8d1b749582a87fd5ae09?tenantId=0000LEC83AYQD8S8W60000",
	"corpid": "0000LEC83AYQD8S8W60000",
	"sharecode": "N903",
	"fileType": "pdf",
	"kpsj": "\"2024-04-25 11:04:25\""
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
icaConfirmTime	DateTime	否	确认时间 示例：2022-09-26 00:00:00
code	int	否	返回码 示例：200
message	string	否	消息 示例：ok

## 5. 正确返回示例

{
	"code": 200,
	"message": "ok"
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
暂时没有数据哦~

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

