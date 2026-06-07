---
title: "内外网账单摆渡-内网账单导入"
apiId: "1983381116827467789"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Personal Invoices"
domain: "ZNBZ"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Personal Invoices]
platform_version: "BIP"
source_type: community-api-docs
---

# 内外网账单摆渡-内网账单导入

> `ContentType	application/json` 请求方式	POST | 分类: Personal Invoices (ZNBZ)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/znbz/rbsm/api/billcommon/batchSaveInvoiceData

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| tallydataVO | object | 否 | 是 | tallydataVO，单次请求最多支持20条数据 |
| _realtype | string | 否 | 否 | 真实类型 示例：true |
| _entityName | string | 否 | 否 | 实体全称 示例：znbzbx.tallydata.TallydataVO |
| _keyName | string | 否 | 否 | 主键全称 示例：id |
| iinvoicestatus | short | 否 | 否 | 增值税发票状态 |
| vstampinfo | string | 否 | 否 | 印章信息 示例：北京滴滴出行科技有限公司,91110108MA01G0FB09 |
| bused | boolean | 否 | 否 | 是否已使用 示例：false |
| igatherstatus | short | 否 | 否 | 记账采集状态 示例：1 |
| vprovince | string | 否 | 否 | 省份 示例：北京市 |
| ichecktype | short | 否 | 否 | 账单类型 |
| nuntaxmny | decimal | 否 | 否 | 金额 示例：1310.96 |
| nfuelsurcharge | decimal | 否 | 否 | 燃油附加费 |
| vregion | string | 否 | 否 | 发票区域 示例：[95,19,1641,1061] |
| path | string | 否 | 否 | 发票图片路径 示例：znbzbx_tallydata/1971555800545492993/1712719297245.JPG |
| vimgsize | string | 否 | 否 | 图片宽高 示例：1920,1080 |
| ndeducttaxmny | decimal | 否 | 否 | 可抵扣税额 示例：39.33 |
| voperatorid | long | 否 | 否 | 上传人 示例：1851461771861164041 |
| bocrmodify | boolean | 否 | 否 | 是否被修改 示例：false |
| isagentmark | boolean | 否 | 否 | 是否代开 示例：false |
| id | long | 否 | 是 | 主键id 示例：1971555800545492993 |
| tenant | string | 否 | 否 | 租户tenant 示例：3504408309013696 |
| vattachmentass | string | 否 | 否 | 单据附件id 示例：b60d7b6f247e4e75b6fda12f84d8d1dd |
| iselecvmatched | short | 否 | 否 | 电子凭证匹配关系 示例：3 |
| iscitytraffic | boolean | 否 | 否 | 是否市内交通费 示例：false |
| vbuyname | string | 否 | 否 | 购买方名称 示例：用友网络科技股份有限公司 |
| dcostdate | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 发生日期 示例：2023-12-07 00:00:00 |
| isrefund | boolean | 否 | 否 | 是否退票 示例：false |
| icheckstatus | short | 否 | 否 | 查验状态 示例：1 |
| filename | string | 否 | 否 | 发票文件名 示例：1712719297245.JPG |
| vbuytaxid | string | 否 | 否 | 购买方纳税人识别号 示例：91110000600001760P |
| ntaxmny | decimal | 否 | 否 | 税额 示例：39.33 |
| isourcesystem | short | 否 | 否 | 来源系统 |
| vseller_bank_account | string | 否 | 否 | 销售方开户行帐号 示例：招商银行股份有限公司北京东三环支行110936504210806 |
| status | short | 否 | 否 | 账单状态 示例：12 |
| vimageid | string | 否 | 否 | PDF/OFD解析接?返回值 示例：1847f1baee92d877bf12aa202404jpeg |
| vinvoicetypecode | string | 否 | 否 | 发票类型编码 示例：10102 |
| dupdate | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 上传日期 示例：2024-04-10 00:00:00 |
| pk_invoicetype | long | 否 | 否 | 发票类型pk 示例：9996 |
| isdeduct | boolean | 否 | 否 | 是否可抵扣 示例：true |
| pk_consumekind | long | 否 | 否 | 发票消费类型 示例：9998 |
| creatorId | long | 否 | 否 | 创建人id 示例：1851461771861164041 |
| pk_ocrinvoice | long | 否 | 否 | ocr原始数据pk 示例：1971555809135427589 |
| ibusistatus | short | 否 | 否 | 业务状态 |
| vcurrency | string | 否 | 否 | 账单币种 示例：1837319999347752994 |
| isEleInvoice | short | 否 | 否 | 是否电子 示例：1 |
| vpicturefileid | string | 否 | 否 | 协同文件ID 示例：661605c549308f2485a98baf |
| vinvoiceno | string | 否 | 否 | 发票号码 示例：10556199 |
| cfinaceorg | string | 否 | 否 | 财务组织 示例：1837963849289957378 |
| duploadtime | datetime | 否 | 否 | 上传时间 示例：2024-04-10 11:21:41 |
| nservicetaxmny | decimal | 否 | 否 | 服务费可抵扣税额 |
| pk_costaddr | string | 否 | 否 | 发生地点 示例：bfad101d-5cf3-11e9-817e-7cd30abea0c0 |
| pubts | string | 否 | 否 | 更新时间 示例：2024-04-10 11:21:44 |
| vinvoicetypename | string | 否 | 否 | 账单类型 示例：增值税电子普通发票 |
| createDate | string | 否 | 否 | 创建日期 示例：2024-04-10 00:00:00 |
| creator | string | 否 | 否 | 创建人 示例：吕文博 |
| vstampcusttaxid | string | 否 | 否 | 印章销售方纳税人识别号 示例：91110108MA01G0FB09 |
| orientation | short | 否 | 否 | 旋转角度 |
| vinvoicecode | string | 否 | 否 | 发票代码 示例：011002301111 |
| iauditresult | short | 否 | 否 | 稽核结果 示例：1 |
| vseller_addr_tel | string | 否 | 否 | 销售方地址电话 示例：北京市海淀区唐家岭北环路6号院1号楼C座四层408010-83456275 |
| ytenant | string | 否 | 否 | 租户ytenant 示例：0000LNMSTNR5E7BNR70000 |
| icompanyseal | short | 否 | 否 | 是否有公司印章 示例：1 |
| vqrcode | string | 否 | 否 | 发票二维码 示例：[01,10,011002301111,10556199,1310.96,20231207,13250180506951701215,CE01,] |
| vinvoicecheckno | string | 否 | 否 | 发票校验码 示例：13250180506951701215 |
| nchecknum | decimal | 否 | 否 | 查验次数 示例：1 |
| dopendate | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 开票日期 示例：2023-12-07 00:00:00 |
| imanualauditresult | short | 否 | 否 | 初核稽核结果 |
| vcusttaxid | string | 否 | 否 | 销售方纳税人识别号 示例：91110108MA01G0FB09 |
| createTime | string | 否 | 否 | 创建时间 示例：2024-04-10 11:21:44 |
| istranssettle | boolean | 否 | 否 | 是否机票结算完成 示例：false |
| vcustname | string | 否 | 否 | 销方名称 示例：北京滴滴出行科技有限公司 |
| nmny | decimal | 否 | 否 | 价税合计 示例：1350.29 |
| collectionWay | short | 否 | 否 | 采集方式 |
| vstampcustname | string | 否 | 否 | 印章销售方名称 示例：北京滴滴出行科技有限公司 |
| _status | string | 否 | 否 | 实体状态 示例：Unchanged |
| tspz | string | 否 | 否 | 特定业务类型 |
| overall_amount | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 统筹金额 |
| medical_record_number | string | 否 | 否 | 病历号 |
| inpatient_number | string | 否 | 否 | 住院号 |
| outpatient_number | string | 否 | 否 | 门诊号 |
| medical_insurance_number | string | 否 | 否 | 医保编号 |
| visit_date | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 就诊日期 |
| medical_institution_type | string | 否 | 否 | 医疗机构类型 |
| medical_insurance_type | string | 否 | 否 | 医保类型 |
| gender | string | 否 | 否 | 性别 |
| other_payments | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 其他支付 |
| personal_account_payment | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 个人账户支付 |
| cash_payment | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 现金支付 |
| personal_expense | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 个人自费 |
| personal_payment | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 个人自付 |
| personal_self1 | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 自付一 |
| personal_self2 | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 自付二 |
| inpatient_department | string | 否 | 否 | 住院科别 |
| admission_date | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 入院日期 |
| discharge_date | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 出院日期 |
| annual_health_insurance_coverage | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 年度医保范围内 |
| annual_outpatient_catastrophic_payment | string | 否 | 否 | 年度门诊大额支付 |
| ocrInvoiceVO | object | 否 | 否 | ocrInvoiceVO |
| _realtype | string | 否 | 否 | 真实类型 示例：true |
| _entityName | string | 否 | 否 | 实体全称 示例：znbzbx.ocrinvoice.OCRInvoiceVO |
| _keyName | string | 否 | 否 | 主键全称 示例：id |
| seller | string | 否 | 否 | 销售方名称 示例：北京滴滴出行科技有限公司 |
| code | string | 否 | 否 | 发票代码 示例：011002301111 |
| company_seal | short | 否 | 否 | 是否有公司印章 示例：1 |
| vnumber | string | 否 | 否 | 发票号码 示例：10556199 |
| creatorId | long | 否 | 否 | 创建人id 示例：1851461771861164041 |
| vdate | string | 否 | 否 | 日期 示例：2023年12月07日 |
| item_names | string | 否 | 否 | 服务名称 示例：*运输服务*客运服务费,*运输服务*客运服务费 |
| currency_code | string | 否 | 否 | 币种 示例：CNY |
| issuer | string | 否 | 否 | 开票人 示例：于秋红 |
| stamp_info | string | 否 | 否 | 印章内容 示例：[{pk_ocrinvoice:null,vinvoicetypecode:null,vinvoicecode:0.999,vinvoiceno:0.999,vcustname:0.999,vcusttaxid:0.9922,vbuyname:0.999,vbuytaxid:0.9964,vseller_addr_tel:null,vseller_bank_account:null,vbuyer_addr_tel:null,vbuyer_bank_account:null}] |
| buyer_tax_id | string | 否 | 否 | 购买方纳税人识别号 示例：91110000600001760P |
| seller_tax_id | string | 否 | 否 | 销售方纳税人识别号 示例：91110108MA01G0FB09 |
| vocrdata | text | 否 | 否 | ocr识别信息 示例：{imageId:1847f1baee92d877bf12aa202404jpeg,identify_type:1,bill_type:invoice,type:10102,desc:增值税电子普通发票,orientation:0,region:[95,19,1641,1061],image_size:[1920,1080],page:0,coordinate:{degree:0,endX:0,endY:0,sourceHeight:0,sourceWidth:0,startX:0,startY:0},details:{fplx:1,title:北京增值税电子普通发票,currency_code:CNY,item_names:*运输服务*客运服务费,*运输服务*客运服务费,invoice_type:10102,date:2023年12月07日,electronic_mark:1,commodity_name:[*运输服务*客运服务费,*运输服务*客运服务费],code:011002301111,number:10556199,code_confirm:011002301111,number_confirm:,pretax_amount:1310.96,total:1350.29,total_cn:壹仟叁佰伍拾圆贰角玖分,tax:39.33,check_code:13250180506951701215,machine_code:499098498382,seller:北京滴滴出行科技有限公司,seller_tax_id:91110108MA01G0FB09,seller_addr_tel:北京市海淀区唐家岭北环路6号院1号楼C座四层408010-83456275,seller_bank_account:招商银行股份有限公司北京东三环支行110936504210806,buyer:用友网络科技股份有限公司,buyer_tax_id:91110000600001760P,buyer_bank_account:,buyer_addr_tel:,company_seal:1,tax_seal:,seal_flag:,seal_seller_name:,seal_seller_tax_id:,overlap:,form_type:,form_name:,kind:交通,ciphertext:03/6/12>>/7742+7*>-90/524>88,-7>197+4<**4<3<2<750/+5804/+,/6/*6647<67+*5+2-2<6+9>17292,<>4+22++9/01+6<419>72<9<5*43,travel_tax:,receiptor:杜洪亮,reviewer:赵笑林,issuer:于秋红,province:北京市,city:,remark:,agent_mark:,acquisition_mark:,service_name:运输服务,company_seal_mark:1,transit_mark:,vehicle_mark:0,oil_mark:,stamp_info:北京滴滴出行科技有限公司,91110108MA01G0FB09,producer_stamp:国家税务总局,block_chain:,zfbz:,return_red_flag:,electronic_number:,angle:,items:[{project_code:null,name:*运输服务*客运服务费,unit:次,standard_of_charge:null,specification:无,quantity:1,price:1526.59,total:1526.59,tax_rate:3%,tax:45.80,duty_no:null,tax_paid:null,comment:null,license_plate:null},{project_code:null,name:*运输服务*客运服务费,unit:,standard_of_charge:null,specification:,quantity:,price:,total:-215.63,tax_rate:3%,tax:-6.47,duty_no:null,tax_paid:null,comment:null,license_plate:null}],page_count:0,page_number:0},confidences:{date:0.999,seller:0.999,code:0.999,tax:0.999,buyer:0.999,buyer_tax_id:0.9964,seller_tax_id:0.9922,number:0.999,total:0.999,check_code:0.999,pretax_amount:0.999,seller_addr_tel:0.9968,seller_bank_account:0.9948},extra:{check_code_candidates:[],check_code_last_six:[],number_order_error:[],qrcode:[01,10,011002301111,10556199,1310.96,20231207,13250180506951701215,CE01,],barcode:null},billType:10101,imageSize:1920,1080} |
| total | decimal | 否 | 否 | 总金额 示例：1350.29 |
| vtallydata | text | 否 | 否 | 账单数据 示例：{bocrmodify:false,bused:false,cfinaceorg:1837963849289957378,createDate:2024-04-10,createTime:2024-04-10 11:21:41,creator:吕文博,creatorId:1851461771861164041,currency_code:CNY,dcostdate:2023-12-07 00:00:00,dopendate:2023-12-07 00:00:00,dupdate:2024-04-10,duploadtime:2024-04-10 11:21:41,_status:Unchanged,filename:1712719297245.JPG,iauditresult:1,ibusistatus:0,icheckstatus:0,ichecktype:0,icompanyseal:1,igatherstatus:1,imanualauditresult:0,isagentmark:false,iscitytraffic:false,isdeduct:false,isourcesystem:0,isrefund:false,istranssettle:false,nmny:1350.29,ntaxmny:39.33,nuntaxmny:1310.96000000,orientation:0,path:1712719297245.JPG,pk_consumekind:9998,pk_costaddr:bfad101d-5cf3-11e9-817e-7cd30abea0c0,pk_invoicetype:9996,pk_ocrinvoice:1971555809135427589,pubts:2024-04-10 11:21:41,_realtype:true,status:0,tenant:3504408309013696,vattachmentass:b60d7b6f247e4e75b6fda12f84d8d1dd,vbuyname:用友网络科技股份有限公司,vbuytaxid:91110000600001760P,vcurrency:1837319999347752994,vcustname:北京滴滴出行科技有限公司,vcusttaxid:91110108MA01G0FB09,vimageid:1847f1baee92d877bf12aa202404jpeg,vimgsize:1920,1080,vinvoicecheckno:13250180506951701215,vinvoicecode:011002301111,vinvoiceno:10556199,vinvoicetypecode:10102,vinvoicetypename:增值税电子普通发票,vmemo:,voperatorid:1851461771861164041,vpicturefileid:661605c549308f2485a98baf,vprovince:北京市,vqrcode:[01,10,011002301111,10556199,1310.96,20231207,13250180506951701215,CE01,],vregion:[95,19,1641,1061],vstampcustname:北京滴滴出行科技有限公司,vstampcusttaxid:91110108MA01G0FB09,vstampinfo:北京滴滴出行科技有限公司,91110108MA01G0FB09,vconsumekindname:交通,vconsumekindcode:YZ003,collectionWay:0,vcurrency_name:人民币,vcurrency_moneyDigit:2,vcurrency_currTypeSign:?,id:1971555800545492993} |
| province | string | 否 | 否 | 省份 示例：北京市 |
| cfinaceorg | string | 否 | 否 | 财务组织 示例：1837963849289957378 |
| brelate | boolean | 否 | 否 | 是否关联发票 示例：true |
| check_code | string | 否 | 否 | 校验码 示例：13250180506951701215 |
| extra | text | 否 | 否 | 额外信息 示例：{check_code_candidates:[],check_code_last_six:[],number_order_error:[],qrcode:[01,10,011002301111,10556199,1310.96,20231207,13250180506951701215,CE01,],barcode:null} |
| pretax_amount | decimal | 否 | 否 | 税前金额 示例：1310.96 |
| id | long | 否 | 否 | 主键id 示例：1971555809135427589 |
| pubts | string | 否 | 否 | 更新时间 示例：2024-04-10 11:21:44 |
| seller_bank_account | string | 否 | 否 | 销售方开户行帐号 示例：招商银行股份有限公司北京东三环支行110936504210806 |
| tenant | string | 否 | 否 | 租户tenant 示例：3504408309013696 |
| createDate | string | 否 | 否 | 创建日期 示例：2024-04-10 00:00:00 |
| ciphertext | string | 否 | 否 | 密码区 示例：03/6/12>>/7742+7*>-90/524>88,-7>197+4<**4<3<2<750/+5804/+,/6/*6647<67+*5+2-2<6+9>17292,<>4+22++9/01+6<419>72<9<5*43 |
| creator | string | 否 | 否 | 创建人 示例：吕文博 |
| ytenant | string | 否 | 否 | 租户ytenant 示例：0000LNMSTNR5E7BNR70000 |
| kind | string | 否 | 否 | 发票消费类型 示例：交通 |
| isgraphics | boolean | 否 | 否 | 是否重新绘图 示例：false |
| tax | decimal | 否 | 否 | 税费 示例：39.33 |
| reviewer | string | 否 | 否 | 复核 示例：赵笑林 |
| buyer | string | 否 | 否 | 购买方方名称 示例：用友网络科技股份有限公司 |
| machine_code | string | 否 | 否 | 机打代码 示例：499098498382 |
| createTime | string | 否 | 否 | 创建时间 示例：2024-04-10 11:21:44 |
| ibusitype | short | 否 | 否 | 业务来源类型 |
| receiptor | string | 否 | 否 | 收款人 示例：杜洪亮 |
| seller_addr_tel | string | 否 | 否 | 销售方地址电话 示例：北京市海淀区唐家岭北环路6号院1号楼C座四层408010-83456275 |
| vinvoicetype | string | 否 | 否 | 发票类型 示例：10102 |
| _status | string | 否 | 否 | 实体状态 示例：Unchanged |
| invoiceAuditResultVOList | object | 是 | 否 | invoiceAuditResultVOList |
| _realtype | string | 否 | 否 | 真实类型 示例：true |
| _entityName | string | 否 | 否 | 实体全称 示例：znbzbx.invoiceauditresult.InvoiceAuditResultVO |
| _keyName | string | 否 | 否 | 主键全称 示例：id |
| iauditresult | short | 否 | 否 | 系统稽核结果 示例：1 |
| vinnercode | string | 否 | 否 | 系统内置编码 示例：INVC010113 |
| ytenant | string | 否 | 否 | 租户ytenant 示例：0000LNMSTNR5E7BNR70000 |
| pk_auditclass | long | 否 | 否 | 稽核类别 示例：9990 |
| igatherstatus | short | 否 | 否 | 采集状态 示例：1 |
| pk_auditrule | long | 否 | 否 | 稽核规则 示例：9982 |
| pk_invauditrule | long | 否 | 否 | 票据稽核规则pk 示例：9856 |
| imanualauditresult | short | 否 | 否 | 人工稽核结果 |
| cfinaceorg | string | 否 | 否 | 业务单元 示例：1837963849289957378 |
| createTime | string | 否 | 否 | 创建时间 示例：2024-04-10 11:21:43 |
| vsourceaction | string | 否 | 否 | 来源单据写入动作 示例：票据采集 |
| pk_tallydata | long | 否 | 否 | 来源票据pk 示例：1971555800545492993 |
| icontrolprop | short | 否 | 否 | 稽核控制属性 示例：2 |
| id | long | 否 | 否 | 主键id 示例：1971555800545492994 |
| pubts | string | 否 | 否 | 更新时间 示例：2021-03-26 11:25:26 |
| tenant | string | 否 | 否 | 租户tenant 示例：3504408309013696 |
| createDate | string | 否 | 否 | 创建日期 示例：2024-04-10 00:00:00 |
| _status | string | 否 | 否 | 实体状态 示例：Unchanged |
| invoiceFileVOList | object | 是 | 否 | invoiceFileVOList |
| _realtype | string | 否 | 否 | 真实类型 示例：true |
| _entityName | string | 否 | 否 | 实体全称 示例：znbzbx.invoicefile.InvoiceFileVO |
| _keyName | string | 否 | 否 | 主键全称 示例：id |
| vimageid | string | 否 | 否 | PDF/OFD解析接?返回值 示例：1847f1baee92d877bf12aa202404jpeg |
| creator | string | 否 | 否 | 创建人 示例：吕文博 |
| orientation | short | 否 | 否 | 旋转角度 |
| vattachmentass | string | 否 | 否 | 单据附件id 示例：b60d7b6f247e4e75b6fda12f84d8d1dd |
| ytenant | string | 否 | 否 | 租户ytenant 示例：0000LNMSTNR5E7BNR70000 |
| inecessity | short | 否 | 否 | 必要性 |
| vfileid | string | 否 | 否 | 协同文件存储ID 示例：661605c549308f2485a98baf |
| path | string | 否 | 否 | 路径 示例：znbzbx_tallydata/1971555800545492993/1712719297245.JPG |
| ipagecount | short | 否 | 否 | 文件页数 示例：1 |
| cfinaceorg | string | 否 | 否 | 业务单元 示例：1837963849289957378 |
| createTime | string | 否 | 否 | 创建时间 示例：2024-04-10 11:21:44 |
| filelength | string | 否 | 否 | 文件长度 示例：534027 |
| ifiletype | short | 否 | 否 | 文件类型 示例：1 |
| id | long | 否 | 否 | 主键id 示例：1971555809135427591 |
| pubts | string | 否 | 否 | 更新时间 示例：2024-04-10 11:21:41 |
| isfolder | boolean | 否 | 否 | 是否目录 示例：false |
| tenant | string | 否 | 否 | 租户tenant 示例：3504408309013696 |
| createDate | string | 否 | 否 | 创建日期 示例：2024-04-10 00:00:00 |
| _status | string | 否 | 否 | 实体状态 示例：Unchanged |
| tallydataTaxDeductVOList | object | 是 | 否 | tallydataTaxDeductVOList |
| _realtype | string | 否 | 否 | 真实类型 示例：true |
| _entityName | string | 否 | 否 | 实体全称 示例：znbzbx.tallydata.TallydataTaxDeductVO |
| _keyName | string | 否 | 否 | 主键全称 示例：id |
| ytenant | string | 否 | 否 | 租户ytenant 示例：0000LNMSTNR5E7BNR70000 |
| pk_consumekind | long | 否 | 否 | 发票消费类型 示例：9998 |
| nuntaxmny | decimal | 否 | 否 | 不含税金额 示例：1526.59 |
| iscandeduct | boolean | 否 | 否 | 货物是否可抵扣 示例：true |
| pk_invoicecheck_b | long | 否 | 否 | 增值税票查验结果子表 示例：1971555809135427593 |
| ndeducttaxmny | decimal | 否 | 否 | 可抵扣金额 示例：45.8 |
| ntaxmny | decimal | 否 | 否 | 税额 示例：45.8 |
| nmny | decimal | 否 | 否 | 价税合计 示例：1572.39 |
| ndeducttaxrate | decimal | 否 | 否 | 可抵扣税率 示例：3 |
| pk_tallydata | long | 否 | 否 | 主表主键 示例：1971555800545492993 |
| id | long | 否 | 否 | 主键id 示例：1971555809135427596 |
| pubts | string | 否 | 否 | 更新时间 示例：2024-04-10 11:21:44 |
| tenant | string | 否 | 否 | 租户tenant 示例：3504408309013696 |
| _status | string | 否 | 否 | 实体状态 示例：Unchanged |
| invoiceCheckDataList | object | 是 | 否 | invoiceCheckDataList |
| invoiceCheckVO | object | 否 | 否 | invoiceCheckVO |
| invoiceCheckBVOList | object | 是 | 否 | invoiceCheckBVOList |
| tallydataAmountBVOList | object | 否 | 否 | 个人账单金额子表 |
| pk_tallydata | number |
| 小数位数:0,最大长度:20 | 否 | 否 | 主表主键 |
| ocr_or_tax_parse | string | 否 | 否 | ocr/税票识别 |
| project_name | string | 否 | 否 | 项目名称 |
| specification_model | string | 否 | 否 | 规格型号 |
| unit | string | 否 | 否 | 单位 |
| quantity | number |
| 小数位数:8,最大长度:10 | 否 | 否 | 数量 |
| unit_price | number |
| 小数位数:8,最大长度:10 | 否 | 否 | 单价 |
| nuntaxmny | number |
| 小数位数:8,最大长度:10 | 否 | 否 | 不含税金额 |
| nmny | number |
| 小数位数:8,最大长度:10 | 否 | 否 | 含税金额 |
| amount | number |
| 小数位数:8,最大长度:10 | 否 | 否 | 金额 |
| tax_rate | number |
| 小数位数:8,最大长度:10 | 否 | 否 | 税率 |
| tax_amount | number |
| 小数位数:8,最大长度:10 | 否 | 否 | 税额 |
| pk_consumekind | number |
| 小数位数:0,最大长度:20 | 否 | 否 | 消费类型 |
| vlicenseplate | string | 否 | 否 | 车牌号 |
| vvehicletype | string | 否 | 否 | 车辆类型 |
| toll_start_date | date |
| 格式:yyyy-MM-dd | 否 | 否 | 通行起始日期 |
| toll_end_date | date |
| 格式:yyyy-MM-dd | 否 | 否 | 通行结束日期 |
| remarks | string | 否 | 否 | 备注 |
| carrier | string | 否 | 否 | 承运人 |
| pk_carrier | number |
| 小数位数:0,最大长度:20 | 否 | 否 | 承运人id |
| vflighttrainnum | string | 否 | 否 | 航班/车次 |
| pk_seatgrade | number |
| 小数位数:0,最大长度:20 | 否 | 否 | 座位等级 |
| vseatlevel | string | 否 | 否 | 座位等级名称 |
| carbin_class | string | 否 | 否 | 舱位等级名称 |
| pk_start_address | number |
| 小数位数:0,最大长度:20 | 否 | 否 | 出发地 |
| pk_end_address | number |
| 小数位数:0,最大长度:20 | 否 | 否 | 达到地 |
| start_address_name | string | 否 | 否 | 出发地名称 |
| end_address_name | string | 否 | 否 | 到达地名称 |
| travel_date | date |
| 格式:yyyy-MM-dd | 否 | 否 | 乘坐日期 |
| travel_time | date |
| 格式:HH:mm:ss | 否 | 否 | 乘坐时间 |
| ticket_class | string | 否 | 否 | 客票级别/客票类别 |
| ticket_effective_date | date |
| 格式:yyyy-MM-dd | 否 | 否 | 客票生效日期 |
| ticket_expiry_date | date |
| 格式:yyyy-MM-dd | 否 | 否 | 有效截至日期 |
| free_baggage | string | 否 | 否 | 免费行李 |
| passenger | string | 否 | 否 | 乘坐人 |
| tax_identification | string | 否 | 否 | 税号 |
| dutiable_amount | number |
| 小数位数:8,最大长度:10 | 否 | 否 | 完税价格 |
| original_voucher_no | string | 否 | 否 | 原凭证号 |
| type_tax | string | 否 | 否 | 税种 |
| tax_item_name | string | 否 | 否 | 品目名称 |
| period_of_tax | string | 否 | 否 | 税款所属时期 |
| deposit_date | date |
| 格式:yyyy-MM-dd | 否 | 否 | 入(退)库日期 |
| actual_amount | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 实缴(退)金额 |
| paid_amount | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 已缴或扣除额 |
| standard | string | 否 | 否 | 标准 |
| projectno | string | 否 | 否 | 项目编码 |
| start_date | date |
| 格式:yyyy-MM-dd | 否 | 否 | 出发日期 |
| end_date | date |
| 格式:yyyy-MM-dd | 否 | 否 | 到达日期 |
| end_time | date |
| 格式:HH:mm:ss | 否 | 否 | 到达时间 |
| costdate | date |
| 格式:yyyy-MM-dd | 否 | 否 | 发生日期 |
| start_time | date |
| 格式:HH:mm:ss | 否 | 否 | 出发时间 |
| quantity_unit | string | 否 | 否 | 数量/单位 |
| mileage | string | 否 | 否 | 里程 |
| time_geton | string | 否 | 否 | 上车时间 |
| city | string | 否 | 否 | 城市 |
| iscandeduct | boolean | 否 | 否 | 货物是否可抵扣 |
| ndeducttaxmny | number |
| 小数位数:8,最大长度:10 | 否 | 否 | 可抵扣金额 |
| ndeducttaxrate | number |
| 小数位数:8,最大长度:10 | 否 | 否 | 可抵扣税率 |
| nservicetaxmny | number |
| 小数位数:8,最大长度:10 | 否 | 否 | 服务费可抵扣税额 |
| nservicetaxrate | number |
| 小数位数:8,最大长度:10 | 否 | 否 | 服务费可抵扣税率 |
| pk_invoicecheck_b | number |
| 小数位数:0,最大长度:20 | 否 | 否 | 增值税票查验结果子表id |
| pk_deducttax | number |
| 小数位数:0,最大长度:20 | 否 | 否 | 可抵扣税表id |
| batchno | string | 否 | 否 | 批次号 |
| materialno | string | 否 | 否 | 物料号 |
| vdiscount | string | 否 | 否 | 折扣金额 |
| tallydataBusBVOList | object | 否 | 否 | 个人账单业务子表 |
| pk_tallydata | number |
| 小数位数:0,最大长度:20 | 否 | 否 | 主表主键 |
| ocr_or_tax_parse | string | 否 | 否 | ocr/税票识别 |
| traveler | string | 否 | 否 | 出行人 |
| card_no | string | 否 | 否 | 有效身份证号 |
| travel_date | date |
| 格式:yyyy-MM-dd | 否 | 否 | 出行日期 |
| vstartaddr | string | 否 | 否 | 出发地 |
| vendaddr | string | 否 | 否 | 到达地 |
| vclass | string | 否 | 否 | 等级 |
| pk_vtraffic_type | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 交通工具类型 |
| vtransport_type | string | 否 | 否 | 运输工具种类 |
| vtransport_no | string | 否 | 否 | 运输工具车牌号 |
| vstartaddr_transport | string | 否 | 否 | 起运地 |
| vendaddr_transport | string | 否 | 否 | 到达地 |
| vgoods_name_transport | string | 否 | 否 | 运输货物名称 |
| tallydataTaxBVOList | object | 是 | 否 | tallydataTaxBVOList |
| pk_tallydata | number |
| 小数位数:1,最大长度:20 | 否 | 否 | 主表主键 |
| tax_name | string | 否 | 否 | 税名 |
| tax_value | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 税值 |
| tax_percentage | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 税率 |
| tax_base | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 应税基数 |

## 3. 请求示例

Url: /yonbip/znbz/rbsm/api/billcommon/batchSaveInvoiceData?access_token=访问令牌
Body: [{
	"tallydataVO": {
		"_realtype": "true",
		"_entityName": "znbzbx.tallydata.TallydataVO",
		"_keyName": "id",
		"iinvoicestatus": 0,
		"vstampinfo": "北京滴滴出行科技有限公司,91110108MA01G0FB09",
		"bused": false,
		"igatherstatus": 1,
		"vprovince": "北京市",
		"ichecktype": 0,
		"nuntaxmny": "1310.96",
		"nfuelsurcharge": "",
		"vregion": "[95,19,1641,1061]",
		"path": "znbzbx_tallydata/1971555800545492993/1712719297245.JPG",
		"vimgsize": "1920,1080",
		"ndeducttaxmny": "39.33",
		"voperatorid": 1851461771861164041,
		"bocrmodify": false,
		"isagentmark": false,
		"id": 1971555800545492993,
		"tenant": "3504408309013696",
		"vattachmentass": "b60d7b6f247e4e75b6fda12f84d8d1dd",
		"iselecvmatched": 3,
		"iscitytraffic": false,
		"vbuyname": "用友网络科技股份有限公司",
		"dcostdate": "2023-12-07 00:00:00",
		"isrefund": false,
		"icheckstatus": 1,
		"filename": "1712719297245.JPG",
		"vbuytaxid": "91110000600001760P",
		"ntaxmny": "39.33",
		"isourcesystem": 0,
		"vseller_bank_account": "招商银行股份有限公司北京东三环支行110936504210806",
		"status": 12,
		"vimageid": "1847f1baee92d877bf12aa202404jpeg",
		"vinvoicetypecode": "10102",
		"dupdate": "2024-04-10 00:00:00",
		"pk_invoicetype": 9996,
		"isdeduct": true,
		"pk_consumekind": 9998,
		"creatorId": 1851461771861164041,
		"pk_ocrinvoice": 1971555809135427589,
		"ibusistatus": 0,
		"vcurrency": "1837319999347752994",
		"isEleInvoice": 1,
		"vpicturefileid": "661605c549308f2485a98baf",
		"vinvoiceno": "10556199",
		"cfinaceorg": "1837963849289957378",
		"duploadtime": "2024-04-10 11:21:41",
		"nservicetaxmny": "",
		"pk_costaddr": "bfad101d-5cf3-11e9-817e-7cd30abea0c0",
		"pubts": "2024-04-10 11:21:44",
		"vinvoicetypename": "增值税电子普通发票",
		"createDate": "2024-04-10 00:00:00",
		"creator": "吕文博",
		"vstampcusttaxid": "91110108MA01G0FB09",
		"orientation": 0,
		"vinvoicecode": "011002301111",
		"iauditresult": 1,
		"vseller_addr_tel": "北京市海淀区唐家岭北环路6号院1号楼C座四层408010-83456275",
		"ytenant": "0000LNMSTNR5E7BNR70000",
		"icompanyseal": 1,
		"vqrcode": "[01,10,011002301111,10556199,1310.96,20231207,13250180506951701215,CE01,]",
		"vinvoicecheckno": "13250180506951701215",
		"nchecknum": "1",
		"dopendate": "2023-12-07 00:00:00",
		"imanualauditresult": 0,
		"vcusttaxid": "91110108MA01G0FB09",
		"createTime": "2024-04-10 11:21:44",
		"istranssettle": false,
		"vcustname": "北京滴滴出行科技有限公司",
		"nmny": "1350.29",
		"collectionWay": 0,
		"vstampcustname": "北京滴滴出行科技有限公司",
		"_status": "Unchanged",
		"tspz": "",
		"overall_amount": 0,
		"medical_record_number": "",
		"inpatient_number": "",
		"outpatient_number": "",
		"medical_insurance_number": "",
		"visit_date": "2026-06-07 12:00:26",
		"medical_institution_type": "",
		"medical_insurance_type": "",
		"gender": "",
		"other_payments": 0,
		"personal_account_payment": 0,
		"cash_payment": 0,
		"personal_expense": 0,
		"personal_payment": 0,
		"personal_self1": 0,
		"personal_self2": 0,
		"inpatient_department": "",
		"admission_date": "2026-06-07 12:00:26",
		"discharge_date": "2026-06-07 12:00:26",
		"annual_health_insurance_coverage": 0,
		"annual_outpatient_catastrophic_payment": ""
	},
	"ocrInvoiceVO": {
		"_realtype": "true",
		"_entityName": "znbzbx.ocrinvoice.OCRInvoiceVO",
		"_keyName": "id",
		"seller": "北京滴滴出行科技有限公司",
		"code": "011002301111",
		"company_seal": 1,
		"vnumber": "10556199",
		"creatorId": 1851461771861164041,
		"vdate": "2023年12月07日",
		"item_names": "*运输服务*客运服务费,*运输服务*客运服务费",
		"currency_code": "CNY",
		"issuer": "于秋红",
		"stamp_info": "[{pk_ocrinvoice:null,vinvoicetypecode:null,vinvoicecode:0.999,vinvoiceno:0.999,vcustname:0.999,vcusttaxid:0.9922,vbuyname:0.999,vbuytaxid:0.9964,vseller_addr_tel:null,vseller_bank_account:null,vbuyer_addr_tel:null,vbuyer_bank_account:null}]",
		"buyer_tax_id": "91110000600001760P",
		"seller_tax_id": "91110108MA01G0FB09",
		"vocrdata": "{imageId:1847f1baee92d877bf12aa202404jpeg,identify_type:1,bill_type:invoice,type:10102,desc:增值税电子普通发票,orientation:0,region:[95,19,1641,1061],image_size:[1920,1080],page:0,coordinate:{degree:0,endX:0,endY:0,sourceHeight:0,sourceWidth:0,startX:0,startY:0},details:{fplx:1,title:北京增值税电子普通发票,currency_code:CNY,item_names:*运输服务*客运服务费,*运输服务*客运服务费,invoice_type:10102,date:2023年12月07日,electronic_mark:1,commodity_name:[*运输服务*客运服务费,*运输服务*客运服务费],code:011002301111,number:10556199,code_confirm:011002301111,number_confirm:,pretax_amount:1310.96,total:1350.29,total_cn:壹仟叁佰伍拾圆贰角玖分,tax:39.33,check_code:13250180506951701215,machine_code:499098498382,seller:北京滴滴出行科技有限公司,seller_tax_id:91110108MA01G0FB09,seller_addr_tel:北京市海淀区唐家岭北环路6号院1号楼C座四层408010-83456275,seller_bank_account:招商银行股份有限公司北京东三环支行110936504210806,buyer:用友网络科技股份有限公司,buyer_tax_id:91110000600001760P,buyer_bank_account:,buyer_addr_tel:,company_seal:1,tax_seal:,seal_flag:,seal_seller_name:,seal_seller_tax_id:,overlap:,form_type:,form_name:,kind:交通,ciphertext:03/6/12>>/7742+7*>-90/524>88,-7>197+4<**4<3<2<750/+5804/+,/6/*6647<67+*5+2-2<6+9>17292,<>4+22++9/01+6<419>72<9<5*43,travel_tax:,receiptor:杜洪亮,reviewer:赵笑林,issuer:于秋红,province:北京市,city:,remark:,agent_mark:,acquisition_mark:,service_name:运输服务,company_seal_mark:1,transit_mark:,vehicle_mark:0,oil_mark:,stamp_info:北京滴滴出行科技有限公司,91110108MA01G0FB09,producer_stamp:国家税务总局,block_chain:,zfbz:,return_red_flag:,electronic_number:,angle:,items:[{project_code:null,name:*运输服务*客运服务费,unit:次,standard_of_charge:null,specification:无,quantity:1,price:1526.59,total:1526.59,tax_rate:3%,tax:45.80,duty_no:null,tax_paid:null,comment:null,license_plate:null},{project_code:null,name:*运输服务*客运服务费,unit:,standard_of_charge:null,specification:,quantity:,price:,total:-215.63,tax_rate:3%,tax:-6.47,duty_no:null,tax_paid:null,comment:null,license_plate:null}],page_count:0,page_number:0},confidences:{date:0.999,seller:0.999,code:0.999,tax:0.999,buyer:0.999,buyer_tax_id:0.9964,seller_tax_id:0.9922,number:0.999,total:0.999,check_code:0.999,pretax_amount:0.999,seller_addr_tel:0.9968,seller_bank_account:0.9948},extra:{check_code_candidates:[],check_code_last_six:[],number_order_error:[],qrcode:[01,10,011002301111,10556199,1310.96,20231207,13250180506951701215,CE01,],barcode:null},billType:10101,imageSize:1920,1080}",
		"total": "1350.29",
		"vtallydata": "{bocrmodify:false,bused:false,cfinaceorg:1837963849289957378,createDate:2024-04-10,createTime:2024-04-10 11:21:41,creator:吕文博,creatorId:1851461771861164041,currency_code:CNY,dcostdate:2023-12-07 00:00:00,dopendate:2023-12-07 00:00:00,dupdate:2024-04-10,duploadtime:2024-04-10 11:21:41,_status:Unchanged,filename:1712719297245.JPG,iauditresult:1,ibusistatus:0,icheckstatus:0,ichecktype:0,icompanyseal:1,igatherstatus:1,imanualauditresult:0,isagentmark:false,iscitytraffic:false,isdeduct:false,isourcesystem:0,isrefund:false,istranssettle:false,nmny:1350.29,ntaxmny:39.33,nuntaxmny:1310.96000000,orientation:0,path:1712719297245.JPG,pk_consumekind:9998,pk_costaddr:bfad101d-5cf3-11e9-817e-7cd30abea0c0,pk_invoicetype:9996,pk_ocrinvoice:1971555809135427589,pubts:2024-04-10 11:21:41,_realtype:true,status:0,tenant:3504408309013696,vattachmentass:b60d7b6f247e4e75b6fda12f84d8d1dd,vbuyname:用友网络科技股份有限公司,vbuytaxid:91110000600001760P,vcurrency:1837319999347752994,vcustname:北京滴滴出行科技有限公司,vcusttaxid:91110108MA01G0FB09,vimageid:1847f1baee92d877bf12aa202404jpeg,vimgsize:1920,1080,vinvoicecheckno:13250180506951701215,vinvoicecode:011002301111,vinvoiceno:10556199,vinvoicetypecode:10102,vinvoicetypename:增值税电子普通发票,vmemo:,voperatorid:1851461771861164041,vpicturefileid:661605c549308f2485a98baf,vprovince:北京市,vqrcode:[01,10,011002301111,10556199,1310.96,20231207,13250180506951701215,CE01,],vregion:[95,19,1641,1061],vstampcustname:北京滴滴出行科技有限公司,vstampcusttaxid:91110108MA01G0FB09,vstampinfo:北京滴滴出行科技有限公司,91110108MA01G0FB09,vconsumekindname:交通,vconsumekindcode:YZ003,collectionWay:0,vcurrency_name:人民币,vcurrency_moneyDigit:2,vcurrency_currTypeSign:?,id:1971555800545492993}",
		"province": "北京市",
		"cfinaceorg": "1837963849289957378",
		"brelate": true,
		"check_code": "13250180506951701215",
		"extra": "{check_code_candidates:[],check_code_last_six:[],number_order_error:[],qrcode:[01,10,011002301111,10556199,1310.96,20231207,13250180506951701215,CE01,],barcode:null}",
		"pretax_amount": "1310.96",
		"id": 1971555809135427589,
		"pubts": "2024-04-10 11:21:44",
		"seller_bank_account": "招商银行股份有限公司北京东三环支行110936504210806",
		"tenant": "3504408309013696",
		"createDate": "2024-04-10 00:00:00",
		"ciphertext": "03/6/12>>/7742+7*>-90/524>88,-7>197+4<**4<3<2<750/+5804/+,/6/*6647<67+*5+2-2<6+9>17292,<>4+22++9/01+6<419>72<9<5*43",
		"creator": "吕文博",
		"ytenant": "0000LNMSTNR5E7BNR70000",
		"kind": "交通",
		"isgraphics": false,
		"tax": "39.33",
		"reviewer": "赵笑林",
		"buyer": "用友网络科技股份有限公司",
		"machine_code": "499098498382",
		"createTime": "2024-04-10 11:21:44",
		"ibusitype": 0,
		"receiptor": "杜洪亮",
		"seller_addr_tel": "北京市海淀区唐家岭北环路6号院1号楼C座四层408010-83456275",
		"vinvoicetype": "10102",
		"_status": "Unchanged"
	},
	"invoiceAuditResultVOList": [
		{
			"_realtype": "true",
			"_entityName": "znbzbx.invoiceauditresult.InvoiceAuditResultVO",
			"_keyName": "id",
			"iauditresult": 1,
			"vinnercode": "INVC010113",
			"ytenant": "0000LNMSTNR5E7BNR70000",
			"pk_auditclass": 9990,
			"igatherstatus": 1,
			"pk_auditrule": 9982,
			"pk_invauditrule": 9856,
			"imanualauditresult": 0,
			"cfinaceorg": "1837963849289957378",
			"createTime": "2024-04-10 11:21:43",
			"vsourceaction": "票据采集",
			"pk_tallydata": 1971555800545492993,
			"icontrolprop": 2,
			"id": 1971555800545492994,
			"pubts": "2021-03-26 11:25:26",
			"tenant": "3504408309013696",
			"createDate": "2024-04-10 00:00:00",
			"_status": "Unchanged"
		}
	],
	"invoiceFileVOList": [
		{
			"_realtype": "true",
			"_entityName": "znbzbx.invoicefile.InvoiceFileVO",
			"_keyName": "id",
			"vimageid": "1847f1baee92d877bf12aa202404jpeg",
			"creator": "吕文博",
			"orientation": 0,
			"vattachmentass": "b60d7b6f247e4e75b6fda12f84d8d1dd",
			"ytenant": "0000LNMSTNR5E7BNR70000",
			"inecessity": 0,
			"vfileid": "661605c549308f2485a98baf",
			"path": "znbzbx_tallydata/1971555800545492993/1712719297245.JPG",
			"ipagecount": 1,
			"cfinaceorg": "1837963849289957378",
			"createTime": "2024-04-10 11:21:44",
			"filelength": "534027",
			"ifiletype": 1,
			"id": 1971555809135427591,
			"pubts": "2024-04-10 11:21:41",
			"isfolder": false,
			"tenant": "3504408309013696",
			"createDate": "2024-04-10 00:00:00",
			"_status": "Unchanged"
		}
	],
	"tallydataTaxDeductVOList": [
		{
			"_realtype": "true",
			"_entityName": "znbzbx.tallydata.TallydataTaxDeductVO",
			"_keyName": "id",
			"ytenant": "0000LNMSTNR5E7BNR70000",
			"pk_consumekind": 9998,
			"nuntaxmny": "1526.59",
			"iscandeduct": true,
			"pk_invoicecheck_b": 1971555809135427593,
			"ndeducttaxmny": "45.8",
			"ntaxmny": "45.8",
			"nmny": "1572.39",
			"ndeducttaxrate": "3",
			"pk_tallydata": 1971555800545492993,
			"id": 1971555809135427596,
			"pubts": "2024-04-10 11:21:44",
			"tenant": "3504408309013696",
			"_status": "Unchanged"
		}
	],
	"invoiceCheckDataList": [
		{
			"invoiceCheckVO": {
				"_realtype": "true",
				"_entityName": "znbzbx.invoicecheck.InvoiceCheckVO",
				"_keyName": "id",
				"vcheckstatus": "OK",
				"creatorId": 1851461771861164041,
				"vselladdrphone": "北京市海淀区唐家岭北环路6号院1号楼C座四层408010-83456275",
				"vouchdate": "2024-04-10 00:00:00",
				"vselltaxpayerid": "91110108MA01G0FB09",
				"iinvoicetype": 1,
				"vinvoiceno": "10556199",
				"cfinaceorg": "1837963849289957378",
				"checkcount": "1",
				"pk_checkman": 1851461771861164041,
				"vsellbankaccount": "招商银行股份有限公司北京东三环支行110936504210806",
				"id": 1971555809135427592,
				"pubts": "2024-04-10 11:21:44",
				"vcheckcode": "13250180506951701215",
				"tenant": "3504408309013696",
				"vinvoicetypename": "增值税电子普通发票",
				"createDate": "2024-04-10 00:00:00",
				"creator": "吕文博",
				"decodedata": "{airVo:null,attachs:null,checkdata:{\\data\\:{\\amount\\:\\1310.96\\,\\buyer\\:{\\address\\:\\\\,\\bank\\:\\\\,\\code\\:\\91110000600001760P\\,\\name\\:\\用友网络科技股份有限公司\\},\\commodities\\:[{\\amount\\:\\1526.59\\,\\name\\:\\*运输服务*客运服务费\\,\\numberplate\\:null,\\price\\:\\1526.59\\,\\quantity\\:\\1\\,\\spec\\:\\无\\,\\tax_amount\\:\\45.80\\,\\tax_rate\\:\\3\\,\\toll_end_date\\:null,\\toll_start_date\\:null,\\tolltype\\:null,%uom\\:\\次\\},{\\amount\\:\\-215.63\\,\\name\\:\\*运输服务*客运服务费\\,\\numberplate\\:null,\\price\\:null,\\quantity\\:null,\\spec\\:\\\\,\\tax_amount\\:\\-6.47\\,\\tax_rate\\:\\3\\,\\toll_end_date\\:null,\\toll_start_date\\:null,\\tolltype\\:null,%uom\\:\\\\}],\\date\\:\\20231207\\,\\district\\:null,\\inv_code\\:\\011002301111\\,\\inv_number\\:\\10556199\\,\\inv_status\\:\\0\\,\\remark\\:\\\\,\\seller\\:{\\address\\:\\北京市海淀区唐家岭北环路6号院1号楼C座四层408010-83456275\\,\\bank\\:\\招商银行股份有限公司北京东三环支行110936504210806\\,\\code\\:\\91110108MA01G0FB09\\,\\name\\:\\北京滴滴出行科技有限公司\\},\\sum_amount\\:\\1350.29\\,\\tax_amount\\:\\39.33\\,\\type_code\\:\\10\\,\\type_name\\:\\增值税电子普通发票\\,\\verify_code\\:\\13250180506951701215\\},\\err\\:null,\\isthrowerror\\:null,\\pk_tallydata\\:null,\\result\\:\\OK\\},code:null,custPayCertiVO:null,fileName:null,fiscalNonTaxVO:null,fpDm:null,fpHm:null,imageId:null,invoice:{bz:,currencyType:null,fhr:null,fpDm:011002301111,fpHm:10556199,fpMw:null,fpjz:null,fplx:1,gmfDzdh:,gmfMc:用友网络科技股份有限公司,gmfNsrsbh:91110000600001760P,gmfYhzh:,hjje:null,hjse:39.33,icodeanalytype:null,invoiceType:null,ipdfanalytype:null,issuspect:null,items:[{dw:次,ggxh:无,se:45.80,sl:3,txfCph:null,txfLx:null,txfTxrqq:null,txfTxrqz:null,xmdj:1526.59,xmje:1526.59,xmjshj:null,xmmc:*运输服务*客运服务费,xmsl:1},{dw:,ggxh:,se:-6.47,sl:3,txfCph:null,txfLx:null,txfTxrqq:null,txfTxrqz:null,xmdj:null,xmje:-215.63,xmjshj:null,xmmc:*运输服务*客运服务费,xmsl:null}],jqbh:null,jshj:1350.29,jym:13250180506951701215,kpr:null,kprq:2023-12-07,skr:null,submitter:null,xsfDzdh:北京市海淀区唐家岭北环路6号院1号楼C座四层408010-83456275,xsfMc:北京滴滴出行科技有限公司,xsfNsrsbh:91110108MA01G0FB09,xsfYhzh:招商银行股份有限公司北京东三环支行110936504210806,zfbz:null},invoiceType:null,machineVO:null,msg:null,pdfSignatureVO:null,repeatFlag:null,trainVo:null,verify:null,vqrcode:null}",
				"vinvoicecode": "011002301111",
				"ytenant": "0000LNMSTNR5E7BNR70000",
				"dcheckdate": "2024-04-10 00:00:00",
				"iinvoiceformtype": 1,
				"vsellname": "北京滴滴出行科技有限公司",
				"dopendate": "2023-12-07 00:00:00",
				"createTime": "2024-04-10 11:21:44",
				"ntaxmny": "39.33",
				"vcustname": "用友网络科技股份有限公司",
				"nmny": "1350.29",
				"pk_tallydata": 1971555800545492993,
				"checkdata": "{data:{amount:1310.96,buyer:{address:,bank:,code:91110000600001760P,name:用友网络科技股份有限公司},commodities:[{amount:1526.59,name:*运输服务*客运服务费,numberplate:null,price:1526.59,quantity:1,spec:无,tax_amount:45.80,tax_rate:3,toll_end_date:null,toll_start_date:null,tolltype:null,uom:次},{amount:-215.63,name:*运输服务*客运服务费,numberplate:null,price:null,quantity:null,spec:,tax_amount:-6.47,tax_rate:3,toll_end_date:null,toll_start_date:null,tolltype:null,uom:}],date:20231207,district:null,inv_code:011002301111,inv_number:10556199,inv_status:0,remark:,seller:{address:北京市海淀区唐家岭北环路6号院1号楼C座四层408010-83456275,bank:招商银行股份有限公司北京东三环支行110936504210806,code:91110108MA01G0FB09,name:北京滴滴出行科技有限公司},sum_amount:1350.29,tax_amount:39.33,type_code:10,type_name:增值税电子普通发票,verify_code:13250180506951701215},err:null,isthrowerror:null,pk_tallydata:null,result:OK}",
				"isdelete": false,
				"vcusttaxpayerid": "91110000600001760P",
				"_status": "Unchanged"
			},
			"invoiceCheckBVOList": [
				{
					"_realtype": "true",
					"_entityName": "znbzbx.invoicecheck.InvoiceCheckBVO",
					"_keyName": "id",
					"pk_invoicecheck": 1971555809135427592,
					"ytenant": "0000LNMSTNR5E7BNR70000",
					"nnum": "1",
					"vgoodsunit": "次",
					"vgoodsname": "*运输服务*客运服务费",
					"nprice": "1526.59",
					"vgoodsspec": "无",
					"ntaxmny": "45.8",
					"ntaxrate": "3",
					"nmny": "1526.59",
					"id": 1971555809135427593,
					"pubts": "2024-04-10 11:21:44",
					"ntotalmny": "1572.39",
					"tenant": "3504408309013696",
					"_status": "Unchanged"
				}
			]
		}
	],
	"tallydataAmountBVOList": {
		"pk_tallydata": 0,
		"ocr_or_tax_parse": "",
		"project_name": "",
		"specification_model": "",
		"unit": "",
		"quantity": 0,
		"unit_price": 0,
		"nuntaxmny": 0,
		"nmny": 0,
		"amount": 0,
		"tax_rate": 0,
		"tax_amount": 0,
		"pk_consumekind": 0,
		"vlicenseplate": "",
		"vvehicletype": "",
		"toll_start_date": "2026-06-07",
		"toll_end_date": "2026-06-07",
		"remarks": "",
		"carrier": "",
		"pk_carrier": 0,
		"vflighttrainnum": "",
		"pk_seatgrade": 0,
		"vseatlevel": "",
		"carbin_class": "",
		"pk_start_address": 0,
		"pk_end_address": 0,
		"start_address_name": "",
		"end_address_name": "",
		"travel_date": "2026-06-07",
		"travel_time": "12:00:26",
		"ticket_class": "",
		"ticket_effective_date": "2026-06-07",
		"ticket_expiry_date": "2026-06-07",
		"free_baggage": "",
		"passenger": "",
		"tax_identification": "",
		"dutiable_amount": 0,
		"original_voucher_no": "",
		"type_tax": "",
		"tax_item_name": "",
		"period_of_tax": "",
		"deposit_date": "2026-06-07",
		"actual_amount": 0,
		"paid_amount": 0,
		"standard": "",
		"projectno": "",
		"start_date": "2026-06-07",
		"end_date": "2026-06-07",
		"end_time": "12:00:26",
		"costdate": "2026-06-07",
		"start_time": "12:00:26",
		"quantity_unit": "",
		"mileage": "",
		"time_geton": "",
		"city": "",
		"iscandeduct": true,
		"ndeducttaxmny": 0,
		"ndeducttaxrate": 0,
		"nservicetaxmny": 0,
		"nservicetaxrate": 0,
		"pk_invoicecheck_b": 0,
		"pk_deducttax": 0,
		"batchno": "",
		"materialno": "",
		"vdiscount": ""
	},
	"tallydataBusBVOList": {
		"pk_tallydata": 0,
		"ocr_or_tax_parse": "",
		"traveler": "",
		"card_no": "",
		"travel_date": "2026-06-07",
		"vstartaddr": "",
		"vendaddr": "",
		"vclass": "",
		"pk_vtraffic_type": 0,
		"vtransport_type": "",
		"vtransport_no": "",
		"vstartaddr_transport": "",
		"vendaddr_transport": "",
		"vgoods_name_transport": ""
	},
	"tallydataTaxBVOList": [
		{
			"pk_tallydata": 0,
			"tax_name": "",
			"tax_value": 0,
			"tax_percentage": 0,
			"tax_base": 0
		}
	]
}]

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| code | number |
| 小数位数:0,最大长度:10 | 否 | code 示例：200 |
| message | string | 否 | message 示例：操作成功 |
| data | object | 是 | data |
| tallydataId | number |
| 小数位数:0,最大长度:19 | 否 | tallydataId 示例：1789830167887609900 |
| result | boolean | 否 | result 示例：true |
| message | string | 否 | message |
| traceId | string | 否 | traceId 示例：e1ebf4848fba6a1b |
| displayCode | string | 否 | 异常码 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": [
		{
			"tallydataId": 1789830167887609900,
			"result": true,
			"message": ""
		}
	],
	"traceId": "e1ebf4848fba6a1b",
	"displayCode": ""
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-03-30

新增

请求参数 (27)

更新

请求参数 (103)

2	2026-01-07

更新

请求说明

添加幂等性

3	2025-12-08

更新

请求说明

新增

请求参数 tspz

更新

请求参数 vimageid

更新

请求参数 vtallydata

更新

请求参数 vimageid

4	2025-08-21

新增

请求参数 (81)

添加账单金额子表、业务子表

5	2025-07-11

新增

返回参数 displayCode


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

