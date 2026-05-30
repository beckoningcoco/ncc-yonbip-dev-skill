# |<<

**计划预约渠道控制界面不生成表 (uh_planweek_ctl / com.yonyou.yh.nhis.sch.plan.vo.PlanweekCtlVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6208.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_planweek_ctl | 主键 | pk_planweek_ctl | char(20) | √ | 主键 (UFID) |
| 2 | resname | 资源名称 | resname | varchar(50) |  | 字符串 (String) |
| 3 | pk_schres | 资源主键 | pk_schres | varchar(20) |  | 排班资源 (SchResVO) |
| 4 | srvname | 服务名称 | srvname | varchar(50) |  | 字符串 (String) |
| 5 | pk_schsrv | 服务主键 | pk_schsrv | varchar(50) |  | 字符串 (String) |
| 6 | dateslotname | 午别 | dateslotname | varchar(50) |  | 字符串 (String) |
| 7 | pk_dateslot | 午别主键 | pk_dateslot | varchar(20) |  | 排班_日期分组 (dateslot) |
| 8 | mon | 星期一 | mon | varchar(50) |  | 字符串 (String) |
| 9 | tue | 星期二 | tue | varchar(50) |  | 字符串 (String) |
| 10 | wed | 星期三 | wed | varchar(50) |  | 字符串 (String) |
| 11 | thu | 星期四 | thu | varchar(50) |  | 字符串 (String) |
| 12 | fri | 星期五 | fri | varchar(50) |  | 字符串 (String) |
| 13 | sat | 星期六 | sat | varchar(50) |  | 字符串 (String) |
| 14 | sun | 星期日 | sun | varchar(50) |  | 字符串 (String) |
| 15 | pk_schplan | 排班计划主键 | pk_schplan | varchar(20) |  | 排班预约_计划 (SchPlanVO) |
| 16 | planname | 计划名称 | planname | varchar(50) |  | 字符串 (String) |
| 17 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 18 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 19 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 20 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 21 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 22 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 23 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 24 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 25 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 26 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 27 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 28 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 29 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 30 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 31 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 32 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 33 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 34 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 35 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 36 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |