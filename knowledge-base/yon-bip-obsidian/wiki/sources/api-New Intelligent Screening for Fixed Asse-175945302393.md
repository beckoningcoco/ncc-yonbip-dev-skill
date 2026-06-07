---
title: "固定资产智能筛查新增"
apiId: "1759453023938019330"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Corporate Income Tax"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Corporate Income Tax]
platform_version: "BIP"
source_type: community-api-docs
---

# 固定资产智能筛查新增

>  请求方式	POST | Corporate Income Tax (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/tax/yonbip-fi-taxreturn/api/depreciation/assets-datas/add
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
accountLaveMonth	long	否	是	剩余折旧月限 示例：12
accountMethodName	string	否	是	折旧方法（会计折旧），枚举：年限平均法,年数总和法,双倍余额递减法,一次性扣除； 示例：年限平均法
accountNetAmt	BigDecimal	否	否	净残值 示例：0
accountOrginAmt	BigDecimal	否	是	原值 示例：4000000
accountTotalAmt	BigDecimal	否	是	累计折旧 示例：0
accountTotalMonth	long	否	是	会计折旧使用月限 示例：48
accountUseMonth	long	否	是	已计提期数 示例：5
addMethodCode	string	否	是	增加方式编码(来自增加方式映射)，最大长度10 示例：123
bresearch	string	否	否	是否研发资产（是/否） 示例：是
buildDate	string	否	是	建卡时间(yyyy-MM-dd) 示例：2022-07-01
buyDate	string	否	是	购入时间(yyyy-MM-dd) 示例：2022-01-02
department	string	否	否	使用部门 示例：部门
financeAssetsTypeCode	string	否	是	财务资产类别编码（取自固定资产类别映射），最大长度10 示例：123
fixedAssetsCode	string	否	是	固定资产编号 示例：123
fixedAssetsName	string	否	是	固定资产名称 示例：固定资产名称
model	string	否	否	型号 示例：a型号
spec	string	否	否	规格 示例：b规格
orgCode	string	否	是	税务组织编码 示例：555

## 3. 请求示例

Url: /yonbip/tax/yonbip-fi-taxreturn/api/depreciation/assets-datas/add?access_token=访问令牌
Body: {
	"accountLaveMonth": 12,
	"accountMethodName": "年限平均法",
	"accountNetAmt": 0,
	"accountOrginAmt": 4000000,
	"accountTotalAmt": 0,
	"accountTotalMonth": 48,
	"accountUseMonth": 5,
	"addMethodCode": "123",
	"bresearch": "是",
	"buildDate": "2022-07-01",
	"buyDate": "2022-01-02",
	"department": "部门",
	"financeAssetsTypeCode": "123",
	"fixedAssetsCode": "123",
	"fixedAssetsName": "固定资产名称",
	"model": "a型号",
	"spec": "b规格",
	"orgCode": "555"
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
code	string	否	状态码 示例：200
message	string	否	信息 示例：操作成功
data	string	否	响应信息
message	string	否	操作成功 示例：操作成功

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功"
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
9999	系统异常	根据具体返回信息调整数据
1001	数据校验异常	根据具体返回信息调整数据

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-07-10	
更新
请求参数 orgCode

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

