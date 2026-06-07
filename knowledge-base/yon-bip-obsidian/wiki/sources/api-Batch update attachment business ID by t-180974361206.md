---
title: "根据类型批量更新附件业务id"
apiId: "1809743612061679617"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Material"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Material]
platform_version: "BIP"
source_type: community-api-docs
---

# 根据类型批量更新附件业务id

>  请求方式	POST | Material (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/digitalModel/attachment/batchupdateattachmentbusinessid
请求方式	POST
ContentType	application/json
应用场景	开放API
API类别	批量保存/更新
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
attachmentBusinessType	string	否	否	附件类型：取以下对应code 物料所有图片：PRODUCT_ALL_IMAGE; 物料首页图片：PRODUCT_HOME_PAGE_IMAGE; 物料视频:PRODUCT_VIDEO; 商品分类广告图片:PRESENTATION_CLASS_AD_IMAGE; 商品分类图片:PRESENTATION_CLASS_IMAGE; 标签图片:TAG_IMAGE; 品牌LOGO图片:BRAND_LOGO_IMAGE; 品牌广告图片:BRAND_AD_IMAGE; 客户LOGO图片:MERCHANT_LOGO_IM 示例：PRODUCT_HOME_PAGE_IMAGE
attachmentInfoSyncSyncVOList	object	是	否	档案附件信息
archiveId	string	否	否	档案id(如物料id、客户id等) 示例：12345
attachmentBusinessId	string	否	否	附件业务id 示例：abcd1234

## 3. 请求示例

Url: /yonbip/digitalModel/attachment/batchupdateattachmentbusinessid?access_token=访问令牌
Body: {
	"attachmentBusinessType": "PRODUCT_HOME_PAGE_IMAGE",
	"attachmentInfoSyncSyncVOList": [
		{
			"archiveId": "12345",
			"attachmentBusinessId": "abcd1234"
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
success	boolean	否	成功标识 示例：false
message	string	否	提示信息 示例：处理成功
code	long	否	状态码:200表示成功 示例：200
data	object	否	返回值数据对象
count	number
小数位数:0,最大长度:10	否	总条数 示例：10
successCount	number
小数位数:0,最大长度:10	否	成功条数 示例：10
failCount	number
小数位数:0,最大长度:10	否	失败条数 示例：0
infos	object	否	返回数据列表

## 5. 正确返回示例

{
	"success": false,
	"message": "处理成功",
	"code": 200,
	"data": {
		"count": 10,
		"successCount": 10,
		"failCount": 0,
		"infos": {
			"data": {
				"sourceUnique": "123",
				"targetUnique": "456"
			}
		}
	}
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
-1	系统异常，请稍后再说	系统异常，请联系管理员处理

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

