# |<<

**暴露源的情况 (uh_oc_expose_report_es / com.yonyou.yh.nhis.cn.hims.vo.OcExposeReportEsVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6136.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_oc_expose_report_es | 暴露源的情况主键 | pk_oc_expose_report_es | char(20) | √ | 主键 (UFID) |
| 2 | eu_type | 暴露源类型 | eu_type | varchar(50) |  | 字符串 (String) |
| 3 | pk_pv | 暴露源患者就诊主键 | pk_pv | char(20) |  | 主键 (UFID) |
| 4 | pvcode | 住院号 | pvcode | varchar(50) |  | 字符串 (String) |
| 5 | pk_pati | 暴露源患者主键 | pk_pati | char(20) |  | 主键 (UFID) |
| 6 | patiname | 暴露源患者姓名 | patiname | varchar(50) |  | 字符串 (String) |
| 7 | phone | 暴露源联系电话 | phone | varchar(50) |  | 字符串 (String) |
| 8 | pk_dept_es | 暴露源科室主键 | pk_dept_es | char(20) |  | 主键 (UFID) |
| 9 | name_dept_es | 暴露源科室 | name_dept_es | varchar(50) |  | 字符串 (String) |
| 10 | infec_info | 暴露源患者感染性疾病情况 | infec_info | varchar(50) |  | 字符串 (String) |
| 11 | specimen_vc | 标本病毒含量 | specimen_vc | varchar(50) |  | 字符串 (String) |
| 12 | cd4_num | CD4细胞计数 | cd4_num | varchar(50) |  | 字符串 (String) |
| 13 | viral_load | 病毒载量 | viral_load | varchar(50) |  | 字符串 (String) |
| 14 | event_description | 具体事情经过 | event_description | varchar(50) |  | 字符串 (String) |
| 15 | specimen_type | 标本类型 | specimen_type | varchar(50) |  | 字符串 (String) |
| 16 | def1 | 自定义项1 | def1 | varchar(100) |  | 字符串 (String) |
| 17 | def2 | 自定义项2 | def2 | varchar(100) |  | 字符串 (String) |
| 18 | def3 | 自定义项3 | def3 | varchar(100) |  | 字符串 (String) |
| 19 | def4 | 自定义项4 | def4 | varchar(100) |  | 字符串 (String) |
| 20 | def5 | 自定义项5 | def5 | varchar(100) |  | 字符串 (String) |
| 21 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 22 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 23 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 24 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |