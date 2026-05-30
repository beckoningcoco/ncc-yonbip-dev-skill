# |<<

**返利期间修订子实体 (sr_plcy_period_r / nc.vo.sr.policy.revise.entity.PlcyPeriodReviseVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5473.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_plcy_period_r | 返利期间修订子实体 | pk_plcy_period_r | char(20) | √ | 主键 (UFID) |
| 2 | pk_plcy_period | 返利期间子实体 | pk_plcy_period | char(20) |  | 主键 (UFID) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | vperiod | 返利期间 | vperiod | varchar(20) |  | 字符串 (String) |
| 5 | dprdbegindate | 开始日期 | dprdbegindate | char(19) |  | 日期(开始) (UFDateBegin) |
| 6 | dprdenddate | 结束日期 | dprdenddate | char(19) |  | 日期(结束) (UFDateEnd) |
| 7 | dcashfromdate | 兑付日期从 | dcashfromdate | char(19) |  | 日期(开始) (UFDateBegin) |
| 8 | dcashtodate | 兑付日期到 | dcashtodate | char(19) |  | 日期(结束) (UFDateEnd) |
| 9 | pk_plcy | 返利政策主实体 | pk_plcy | char(20) |  | 主键 (UFID) |