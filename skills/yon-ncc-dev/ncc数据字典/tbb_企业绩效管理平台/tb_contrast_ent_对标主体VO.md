# |<<

**对标主体VO (tb_contrast_ent / nc.vo.tb.form.query.TbContrastEnt)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5707.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | 主键 | pk_obj | char(20) | √ | 主键 (UFID) |
| 2 | pk_ent | 对应主体pk | pk_ent | varchar(50) |  | 字符串 (String) |
| 3 | sharetype | 共享类型 | sharetype | varchar(50) |  | 字符串 (String) |
| 4 | objcode | 编码 | objcode | varchar(50) |  | 字符串 (String) |
| 5 | objname | 名称 | objname | varchar(50) |  | 字符串 (String) |
| 6 | pk_org | 创建组织 | pk_org | varchar(50) |  | 字符串 (String) |
| 7 | pk_group | 创建集团 | pk_group | varchar(50) |  | 字符串 (String) |
| 8 | pk_concube_ent | 对标主体PK | pk_concube_ent | varchar(20) |  | 对标主体 (tbb_concube_ent) |
| 9 | creator | 创建人 | creator | varchar(50) |  | 字符串 (String) |
| 10 | creationtime | 创建时间 | creationtime | varchar(50) |  | 字符串 (String) |
| 11 | modifier | 修改人 | modifier | varchar(50) |  | 字符串 (String) |
| 12 | modifiedtime | 修改时间 | modifiedtime | varchar(50) |  | 字符串 (String) |