---
title: "元数据配置说明"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/spec/02-metadata-manage"
section: "协议"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 协议]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# 元数据配置说明

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/spec/02-metadata-manage | 所属：协议

# [](#元数据配置说明)元数据配置说明

目前支持两种方式的元数据配置：

- 方式1: 通过xml文件生成元数据
- 方式2: 为通过平台的配置页面生成元数据

## [](#方式1xml方式)方式1：XML方式

1.在ucf-mdf-domain/resource/meta-mpdels目录中定义元数据的xml文件

xml格式可参考项目中的**ucf_cus_quotation.xml**文件进行配置，文件详细说明如下：

<?xml version="1.0" encoding="utf-8"?>

<components xmlns="http://www.imeta.org/meta"

 xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"

 xsi:schemaLocation="http://www.imeta.org/meta http://upsms.yonyouup.com/meta.xsd">

 <references>

 <reference file="ucfbase.xml"/><!--引入的基础元数据文件，可以用来复用通用的属性-->

 </references>

 <!--component 组件标签，生成实体vo时相当于包路径为[moduleName.name]即:ucf.customer-->

 <!--domain 用于云端的服务挂载用,本地调试可不关注 -->

 <component name="customer" moduleName="ucf" title="客户报价单" domain="hpapaas">

 <!--主表定义，name为组件名称，可用于xml其他位置引用，tableName为生成数据库SQL时的表名-->

 <class name="CusQuotation" title="客户报价单" tableName="mdd_cus_quotation">

 <!--字段属性定义，主要属性如下：

 name：vo属性名

 columnName：数据库字段名，非持久化字段不加此属性

 title：字段名称

 iLength：字段长度

 isRequired：是否必填

 type：字段类型，基础类型有String，DateTime，Decimal(iPrecision.iScale)，Integer等，引用其他组件直接写组件包名+组件名

 -->

 <attributes>

 <attribute name="transactionType" columnName="transaction_type" type="bd.bill.TransType" title="交易类型" iLength="64" isTransactionType="true" isRequired="false"/>

 <attribute name="quotationNum" columnName="quotation_num" type="String" title="报价单号" iLength="64" isRequired="false" isCode="true"/>

 <attribute name="billDate" columnName="bill_date" type="DateTime" title="单据日期" isRequired="false"/>

 <attribute name="customerId" columnName="customer_id" type="aa.merchant.Merchant" title="客户档案ID" iLength="64" isRequired="false"/>

 <attribute name="cusContacts" columnName="cus_contacts" type="String" title="客户联系人" iLength="255" isRequired="false"/>

 <attribute name="cusContactsTel" columnName="cus_contacts_tel" type="String" title="客户联系人固定电话" iLength="255" isRequired="false"/>

 <attribute name="cusContactsMobil" columnName="cus_contacts_mobil" type="String" title="客户联系人手机号" iLength="255" isRequired="false"/>

 <attribute name="salesman" columnName="salesman_id" type="bd.staff.Staff" title="销售业务员" iLength="64" isRequired="false"/>

 <attribute name="transCurrency" columnName="trans_currency_id" type="bd.currencytenant.CurrencyTenantVO" title="交易币种" iLength="64" isRequired="false"/>

 <attribute name="localCurrency" columnName="local_currency_id" type="bd.currencytenant.CurrencyTenantVO" title="本币" iLength="64" isRequired="false"/>

 <attribute name="exchangeRate" columnName="exchange_rate" type="bd.exchangeRate.ExchangeRateVO" title="汇率" iLength="64" isRequired="false"/>

 <attribute name="taxFreeAmount" columnName="tax_free_amount" type="Decimal" title="无税金额" iPrecision="11" iScale="6" isRequired="false"/>

 <attribute name="taxAmount" columnName="tax_amount" type="Decimal" title="税额" iPrecision="11" iScale="6" isRequired="false"/>

 <attribute name="valueTaxTotal" columnName="value_tax_total" type="Decimal" title="价税合计" iPrecision="11" iScale="6" isRequired="false"/>

 <attribute name="taxFreeInLocal" columnName="tax_free_in_local" type="Decimal" title="本币无税金额" iPrecision="11" iScale="6" isRequired="false"/>

 <attribute name="taxInLocal" columnName="tax_in_local" type="Decimal" title="本币税额" iPrecision="11" iScale="6" isRequired="false"/>

 <attribute name="valueTaxInLocal" columnName="value_tax_in_local" type="Decimal" title="本币价税合计" iPrecision="11" iScale="6" isRequired="false"/>

 <attribute name="memo" columnName="memo" type="String" title="备注" iLength="255" isRequired="false"/>

 <attribute name="inquiryOrg" columnName="inquiry_org_id" type="bd.adminOrg.SalesOrgVO" title="询价组织" iLength="64" isMasterOrg="true" isRequired="false"/>

 <attribute name="inquiryDept" columnName="inquiry_dept_id" type="bd.adminOrg.AdminOrgVO" title="询价部门" iLength="64" isRequired="false"/>

 <attribute name="customerVIP" columnName="customer_vip" type="Integer" title="客户VIP属性" iLength="64" isRequired="false"/>

 

 <!--子表属性，没有columnName属性，不会加入建表sql，仅用于标识主子表关系-->

 <attribute name="materielList" title="询价物料列表" type="ucf.customer.CusQuotationMateriel"/>

 </attributes>

 </class>

 <!--子表 -->

 <class name="CusQuotationMateriel" title="客户报价单物料" tableName="mdd_cus_quotation_materiel">

 <attributes>

 <attribute name="materielId" columnName="materiel_id" type="aa.product.Product" title="物料ID" iLength="64" isRequired="false"/>

 <attribute name="materielNum" columnName="materiel_num" type="String" title="物料编号" iLength="64" isRequired="false"/>

 <attribute name="unitName" columnName="unit_name" type="String" title="主单位名称" iLength="64" isRequired="false"/>

 <attribute name="skuId" columnName="sku_id" type="String" title="物料SKU_ID" iLength="64" isRequired="false"/>

 <attribute name="skuNum" columnName="sku_num" type="String" title="物料SKU编号" iLength="64" isRequired="false"/>

 <attribute name="skuName" columnName="sku_name" type="String" title="物料SKU名称" iLength="64" isRequired="false"/>

 <attribute name="quantity" columnName="quantity" type="Decimal" title="数量" iPrecision="11" iScale="6" isRequired="false"/>

 <attribute name="inventoryQuantity" columnName="inventory_quantity" type="Decimal" title="库存数量" iPrecision="11" iScale="6" isRequired="false"/>

 <attribute name="inventoryUnit" columnName="inventory_unit" type="String" title="库存单位" iLength="64" isRequired="false"/>

 <attribute name="valuationQuantity" columnName="valuation_quantity" type="Decimal" title="计价数量" iPrecision="11" iScale="6" isRequired="false"/>

 <attribute name="valuationUnit" columnName="valuation_unit" type="String" title="计价单位" iLength="64" isRequired="false"/>

 <attribute name="taxFreePrice" columnName="tax_free_price" type="Decimal" title="无税单价" iPrecision="11" iScale="6" isRequired="false"/>

 <attribute name="taxRate" columnName="tax_rate" type="Decimal" title="税率" iPrecision="11" iScale="6" isRequired="false"/>

 <attribute name="taxPrice" columnName="tax_price" type="Decimal" title="含税单价" iPrecision="11" iScale="6" isRequired="false"/>

 <attribute name="taxFreeAmount" columnName="tax_free_amount" type="Decimal" title="无税金额" iPrecision="11" iScale="6" isRequired="false"/>

 <attribute name="taxAmount" columnName="tax_amount" type="Decimal" title="税额" iPrecision="11" iScale="6" isRequired="false"/>

 <attribute name="valueTaxTotal" columnName="value_tax_total" type="Decimal" title="价税合计" iPrecision="11" iScale="6" isRequired="false"/>

 <attribute name="taxFreePriceInLocal" columnName="tax_free_price_in_local" type="Decimal" title="本币无税单价" iPrecision="11" iScale="6" isRequired="false"/>

 <attribute name="taxPriceInLocal" columnName="tax_price_in_local" type="Decimal" title="本币含税单价" iPrecision="11" iScale="6" isRequired="false"/>

 <attribute name="taxFreeInLocal" columnName="tax_free_in_local" type="Decimal" title="本币无税金额" iPrecision="11" iScale="6" isRequired="false"/>

 <attribute name="taxInLocal" columnName="tax_in_local" type="Decimal" title="本币税额" iPrecision="11" iScale="6" isRequired="false"/>

 <attribute name="valueTaxInLocal" columnName="value_tax_in_local" type="Decimal" title="本币价税合计" iPrecision="11" iScale="6" isRequired="false"/>

 <attribute name="buyer" columnName="buyer" type="bd.staff.Staff" title="采购员/专管员" iLength="255" isRequired="false"/>

 <attribute name="memo" columnName="memo" type="String" title="备注" iLength="255" isRequired="false"/>

 

 <!-- 主表信息 -->

 <attribute name="cusQuotationId" columnName="cus_quotation_id" title="客户报价单主键" type="ucf.customer.CusQuotation"/>

 

 </attributes>

 </class>

 <!--实现的接口列表 supplier为要实现的接口，client为要实现接口的组件-->

 <realizations>

 <realization supplier="ucfbase.ucfbaseItf.IAutoCode" client="CusQuotation"/>

 <realization supplier="ucfbase.ucfbaseItf.IApprovalFlow" client="CusQuotation"/>

 </realizations>

 <!--继承的父组件列表，用来复用通用的一些属性如ID等-->

 <generalizations>

 <generalization parent="ucfbase.entity.BizObject" child="CusQuotation"/>

 <generalization parent="ucfbase.entity.BizObject" child="CusQuotationMateriel"/>

 </generalizations>

 <!--组件之间的组合关系

 type：表示对应关系类型，默认：composition

 typeB：主表组件名，roleB：从表中的主表关联属性

 typeA：从表组件名，roleA：主表中的从表关联属性

 roleAMulti：对应的表示1，1..n，n..n关联关系

 -->

 <associations>

 <association type="composition" typeB="CusQuotation" roleB="cusQuotationId" typeA="CusQuotationMateriel" roleA="materielList"

 roleAMulti="1..n"/>

 </associations>

 </component>

