---
title: "允限销保存"
apiId: "96a41172225c4f5793966389eb7fb5f9"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Sales Restriction/Permission"
domain: "SD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Sales Restriction/Permission]
platform_version: "BIP"
source_type: community-api-docs
---

# 允限销保存

>  请求方式	POST | Sales Restriction/Permission (SD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/allow/limit/scope/save
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
data	object	是	是	允限销列表[marketing.scope.BusinessScope]
id	string	否	否	主表关联标识
creationOrgId	string	否	是	销售组织id或编码
templateId	string	否	是	经营范围维度，1:（客户+商品）、2:（客户+商品分类）、3:（客户+产品线）、4:（客户+品牌）、5:（客户分类+商品）、6:（客户分类+商品分类）、7:（客户分类+产品线）、8:（客户分类+品牌）、9:（客户级别+商品）、10：（客户级别+商品分类）、11：（客户级别+产品线）、12：（客户级别+品牌）、13：（销售区域+商品）、14：（销售区域+商品分类）、15：（销售区域+产品线）、16：（销售区域+品牌）
beginDate	string	否	是	生效日期
endDate	string	否	否	失效日期
agentId	string	否	否	客户id或编码,维度为1、2、3、4时必填
agentClassId	string	否	否	客户分类id或编码，维度为5、6、7、8时必填
agentLevelId	string	否	否	客户级别id或编码，维度为9、10、11、12时必填
agentAreaId	string	否	否	销售区域id或编码，维度为13、14、15、16时必填
productId	string	否	否	商品id或编码，维度为1、5、9、13时必填
skuId	string	否	否	skuid或编码
productClassId	string	否	否	商品分类id或编码，维度为2、6、10、14时必填
productLineId	string	否	否	产品线id或编码，维度为3、7、11、15时必填
productBrandId	string	否	否	品牌id或编码，维度为4、8、12、16时必填
source	string	否	否	来源类型(2：经销协议)
sourceAutoId	long	否	否	来源子表id（来源类型为2时，代表经销协议商品子表id, 且字段必填）
sourceId	long	否	否	来源id（来源类型为2时，代表经销协议id， 字段必填，且保持与上游单据号中的经销协议编码的数据一致性）
upCode	string	否	否	上游单据号（来源类型为2时，代表经销协议编码，必填，且保持与来源id中的经销协议id的数据一致性）
_status	string	否	是	操作标识, Insert:新增、 Update:更新

## 3. 请求示例

Url: /yonbip/sd/allow/limit/scope/save?access_token=访问令牌
Body: {
	"data": [
		{
			"id": "",
			"creationOrgId": "",
			"templateId": "",
			"beginDate": "",
			"endDate": "",
			"agentId": "",
			"agentClassId": "",
			"agentLevelId": "",
			"agentAreaId": "",
			"productId": "",
			"skuId": "",
			"productClassId": "",
			"productLineId": "",
			"productBrandId": "",
			"source": "",
			"sourceAutoId": 0,
			"sourceId": 0,
			"upCode": "",
			"_status": ""
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
icaConfirmTime	DateTime	否	确认时间 示例：2022-09-26 00:00:00
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
code	string	否	code 示例：200
message	string	否	message 示例：操作成功
data	object	否	data
failCountAI	number
小数位数:0,最大长度:20	否	failCountAI 示例：0
count	number
小数位数:0,最大长度:20	否	count 示例：1
sucessCount	number
小数位数:0,最大长度:20	否	sucessCount 示例：1
failCount	number
小数位数:0,最大长度:20	否	failCount 示例：0
messages	object	否	messages
infos	object	是	infos

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"failCountAI": 0,
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": {},
		"infos": [
			{
				"creationOrgId": "2163951720681984",
				"templateId": 1,
				"beginDate": "2021-07-01 00:00:00",
				"endDate": "2021-07-02 00:00:00",
				"agentId": 2346587850838272,
				"agentClassId": 0,
				"agentLevel": 0,
				"agentAreaId": 0,
				"productId": 2192250208538880,
				"productBrandId": 0,
				"productLineId": 0,
				"productClassId": 0,
				"agentId_code": "接口测试Y002000001",
				"creationOrgId_code": "#中国电信全职能组织",
				"templateId_code": "agent+product",
				"productId_code": "222000001",
				"agentClassId_code": "",
				"agentLevelId_code": "",
				"productBrandId_code": "",
				"productClassId_code": "",
				"productLineId_code": "",
				"id": 2383455085056256,
				"isChannel": false,
				"sellerId": 2163951720681984,
				"bizId": 2155538208313600,
				"pubts": "2021-08-11 17:35:54",
				"uordercorp": 2155538208313600
			}
		]
	}
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
999	错误信息	请联系管理员

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-25	
更新
请求说明
新增
请求参数 agentAreaId
更新
请求参数 (6)
新增
返回参数 agentAreaId
更新
返回参数 (35)
删除
返回参数 successCountAI

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

