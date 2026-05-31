# |<<

**排班预约_预约_手术 (uh_ord_optappt / nc.vo.nhsch.optappt.SchOptApptVo)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6141.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ordappt | 医嘱预约主键 | pk_ordappt | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | code_opt | 对应手术台 | code_opt | varchar(20) |  | 字符串 (String) |
| 5 | code_dept_belong | 手术台所属科室 | code_dept_belong | varchar(20) |  | 字符串 (String) |
| 6 | code_ord | 对应医嘱_手术申请单 | code_ord | varchar(20) |  | 字符串 (String) |
| 7 | flag_exec | 执行标志 | flag_exec | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | date_exec | 执行日期 | date_exec | char(8) |  | 时间 (UFTime) |
| 9 | dt_exordtype | 执行类型 | dt_exordtype | varchar(20) |  | 字符串 (String) |
| 10 | code_exec | 执行编码 | code_exec | varchar(20) |  | 字符串 (String) |
| 11 | pk_schappt | 预约 | pk_schappt | varchar(20) |  | 字符串 (String) |