# |<<

**组织_业务单元_医卫 (org_hisorg / nc.vo.org.HisOrgVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4076.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_hisorg | 主键 | pk_hisorg | char(20) | √ | 主键 (UFID) |
| 2 | code | 机构编码 | code | varchar(50) |  | 字符串 (String) |
| 3 | name | 机构名称 | name | varchar(50) |  | 字符串 (String) |
| 4 | shortname | 机构简称 | shortname | varchar(50) |  | 字符串 (String) |
| 5 | mnecode | 助记码 | mnecode | varchar(50) |  | 字符串 (String) |
| 6 | pk_org | 所属机构 | pk_org | varchar(20) | √ | 组织_集团 (group) |
| 7 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 8 | orgtype | 医疗机构类型 | orgtype | int |  | 医疗机构类型 (hisorgtype) |  | 1=集团医院成员; |