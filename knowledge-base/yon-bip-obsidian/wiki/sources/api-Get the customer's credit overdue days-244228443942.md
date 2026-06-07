---
title: "获取对象信用逾期天数"
apiId: "2442284439425777671"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Credit A/R Status"
domain: "SD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Credit A/R Status]
platform_version: "BIP"
source_type: community-api-docs
---

# 获取对象信用逾期天数

>  请求方式	POST | Credit A/R Status (SD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/MCC/creditFormula/getCreditOverdueDays
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
data	object	否	否	入参
onlyOverdue	boolean	否	否	仅查逾期数据(true：则仅逾期，false：则逾期+未逾期， 默认为false) 示例：false
billId	number
小数位数:0,最大长度:19	否	否	单据id(当存在单据id和单据明细id的时候，以单据id、单据明细id匹配数据) 示例：2412395848014495746
billDetailId	number
小数位数:0,最大长度:19	否	否	单据行id(当存在单据id和单据明细id的时候，以单据id、单据明细id匹配数据) 示例：2412395848014495746
invoiceAgentId	number
小数位数:0,最大长度:19	否	否	开票客户id 示例：2412395092112834565
settlementOrgId	number
小数位数:0,最大长度:19	否	否	开票组织id 示例：2159562599469940745
saleOrgId	number
小数位数:0,最大长度:19	否	否	销售组织id 示例：2159562599469940745
saleDepId	number
小数位数:0,最大长度:19	否	否	销售部门id 示例：2429371955375243287
salesMan	number
小数位数:0,最大长度:19	否	否	销售业务员id 示例：2429371955375243287
extensionMap	object	否	否	扩展域信息（quickType：(表示特征编码或者物料等，productId:产品线，productId_mclass:物料分类,productId_pclass:商品分类, product_id:物料,特征编码根据实际值录入)；value:特征编码对应的值；type：特征值类型，stringType 字符串，longType 数字long类型,intType 整型数字，dateType 日期类型；extensionType 固定值 accurate） 示例：{ productId: { "value": "2183886408001781761", "type": "stringType", "extensionType": "accurate" },quickType: { "value": "2", "type": "stringType", "extensionType": "accurate" } }

## 3. 请求示例

Url: /yonbip/MCC/creditFormula/getCreditOverdueDays?access_token=访问令牌
Body: {
	"data": {
		"onlyOverdue": false,
		"billId": 2412395848014495746,
		"billDetailId": 2412395848014495746,
		"invoiceAgentId": 2412395092112834565,
		"settlementOrgId": 2159562599469940745,
		"saleOrgId": 2159562599469940745,
		"saleDepId": 2429371955375243287,
		"salesMan": 2429371955375243287,
		"extensionMap": {
			"productId": {
				"value": "2183886408001781761",
				"type": "stringType",
				"extensionType": "accurate"
			},
			"quickType": {
				"value": "2",
				"type": "stringType",
				"extensionType": "accurate"
			}
		}
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
message	string	否	信息 示例：操作成功
data	string	否	响应信息
icaConfirmTime	DateTime	否	确认时间 示例：2022-09-26 00:00:00
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
code	number
小数位数:0,最大长度:10	否	响应码 示例：200
message	string	否	响应信息 示例：操作成功
data	object	是	响应数据
recordId	string	否	档案id 示例：2412395848014495746
targetObjId	string	否	信用对象id 示例：2412395092112834565
targetType	number
小数位数:0,最大长度:10	否	对象类型：（ 0 客户,1 业务员,2 销售组织,3 销售部门,4 对象域,5 会计主体） 示例：0
controlScope	number
小数位数:0,最大长度:10	否	范围类型(0 当前组织,2 全局,3 范围域) 示例：0
controlDomainId	string	否	范围id 示例：2241685724230844425
creditExtDomainId	string	否	扩展域ID 示例：2241685724230843226
checkValue	number
小数位数:0,最大长度:10	否	是否免检(0, "正常检查",1, "全部免检",2,"额度免检",4, "账期免检",6, "额度免检,账期免检") 示例：0
overdueDays	number
小数位数:0,最大长度:10	否	档案设定逾期天数 示例：0
maxOverdueDays	number
小数位数:0,最大长度:10	否	实际最大逾期天数 示例：14
acOverdueDays	number
小数位数:0,最大长度:10	否	信用逾期天数(实际-档案) 示例：14
sumRealMoney	number
小数位数:8,最大长度:20	否	分期行应收金额汇总 示例：123456.78
sumReceivedMoney	number
小数位数:8,最大长度:20	否	分期行信用已收金额汇总 示例：1235.98
periodInfo	object	是	逾期情况明细

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": [
		{
			"recordId": "2412395848014495746",
			"targetObjId": "2412395092112834565",
			"targetType": 0,
			"controlScope": 0,
			"controlDomainId": "2241685724230844425",
			"creditExtDomainId": "2241685724230843226",
			"checkValue": 0,
			"overdueDays": 0,
			"maxOverdueDays": 14,
			"acOverdueDays": 14,
			"sumRealMoney": 123456.78,
			"sumReceivedMoney": 1235.98,
			"periodInfo": [
				{
					"recordId": "2412395848014495746",
					"billNo": "XSDD1228003400",
					"schedulesNumber": "1",
					"expiringDateTime": "2025-12-22 00:00:00",
					"realMoney": 123456.78,
					"receivedMoney": 1235.98
				}
			]
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

