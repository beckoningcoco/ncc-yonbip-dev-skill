# |<<

**标准成本分析 (sca_stdcostanalyse / nc.vo.sca.stdcostanalyse.entity.StandardCostResultVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5072.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cstdcostanalyseid | 成本分析主键 | cstdcostanalyseid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 工厂最新版本 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 4 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | cproductid | 产品 | cproductid | varchar(20) |  | 物料基本信息 (material_v) |
| 6 | ccosttypeid | 成本类型 | ccosttypeid | varchar(20) |  | 成本类型 (mapub_costtype) |
| 7 | celementid | 核算要素 | celementid | varchar(20) |  | 要素基本信息 (FactorAsoa) |
| 8 | cactid | 作业 | cactid | varchar(20) |  | 作业档案 (bd_activity) |
| 9 | cmaterialid | 材料 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 10 | ncost | 总成本 | ncost | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | nmargin | 差额 | nmargin | decimal(28, 8) |  | 数值 (UFDouble) |