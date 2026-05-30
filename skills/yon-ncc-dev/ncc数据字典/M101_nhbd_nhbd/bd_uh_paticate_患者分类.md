# |<<

**患者分类 (bd_uh_paticate / nc.vo.nhbd.pati.PatiCateVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1062.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_paticate | 患者分类主键 | pk_paticate | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | code | 分类编码 | code | varchar(30) | √ | 字符串 (String) |
| 5 | name | 分类名称 | name | varchar(50) | √ | 字符串 (String) |
| 6 | father_pk | 上级码 | father_pk | varchar(20) |  | 患者分类 (paticate) |
| 7 | innercode | 内部码 | innercode | varchar(50) |  | 字符串 (String) |
| 8 | mnecode | 助记码 | mnecode | varchar(50) |  | 字符串 (String) |
| 9 | pk_disc | 优惠分类 | pk_disc | varchar(20) |  | 患者优惠类型 (patidisc) |
| 10 | pk_cred | 信用类型 | pk_cred | varchar(20) |  | 信用类型 (credittype) |
| 11 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 12 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 13 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 14 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |