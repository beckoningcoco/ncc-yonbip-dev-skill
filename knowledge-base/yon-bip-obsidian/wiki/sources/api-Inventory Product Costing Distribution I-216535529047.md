---
title: "存货产品成本分配接口"
apiId: "2165355290474053637"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Finished Goods Receipt Cost Allocation"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Finished Goods Receipt Cost Allocation]
platform_version: "BIP"
source_type: community-api-docs
---

# 存货产品成本分配接口

>  请求方式	POST | Finished Goods Receipt Cost Allocation (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/EFI/fieia/costAlloc
请求方式	POST
ContentType	application/json
应用场景	开放API
执行方式	异步API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
accentity	string	否	是	会计主体
accbook	string	否	是	账簿
periodCode	string	否	是	期间
accpurpose	number
小数位数:2,最大长度:32	否	是	核算目的
bookDateStart	string	否	否	记账日期-开始
bookDateEnd	string	否	否	记账日期-结束
stockOrg	string	否	否	库存组织
warehouse	string	否	否	仓库
materialId	string	否	否	物料id
materialClass	string	否	否	物料分类id
projectId	string	否	否	项目
wbs	string	否	否	WBS
busiWbs	string	否	否	业务WBS
batchNo	string	否	否	批次号
allocDimension	string	否	是	分配维度
allocDimVOList	object	是	是	分配成本维度list 最大请求量：10
material	string	否	是	物料id
num	number
小数位数:2,最大长度:32	否	是	数量
amountMap	object	否	是	金额
blnAlloc	string	否	是	是否已分配
currencyTypeIdMap	object	否	是	币种id
accbook	string	否	是	账簿币id

## 3. 请求示例

Url: /yonbip/EFI/fieia/costAlloc?access_token=访问令牌
Body: {
	"accentity": "",
	"accbook": "",
	"periodCode": "",
	"accpurpose": 0,
	"bookDateStart": "",
	"bookDateEnd": "",
	"stockOrg": "",
	"warehouse": "",
	"materialId": "",
	"materialClass": "",
	"projectId": "",
	"wbs": "",
	"busiWbs": "",
	"batchNo": "",
	"allocDimension": "",
	"allocDimVOList": [
		{
			"material": "",
			"num": 0,
			"amountMap": {
				"accbook": 0
			},
			"blnAlloc": ""
		}
	],
	"currencyTypeIdMap": {
		"accbook": ""
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

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {}
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
	1	2026-02-25	
更新
请求说明
更新
请求参数 (23)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

