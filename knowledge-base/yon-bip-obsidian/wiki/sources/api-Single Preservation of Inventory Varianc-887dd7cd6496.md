---
title: "盘点差异单单个保存"
apiId: "887dd7cd64964105bf1b6c5671633a98"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Inventory Variance Document"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Inventory Variance Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 盘点差异单单个保存

>  请求方式	POST | Inventory Variance Document (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/scm/storecheckdifference/single/save
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	MDD幂等
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	否	是	盘点差异单主表
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
id	string	否	否	主表id， 新增时无需填写，修改时必填
code	string	否	否	单据编号，以系统编码规则配置为准，系统设置为手工编号时必输，系统设置为自动编号时非必输；更新操作时必填 示例：PDCY0000001
stockOrg	string	否	是	库存组织id或code 示例：2345083323961856
accountOrg	string	否	是	会计主体id或code 示例：2345083323961856
vouchdate	string	否	是	单据时间，格式为:yyyy-MM-dd HH:mm:ss 示例：2022-05-20 00:00:00
businesstype	string	否	是	交易类型id或code 示例：2343689668121094
store	string	否	否	门店id或code 示例：store_code_01
warehouse	string	否	是	仓库id或code 示例：2345141176750336
department	string	否	否	部门id或code，倒冲盘点且启用了成本核算时必输 示例：2345084253950208
stockMgr	string	否	否	库管员id或code 示例：2345318483628288
operator	string	否	否	业务员id或code 示例：2345318483628288
memo	string	否	否	备注 示例：这是备注
_status	string	否	是	操作标识, Insert:新增、Update:更新 示例：Insert
details	object	是	是	盘点差异单子表
storeCheckDifferenceCustomItem	object	否	否	表头自定义项(1-60)
defines	object	否	否	表头自由自定义项（1-60）

## 3. 请求示例

Url: /yonbip/scm/storecheckdifference/single/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": "",
		"code": "PDCY0000001",
		"stockOrg": "2345083323961856",
		"accountOrg": "2345083323961856",
		"vouchdate": "2022-05-20 00:00:00",
		"businesstype": "2343689668121094",
		"store": "store_code_01",
		"warehouse": "2345141176750336",
		"department": "2345084253950208",
		"stockMgr": "2345318483628288",
		"operator": "2345318483628288",
		"memo": "这是备注",
		"_status": "Insert",
		"details": [
			{
				"id": "",
				"product": "2345138522099968",
				"productsku": "2345138528915712",
				"profitlossqty": 1,
				"profitlossnumber": 1,
				"batchno": "000",
				"producedate": "2022-05-23 00:00:00",
				"invaliddate": "2022-05-23 00:00:00",
				"goodsposition": "c1-1",
				"unit": "2344814373523712",
				"stockUnitId": "2344814373523712",
				"project": "2411545234969600",
				"reserveid": "76",
				"memo": "备注",
				"_status": "Insert",
				"storeCheckDifferenceDetailCustomItem": {
					"id": "",
					"define1": "表体自定义项1",
					"define2": "表体自定义项2"
				},
				"defines": {
					"id": "",
					"define1": "表体自由定义项1",
					"define2": "表体自由定义项2"
				},
				"storeCheckDifferenceDetailSNs": [
					{
						"id": "",
						"sn": "000015",
						"_status": "Insert"
					}
				]
			}
		],
		"storeCheckDifferenceCustomItem": {
			"id": "",
			"define1": "表头自定义项1",
			"define2": "表头自定义项2"
		},
		"defines": {
			"id": "",
			"define1": "表头自由自定义项1",
			"define2": "表头自由自定义项2"
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
code	string	否	返回码，调用成功时返回200
message	string	否	返回信息描述
data	object	否	返回数据
fromApi_ustock	boolean	否	是否来自api：true 是，false 否
id	long	否	主表id
vouchdate	string	否	单据时间，格式为:yyyy-MM-dd HH:mm:ss
status	int	否	单据状态, 0:开立、1:已审核、2:关闭、3:审核中
code	string	否	单据编号
stockOrg	string	否	库存组织id
stockOrg_name	string	否	库存组织名称
accountOrg	string	否	会计主体id
accountOrg_name	string	否	会计主体名称
businesstype	string	否	交易类型id
businesstype_name	string	否	交易类型名称
store	long	否	门店id
warehouse	long	否	仓库id
warehouse_name	string	否	仓库名称
shop	long	否	商家
department	string	否	部门id
department_name	string	否	部门名称
stockMgr	string	否	库管员IDid
stockMgr_name	string	否	库管员名称
operator	string	否	业务员id
operator_name	string	否	业务员名称
warehouse_isInvertedScour	boolean	否	是否倒冲仓库true:是、false:否
warehouse_iSerialManage	boolean	否	仓库是否序列号严格管理true:是、false:否
isGoodsPosition	boolean	否	货位盘点true:是、false:否
tenant	long	否	租户
memo	string	否	备注
creator	string	否	创建人
creatorId	long	否	创建人id
createDate	string	否	创建日期,格式为:yyyy-MM-dd HH:mm:ss
createTime	string	否	创建时间，格式为:yyyy-MM-dd HH:mm:ss
modifier	string	否	修改人
modifyDate	string	否	修改日期,格式为:yyyy-MM-dd HH:mm:ss
modifyTime	string	否	修改时间，格式为:yyyy-MM-dd HH:mm:ss
pubts	string	否	时间戳
isWfControlled	boolean	否	是否审批流 true是，false否
resubmitCheckKey	string	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
yTenantId	string	否	友互通租户id
storeCheckDifferenceCustomItem	object	否	主表自定义项
details	object	是	盘点差异单子表

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"fromApi_ustock": true,
		"id": 0,
		"vouchdate": "",
		"status": 0,
		"code": "",
		"stockOrg": "",
		"stockOrg_name": "",
		"accountOrg": "",
		"accountOrg_name": "",
		"businesstype": "",
		"businesstype_name": "",
		"store": 0,
		"warehouse": 0,
		"warehouse_name": "",
		"shop": 0,
		"department": "",
		"department_name": "",
		"stockMgr": "",
		"stockMgr_name": "",
		"operator": "",
		"operator_name": "",
		"warehouse_isInvertedScour": true,
		"warehouse_iSerialManage": true,
		"isGoodsPosition": true,
		"tenant": 0,
		"memo": "",
		"creator": "",
		"creatorId": 0,
		"createDate": "",
		"createTime": "",
		"modifier": "",
		"modifyDate": "",
		"modifyTime": "",
		"pubts": "",
		"isWfControlled": true,
		"resubmitCheckKey": "",
		"yTenantId": "",
		"storeCheckDifferenceCustomItem": {
			"id": 0,
			"define1": "",
			"define2": ""
		},
		"details": [
			{
				"mainid": 0,
				"id": 0,
				"rowno": 0,
				"product": 0,
				"product_cCode": "",
				"product_cName": "",
				"productsku": 0,
				"batchno": "",
				"producedate": "",
				"invaliddate": "",
				"expireDateNo": 0,
				"expireDateUnit": 0,
				"isSerialNoManage": true,
				"isBatchManage": true,
				"isExpiryDateManage": true,
				"profitlossqty": 0,
				"profitlossnumber": 0,
				"profitqty": 0,
				"profitnumber": 0,
				"lossqty": 0,
				"lossnumber": 0,
				"occurredqty": 0,
				"occurrednum": 0,
				"accountQty": 0,
				"accountNUM": 0,
				"quantity": 0,
				"number": 0,
				"unit": 0,
				"unitName": "",
				"stockUnitId": 0,
				"stockUnit_name": "",
				"invExchRate": 0,
				"unitExchangeType": 0,
				"goodsposition": 0,
				"goodsposition_name": "",
				"pubts": "",
				"memo": "",
				"unit_Precision": 0,
				"stockUnitId_Precision": 0,
				"stockStatusDoc": 0,
				"stockStatusDoc_name": "",
				"reserveid": 0,
				"project": "",
				"project_name": "",
				"inventoryowner": 0,
				"ownertype": 0,
				"lineno": 0,
				"yTenantId": "",
				"storeCheckDifferenceDetailSNs": [
					{
						"id": 0,
						"pubts": "",
						"grandpaid": 0,
						"detailid": 0,
						"sn": ""
					}
				],
				"storeCheckDifferenceDetailCustomItem": {
					"id": 0,
					"define1": "",
					"define2": ""
				}
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
999	服务端逻辑异常	

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

