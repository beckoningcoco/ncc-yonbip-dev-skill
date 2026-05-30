# |<<

**任务分解明细 (mm_mo_taskdetail / nc.vo.mmpac.pmo.pac0002.entity.PMOTaskDetailVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3694.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | ctaskdetailid | 任务分解明细 | ctaskdetailid | char(20) | √ | 主键 (UFID) |
| 2 | vrowno | 行号 | vrowno | varchar(20) |  | 字符串 (String) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 工厂最新版本 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 5 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 6 | ddate | 日期 | ddate | char(19) |  | 日期 (UFDate) |
| 7 | cteamid | 班组 | cteamid | varchar(20) |  | 班组定义维护表信息 (bd_team) |
| 8 | cclassid | 班次 | cclassid | varchar(20) |  | 班次 (bdshift) |
| 9 | tplanstarttime | 计划开工时间 | tplanstarttime | char(19) |  | 日期时间 (UFDateTime) |
| 10 | tplanendtime | 计划完工时间 | tplanendtime | char(19) |  | 日期时间 (UFDateTime) |
| 11 | nnum | 数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | nplanputnum | 计划投入数量 | nplanputnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | csupervisorid | 负责人 | csupervisorid | varchar(20) |  | 人员基本信息 (psndoc) |
| 14 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |