---
title: "固定资产类别批量修改"
apiId: "2045706211899736072"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Fixed Asset Category Structure"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Fixed Asset Category Structure]
platform_version: "BIP"
source_type: community-api-docs
---

# 固定资产类别批量修改

>  请求方式	POST | Fixed Asset Category Structure (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/EFI/FixedAssetsCategoryVO/modify
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
data	object	是	是	固定资产类别信息
code	string	否	否	分类编码, id与code不可同时为空, 同时传入以id为准 示例：123475
name	string	否	否	分类名称 示例：分类001
unitId	string	否	否	计量单位ID 示例：1656411080548679685
unit_code	string	否	否	计量单位编码 示例：M
description	string	否	否	描述 示例：描述001
enable	string	否	否	启用状态 示例：1
blnInventory	boolean	否	否	是否盘点 示例：true
blnLease	boolean	否	否	是否使用权资产 示例：true
lifeYear	long	否	否	使用年 示例：5
lifeMonth	long	否	否	使用月 示例：0
scrapValueType	string	否	否	残值类型, 0残值率,1残值金额 示例：0
scrapValueAmount	BigDecimal	否	否	残值金额 示例：150
scrapValueRate	float	否	否	残值率 示例：5
id	string	否	否	主键, id与code不可同时为空, 同时传入以id为准 示例：4522344
useScrapValueType	string	否	否	使用权残值类型, 购买并启用使用权资产时可用 示例：0
useScrapValueAmount	BigDecimal	否	否	使用权残值金额, 购买并启用使用权资产时可用 示例：150
useScrapValueRate	float	否	否	使用权残值率, 购买并启用使用权资产时可用 示例：5
deprMethodId	string	否	否	折旧方法id 示例：1525698312061253427
deprMethodId_code	string	否	否	折旧方法编码 示例：01
seniorDeprMethodId	string	否	否	高级折旧方法id 示例：1525698312061253427
seniorDeprMethodId_code	string	否	否	高级折旧方法编码 示例：09
cateStructId	string	否	否	固定资产类别结构ID, 类别结构id和code不能同时为空, 同时传入时以id为准 示例：1525644719463333915
cateStructCode	string	否	否	固定资产类别结构编码, 类别结构id和code不能同时为空, 同时传入时以id为准 示例：67

## 3. 请求示例

Url: /yonbip/EFI/FixedAssetsCategoryVO/modify?access_token=访问令牌
Body: {
	"data": [
		{
			"code": "123475",
			"name": "分类001",
			"unitId": "1656411080548679685",
			"unit_code": "M",
			"description": "描述001",
			"enable": "1",
			"blnInventory": true,
			"blnLease": true,
			"lifeYear": 5,
			"lifeMonth": 0,
			"scrapValueType": "0",
			"scrapValueAmount": 150,
			"scrapValueRate": 5,
			"id": "4522344",
			"useScrapValueType": "0",
			"useScrapValueAmount": 150,
			"useScrapValueRate": 5,
			"deprMethodId": "1525698312061253427",
			"deprMethodId_code": "01",
			"seniorDeprMethodId": "1525698312061253427",
			"seniorDeprMethodId_code": "09",
			"cateStructId": "1525644719463333915",
			"cateStructCode": "67"
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
code	string	否	状态值 示例：200
message	string	否	返回信息 示例：操作成功
data	object	否	返回数据
count	long	否	总条数 示例：1
sucessCount	long	否	成功条数 示例：1
failCount	long	否	失败条数 示例：0
messages	string	是	返回信息明细
infos	object	是	返回数据明细
failInfos	string	是	失败信息明细

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			""
		],
		"infos": [
			{
				"id": "1817306869059813382"
			}
		],
		"failInfos": [
			""
		]
	}
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
999	分类名称不允许为空	补充分类名称

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

