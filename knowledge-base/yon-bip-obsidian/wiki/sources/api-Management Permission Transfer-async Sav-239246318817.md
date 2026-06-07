---
title: "管理权移交-异步保存"
apiId: "2392463188175618050"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Management Permission Transfer Card"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Management Permission Transfer Card]
platform_version: "BIP"
source_type: community-api-docs
---

# 管理权移交-异步保存

>  请求方式	POST | Management Permission Transfer Card (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/PFC/transfermc/api/transfermcSave
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
sourceOrgId	string	否	是	源组织 示例：666666
targetOrgId	string	否	是	目标组织 示例：1988229232323
docCode	string	否	是	移交档案编码 示例：aa_merchantref
dataScopeDTO	object	否	是	数据范围
isAll	boolean	否	是	全部 示例：false
operatorType	string	否	否	条件关系 示例：and
ruleItems	object	是	否	规则

## 3. 请求示例

Url: /yonbip/PFC/transfermc/api/transfermcSave?access_token=访问令牌
Body: {
	"sourceOrgId": "666666",
	"targetOrgId": "1988229232323",
	"docCode": "aa_merchantref",
	"dataScopeDTO": {
		"isAll": false,
		"operatorType": "and",
		"ruleItems": [
			{
				"code": "aa_custcategoryref",
				"values": [
					"111",
					"222"
				]
			}
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
code	number
小数位数:0,最大长度:10	否	200 示例：200
message	string	否	消息 示例：操作成功
data	object	否	数据
jobId	string	否	任务主键 示例：9384323423423

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"jobId": "9384323423423"
	}
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
999	错误	

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

