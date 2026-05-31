# |<<

**发货单子实体 (so_delivery_b / nc.vo.so.m4331.entity.DeliveryBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5400.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cdeliverybid | 发货单子实体 | cdeliverybid | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 物流组织 | pk_org | varchar(20) |  | 组织_业务单元_物流组织 (trafficorg) |
| 3 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 4 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 5 | ccustmaterialid | 客户物料码 | ccustmaterialid | varchar(20) |  | 客户物料码 (custmaterial) |
| 6 | cordercustid | 客户编码 | cordercustid | varchar(20) |  | 客户基本信息 (customer) |
| 7 | cfreecustid | 散户 | cfreecustid | varchar(20) |  | 散户 (freecustom) |
| 8 | cinvoicecustid | 开票客户 | cinvoicecustid | varchar(20) |  | 客户基本信息 (customer) |
| 9 | cmaterialid | 物料档案 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 10 | cmaterialvid | 物料编码 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 11 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 12 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 13 | cqualitylevelid | 质量等级 | cqualitylevelid | char(20) |  | 主键 (UFID) |
| 14 | corigcountryid | 原产国 | corigcountryid | varchar(20) |  | 国家地区 (countryzone) |
| 15 | corigareaid | 原产地区 | corigareaid | varchar(20) |  | 行政区划 (region) |
| 16 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 17 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 18 | nastnum | 数量 | nastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 20 | nnum | 主数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | vchangerate | 换算率 | vchangerate | varchar(60) |  | 字符串 (String) |
| 22 | cqtunitid | 报价单位 | cqtunitid | varchar(20) |  | 计量单位 (measdoc) |
| 23 | nqtunitnum | 报价数量 | nqtunitnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | vqtunitrate | 报价换算率 | vqtunitrate | varchar(60) |  | 字符串 (String) |
| 25 | bcheckflag | 是否已报检 | bcheckflag | char(1) |  | 布尔类型 (UFBoolean) |
| 26 | busecheckflag | 是否根据质检结果入库 | busecheckflag | char(1) |  | 布尔类型 (UFBoolean) |
| 27 | ntotalreportnum | 累计报检数量 | ntotalreportnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 28 | ntotalelignum | 累计合格数量 | ntotalelignum | decimal(28, 8) |  | 数值 (UFDouble) |
| 29 | ntotalunelignum | 累计不合格数量 | ntotalunelignum | decimal(28, 8) |  | 数值 (UFDouble) |
| 30 | nweight | 重量 | nweight | decimal(28, 8) |  | 数值 (UFDouble) |
| 31 | nvolume | 体积 | nvolume | decimal(28, 8) |  | 数值 (UFDouble) |
| 32 | npiece | 件数 | npiece | decimal(28, 8) |  | 数值 (UFDouble) |
| 33 | blargessflag | 赠品 | blargessflag | char(1) |  | 布尔类型 (UFBoolean) |
| 34 | pk_batchcode | 批次档案 | pk_batchcode | char(20) |  | 主键 (UFID) |
| 35 | vbatchcode | 批次号 | vbatchcode | varchar(40) |  | 字符串 (String) |
| 36 | corigcurrencyid | 原币 | corigcurrencyid | varchar(20) |  | 币种 (currtype) |
| 37 | nexchangerate | 折本汇率 | nexchangerate | decimal(28, 8) |  | 数值 (UFDouble) |
| 38 | ccurrencyid | 本位币 | ccurrencyid | varchar(20) |  | 币种 (currtype) |
| 39 | ctaxcodeid | 税码 | ctaxcodeid | varchar(20) |  | 增值税税码税率 (taxcode) |
| 40 | ntaxrate | 税率 | ntaxrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 41 | ncaltaxmny | 计税金额 | ncaltaxmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 42 | ftaxtypeflag | 扣税类别 | ftaxtypeflag | int |  | 扣税类别 (taxtype) |  | 1=应税外加; |