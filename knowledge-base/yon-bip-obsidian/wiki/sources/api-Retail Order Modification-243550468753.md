---
title: "零售单变更"
apiId: "2435504687531687944"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Retail Document Card"
domain: "RetailServer"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Retail Document Card]
platform_version: "BIP"
source_type: community-api-docs
---

# 零售单变更

>  请求方式	POST | Retail Document Card (RetailServer)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/MCC/RetailServer/RM/retail.rm_retailvouch/retailvouch/change
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
data	object	否	是	数据节点
id	string	否	是	单据id 示例：2432525809994956806
iCoRetailid	string	否	否	原单id
iBusinesstypeid	string	否	否	业务类型 示例：1748274503978319880
iPresellState	string	否	否	预订单状态 0 代表非预订状态（现销）1代表预订状态（预定）2代表退订状态（退订）3代表预订交货（交货）4代表原预定单已退订（预定（退订）由原来1变为4）5代表原预定单已交货（预定（交货）由原来1变为5）6售后状态 7电商订单 8电商退货 示例：0
iTakeway	string	否	否	提货方式：0 即提,1 门店自提,2中心配送 示例：0
vouchdate	string	否	否	单据日期 示例：2025-12-22 14:01:14
cCusperson	string	否	否	联系人 示例：张先生
cMobileNo	string	否	否	联系电话 示例：13722222222
regionCode	string	否	否	收货地区 示例：001
cDeliveradd	string	否	否	收货地址 示例：北京东城壹号院东区33号楼
memo	string	否	否	备注 示例：备注
retailVouchHeaderExtend!iRetailid	string	否	否	表头扩展表id 示例：2432525809994956806
retailVouchHeaderExtend!cExpressCoID	string	否	否	物流网点id 示例：1432525809994956111
retailVouchDetails	object	是	否	零售单子表
_status	string	否	是	单据状态 示例：Update 默认值：Update

## 3. 请求示例

Url: /yonbip/MCC/RetailServer/RM/retail.rm_retailvouch/retailvouch/change?access_token=访问令牌
Body: {
	"data": {
		"id": "2432525809994956806",
		"iCoRetailid": "",
		"iBusinesstypeid": "1748274503978319880",
		"iPresellState": "0",
		"iTakeway": "0",
		"vouchdate": "2025-12-22 14:01:14",
		"cCusperson": "张先生",
		"cMobileNo": "13722222222",
		"regionCode": "001",
		"cDeliveradd": "北京东城壹号院东区33号楼",
		"memo": "备注",
		"retailVouchHeaderExtend!iRetailid": "2432525809994956806",
		"retailVouchHeaderExtend!cExpressCoID": "1432525809994956111",
		"retailVouchDetails": [
			{
				"id": "2432525809994956807",
				"iEmployeeid": "2356086309912051728",
				"iBathid": "2356086309912051728",
				"cBatchno": "111222",
				"producedate": "2025-01-01 00:00:00",
				"invaliddate": "2028-01-01 00:00:00",
				"iWarehouseid": "1748273498933428229",
				"goodsposition": "1748230583634886664",
				"retailVouchDetailExtend!retailVouchDetail": "2432525809994956807",
				"retailVouchDetailExtend!inventoryowner": "2432525809994956111",
				"cMemo": "行备注",
				"iBackid": "1748230583634886111",
				"_status": "Update"
			}
		],
		"_status": "Update"
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
小数位数:0,最大长度:10	否	状态码 示例：200
message	string	否	状态消息 示例：操作成功
data	object	否	结果集
modifier	string	否	修改人 示例：昵称-沈磊
modifierId	string	否	修改人id 示例：1593185416648851464
iMaker	string	否	制单人 示例：1564178470246285322
vouchdate	string	否	单据日期 示例：2025-09-18 09:31:43
modifyTime	string	否	修改时间 示例：2025-12-29 13:54:11
retailVouchHeaderDefineCharacter	object	否	自定义项特征组
id	string	否	零售单id 示例：2361880761864290312
pubts	string	否	时间戳 示例：2025-12-29 13:54:11
tenant	number
小数位数:0,最大长度:16	否	租户id 示例：2909930715861584
iTakeway	number
小数位数:0,最大长度:10	否	提货方式：0 即提,1 门店自提,2中心配送 示例：0
modifyDate	string	否	修改日期 示例：2025-12-29 13:54:11
store	string	否	门店 示例：1554588718809481217
retailVouchHeaderDefineCharacter__id	string	否	自定义项特征组ID 示例：2361880761864290320
iDeliveryState	number
小数位数:0,最大长度:10	否	交货状态 0未交 1已交 2退订 示例：1
iStoreOrgId	string	否	销售组织id 示例：1525653687361339397
stockOrgId	string	否	库存组织id 示例：1525653687361339397
retailVouchDetails	object	是	零售单明细
bPreselllockStock	boolean	否	预订占用可用量 示例：false
iPresellState	number
小数位数:0,最大长度:10	否	预订单状态 0 代表非预订状态（现销）1代表预订状态（预定）2代表退订状态（退订）3代表预订交货（交货）4代表原预定单已退订（预定（退订）由原来1变为4）5代表原预定单已交货（预定（交货）由原来1变为5）6售后状态 7电商订单 8电商退货 示例：0
code	string	否	零售单号 示例：LS001320250918000001
retailVouchHeaderExtend!iRetailid	string	否	主表扩展表id 示例：2361880761864290312

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"modifier": "昵称-沈磊",
		"modifierId": "1593185416648851464",
		"iMaker": "1564178470246285322",
		"vouchdate": "2025-09-18 09:31:43",
		"modifyTime": "2025-12-29 13:54:11",
		"retailVouchHeaderDefineCharacter": {
			"ytenant": "0000L6YQ8AVLFUZPXD0000",
			"id": "2361880761864290320"
		},
		"id": "2361880761864290312",
		"pubts": "2025-12-29 13:54:11",
		"tenant": 2909930715861584,
		"iTakeway": 0,
		"modifyDate": "2025-12-29 13:54:11",
		"store": "1554588718809481217",
		"retailVouchHeaderDefineCharacter__id": "2361880761864290320",
		"iDeliveryState": 1,
		"iStoreOrgId": "1525653687361339397",
		"stockOrgId": "1525653687361339397",
		"retailVouchDetails": [
			{
				"id": "2361880761864290317",
				"fQuantity": 1
			}
		],
		"bPreselllockStock": false,
		"iPresellState": 0,
		"code": "LS001320250918000001",
		"retailVouchHeaderExtend!iRetailid": "2361880761864290312"
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
暂时没有数据哦~

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

