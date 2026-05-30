# |<<

**供给范围 (mm_sdbsupply / nc.vo.mmpps.lotreg.entity.SdbSupplyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3783.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_supply | 主键 | pk_supply | varchar(60) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | pk_stockorg_v | 供给库存组织 | pk_stockorg_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 6 | pk_stockorg | 供给库存组织最新版本 | pk_stockorg | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 7 | cmaterialid | 物料 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 8 | cmaterialvid | 物料版本 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 9 | ccustmaterialid | 客户物料码 | ccustmaterialid | varchar(20) |  | 客户物料码 (custmaterial) |
| 10 | ccustomerid | 客户 | ccustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 11 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 12 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 13 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 14 | vsrctype | 来源单据类型 | vsrctype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 15 | vsrccode | 来源单据号 | vsrccode | varchar(40) |  | 字符串 (String) |
| 16 | vsrcid | 来源单据主键 | vsrcid | varchar(20) |  | 字符串 (String) |
| 17 | vsrcbid | 来源单据表体主键 | vsrcbid | varchar(20) |  | 字符串 (String) |
| 18 | vsrcrowno | 来源单据行号 | vsrcrowno | varchar(20) |  | 字符串 (String) |
| 19 | vfirsttype | 源头单据类型 | vfirsttype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 20 | vfirstcode | 源头单据号 | vfirstcode | varchar(40) |  | 字符串 (String) |
| 21 | vfirstid | 源头单据主键 | vfirstid | varchar(20) |  | 字符串 (String) |
| 22 | vfirstbid | 源头单据表体主键 | vfirstbid | varchar(20) |  | 字符串 (String) |
| 23 | vfirstrowno | 源头单据行号 | vfirstrowno | varchar(20) |  | 字符串 (String) |
| 24 | fbilltype | 供给来源 | fbilltype | int |  | 供给类型 (SupplyType) |  | 0=存量; |