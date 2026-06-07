---
title: "分销商(团长)注册信息字段查询"
apiId: "14b73b0450044c68b3f7f015df23d8c3"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Community Leader"
domain: "MemberServer"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Community Leader]
platform_version: "BIP"
source_type: community-api-docs
---

# 分销商(团长)注册信息字段查询

>  请求方式	POST | Community Leader (MemberServer)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/distribution/define/query
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
templateId	string	否	是	模板ID（值为Distributor时，sceneType不能填；值为MembersApp时，sceneType可以为空，为空时查询全部） 示例：Distributor
sceneType	int	否	否	场景值 ：1 是否显示(一般用于新增) ；2 注册页显示(一般用于编辑) 示例：1

## 3. 请求示例

Url: /yonbip/sd/distribution/define/query?access_token=访问令牌
Body: {
	"templateId": "Distributor",
	"sceneType": 1
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
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
code	string	否	状态码 示例：200
code	string	否	单据编号
code	string	否	单据编号
data	object	是	数据对象
caption	string	否	属性名称 示例：名称
checkType	string	否	校验 示例：null
classId	string	否	页面ID 示例：Distributor
className	string	否	页面名称 示例：Distributor
defaultValue	string	否	默认值 示例：ddd
displayScene	long	是	显示场景 示例：[1]
id	string	否	属性ID 示例：cDistributorName
maxLength	long	否	长度 示例：20
name	string	否	属性名称 示例：名称
noBlank	boolean	否	非空（true：是 false：否） 示例：false
readOnly	boolean	否	只读(true:是 false:否) 示例：false
type	string	否	属性类型 示例：Text

## 5. 正确返回示例

{
	"code": "200",
	"data": [
		{
			"caption": "名称",
			"checkType": "null",
			"classId": "Distributor",
			"className": "Distributor",
			"defaultValue": "ddd",
			"displayScene": [
				1
			],
			"id": "cDistributorName",
			"maxLength": 20,
			"name": "名称",
			"noBlank": false,
			"readOnly": false,
			"type": "Text"
		}
	]
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
999	服务端逻辑异常	请求参数填写错误

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-25	
更新
请求参数 templateId
更新
请求参数 sceneType
更新
返回参数 (14)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

