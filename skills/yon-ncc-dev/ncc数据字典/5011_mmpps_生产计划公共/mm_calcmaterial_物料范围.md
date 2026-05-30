# |<<

**物料范围 (mm_calcmaterial / nc.vo.mmpps.calc.entity.calculate.MaterialVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3646.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cppsmaterialid | 物料范围 | cppsmaterialid | char(36) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 计划组织最新版本 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 计划组织 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | computecode | 运算标识 | computecode | varchar(40) |  | 字符串 (String) |
| 6 | cpsid | 方案 | cpsid | varchar(20) |  | 计划方案 (mm_ps) |
| 7 | fcaltype | 运算类型 | fcaltype | int |  | 整数 (Integer) |
| 8 | cmaterialid | 物料最新版本 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 9 | cmaterialvid | 物料 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 10 | vnote | 备注 | vnote | varchar(300) |  | 字符串 (String) |
| 11 | lowcode | 物料低层码 | lowcode | int |  | 整数 (Integer) |
| 12 | crunningtime | 计划起始日期 | crunningtime | char(19) |  | 日期 (UFDate) |
| 13 | pk_pst | 计划策略 | pk_pst | varchar(20) |  | 计划策略 (bd_planstrategy) |
| 14 | pk_psg | 计划策略组 | pk_psg | varchar(20) |  | 计划策略组 (bd_planstrategygroup) |
| 15 | accquiretime | 需求时界 | accquiretime | int |  | 整数 (Integer) |
| 16 | confirmtime | 确认时界 | confirmtime | int |  | 整数 (Integer) |
| 17 | iplanhorizon | 计划展望期 | iplanhorizon | int |  | 整数 (Integer) |
| 18 | wasterrate | 废品系数 | wasterrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | brelatedproduct | 联副产品 | brelatedproduct | char(1) |  | 布尔类型 (UFBoolean) |
| 20 | iscreatesonprodorder | 生成子生产订单 | iscreatesonprodorder | char(1) |  | 布尔类型 (UFBoolean) |
| 21 | fgrossrule | 毛需求取值规则 | fgrossrule | int |  | 毛需求取值规则 (GrossNumRuleEnum) |  | 0=实际需求; |