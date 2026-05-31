# |<<

**销售订单修订附表 (so_orderhistory_b / nc.vo.so.m30.revise.entity.SaleOrderHistoryBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5423.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | corderhistorybid | 销售订单修订子表 | corderhistorybid | char(20) | √ | 主键 (UFID) |
| 2 | csaleorderid | 销售订单主实体_主键 | csaleorderid | char(20) |  | 主键 (UFID) |
| 3 | csaleorderbid | 销售订单子实体 | csaleorderbid | char(20) |  | 主键 (UFID) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | pk_org | 销售组织 | pk_org | varchar(20) |  | 组织_业务单元_销售组织 (salesorg) |
| 6 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 7 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 8 | ccustmaterialid | 客户物料码 | ccustmaterialid | varchar(20) |  | 客户物料码 (custmaterial) |
| 9 | cmaterialvid | 物料编码 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 10 | cmaterialid | 物料最新版本 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 11 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 12 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 13 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 14 | cfactoryid | 工厂 | cfactoryid | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 15 | cqualitylevelid | 质量等级 | cqualitylevelid | varchar(20) |  | 质量等级 (scm_qualitylevel_b) |
| 16 | corigcountryid | 原产国 | corigcountryid | varchar(20) |  | 国家地区 (countryzone) |
| 17 | corigareaid | 原产地区 | corigareaid | varchar(20) |  | 行政区划 (region) |
| 18 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 19 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 20 | nnum | 主数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | nastnum | 数量 | nastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | vchangerate | 换算率 | vchangerate | varchar(60) |  | 字符串 (String) |
| 23 | cqtunitid | 报价单位 | cqtunitid | varchar(20) |  | 计量单位 (measdoc) |
| 24 | nqtunitnum | 报价单位数量 | nqtunitnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | vqtunitrate | 报价换算率 | vqtunitrate | varchar(60) |  | 字符串 (String) |
| 26 | ndiscountrate | 整单折扣 | ndiscountrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 27 | nitemdiscountrate | 单品折扣 | nitemdiscountrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 28 | ctaxcodeid | 税码 | ctaxcodeid | varchar(20) |  | 增值税税码税率 (taxcode) |
| 29 | ntaxrate | 税率 | ntaxrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 30 | ftaxtypeflag | 扣税类别 | ftaxtypeflag | int |  | 扣税类别 (taxtype) |  | 1=应税外加; |