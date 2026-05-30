# |<<

**临床_医嘱_医疗记录 (uh_cn_ord_emr / com.yonyou.yh.nhis.cn.ord.v2.vo.CNOrdEmrVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6021.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ord | 医嘱 | pk_ord | varchar(20) |  | 临床_医嘱 (cnorder) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | sortno | 序号 | sortno | int |  | 整数 (Integer) |
| 5 | date_ecd | 文档日期 | date_ecd | char(19) |  | 日期时间 (UFDateTime) |
| 6 | pk_emr | 文档 | pk_emr | varchar(50) |  | 字符串 (String) |
| 7 | def1 | 自定义项1 | def1 | varchar(100) |  | 字符串 (String) |
| 8 | def2 | 自定义项2 | def2 | varchar(100) |  | 字符串 (String) |
| 9 | def3 | 自定义项3 | def3 | varchar(100) |  | 字符串 (String) |
| 10 | def4 | 自定义项4 | def4 | varchar(100) |  | 字符串 (String) |
| 11 | def5 | 自定义项5 | def5 | varchar(100) |  | 字符串 (String) |
| 12 | def6 | 自定义项6 | def6 | varchar(100) |  | 字符串 (String) |
| 13 | def7 | 自定义项7 | def7 | varchar(100) |  | 字符串 (String) |
| 14 | def8 | 自定义项8 | def8 | varchar(100) |  | 字符串 (String) |
| 15 | def9 | 自定义项9 | def9 | varchar(100) |  | 字符串 (String) |
| 16 | def10 | 自定义项10 | def10 | varchar(100) |  | 字符串 (String) |