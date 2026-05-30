# |<<

**物料分类和医疗服务类型对应关系 (bd_uh_marbasclass_srv / com.yonyou.nhis.bd.pub2.srvinit.vo.MarbasclassSrvVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1057.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_uh_marbasclass_srv | 主键 | pk_uh_marbasclass_srv | char(20) | √ | 主键 (UFID) |
| 2 | pk_marbasclass | 物料分类主键 | pk_marbasclass | char(20) |  | 主键 (UFID) |
| 3 | pk_srvtype | 服务类型主键 | pk_srvtype | char(20) |  | 主键 (UFID) |
| 4 | pk_srvcate | 费用分类主键 | pk_srvcate | char(20) |  | 主键 (UFID) |
| 5 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 6 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 7 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 8 | def1 | 自定义项1 | def1 | varchar(100) |  | 字符串 (String) |
| 9 | def2 | 自定义项2 | def2 | varchar(100) |  | 字符串 (String) |
| 10 | def3 | 自定义项3 | def3 | varchar(100) |  | 字符串 (String) |
| 11 | def4 | 自定义项4 | def4 | varchar(100) |  | 字符串 (String) |
| 12 | def5 | 自定义项5 | def5 | varchar(100) |  | 字符串 (String) |
| 13 | def6 | 自定义项6 | def6 | varchar(100) |  | 字符串 (String) |
| 14 | def7 | 自定义项7 | def7 | varchar(100) |  | 字符串 (String) |
| 15 | def8 | 自定义项8 | def8 | varchar(100) |  | 字符串 (String) |
| 16 | def9 | 自定义项9 | def9 | varchar(100) |  | 字符串 (String) |
| 17 | def10 | 自定义项10 | def10 | varchar(100) |  | 字符串 (String) |
| 18 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 19 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 20 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 21 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |