---
title: "采购合同列表查询"
apiId: "1697076483760586757"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Purchase Contract"
domain: "STC"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Purchase Contract]
platform_version: "BIP"
source_type: community-api-docs
---

# 采购合同列表查询

>  请求方式	POST | Purchase Contract (STC)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/cpu/contractOpenApi/queryList
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
pageIndex	int	否	否	页码 默认值：1
pageSize	int	否	否	每页数量 默认值：10
code	string	否	否	合同编码,可多选 示例：CODE01,CODE02
subject	string	否	否	合同名称
currencyId	string	否	否	币种主键
currencyCode	string	否	否	币种简称
billstatus	string	否	否	单据状态,可多选。0:期初补录,1:待买方推单,2:买方已推单,3:待买方确认,4:卖方变更中,5:卖方已变更,6:卖方已接受,7:卖方已拒绝,8:买方已确认,9:买方变更中,10:买方已变更,11:买方审批中,12:买方已审批,13:已废弃,14:取消发布,15:合同已删除,16:合同已关闭,17:待卖方确认,18:卖方已变更,19:已推送ERP,20:已生效,21:已终止,22:审批驳回,23:签章拒签 示例：1,21,-1
orgId	string	否	否	采购组织主键，可多选
orgCode	string	否	否	采购组织编码，可多选
purPersonId	string	否	否	采购员主键
purPersonCode	string	否	否	采购员编码
dealPsnId	string	否	否	处理人主键
dealPsnCode	string	否	否	处理人编码
createTimeStart	string	否	否	合同创建日期从 示例：2020-12-12
createTimeEnd	string	否	否	合同创建日期到(不包含当天) 示例：2020-12-13
vouchdate	string	否	否	单据日期 示例：2020-12-14
tsStart	string	否	否	最近更新时间从 示例：2020-12-12 00:00:00
tsEnd	string	否	否	最近更新时间到 示例：2020-12-12 23:59:59
subscribedateStart	string	否	否	合同签订日期从 示例：2020-12-12
subscribedateEnd	string	否	否	合同签订日期到（不包含当天） 示例：2020-12-13
actualvalidateStart	string	否	否	合同生效日期从 示例：2020-12-12
actualvalidateEnd	string	否	否	合同生效日期到（不包含当天） 示例：2020-12-13
actualinvalidateStart	string	否	否	合同终止日期从 示例：2020-12-12
actualinvalidateEnd	string	否	否	合同终止日期到（不包含当天） 示例：2020-12-13
transtypeId	string	否	否	交易类型主键
transtypeCode	string	否	否	交易类型编码
supplierId	long	否	否	供应商档案主键
supplierSupCode	string	否	否	供应商档案编码
billtype	string	否	否	合同类型 1.框架协议 2.普通合同
sourceType	string	否	否	合同来源 1:自制,2:超市,3:询报价,4:招投标,5:期初补录,7:请购单,8:采购需求,9:委外申请单
parentContractId	string	否	否	父合同主键
reqUapProjectId	string	否	否	项目档案主键
projectCode	string	否	否	项目档案编码
purContentTypeId	string	否	否	采购内容id
purContentType	string	否	否	采购内容编码
outerCTBillCode	string	否	否	外部合同号
orderBy	string	否	否	排序，默认为更新时间倒序 示例：ts desc(更新时间倒序),createTime asc(创建时间正序)

## 3. 请求示例

