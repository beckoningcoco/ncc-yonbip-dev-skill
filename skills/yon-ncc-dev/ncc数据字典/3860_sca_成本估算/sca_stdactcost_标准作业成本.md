# |<<

**标准作业成本 (sca_stdactcost / nc.vo.sca.stdcostcalc.StdActCostHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5064.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cstdactcostid | 标准作业成本表 | cstdactcostid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(0) |  | 组织_集团 (group) |
| 3 | pk_org | 工厂 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 4 | pk_org_v | 工厂版本 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | nnumber | 数量 | nnumber | decimal(20, 8) |  | 数值 (UFDouble) |
| 6 | ccosttypeid | 成本类型 | ccosttypeid | varchar(20) |  | 成本类型 (mapub_costtype) |
| 7 | ccostcenterid | 成本中心 | ccostcenterid | varchar(20) |  | 成本中心 (resacostcenter) |
| 8 | cactivityid | 作业 | cactivityid | varchar(20) |  | 作业档案 (bd_activity) |
| 9 | totalcost | 总成本 | totalcost | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | nprice | 单位成本 | nprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | cmeasureid | 计量单位 | cmeasureid | varchar(20) |  | 计量单位 (measdoc) |
| 12 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 13 | creationtime | 创建时间 | creationtime | char(19) |  | 日期 (UFDate) |
| 14 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 15 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期 (UFDate) |