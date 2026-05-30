# |<<

**报表查询对象 (fipub_queryobj / nc.vo.fipub.report.QueryObjVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2269.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_queryobj | 主键 | pk_queryobj | char(20) | √ | 主键 (UFID) |
| 2 | ownmodule | 所属模块 | ownmodule | varchar(10) |  | 字符串 (String) |
| 3 | origintable | 对象来源表名 | origintable | varchar(50) |  | 字符串 (String) |
| 4 | originfield | 对象来源字段名 | originfield | varchar(50) |  | 字符串 (String) |
| 5 | dsp_objtablename | 对象显示表名 | dsp_objtablename | varchar(50) |  | 字符串 (String) |
| 6 | dsp_objfieldname | 对象显示字段名 | dsp_objfieldname | varchar(50) |  | 字符串 (String) |
| 7 | qry_objtablename | 对象查询表名 | qry_objtablename | varchar(50) |  | 字符串 (String) |
| 8 | qry_objfieldname | 对象查询字段名 | qry_objfieldname | varchar(50) |  | 字符串 (String) |
| 9 | qry_objdatatype | 对象数据类型 | qry_objdatatype | varchar(50) |  | 字符串 (String) |
| 10 | dsp_objname | 对象显示名称 | dsp_objname | varchar(50) |  | 字符串 (String) |
| 11 | dsp_order | 对象显示顺序 | dsp_order | int |  | 整数 (Integer) |
| 12 | reporttype | 报表类型 | reporttype | varchar(50) |  | 字符串 (String) |
| 13 | returntype | 返回值类型 | returntype | varchar(50) |  | 字符串 (String) |
| 14 | bd_refname | 基本档案参照名称 | bd_refname | varchar(300) |  | 字符串 (String) |
| 15 | bd_mdid | 基本档案元数据ID | bd_mdid | varchar(50) |  | 字符串 (String) |
| 16 | bd_tablename | 基本档案表名 | bd_tablename | varchar(50) |  | 字符串 (String) |
| 17 | bd_pkfield | 基本档案主键字段名 | bd_pkfield | varchar(20) |  | 字符串 (String) |
| 18 | bd_codefield | 基本档案编码字段名 | bd_codefield | varchar(50) |  | 字符串 (String) |
| 19 | bd_namefield | 基本档案名称字段名 | bd_namefield | varchar(50) |  | 字符串 (String) |
| 20 | isqryobj | 查询对象 | isqryobj | char(1) |  | 布尔类型 (UFBoolean) |
| 21 | iscreatebal | 创建余额表 | iscreatebal | char(1) |  | 布尔类型 (UFBoolean) |
| 22 | billfieldname | 单据字段名 | billfieldname | varchar(50) |  | 字符串 (String) |
| 23 | balfieldname | 余额表字段名 | balfieldname | varchar(50) |  | 字符串 (String) |
| 24 | tallyfieldname | 明细表字段名 | tallyfieldname | varchar(50) |  | 字符串 (String) |
| 25 | resid | 多语资源ID | resid | varchar(50) |  | 字符串 (String) |
| 26 | description | 描述 | description | varchar(50) |  | 字符串 (String) |
| 27 | creator | 创建者 | creator | varchar(50) |  | 字符串 (String) |