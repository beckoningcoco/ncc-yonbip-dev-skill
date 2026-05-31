# |<<

**组织_业务单元_医卫版本 (org_hisorg_v / nc.vo.vorg.HisOrgVersionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4077.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_vid | 版本主键 | pk_vid | char(20) | √ | 主键 (UFID) |
| 2 | pk_hisorg | 机构主键 | pk_hisorg | char(20) |  | 字符串 (String) |
| 3 | code | 机构编码 | code | varchar(50) |  | 字符串 (String) |
| 4 | name | 机构名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 5 | shortname | 机构简称 | shortname | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | mnecode | 助记码 | mnecode | varchar(50) |  | 字符串 (String) |
| 7 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_集团 (group) |
| 8 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 9 | orgtype | 医疗机构类型 | orgtype | int |  | 医疗机构类型 (hisorgtype) |  | 1=集团医院成员; |