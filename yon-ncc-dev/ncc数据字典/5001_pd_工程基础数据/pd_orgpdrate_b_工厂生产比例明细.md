# |<<

**工厂生产比例明细 (pd_orgpdrate_b / nc.vo.pd.orgproductionrate.entity.OrgProductionRateDetailVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4362.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_orgpdrate_b | 工厂生产比例明细ID | pk_orgpdrate_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 计划中心 | pk_org | varchar(20) |  | 组织_业务单元_计划中心 (plancenter) |
| 4 | pk_org_v | 计划中心版本 | pk_org_v | varchar(20) |  | 组织_业务单元_计划中心版本信息 (plancenter_v) |
| 5 | vrowno | 行号 | vrowno | varchar(50) |  | 字符串 (String) |
| 6 | cmanuplantid | 生产工厂最新版本 | cmanuplantid | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 7 | nrate | 生产比例 | nrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | cmanuplantvid | 生产工厂 | cmanuplantvid | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |