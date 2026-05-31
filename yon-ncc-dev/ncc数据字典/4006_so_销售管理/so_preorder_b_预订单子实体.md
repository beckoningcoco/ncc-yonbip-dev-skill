# |<<

**预订单子实体 (so_preorder_b / nc.vo.so.m38.entity.PreOrderBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5426.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cpreorderbid | 预订单子实体 | cpreorderbid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 销售组织 | pk_org | varchar(20) |  | 组织_业务单元_销售组织 (salesorg) |
| 4 | dbilldate | 订货日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 5 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 6 | ccustmaterialid | 客户物料码 | ccustmaterialid | varchar(20) |  | 客户物料码 (custmaterial) |
| 7 | cmaterialid | 物料档案 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 8 | cmaterialvid | 物料编码 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 9 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 10 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 11 | nnum | 主数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | nastnum | 数量 | nastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | vchangerate | 换算率 | vchangerate | varchar(60) |  | 字符串 (String) |
| 14 | cqtunitid | 报价单位 | cqtunitid | varchar(20) |  | 计量单位 (measdoc) |
| 15 | nqtunitnum | 报价数量 | nqtunitnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | vqtunitrate | 报价换算率 | vqtunitrate | varchar(60) |  | 字符串 (String) |
| 17 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 18 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 19 | cqualitylevelid | 质量等级 | cqualitylevelid | varchar(20) |  | 质量等级 (scm_qualitylevel_b) |
| 20 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 21 | ndiscountrate | 整单折扣 | ndiscountrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | nitemdiscountrate | 单品折扣 | nitemdiscountrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | corigcurrencyid | 币种 | corigcurrencyid | varchar(20) |  | 币种 (currtype) |
| 24 | ccurrencyid | 本位币 | ccurrencyid | varchar(20) |  | 币种 (currtype) |
| 25 | nexchangerate | 折本汇率 | nexchangerate | decimal(28, 8) |  | 数值 (UFDouble) |
| 26 | ctaxcodeid | 税码 | ctaxcodeid | varchar(20) |  | 增值税税码税率 (taxcode) |
| 27 | ntaxrate | 税率 | ntaxrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 28 | ftaxtypeflag | 扣税类别 | ftaxtypeflag | int |  | 扣税类别 (taxtype) |  | 1=应税外加; |