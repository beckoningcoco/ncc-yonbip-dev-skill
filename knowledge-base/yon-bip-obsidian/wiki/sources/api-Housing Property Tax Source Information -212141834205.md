---
title: "房产税源信息-查询_新"
apiId: "2121418342056591362"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Property tax source information"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Property tax source information]
platform_version: "BIP"
source_type: community-api-docs
---

# 房产税源信息-查询_新

>  请求方式	POST | Property tax source information (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/tax/other-tax/api/house-account/v1/query
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
orgCode	string	否	是	税务组织编码 示例：O0033
lyid	string	否	否	来源业务id:（来源业务id和房产税源编号不可同时填写) 示例：ly0022
code	string	否	否	房产税源在税务云自动生成的编号，全局唯一 （来源业务id和房产税源编号不可同时填写） 示例：C0011
sourceBy	string	否	否	数据来源:1手工录入、2模板导入、3接口 示例：3 默认值：3
status	string	否	否	状态:1正常、2义务终止、3待补录 示例：1 默认值：1

## 3. 请求示例

Url: /yonbip/tax/other-tax/api/house-account/v1/query?access_token=访问令牌
Body: {
	"orgCode": "O0033",
	"lyid": "ly0022",
	"code": "C0011",
	"sourceBy": "3",
	"status": "1"
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
code	string	否	操作码 示例：200
message	string	否	返回信息描述 示例：成功
data	object	是	数据
code	string	否	房产税源编码 示例：CD1011
projectCode	string	否	项目编码 示例：PR0011
orgCode	string	否	税务组织编码 示例：OR0011
nsrsbh	string	否	纳税人识别号 示例：NS0011
landNum	string	否	房屋所在土地编号 示例：LN0011
isInvolvedHouseVatDetail	string	否	涉及房产税：0-否 1-是 示例：1
sourceBy	string	否	数据来源:1手工录入、2模板导入、3接口 示例：3
sourceCode	string	否	来源业务编号 示例：SC1011
lyid	string	否	来源业务id 示例：SR0011
isArchived	string	否	是否已在税局备案：0-未备案、1-已备案：0-未备案、1-已备案： 示例：1
houseCode	string	否	房产编号 示例：HD0011
name	string	否	房产名称 示例：一等房子
uses	string	否	房产用途 示例：1
obtainTime	string	否	房产取得时间 示例：2024-01-01
rollOutTime	string	否	房产转出时间 示例：2024-12-12
constructionArea	number
小数位数:0,最大长度:10	否	建筑面积 示例：150
taxPayerType	string	否	"纳税人类型：1：产权所有人 2:经营管理人 3:承典人 4: 房屋代管人 5:房屋使用人 6：融资租赁承租人 示例：1
ownerOrgCode	string	否	所有权税务组织编码 示例：OR1011
ownerCode	string	否	所有权人识别号 示例：OW0011
ownerName	string	否	所有权人名称 示例：所有
unitType	string	否	不动产权证类型：1.不动产权证（原新证） 2.房屋所有权证（原其他证书） 3.暂未取得 示例：01
unitNum	string	否	不动产单元号 示例：UN1011
certNum	string	否	不动产权证号 示例：CN0011
province	string	否	省/直辖市 示例：北京
city	string	否	市 示例：北京
area	string	否	区 示例：回龙观
town	string	否	城镇/街道 示例：昌平区
detailAddr	string	否	房屋详细地址 示例：龙溪苑一区
taxOfficeName	string	否	所属主管税务所 示例：北京市税管所
taxRate	number
小数位数:1,最大长度:10	否	计税比例 示例：0.8
featureFd	string	否	特征字段 示例：fdfield
status	string	否	状态：1正常、2义务终止、3待补录 示例：1
houseAccountAuxiliaryFacilityDetailList	object	是	设置列表
houseAccountLeaseList	object	是	租赁信息列表

## 5. 正确返回示例

{
	"code": "200",
	"message": "成功",
	"data": [
		{
			"code": "CD1011",
			"projectCode": "PR0011",
			"orgCode": "OR0011",
			"nsrsbh": "NS0011",
			"landNum": "LN0011",
			"isInvolvedHouseVatDetail": "1",
			"sourceBy": "3",
			"sourceCode": "SC1011",
			"lyid": "SR0011",
			"isArchived": "1",
			"houseCode": "HD0011",
			"name": "一等房子",
			"uses": "1",
			"obtainTime": "2024-01-01",
			"rollOutTime": "2024-12-12",
			"constructionArea": 150,
			"taxPayerType": "1",
			"ownerOrgCode": "OR1011",
			"ownerCode": "OW0011",
			"ownerName": "所有",
			"unitType": "01",
			"unitNum": "UN1011",
			"certNum": "CN0011",
			"province": "北京",
			"city": "北京",
			"area": "回龙观",
			"town": "昌平区",
			"detailAddr": "龙溪苑一区",
			"taxOfficeName": "北京市税管所",
			"taxRate": 0.8,
			"featureFd": "fdfield",
			"status": "1",
			"houseAccountAuxiliaryFacilityDetailList": [
				{
					"auxiliaryFacilityDetailCode": "FC0011",
					"auxiliaryFacilityDetailType": "1",
					"auxiliaryFacilityDetailName": "设施01",
					"isInvolvedHouseVatDetail": "1",
					"sourceCode": "SC1012",
					"sourceId": "ly0001",
					"useMonth": "2022-08",
					"auxiliaryFacilityDetailValue": 1000,
					"plotRatio": 0.8,
					"facilityValRecordList": [
						{
							"auxiliaryFacilityDetailCode": "FC0011",
							"sourceId": "ly0001",
							"useMonth": "2023-06",
							"sourceValue": 1000,
							"plotRatio": 0.8
						}
					]
				}
			],
			"houseAccountLeaseList": [
				{
					"houseAccountLeaseCode": "LA0011",
					"sourceCode": "sz0001",
					"sourceId": "s000011",
					"rentArea": 50,
					"rentIncome": 1500,
					"rentBegin": "2022-02-01",
					"rentEnd": "2023-02-02"
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
9999	系统异常	根据message信息修改
1001	请设置Redis客户端编码	设置redis客户端信息

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-07-03	
更新
请求说明
更新
请求参数 orgCode
更新
请求参数 sourceBy
更新
返回参数 orgCode
更新
返回参数 sourceBy
更新
返回参数 ownerOrgCode

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

