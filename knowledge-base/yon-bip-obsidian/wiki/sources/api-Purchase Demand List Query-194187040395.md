---
title: "采购需求列表查询"
apiId: "1941870403952574468"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Purchase Demand"
domain: "STC"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Purchase Demand]
platform_version: "BIP"
source_type: community-api-docs
---

# 采购需求列表查询

>  请求方式	POST | Purchase Demand (STC)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/cpu/purchase/list
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
pageSize	number
小数位数:0,最大长度:10	否	否	pageSize 示例：20 默认值：20
pageIndex	number
小数位数:0,最大长度:10	否	否	pageIndex 示例：1 默认值：1
simple	object	否	否	页签状态
ecProcessStatus	string	否	否	页签状态 示例：unassign 待分配；accepted 已受理；standby 待抢单；ALL 全部 默认值：ALL

## 3. 请求示例

Url: /yonbip/cpu/purchase/list?access_token=访问令牌
Body: {
	"pageSize": 20,
	"pageIndex": 1,
	"simple": {
		"ecProcessStatus": "unassign 待分配；accepted 已受理；standby 待抢单；ALL 全部"
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
code	number
小数位数:0,最大长度:10	否	code 示例：200
message	string	否	message 示例：操作成功
data	object	否	data
pageIndex	number
小数位数:0,最大长度:10	否	pageIndex 示例：1
pageSize	number
小数位数:0,最大长度:10	否	pageSize 示例：20
recordCount	number
小数位数:0,最大长度:10	否	recordCount 示例：1
recordList	object	是	recordList
pageCount	number
小数位数:0,最大长度:10	否	pageCount 示例：1
beginPageIndex	number
小数位数:0,最大长度:10	否	beginPageIndex 示例：1
endPageIndex	number
小数位数:0,最大长度:10	否	endPageIndex 示例：1
traceId	string	否	traceId 示例：917d8acb4e1da8e3

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 20,
		"recordCount": 1,
		"recordList": [
			{
				"corpSubAccount": "YHT-1714-19651636961125973",
				"corpAccountname": "230616日常旗舰新架构广乘1",
				"ecProcessStatusName": "待询价",
				"reqdate": "2023-08-09 00:00:00",
				"erpProductVersion": "PRAYBILL",
				"id": "1874285502941102090",
				"productDocId_name": "赛霸乳清蛋白粉",
				"sourcerowno": 2,
				"mainUnitId": "1751843449992118281",
				"reqUapProjectId": "1869230206171480067",
				"productId": "1751866565523406852",
				"materialClassCode": "000001",
				"currencyNameDiwork": "人民币",
				"currencyIdDiwork_priceRount": 4,
				"reqOrgId_name": "采购云",
				"purchaseUnitId_precision": 3,
				"receiveOrgId_name": "采购云",
				"headBillId": "1790028363530240000",
				"phone": "17604667537",
				"headBillType": "ycReqManagement.ycpraybill",
				"mainUnitId_truncationType": 4,
				"productDocId": "1751866565523406852",
				"mainUnitId_name": "千克",
				"sourcehid": "1790028363530240000",
				"sourcecode": "PB230809000002",
				"invPriceExchRate": 1,
				"currencyIdDiwork": "1749959505543168034",
				"mainUnitId_precision": 3,
				"headBillCode": "PB230809000002",
				"pubts": "2023-12-01 09:52:30",
				"reqOrgId": "1751832437691777029",
				"enterpriseName": "230616日常旗舰新架构广乘1",
				"purchaseUnitId_truncationType": 4,
				"creator": "2429181",
				"receivePersonTel": "17604667537",
				"unitid_precision": 3,
				"productCode": "0001000002",
				"isClosed": "打开",
				"createTime": "2023-12-01 09:52:27",
				"headBillTypeShow": "需求申请",
				"unitid_truncationType": 4,
				"unitid": "1751843449992118281",
				"purchaseNum": 18,
				"currencyIdDiwork_priceDigit": 2,
				"currencyCode": "CNY",
				"ts": "2023-12-01 09:52:31",
				"unitid_name": "千克",
				"mainNum": 18,
				"materialClassName": "广汽物资",
				"subject": "lhy230809-2111",
				"sourceTypeFormId": "ycReqManagement.ycpraybill",
				"headBillRowno": "2",
				"wbsCode": "32443558",
				"purchaseUnitId": "1751843449992118281",
				"receivePersonId": "1751835564424298505",
				"reqUapProjectId_name": "打豆豆",
				"puorgDocId_name": "采购云",
				"puorgDocId": "1751832437691777029",
				"planDeptId_name": "采购云质量部",
				"currencyIdDiwork_moneyRount": 4,
				"invPurExchRate": 1,
				"receivePersonId_name": "某某某",
				"code": "REQ2312010002",
				"reqDeptId": "1751835177880911877",
				"planDeptId": "1751835177880911877",
				"reqContactId_name": "李崇辉",
				"sourcebid": "1790028363530240003",
				"currencyIdDiwork_moneyDigit": 2,
				"returningErp": false,
				"currencyName": "人民币",
				"erpVender": "yuncai",
				"ipuPuReqFreeCharacteristics": {
					"0": "i",
					"1": "p",
					"2": "u",
					"3": "P",
					"4": "u",
					"5": "R",
					"6": "e",
					"7": "q",
					"8": "F",
					"9": "r",
					"10": "e",
					"11": "e",
					"12": "C",
					"13": "h",
					"14": "a",
					"15": "r",
					"16": "a",
					"17": "c",
					"18": "t",
					"19": "e",
					"20": "r",
					"21": "i",
					"22": "s",
					"23": "t",
					"24": "i",
					"25": "c",
					"26": "s",
					"id": "1874285502941102091",
					"pubts": "2023-08-09 21:12:20",
					"ytenant": "0000LIYLRLSG75DLOH0000"
				},
				"planPsnId_name": "某某某",
				"orderedQuantity": 0,
				"quantity": 18,
				"planPsnId": "1751835564424298505",
				"receiveOrgId": "1751832437691777029",
				"headBillBId": "1790028363530240003",
				"reqDeptId_name": "采购云质量部",
				"reqContactId": "1751835564424298505",
				"ecProcessStatus": "0",
				"businessType": "0",
				"purchaseUnitId_name": "千克"
			}
		],
		"pageCount": 1,
		"beginPageIndex": 1,
		"endPageIndex": 1
	},
	"traceId": "917d8acb4e1da8e3"
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

