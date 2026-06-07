---
title: "物料分类批量保存-特征"
apiId: "2063713162942218241"
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

# 物料分类批量保存-特征

>  请求方式	POST | Material Category (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/digitalModel/managementclass/batchsavenew
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	批量保存/更新
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	是	是	数据
id	number
小数位数:0,最大长度:22	否	否	id,新增时不填，更新时必填 示例：123456
code	string	否	是	编码 示例：code
name	object	否	是	名称
parentCode	string	否	否	上级分类编码 示例：code01
orgCode	string	否	否	管理组织编码 示例：code02
templateName	string	否	否	物料模板名称 示例：物料模板
productClassCode	string	否	否	商品分类编码 示例：code03
order	number
小数位数:0,最大长度:8	否	否	排序号 示例：1
stopStatus	boolean	否	否	启用状态 true：停用 false：启用 默认：false 示例：true
remark	object	否	否	备注
erpCode	string	否	否	外部编码,来源唯一标识 示例：erpCode

## 3. 请求示例

Url: /yonbip/digitalModel/managementclass/batchsavenew?access_token=访问令牌
Body: {
	"data": [
		{
			"id": 123456,
			"code": "code",
			"name": {
				"simplifiedName": "简体",
				"englishName": "英文",
				"traditionalName": "繁体"
			},
			"parentCode": "code01",
			"orgCode": "code02",
			"templateName": "物料模板",
			"productClassCode": "code03",
			"order": 1,
			"stopStatus": true,
			"remark": {
				"simplifiedName": "简体",
				"englishName": "英文",
				"traditionalName": "繁体"
			},
			"erpCode": "erpCode"
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
code	string	否	返回码，调用成功返回200 示例："200"
message	string	否	调用失败时的错误信息 示例：成功
data	object	否	调用成功的返回数据
count	number
小数位数:0,最大长度:19	否	总数 示例：2
successCount	number
小数位数:0,最大长度:19	否	成功总数 示例：1
failCount	number
小数位数:0,最大长度:19	否	失败总数 示例：1
messages	object	是	错误数据列表
infos	object	是	返回数据列表

## 5. 正确返回示例

{
	"code": "\"200\"",
	"message": "成功",
	"data": {
		"count": 2,
		"successCount": 1,
		"failCount": 1,
		"messages": [
			{
				"sourceUnique": "数据唯一标识",
				"message": "编码[code]已存在!"
			}
		],
		"infos": [
			{
				"data": {
					"sourceUnique": "数据唯一标识",
					"targetUnique": 1951031594869850114
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
999	服务端逻辑异常	服务端逻辑异常

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

