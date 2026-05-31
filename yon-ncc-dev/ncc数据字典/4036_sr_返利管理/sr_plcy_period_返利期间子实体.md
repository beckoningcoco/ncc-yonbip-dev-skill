# |<<

**返利期间子实体 (sr_plcy_period / nc.vo.sr.policy.entity.PlcyPeriodVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5472.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_plcy_period | 返利期间子实体 | pk_plcy_period | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | vperiod | 返利期间 | vperiod | varchar(20) |  | 字符串 (String) |
| 4 | dprdbegindate | 开始日期 | dprdbegindate | char(19) |  | 日期(开始) (UFDateBegin) |
| 5 | dprdenddate | 结束日期 | dprdenddate | char(19) |  | 日期(结束) (UFDateEnd) |
| 6 | dcashfromdate | 兑付日期从 | dcashfromdate | char(19) |  | 日期(开始) (UFDateBegin) |
| 7 | dcashtodate | 兑付日期到 | dcashtodate | char(19) |  | 日期(结束) (UFDateEnd) |