# |<<

**应付费用项子实体 (dm_apsettle_b / nc.vo.dm.apsettle.entity.ApSettleBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1710.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_apsettle_b | 应付费用项子实体 | pk_apsettle_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 物流组织 | pk_org | varchar(20) |  | 组织_业务单元_物流组织 (trafficorg) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 5 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 6 | cfeeitemid | 费用项 | cfeeitemid | varchar(20) |  | 物料基本信息 (material_v) |
| 7 | nfeemny | 运费金额 | nfeemny | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | fallotflag | 分摊依据 | fallotflag | int |  | 分摊依据 (fallotsetflag) |  | 0=主数量; |