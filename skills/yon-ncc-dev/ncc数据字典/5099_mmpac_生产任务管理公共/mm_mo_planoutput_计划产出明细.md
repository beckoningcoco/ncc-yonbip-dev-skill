# |<<

**计划产出明细 (mm_mo_planoutput / nc.vo.mmpac.pmo.pac0002.entity.PMOPlanOutputVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3692.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cplanoutputid | 计划产出明细 | cplanoutputid | char(20) | √ | 主键 (UFID) |
| 2 | vrowno | 序号 | vrowno | varchar(20) |  | 字符串 (String) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 工厂最新版本 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 5 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 6 | cmaterialid | 产品最新版本 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 7 | cmaterialvid | 产品 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 8 | foutputtype | 产品类型 | foutputtype | int |  | 产出类型 (outputtype) |  | 1=主产品; |