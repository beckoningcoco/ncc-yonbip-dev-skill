# |<<

**成本BOM作业子项明细 (sca_bom_activity / nc.vo.sca.costbom.entity.CostBomActivityVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5033.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbomactivityid | 成本BOM作业子项明细 | cbomactivityid | char(20) | √ | 主键 (UFID) |
| 2 | ccmbomid | 成本BOM | ccmbomid | char(20) |  | 主键 (UFID) |
| 3 | ccostcenterid | 成本中心 | ccostcenterid | varchar(20) |  | 成本中心 (resacostcenter) |
| 4 | cactivityid | 作业 | cactivityid | varchar(20) |  | 作业档案 (bd_activity) |
| 5 | celementid | 核算要素 | celementid | varchar(20) |  | 要素基本信息 (FactorAsoa) |
| 6 | nnum | 数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | nprice | 单价 | nprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | nmoney | 金额 | nmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | pk_group | 集团 | pk_group | char(20) |  | 主键 (UFID) |
| 10 | pk_org | 工厂最新版本 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 11 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 12 | ccosttypeid | 成本类型 | ccosttypeid | varchar(20) |  | 成本类型 (mapub_costtype) |
| 13 | cmeasureid | 计量单位 | cmeasureid | varchar(20) |  | 计量单位 (measdoc) |
| 14 | ccurrency | 币种 | ccurrency | varchar(20) |  | 币种 (currtype) |