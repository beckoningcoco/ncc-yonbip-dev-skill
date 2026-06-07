---
title: "固定资产重分类保存"
apiId: "1821078872564170754"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Fixed Asset Category Reclassfication"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Fixed Asset Category Reclassfication]
platform_version: "BIP"
source_type: community-api-docs
---

# 固定资产重分类保存

>  请求方式	POST | Fixed Asset Category Reclassfication (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/EFI/reclass_bill/save
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	MDD幂等
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
billnum	string	否	是	单据编码 示例：fa_reclassbill 默认值：fa_reclassbill
data	object	否	是	重分类信息
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
code	string	否	否	重分类编码(手工输入，重分类编码为手工编号”时，导入以手工输入重分类编码为准) 示例：CL002508
accentity	string	否	否	会计主体id,会计主体id和会计主体编码不能同时为空，id和编码同时存在，以id为准 示例：1796677711656648705
accentity_code	string	否	否	会计主体编码,会计主体id和会计主体编码不能同时为空，id和编码同时存在，以id为准 示例：gl00048
vouchdate	string	否	是	重分类日期,格式yyyy-MM-dd 示例：2023-03-22
_fromApi	boolean	否	是	来源标识(必输:true) 示例：true 默认值：true
_status	string	否	是	操作标识(必输:Insert) 示例：Insert 默认值：Insert
bodies	object	是	是	重分类明细

## 3. 请求示例

Url: /yonbip/EFI/reclass_bill/save?access_token=访问令牌
Body: {
	"billnum": "fa_reclassbill",
	"data": {
		"resubmitCheckKey": "",
		"code": "CL002508",
		"accentity": "1796677711656648705",
		"accentity_code": "gl00048",
		"vouchdate": "2023-03-22",
		"_fromApi": true,
		"_status": "Insert",
		"bodies": [
			{
				"assetId": "1798765469485760518",
				"assetId_code": "gl00048",
				"afCategoryId": "1798765469485760518",
				"afCategoryId_code": "0201",
				"afSubCategoryId": "1798765469485760518",
				"afSubCategoryId_code": "gl00048",
				"blnNewRule": true,
				"amortiAdjustDate": "2025-01-01",
				"_status": "Insert"
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
creator	string	否	创建人
code	string	否	状态码 示例：200
message	string	否	返回描述 示例：操作成功
data	object	否	返回数据
id	string	否	重分类主表id 示例：1821246685508534279
code	string	否	重分类单据编码 示例：CL002510
busiObj	string	否	业务对象 示例：ReclassBill
cBillNo	string	否	单据编码 示例：fa_reclassbill
accentity	string	否	会计主体 示例：1796677711656648705
accentity_code	string	否	会计主体编码 示例：0912
vouchdate	string	否	重分类日期 示例：2023-03-22
busiPostStatus	string	否	过账状态 示例：0
importErrorList	object	是	插入错误集合
billTypeId	string	否	单据类型 示例：2374907110478080EFA
metaFullName	string	否	元数据全称 示例：fa.reclass.ReclassBill
errorList	object	是	错误信息集合
billTradeTypeId	string	否	交易类型 示例：1795048785173284194
fullName	string	否	元数据全称 示例：fa.reclass.ReclassBill
resubmitCheckKey	string	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
ytenantId	string	否	租户id 示例：0000LLDEYOZQHA5RER0000
createTime	string	否	创建时间 示例：2023-09-20 22:42:15
pubts	string	否	时间戳 示例：2023-09-21 10:53:24
bodies	object	是	固定资产重分类子表详情
details	object	是	固定资产重分类明细表

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"id": "1821246685508534279",
		"code": "CL002510",
		"busiObj": "ReclassBill",
		"cBillNo": "fa_reclassbill",
		"accentity": "1796677711656648705",
		"accentity_code": "0912",
		"vouchdate": "2023-03-22",
		"busiPostStatus": "0",
		"importErrorList": [
			{}
		],
		"billTypeId": "2374907110478080EFA",
		"metaFullName": "fa.reclass.ReclassBill",
		"errorList": [
			{}
		],
		"billTradeTypeId": "1795048785173284194",
		"fullName": "fa.reclass.ReclassBill",
		"resubmitCheckKey": "",
		"ytenantId": "0000LLDEYOZQHA5RER0000",
		"createTime": "2023-09-20 22:42:15",
		"pubts": "2023-09-21 10:53:24",
		"bodies": [
			{
				"id": "1821246685508534279",
				"metaFullName": "fa.reclass.ReclassBillDetail",
				"afSubCategoryId": "1821246685508534279",
				"afCategoryId": "1821246685508534279",
				"blnNewRule": true,
				"assetId": "1821246685508534279",
				"fullName": "fa.reclass.ReclassBillDetail",
				"afScrapValueType": "1",
				"beCategoryId": "1821246685508534279",
				"beLifeYear": 3,
				"reclassId": "1821246685508534279",
				"afLifeMonth": 1,
				"isDepr": true,
				"_status": 0,
				"beDeprMethodId": "1821246685508534279",
				"beScrapValueType": "1821246685508534279",
				"afDeprMethodId": "1821246685508534279",
				"beBookCategoryId": "1821246685508534279",
				"afLifeYear": 1,
				"accbookCurrtypeId": "1821246685508534279",
				"orgBeScrapValueAmount": 11,
				"beScrapValue": 11,
				"afScrapValueRate": 1,
				"beLifeMonth": 1,
				"afBookCategoryId": "1821246685508534279",
				"afScrapValue": 1,
				"beScrapValueRate": 1,
				"amortiAdjustDate": "2025-01-01",
				"afSubCategoryId_code": "0302",
				"assetId_code": "22"
			}
		],
		"details": [
			{
				"reclassId": "1111",
				"afScrapValueType": "1",
				"beCategoryId": "111",
				"dr": 0,
				"beLifeYear": 3,
				"metaFullName": "fa.reclass.ReclassBillDetailB",
				"afLifeMonth": 1,
				"accbook": "11",
				"afSubCategoryId": "111",
				"ytenantId": "1111",
				"isDepr": true,
				"_status": 0,
				"beDeprMethodId": "111",
				"beScrapValueType": "1",
				"afCategoryId": "1815089858499076435",
				"afDeprMethodId": "1815089858499076435",
				"beBookCategoryId": "1815089858499076435",
				"afLifeYear": 1,
				"accbookCurrtypeId": "1815089858499076435",
				"reclassType": "1,2",
				"orgBeScrapValueAmount": 123,
				"blnNewRule": true,
				"beScrapValue": 123,
				"afScrapValueRate": 123,
				"assetId": "1815089858499076435",
				"beLifeMonth": 2,
				"pubts": "2023-09-21 10:53:24",
				"afBookCategoryId": "1815089858499076435",
				"creator": "aa",
				"afScrapValue": 11,
				"calculateId": "1815089858499076435",
				"fullName": "fa.reclass.ReclassBillDetailB",
				"beScrapValueRate": 11,
				"createTime": "2023-09-21 10:53:24",
				"amortiAdjustDate": "2025-01-01",
				"afSubCategoryId_code": "0201",
				"assetId_code": "0201",
				"afCategoryId_code": "0201",
				"verifyState": 1
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
310008	参数校验失败,[data!bodies[0]!blnNewRule]是必填的.	传入blnNewRule

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2026-01-21	
删除
请求参数 oriBillId
去除入参oriBillId【业务幂等id】
	2	2025-12-11	
新增
请求参数 oriBillId
	3	2025-07-02	
新增
请求参数 amortiAdjustDate
新增
返回参数 amortiAdjustDate
新增
返回参数 amortiAdjustDate
删除
返回参数 amortiAdjustMark
删除
返回参数 amortiAdjustMark

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

