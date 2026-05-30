# |<<

**匹配明细 (mm_sdbmatch / nc.vo.mmpps.lotreg.entity.SdbMatchVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3781.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_match | 供需预定子表ID | pk_match | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 计划组织最新版本 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 计划组织 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | cmaterialid | 物料最新版本 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 6 | cmaterialvid | 物料 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 7 | ccustmaterialid | 客户物料码 | ccustmaterialid | varchar(20) |  | 客户物料码 (custmaterial) |
| 8 | ccustomerid | 客户 | ccustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 9 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 10 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 11 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 12 | vsrctype | 来源单据类型 | vsrctype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 13 | vsrccode | 来源单据号 | vsrccode | varchar(40) |  | 字符串 (String) |
| 14 | vsrcid | 来源单据主表主键 | vsrcid | varchar(20) |  | 字符串 (String) |
| 15 | vsrcbid | 来源单据表体主键 | vsrcbid | varchar(20) |  | 字符串 (String) |
| 16 | vsrcrowno | 来源单据行号 | vsrcrowno | varchar(20) |  | 字符串 (String) |
| 17 | vfirsttype | 源头单据类型 | vfirsttype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 18 | vfirstcode | 源头单据号 | vfirstcode | varchar(40) |  | 字符串 (String) |
| 19 | vfirstid | 源头单据主表主键 | vfirstid | varchar(20) |  | 字符串 (String) |
| 20 | vfirstbid | 源头单据表体主键 | vfirstbid | varchar(20) |  | 字符串 (String) |
| 21 | vfirstrowno | 源头单据行号 | vfirstrowno | varchar(20) |  | 字符串 (String) |
| 22 | vbilltype | 单据类型 | vbilltype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 23 | cbilltypeid | 单据来源id | cbilltypeid | varchar(20) |  | 供给范围 (mm_sdbsupply) |
| 24 | fbilltype | 单据来源 | fbilltype | varchar(50) |  | 字符串 (String) |
| 25 | vbillcode | 单据号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 26 | vbillid | 单据主键 | vbillid | varchar(20) |  | 字符串 (String) |
| 27 | vbillbid | 单据表体主键 | vbillbid | varchar(20) |  | 字符串 (String) |
| 28 | vbillrowno | 单据行号 | vbillrowno | varchar(20) |  | 字符串 (String) |
| 29 | cbomversionid | 生产BOM版本 | cbomversionid | varchar(20) |  | 物料清单 (bd_bom) |
| 30 | cpackbomid | 包装BOM版本 | cpackbomid | varchar(20) |  | 物料清单 (bd_bom) |
| 31 | cdemandsupplystockvid | 需求/供给库存组织 | cdemandsupplystockvid | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 32 | cdemandsupplystockid | 需求/供给库存组织最新版本 | cdemandsupplystockid | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 33 | pk_batchcode | 批次号主键 | pk_batchcode | varchar(20) |  | 批次档案 (BatchcodeVO) |
| 34 | batchcode | 批次号 | batchcode | varchar(40) |  | 字符串 (String) |
| 35 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 36 | nbillnum | 主数量 | nbillnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 37 | nnotimplementdnum | 未执行主数量 | nnotimplementdnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 38 | nnotbookednum | 未预定主数量 | nnotbookednum | decimal(28, 8) |  | 数值 (UFDouble) |
| 39 | nreservationnum | 预留主数量 | nreservationnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 40 | ncansupplynum | 可分配主数量 | ncansupplynum | decimal(28, 8) |  | 数值 (UFDouble) |
| 41 | nmatchnum | 预定主数量 | nmatchnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 42 | nmatchnumold | 预定主数量旧 | nmatchnumold | decimal(28, 8) |  | 数值 (UFDouble) |
| 43 | naccbookednum | 累计预定主数量 | naccbookednum | decimal(28, 8) |  | 数值 (UFDouble) |
| 44 | dmatchdate | 匹配日期 | dmatchdate | char(19) |  | 日期 (UFDate) |
| 45 | ddemandsupplydate | 需求/供给日期 | ddemandsupplydate | char(19) |  | 日期 (UFDate) |
| 46 | bdemandsupply | 需求/供给 | bdemandsupply | int |  | 需求供给 (SdbDemandSupplyEnum) |  | 0=需求; |