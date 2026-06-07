---
title: "合并报表-查询维度成员数据"
apiId: "1893158327973052417"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Dimension Information Table"
domain: "EPM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Dimension Information Table]
platform_version: "BIP"
source_type: community-api-docs
---

# 合并报表-查询维度成员数据

>  请求方式	POST | Dimension Information Table (EPM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/qyjx/bcs/v1.0/members
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
cubeId	string	否	是	模型主键
dimLevelId	string	否	否	维度层主键
dimHierId	string	否	否	维度体系主键, 如果传入dimLevelId，此参数可以忽略。
isLazy	string	否	否	是否懒加载，0全加载（默认），1懒加载 示例：0全加载（默认），1懒加载
treeFatherKey	string	否	否	父级key，懒加载时使用，全加载忽略此参数 示例：懒加载时使用，全加载忽略此参数
propIds	string	是	否	属性编码

## 3. 请求示例

Url: /yonbip/qyjx/bcs/v1.0/members?access_token=访问令牌
Body: {
	"cubeId": "",
	"dimLevelId": "",
	"dimHierId": "",
	"isLazy": "0全加载（默认），1懒加载",
	"treeFatherKey": "懒加载时使用，全加载忽略此参数",
	"propIds": [
		""
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
code	string	否	返回状态码 示例：200
data	object	是	数据对象
treeKey	string	否	当前成员关系主键 示例：2106874594860204305
treeFatherKey	string	否	父级成员关系主键 示例：2106874594860204304
id	string	否	成员主键 示例：2106874594860204035
pid	string	否	父成员主键 示例：2106874594860204034
code	string	否	成员编码 示例：HB100
name	object	否	名称

## 5. 正确返回示例

{
	"code": "200",
	"data": [
		{
			"treeKey": "2106874594860204305",
			"treeFatherKey": "2106874594860204304",
			"id": "2106874594860204035",
			"pid": "2106874594860204034",
			"code": "HB100",
			"name": {
				"text": "本部",
				"text2": "",
				"text3": "",
				"text4": "",
				"text5": "",
				"text6": "",
				"currLangIndex": 1
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
暂时没有数据哦~

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2026-04-20	
更新
请求说明
新增
返回参数 (13)
更新
返回参数 code
删除
返回参数 success

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

