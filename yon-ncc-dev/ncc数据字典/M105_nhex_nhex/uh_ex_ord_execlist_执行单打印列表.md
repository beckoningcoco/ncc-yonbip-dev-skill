# |<<

**执行单打印列表 (uh_ex_ord_execlist / com.yonyou.yh.nhis.ex.ord.vo.OrdExecListVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6088.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_execlist | 执行列表主键 | pk_execlist | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_pv | 就诊主键 | pk_pv | varchar(50) |  | 字符串 (String) |
| 5 | pk_ord | 医嘱主键 | pk_ord | varchar(50) |  | 字符串 (String) |
| 6 | date_plan | 计划执行日期 | date_plan | char(19) |  | 日期 (UFDate) |
| 7 | time_plan | 计划执行时间 | time_plan | char(8) |  | 时间 (UFTime) |
| 8 | date_ex | 执行日期 | date_ex | char(19) |  | 日期时间 (UFDateTime) |
| 9 | eu_status | 状态 | eu_status | int |  | 整数 (Integer) |
| 10 | flag_ex | 执行标识 | flag_ex | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | pk_org_ex | 执行机构 | pk_org_ex | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 12 | pk_dept_ex | 执行科室 | pk_dept_ex | varchar(20) |  | 组织_部门 (dept) |
| 13 | pk_psn_ex | 执行人主键 | pk_psn_ex | varchar(20) |  | 人员基本信息 (psndoc) |
| 14 | name_psn_ex | 执行人 | name_psn_ex | varchar(50) |  | 字符串 (String) |
| 15 | flag_canc | 取消标志 | flag_canc | char(1) |  | 布尔类型 (UFBoolean) |
| 16 | date_canc | 取消日期 | date_canc | char(19) |  | 日期时间 (UFDateTime) |
| 17 | pk_org_canc | 取消组织 | pk_org_canc | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 18 | pk_dept_canc | 取消科室 | pk_dept_canc | varchar(20) |  | 组织_部门 (dept) |
| 19 | pk_psn_canc | 取消人主键 | pk_psn_canc | varchar(20) |  | 人员基本信息 (psndoc) |
| 20 | name_psn_canc | 取消人 | name_psn_canc | varchar(50) |  | 字符串 (String) |
| 21 | flag_print | 打印标志 | flag_print | char(1) |  | 布尔类型 (UFBoolean) |