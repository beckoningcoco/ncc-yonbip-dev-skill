# |<<

**资源清单 (mm_resourcelist / nc.vo.mmpps.rccp1302.ResourceListVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3766.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | crlid | 资源清单 | crlid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | char(20) |  | 主键 (UFID) |
| 3 | pk_org | 工厂 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 4 | pk_org_v | 工厂多版本 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | crootbomid | 根BOMid | crootbomid | varchar(50) |  | 字符串 (String) |
| 6 | cmaterialid | 物料编码 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 7 | cmaterialvid | 物料版本id | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 8 | cmeasureid | 主单位 | cmeasureid | varchar(20) |  | 计量单位 (measdoc) |
| 9 | cassmeasureid | 单位 | cassmeasureid | varchar(20) |  | 计量单位 (measdoc) |
| 10 | vchangerate | 换算率 | vchangerate | varchar(50) |  | 字符串 (String) |
| 11 | nnumber | 主数量 | nnumber | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | nassnumber | 数量 | nassnumber | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | cwkid | 工作中心 | cwkid | varchar(20) |  | 工作中心 (bd_wk) |
| 14 | leadtimenum | 偏置期 | leadtimenum | int |  | 整数 (Integer) |
| 15 | fcalcflag | 能力核算标志 | fcalcflag | int |  | 能力核算标志 (FcapacitycalcEnum) |  | 0=产出; |