# |<<

**对标目录 (tb_concube / nc.vo.tb.form.query.TbConstrastCube)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5704.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | 主键 | pk_obj | char(20) | √ | 主键 (UFID) |
| 2 | objcode | 编码 | objcode | varchar(50) |  | 字符串 (String) |
| 3 | objname | 名称 | objname | varchar(50) |  | 字符串 (String) |
| 4 | pk_uplevel | 上级PK | pk_uplevel | varchar(50) |  | 字符串 (String) |
| 5 | pk_concube | 对标模型主键 | pk_concube | varchar(50) |  | 字符串 (String) |
| 6 | pk_cube | 应用模型主键 | pk_cube | varchar(50) |  | 字符串 (String) |
| 7 | pk_org | 创建组织 | pk_org | varchar(20) |  | 组织 (org) |
| 8 | pk_group | 创建集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 9 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 10 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 11 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 12 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |