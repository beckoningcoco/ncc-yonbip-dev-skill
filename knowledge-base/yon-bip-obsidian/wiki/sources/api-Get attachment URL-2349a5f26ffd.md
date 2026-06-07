---
title: "获取附件URL"
apiId: "2349a5f26ffd4360a43520e226992cb7"
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

# 获取附件URL

>  请求方式	POST | Procure-to-Pay (SCC)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/cpu/file/getFileUrl
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
fileIds	string	否	是	文件ID(多个文件以','分隔)

## 3. 请求示例

Url: /yonbip/cpu/file/getFileUrl?access_token=访问令牌
Body: {
	"fileIds": ""
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
code	string	否	状态编码值 示例：200
message	string	否	返回信息 示例：成功
data	object	否	返回数据。结构为{"文件1id":"文件1对应的url","文件2id":"文件2对应的url"}。 示例：例如：{ "0vqmgPGqaoArBqQ0ROc": "http://ncc-yc-cpu-file.obs.cn-north-4.myhuaweicloud.com:80/vj4wymg1/692d5088-9817-4034-bbbd-d504db5e30f4_2.png?AccessKeyId=2RBBV3VN9DGA3XF9UB0Z&Expires=1616226449&Signature=N%2FqupzLIPOa5i2z%2B7LKDlWu9DiE%3D" }

## 5. 正确返回示例

{
	"code": "200",
	"message": "成功",
	"data": "例如：{   \"0vqmgPGqaoArBqQ0ROc\": \"http://ncc-yc-cpu-file.obs.cn-north-4.myhuaweicloud.com:80/vj4wymg1/692d5088-9817-4034-bbbd-d504db5e30f4_2.png?AccessKeyId=2RBBV3VN9DGA3XF9UB0Z&Expires=1616226449&Signature=N%2FqupzLIPOa5i2z%2B7LKDlWu9DiE%3D\"  }"
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
201	获取附件URL失败!	向服务提供方咨询服务是否正常

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-24	
更新
返回参数 code
更新
返回参数 message
更新
返回参数 data

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

