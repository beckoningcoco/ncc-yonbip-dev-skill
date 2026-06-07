---
title: "物料分类树查询-特征"
apiId: "1694261184248676358"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Material Category"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Material Category]
platform_version: "BIP"
source_type: community-api-docs
---

# 物料分类树查询-特征

>  请求方式	POST | Material Category (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/digitalModel/managementclass/newtree
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
pageIndex	int	否	是	页码 示例：1 默认值：1
pageSize	int	否	是	分页大小 示例：100 默认值：100
name	string	否	否	名称 示例：名称
code	string	否	否	编码 示例：code
orgId	string	否	否	使用组织Id条件 示例：123456
orgCode	string	否	否	使用组织code条件 示例：orgCode
beganTime	DateTime	否	否	开始时间戳，包含 示例：2023-04-17 16:30:00
endTime	DateTime	否	否	结束结束时间戳，不包含 示例：2023-04-17 16:40:00
level	number
小数位数:0,最大长度:3	否	否	层级 示例：1
includeSubs	boolean	否	否	是否包含子分类（默认false只查当前节点，true则查询当前节点及所有下级节点）；必须同时穿编码或者名称，查询他们的子分类 示例：true

## 3. 请求示例

Url: /yonbip/digitalModel/managementclass/newtree?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 100,
	"name": "名称",
	"code": "code",
	"orgId": "123456",
	"orgCode": "orgCode",
	"beganTime": "2023-04-17 16:30:00",
	"endTime": "2023-04-17 16:40:00",
	"level": 1,
	"includeSubs": true
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
code	string	否	返回码，调用成功时返回200 示例："200"
message	string	否	调用返回信息 示例：操作成功
data	object	是	物料分类数据
id	long	否	id 示例：123456
code	string	否	编码 示例：code
name	object	否	名称
parent	long	否	上级分类id 示例：1465624
parentCode	string	否	上级分类编码 示例：上级分类
orgCode	string	否	管理组织编码 示例：orgcode
template	long	否	物料模板id 示例：14660545
templateName	string	否	物料模板名称 示例：物料模板
productClass	long	否	商品分类id 示例：1335120
productClassCode	string	否	商品分类编码 示例：presentationcode
order	int	否	排序号 示例：1
stopStatus	boolean	否	启用状态 true：停用 false：启用 示例：true
remark	object	否	备注

## 5. 正确返回示例

{
	"code": "\"200\"",
	"message": "操作成功",
	"data": [
		{
			"id": 123456,
			"code": "code",
			"name": {
				"simplifiedName": "简体",
				"englishName": "english",
				"traditionalName": "繁体"
			},
			"parent": 1465624,
			"parentCode": "上级分类",
			"orgCode": "orgcode",
			"template": 14660545,
			"templateName": "物料模板",
			"productClass": 1335120,
			"productClassCode": "presentationcode",
			"order": 1,
			"stopStatus": true,
			"remark": {
				"simplifiedName": "简体",
				"englishName": "english",
				"traditionalName": "繁体"
			}
		}
	]
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
999	服务端逻辑异常	检查入参是否填写正确，参数值是否真实存在，仍提示该信息请联系开发人员

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2026-04-18	
更新
请求说明
新增
请求参数 level
新增
请求参数 includeSubs
修改参数说明

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

