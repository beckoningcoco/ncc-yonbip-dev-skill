# |<<

**报表初始化辅表 (fipub_reportinitialize_b / nc.vo.fipub.report.ReportInitializeItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2272.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_reportinitialize_b | 辅表主键 | pk_reportinitialize_b | char(20) | √ | 主键 (UFID) |
| 2 | qry_objtablename | 对象查询表名 | qry_objtablename | varchar(50) |  | 字符串 (String) |
| 3 | qry_objfieldname | 对象查询字段名 | qry_objfieldname | varchar(50) |  | 字符串 (String) |
| 4 | qry_objdatatype | 对象数据类型 | qry_objdatatype | varchar(50) |  | 字符串 (String) |
| 5 | dsp_objname | 对象显示名称 | dsp_objname | varchar(50) |  | 字符串 (String) |
| 6 | dsp_order | 对象显示顺序 | dsp_order | int |  | 整数 (Integer) |
| 7 | bd_refname | 对象参照名称 | bd_refname | varchar(50) |  | 字符串 (String) |
| 8 | bd_mdid | 基本档案元数据ID | bd_mdid | varchar(50) |  | 字符串 (String) |
| 9 | bd_tablename | 基本档案表名 | bd_tablename | varchar(50) |  | 字符串 (String) |
| 10 | bd_pkfield | 基本档案主键字段名 | bd_pkfield | varchar(50) |  | 字符串 (String) |
| 11 | bd_codefield | 基本档案编码字段名 | bd_codefield | varchar(50) |  | 字符串 (String) |
| 12 | bd_namefield | 基本档案名称字段名 | bd_namefield | varchar(50) |  | 字符串 (String) |
| 13 | billfieldname | 单据字段名 | billfieldname | varchar(50) |  | 字符串 (String) |
| 14 | tallyfieldname | 明细字段名 | tallyfieldname | varchar(50) |  | 字符串 (String) |
| 15 | balfieldname | 余额表字段名 | balfieldname | varchar(50) |  | 字符串 (String) |
| 16 | resid | 多语资源ID | resid | varchar(50) |  | 字符串 (String) |
| 17 | creator | 创建者 | creator | varchar(20) |  | 字符串 (String) |