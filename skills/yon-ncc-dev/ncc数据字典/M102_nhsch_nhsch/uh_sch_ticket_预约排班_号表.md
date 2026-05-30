# |<<

**预约排班_号表 (uh_sch_ticket / com.yonyou.yh.nhis.sch.sch.vo.SchTicketVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6276.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_schticket | 排班号表主键 | pk_schticket | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_sch | 排班 | pk_sch | varchar(20) |  | 排班预约_排班 (SchVO) |
| 5 | ticketno | 排队号 | ticketno | int |  | 整数 (Integer) |
| 6 | flag_appt | 可预约标志 | flag_appt | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | flag_used | 已经使用标志 | flag_used | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | time_begin | 预计开始时间 | time_begin | varchar(50) |  | 字符串 (String) |
| 9 | time_end | 预计结束时间 | time_end | varchar(50) |  | 字符串 (String) |
| 10 | flag_stop | 停止标志 | flag_stop | char(1) |  | 布尔类型 (UFBoolean) | N |
| 11 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 12 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 13 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 14 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 15 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 16 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 17 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 18 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 19 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 20 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 21 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 22 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 23 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 24 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 25 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 26 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 27 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 28 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 29 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 30 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |
| 31 | creationtime | 创建时间 | creationtime | char(19) |  | 日期 (UFDate) |
| 32 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 33 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期 (UFDate) |
| 34 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |