# |<<

**进度计划条目Ex (pmsch_time_plan_item / nc.vo.pmsch.plan.TimePlanItemExVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4579.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_time_plan_item | 计划条目主键 | pk_time_plan_item | char(20) | √ | 主键 (UFID) |
| 2 | rowno | 行号 | rowno | varchar(50) |  | 字符串 (String) |
| 3 | seq | 级内序号 | seq | int |  | 整数 (Integer) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | pk_org | 组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_项目组织 (itemorg) |
| 6 | pk_org_v | 组织 | pk_org_v | varchar(20) |  | 组织_业务单元_项目组织版本信息 (itemorg_v) |
| 7 | name | 任务名称 | name | varchar(100) |  | 字符串 (String) |
| 8 | description | 任务描述 | description | varchar(200) |  | 字符串 (String) |
| 9 | pk_duty_dept | 责任部门最新 | pk_duty_dept | varchar(20) |  | 组织_部门 (dept) |
| 10 | pk_duty_dept_v | 责任部门 | pk_duty_dept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 11 | pk_dutier | 责任人 | pk_dutier | varchar(20) |  | 人员基本信息 (psndoc) |
| 12 | plan_start_date | 计划开始日期 | plan_start_date | char(19) |  | 日期(开始) (UFDateBegin) |
| 13 | plan_end_date | 计划截止日期 | plan_end_date | char(19) |  | 日期(结束) (UFDateEnd) |
| 14 | memo | 备注 | memo | varchar(600) |  | 字符串 (String) |
| 15 | pk_parent | 父主键 | pk_parent | varchar(50) |  | 字符串 (String) |
| 16 | innercode | 内码 | innercode | varchar(50) |  | 字符串 (String) |
| 17 | duration | 工期 | duration | int |  | 整数 (Integer) |
| 18 | milestone | 里程碑 | milestone | char(1) |  | 布尔类型 (UFBoolean) |
| 19 | version | 版本号 | version | int |  | 整数 (Integer) |
| 20 | max_version | 最新版本号 | max_version | int |  | 整数 (Integer) |
| 21 | pk_front_plan | 前置任务 | pk_front_plan | varchar(20) |  | 进度计划条目 (TimePlanItemVO) |
| 22 | pk_temp_b | 模板主键 | pk_temp_b | varchar(20) |  | 字符串 (String) |
| 23 | pk_origin_item | 生效条目主键 | pk_origin_item | varchar(20) |  | 进度计划条目 (TimePlanItemVO) |
| 24 | full_seq | 任务编码 | full_seq | varchar(100) |  | 字符串 (String) |
| 25 | plan_level | 级次 | plan_level | int |  | 整数 (Integer) |
| 26 | leaf | 叶子节点 | leaf | char(1) |  | 布尔类型 (UFBoolean) |
| 27 | pk_progress | 进度 | pk_progress | varchar(20) |  | 计划执行进度条目 (TimeProgressItemVO) |
| 28 | pk_project | 项目 | pk_project | varchar(20) |  | 项目(项目管理) (pmproject) |
| 29 | pk_time_plan | 计划 | pk_time_plan | varchar(20) |  | 进度计划 (TimePlanBillVO) |
| 30 | def1 | 自定义项1 | def1 | varchar(100) |  | 字符串 (String) |
| 31 | def2 | 自定义项2 | def2 | varchar(100) |  | 字符串 (String) |
| 32 | def3 | 自定义项3 | def3 | varchar(100) |  | 字符串 (String) |
| 33 | def4 | 自定义项4 | def4 | varchar(100) |  | 字符串 (String) |
| 34 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 35 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 36 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 37 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 38 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 39 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 40 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 41 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 42 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 43 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 44 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 45 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 46 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 47 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 48 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 49 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |