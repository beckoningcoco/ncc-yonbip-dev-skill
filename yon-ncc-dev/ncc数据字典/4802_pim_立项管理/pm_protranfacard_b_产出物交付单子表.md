# |<<

**产出物交付单子表 (pm_protranfacard_b / nc.vo.ppm.producttranfacard.ProTranFaBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4518.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_protranfacard_b | 产出物交付单子表主键 | pk_protranfacard_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 项目组织 | pk_org | varchar(20) |  | 组织_业务单元_项目组织 (itemorg) |
| 4 | pk_org_v | 项目组织最新版本 | pk_org_v | varchar(20) |  | 组织_业务单元_项目组织版本信息 (itemorg_v) |
| 5 | rowno | 行号 | rowno | varchar(20) |  | 字符串 (String) |
| 6 | pk_projectproduct | 产出物编码 | pk_projectproduct | varchar(20) |  | 项目产出物 (projectproduct) |
| 7 | pk_materiel | 物料 | pk_materiel | varchar(20) |  | 物料基本信息 (material_v) |
| 8 | pk_materiel_v | 物料版本 | pk_materiel_v | varchar(20) |  | 物料基本信息（多版本） (material) |
| 9 | nnum | 数量 | nnum | int |  | 整数 (Integer) |
| 10 | tranmode | 交付方式 | tranmode | int |  | 产出物交付方式 (tranmode) |  | 1=建资产卡片; |