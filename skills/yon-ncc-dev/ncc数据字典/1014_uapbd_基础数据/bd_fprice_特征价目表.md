# |<<

**特征价目表 (bd_fprice / nc.vo.bd.feature.fprice.entity.FPriceHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/846.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cfpriceid | 特征价目表 | cfpriceid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | currtype | 币种 | currtype | varchar(20) |  | 币种 (currtype) |
| 5 | vpriceformula | 特征价格公式 | vpriceformula | varchar(2000) |  | 字符串 (String) |
| 6 | vpriceformulaid | 特征价格公式主键 | vpriceformulaid | varchar(200) |  | 字符串 (String) |
| 7 | cmaterialid | 物料最新版本 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 8 | cmaterialvid | 物料 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 9 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 10 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 11 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 12 | ccustomerid | 客户 | ccustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 13 | cfclassid | 特征类 | cfclassid | varchar(20) |  | 特征类 (bd_fclass) |
| 14 | fenable | 启用状态 | fenable | int |  | 启用状态 (enablestatus) |  | 0=已启用; |