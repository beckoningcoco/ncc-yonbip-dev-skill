# |<<

**引入数据实体 (uap_importentity / nc.vo.corg.ImportableVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5846.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_importentity | 主键 | pk_importentity | char(20) | √ | 主键 (UFID) |
| 2 | pk_importentityparent | 上级 | pk_importentityparent | char(20) |  | 主键 (UFID) |
| 3 | pk_org | 组织 | pk_org | char(20) |  | 主键 (UFID) |
| 4 | pk_group | 集团 | pk_group | char(20) |  | 主键 (UFID) |
| 5 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 6 | name | 名称 | name | varchar(50) |  | 字符串 (String) |