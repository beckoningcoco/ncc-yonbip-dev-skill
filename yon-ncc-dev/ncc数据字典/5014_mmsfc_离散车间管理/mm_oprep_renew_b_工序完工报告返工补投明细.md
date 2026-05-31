# |<<

**工序完工报告返工补投明细 (mm_oprep_renew_b / nc.vo.mmsfc.operationrep.renew.entity.OprepRenewItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3715.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_renew_b | 工序完工报告返工补投明细 | pk_renew_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 工厂 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 4 | pk_org_v | 工厂版本 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | vbrowno | 行号 | vbrowno | varchar(40) |  | 字符串 (String) |
| 6 | cboperationid | 工序类型 | cboperationid | varchar(20) |  | 标准工序 (pd_rc) |
| 7 | vboperationnote | 工序说明 | vboperationnote | varchar(50) |  | 字符串 (String) |
| 8 | cbwkid | 工作中心 | cbwkid | varchar(20) |  | 工作中心 (bd_wk) |
| 9 | cbdeptid | 生产部门最新 | cbdeptid | varchar(20) |  | 组织_部门 (dept) |
| 10 | cbdeptvid | 生产部门 | cbdeptvid | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 11 | bbcheckpoint | 检验点 | bbcheckpoint | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | bbreportpoint | 报告点 | bbreportpoint | char(1) |  | 布尔类型 (UFBoolean) |
| 13 | cbshiftid | 班次 | cbshiftid | varchar(20) |  | 班次 (bdshift) |
| 14 | cbteamid | 班组 | cbteamid | varchar(20) |  | 班组定义维护表信息 (bd_team) |
| 15 | cbworkman | 人员 | cbworkman | varchar(20) |  | 人员基本信息 (psndoc) |
| 16 | tbstarttime | 计划开始时间 | tbstarttime | char(19) |  | 日期时间 (UFDateTime) |
| 17 | tbendtime | 计划完工时间 | tbendtime | char(19) |  | 日期时间 (UFDateTime) |
| 18 | nbratedtime | 定额加工时间 | nbratedtime | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | fbtransmode | 工序转移方式 | fbtransmode | int |  | 工序转移方式 (ProcessMoveTypeEnum) |  | 1=不转移; |