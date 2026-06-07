---
title: "职务类别批量新增更新_集成_API(新集成)"
apiId: "2304739280007200770"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Job Category"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Job Category]
platform_version: "BIP"
source_type: community-api-docs
---

# 职务类别批量新增更新_集成_API(新集成)

>  请求方式	POST | Job Category (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/PFC/dutyType/batchSaveOrUpdateForIntegrationMdd
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
data	object	是	否	数据
name	muti_lang	否	是	名称
objid	string	否	否	来源主键, 新增时必填, id和objid同时存在，两者需要保持一致 示例：123
code	string	否	是	编码 示例：0000001
enable	int	否	是	启用状态，0初始化 1启用 2停用 示例：1
parentid	string	否	否	上级职务类别ID或者编码 示例：1793555717112725505
ranktype_id	string	否	否	职级类别ID或者编码 示例：1793555717112725505
memo	muti_lang	否	否	备注
id	string	否	否	主键 示例：2121231
pubs	string	否	否	pubs
dr	number
小数位数:0,最大长度:10	否	否	删除状态
creator	string	否	否	创建人
modifier	string	否	否	修改人
createTime	string	否	否	创建时间
modifyTime	string	否	否	修改时间
sysid	string	否	否	系统标识

## 3. 请求示例

Url: /yonbip/PFC/dutyType/batchSaveOrUpdateForIntegrationMdd?access_token=访问令牌
Body: {
	"data": [
		{
			"name": {
				"zh_CN": "中文",
				"en_US": "英文",
				"zh_TW": "繁体"
			},
			"objid": "123",
			"code": "0000001",
			"enable": 1,
			"parentid": "1793555717112725505",
			"ranktype_id": "1793555717112725505",
			"memo": {
				"zh_CN": "中文",
				"en_US": "英文",
				"zh_TW": "繁体"
			},
			"id": "2121231",
			"pubs": "",
			"dr": 0,
			"creator": "",
			"modifier": "",
			"createTime": "",
			"modifyTime": "",
			"sysid": ""
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
code	string	否	code 示例：200
message	string	否	message 示例：操作成功
data	object	否	data
count	number
小数位数:0,最大长度:10	否	count 示例：2
sucessCount	number
小数位数:0,最大长度:10	否	sucessCount 示例：2
failCount	number
小数位数:0,最大长度:10	否	failCount 示例：0
messages	object	是	messages
infos	object	是	infos
failInfos	object	是	failInfos
parentid	string	否	parentid

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 2,
		"sucessCount": 2,
		"failCount": 0,
		"messages": [
			{
				"sourceUnique": "11",
				"messages": "错误信息描述"
			}
		],
		"infos": [
			{
				"data": {
					"sourceUnique": "11",
					"targetUnique": "21",
					"code": "1472146898874793985",
					"enable": 1,
					"name": {
						"zh_CN": "职务1"
					},
					"ranktype_id": "551c3b4bf27a4b49a5ed834fe8cc0347",
					"id": "1472146898874793985",
					"pubts": "2022-06-07 13:40:56",
					"memo": {
						"zh_CN": "备注"
					}
				}
			}
		],
		"failInfos": [
			{}
		],
		"parentid": ""
	}
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
999	操作失败	

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

