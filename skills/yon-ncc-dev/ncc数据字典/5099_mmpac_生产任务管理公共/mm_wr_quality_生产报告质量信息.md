# |<<

**生产报告质量信息 (mm_wr_quality / nc.vo.mmpac.wr.entity.WrQualityVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3800.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wr_quality | 质量信息 | pk_wr_quality | char(20) | √ | 主键 (UFID) |
| 2 | pk_wr_product | 产出信息 | pk_wr_product | char(20) |  | 主键 (UFID) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 工厂最新版本 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 5 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 6 | cgcheckoutid | 质检报告 | cgcheckoutid | char(20) |  | 主键 (UFID) |
| 7 | vgcheckoutcode | 质检报告单号 | vgcheckoutcode | varchar(40) |  | 字符串 (String) |
| 8 | cgmaterialid | 入库产品最新版本 | cgmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 9 | cgmaterialvid | 入库产品 | cgmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 10 | fgproducttype | 入库产品类型 | fgproducttype | int |  | 产出类型 (outputtype) |  | 1=主产品; |