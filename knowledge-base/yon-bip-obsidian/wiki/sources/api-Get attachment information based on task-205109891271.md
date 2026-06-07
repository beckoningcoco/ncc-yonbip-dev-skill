---
title: "企业绩效根据任务ID获取附件信息"
apiId: "2051098912717012998"
apiPath: "请求方式	POST"
method: "ContentType	application/x-www-form-urlencoded"
category: "EPM Foundation"
domain: "EPM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, EPM Foundation]
platform_version: "BIP"
source_type: community-api-docs
---

# 企业绩效根据任务ID获取附件信息

>  请求方式	POST | EPM Foundation (EPM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/qyjx/v1/file/getByTaskId
请求方式	POST
ContentType	application/x-www-form-urlencoded
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
taskId	string	query	是	任务id。可以从任务中心获取，或者对接本领域长操作返回。    示例: 669f4d5d35ab8523b4afc183
allUser	boolean	query	是	allUser 是否查询租户下所有用户的数据。true 则查询所有用户的数据，false 则只查询租户下当前用户的数据。    示例: true    默认值: false

## 3. 请求示例

Url: /yonbip/qyjx/v1/file/getByTaskId?access_token=访问令牌&taskId=669f4d5d35ab8523b4afc183&allUser=true

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
taskStatus	number
小数位数:0,最大长度:1	否	任务状态。0成功 1失败 2执行中 示例：0
errorMsg	string	否	失败详情 示例：年月组合数据量过大,请限制在24以内!
resultFileId	string	否	文件id。长操作时的文件。比如导入时传入的文件，或者导出操作成功后的结果文件 示例：66a343b64d27002cfe75bbf0

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"taskStatus": 0,
		"errorMsg": "年月组合数据量过大,请限制在24以内!",
		"resultFileId": "66a343b64d27002cfe75bbf0"
	}
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
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