Url: /yonbip/cpu/contractOpenApi/queryList?access_token=访问令牌
Body: {
	"pageIndex": 0,
	"pageSize": 0,
	"code": "CODE01,CODE02",
	"subject": "",
	"currencyId": "",
	"currencyCode": "",
	"billstatus": "1,21,-1",
	"orgId": "",
	"orgCode": "",
	"purPersonId": "",
	"purPersonCode": "",
	"dealPsnId": "",
	"dealPsnCode": "",
	"createTimeStart": "2020-12-12",
	"createTimeEnd": "2020-12-13",
	"vouchdate": "2020-12-14",
	"tsStart": "2020-12-12 00:00:00",
	"tsEnd": "2020-12-12 23:59:59",
	"subscribedateStart": "2020-12-12",
	"subscribedateEnd": "2020-12-13",
	"actualvalidateStart": "2020-12-12",
	"actualvalidateEnd": "2020-12-13",
	"actualinvalidateStart": "2020-12-12",
	"actualinvalidateEnd": "2020-12-13",
	"transtypeId": "",
	"transtypeCode": "",
	"supplierId": 0,
	"supplierSupCode": "",
	"billtype": "",
	"sourceType": "",
	"parentContractId": "",
	"reqUapProjectId": "",
	"projectCode": "",
	"purContentTypeId": "",
	"purContentType": "",
	"outerCTBillCode": "",
	"orderBy": "ts desc(更新时间倒序),createTime asc(创建时间正序)"
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
code	string	否	编码 示例：200
data	object	否	数据项
beginPageIndex	long	否	起始页 示例：1
endPageIndex	long	否	结束页 示例：1
pageCount	long	否	总页数 示例：1
pageIndex	long	否	页码 示例：1
pageSize	long	否	每页数 示例：10
recordCount	long	否	总数量 示例：1
recordList	object	是	结果集
message	string	否	返回信息

## 5. 正确返回示例

{
	"code": "200",
	"data": {
		"beginPageIndex": 1,
		"endPageIndex": 1,
		"pageCount": 1,
		"pageIndex": 1,
		"pageSize": 10,
		"recordCount": 1,
		"recordList": [
			{
				"code": "000389",
				"subscribedate": "",
				"externalFileId": "a59ac791-36d7-4e45-9ed1-202d9e00b164",
				"supplierId": 1545514311928512515,
				"subject": "测试",
				"saleStampFileId": "bd6bd07b-8ec4-43ac-9000-fc4339b9f119",
				"orgId": "",
				"stockStampFileId": "75ed21fe-969a-469b-b740-7ff9e95a9867",
				"transtypeName": "测试1",
				"actualvalidate": "",
				"billtype": "2",
				"currencyName": "人民币",
				"orgCode": "0000000001",
				"epayType": false,
				"id": 1682064404736638978,
				"execType": "0",
				"currencyId": "",
				"eContractCreateType": "1",
				"supplierSupCode": "miao",
				"purPersonId": "1692574215453016069",
				"orgName": "用友集团cn",
				"currencySymbol": "￥",
				"taxMoney": 10000,
				"internalFileId": "0d2d1c0b-ed44-4ca4-b9ae-a3e14a4a9414",
				"purPersonName": "叶孤城",
				"signedFileId": "5fd5e3ae-be7b-41e8-976d-e593de0fe4aa",
				"saleFileId": "b1651a09-4315-4262-9e99-24ca75304cea",
				"money": 9881.423,
				"controlType": "0",
				"sourceType": "1",
				"createTime": "1680509655000",
				"isMaterialClass": true,
				"eContractFileId": "70eaace3-c388-4515-bf32-dd3cc3dea9f7",
				"supplierSupName": "0818测试新架构全供应商",
				"transtypeCode": "c1",
				"businessType": "1",
				"orgScope": false,
				"currencyCode": "CNY1111",
				"reqUapProjectId": "",
				"projectName": "",
				"projectCode": "",
				"memo": "",
				"natCurrency": "",
				"natCurrency_code": "CNY",
				"natCurrency_name": "人民币",
				"exchRate": 1,
				"natMoney": 100,
				"natTaxMoney": 100,
				"exchRateType_name": "基准汇率",
				"exchRateType": "system",
				"exchRateDate": "2023-05-11",
				"signStatus": 0,
				"ts": "",
				"tax": 1,
				"natTax": 1
			}
		]
	},
	"message": ""
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
999	采购合同列表查询失败	列表查询失败原因

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2026-01-22	
新增
返回参数 (4)
更新
返回参数 (480)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

