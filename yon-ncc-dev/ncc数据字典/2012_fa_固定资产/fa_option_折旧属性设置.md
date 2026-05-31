# |<<

**折旧属性设置 (fa_option / nc.vo.fa.option.OptionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2049.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_option | 主键 | pk_option | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团主键 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_accbook | 资产账簿 | pk_accbook | varchar(20) |  | 账簿_财务核算账簿 (accountingbook) |
| 5 | pk_period | 会计期间 | pk_period | varchar(20) |  | 会计期间档案 (accperiod) |
| 6 | accyear | 会计年度 | accyear | varchar(4) |  | 字符串 (String) |
| 7 | period | 会计月份 | period | varchar(4) |  | 字符串 (String) |
| 8 | dep_flag | 本帐套是否计提折旧 | dep_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | servicemonth_flag | 使用月限调整当期有效 | servicemonth_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | depmethod_flag | 折旧方法调整当期有效 | depmethod_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | workloan_flag | 工作量调整当期有效 | workloan_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | newusingstatus | 使用状况调整当期有效 | newusingstatus | char(1) |  | 布尔类型 (UFBoolean) |
| 13 | jobfileadjust_flag | 项目档案调整当期有效 | jobfileadjust_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 14 | depall_flag | 使用期限的最后一期折旧提足 | depall_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 15 | newusedept_flag | 使用部门转移当期折旧 | newusedept_flag | int |  | 分配的部门 (deptment) |  | 0=分配到变动前部门; |