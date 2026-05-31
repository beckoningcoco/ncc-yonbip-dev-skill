# |<<

**工序计划明细版本 (mm_pmo_procedure_v / nc.vo.mmpac.pmo.pac0002.entity.PMOProcedureVerVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3738.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cpmoprocedurevid | 工序计划明细版本 | cpmoprocedurevid | char(20) | √ | 主键 (UFID) |
| 2 | cprocedureid | 工序计划明细 | cprocedureid | char(20) | √ | 主键 (UFID) |
| 3 | vrowno | 行号 | vrowno | varchar(20) |  | 字符串 (String) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | pk_org | 工厂最新版本 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 6 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 7 | crtbid | 工艺路线明细 | crtbid | varchar(20) |  | 字符串 (String) |
| 8 | vrccode | 工序号 | vrccode | varchar(30) |  | 字符串 (String) |
| 9 | vrcname | 工序说明 | vrcname | varchar(200) |  | 字符串 (String) |
| 10 | bmain | 主序 | bmain | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | crctypeid | 工序编码 | crctypeid | varchar(20) |  | 标准工序 (pd_rc) |
| 12 | cwkid | 工作中心 | cwkid | varchar(20) |  | 工作中心 (bd_wk) |
| 13 | nplanmmastnum | 计划生产数量 | nplanmmastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | nplanmmnum | 计划生产主数量 | nplanmmnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | vlaptype | 重叠类型 | vlaptype | int |  | 重叠类型 (FnoverloptypeEnum) |  | 1=时间重叠; |