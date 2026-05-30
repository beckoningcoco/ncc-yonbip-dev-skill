# |<<

**排班预约_排班 (uh_sch / com.yonyou.yh.nhis.sch.sch.vo.SchVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6254.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_sch | 排班主键 | pk_sch | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_plan | 计划 | pk_plan | varchar(20) |  | 排班预约_计划 (SchPlanVO) |
| 5 | pk_schcate | 排班分类 | pk_schcate | varchar(20) |  | 排班分类 (SchcateVO) |
| 6 | dateval | 具体日期 | dateval | char(19) |  | 日期 (UFDate) |
| 7 | pk_dateslot | 日期分组 | pk_dateslot | varchar(20) |  | 排班_日期分组 (dateslot) |
| 8 | pk_res | 排班资源 | pk_res | varchar(20) |  | 排班资源 (SchResVO) |
| 9 | pk_schsrv | 排班服务 | pk_schsrv | varchar(20) |  | 排班服务 (UhSchSrvVO) |
| 10 | count_limit | 数量_合计 | count_limit | int |  | 整数 (Integer) |
| 11 | count_appt | 数量_其中可预约 | count_appt | int |  | 整数 (Integer) |
| 12 | count_overbook | 数量_可额外增加 | count_overbook | int |  | 整数 (Integer) |
| 13 | count_used | 数量_已使用 | count_used | int |  | 整数 (Integer) |
| 14 | time_per | 本排班使用的时间(分钟) | time_per | int |  | 整数 (Integer) |
| 15 | pk_dept | 排班归属部门 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 16 | flag_stop | 停止标志 | flag_stop | char(1) |  | 布尔类型 (UFBoolean) | N |
| 17 | pk_planweek | 计划周 | pk_planweek | varchar(20) |  | 排班预约_计划_周模板 (SchPlanWeekVO) |
| 18 | ticketno | 当前排队票号 | ticketno | int |  | 整数 (Integer) |
| 19 | flag_canc | 取消标志 | flag_canc | char(1) |  | 布尔类型 (UFBoolean) |
| 20 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 21 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 22 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 23 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 24 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 25 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 26 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 27 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 28 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 29 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 30 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 31 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 32 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 33 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 34 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 35 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 36 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 37 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 38 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 39 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |
| 40 | creationtime | 创建时间 | creationtime | char(19) |  | 日期 (UFDate) |
| 41 | creator | 创建人 | creator | varchar(20) |  | 字符串 (String) |
| 42 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期 (UFDate) |
| 43 | modifier | 最后修改人 | modifier | varchar(20) |  | 字符串 (String) |