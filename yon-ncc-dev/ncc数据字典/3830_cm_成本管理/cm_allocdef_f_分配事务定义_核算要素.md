# |<<

**分配事务定义_核算要素 (cm_allocdef_f / nc.vo.cm.allocdef.entity.CelementItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1444.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | callocdef_fid | 核算要素子项 | callocdef_fid | char(20) | √ | 主键 (UFID) |
| 2 | callocdefid | 间接费用分配定义 | callocdefid | char(20) |  | 主键 (UFID) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 工厂最新版本 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 5 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 6 | celementid | 核算要素 | celementid | varchar(20) |  | 要素基本信息 (FactorAsoa) |
| 7 | celementgroupid | 核算要素组 | celementgroupid | varchar(20) |  | 核算要素组 (factorgroup) |
| 8 | cdriverid | 成本动因 | cdriverid | varchar(20) |  | 成本动因 (cm_driver) |
| 9 | ccostobjectid | 成本对象 | ccostobjectid | varchar(20) |  | 成本对象 (cm_costobject) |
| 10 | cactivityid | 作业 | cactivityid | varchar(20) |  | 作业档案 (bd_activity) |
| 11 | callocfacid | 分配系数 | callocfacid | varchar(20) |  | 分配系数 (cm_allocfac) |
| 12 | iactdrivertype | 作业动因类型 | iactdrivertype | int |  | 作业动因类型 (actvDriverTypeEnum) | 1 | 1=作业量; |