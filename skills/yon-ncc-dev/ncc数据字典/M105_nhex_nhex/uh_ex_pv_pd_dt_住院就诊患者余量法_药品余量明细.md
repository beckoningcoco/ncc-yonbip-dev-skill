# |<<

**住院就诊患者余量法_药品余量明细 (uh_ex_pv_pd_dt / com.yonyou.yh.nhis.ex.pvpd.vo.UhExPvPdDtVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6112.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_expvpddt | 药品余量明细主键 | pk_expvpddt | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | quan_base | 数量 | quan_base | decimal(14, 2) |  | 数值 (UFDouble) |
| 5 | pk_measdoc_base | 单位 | pk_measdoc_base | varchar(20) |  | 计量单位 (measdoc) |
| 6 | date_ex | 执行时间 | date_ex | char(19) |  | 日期时间 (UFDateTime) |
| 7 | pk_psn_ex | 执行人 | pk_psn_ex | varchar(20) |  | 人员基本信息 (psndoc) |
| 8 | name_psn_ex | 执行人姓名 | name_psn_ex | varchar(50) |  | 字符串 (String) |
| 9 | pk_dept_ex | 执行科室 | pk_dept_ex | varchar(20) |  | 组织_部门 (dept) |
| 10 | eu_direct | 收退方向 | eu_direct | int |  | 整数 (Integer) |
| 11 | eu_type | 操作类型 | eu_type | int |  | 整数 (Integer) |
| 12 | note | 备注 | note | varchar(200) |  | 备注 (Memo) |
| 13 | pk_pd | 物品主键 | pk_pd | char(20) |  | 字符串 (String) |
| 14 | name_pd | 物品名称 | name_pd | varchar(200) |  | 字符串 (String) |
| 15 | pk_pv | 就诊主键 | pk_pv | char(20) |  | 字符串 (String) |
| 16 | def1 | 自定义项1 | def1 | varchar(100) |  | 字符串 (String) |
| 17 | def2 | 自定义项2 | def2 | varchar(100) |  | 字符串 (String) |
| 18 | def3 | 自定义项3 | def3 | varchar(100) |  | 字符串 (String) |
| 19 | def4 | 自定义项4 | def4 | varchar(100) |  | 字符串 (String) |
| 20 | def5 | 自定义项5 | def5 | varchar(100) |  | 字符串 (String) |
| 21 | def6 | 自定义项6 | def6 | varchar(100) |  | 字符串 (String) |
| 22 | def7 | 自定义项7 | def7 | varchar(100) |  | 字符串 (String) |
| 23 | def8 | 自定义项8 | def8 | varchar(100) |  | 字符串 (String) |
| 24 | def9 | 自定义项9 | def9 | varchar(100) |  | 字符串 (String) |
| 25 | def10 | 自定义项10 | def10 | varchar(100) |  | 字符串 (String) |
| 26 | def11 | 自定义项11 | def11 | varchar(100) |  | 字符串 (String) |
| 27 | def12 | 自定义项12 | def12 | varchar(100) |  | 字符串 (String) |
| 28 | def13 | 自定义项13 | def13 | varchar(100) |  | 字符串 (String) |
| 29 | def14 | 自定义项14 | def14 | varchar(100) |  | 字符串 (String) |
| 30 | def15 | 自定义项15 | def15 | varchar(100) |  | 字符串 (String) |
| 31 | def16 | 自定义项16 | def16 | varchar(100) |  | 字符串 (String) |
| 32 | def17 | 自定义项17 | def17 | varchar(100) |  | 字符串 (String) |
| 33 | def18 | 自定义项18 | def18 | varchar(100) |  | 字符串 (String) |
| 34 | def19 | 自定义项19 | def19 | varchar(100) |  | 字符串 (String) |
| 35 | def20 | 自定义项20 | def20 | varchar(100) |  | 字符串 (String) |