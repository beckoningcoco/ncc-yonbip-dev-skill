# |<<

**批量计算 (tb_fatherobj / nc.vo.tb.obj.TbFatherObjectVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5720.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | 主键 | pk_obj | char(20) | √ | 主键 (UFID) |
| 2 | objcode | 编码 | objcode | varchar(50) |  | 字符串 (String) |
| 3 | objname | 名称 | objname | varchar(100) |  | 字符串 (String) |
| 4 | childtype | 对象类型 | childtype | char(4) |  | 字符串 (String) |
| 5 | busisystem | 管控-创建系统 | busisystem | varchar(10) |  | 字符串 (String) |
| 6 | pk_busiattr | 业务属性 | pk_busiattr | char(20) |  | 字符串 (String) |
| 7 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 8 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 9 | def1 | 自定义项1 | def1 | varchar(100) |  | 字符串 (String) |
| 10 | def2 | 自定义项2 | def2 | varchar(100) |  | 字符串 (String) |
| 11 | def3 | 自定义项3 | def3 | varchar(100) |  | 字符串 (String) |
| 12 | def4 | 自定义项4 | def4 | varchar(100) |  | 字符串 (String) |
| 13 | def5 | 自定义项5 | def5 | varchar(100) |  | 字符串 (String) |
| 14 | def6 | 自定义项6 | def6 | varchar(100) |  | 字符串 (String) |
| 15 | def7 | 自定义项7 | def7 | varchar(100) |  | 字符串 (String) |
| 16 | def8 | 自定义项8 | def8 | varchar(100) |  | 字符串 (String) |
| 17 | def9 | 自定义项9 | def9 | varchar(100) |  | 字符串 (String) |
| 18 | def10 | 自定义项10 | def10 | varchar(100) |  | 字符串 (String) |
| 19 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 20 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 21 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 22 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |