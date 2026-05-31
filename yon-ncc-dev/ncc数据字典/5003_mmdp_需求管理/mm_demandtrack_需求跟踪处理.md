# |<<

**需求跟踪处理 (mm_demandtrack / nc.vo.mmdp.dt.entity.DemandTrackVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3654.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dt | 需求跟踪处理 | pk_dt | char(32) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 需求/供给组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 需求/供给组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | cmaterialid | 物料最新版本 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 6 | cmaterialvid | 物料 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 7 | materialname | 物料名称 | materialname | varchar(200) |  | 字符串 (String) |
| 8 | fbilltype | 单据类型 | fbilltype | int |  | 单据类型 (DTDocTypeEnum) |  | 0=存量; |