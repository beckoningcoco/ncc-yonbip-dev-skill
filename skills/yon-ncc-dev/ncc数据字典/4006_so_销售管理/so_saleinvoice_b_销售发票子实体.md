# |<<

**销售发票子实体 (so_saleinvoice_b / nc.vo.so.m32.entity.SaleInvoiceBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5434.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | csaleinvoicebid | 发票子实体 | csaleinvoicebid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 开票组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | dbilldate | 开票日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 5 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 6 | ccustmaterialid | 客户物料码 | ccustmaterialid | varchar(20) |  | 客户物料码 (custmaterial) |
| 7 | cmaterialid | 物料编码原始版本 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 8 | cmaterialvid | 物料编码 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 9 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 10 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 11 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 12 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 13 | nastnum | 数量 | nastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 15 | nnum | 主数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | vchangerate | 换算率 | vchangerate | varchar(60) |  | 字符串 (String) |
| 17 | cqtunitid | 报价单位 | cqtunitid | varchar(20) |  | 计量单位 (measdoc) |
| 18 | vqtunitrate | 报价换算率 | vqtunitrate | varchar(60) |  | 字符串 (String) |
| 19 | nqtunitnum | 报价数量 | nqtunitnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | bdiscountflag | 折扣类 | bdiscountflag | char(1) |  | 布尔类型 (UFBoolean) |
| 21 | blaborflag | 服务类 | blaborflag | char(1) |  | 布尔类型 (UFBoolean) |
| 22 | blargessflag | 赠品 | blargessflag | char(1) |  | 布尔类型 (UFBoolean) |
| 23 | pk_batchcode | 批次档案 | pk_batchcode | varchar(20) |  | 主键 (UFID) |
| 24 | vbatchcode | 批次号 | vbatchcode | varchar(40) |  | 字符串 (String) |
| 25 | ctaxcodeid | 税码 | ctaxcodeid | varchar(20) |  | 增值税税码税率 (taxcode) |
| 26 | ntaxrate | 税率 | ntaxrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 27 | ftaxtypeflag | 扣税类别 | ftaxtypeflag | int |  | 扣税类别 (taxtype) |  | 1=应税外加; |