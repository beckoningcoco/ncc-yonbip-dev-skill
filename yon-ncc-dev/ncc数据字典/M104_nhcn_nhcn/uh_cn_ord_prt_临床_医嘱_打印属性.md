# |<<

**临床_医嘱_打印属性 (uh_cn_ord_prt / com.yonyou.yh.nhis.cn.ord.v2.vo.CNOrdPrintVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6030.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ordprt | 医嘱打印主键 | pk_ordprt | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | prtcn | 打印次数 | prtcn | int |  | 整数 (Integer) |
| 5 | date_prt | 打印日期 | date_prt | char(19) |  | 日期时间 (UFDateTime) |
| 6 | page_prt | 打印页号 | page_prt | int |  | 整数 (Integer) |
| 7 | row_prt | 打印行数 | row_prt | int |  | 整数 (Integer) |
| 8 | pk_dept_prt | 打印部门 | pk_dept_prt | varchar(20) |  | 组织_部门 (dept) |
| 9 | pk_psn_prt | 打印人员 | pk_psn_prt | varchar(20) |  | 人员基本信息 (psndoc) |
| 10 | name_psn_prt | 打印人员名称 | name_psn_prt | varchar(50) |  | 字符串 (String) |
| 11 | newborn | 婴儿序号 | newborn | int |  | 整数 (Integer) |
| 12 | desc_ord | 医嘱描述 | desc_ord | varchar(4000) |  | 字符串 (String) |
| 13 | eu_status_ord | 医嘱状态 | eu_status_ord | varchar(20) |  | 字符串 (String) |
| 14 | pk_pv | 就诊主键 | pk_pv | varchar(20) |  | 字符串 (String) |
| 15 | flag_newborn | 婴儿标志 | flag_newborn | char(1) |  | 布尔类型 (UFBoolean) |
| 16 | pk_pvipnewborn | pk_pvipnewborn | pk_pvipnewborn | varchar(20) |  | 字符串 (String) |
| 17 | def1 | 自定义项1 | def1 | varchar(100) |  | 字符串 (String) |
| 18 | def2 | 自定义项2 | def2 | varchar(100) |  | 字符串 (String) |
| 19 | def3 | 自定义项3 | def3 | varchar(100) |  | 字符串 (String) |
| 20 | def4 | 自定义项4 | def4 | varchar(100) |  | 字符串 (String) |
| 21 | def5 | 自定义项5 | def5 | varchar(100) |  | 字符串 (String) |
| 22 | def6 | 自定义项6 | def6 | varchar(100) |  | 字符串 (String) |
| 23 | def7 | 自定义项7 | def7 | varchar(100) |  | 字符串 (String) |
| 24 | def8 | 自定义项8 | def8 | varchar(100) |  | 字符串 (String) |
| 25 | def9 | 自定义项9 | def9 | varchar(100) |  | 字符串 (String) |
| 26 | def10 | 自定义项10 | def10 | varchar(100) |  | 字符串 (String) |