</components>

2.生成建表SQL

打开ucf-mdf-tools下的TableBuildTest，修改appNames为**ucf_cus_quotation.xml**文件中**component**标签中定义的包名：

String appNames = "ucf.customer";

执行TableBuildTest，会在ucf-mdf-conf/resources/tpl-config.properties文件中配置的目录下生成sql脚本

![](data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAARgAAABgCAYAAADGiG2UAAAAAXNSR0IArs4c6QAAAARnQU1BAACxjwv8YQUAAAAJcEhZcwAAHYcAAB2HAY/l8WUAAAmDSURBVHhe7Z1PbxvHFcDzAZKvUBfIoTGc8OK2B8VU5CBO0ripLMupAyNADcv/ZQQI1JsTUTGqGj7EPkho0QCti6JmAihqbz3QX8bfZMq3u7OcHb7lLskdanf5O/wg7cybN0OZ76fZhTl67dx7501beXzwvYr0vXnq5+bVq1cpci34OQBgdlotmElYofhosQAwG0srGAAID4IBgGAgGAAIBoIBgGAgGAAIBoIBgGAgGAAIRq0E4/+HuN6TZ+ba9ZtqbEjuHQ7My5cvzWBwaO6trqkx8yJzDAZ9s/vZKP8i5vVZ+WzPvBjIWhY3JywPlQjmu6dPzfHxcS7Sr43z8QVjuX73gRofgs1ePyryRQum7LwS54tpHhAMhKQSwaxvbJqjoyNVLtIu/do4H00uZdByzYrdRRxshy02XzBl5/XHzQuCgZBUdou0u/etKhhp1+I1NHmUwc+TFs1hvPNZWb1qdvvZIlpZfWAOhjHprmEYa4s8bevvmU2l6NL80r99GMcmRb+SXAsvelfHxkSxyVx2TNl5x+LS1+e9Fk8Wk/o1wbivQQgtW2gvlQnmw998Yn744ceMXORa2rV4DU0eZfDzFAnGLzhhNsH0U2nE8d61lY4yn9s/j2Dyc+e/1ky/JxhXhBYEA7NS6UPer3b+mBGMXGtxeWjyKIOfp1AwdteR9LvYIp5UVJOKUsbZ+dJrO18iDlv07q1OmXkFiXPH+bltjLTJDqqw338tSby7+wKYlUoF8977H5jnz59HcpGvcq3F5aHJowx+niLB2AeqWjH7he7uANIdic0/Jow4v5/HzmeLdrSefMFo89o499rP7bcV9Y8Jxtvx5O2mAMpQqWCErVu3I8HIV61/Epo8XLQxGkUCsAU29w5mSsGMhGfj8wWThy8YbTfm5irs9wRjY+w4fyzANFQumO7a++bh199EX7X+SWhScZGYtf+9UnHz+L+F00LJ+S0d9SVFVKbQpxWMjXfnE2YVTDp+uOZZXmum3xOMK5Y0FsHAjFQumHnQpOIiMZpcBD+XWygH29lbpKjfK/qQgonGOOt50XtQeIuUh7tuu2ZfIu46ivqLBMMtEsxDawUDACdPrQRTBk0ughYLACcLggGAYCAYAAhG4wQDAM0BwQBAMBAMAAQDwQBAMBAMAAQDwQBAMBAMAASjlYLxP2JwUoeHC/FnfUafOQJYJmolmDYdHm5BMLDM1EowbTo8fBbsQVRFn6gGaAq1u0Wq0+HhiwbBQNuonWDqdHi4YE+jGztHxTtjJTp+MhVEcj5Mf89cviK3SMlZK16/HStCGTuzhXNYoAXU8iFvvQ4Pzx7eFLUnMnDPuY3b8w62ygom0799ODrsiR0MtIxaCqY2h4cnInFPnovaRQrKDkMThCaYTL/ThmCgbdRSMELIw8Pz0HIJtvCtaBAMQDlqK5iQh4fn4ecROewmxZ4VQbyzsSKQ693MM5jJgnEP0ZZnPNwiQVuprWDmQZNHGbRc/in+tj0WR9w3SRDqDubQ+ZMgSZ+NT//ECQ95oQUgGActV5WwQ4Flo5WCqSsIBpYNBLNAEAwsGwgGAIKBYAAgGAgGAIKBYAAgGAgGAIKBYAAgGAgGAIKBYAAgGAhmAv5HCao8PNz9RDb/AQ/aSisF04TDwxEMLAOtFEwTDg9HMLAMtPYWqe6HhyMYWAZaK5i6HR7uH+rtnvkyEkw2BuFA02n1Q97aHB7unYAnyEFWvmDyDgO3YwCaRqsFU5vDw53bIa1Nu0XitgnaQKsFI9Th8HAEA8tK6wVTi8PDxw4JT26J/FuknMPAbRtA02i9YOZBk0cZtFyyY0kf7sqfP+kpO5gJh4EDNBEEMwFNHmXQcgEsIwgGAIKBYAAgGAgGAIKBYAAgGAgGAILx2hunVw0AQAgQDAAEA8EAQDAQDAAEA8GcEBe+2I6+7j792xh+LEBTQTAngMjFisSXi21fBl5/64rp7g/MxfVuTv99c/EvB6bzlt5fV6ped1N/DgKCWTBWLlYkrljc9mUAwZQDwUApXLlYkbjXbvtJUVT0RUwzHsGUA8HAzCAYBFMEgoFSaDLR0MZa4jfbwNz968uIz7euOIUa993Z75lTwzejFpvm6fbM506fFLkfXyaPS+54Za44Prvu8X5pHxVW2XUIcWzfdNdHc0evcf0gM96uIfOzGcbYtZ/a6qfxdyasJerP/Lx0IVSdr+4gmAWiyURDGyvYN6FfWLZIxt+wwwLr2uvRbiH6fid+80Z9UlDJWDeuKI9c+4yPL54rs+5M/6iwpl9H/LNKizQRy52d+3F/JL0ktyMU6evsJD8nJ0bL7c4tY4qEUHW+JoBgGoRfCGm7Umy2oHxcOWm/TccEUSKPS17hl5nLH+8W1vTrkLGukPKvx7+365PvRYCjcdFY5d/BbXNz2P4opuJ8TQDBLID/Pu7OjJtHeyNG7TmC0WKjvuSWxRZn5re5Ipi8PBpj46eYyx+fKfap1yFjdaFo1yJAWaN8tbsci12TFYO2FretSAhV56szCGYBiCge3jhrNs6fNp+uno6u/91719y53DFXPzpjbm10zD+/Xonabb/FzRO/0ZziHV53h0WhF2o2Vujs6MUaFVWeYCbksdcuY+NLzOUWdLZ/VFjTr0PiywsmEt/+gbm4n23rpj+H0evy15K+DkUIsVATkVSQT/qbBIJZACIKkcvfH8YSEUQuT7Z/FX3/3Ze/Njd++3b0/STBCPEbNn4YOOlWw48V/DdwepsxLFT32YAUeZTfvsFz8uThjv/ZLzZz50rXPWyz/fY1SR6/sKZZRzy2vGAE97mH25auzRGhiDNtlzxb+o4jXvNonnnz2fimgGAWgIji0c2z5uqHZ8z2lY758dG5SDhHfzpnftqPdzOX1k6b//y5WDAQDin+vGc6Rfg7tXmpOt9JgWAWgJXFT/vnzL3Njnl065fm9qV3oh3MP4a7mmvD26Qbn74TxSCYkyHeacy+S0AwOghmAYgo7g/Fsj7cpfzh4tvRrdK/vnk3kszvL5wxNy91zO2NTrqDsexunVXz1YF42z7a7luKbp+qpop12NuWedaOYHQQzAJwdyTTouUDaAoIBgCCgWAAIBj8VQEACAaCAYBgIBgACAaCAYBgIBgACAaCmcDjg+8z9J48M9eu31Rjp2Vl+9AM+ntmc3VN7QdoA60UzNNnz8zvNi6rfdPgC8Zy/e4DNX4aEAwsA60UzPHxsTk6OjK9vW/NhY8/UWPKoMmlDFouHwQD7ee8+T/d4H7RuQESMwAAAABJRU5ErkJggg==)

然后在数据库中执行该建表SQL脚本；

## [](#方式2设计器方式)方式2：设计器方式

- 方式2为通过平台的配置页面生成元数据，都是通过界面化的配置
- 详细建模说明待补充