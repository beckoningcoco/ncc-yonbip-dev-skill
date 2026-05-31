# |<<

**成本还原层次 (cm_ctrevertlevel / nc.vo.cm.costrevert.CtRevertLevelVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1463.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cctrevertlevelid | 成本还原层次 | cctrevertlevelid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 工厂最新版本 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 4 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | cperiod | 会计期间 | cperiod | varchar(50) |  | 字符串 (String) |
| 6 | cmaterialid | 物料最新版本 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 7 | cmarcostclassid | 物料成本分类 | cmarcostclassid | varchar(20) |  | 物料成本分类 (marcostclass) |
| 8 | nlevel | 层次 | nlevel | int |  | 整数 (Integer) |
| 9 | irevertstatus | 还原状态 | irevertstatus | varchar(50) |  | 还原状态 (CtRevertStatusEnum) |  | 1=未还原; |