# |<<

**执行过程 (ewm_mtcon_execute / nc.vo.ewm.maintaincon.MaintainConExecVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1931.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mtcon_execute | 执行过程主键 | pk_mtcon_execute | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 维修组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_维修组织 (maintainorg) |
| 4 | pk_org_v | 维修组织 | pk_org_v | varchar(20) |  | 组织_业务单元_维修组织版本信息 (maintainorg_v) |
| 5 | execute_wf | 执行流程 | execute_wf | varchar(80) |  | 字符串 (String) |
| 6 | pk_executer | 执行人 | pk_executer | varchar(20) |  | 用户 (user) |
| 7 | execute_date | 执行日期 | execute_date | char(19) |  | 日期 (UFDate) |
| 8 | execute_reason | 原因 | execute_reason | varchar(200) |  | 字符串 (String) |