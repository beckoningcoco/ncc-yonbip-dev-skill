---
title: "价格目录保存"
apiId: "2450524368542367749"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Price Catalog"
domain: "PCS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Price Catalog]
platform_version: "BIP"
source_type: community-api-docs
---

# 价格目录保存

>  请求方式	POST | Price Catalog (PCS)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/PCC/ycPriceList/bill/apisave
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	批量保存/更新
事务和幂等性	MDD幂等
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	是	是	数据分组标识
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
vpurchase_org_name	string	否	是	采购组织名称/编码
vsupplyCode	string	否	否	供应商编码
vbelong_org_name	string	否	是	所属组织名称
vmaterialId_code	string	否	是	物料编码/名称
vbusinessType	string	否	否	业务类型（0 普通，1 VMI，2 全程委外，3 工序委外， 4 工程） 默认值：0
operationCode	string	否	否	工序编码
operationName	string	否	否	工序名称
vmatSkuCode	string	否	否	SKU编码/名称
skuSpec	string	否	否	SKU规格
receive_org_name	string	否	否	收货组织
vunit_name	string	否	是	计价单位
nsum	string	否	否	计价数量
nsumStart	string	否	否	数量(起)
nsumEnd	string	否	否	数量(止)
vcurrencyOriginName	string	否	是	币种
npriceNoTaxOrigin	string	否	否	无税单价(含税单价无税单价必输其一)
npriceOrigin	string	否	否	含税单价(含税单价无税单价必输其一)
discountRate	string	否	否	折扣率（%）
ntax	string	否	是	税率（%）
vtax_items_code	string	否	是	税目编码
vaddType	string	否	是	价格来源（yccontract 普通合同，yccontract-xy 协议合同，ycpricedecision 寻源定标价，ysadjustprice 价格调整单，ncpoinvoice 外系统发票审批价，ncpoorderprice 外系统采购订单价）
vsrcBillCode	string	否	否	来源单据编号
dbilldate	string	否	否	来源单据生效时间
vpriceValidate	string	否	是	价格生效日期
vpriceInvalidate	string	否	否	价格失效日期
priceScheme_name	string	否	否	价格模板
floatConversionRate	string	否	否	计价换算率
vmemo	string	否	否	备注
taxPriority	string	否	否	价格标识（0 含税优先，1 无税优先） 默认值：0
discountTaxType	string	否	否	扣税类别（0 应税外加，1 应税内含） 默认值：0
childId	string	否	是	唯一性标识 需要保证唯一
_status	string	否	是	主表增删改状态标识，状态,Insert:新增; 示例：Insert

## 3. 请求示例

Url: /yonbip/PCC/ycPriceList/bill/apisave?access_token=访问令牌
Body: {
	"data": [
		{
			"resubmitCheckKey": "",
			"vpurchase_org_name": "",
			"vsupplyCode": "",
			"vbelong_org_name": "",
			"vmaterialId_code": "",
			"vbusinessType": "",
			"operationCode": "",
			"operationName": "",
			"vmatSkuCode": "",
			"skuSpec": "",
			"receive_org_name": "",
			"vunit_name": "",
			"nsum": "",
			"nsumStart": "",
			"nsumEnd": "",
			"vcurrencyOriginName": "",
			"npriceNoTaxOrigin": "",
			"npriceOrigin": "",
			"discountRate": "",
			"ntax": "",
			"vtax_items_code": "",
			"vaddType": "",
			"vsrcBillCode": "",
			"dbilldate": "",
			"vpriceValidate": "",
			"vpriceInvalidate": "",
			"priceScheme_name": "",
			"floatConversionRate": "",
			"vmemo": "",
			"taxPriority": "",
			"discountTaxType": "",
			"childId": "",
			"_status": "Insert"
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
displayCode	string	否	异常码
message	string	否	信息 示例：操作成功
data	string	否	响应信息

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {}
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
999	message	按照提示处理

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2026-04-16	
更新
请求参数 priceScheme_name

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

