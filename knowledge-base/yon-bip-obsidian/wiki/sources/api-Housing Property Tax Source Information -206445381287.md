---
title: "房产税源信息-编辑（废弃）"
apiId: "2064453812878311427"
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

# 房产税源信息-编辑（废弃）

>  请求方式	POST | Property tax source information (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/tax/other-tax/api/house-account/edit_copy
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
lyid	string	否	否	来源id（来源id和房产税源编号不可同时为空，且不能同时填写） 示例：11
orgCode	string	否	是	组织编码 示例：ceshishanchu
isArchived	int	否	否	是否已在税局备案。0-未备案、1-已备案 示例：1
code	string	否	否	房产税源编号（来源id和房产税源编号不可同时为空，且不能同时填写） 示例：FCSY20240808000001
taxPayerType	string	否	否	纳税人类型1：产权所有人 2:经 营管理人 3:承典人 4: 房屋代管人 5:房屋使 用人 6：融资租赁承 租人 示例：1
ownerCode	string	否	否	所有权人识别号 示例：0001122334455
ownerName	string	否	否	所有权人名称 示例：商业创新科技网络
certNum	string	否	否	不动产权证号 示例：1122334455
unitNum	string	否	否	不动产单元号 示例：09041417
name	string	否	否	房产名称 示例：创新科技园
uses	string	否	否	房产用途1：工业 2:商业及办 公 3:住房 4:其他 示例：1
obtainTime	date
格式:yyyy-MM-dd	否	否	房产取得时间 示例：2020-07-21
constructionArea	BigDecimal	否	否	建筑面积，支持13位整数+2位小数 示例：1.00
taxOffice	string	否	否	所属主管税务所 示例：国家税务总局北京市东城区税务局第一税务所（办税服务厅）
declarationMethod	string	否	否	申报方式1.属地、2.汇总、3. 异地 示例：1
landNum	string	否	否	房屋所在土地编号 示例：0915124027
unitType	string	否	否	不动产权证类型 1.新证 2.其他证书 3.暂未取得 示例：1
projectCode	string	否	否	项目编码 示例：123
contractCodes	string	是	否	房屋租赁合同编号 示例：["1","2"]
province	string	否	否	省/直辖市 示例：北京市
city	string	否	否	市 示例：市辖区
area	string	否	否	区 示例：海淀区
town	string	否	否	城镇/街道 示例：西北旺街道
isInvolvedHouseVatDetail	string	否	否	涉及房产税 0-否 1-是 示例：1
houseCode	string	否	否	房产编号 示例：房产编号1

## 3. 请求示例

Url: /yonbip/tax/other-tax/api/house-account/edit_copy?access_token=访问令牌
Body: {
	"lyid": "11",
	"orgCode": "ceshishanchu",
	"isArchived": 1,
	"code": "FCSY20240808000001",
	"taxPayerType": "1",
	"ownerCode": "0001122334455",
	"ownerName": "商业创新科技网络",
	"certNum": "1122334455",
	"unitNum": "09041417",
	"name": "创新科技园",
	"uses": "1",
	"obtainTime": "2020-07-21",
	"constructionArea": 1,
	"taxOffice": "国家税务总局北京市东城区税务局第一税务所（办税服务厅）",
	"declarationMethod": "1",
	"landNum": "0915124027",
	"unitType": "1",
	"projectCode": "123",
	"contractCodes": [
		"1",
		"2"
	],
	"province": "北京市",
	"city": "市辖区",
	"area": "海淀区",
	"town": "西北旺街道",
	"isInvolvedHouseVatDetail": "1",
	"houseCode": "房产编号1"
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
code	string	否	操作码 示例：0000
message	string	否	操作描述 示例：操作成功

## 5. 正确返回示例

{
	"code": "0000",
	"message": "操作成功"
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
9999	系统异常	根据具体返回信息调整数据

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

