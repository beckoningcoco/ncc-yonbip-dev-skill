# |<<

**关键料驱动生产明细 (dp_kmd_b / nc.vo.mmdp.kmd.entity.KeyMaterialDrivenBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1746.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_kmd_b | 主键 | pk_kmd_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 工厂最新版本 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 4 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | vlowlevelcode | 低层码 | vlowlevelcode | varchar(50) |  | 字符串 (String) |
| 6 | cbomid | 生产BOM版本 | cbomid | varchar(20) |  | 物料清单 (bd_bom) |
| 7 | cpackbomid | 包装BOM版本 | cpackbomid | varchar(20) |  | 物料清单 (bd_bom) |
| 8 | nschpdnum | 预计可生产主数量 | nschpdnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | nschpdastnum | 预计可生产数量 | nschpdastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 11 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 12 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 13 | ccustomerid | 客户 | ccustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 14 | cffileid | 特征码 | cffileid | varchar(20) |  | 特征码档案 (bd_ffile) |
| 15 | nusmaternum | 用料数量 | nusmaternum | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | vcode | 物料编码 | vcode | varchar(50) |  | 字符串 (String) |
| 17 | hvchangerate | 父项转换率 | hvchangerate | varchar(60) |  | 字符串 (String) |
| 18 | cmaterial | 物料 | cmaterial | varchar(20) |  | 物料基本信息（多版本） (material) |
| 19 | cmeasureid | 子项主单位 | cmeasureid | varchar(20) |  | 计量单位 (measdoc) |
| 20 | hcmeasureid | 父项主单位 | hcmeasureid | varchar(20) |  | 计量单位 (measdoc) |
| 21 | hcassmeasureid | 父项单位 | hcassmeasureid | varchar(20) |  | 计量单位 (measdoc) |
| 22 | oldnschpdnum | 原始预计可生产主数量 | oldnschpdnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | fprodmode | 生产模式 | fprodmode | int |  | 生产模式 (ProdmodeEnum) |  | 1=流程制造; |